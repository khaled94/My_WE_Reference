package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: eg  reason: default package */
/* loaded from: classes2.dex */
final class eg implements ck {
    private static final lc<Class<?>, byte[]> b = new lc<>(50);
    private final ek c;
    private final ck d;
    private final ck e;
    private final int f;
    private final int g;
    private final Class<?> h;
    private final cm i;
    private final cq<?> j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public eg(ek ekVar, ck ckVar, ck ckVar2, int i, int i2, cq<?> cqVar, Class<?> cls, cm cmVar) {
        this.c = ekVar;
        this.d = ckVar;
        this.e = ckVar2;
        this.f = i;
        this.g = i2;
        this.j = cqVar;
        this.h = cls;
        this.i = cmVar;
    }

    @Override // defpackage.ck
    public final boolean equals(Object obj) {
        if (obj instanceof eg) {
            eg egVar = (eg) obj;
            if (this.g == egVar.g && this.f == egVar.f && lg.a(this.j, egVar.j) && this.h.equals(egVar.h) && this.d.equals(egVar.d) && this.e.equals(egVar.e) && this.i.equals(egVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ck
    public final int hashCode() {
        int hashCode = (((((this.d.hashCode() * 31) + this.e.hashCode()) * 31) + this.f) * 31) + this.g;
        cq<?> cqVar = this.j;
        if (cqVar != null) {
            hashCode = (hashCode * 31) + cqVar.hashCode();
        }
        return (((hashCode * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    @Override // defpackage.ck
    public final void a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.c.a((Class<Object>) byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f).putInt(this.g).array();
        this.e.a(messageDigest);
        this.d.a(messageDigest);
        messageDigest.update(bArr);
        cq<?> cqVar = this.j;
        if (cqVar != null) {
            cqVar.a(messageDigest);
        }
        this.i.a(messageDigest);
        byte[] b2 = b.b(this.h);
        if (b2 == null) {
            b2 = this.h.getName().getBytes(a);
            b.b(this.h, b2);
        }
        messageDigest.update(b2);
        this.c.a((ek) bArr);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.d + ", signature=" + this.e + ", width=" + this.f + ", height=" + this.g + ", decodedResourceClass=" + this.h + ", transformation='" + this.j + "', options=" + this.i + '}';
    }
}
