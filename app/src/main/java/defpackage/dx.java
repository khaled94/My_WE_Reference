package defpackage;

import java.security.MessageDigest;
import java.util.Map;

/* renamed from: dx  reason: default package */
/* loaded from: classes2.dex */
final class dx implements ck {
    private final Object b;
    private final int c;
    private final int d;
    private final Class<?> e;
    private final Class<?> f;
    private final ck g;
    private final Map<Class<?>, cq<?>> h;
    private final cm i;
    private int j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public dx(Object obj, ck ckVar, int i, int i2, Map<Class<?>, cq<?>> map, Class<?> cls, Class<?> cls2, cm cmVar) {
        this.b = lf.a(obj, "Argument must not be null");
        this.g = (ck) lf.a(ckVar, "Signature must not be null");
        this.c = i;
        this.d = i2;
        this.h = (Map) lf.a(map, "Argument must not be null");
        this.e = (Class) lf.a(cls, "Resource class must not be null");
        this.f = (Class) lf.a(cls2, "Transcode class must not be null");
        this.i = (cm) lf.a(cmVar, "Argument must not be null");
    }

    @Override // defpackage.ck
    public final boolean equals(Object obj) {
        if (obj instanceof dx) {
            dx dxVar = (dx) obj;
            if (this.b.equals(dxVar.b) && this.g.equals(dxVar.g) && this.d == dxVar.d && this.c == dxVar.c && this.h.equals(dxVar.h) && this.e.equals(dxVar.e) && this.f.equals(dxVar.f) && this.i.equals(dxVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ck
    public final int hashCode() {
        if (this.j == 0) {
            int hashCode = this.b.hashCode();
            this.j = hashCode;
            int hashCode2 = (hashCode * 31) + this.g.hashCode();
            this.j = hashCode2;
            int i = (hashCode2 * 31) + this.c;
            this.j = i;
            int i2 = (i * 31) + this.d;
            this.j = i2;
            int hashCode3 = (i2 * 31) + this.h.hashCode();
            this.j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.e.hashCode();
            this.j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f.hashCode();
            this.j = hashCode5;
            this.j = (hashCode5 * 31) + this.i.hashCode();
        }
        return this.j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.b + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + this.e + ", transcodeClass=" + this.f + ", signature=" + this.g + ", hashCode=" + this.j + ", transformations=" + this.h + ", options=" + this.i + '}';
    }

    @Override // defpackage.ck
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
