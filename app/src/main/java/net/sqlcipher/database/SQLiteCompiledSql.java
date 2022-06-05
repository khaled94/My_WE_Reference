package net.sqlcipher.database;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class SQLiteCompiledSql {
    private static final String TAG = "SQLiteCompiledSql";
    SQLiteDatabase mDatabase;
    private String mSqlStmt;
    private Throwable mStackTrace;
    long nHandle;
    long nStatement = 0;
    private boolean mInUse = false;

    private final native void native_compile(String str);

    private final native void native_finalize();

    /* JADX INFO: Access modifiers changed from: package-private */
    public SQLiteCompiledSql(SQLiteDatabase sQLiteDatabase, String str) {
        this.nHandle = 0L;
        this.mSqlStmt = null;
        this.mStackTrace = null;
        if (!sQLiteDatabase.isOpen()) {
            throw new IllegalStateException("database " + sQLiteDatabase.getPath() + " already closed");
        }
        this.mDatabase = sQLiteDatabase;
        this.mSqlStmt = str;
        this.mStackTrace = new DatabaseObjectNotClosedException().fillInStackTrace();
        this.nHandle = sQLiteDatabase.mNativeHandle;
        compile(str, true);
    }

    private void compile(String str, boolean z) {
        if (!this.mDatabase.isOpen()) {
            throw new IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        } else if (!z) {
        } else {
            this.mDatabase.lock();
            try {
                native_compile(str);
            } finally {
                this.mDatabase.unlock();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void releaseSqlStatement() {
        if (this.nStatement != 0) {
            if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
                StringBuilder sb = new StringBuilder("closed and deallocated DbObj (id#");
                sb.append(this.nStatement);
                sb.append(")");
            }
            try {
                this.mDatabase.lock();
                native_finalize();
                this.nStatement = 0L;
            } finally {
                this.mDatabase.unlock();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean acquire() {
        if (this.mInUse) {
            return false;
        }
        this.mInUse = true;
        if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
            StringBuilder sb = new StringBuilder("Acquired DbObj (id#");
            sb.append(this.nStatement);
            sb.append(") from DB cache");
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void release() {
        if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
            StringBuilder sb = new StringBuilder("Released DbObj (id#");
            sb.append(this.nStatement);
            sb.append(") back to DB cache");
        }
        this.mInUse = false;
    }

    protected void finalize() throws Throwable {
        try {
            if (this.nStatement == 0) {
                return;
            }
            if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
                StringBuilder sb = new StringBuilder("** warning ** Finalized DbObj (id#");
                sb.append(this.nStatement);
                sb.append(")");
            }
            int length = this.mSqlStmt.length();
            StringBuilder sb2 = new StringBuilder("Releasing statement in a finalizer. Please ensure that you explicitly call close() on your cursor: ");
            String str = this.mSqlStmt;
            if (length > 100) {
                length = 100;
            }
            sb2.append(str.substring(0, length));
            releaseSqlStatement();
        } finally {
            super.finalize();
        }
    }
}
