package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: cnt  reason: default package */
/* loaded from: classes2.dex */
public final class cnt {
    private final SharedPreferences a;
    private final Context b;
    private final cot c;
    private final Map<String, cmy> d;

    public cnt(Context context) {
        this(context, new cot());
    }

    private cnt(Context context, cot cotVar) {
        this.d = new ArrayMap();
        this.b = context;
        this.a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.c = cotVar;
        File file = new File(ContextCompat.getNoBackupFilesDir(this.b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (!file.createNewFile() || c()) {
                    return;
                }
                b();
                FirebaseInstanceId.a().h();
            } catch (IOException e) {
                if (!Log.isLoggable("FirebaseInstanceId", 3)) {
                    return;
                }
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    "Error creating file in no backup dir: ".concat(valueOf);
                } else {
                    new String("Error creating file in no backup dir: ");
                }
            }
        }
    }

    public final synchronized String a() {
        return this.a.getString("topic_operaion_queue", "");
    }

    public final synchronized void a(String str) {
        this.a.edit().putString("topic_operaion_queue", str).apply();
    }

    private final synchronized boolean c() {
        return this.a.getAll().isEmpty();
    }

    private static String b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    public final synchronized void b() {
        File[] listFiles;
        this.d.clear();
        for (File file : cot.a(this.b).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
        this.a.edit().clear().commit();
    }

    public final synchronized cns a(String str, String str2, String str3) {
        return cns.a(this.a.getString(b(str, str2, str3), null));
    }

    public final synchronized void a(String str, String str2, String str3, String str4, String str5) {
        String a = cns.a(str4, str5, System.currentTimeMillis());
        if (a == null) {
            return;
        }
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(b(str, str2, str3), a);
        edit.commit();
    }

    public final synchronized cmy b(String str) {
        cmy cmyVar;
        cmy cmyVar2 = this.d.get(str);
        if (cmyVar2 != null) {
            return cmyVar2;
        }
        try {
            Context context = this.b;
            cmyVar = cot.b(context, str);
            if (cmyVar == null) {
                cmyVar = cot.a(context, str);
            }
        } catch (cov unused) {
            FirebaseInstanceId.a().h();
            cmyVar = cot.a(this.b, str);
        }
        this.d.put(str, cmyVar);
        return cmyVar;
    }

    public final synchronized void c(String str) {
        String concat = String.valueOf(str).concat("|T|");
        SharedPreferences.Editor edit = this.a.edit();
        for (String str2 : this.a.getAll().keySet()) {
            if (str2.startsWith(concat)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }
}
