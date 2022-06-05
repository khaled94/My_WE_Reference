package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bpd  reason: default package */
/* loaded from: classes2.dex */
public final class bpd extends SQLiteOpenHelper {
    private final /* synthetic */ bpe a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpd(bpe bpeVar, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.a = bpeVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            this.a.q().c.a("Opening the local database failed, dropping and recreating it");
            if (!this.a.m().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.a.q().c.a("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.a.q().c.a("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (Build.VERSION.SDK_INT < 15) {
            Cursor cursor = null;
            try {
                cursor = sQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
                cursor.moveToFirst();
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        blb.a(this.a.q(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        blb.a(this.a.q(), sQLiteDatabase);
    }
}
