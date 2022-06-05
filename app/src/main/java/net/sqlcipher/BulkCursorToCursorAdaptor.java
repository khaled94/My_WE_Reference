package net.sqlcipher;

import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Map;
import net.sqlcipher.AbstractCursor;

/* loaded from: classes2.dex */
public final class BulkCursorToCursorAdaptor extends AbstractWindowedCursor {
    private static final String TAG = "BulkCursor";
    private IBulkCursor mBulkCursor;
    private String[] mColumns;
    private int mCount;
    private AbstractCursor.SelfContentObserver mObserverBridge;
    private boolean mWantsAllOnMoveCalls;

    @Override // net.sqlcipher.AbstractWindowedCursor, net.sqlcipher.AbstractCursor, android.database.Cursor
    public final void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public final void registerContentObserver(ContentObserver contentObserver) {
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public final void unregisterContentObserver(ContentObserver contentObserver) {
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public final void set(IBulkCursor iBulkCursor) {
        this.mBulkCursor = iBulkCursor;
        try {
            this.mCount = iBulkCursor.count();
            this.mWantsAllOnMoveCalls = this.mBulkCursor.getWantsAllOnMoveCalls();
            String[] columnNames = this.mBulkCursor.getColumnNames();
            this.mColumns = columnNames;
            this.mRowIdColumnIndex = findRowIdColumnIndex(columnNames);
        } catch (RemoteException unused) {
        }
    }

    public final void set(IBulkCursor iBulkCursor, int i, int i2) {
        this.mBulkCursor = iBulkCursor;
        this.mColumns = null;
        this.mCount = i;
        this.mRowIdColumnIndex = i2;
    }

    public static int findRowIdColumnIndex(String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (strArr[i].equals("_id")) {
                return i;
            }
        }
        return -1;
    }

    public final synchronized IContentObserver getObserver() {
        if (this.mObserverBridge == null) {
            this.mObserverBridge = new AbstractCursor.SelfContentObserver(this);
        }
        return null;
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public final int getCount() {
        return this.mCount;
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.CrossProcessCursor
    public final boolean onMove(int i, int i2) {
        try {
            if (this.mWindow != null) {
                if (i2 >= this.mWindow.getStartPosition() && i2 < this.mWindow.getStartPosition() + this.mWindow.getNumRows()) {
                    if (this.mWantsAllOnMoveCalls) {
                        this.mBulkCursor.onMove(i2);
                    }
                }
                this.mWindow = this.mBulkCursor.getWindow(i2);
            } else {
                this.mWindow = this.mBulkCursor.getWindow(i2);
            }
            return this.mWindow != null;
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public final void deactivate() {
        super.deactivate();
        try {
            this.mBulkCursor.deactivate();
        } catch (RemoteException unused) {
        }
        this.mWindow = null;
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        try {
            this.mBulkCursor.close();
        } catch (RemoteException unused) {
        }
        this.mWindow = null;
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public final boolean requery() {
        try {
            int requery = this.mBulkCursor.requery(getObserver(), new CursorWindow(false));
            this.mCount = requery;
            if (requery != -1) {
                this.mPos = -1;
                this.mWindow = null;
                super.requery();
                return true;
            }
            deactivate();
            return false;
        } catch (Exception e) {
            new StringBuilder("Unable to requery because the remote process exception ").append(e.getMessage());
            deactivate();
            return false;
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public final boolean deleteRow() {
        try {
            boolean deleteRow = this.mBulkCursor.deleteRow(this.mPos);
            if (deleteRow) {
                this.mWindow = null;
                this.mCount = this.mBulkCursor.count();
                if (this.mPos < this.mCount) {
                    int i = this.mPos;
                    this.mPos = -1;
                    moveToPosition(i);
                } else {
                    this.mPos = this.mCount;
                }
                onChange(true);
            }
            return deleteRow;
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public final String[] getColumnNames() {
        if (this.mColumns == null) {
            try {
                this.mColumns = this.mBulkCursor.getColumnNames();
            } catch (RemoteException unused) {
                return null;
            }
        }
        return this.mColumns;
    }

    @Override // net.sqlcipher.AbstractCursor
    public final boolean commitUpdates(Map<? extends Long, ? extends Map<String, Object>> map) {
        if (!supportsUpdates()) {
            return false;
        }
        synchronized (this.mUpdatedRows) {
            if (map != null) {
                this.mUpdatedRows.putAll(map);
            }
            if (this.mUpdatedRows.size() <= 0) {
                return false;
            }
            try {
                boolean updateRows = this.mBulkCursor.updateRows(this.mUpdatedRows);
                if (updateRows) {
                    this.mUpdatedRows.clear();
                    onChange(true);
                }
                return updateRows;
            } catch (RemoteException unused) {
                return false;
            }
        }
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public final Bundle getExtras() {
        try {
            return this.mBulkCursor.getExtras();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public final Bundle respond(Bundle bundle) {
        try {
            return this.mBulkCursor.respond(bundle);
        } catch (RemoteException unused) {
            return Bundle.EMPTY;
        }
    }
}
