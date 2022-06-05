package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"kotlinx/coroutines/BuildersKt__BuildersKt", "kotlinx/coroutines/BuildersKt__Builders_commonKt"}, k = 4, mv = {1, 5, 1}, xi = 48)
/* renamed from: dta */
/* loaded from: classes2.dex */
public final class dta {
    public static /* synthetic */ dvi a(duc ducVar, dnw dnwVar, dph dphVar, int i) {
        return dtb.a(ducVar, dnwVar, null, dphVar, i);
    }

    public static final dvi a(duc ducVar, dnw dnwVar, due dueVar, dph<? super duc, ? super dnu<? super dmg>, ? extends Object> dphVar) {
        dvq dvqVar;
        dnw a = dtw.a(ducVar, dnwVar);
        if (dueVar.isLazy()) {
            dvqVar = new dvq(a, dphVar);
        } else {
            dvqVar = new dvy(a, true);
        }
        dvqVar.a(dueVar, (due) dvqVar, (dph<? super due, ? super dnu<? super T>, ? extends Object>) dphVar);
        return dvqVar;
    }
}
