package defpackage;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bry  reason: default package */
/* loaded from: classes2.dex */
public final class bry implements Runnable {
    private final /* synthetic */ Bundle a;
    private final /* synthetic */ brs b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bry(brs brsVar, Bundle bundle) {
        this.b = brsVar;
        this.a = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        brs.a(this.b, this.a);
    }
}
