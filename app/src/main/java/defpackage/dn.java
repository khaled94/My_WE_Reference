package defpackage;

import java.security.MessageDigest;

/* renamed from: dn  reason: default package */
/* loaded from: classes2.dex */
final class dn implements ck {
    private final ck b;
    private final ck c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public dn(ck ckVar, ck ckVar2) {
        this.b = ckVar;
        this.c = ckVar2;
    }

    @Override // defpackage.ck
    public final boolean equals(Object obj) {
        if (obj instanceof dn) {
            dn dnVar = (dn) obj;
            if (this.b.equals(dnVar.b) && this.c.equals(dnVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ck
    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.b + ", signature=" + this.c + '}';
    }

    @Override // defpackage.ck
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }
}
