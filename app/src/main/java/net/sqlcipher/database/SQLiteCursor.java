package net.sqlcipher.database;

import android.database.DataSetObserver;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import net.sqlcipher.AbstractWindowedCursor;
import net.sqlcipher.CursorWindow;
import net.sqlcipher.SQLException;

/* loaded from: classes2.dex */
public class SQLiteCursor extends AbstractWindowedCursor {
    static final int NO_COUNT = -1;
    static final String TAG = "Cursor";
    private String[] mColumns;
    private SQLiteDatabase mDatabase;
    private SQLiteCursorDriver mDriver;
    private String mEditTable;
    protected MainThreadNotificationHandler mNotificationHandler;
    private SQLiteQuery mQuery;
    private int mCount = -1;
    private int mMaxRead = Integer.MAX_VALUE;
    private int mInitialRead = Integer.MAX_VALUE;
    private int mCursorState = 0;
    private ReentrantLock mLock = null;
    private boolean mPendingData = false;
    private Throwable mStackTrace = new DatabaseObjectNotClosedException().fillInStackTrace();
    private Map<String, Integer> mColumnNameMap = null;

    public void setLoadStyle(int i, int i2) {
        this.mMaxRead = i2;
        this.mInitialRead = i;
        this.mLock = new ReentrantLock(true);
    }

    private void queryThreadLock() {
        ReentrantLock reentrantLock = this.mLock;
        if (reentrantLock != null) {
            reentrantLock.lock();
        }
    }

    private void queryThreadUnlock() {
        ReentrantLock reentrantLock = this.mLock;
        if (reentrantLock != null) {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class QueryThread implements Runnable {
        private final int mThreadState;

        QueryThread(int i) {
            this.mThreadState = i;
        }

        private void sendMessage() {
            if (SQLiteCursor.this.mNotificationHandler == null) {
                SQLiteCursor.this.mPendingData = true;
                return;
            }
            SQLiteCursor.this.mNotificationHandler.sendEmptyMessage(1);
            SQLiteCursor.this.mPendingData = false;
        }

        @Override // java.lang.Runnable
        public final void run() {
            CursorWindow cursorWindow = SQLiteCursor.this.mWindow;
            Process.setThreadPriority(Process.myTid(), 10);
            while (true) {
                SQLiteCursor.this.mLock.lock();
                if (SQLiteCursor.this.mCursorState != this.mThreadState) {
                    return;
                }
                try {
                    int fillWindow = SQLiteCursor.this.mQuery.fillWindow(cursorWindow, SQLiteCursor.this.mMaxRead, SQLiteCursor.this.mCount);
                    if (fillWindow == 0) {
                        return;
                    }
                    if (fillWindow != -1) {
                        SQLiteCursor.this.mCount = fillWindow;
                        sendMessage();
                        return;
                    }
                    SQLiteCursor.this.mCount += SQLiteCursor.this.mMaxRead;
                    sendMessage();
                } catch (Exception unused) {
                    return;
                } finally {
                    SQLiteCursor.this.mLock.unlock();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class MainThreadNotificationHandler extends Handler {
        private final WeakReference<SQLiteCursor> wrappedCursor;

        MainThreadNotificationHandler(SQLiteCursor sQLiteCursor) {
            this.wrappedCursor = new WeakReference<>(sQLiteCursor);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            SQLiteCursor sQLiteCursor = this.wrappedCursor.get();
            if (sQLiteCursor != null) {
                sQLiteCursor.notifyDataSetChange();
            }
        }
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        super.registerDataSetObserver(dataSetObserver);
        if (!(Integer.MAX_VALUE == this.mMaxRead && Integer.MAX_VALUE == this.mInitialRead) && this.mNotificationHandler == null) {
            queryThreadLock();
            try {
                this.mNotificationHandler = new MainThreadNotificationHandler(this);
                if (this.mPendingData) {
                    notifyDataSetChange();
                    this.mPendingData = false;
                }
            } finally {
                queryThreadUnlock();
            }
        }
    }

    public SQLiteCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this.mDatabase = sQLiteDatabase;
        this.mDriver = sQLiteCursorDriver;
        this.mEditTable = str;
        this.mQuery = sQLiteQuery;
        try {
            sQLiteDatabase.lock();
            int columnCountLocked = this.mQuery.columnCountLocked();
            this.mColumns = new String[columnCountLocked];
            for (int i = 0; i < columnCountLocked; i++) {
                String columnNameLocked = this.mQuery.columnNameLocked(i);
                this.mColumns[i] = columnNameLocked;
                if ("_id".equals(columnNameLocked)) {
                    this.mRowIdColumnIndex = i;
                }
            }
        } finally {
            sQLiteDatabase.unlock();
        }
    }

    public SQLiteDatabase getDatabase() {
        return this.mDatabase;
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.CrossProcessCursor
    public boolean onMove(int i, int i2) {
        if (this.mWindow == null || i2 < this.mWindow.getStartPosition() || i2 >= this.mWindow.getStartPosition() + this.mWindow.getNumRows()) {
            fillWindow(i2);
            return true;
        }
        return true;
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public int getCount() {
        if (this.mCount == -1) {
            fillWindow(0);
        }
        return this.mCount;
    }

    private void fillWindow(int i) {
        if (this.mWindow == null) {
            this.mWindow = new CursorWindow(true);
        } else {
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mWindow.clear();
            } finally {
                queryThreadUnlock();
            }
        }
        this.mWindow.setStartPosition(i);
        int fillWindow = this.mQuery.fillWindow(this.mWindow, this.mInitialRead, 0);
        this.mCount = fillWindow;
        if (fillWindow == -1) {
            this.mCount = i + this.mInitialRead;
            new Thread(new QueryThread(this.mCursorState), "query thread").start();
        }
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public int getColumnIndex(String str) {
        if (this.mColumnNameMap == null) {
            String[] strArr = this.mColumns;
            int length = strArr.length;
            HashMap hashMap = new HashMap(length, 1.0f);
            for (int i = 0; i < length; i++) {
                hashMap.put(strArr[i], Integer.valueOf(i));
            }
            this.mColumnNameMap = hashMap;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            new Exception();
            str = str.substring(lastIndexOf + 1);
        }
        Integer num = this.mColumnNameMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean deleteRow() {
        boolean z;
        checkPosition();
        if (this.mRowIdColumnIndex == -1 || this.mCurrentRowID == null) {
            return false;
        }
        this.mDatabase.lock();
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.mDatabase;
                String str = this.mEditTable;
                sQLiteDatabase.delete(str, this.mColumns[this.mRowIdColumnIndex] + "=?", new String[]{this.mCurrentRowID.toString()});
                z = true;
            } catch (SQLException unused) {
                z = false;
            }
            int i = this.mPos;
            requery();
            moveToPosition(i);
            if (!z) {
                return false;
            }
            onChange(true);
            return true;
        } finally {
            this.mDatabase.unlock();
        }
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public String[] getColumnNames() {
        return this.mColumns;
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean supportsUpdates() {
        return !TextUtils.isEmpty(this.mEditTable);
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean commitUpdates(Map<? extends Long, ? extends Map<String, Object>> map) {
        if (!supportsUpdates()) {
            return false;
        }
        synchronized (this.mUpdatedRows) {
            if (map != null) {
                this.mUpdatedRows.putAll(map);
            }
            if (this.mUpdatedRows.size() == 0) {
                return true;
            }
            this.mDatabase.beginTransaction();
            StringBuilder sb = new StringBuilder(128);
            for (Map.Entry<Long, Map<String, Object>> entry : this.mUpdatedRows.entrySet()) {
                Map<String, Object> value = entry.getValue();
                Long key = entry.getKey();
                if (key == null || value == null) {
                    throw new IllegalStateException("null rowId or values found! rowId = " + key + ", values = " + value);
                } else if (value.size() != 0) {
                    long longValue = key.longValue();
                    Iterator<Map.Entry<String, Object>> it = value.entrySet().iterator();
                    sb.setLength(0);
                    sb.append("UPDATE " + this.mEditTable + " SET ");
                    Object[] objArr = new Object[value.size()];
                    int i = 0;
                    while (it.hasNext()) {
                        Map.Entry<String, Object> next = it.next();
                        sb.append(next.getKey());
                        sb.append("=?");
                        objArr[i] = next.getValue();
                        if (it.hasNext()) {
                            sb.append(", ");
                        }
                        i++;
                    }
                    sb.append(" WHERE " + this.mColumns[this.mRowIdColumnIndex] + '=' + longValue);
                    sb.append(';');
                    this.mDatabase.execSQL(sb.toString(), objArr);
                    this.mDatabase.rowUpdated(this.mEditTable, longValue);
                }
            }
            this.mDatabase.setTransactionSuccessful();
            this.mDatabase.endTransaction();
            this.mUpdatedRows.clear();
            onChange(true);
            return true;
        }
    }

    private void deactivateCommon() {
        this.mCursorState = 0;
        if (this.mWindow != null) {
            this.mWindow.close();
            this.mWindow = null;
        }
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public void deactivate() {
        super.deactivate();
        deactivateCommon();
        this.mDriver.cursorDeactivated();
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        deactivateCommon();
        this.mQuery.close();
        this.mDriver.cursorClosed();
    }

    /* JADX WARN: Finally extract failed */
    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public boolean requery() {
        if (isClosed()) {
            return false;
        }
        this.mDatabase.lock();
        try {
            if (this.mWindow != null) {
                this.mWindow.clear();
            }
            this.mPos = -1;
            this.mDriver.cursorRequeried(this);
            this.mCount = -1;
            this.mCursorState++;
            queryThreadLock();
            this.mQuery.requery();
            queryThreadUnlock();
            this.mDatabase.unlock();
            return super.requery();
        } catch (Throwable th) {
            this.mDatabase.unlock();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // net.sqlcipher.AbstractWindowedCursor
    public void setWindow(CursorWindow cursorWindow) {
        if (this.mWindow != null) {
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mWindow.close();
                queryThreadUnlock();
                this.mCount = -1;
            } catch (Throwable th) {
                queryThreadUnlock();
                throw th;
            }
        }
        this.mWindow = cursorWindow;
    }

    public void setSelectionArguments(String[] strArr) {
        this.mDriver.setBindArguments(strArr);
    }

    @Override // net.sqlcipher.AbstractCursor
    public void finalize() {
        try {
            if (this.mWindow != null) {
                int length = this.mQuery.mSql.length();
                StringBuilder sb = new StringBuilder("Finalizing a Cursor that has not been deactivated or closed. database = ");
                sb.append(this.mDatabase.getPath());
                sb.append(", table = ");
                sb.append(this.mEditTable);
                sb.append(", query = ");
                String str = this.mQuery.mSql;
                if (length > 100) {
                    length = 100;
                }
                sb.append(str.substring(0, length));
                close();
                SQLiteDebug.notifyActiveCursorFinalized();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.CrossProcessCursor
    public void fillWindow(int i, android.database.CursorWindow cursorWindow) {
        if (this.mWindow == null) {
            this.mWindow = new CursorWindow(true);
        } else {
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mWindow.clear();
            } finally {
                queryThreadUnlock();
            }
        }
        this.mWindow.setStartPosition(i);
        int fillWindow = this.mQuery.fillWindow(this.mWindow, this.mInitialRead, 0);
        this.mCount = fillWindow;
        if (fillWindow == -1) {
            this.mCount = i + this.mInitialRead;
            new Thread(new QueryThread(this.mCursorState), "query thread").start();
        }
    }
}
