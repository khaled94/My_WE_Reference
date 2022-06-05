package defpackage;

import defpackage.cuc;

/* renamed from: ctz  reason: default package */
/* loaded from: classes2.dex */
public final class ctz implements cuc.a {
    public cuw a;
    public cua b;
    private a c;

    /* renamed from: ctz$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    public ctz(a aVar) {
        this.c = aVar;
        cuw cuwVar = new cuw();
        this.a = cuwVar;
        this.b = new cua(cuwVar.a(), this);
    }

    @Override // defpackage.cuc.a
    public final void a(cud cudVar) {
        this.a.b.a = cudVar;
        a aVar = this.c;
        if (aVar != null) {
            aVar.a();
        }
    }
}
