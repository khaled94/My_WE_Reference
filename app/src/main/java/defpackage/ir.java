package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: ir  reason: default package */
/* loaded from: classes2.dex */
final class ir implements jc {
    private final Set<jd> a = Collections.newSetFromMap(new WeakHashMap());
    private boolean b;
    private boolean c;

    @Override // defpackage.jc
    public final void a(jd jdVar) {
        this.a.add(jdVar);
        if (this.c) {
            jdVar.c();
        } else if (this.b) {
            jdVar.a();
        } else {
            jdVar.b();
        }
    }

    @Override // defpackage.jc
    public final void b(jd jdVar) {
        this.a.remove(jdVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.b = true;
        for (jd jdVar : lg.a(this.a)) {
            jdVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.b = false;
        for (jd jdVar : lg.a(this.a)) {
            jdVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.c = true;
        for (jd jdVar : lg.a(this.a)) {
            jdVar.c();
        }
    }
}
