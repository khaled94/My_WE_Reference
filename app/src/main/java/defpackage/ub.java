package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Status;

/* renamed from: ub  reason: default package */
/* loaded from: classes2.dex */
public final class ub {
    private static final adj a = new adj("GoogleSignInCommon", new String[0]);

    public static Intent a(Context context, GoogleSignInOptions googleSignInOptions) {
        a.b("getFallbackSignInIntent()", new Object[0]);
        Intent c = c(context, googleSignInOptions);
        c.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return c;
    }

    public static tm a(Intent intent) {
        if (intent == null) {
            return new tm(null, Status.c);
        }
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        if (googleSignInAccount == null) {
            if (status == null) {
                status = Status.c;
            }
            return new tm(null, status);
        }
        return new tm(googleSignInAccount, Status.a);
    }

    public static vg a(vf vfVar, Context context, boolean z) {
        a.b("Revoking access", new Object[0]);
        String a2 = tp.a(context).a("refreshToken");
        a(context);
        if (z) {
            return ts.a(a2);
        }
        return vfVar.b((vf) new tz(vfVar));
    }

    private static void a(Context context) {
        uc.a(context).a();
        for (vf vfVar : vf.b()) {
            vfVar.e();
        }
        vs.a();
    }

    public static Intent b(Context context, GoogleSignInOptions googleSignInOptions) {
        a.b("getNoImplementationSignInIntent()", new Object[0]);
        Intent c = c(context, googleSignInOptions);
        c.setAction("com.google.android.gms.auth.NO_IMPL");
        return c;
    }

    public static vg b(vf vfVar, Context context, boolean z) {
        a.b("Signing out", new Object[0]);
        a(context);
        if (z) {
            Status status = Status.a;
            aat.a(status, "Result must not be null");
            we weVar = new we(vfVar);
            weVar.a((we) status);
            return weVar;
        }
        return vfVar.b((vf) new tx(vfVar));
    }

    public static Intent c(Context context, GoogleSignInOptions googleSignInOptions) {
        a.b("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }
}
