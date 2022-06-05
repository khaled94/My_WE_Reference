package defpackage;

/* renamed from: bsj  reason: default package */
/* loaded from: classes2.dex */
public final class bsj implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ brs b;

    public bsj(brs brsVar, long j) {
        this.b = brsVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.r().l.a(this.a);
        this.b.q().j.a("Minimum session duration set", Long.valueOf(this.a));
    }
}
