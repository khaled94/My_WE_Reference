package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: bwp  reason: default package */
/* loaded from: classes2.dex */
public final class bwp implements bwq {
    public final CountDownLatch a = new CountDownLatch(1);

    private bwp() {
    }

    @Override // defpackage.bwg
    public final void a() {
        this.a.countDown();
    }

    @Override // defpackage.bwi
    public final void a(Exception exc) {
        this.a.countDown();
    }

    @Override // defpackage.bwj
    public final void a(Object obj) {
        this.a.countDown();
    }

    public /* synthetic */ bwp(byte b) {
    }
}
