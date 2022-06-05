package defpackage;

import java.util.Iterator;

/* renamed from: afr  reason: default package */
/* loaded from: classes.dex */
final class afr implements afq {
    final /* synthetic */ afm a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public afr(afm afmVar) {
        this.a = afmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afq
    public final void a(afo afoVar) {
        this.a.a = afoVar;
        Iterator<afy> it = this.a.c.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        this.a.c.clear();
        this.a.b = null;
    }
}
