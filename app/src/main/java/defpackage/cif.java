package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: cif  reason: default package */
/* loaded from: classes2.dex */
public final class cif extends chx {
    private final Context a;
    private final cjd b;
    private final Future<chz<cjd>> c = a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public cif(Context context, cjd cjdVar) {
        this.a = context;
        this.b = cjdVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.chx
    public final Future<chz<cjd>> a() {
        Future<chz<cjd>> future = this.c;
        if (future != null) {
            return future;
        }
        cis cisVar = new cis(this.b, this.a);
        alu a = alm.a();
        int i = alz.a;
        return a.a().submit(cisVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ckq a(cgw cgwVar, ald aldVar) {
        aat.a(cgwVar);
        aat.a(aldVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ckm(aldVar, "firebase"));
        List<ali> list = aldVar.f.a;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(new ckm(list.get(i)));
            }
        }
        ckq ckqVar = new ckq(cgwVar, arrayList);
        ckqVar.c = new cks(aldVar.i, aldVar.h);
        ckqVar.d = aldVar.j;
        ckqVar.e = aldVar.k;
        ckqVar.b(cjy.a(aldVar.l));
        return ckqVar;
    }

    public final <ResultT> bwl<ResultT> a(bwl<ResultT> bwlVar, cid<ciu, ResultT> cidVar) {
        return (bwl<ResultT>) bwlVar.a(new cie(this, cidVar));
    }
}
