package defpackage;

/* renamed from: le  reason: default package */
/* loaded from: classes2.dex */
public final class le {
    private Class<?> a;
    private Class<?> b;
    private Class<?> c;

    public le() {
    }

    public le(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        a(cls, cls2, cls3);
    }

    public final void a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.a + ", second=" + this.b + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        le leVar = (le) obj;
        return this.a.equals(leVar.a) && this.b.equals(leVar.b) && lg.a(this.c, leVar.c);
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        Class<?> cls = this.c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }
}
