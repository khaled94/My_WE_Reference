package defpackage;

import defpackage.eat;
import java.io.IOException;

/* renamed from: ebr  reason: default package */
/* loaded from: classes2.dex */
public final class ebr implements eat {
    public final eaw a;

    public ebr(eaw eawVar) {
        this.a = eawVar;
    }

    @Override // defpackage.eat
    public final ebc a(eat.a aVar) throws IOException {
        ecg ecgVar = (ecg) aVar;
        eba ebaVar = ecgVar.c;
        ebz ebzVar = ecgVar.a;
        return ecgVar.a(ebaVar, ebzVar, ebzVar.a(aVar, !ebaVar.b.equals("GET")));
    }
}
