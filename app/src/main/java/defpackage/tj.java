package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: tj  reason: default package */
/* loaded from: classes2.dex */
public final class tj {
    private tj() {
    }

    public static bwl<GoogleSignInAccount> a(Intent intent) {
        tm a = ub.a(intent);
        GoogleSignInAccount googleSignInAccount = a.a;
        if (!a.a().c() || googleSignInAccount == null) {
            return bwo.a((Exception) aac.a(a.a()));
        }
        return bwo.a(googleSignInAccount);
    }

    public static tl a(Activity activity, GoogleSignInOptions googleSignInOptions) {
        return new tl(activity, (GoogleSignInOptions) aat.a(googleSignInOptions));
    }

    public static tl a(Context context, GoogleSignInOptions googleSignInOptions) {
        return new tl(context, (GoogleSignInOptions) aat.a(googleSignInOptions));
    }
}
