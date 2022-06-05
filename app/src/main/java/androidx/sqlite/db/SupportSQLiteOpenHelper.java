package androidx.sqlite.db;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.List;
import net.sqlcipher.database.SQLiteDatabase;

/* loaded from: classes.dex */
public interface SupportSQLiteOpenHelper {

    /* loaded from: classes.dex */
    public interface Factory {
        SupportSQLiteOpenHelper create(Configuration configuration);
    }

    void close();

    String getDatabaseName();

    SupportSQLiteDatabase getReadableDatabase();

    SupportSQLiteDatabase getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);

    /* loaded from: classes.dex */
    public static abstract class Callback {
        private static final String TAG = "SupportSQLite";
        public final int version;

        public void onConfigure(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        public abstract void onCreate(SupportSQLiteDatabase supportSQLiteDatabase);

        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        public abstract void onUpgrade(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2);

        public Callback(int i) {
            this.version = i;
        }

        public void onDowngrade(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
            throw new SQLiteException("Can't downgrade database from version " + i + " to " + i2);
        }

        public void onCorruption(SupportSQLiteDatabase supportSQLiteDatabase) {
            new StringBuilder("Corruption reported by sqlite on database: ").append(supportSQLiteDatabase.getPath());
            if (!supportSQLiteDatabase.isOpen()) {
                deleteDatabaseFile(supportSQLiteDatabase.getPath());
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = supportSQLiteDatabase.getAttachedDbs();
                } finally {
                    if (list != null) {
                        for (Pair<String, String> next : list) {
                            deleteDatabaseFile((String) next.second);
                        }
                    } else {
                        deleteDatabaseFile(supportSQLiteDatabase.getPath());
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                supportSQLiteDatabase.close();
            } catch (IOException unused2) {
            }
        }

        private void deleteDatabaseFile(String str) {
            if (!str.equalsIgnoreCase(SQLiteDatabase.MEMORY) && str.trim().length() != 0) {
                try {
                    if (Build.VERSION.SDK_INT >= 16) {
                        android.database.sqlite.SQLiteDatabase.deleteDatabase(new File(str));
                        return;
                    }
                    new File(str).delete();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class Configuration {
        public final Callback callback;
        public final Context context;
        public final String name;

        Configuration(Context context, String str, Callback callback) {
            this.context = context;
            this.name = str;
            this.callback = callback;
        }

        public static Builder builder(Context context) {
            return new Builder(context);
        }

        /* loaded from: classes.dex */
        public static class Builder {
            Callback mCallback;
            Context mContext;
            String mName;

            public Configuration build() {
                Callback callback = this.mCallback;
                if (callback == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                Context context = this.mContext;
                if (context == null) {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                return new Configuration(context, this.mName, callback);
            }

            Builder(Context context) {
                this.mContext = context;
            }

            public Builder name(String str) {
                this.mName = str;
                return this;
            }

            public Builder callback(Callback callback) {
                this.mCallback = callback;
                return this;
            }
        }
    }
}
