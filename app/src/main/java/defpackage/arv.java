package defpackage;

import java.util.Comparator;

/* renamed from: arv  reason: default package */
/* loaded from: classes.dex */
final class arv implements Comparator<art> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(art artVar, art artVar2) {
        art artVar3 = artVar;
        art artVar4 = artVar2;
        ary aryVar = (ary) artVar3.iterator();
        ary aryVar2 = (ary) artVar4.iterator();
        while (aryVar.hasNext() && aryVar2.hasNext()) {
            int compare = Integer.compare(art.a(aryVar.a()), art.a(aryVar2.a()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(artVar3.a(), artVar4.a());
    }
}
