package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: tl  reason: default package */
/* loaded from: classes2.dex */
public final class tl extends ve<GoogleSignInOptions> {
    private static final up i = new up((byte) 0);
    static int a = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public tl(Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, tb.c, googleSignInOptions, (wd) new vn());
    }

    public final synchronized int c() {
        int i2;
        i2 = a;
        if (i2 == 1) {
            Context context = this.b;
            ux a2 = ux.a();
            int a3 = a2.a(context, uz.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (a3 == 0) {
                a = 4;
                i2 = 4;
            } else if (a2.a(context, a3, (String) null) != null || DynamiteModule.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                a = 2;
                i2 = 2;
            } else {
                a = 3;
                i2 = 3;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public tl(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, tb.c, googleSignInOptions, new vn());
    }

    public final Intent a() {
        Context context = this.b;
        int c = c();
        int i2 = c - 1;
        if (c != 0) {
            if (i2 == 2) {
                return ub.a(context, (GoogleSignInOptions) this.c);
            }
            if (i2 == 3) {
                return ub.c(context, (GoogleSignInOptions) this.c);
            }
            return ub.b(context, (GoogleSignInOptions) this.c);
        }
        throw null;
    }

    public final bwl<Void> b() {
        return aas.a(ub.b(this.g, this.b, c() == 3));
    }
}
