package defpackage;

import com.google.android.gms.common.ConnectionResult;
import defpackage.vc;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: wu  reason: default package */
/* loaded from: classes2.dex */
final class wu extends wz {
    final /* synthetic */ xa a;
    private final Map<vc.f, wr> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu(xa xaVar, Map<vc.f, wr> map) {
        super(xaVar);
        this.a = xaVar;
        this.c = map;
    }

    @Override // defpackage.wz
    public final void a() {
        abw abwVar = new abw(this.a.d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (vc.f fVar : this.c.keySet()) {
            if (!fVar.l() || this.c.get(fVar).a) {
                arrayList2.add(fVar);
            } else {
                arrayList.add(fVar);
            }
        }
        int i = -1;
        int i2 = 0;
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            while (i2 < size) {
                i = abwVar.a(this.a.c, (vc.f) arrayList2.get(i2));
                i2++;
                if (i == 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList.size();
            while (i2 < size2) {
                i = abwVar.a(this.a.c, (vc.f) arrayList.get(i2));
                i2++;
                if (i != 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            ConnectionResult connectionResult = new ConnectionResult(i, null);
            xa xaVar = this.a;
            xaVar.a.a(new ws(this, xaVar, connectionResult));
            return;
        }
        xa xaVar2 = this.a;
        if (xaVar2.f && xaVar2.e != null) {
            xaVar2.e.B();
        }
        for (vc.f fVar2 : this.c.keySet()) {
            wr wrVar = this.c.get(fVar2);
            if (!fVar2.l() || abwVar.a(this.a.c, fVar2) == 0) {
                fVar2.a(wrVar);
            } else {
                xa xaVar3 = this.a;
                xaVar3.a.a(new wt(xaVar3, wrVar));
            }
        }
    }
}
