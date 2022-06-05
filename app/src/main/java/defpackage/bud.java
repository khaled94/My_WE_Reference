package defpackage;

/* renamed from: bud  reason: default package */
/* loaded from: classes2.dex */
final class bud implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ bty b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bud(bty btyVar, long j) {
        this.b = btyVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bty btyVar = this.b;
        long j = this.a;
        btyVar.c();
        btyVar.v();
        if (btyVar.s().d(btyVar.f().v(), blk.ab)) {
            btyVar.r().u.a(true);
        }
        btyVar.c.c();
        btyVar.d.c();
        btyVar.q().k.a("Activity paused, time", Long.valueOf(j));
        if (btyVar.a != 0) {
            btyVar.r().s.a(btyVar.r().s.a() + (j - btyVar.a));
        }
    }
}
