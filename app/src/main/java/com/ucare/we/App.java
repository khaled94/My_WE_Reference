package com.ucare.we;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.os.Build;
import dagger.ObjectGraph;
import defpackage.djo;
import java.util.Arrays;
import javax.inject.Inject;
import net.sqlcipher.Cursor;
import net.sqlcipher.database.SQLiteDatabase;

/* loaded from: classes2.dex */
public class App extends Application {
    public static App a;
    static Context b;
    String c;
    @Inject
    djb d;
    @Inject
    djw e;
    @Inject
    cxk f;
    private ObjectGraph g;

    public App() {
        a = this;
    }

    public static Context a() {
        return b;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        b = getApplicationContext();
        new djo(new djo.a(this));
        dad a2 = dad.a();
        a2.a = a2.a.plus(Arrays.asList(new czx(this)).toArray());
        ObjectGraph objectGraph = a2.a;
        this.g = objectGraph;
        objectGraph.inject(this);
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel("NOTIFICATION_ID", "NOTIFICATION", 4));
        }
        this.d.a();
        SQLiteDatabase.loadLibs(this);
        SQLiteDatabase writableDatabase = cwe.a(this).getWritableDatabase(djv.a("dbPassword", ""));
        ContentValues contentValues = new ContentValues();
        Cursor rawQuery = writableDatabase.rawQuery("SELECT * FROM 'keys';", (String[]) null);
        contentValues.put("key_id", (Integer) 1);
        contentValues.put("key_value_enc_iv", "000102030405060708090a0b0c0d0e0f");
        contentValues.put("key_value_enc_key", "0f0e0d0c0b0a09080706050403020100");
        if (rawQuery.getCount() > 1) {
            writableDatabase.delete("keys", "key_id=1", null);
        }
        writableDatabase.insert("keys", null, contentValues);
        rawQuery.close();
        writableDatabase.close();
        String g = this.d.g();
        this.c = g;
        djb.a(b, g);
        djb djbVar = this.d;
        if (djbVar.c.b("").length() == 0) {
            djbVar.c.c(djbVar.b.getLanguage());
        }
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
