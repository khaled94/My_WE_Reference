package net.sqlcipher;

import java.io.File;
import net.sqlcipher.database.SQLiteDatabase;

/* loaded from: classes2.dex */
public final class DefaultDatabaseErrorHandler implements DatabaseErrorHandler {
    private final String TAG = getClass().getSimpleName();

    @Override // net.sqlcipher.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        new StringBuilder("Corruption reported by sqlite on database, deleting: ").append(sQLiteDatabase.getPath());
        if (sQLiteDatabase.isOpen()) {
            try {
                sQLiteDatabase.close();
            } catch (Exception unused) {
            }
        }
        deleteDatabaseFile(sQLiteDatabase.getPath());
    }

    private void deleteDatabaseFile(String str) {
        if (str.equalsIgnoreCase(SQLiteDatabase.MEMORY) || str.trim().length() == 0) {
            return;
        }
        try {
            new File(str).delete();
        } catch (Exception e) {
            new StringBuilder("delete failed: ").append(e.getMessage());
        }
    }
}
