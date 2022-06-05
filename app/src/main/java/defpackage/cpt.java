package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: cpt  reason: default package */
/* loaded from: classes2.dex */
public final class cpt extends cpv implements Iterable<cpv> {
    private final List<cpv> a = new ArrayList();

    public final void a(cpv cpvVar) {
        if (cpvVar == null) {
            cpvVar = cpw.a;
        }
        this.a.add(cpvVar);
    }

    @Override // java.lang.Iterable
    public final Iterator<cpv> iterator() {
        return this.a.iterator();
    }

    @Override // defpackage.cpv
    public final Number a() {
        if (this.a.size() == 1) {
            return this.a.get(0).a();
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.cpv
    public final String b() {
        if (this.a.size() == 1) {
            return this.a.get(0).b();
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.cpv
    public final double c() {
        if (this.a.size() == 1) {
            return this.a.get(0).c();
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.cpv
    public final long d() {
        if (this.a.size() == 1) {
            return this.a.get(0).d();
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.cpv
    public final int e() {
        if (this.a.size() == 1) {
            return this.a.get(0).e();
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.cpv
    public final boolean f() {
        if (this.a.size() == 1) {
            return this.a.get(0).f();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof cpt) && ((cpt) obj).a.equals(this.a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
