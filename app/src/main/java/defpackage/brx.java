package defpackage;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: brx  reason: default package */
/* loaded from: classes2.dex */
public final class brx implements Runnable {
    private final /* synthetic */ Bundle a;
    private final /* synthetic */ brs b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public brx(brs brsVar, Bundle bundle) {
        this.b = brsVar;
        this.a = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        brs.b(this.b, this.a);
    }
}
