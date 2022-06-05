package defpackage;

import java.util.ArrayList;

/* renamed from: btw  reason: default package */
/* loaded from: classes2.dex */
final class btw implements Runnable {
    private final /* synthetic */ buj a;
    private final /* synthetic */ Runnable b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public btw(buj bujVar, Runnable runnable) {
        this.a = bujVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.k();
        buj bujVar = this.a;
        Runnable runnable = this.b;
        bujVar.g();
        if (bujVar.c == null) {
            bujVar.c = new ArrayList();
        }
        bujVar.c.add(runnable);
        this.a.i();
    }
}
