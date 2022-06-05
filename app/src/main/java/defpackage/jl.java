package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: jl  reason: default package */
/* loaded from: classes2.dex */
public final class jl implements jd {
    public final Set<km<?>> a = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.jd
    public final void a() {
        for (km kmVar : lg.a(this.a)) {
            kmVar.a();
        }
    }

    @Override // defpackage.jd
    public final void b() {
        for (km kmVar : lg.a(this.a)) {
            kmVar.b();
        }
    }

    @Override // defpackage.jd
    public final void c() {
        for (km kmVar : lg.a(this.a)) {
            kmVar.c();
        }
    }
}
