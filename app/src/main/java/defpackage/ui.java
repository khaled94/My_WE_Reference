package defpackage;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: ui  reason: default package */
/* loaded from: classes2.dex */
public final class ui extends ud {
    private final Context a;

    public ui(Context context) {
        this.a = context;
    }

    private final void c() {
        if (aeh.a(this.a, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(52);
        sb.append("Calling UID ");
        sb.append(callingUid);
        sb.append(" is not Google Play services.");
        throw new SecurityException(sb.toString());
    }

    @Override // defpackage.ue
    public final void a() {
        c();
        uc.a(this.a).a();
    }

    @Override // defpackage.ue
    public final void b() {
        c();
        tp a = tp.a(this.a);
        GoogleSignInAccount a2 = a.a();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.a;
        if (a2 != null) {
            googleSignInOptions = a.b();
        }
        tl a3 = tj.a(this.a, googleSignInOptions);
        if (a2 == null) {
            a3.b();
        } else {
            aas.a(ub.a(a3.g, a3.b, a3.c() == 3));
        }
    }
}
