package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.gms.common.api.Status;

/* renamed from: cjz  reason: default package */
/* loaded from: classes2.dex */
public final class cjz {
    private static long c = 3600000;
    private static final ajw<String> d = ajw.a("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");
    private static final cjz e = new cjz();
    public bwl<chi> a;
    public long b = 0;

    private cjz() {
    }

    public static cjz a() {
        return e;
    }

    public static void a(Context context, alr alrVar, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        byte[] a = abe.a(alrVar);
        edit.putString("verifyAssertionRequest", a == null ? null : Base64.encodeToString(a, 10));
        edit.putString("operation", str);
        edit.putString("tenantId", str2);
        edit.putLong("timestamp", aea.d().a());
        edit.commit();
    }

    public static void a(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.i);
        edit.putString("statusMessage", status.j);
        edit.putLong("timestamp", aea.d().a());
        edit.commit();
    }

    public final void a(Context context) {
        aat.a(context);
        a(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        this.a = null;
        this.b = 0L;
    }

    public static void a(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        ajw<String> ajwVar = d;
        int size = ajwVar.size();
        int i = 0;
        while (i < size) {
            String str = ajwVar.get(i);
            i++;
            edit.remove(str);
        }
        edit.commit();
    }
}
