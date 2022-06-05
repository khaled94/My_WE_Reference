package defpackage;

import com.google.firebase.auth.internal.FederatedSignInActivity;

/* renamed from: cjs  reason: default package */
/* loaded from: classes2.dex */
public final class cjs implements Runnable {
    private final /* synthetic */ FederatedSignInActivity a;

    public cjs(FederatedSignInActivity federatedSignInActivity) {
        this.a = federatedSignInActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b();
        Runnable unused = FederatedSignInActivity.e = null;
    }
}
