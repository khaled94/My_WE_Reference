package defpackage;

/* renamed from: bpk  reason: default package */
/* loaded from: classes2.dex */
public final class bpk {
    private final int a;
    private final boolean b;
    private final boolean c;
    private final /* synthetic */ bpi d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bpk(bpi bpiVar, int i, boolean z, boolean z2) {
        this.d = bpiVar;
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final void a(String str) {
        this.d.a(this.a, this.b, this.c, str, null, null, null);
    }

    public final void a(String str, Object obj) {
        this.d.a(this.a, this.b, this.c, str, obj, null, null);
    }

    public final void a(String str, Object obj, Object obj2) {
        this.d.a(this.a, this.b, this.c, str, obj, obj2, null);
    }

    public final void a(String str, Object obj, Object obj2, Object obj3) {
        this.d.a(this.a, this.b, this.c, str, obj, obj2, obj3);
    }
}
