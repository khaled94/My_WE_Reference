package defpackage;

import com.google.android.gms.common.api.UnsupportedApiCallException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cie  reason: default package */
/* loaded from: classes2.dex */
public final class cie implements bwf<ResultT, bwl<ResultT>> {
    private final /* synthetic */ cid a;
    private final /* synthetic */ cif b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cie(cif cifVar, cid cidVar) {
        this.b = cifVar;
        this.a = cidVar;
    }

    @Override // defpackage.bwf
    public final /* synthetic */ Object a(bwl bwlVar) throws Exception {
        return bwlVar.a() instanceof UnsupportedApiCallException ? this.b.a(this.a.c()) : bwlVar;
    }
}
