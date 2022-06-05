package defpackage;

import com.google.android.gms.common.api.Scope;
import defpackage.vc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wv  reason: default package */
/* loaded from: classes2.dex */
public final class wv extends wz {
    final /* synthetic */ xa a;
    private final ArrayList<vc.f> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv(xa xaVar, ArrayList<vc.f> arrayList) {
        super(xaVar);
        this.a = xaVar;
        this.c = arrayList;
    }

    @Override // defpackage.wz
    public final void a() {
        Set<Scope> set;
        xa xaVar = this.a;
        xf xfVar = xaVar.a.m;
        aaf aafVar = xaVar.k;
        if (aafVar == null) {
            set = Collections.emptySet();
        } else {
            HashSet hashSet = new HashSet(aafVar.b);
            Map<vc<?>, abm> map = xaVar.k.d;
            for (vc<?> vcVar : map.keySet()) {
                if (!xaVar.a.g.containsKey(vcVar.b)) {
                    hashSet.addAll(map.get(vcVar).a);
                }
            }
            set = hashSet;
        }
        xfVar.d = set;
        ArrayList<vc.f> arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            xa xaVar2 = this.a;
            arrayList.get(i).a(xaVar2.h, xaVar2.a.m.d);
        }
    }
}
