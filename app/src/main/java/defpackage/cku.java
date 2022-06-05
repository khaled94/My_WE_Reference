package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: cku  reason: default package */
/* loaded from: classes2.dex */
public final class cku extends clu {
    private final ckq a;

    public cku(ckq ckqVar) {
        aat.a(ckqVar);
        this.a = ckqVar;
    }

    @Override // defpackage.clu
    public final List<clw> a() {
        ckq ckqVar = this.a;
        if (ckqVar.f != null) {
            cjx cjxVar = ckqVar.f;
            ArrayList arrayList = new ArrayList();
            for (clf clfVar : cjxVar.a) {
                arrayList.add(clfVar);
            }
            return arrayList;
        }
        return ajw.f();
    }
}
