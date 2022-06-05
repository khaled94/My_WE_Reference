package net.sqlcipher.database;

import android.os.SystemClock;
import net.sqlcipher.CursorWindow;

/* loaded from: classes2.dex */
public class SQLiteQuery extends SQLiteProgram {
    private static final String TAG = "Cursor";
    private String[] mBindArgs;
    private Object[] mObjectBindArgs;
    private int mOffsetIndex;

    private final native int native_column_count();

    private final native String native_column_name(int i);

    private final native int native_fill_window(CursorWindow cursorWindow, int i, int i2, int i3, int i4);

    /* JADX INFO: Access modifiers changed from: package-private */
    public SQLiteQuery(SQLiteDatabase sQLiteDatabase, String str, int i, String[] strArr) {
        super(sQLiteDatabase, str);
        this.mOffsetIndex = i;
        this.mBindArgs = strArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SQLiteQuery(SQLiteDatabase sQLiteDatabase, String str, int i, Object[] objArr) {
        super(sQLiteDatabase, str);
        this.mOffsetIndex = i;
        this.mObjectBindArgs = objArr;
        this.mBindArgs = new String[objArr != null ? objArr.length : 0];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int fillWindow(CursorWindow cursorWindow, int i, int i2) {
        SystemClock.uptimeMillis();
        this.mDatabase.lock();
        try {
            acquireReference();
            try {
                cursorWindow.acquireReference();
                int native_fill_window = native_fill_window(cursorWindow, cursorWindow.getStartPosition(), this.mOffsetIndex, i, i2);
                if (SQLiteDebug.DEBUG_SQL_STATEMENTS) {
                    new StringBuilder("fillWindow(): ").append(this.mSql);
                }
                cursorWindow.releaseReference();
                return native_fill_window;
            } catch (IllegalStateException unused) {
                cursorWindow.releaseReference();
                releaseReference();
                this.mDatabase.unlock();
                return 0;
            } catch (SQLiteDatabaseCorruptException e) {
                this.mDatabase.onCorruption();
                throw e;
            }
        } finally {
            releaseReference();
            this.mDatabase.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int columnCountLocked() {
        acquireReference();
        try {
            return native_column_count();
        } finally {
            releaseReference();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String columnNameLocked(int i) {
        acquireReference();
        try {
            return native_column_name(i);
        } finally {
            releaseReference();
        }
    }

    public String toString() {
        return "SQLiteQuery: " + this.mSql;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void requery() {
        String[] strArr = this.mBindArgs;
        if (strArr != null) {
            int length = strArr.length;
            try {
                if (this.mObjectBindArgs != null) {
                    bindArguments(this.mObjectBindArgs);
                    return;
                }
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    super.bindString(i2, this.mBindArgs[i]);
                    i = i2;
                }
            } catch (SQLiteMisuseException e) {
                StringBuilder sb = new StringBuilder("mSql " + this.mSql);
                for (int i3 = 0; i3 < length; i3++) {
                    sb.append(" ");
                    sb.append(this.mBindArgs[i3]);
                }
                sb.append(" ");
                throw new IllegalStateException(sb.toString(), e);
            }
        }
    }

    @Override // net.sqlcipher.database.SQLiteProgram
    public void bindNull(int i) {
        this.mBindArgs[i - 1] = null;
        if (!this.mClosed) {
            super.bindNull(i);
        }
    }

    @Override // net.sqlcipher.database.SQLiteProgram
    public void bindLong(int i, long j) {
        this.mBindArgs[i - 1] = Long.toString(j);
        if (!this.mClosed) {
            super.bindLong(i, j);
        }
    }

    @Override // net.sqlcipher.database.SQLiteProgram
    public void bindDouble(int i, double d) {
        this.mBindArgs[i - 1] = Double.toString(d);
        if (!this.mClosed) {
            super.bindDouble(i, d);
        }
    }

    @Override // net.sqlcipher.database.SQLiteProgram
    public void bindString(int i, String str) {
        this.mBindArgs[i - 1] = str;
        if (!this.mClosed) {
            super.bindString(i, str);
        }
    }

    public void bindArguments(Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null) {
                bindNull(i + 1);
            } else if (obj instanceof Double) {
                bindDouble(i + 1, ((Double) obj).doubleValue());
            } else if (obj instanceof Float) {
                bindDouble(i + 1, ((Number) obj).floatValue());
            } else if (obj instanceof Long) {
                bindLong(i + 1, ((Long) obj).longValue());
            } else if (obj instanceof Integer) {
                bindLong(i + 1, ((Number) obj).intValue());
            } else if (obj instanceof Boolean) {
                bindLong(i + 1, ((Boolean) obj).booleanValue() ? 1L : 0L);
            } else if (obj instanceof byte[]) {
                bindBlob(i + 1, (byte[]) obj);
            } else {
                bindString(i + 1, obj.toString());
            }
        }
    }
}
