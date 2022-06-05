package defpackage;

import android.content.Context;
import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteOpenHelper;

/* renamed from: cwe  reason: default package */
/* loaded from: classes2.dex */
public final class cwe extends SQLiteOpenHelper {
    private static cwe a;

    private cwe(Context context) {
        super(context, "FeedReader.db", null, 1);
        djv.b("dbPassword", "somePass");
    }

    public static synchronized cwe a(Context context) {
        cwe cweVar;
        synchronized (cwe.class) {
            if (a == null) {
                a = new cwe(context);
            }
            cweVar = a;
        }
        return cweVar;
    }

    @Override // net.sqlcipher.database.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE keys (_id INTEGER PRIMARY KEY,key_id TEXT,key_value_enc_iv TEXT,key_value_enc_key TEXT )");
    }

    @Override // net.sqlcipher.database.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS keys");
        onCreate(sQLiteDatabase);
    }
}
