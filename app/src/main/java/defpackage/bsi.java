package defpackage;

/* renamed from: bsi  reason: default package */
/* loaded from: classes2.dex */
public final class bsi implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ brs b;

    public bsi(brs brsVar, long j) {
        this.b = brsVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.r().m.a(this.a);
        this.b.q().j.a("Session timeout duration set", Long.valueOf(this.a));
    }
}
