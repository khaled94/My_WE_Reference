package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bsy  reason: default package */
/* loaded from: classes2.dex */
public final class bsy implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ buq b;
    private final /* synthetic */ bva c;
    private final /* synthetic */ bsx d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bsy(bsx bsxVar, boolean z, buq buqVar, bva bvaVar) {
        this.d = bsxVar;
        this.a = z;
        this.b = buqVar;
        this.c = bvaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boz bozVar = this.d.b;
        if (bozVar == null) {
            this.d.q().c.a("Discarding data. Failed to set user attribute");
            return;
        }
        this.d.a(bozVar, this.a ? null : this.b, this.c);
        this.d.z();
    }
}
