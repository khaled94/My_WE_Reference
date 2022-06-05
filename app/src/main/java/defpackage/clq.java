package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;

/* renamed from: clq  reason: default package */
/* loaded from: classes2.dex */
public final class clq implements cjq, clc {
    private final /* synthetic */ FirebaseAuth a;

    public clq(FirebaseAuth firebaseAuth) {
        this.a = firebaseAuth;
    }

    @Override // defpackage.cjq
    public final void a(alf alfVar, chm chmVar) {
        this.a.a(chmVar, alfVar, true);
    }

    @Override // defpackage.clc
    public final void a(Status status) {
        int i = status.i;
        if (i == 17011 || i == 17021 || i == 17005) {
            this.a.a();
        }
    }
}
