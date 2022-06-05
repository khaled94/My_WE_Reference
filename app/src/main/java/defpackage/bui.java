package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bui  reason: default package */
/* loaded from: classes2.dex */
public final class bui extends bla {
    private final /* synthetic */ buj a;
    private final /* synthetic */ buf b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bui(buf bufVar, brk brkVar, buj bujVar) {
        super(brkVar);
        this.b = bufVar;
        this.a = bujVar;
    }

    @Override // defpackage.bla
    public final void a() {
        this.b.e();
        this.b.q().k.a("Starting upload from DelayedRunnable");
        this.a.i();
    }
}
