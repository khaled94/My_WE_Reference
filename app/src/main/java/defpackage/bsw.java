package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bsw  reason: default package */
/* loaded from: classes2.dex */
public final class bsw extends bla {
    private final /* synthetic */ bsx a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsw(bsx bsxVar, brk brkVar) {
        super(brkVar);
        this.a = bsxVar;
    }

    @Override // defpackage.bla
    public final void a() {
        bsx bsxVar = this.a;
        bsxVar.c();
        if (bsxVar.v()) {
            bsxVar.q().k.a("Inactivity, disconnecting from the service");
            bsxVar.F();
        }
    }
}
