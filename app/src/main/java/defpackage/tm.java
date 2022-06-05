package defpackage;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: tm  reason: default package */
/* loaded from: classes2.dex */
public final class tm implements vi {
    GoogleSignInAccount a;
    private Status b;

    public tm(GoogleSignInAccount googleSignInAccount, Status status) {
        this.a = googleSignInAccount;
        this.b = status;
    }

    @Override // defpackage.vi
    public final Status a() {
        return this.b;
    }
}
