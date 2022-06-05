package net.sqlcipher.database;

import android.content.ContentValues;
import android.content.Context;
import android.os.Debug;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.room.FtsOptions;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import java.util.zip.ZipInputStream;
import net.sqlcipher.CrossProcessCursorWrapper;
import net.sqlcipher.Cursor;
import net.sqlcipher.CursorWrapper;
import net.sqlcipher.DatabaseErrorHandler;
import net.sqlcipher.DatabaseUtils;
import net.sqlcipher.SQLException;
import net.sqlcipher.database.SQLiteDebug;

/* loaded from: classes2.dex */
public class SQLiteDatabase extends SQLiteClosable {
    private static final String COMMIT_SQL = "COMMIT;";
    public static final int CONFLICT_ABORT = 2;
    public static final int CONFLICT_FAIL = 3;
    public static final int CONFLICT_IGNORE = 4;
    public static final int CONFLICT_NONE = 0;
    public static final int CONFLICT_REPLACE = 5;
    public static final int CONFLICT_ROLLBACK = 1;
    public static final int CREATE_IF_NECESSARY = 268435456;
    private static final int EVENT_DB_CORRUPT = 75004;
    private static final int EVENT_DB_OPERATION = 52000;
    static final String GET_LOCK_LOG_PREFIX = "GETLOCK:";
    private static final String KEY_ENCODING = "UTF-8";
    private static final int LOCK_ACQUIRED_WARNING_THREAD_TIME_IN_MS = 100;
    private static final int LOCK_ACQUIRED_WARNING_TIME_IN_MS = 300;
    private static final int LOCK_ACQUIRED_WARNING_TIME_IN_MS_ALWAYS_PRINT = 2000;
    private static final int LOCK_WARNING_WINDOW_IN_MS = 20000;
    private static final String LOG_SLOW_QUERIES_PROPERTY = "db.log.slow_query_threshold";
    public static final int MAX_SQL_CACHE_SIZE = 250;
    private static final int MAX_WARNINGS_ON_CACHESIZE_CONDITION = 1;
    public static final String MEMORY = ":memory:";
    public static final int NO_LOCALIZED_COLLATORS = 16;
    public static final int OPEN_READONLY = 1;
    public static final int OPEN_READWRITE = 0;
    private static final int OPEN_READ_MASK = 1;
    private static final int QUERY_LOG_SQL_LENGTH = 64;
    private static final int SLEEP_AFTER_YIELD_QUANTUM = 1000;
    public static final String SQLCIPHER_ANDROID_VERSION = "3.5.9";
    public static final int SQLITE_MAX_LIKE_PATTERN_LENGTH = 50000;
    private static final String TAG = "Database";
    private int mCacheFullWarnings;
    Map<String, SQLiteCompiledSql> mCompiledQueries;
    private final DatabaseErrorHandler mErrorHandler;
    private CursorFactory mFactory;
    private int mFlags;
    private boolean mInnerTransactionIsSuccessful;
    private long mLastLockMessageTime;
    private String mLastSqlStatement;
    private final ReentrantLock mLock;
    private long mLockAcquiredThreadTime;
    private long mLockAcquiredWallTime;
    private boolean mLockingEnabled;
    private int mMaxSqlCacheSize;
    long mNativeHandle;
    private int mNumCacheHits;
    private int mNumCacheMisses;
    private String mPath;
    private String mPathForLogs;
    private WeakHashMap<SQLiteClosable, Object> mPrograms;
    private final int mSlowQueryThreshold;
    private Throwable mStackTrace;
    private final Map<String, SyncUpdateInfo> mSyncUpdateInfo;
    int mTempTableSequence;
    private String mTimeClosed;
    private String mTimeOpened;
    private boolean mTransactionIsSuccessful;
    private SQLiteTransactionListener mTransactionListener;
    private static WeakHashMap<SQLiteDatabase, Object> sActiveDatabases = new WeakHashMap<>();
    private static final String[] CONFLICT_VALUES = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final Pattern EMAIL_IN_DB_PATTERN = Pattern.compile("[\\w\\.\\-]+@[\\w\\.\\-]+");
    private static int sQueryLogTimeInMillis = 0;

    /* loaded from: classes2.dex */
    public interface CursorFactory {
        Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery);
    }

    /* loaded from: classes2.dex */
    public interface LibraryLoader {
        void loadLibraries(String... strArr);
    }

    private native void dbclose();

    private native void dbopen(String str, int i);

    private native void enableSqlProfiling(String str);

    private native void enableSqlTracing(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native void key(byte[] bArr) throws SQLException;

    /* JADX INFO: Access modifiers changed from: private */
    public native void key_mutf8(char[] cArr) throws SQLException;

    private native int native_getDbLookaside();

    private native void native_key(char[] cArr) throws SQLException;

    private native void native_rawExecSQL(String str);

    private native void native_rekey(String str) throws SQLException;

    private native int native_status(int i, boolean z);

    private native void rekey(byte[] bArr) throws SQLException;

    public static native int releaseMemory();

    public static native void setICURoot(String str);

    /* JADX INFO: Access modifiers changed from: package-private */
    public native int lastChangeCount();

    /* JADX INFO: Access modifiers changed from: package-private */
    public native long lastInsertRow();

    native void native_execSQL(String str) throws SQLException;

    native void native_setLocale(String str, int i);

    public int status(int i, boolean z) {
        return native_status(i, z);
    }

    public void changePassword(String str) throws SQLiteException {
        if (isOpen()) {
            if (str == null) {
                return;
            }
            rekey(getBytes(str.toCharArray()));
            return;
        }
        throw new SQLiteException("database not open");
    }

    public void changePassword(char[] cArr) throws SQLiteException {
        if (isOpen()) {
            if (cArr == null) {
                return;
            }
            rekey(getBytes(cArr));
            return;
        }
        throw new SQLiteException("database not open");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.zip.ZipInputStream] */
    /* JADX WARN: Type inference failed for: r1v4 */
    private static void loadICUData(Context context, File file) {
        FileOutputStream fileOutputStream;
        Throwable th;
        Exception e;
        FileOutputStream fileOutputStream2;
        File file2 = new File(file, FtsOptions.TOKENIZER_ICU);
        File file3 = new File(file2, "icudt46l.dat");
        ZipInputStream zipInputStream = 0;
        ZipInputStream zipInputStream2 = null;
        try {
            try {
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                if (!file3.exists()) {
                    ZipInputStream zipInputStream3 = new ZipInputStream(context.getAssets().open("icudt46l.zip"));
                    try {
                        zipInputStream3.getNextEntry();
                        fileOutputStream2 = new FileOutputStream(file3);
                    } catch (Exception e2) {
                        e = e2;
                    }
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = zipInputStream3.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, read);
                        }
                        zipInputStream2 = zipInputStream3;
                    } catch (Exception e3) {
                        e = e3;
                        if (file3.exists()) {
                            file3.delete();
                        }
                        throw new RuntimeException(e);
                    } catch (Throwable th2) {
                        zipInputStream = zipInputStream3;
                        fileOutputStream = fileOutputStream2;
                        th = th2;
                        if (zipInputStream != 0) {
                            try {
                                zipInputStream.close();
                            } catch (IOException e4) {
                                throw new RuntimeException(e4);
                            }
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        }
                        throw th;
                    }
                } else {
                    fileOutputStream2 = null;
                }
                if (zipInputStream2 != null) {
                    try {
                        zipInputStream2.close();
                    } catch (IOException e5) {
                        throw new RuntimeException(e5);
                    }
                }
                if (fileOutputStream2 == null) {
                    return;
                }
                fileOutputStream2.flush();
                fileOutputStream2.close();
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
                zipInputStream = file2;
            }
        } catch (Exception e6) {
            e = e6;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public static synchronized void loadLibs(Context context) {
        synchronized (SQLiteDatabase.class) {
            loadLibs(context, context.getFilesDir());
        }
    }

    public static synchronized void loadLibs(Context context, File file) {
        synchronized (SQLiteDatabase.class) {
            loadLibs(context, file, new LibraryLoader() { // from class: net.sqlcipher.database.SQLiteDatabase.1
                @Override // net.sqlcipher.database.SQLiteDatabase.LibraryLoader
                public final void loadLibraries(String... strArr) {
                    for (String str : strArr) {
                        System.loadLibrary(str);
                    }
                }
            });
        }
    }

    public static synchronized void loadLibs(Context context, LibraryLoader libraryLoader) {
        synchronized (SQLiteDatabase.class) {
            loadLibs(context, context.getFilesDir(), libraryLoader);
        }
    }

    public static synchronized void loadLibs(Context context, File file, LibraryLoader libraryLoader) {
        synchronized (SQLiteDatabase.class) {
            libraryLoader.loadLibraries("sqlcipher");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addSQLiteClosable(SQLiteClosable sQLiteClosable) {
        lock();
        try {
            this.mPrograms.put(sQLiteClosable, null);
        } finally {
            unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeSQLiteClosable(SQLiteClosable sQLiteClosable) {
        lock();
        try {
            this.mPrograms.remove(sQLiteClosable);
        } finally {
            unlock();
        }
    }

    @Override // net.sqlcipher.database.SQLiteClosable
    protected void onAllReferencesReleased() {
        if (isOpen()) {
            if (SQLiteDebug.DEBUG_SQL_CACHE) {
                this.mTimeClosed = getTime();
            }
            dbclose();
            synchronized (sActiveDatabases) {
                sActiveDatabases.remove(this);
            }
        }
    }

    public void setLockingEnabled(boolean z) {
        this.mLockingEnabled = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onCorruption() {
        new StringBuilder("Calling error handler for corrupt database (detected) ").append(this.mPath);
        this.mErrorHandler.onCorruption(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void lock() {
        if (!this.mLockingEnabled) {
            return;
        }
        this.mLock.lock();
        if (!SQLiteDebug.DEBUG_LOCK_TIME_TRACKING || this.mLock.getHoldCount() != 1) {
            return;
        }
        this.mLockAcquiredWallTime = SystemClock.elapsedRealtime();
        this.mLockAcquiredThreadTime = Debug.threadCpuTimeNanos();
    }

    private void lockForced() {
        this.mLock.lock();
        if (!SQLiteDebug.DEBUG_LOCK_TIME_TRACKING || this.mLock.getHoldCount() != 1) {
            return;
        }
        this.mLockAcquiredWallTime = SystemClock.elapsedRealtime();
        this.mLockAcquiredThreadTime = Debug.threadCpuTimeNanos();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void unlock() {
        if (!this.mLockingEnabled) {
            return;
        }
        if (SQLiteDebug.DEBUG_LOCK_TIME_TRACKING && this.mLock.getHoldCount() == 1) {
            checkLockHoldTime();
        }
        this.mLock.unlock();
    }

    private void unlockForced() {
        if (SQLiteDebug.DEBUG_LOCK_TIME_TRACKING && this.mLock.getHoldCount() == 1) {
            checkLockHoldTime();
        }
        this.mLock.unlock();
    }

    private void checkLockHoldTime() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.mLockAcquiredWallTime;
        int i = (j > 2000L ? 1 : (j == 2000L ? 0 : -1));
        if ((i >= 0 || Log.isLoggable(TAG, 2) || elapsedRealtime - this.mLastLockMessageTime >= 20000) && j > 300) {
            int threadCpuTimeNanos = (int) ((Debug.threadCpuTimeNanos() - this.mLockAcquiredThreadTime) / 1000000);
            if (threadCpuTimeNanos <= 100 && i <= 0) {
                return;
            }
            this.mLastLockMessageTime = elapsedRealtime;
            StringBuilder sb = new StringBuilder("lock held on ");
            sb.append(this.mPath);
            sb.append(" for ");
            sb.append(j);
            sb.append("ms. Thread time was ");
            sb.append(threadCpuTimeNanos);
            sb.append("ms");
            if (!SQLiteDebug.DEBUG_LOCK_TIME_TRACKING_STACK_TRACE) {
                return;
            }
            new Exception();
        }
    }

    public void beginTransaction() {
        beginTransactionWithListener(null);
    }

    public void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener) {
        lockForced();
        if (!isOpen()) {
            throw new IllegalStateException("database not open");
        }
        try {
            if (this.mLock.getHoldCount() > 1) {
                if (this.mInnerTransactionIsSuccessful) {
                    throw new IllegalStateException("Cannot call beginTransaction between calling setTransactionSuccessful and endTransaction");
                }
                return;
            }
            execSQL("BEGIN EXCLUSIVE;");
            this.mTransactionListener = sQLiteTransactionListener;
            this.mTransactionIsSuccessful = true;
            this.mInnerTransactionIsSuccessful = false;
            if (sQLiteTransactionListener == null) {
                return;
            }
            try {
                sQLiteTransactionListener.onBegin();
            } catch (RuntimeException e) {
                execSQL("ROLLBACK;");
                throw e;
            }
        } catch (Throwable th) {
            unlockForced();
            throw th;
        }
    }

    public void endTransaction() {
        if (!isOpen()) {
            throw new IllegalStateException("database not open");
        }
        if (!this.mLock.isHeldByCurrentThread()) {
            throw new IllegalStateException("no transaction pending");
        }
        try {
            if (this.mInnerTransactionIsSuccessful) {
                this.mInnerTransactionIsSuccessful = false;
            } else {
                this.mTransactionIsSuccessful = false;
            }
            if (this.mLock.getHoldCount() == 1) {
                if (this.mTransactionListener != null) {
                    try {
                        if (this.mTransactionIsSuccessful) {
                            this.mTransactionListener.onCommit();
                        } else {
                            this.mTransactionListener.onRollback();
                        }
                    } catch (RuntimeException e) {
                        e = e;
                        this.mTransactionIsSuccessful = false;
                    }
                }
                e = null;
                if (this.mTransactionIsSuccessful) {
                    execSQL(COMMIT_SQL);
                } else {
                    try {
                        execSQL("ROLLBACK;");
                        if (e != null) {
                            throw e;
                        }
                    } catch (SQLException unused) {
                    }
                }
            }
        } finally {
            this.mTransactionListener = null;
            unlockForced();
        }
    }

    public void setTransactionSuccessful() {
        if (!isOpen()) {
            throw new IllegalStateException("database not open");
        }
        if (!this.mLock.isHeldByCurrentThread()) {
            throw new IllegalStateException("no transaction pending");
        }
        if (this.mInnerTransactionIsSuccessful) {
            throw new IllegalStateException("setTransactionSuccessful may only be called once per call to beginTransaction");
        }
        this.mInnerTransactionIsSuccessful = true;
    }

    public boolean inTransaction() {
        return this.mLock.getHoldCount() > 0;
    }

    public boolean isDbLockedByCurrentThread() {
        return this.mLock.isHeldByCurrentThread();
    }

    public boolean isDbLockedByOtherThreads() {
        return !this.mLock.isHeldByCurrentThread() && this.mLock.isLocked();
    }

    @Deprecated
    public boolean yieldIfContended() {
        if (!isOpen()) {
            return false;
        }
        return yieldIfContendedHelper(false, -1L);
    }

    public boolean yieldIfContendedSafely() {
        if (!isOpen()) {
            return false;
        }
        return yieldIfContendedHelper(true, -1L);
    }

    public boolean yieldIfContendedSafely(long j) {
        if (!isOpen()) {
            return false;
        }
        return yieldIfContendedHelper(true, j);
    }

    private boolean yieldIfContendedHelper(boolean z, long j) {
        if (this.mLock.getQueueLength() == 0) {
            this.mLockAcquiredWallTime = SystemClock.elapsedRealtime();
            this.mLockAcquiredThreadTime = Debug.threadCpuTimeNanos();
            return false;
        }
        setTransactionSuccessful();
        SQLiteTransactionListener sQLiteTransactionListener = this.mTransactionListener;
        endTransaction();
        if (z && isDbLockedByCurrentThread()) {
            throw new IllegalStateException("Db locked more than once. yielfIfContended cannot yield");
        }
        if (j > 0) {
            while (j > 0) {
                try {
                    Thread.sleep(j < 1000 ? j : 1000L);
                } catch (InterruptedException unused) {
                    Thread.interrupted();
                }
                j -= 1000;
                if (this.mLock.getQueueLength() == 0) {
                    break;
                }
            }
        }
        beginTransactionWithListener(sQLiteTransactionListener);
        return true;
    }

    public Map<String, String> getSyncedTables() {
        HashMap hashMap;
        synchronized (this.mSyncUpdateInfo) {
            hashMap = new HashMap();
            for (String str : this.mSyncUpdateInfo.keySet()) {
                SyncUpdateInfo syncUpdateInfo = this.mSyncUpdateInfo.get(str);
                if (syncUpdateInfo.deletedTable != null) {
                    hashMap.put(str, syncUpdateInfo.deletedTable);
                }
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SyncUpdateInfo {
        String deletedTable;
        String foreignKey;
        String masterTable;

        SyncUpdateInfo(String str, String str2, String str3) {
            this.masterTable = str;
            this.deletedTable = str2;
            this.foreignKey = str3;
        }
    }

    public static SQLiteDatabase openDatabase(String str, String str2, CursorFactory cursorFactory, int i) {
        return openDatabase(str, str2, cursorFactory, i, (SQLiteDatabaseHook) null);
    }

    public static SQLiteDatabase openDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i) {
        return openDatabase(str, cArr, cursorFactory, i, (SQLiteDatabaseHook) null, (DatabaseErrorHandler) null);
    }

    public static SQLiteDatabase openDatabase(String str, String str2, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, str2, cursorFactory, i, sQLiteDatabaseHook, (DatabaseErrorHandler) null);
    }

    public static SQLiteDatabase openDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, cArr, cursorFactory, i, sQLiteDatabaseHook, (DatabaseErrorHandler) null);
    }

    public static SQLiteDatabase openDatabase(String str, String str2, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, str2 == null ? null : str2.toCharArray(), cursorFactory, i, sQLiteDatabaseHook, databaseErrorHandler);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static net.sqlcipher.database.SQLiteDatabase openDatabase(java.lang.String r2, char[] r3, net.sqlcipher.database.SQLiteDatabase.CursorFactory r4, int r5, net.sqlcipher.database.SQLiteDatabaseHook r6, net.sqlcipher.DatabaseErrorHandler r7) {
        /*
            if (r7 == 0) goto L3
            goto L8
        L3:
            net.sqlcipher.DefaultDatabaseErrorHandler r7 = new net.sqlcipher.DefaultDatabaseErrorHandler
            r7.<init>()
        L8:
            r0 = 0
            net.sqlcipher.database.SQLiteDatabase r1 = new net.sqlcipher.database.SQLiteDatabase     // Catch: net.sqlcipher.database.SQLiteDatabaseCorruptException -> L12
            r1.<init>(r2, r4, r5, r7)     // Catch: net.sqlcipher.database.SQLiteDatabaseCorruptException -> L12
            r1.openDatabaseInternal(r3, r6)     // Catch: net.sqlcipher.database.SQLiteDatabaseCorruptException -> L13
            goto L1e
        L12:
            r1 = r0
        L13:
            r7.onCorruption(r1)
            net.sqlcipher.database.SQLiteDatabase r1 = new net.sqlcipher.database.SQLiteDatabase
            r1.<init>(r2, r4, r5, r7)
            r1.openDatabaseInternal(r3, r6)
        L1e:
            boolean r3 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_STATEMENTS
            if (r3 == 0) goto L25
            r1.enableSqlTracing(r2)
        L25:
            boolean r3 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_TIME
            if (r3 == 0) goto L2c
            r1.enableSqlProfiling(r2)
        L2c:
            java.util.WeakHashMap<net.sqlcipher.database.SQLiteDatabase, java.lang.Object> r2 = net.sqlcipher.database.SQLiteDatabase.sActiveDatabases
            monitor-enter(r2)
            java.util.WeakHashMap<net.sqlcipher.database.SQLiteDatabase, java.lang.Object> r3 = net.sqlcipher.database.SQLiteDatabase.sActiveDatabases     // Catch: java.lang.Throwable -> L36
            r3.put(r1, r0)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L36
            return r1
        L36:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L36
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.openDatabase(java.lang.String, char[], net.sqlcipher.database.SQLiteDatabase$CursorFactory, int, net.sqlcipher.database.SQLiteDatabaseHook, net.sqlcipher.DatabaseErrorHandler):net.sqlcipher.database.SQLiteDatabase");
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, String str, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openOrCreateDatabase(file, str, cursorFactory, sQLiteDatabaseHook, (DatabaseErrorHandler) null);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, String str2, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, str2, cursorFactory, (int) CREATE_IF_NECESSARY, sQLiteDatabaseHook);
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, String str, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        return openOrCreateDatabase(file == null ? null : file.getPath(), str, cursorFactory, sQLiteDatabaseHook, databaseErrorHandler);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, String str2, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, str2 == null ? null : str2.toCharArray(), cursorFactory, (int) CREATE_IF_NECESSARY, sQLiteDatabaseHook, databaseErrorHandler);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, char[] cArr, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, cArr, cursorFactory, (int) CREATE_IF_NECESSARY, sQLiteDatabaseHook);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, char[] cArr, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, cArr, cursorFactory, (int) CREATE_IF_NECESSARY, sQLiteDatabaseHook, databaseErrorHandler);
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, String str, CursorFactory cursorFactory) {
        return openOrCreateDatabase(file, str, cursorFactory, (SQLiteDatabaseHook) null);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, String str2, CursorFactory cursorFactory) {
        return openDatabase(str, str2, cursorFactory, (int) CREATE_IF_NECESSARY, (SQLiteDatabaseHook) null);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, char[] cArr, CursorFactory cursorFactory) {
        return openDatabase(str, cArr, cursorFactory, (int) CREATE_IF_NECESSARY, (SQLiteDatabaseHook) null);
    }

    public static SQLiteDatabase create(CursorFactory cursorFactory, String str) {
        return openDatabase(MEMORY, str == null ? null : str.toCharArray(), cursorFactory, (int) CREATE_IF_NECESSARY);
    }

    public static SQLiteDatabase create(CursorFactory cursorFactory, char[] cArr) {
        return openDatabase(MEMORY, cArr, cursorFactory, (int) CREATE_IF_NECESSARY);
    }

    public void close() {
        if (!isOpen()) {
            return;
        }
        lock();
        try {
            closeClosable();
            onAllReferencesReleased();
        } finally {
            unlock();
        }
    }

    private void closeClosable() {
        deallocCachedSqlStatements();
        for (Map.Entry<SQLiteClosable, Object> entry : this.mPrograms.entrySet()) {
            SQLiteClosable key = entry.getKey();
            if (key != null) {
                key.onAllReferencesReleasedFromContainer();
            }
        }
    }

    public int getVersion() {
        SQLiteStatement sQLiteStatement;
        Throwable th;
        lock();
        if (!isOpen()) {
            throw new IllegalStateException("database not open");
        }
        try {
            sQLiteStatement = new SQLiteStatement(this, "PRAGMA user_version;");
            try {
                int simpleQueryForLong = (int) sQLiteStatement.simpleQueryForLong();
                sQLiteStatement.close();
                unlock();
                return simpleQueryForLong;
            } catch (Throwable th2) {
                th = th2;
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                unlock();
                throw th;
            }
        } catch (Throwable th3) {
            sQLiteStatement = null;
            th = th3;
        }
    }

    public void setVersion(int i) {
        execSQL("PRAGMA user_version = ".concat(String.valueOf(i)));
    }

    public long getMaximumSize() {
        SQLiteStatement sQLiteStatement;
        Throwable th;
        lock();
        if (!isOpen()) {
            throw new IllegalStateException("database not open");
        }
        try {
            sQLiteStatement = new SQLiteStatement(this, "PRAGMA max_page_count;");
            try {
                long simpleQueryForLong = sQLiteStatement.simpleQueryForLong() * getPageSize();
                sQLiteStatement.close();
                unlock();
                return simpleQueryForLong;
            } catch (Throwable th2) {
                th = th2;
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                unlock();
                throw th;
            }
        } catch (Throwable th3) {
            sQLiteStatement = null;
            th = th3;
        }
    }

    public long setMaximumSize(long j) {
        Throwable th;
        lock();
        if (!isOpen()) {
            throw new IllegalStateException("database not open");
        }
        SQLiteStatement sQLiteStatement = null;
        try {
            long pageSize = getPageSize();
            long j2 = j / pageSize;
            if (j % pageSize != 0) {
                j2++;
            }
            SQLiteStatement sQLiteStatement2 = new SQLiteStatement(this, "PRAGMA max_page_count = ".concat(String.valueOf(j2)));
            try {
                long simpleQueryForLong = sQLiteStatement2.simpleQueryForLong() * pageSize;
                sQLiteStatement2.close();
                unlock();
                return simpleQueryForLong;
            } catch (Throwable th2) {
                th = th2;
                sQLiteStatement = sQLiteStatement2;
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                unlock();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public long getPageSize() {
        SQLiteStatement sQLiteStatement;
        Throwable th;
        lock();
        if (!isOpen()) {
            throw new IllegalStateException("database not open");
        }
        try {
            sQLiteStatement = new SQLiteStatement(this, "PRAGMA page_size;");
            try {
                long simpleQueryForLong = sQLiteStatement.simpleQueryForLong();
                sQLiteStatement.close();
                unlock();
                return simpleQueryForLong;
            } catch (Throwable th2) {
                th = th2;
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                unlock();
                throw th;
            }
        } catch (Throwable th3) {
            sQLiteStatement = null;
            th = th3;
        }
    }

    public void setPageSize(long j) {
        execSQL("PRAGMA page_size = ".concat(String.valueOf(j)));
    }

    public void markTableSyncable(String str, String str2) {
        if (!isOpen()) {
            throw new SQLiteException("database not open");
        }
        markTableSyncable(str, "_id", str, str2);
    }

    public void markTableSyncable(String str, String str2, String str3) {
        if (!isOpen()) {
            throw new SQLiteException("database not open");
        }
        markTableSyncable(str, str2, str3, null);
    }

    /* JADX WARN: Finally extract failed */
    private void markTableSyncable(String str, String str2, String str3, String str4) {
        lock();
        try {
            native_execSQL("SELECT _sync_dirty FROM " + str3 + " LIMIT 0");
            native_execSQL("SELECT " + str2 + " FROM " + str + " LIMIT 0");
            unlock();
            SyncUpdateInfo syncUpdateInfo = new SyncUpdateInfo(str3, str4, str2);
            synchronized (this.mSyncUpdateInfo) {
                this.mSyncUpdateInfo.put(str, syncUpdateInfo);
            }
        } catch (Throwable th) {
            unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void rowUpdated(String str, long j) {
        SyncUpdateInfo syncUpdateInfo;
        synchronized (this.mSyncUpdateInfo) {
            syncUpdateInfo = this.mSyncUpdateInfo.get(str);
        }
        if (syncUpdateInfo != null) {
            execSQL("UPDATE " + syncUpdateInfo.masterTable + " SET _sync_dirty=1 WHERE _id=(SELECT " + syncUpdateInfo.foreignKey + " FROM " + str + " WHERE _id=" + j + ")");
        }
    }

    public static String findEditTable(String str) {
        if (!TextUtils.isEmpty(str)) {
            int indexOf = str.indexOf(32);
            int indexOf2 = str.indexOf(44);
            if (indexOf > 0 && (indexOf < indexOf2 || indexOf2 < 0)) {
                return str.substring(0, indexOf);
            }
            return indexOf2 > 0 ? (indexOf2 < indexOf || indexOf < 0) ? str.substring(0, indexOf2) : str : str;
        }
        throw new IllegalStateException("Invalid tables");
    }

    public SQLiteStatement compileStatement(String str) throws SQLException {
        lock();
        if (!isOpen()) {
            throw new IllegalStateException("database not open");
        }
        try {
            return new SQLiteStatement(this, str);
        } finally {
            unlock();
        }
    }

    public Cursor query(boolean z, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        return queryWithFactory(null, z, str, strArr, str2, strArr2, str3, str4, str5, str6);
    }

    public Cursor queryWithFactory(CursorFactory cursorFactory, boolean z, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        if (!isOpen()) {
            throw new IllegalStateException("database not open");
        }
        return rawQueryWithFactory(cursorFactory, SQLiteQueryBuilder.buildQueryString(z, str, strArr, str2, str3, str4, str5, str6), strArr2, findEditTable(str));
    }

    public Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        return query(false, str, strArr, str2, strArr2, str3, str4, str5, null);
    }

    public Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        return query(false, str, strArr, str2, strArr2, str3, str4, str5, str6);
    }

    public Cursor rawQuery(String str, String[] strArr) {
        return rawQueryWithFactory(null, str, strArr, null);
    }

    /* JADX WARN: Finally extract failed */
    public Cursor rawQuery(String str, Object[] objArr) {
        if (!isOpen()) {
            throw new IllegalStateException("database not open");
        }
        long j = 0;
        int i = -1;
        if (this.mSlowQueryThreshold != -1) {
            j = System.currentTimeMillis();
        }
        SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, str, null);
        try {
            Cursor query = sQLiteDirectCursorDriver.query(this.mFactory, objArr);
            if (this.mSlowQueryThreshold != -1) {
                if (query != null) {
                    i = query.getCount();
                }
                long currentTimeMillis = System.currentTimeMillis() - j;
                if (currentTimeMillis >= this.mSlowQueryThreshold) {
                    StringBuilder sb = new StringBuilder("query (");
                    sb.append(currentTimeMillis);
                    sb.append(" ms): ");
                    sb.append(sQLiteDirectCursorDriver.toString());
                    sb.append(", args are <redacted>, count is ");
                    sb.append(i);
                }
            }
            return new CrossProcessCursorWrapper(query);
        } catch (Throwable th) {
            if (this.mSlowQueryThreshold != -1) {
                long currentTimeMillis2 = System.currentTimeMillis() - j;
                if (currentTimeMillis2 >= this.mSlowQueryThreshold) {
                    StringBuilder sb2 = new StringBuilder("query (");
                    sb2.append(currentTimeMillis2);
                    sb2.append(" ms): ");
                    sb2.append(sQLiteDirectCursorDriver.toString());
                    sb2.append(", args are <redacted>, count is -1");
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    public Cursor rawQueryWithFactory(CursorFactory cursorFactory, String str, String[] strArr, String str2) {
        if (!isOpen()) {
            throw new IllegalStateException("database not open");
        }
        long j = 0;
        int i = -1;
        if (this.mSlowQueryThreshold != -1) {
            j = System.currentTimeMillis();
        }
        SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, str, str2);
        if (cursorFactory == null) {
            try {
                cursorFactory = this.mFactory;
            } catch (Throwable th) {
                if (this.mSlowQueryThreshold != -1) {
                    long currentTimeMillis = System.currentTimeMillis() - j;
                    if (currentTimeMillis >= this.mSlowQueryThreshold) {
                        StringBuilder sb = new StringBuilder("query (");
                        sb.append(currentTimeMillis);
                        sb.append(" ms): ");
                        sb.append(sQLiteDirectCursorDriver.toString());
                        sb.append(", args are <redacted>, count is -1");
                    }
                }
                throw th;
            }
        }
        Cursor query = sQLiteDirectCursorDriver.query(cursorFactory, strArr);
        if (this.mSlowQueryThreshold != -1) {
            if (query != null) {
                i = query.getCount();
            }
            long currentTimeMillis2 = System.currentTimeMillis() - j;
            if (currentTimeMillis2 >= this.mSlowQueryThreshold) {
                StringBuilder sb2 = new StringBuilder("query (");
                sb2.append(currentTimeMillis2);
                sb2.append(" ms): ");
                sb2.append(sQLiteDirectCursorDriver.toString());
                sb2.append(", args are <redacted>, count is ");
                sb2.append(i);
            }
        }
        return new CrossProcessCursorWrapper(query);
    }

    public Cursor rawQuery(String str, String[] strArr, int i, int i2) {
        CursorWrapper cursorWrapper = (CursorWrapper) rawQueryWithFactory(null, str, strArr, null);
        ((SQLiteCursor) cursorWrapper.getWrappedCursor()).setLoadStyle(i, i2);
        return cursorWrapper;
    }

    public long insert(String str, String str2, ContentValues contentValues) {
        try {
            return insertWithOnConflict(str, str2, contentValues, 0);
        } catch (SQLException unused) {
            return -1L;
        }
    }

    public long insertOrThrow(String str, String str2, ContentValues contentValues) throws SQLException {
        return insertWithOnConflict(str, str2, contentValues, 0);
    }

    public long replace(String str, String str2, ContentValues contentValues) {
        try {
            return insertWithOnConflict(str, str2, contentValues, 5);
        } catch (SQLException unused) {
            return -1L;
        }
    }

    public long replaceOrThrow(String str, String str2, ContentValues contentValues) throws SQLException {
        return insertWithOnConflict(str, str2, contentValues, 5);
    }

    public long insertWithOnConflict(String str, String str2, ContentValues contentValues, int i) {
        Set<Map.Entry<String, Object>> set;
        if (!isOpen()) {
            throw new IllegalStateException("database not open");
        }
        StringBuilder sb = new StringBuilder(152);
        sb.append("INSERT");
        sb.append(CONFLICT_VALUES[i]);
        sb.append(" INTO ");
        sb.append(str);
        StringBuilder sb2 = new StringBuilder(40);
        int i2 = 0;
        SQLiteStatement sQLiteStatement = null;
        if (contentValues != null && contentValues.size() > 0) {
            set = contentValues.valueSet();
            sb.append('(');
            boolean z = false;
            for (Map.Entry<String, Object> entry : set) {
                if (z) {
                    sb.append(", ");
                    sb2.append(", ");
                }
                sb.append(entry.getKey());
                sb2.append('?');
                z = true;
            }
            sb.append(')');
        } else {
            sb.append("(" + str2 + ") ");
            sb2.append("NULL");
            set = null;
        }
        sb.append(" VALUES(");
        sb.append((CharSequence) sb2);
        sb.append(");");
        lock();
        try {
            try {
                sQLiteStatement = compileStatement(sb.toString());
                if (set != null) {
                    int size = set.size();
                    Iterator<Map.Entry<String, Object>> it = set.iterator();
                    while (i2 < size) {
                        i2++;
                        DatabaseUtils.bindObjectToProgram(sQLiteStatement, i2, it.next().getValue());
                    }
                }
                sQLiteStatement.execute();
                long lastInsertRow = lastChangeCount() > 0 ? lastInsertRow() : -1L;
                if (lastInsertRow != -1 && Log.isLoggable(TAG, 2)) {
                    StringBuilder sb3 = new StringBuilder("Inserting row ");
                    sb3.append(lastInsertRow);
                    sb3.append(" from <redacted values> using <redacted sql> into ");
                    sb3.append(str);
                }
                return lastInsertRow;
            } catch (SQLiteDatabaseCorruptException e) {
                onCorruption();
                throw e;
            }
        } finally {
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
            }
            unlock();
        }
    }

    public int delete(String str, String str2, String[] strArr) {
        lock();
        if (!isOpen()) {
            throw new IllegalStateException("database not open");
        }
        SQLiteStatement sQLiteStatement = null;
        try {
            try {
                StringBuilder sb = new StringBuilder("DELETE FROM ");
                sb.append(str);
                sb.append(!TextUtils.isEmpty(str2) ? " WHERE ".concat(String.valueOf(str2)) : "");
                sQLiteStatement = compileStatement(sb.toString());
                if (strArr != null) {
                    int length = strArr.length;
                    int i = 0;
                    while (i < length) {
                        int i2 = i + 1;
                        DatabaseUtils.bindObjectToProgram(sQLiteStatement, i2, strArr[i]);
                        i = i2;
                    }
                }
                sQLiteStatement.execute();
                return lastChangeCount();
            } catch (SQLiteDatabaseCorruptException e) {
                onCorruption();
                throw e;
            }
        } finally {
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
            }
            unlock();
        }
    }

    public int update(String str, ContentValues contentValues, String str2, String[] strArr) {
        return updateWithOnConflict(str, contentValues, str2, strArr, 0);
    }

    public int updateWithOnConflict(String str, ContentValues contentValues, String str2, String[] strArr, int i) {
        if (contentValues == null || contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        StringBuilder sb = new StringBuilder(120);
        sb.append("UPDATE ");
        sb.append(CONFLICT_VALUES[i]);
        sb.append(str);
        sb.append(" SET ");
        Set<Map.Entry<String, Object>> valueSet = contentValues.valueSet();
        Iterator<Map.Entry<String, Object>> it = valueSet.iterator();
        while (it.hasNext()) {
            sb.append(it.next().getKey());
            sb.append("=?");
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        lock();
        if (!isOpen()) {
            throw new IllegalStateException("database not open");
        }
        SQLiteStatement sQLiteStatement = null;
        try {
            try {
                sQLiteStatement = compileStatement(sb.toString());
                int size = valueSet.size();
                Iterator<Map.Entry<String, Object>> it2 = valueSet.iterator();
                int i2 = 1;
                for (int i3 = 0; i3 < size; i3++) {
                    DatabaseUtils.bindObjectToProgram(sQLiteStatement, i2, it2.next().getValue());
                    i2++;
                }
                if (strArr != null) {
                    for (String str3 : strArr) {
                        sQLiteStatement.bindString(i2, str3);
                        i2++;
                    }
                }
                sQLiteStatement.execute();
                int lastChangeCount = lastChangeCount();
                if (Log.isLoggable(TAG, 2)) {
                    StringBuilder sb2 = new StringBuilder("Updated ");
                    sb2.append(lastChangeCount);
                    sb2.append(" rows using <redacted values> and <redacted sql> for ");
                    sb2.append(str);
                }
                return lastChangeCount;
            } catch (SQLiteDatabaseCorruptException e) {
                onCorruption();
                throw e;
            } catch (SQLException e2) {
                throw e2;
            }
        } finally {
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
            }
            unlock();
        }
    }

    public void execSQL(String str) throws SQLException {
        SystemClock.uptimeMillis();
        lock();
        try {
            if (!isOpen()) {
                throw new IllegalStateException("database not open");
            }
            try {
                native_execSQL(str);
            } catch (SQLiteDatabaseCorruptException e) {
                onCorruption();
                throw e;
            }
        } finally {
            unlock();
        }
    }

    public void rawExecSQL(String str) {
        SystemClock.uptimeMillis();
        lock();
        try {
            if (!isOpen()) {
                throw new IllegalStateException("database not open");
            }
            try {
                native_rawExecSQL(str);
            } catch (SQLiteDatabaseCorruptException e) {
                onCorruption();
                throw e;
            }
        } finally {
            unlock();
        }
    }

    public void execSQL(String str, Object[] objArr) throws SQLException {
        if (objArr == null) {
            throw new IllegalArgumentException("Empty bindArgs");
        }
        SystemClock.uptimeMillis();
        lock();
        if (!isOpen()) {
            throw new IllegalStateException("database not open");
        }
        SQLiteStatement sQLiteStatement = null;
        try {
            try {
                sQLiteStatement = compileStatement(str);
                if (objArr != null) {
                    int length = objArr.length;
                    int i = 0;
                    while (i < length) {
                        int i2 = i + 1;
                        DatabaseUtils.bindObjectToProgram(sQLiteStatement, i2, objArr[i]);
                        i = i2;
                    }
                }
                sQLiteStatement.execute();
            } catch (SQLiteDatabaseCorruptException e) {
                onCorruption();
                throw e;
            }
        } finally {
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
            }
            unlock();
        }
    }

    protected void finalize() {
        if (isOpen()) {
            StringBuilder sb = new StringBuilder("close() was never explicitly called on database '");
            sb.append(this.mPath);
            sb.append("' ");
            closeClosable();
            onAllReferencesReleased();
        }
    }

    public SQLiteDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i) {
        this(str, cursorFactory, i, (DatabaseErrorHandler) null);
        openDatabaseInternal(cArr, null);
    }

    public SQLiteDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook) {
        this(str, cursorFactory, i, (DatabaseErrorHandler) null);
        openDatabaseInternal(cArr, sQLiteDatabaseHook);
    }

    private SQLiteDatabase(String str, CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
        this.mLock = new ReentrantLock(true);
        this.mLockAcquiredWallTime = 0L;
        this.mLockAcquiredThreadTime = 0L;
        this.mLastLockMessageTime = 0L;
        this.mLastSqlStatement = null;
        this.mNativeHandle = 0L;
        this.mTempTableSequence = 0;
        this.mPathForLogs = null;
        this.mCompiledQueries = new HashMap();
        this.mMaxSqlCacheSize = 250;
        this.mTimeOpened = null;
        this.mTimeClosed = null;
        this.mStackTrace = null;
        this.mLockingEnabled = true;
        this.mSyncUpdateInfo = new HashMap();
        if (str == null) {
            throw new IllegalArgumentException("path should not be null");
        }
        this.mFlags = i;
        this.mPath = str;
        this.mSlowQueryThreshold = -1;
        this.mStackTrace = new DatabaseObjectNotClosedException().fillInStackTrace();
        this.mFactory = cursorFactory;
        this.mPrograms = new WeakHashMap<>();
        this.mErrorHandler = databaseErrorHandler;
    }

    private void openDatabaseInternal(final char[] cArr, SQLiteDatabaseHook sQLiteDatabaseHook) {
        final byte[] bytes = getBytes(cArr);
        dbopen(this.mPath, this.mFlags);
        try {
            try {
                keyDatabase(sQLiteDatabaseHook, new Runnable() { // from class: net.sqlcipher.database.SQLiteDatabase.2
                    @Override // java.lang.Runnable
                    public void run() {
                        byte[] bArr = bytes;
                        if (bArr == null || bArr.length <= 0) {
                            return;
                        }
                        SQLiteDatabase.this.key(bArr);
                    }
                });
                if (bytes != null && bytes.length <= 0) {
                }
            } catch (RuntimeException e) {
                if (containsNull(cArr)) {
                    keyDatabase(sQLiteDatabaseHook, new Runnable() { // from class: net.sqlcipher.database.SQLiteDatabase.3
                        @Override // java.lang.Runnable
                        public void run() {
                            char[] cArr2 = cArr;
                            if (cArr2 != null) {
                                SQLiteDatabase.this.key_mutf8(cArr2);
                            }
                        }
                    });
                    if (bytes != null && bytes.length > 0) {
                        rekey(bytes);
                    }
                    if (bytes == null || bytes.length > 0) {
                    }
                    return;
                }
                throw e;
            }
        } catch (Throwable th) {
            dbclose();
            if (SQLiteDebug.DEBUG_SQL_CACHE) {
                this.mTimeClosed = getTime();
            }
            throw th;
        }
    }

    private boolean containsNull(char[] cArr) {
        if (cArr == null || cArr.length <= 0) {
            return false;
        }
        for (char c : cArr) {
            if (c == 0) {
                return true;
            }
        }
        return false;
    }

    private void keyDatabase(SQLiteDatabaseHook sQLiteDatabaseHook, Runnable runnable) {
        if (sQLiteDatabaseHook != null) {
            sQLiteDatabaseHook.preKey(this);
        }
        if (runnable != null) {
            runnable.run();
        }
        if (sQLiteDatabaseHook != null) {
            sQLiteDatabaseHook.postKey(this);
        }
        if (SQLiteDebug.DEBUG_SQL_CACHE) {
            this.mTimeOpened = getTime();
        }
        try {
            Cursor rawQuery = rawQuery("select count(*) from sqlite_master;", new String[0]);
            if (rawQuery == null) {
                return;
            }
            rawQuery.moveToFirst();
            rawQuery.getInt(0);
            rawQuery.close();
        } catch (RuntimeException e) {
            e.getMessage();
            throw e;
        }
    }

    private String getTime() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS ", Locale.US).format(Long.valueOf(System.currentTimeMillis()));
    }

    public boolean isReadOnly() {
        return (this.mFlags & 1) == 1;
    }

    public boolean isOpen() {
        return this.mNativeHandle != 0;
    }

    public boolean needUpgrade(int i) {
        return i > getVersion();
    }

    public final String getPath() {
        return this.mPath;
    }

    private String getPathForLogs() {
        String str = this.mPathForLogs;
        if (str != null) {
            return str;
        }
        String str2 = this.mPath;
        if (str2 == null) {
            return null;
        }
        if (str2.indexOf(64) == -1) {
            this.mPathForLogs = this.mPath;
        } else {
            this.mPathForLogs = EMAIL_IN_DB_PATTERN.matcher(this.mPath).replaceAll("XX@YY");
        }
        return this.mPathForLogs;
    }

    public void setLocale(Locale locale) {
        lock();
        try {
            native_setLocale(locale.toString(), this.mFlags);
        } finally {
            unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addToCompiledQueries(String str, SQLiteCompiledSql sQLiteCompiledSql) {
        if (this.mMaxSqlCacheSize == 0) {
            if (!SQLiteDebug.DEBUG_SQL_CACHE) {
                return;
            }
            StringBuilder sb = new StringBuilder("|NOT adding_sql_to_cache|");
            sb.append(getPath());
            sb.append("|");
            sb.append(str);
            return;
        }
        synchronized (this.mCompiledQueries) {
            if (this.mCompiledQueries.get(str) != null) {
                return;
            }
            if (this.mCompiledQueries.size() == this.mMaxSqlCacheSize) {
                int i = this.mCacheFullWarnings + 1;
                this.mCacheFullWarnings = i;
                if (i == 1) {
                    StringBuilder sb2 = new StringBuilder("Reached MAX size for compiled-sql statement cache for database ");
                    sb2.append(getPath());
                    sb2.append("; i.e., NO space for this sql statement in cache: ");
                    sb2.append(str);
                    sb2.append(". Please change your sql statements to use '?' for bindargs, instead of using actual values");
                }
            } else {
                this.mCompiledQueries.put(str, sQLiteCompiledSql);
                if (SQLiteDebug.DEBUG_SQL_CACHE) {
                    StringBuilder sb3 = new StringBuilder("|adding_sql_to_cache|");
                    sb3.append(getPath());
                    sb3.append("|");
                    sb3.append(this.mCompiledQueries.size());
                    sb3.append("|");
                    sb3.append(str);
                }
            }
        }
    }

    private void deallocCachedSqlStatements() {
        synchronized (this.mCompiledQueries) {
            for (SQLiteCompiledSql sQLiteCompiledSql : this.mCompiledQueries.values()) {
                sQLiteCompiledSql.releaseSqlStatement();
            }
            this.mCompiledQueries.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SQLiteCompiledSql getCompiledStatementForSql(String str) {
        synchronized (this.mCompiledQueries) {
            if (this.mMaxSqlCacheSize == 0) {
                if (SQLiteDebug.DEBUG_SQL_CACHE) {
                    new StringBuilder("|cache NOT found|").append(getPath());
                }
                return null;
            }
            SQLiteCompiledSql sQLiteCompiledSql = this.mCompiledQueries.get(str);
            boolean z = sQLiteCompiledSql != null;
            if (z) {
                this.mNumCacheHits++;
            } else {
                this.mNumCacheMisses++;
            }
            if (SQLiteDebug.DEBUG_SQL_CACHE) {
                StringBuilder sb = new StringBuilder("|cache_stats|");
                sb.append(getPath());
                sb.append("|");
                sb.append(this.mCompiledQueries.size());
                sb.append("|");
                sb.append(this.mNumCacheHits);
                sb.append("|");
                sb.append(this.mNumCacheMisses);
                sb.append("|");
                sb.append(z);
                sb.append("|");
                sb.append(this.mTimeOpened);
                sb.append("|");
                sb.append(this.mTimeClosed);
                sb.append("|");
                sb.append(str);
            }
            return sQLiteCompiledSql;
        }
    }

    public boolean isInCompiledSqlCache(String str) {
        boolean containsKey;
        synchronized (this.mCompiledQueries) {
            containsKey = this.mCompiledQueries.containsKey(str);
        }
        return containsKey;
    }

    public void purgeFromCompiledSqlCache(String str) {
        synchronized (this.mCompiledQueries) {
            this.mCompiledQueries.remove(str);
        }
    }

    public void resetCompiledSqlCache() {
        synchronized (this.mCompiledQueries) {
            this.mCompiledQueries.clear();
        }
    }

    public synchronized int getMaxSqlCacheSize() {
        return this.mMaxSqlCacheSize;
    }

    public synchronized void setMaxSqlCacheSize(int i) {
        if (i > 250 || i < 0) {
            throw new IllegalStateException("expected value between 0 and 250");
        }
        if (i < this.mMaxSqlCacheSize) {
            throw new IllegalStateException("cannot set cacheSize to a value less than the value set with previous setMaxSqlCacheSize() call.");
        }
        this.mMaxSqlCacheSize = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ArrayList<SQLiteDebug.DbStats> getDbStats() {
        String str;
        ArrayList<SQLiteDebug.DbStats> arrayList = new ArrayList<>();
        Iterator<SQLiteDatabase> it = getActiveDatabases().iterator();
        while (it.hasNext()) {
            SQLiteDatabase next = it.next();
            if (next != null && next.isOpen()) {
                int native_getDbLookaside = next.native_getDbLookaside();
                String path = next.getPath();
                int lastIndexOf = path.lastIndexOf("/");
                String substring = path.substring(lastIndexOf != -1 ? lastIndexOf + 1 : 0);
                ArrayList<Pair<String, String>> attachedDbs = getAttachedDbs(next);
                if (attachedDbs != null) {
                    for (int i = 0; i < attachedDbs.size(); i++) {
                        Pair<String, String> pair = attachedDbs.get(i);
                        long pragmaVal = getPragmaVal(next, ((String) pair.first) + ".page_count;");
                        if (i == 0) {
                            str = substring;
                        } else {
                            String str2 = "  (attached) " + ((String) pair.first);
                            if (((String) pair.second).trim().length() > 0) {
                                int lastIndexOf2 = ((String) pair.second).lastIndexOf("/");
                                StringBuilder sb = new StringBuilder();
                                sb.append(str2);
                                sb.append(" : ");
                                sb.append(((String) pair.second).substring(lastIndexOf2 != -1 ? lastIndexOf2 + 1 : 0));
                                str2 = sb.toString();
                            }
                            str = str2;
                            native_getDbLookaside = 0;
                        }
                        if (pragmaVal > 0) {
                            arrayList.add(new SQLiteDebug.DbStats(str, pragmaVal, next.getPageSize(), native_getDbLookaside));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private static ArrayList<SQLiteDatabase> getActiveDatabases() {
        ArrayList<SQLiteDatabase> arrayList = new ArrayList<>();
        synchronized (sActiveDatabases) {
            arrayList.addAll(sActiveDatabases.keySet());
        }
        return arrayList;
    }

    private static long getPragmaVal(SQLiteDatabase sQLiteDatabase, String str) {
        Throwable th;
        if (!sQLiteDatabase.isOpen()) {
            return 0L;
        }
        SQLiteStatement sQLiteStatement = null;
        try {
            SQLiteStatement sQLiteStatement2 = new SQLiteStatement(sQLiteDatabase, "PRAGMA ".concat(String.valueOf(str)));
            try {
                long simpleQueryForLong = sQLiteStatement2.simpleQueryForLong();
                sQLiteStatement2.close();
                return simpleQueryForLong;
            } catch (Throwable th2) {
                th = th2;
                sQLiteStatement = sQLiteStatement2;
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static ArrayList<Pair<String, String>> getAttachedDbs(SQLiteDatabase sQLiteDatabase) {
        if (!sQLiteDatabase.isOpen()) {
            return null;
        }
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        Cursor rawQuery = sQLiteDatabase.rawQuery("pragma database_list;", (String[]) null);
        while (rawQuery.moveToNext()) {
            arrayList.add(new Pair<>(rawQuery.getString(1), rawQuery.getString(2)));
        }
        rawQuery.close();
        return arrayList;
    }

    private byte[] getBytes(char[] cArr) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        ByteBuffer encode = Charset.forName(KEY_ENCODING).encode(CharBuffer.wrap(cArr));
        byte[] bArr = new byte[encode.limit()];
        encode.get(bArr);
        return bArr;
    }
}
