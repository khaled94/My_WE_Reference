package net.sqlcipher.database;

import android.content.Context;
import java.io.File;
import net.sqlcipher.DatabaseErrorHandler;
import net.sqlcipher.DefaultDatabaseErrorHandler;
import net.sqlcipher.database.SQLiteDatabase;

/* loaded from: classes2.dex */
public abstract class SQLiteOpenHelper {
    private static final String TAG = SQLiteOpenHelper.class.getSimpleName();
    private final Context mContext;
    private SQLiteDatabase mDatabase;
    private final DatabaseErrorHandler mErrorHandler;
    private final SQLiteDatabase.CursorFactory mFactory;
    private final SQLiteDatabaseHook mHook;
    private boolean mIsInitializing;
    private final String mName;
    private final int mNewVersion;

    public abstract void onCreate(SQLiteDatabase sQLiteDatabase);

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2);

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        this(context, str, cursorFactory, i, null, new DefaultDatabaseErrorHandler());
    }

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook) {
        this(context, str, cursorFactory, i, sQLiteDatabaseHook, new DefaultDatabaseErrorHandler());
    }

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        this.mDatabase = null;
        this.mIsInitializing = false;
        if (i > 0) {
            if (databaseErrorHandler == null) {
                throw new IllegalArgumentException("DatabaseErrorHandler param value can't be null.");
            }
            this.mContext = context;
            this.mName = str;
            this.mFactory = cursorFactory;
            this.mNewVersion = i;
            this.mHook = sQLiteDatabaseHook;
            this.mErrorHandler = databaseErrorHandler;
            return;
        }
        throw new IllegalArgumentException("Version must be >= 1, was ".concat(String.valueOf(i)));
    }

    public synchronized SQLiteDatabase getWritableDatabase(String str) {
        return getWritableDatabase(str == null ? null : str.toCharArray());
    }

    /* JADX WARN: Finally extract failed */
    public synchronized SQLiteDatabase getWritableDatabase(char[] cArr) {
        SQLiteDatabase openOrCreateDatabase;
        if (this.mDatabase != null && this.mDatabase.isOpen() && !this.mDatabase.isReadOnly()) {
            return this.mDatabase;
        } else if (this.mIsInitializing) {
            throw new IllegalStateException("getWritableDatabase called recursively");
        } else {
            if (this.mDatabase != null) {
                this.mDatabase.lock();
            }
            this.mIsInitializing = true;
            if (this.mName == null) {
                openOrCreateDatabase = SQLiteDatabase.create((SQLiteDatabase.CursorFactory) null, cArr);
            } else {
                String path = this.mContext.getDatabasePath(this.mName).getPath();
                File file = new File(path);
                if (!file.exists()) {
                    file.getParentFile().mkdirs();
                }
                openOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(path, cArr, this.mFactory, this.mHook, this.mErrorHandler);
            }
            SQLiteDatabase sQLiteDatabase = openOrCreateDatabase;
            int version = sQLiteDatabase.getVersion();
            if (version != this.mNewVersion) {
                sQLiteDatabase.beginTransaction();
                try {
                    if (version == 0) {
                        onCreate(sQLiteDatabase);
                    } else {
                        onUpgrade(sQLiteDatabase, version, this.mNewVersion);
                    }
                    sQLiteDatabase.setVersion(this.mNewVersion);
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                } catch (Throwable th) {
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            }
            onOpen(sQLiteDatabase);
            this.mIsInitializing = false;
            if (this.mDatabase != null) {
                try {
                    this.mDatabase.close();
                } catch (Exception unused) {
                }
                this.mDatabase.unlock();
            }
            this.mDatabase = sQLiteDatabase;
            return sQLiteDatabase;
        }
    }

    public synchronized SQLiteDatabase getReadableDatabase(String str) {
        return getReadableDatabase(str == null ? null : str.toCharArray());
    }

    public synchronized SQLiteDatabase getReadableDatabase(char[] cArr) {
        if (this.mDatabase != null && this.mDatabase.isOpen()) {
            return this.mDatabase;
        } else if (this.mIsInitializing) {
            throw new IllegalStateException("getReadableDatabase called recursively");
        } else {
            try {
                return getWritableDatabase(cArr);
            } catch (SQLiteException e) {
                if (this.mName == null) {
                    throw e;
                }
                StringBuilder sb = new StringBuilder("Couldn't open ");
                sb.append(this.mName);
                sb.append(" for writing (will try read-only):");
                this.mIsInitializing = true;
                String path = this.mContext.getDatabasePath(this.mName).getPath();
                File file = new File(path);
                File file2 = new File(this.mContext.getDatabasePath(this.mName).getParent());
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                if (!file.exists()) {
                    this.mIsInitializing = false;
                    SQLiteDatabase writableDatabase = getWritableDatabase(cArr);
                    this.mIsInitializing = true;
                    writableDatabase.close();
                }
                SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(path, cArr, this.mFactory, 1);
                if (openDatabase.getVersion() != this.mNewVersion) {
                    throw new SQLiteException("Can't upgrade read-only database from version " + openDatabase.getVersion() + " to " + this.mNewVersion + ": " + path);
                }
                onOpen(openDatabase);
                StringBuilder sb2 = new StringBuilder("Opened ");
                sb2.append(this.mName);
                sb2.append(" in read-only mode");
                this.mDatabase = openDatabase;
                this.mIsInitializing = false;
                if (openDatabase != null && openDatabase != openDatabase) {
                    openDatabase.close();
                }
                return openDatabase;
            }
        }
    }

    public synchronized void close() {
        if (this.mIsInitializing) {
            throw new IllegalStateException("Closed during initialization");
        }
        if (this.mDatabase != null && this.mDatabase.isOpen()) {
            this.mDatabase.close();
            this.mDatabase = null;
        }
    }
}
