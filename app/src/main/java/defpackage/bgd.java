package defpackage;

import java.util.Comparator;

/* renamed from: bgd  reason: default package */
/* loaded from: classes2.dex */
final class bgd implements Comparator<bgb> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(bgb bgbVar, bgb bgbVar2) {
        bgb bgbVar3 = bgbVar;
        bgb bgbVar4 = bgbVar2;
        bbd bbdVar = (bbd) bgbVar3.iterator();
        bbd bbdVar2 = (bbd) bgbVar4.iterator();
        while (bbdVar.hasNext() && bbdVar2.hasNext()) {
            int compare = Integer.compare(bgb.a(bbdVar.a()), bgb.a(bbdVar2.a()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(bgbVar3.a(), bgbVar4.a());
    }
}
