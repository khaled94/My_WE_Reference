package defpackage;

import defpackage.fe;

/* renamed from: fd  reason: default package */
/* loaded from: classes2.dex */
public final class fd extends lc<ck, ee<?>> implements fe {
    private fe.a a;

    @Override // defpackage.lc
    public final /* synthetic */ int a(ee<?> eeVar) {
        ee<?> eeVar2 = eeVar;
        if (eeVar2 == null) {
            return super.a((fd) null);
        }
        return eeVar2.c();
    }

    @Override // defpackage.fe
    public final /* synthetic */ ee a(ck ckVar) {
        return (ee) super.c(ckVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.fe
    public final /* synthetic */ ee a(ck ckVar, ee eeVar) {
        return (ee) super.b(ckVar, eeVar);
    }

    @Override // defpackage.lc
    public final /* synthetic */ void a(ck ckVar, ee<?> eeVar) {
        ee<?> eeVar2 = eeVar;
        fe.a aVar = this.a;
        if (aVar == null || eeVar2 == null) {
            return;
        }
        aVar.b(eeVar2);
    }

    public fd(long j) {
        super(j);
    }

    @Override // defpackage.fe
    public final void a(fe.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.fe
    public final void a(int i) {
        if (i >= 40) {
            a();
        } else if (i < 20 && i != 15) {
        } else {
            a(b() / 2);
        }
    }
}
