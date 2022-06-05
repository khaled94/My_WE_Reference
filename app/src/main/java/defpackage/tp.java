package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* renamed from: tp  reason: default package */
/* loaded from: classes2.dex */
public final class tp {
    private static final Lock c = new ReentrantLock();
    private static tp d;
    final Lock a = new ReentrantLock();
    final SharedPreferences b;

    private tp(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static tp a(Context context) {
        aat.a(context);
        c.lock();
        try {
            if (d == null) {
                d = new tp(context.getApplicationContext());
            }
            return d;
        } finally {
            c.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String b(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    public final GoogleSignInAccount a() {
        String a;
        String a2 = a("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(a2) && (a = a(b("googleSignInAccount", a2))) != null) {
            try {
                return GoogleSignInAccount.a(a);
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a(String str) {
        this.a.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            this.a.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, String str2) {
        this.a.lock();
        try {
            this.b.edit().putString(str, str2).apply();
        } finally {
            this.a.unlock();
        }
    }

    public final GoogleSignInOptions b() {
        String a;
        String a2 = a("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(a2) && (a = a(b("googleSignInOptions", a2))) != null) {
            try {
                return GoogleSignInOptions.a(a);
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }
}
