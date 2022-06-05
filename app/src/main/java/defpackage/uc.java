package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: uc  reason: default package */
/* loaded from: classes2.dex */
public final class uc {
    private static uc d;
    final tp a;
    GoogleSignInAccount b;
    GoogleSignInOptions c;

    private uc(Context context) {
        tp a = tp.a(context);
        this.a = a;
        this.b = a.a();
        this.c = this.a.b();
    }

    public static synchronized uc a(Context context) {
        uc b;
        synchronized (uc.class) {
            b = b(context.getApplicationContext());
        }
        return b;
    }

    private static synchronized uc b(Context context) {
        synchronized (uc.class) {
            uc ucVar = d;
            if (ucVar != null) {
                return ucVar;
            }
            uc ucVar2 = new uc(context);
            d = ucVar2;
            return ucVar2;
        }
    }

    public final synchronized void a() {
        tp tpVar = this.a;
        tpVar.a.lock();
        tpVar.b.edit().clear().apply();
        tpVar.a.unlock();
        this.b = null;
        this.c = null;
    }

    public final synchronized void a(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        tp tpVar = this.a;
        aat.a(googleSignInAccount);
        aat.a(googleSignInOptions);
        tpVar.a("defaultGoogleSignInAccount", googleSignInAccount.e);
        aat.a(googleSignInAccount);
        aat.a(googleSignInOptions);
        String str = googleSignInAccount.e;
        tpVar.a(tp.b("googleSignInAccount", str), googleSignInAccount.b());
        tpVar.a(tp.b("googleSignInOptions", str), googleSignInOptions.a());
        this.b = googleSignInAccount;
        this.c = googleSignInOptions;
    }
}
