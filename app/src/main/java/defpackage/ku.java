package defpackage;

import java.security.MessageDigest;

/* renamed from: ku  reason: default package */
/* loaded from: classes2.dex */
public final class ku implements ck {
    private final Object b;

    public ku(Object obj) {
        this.b = lf.a(obj, "Argument must not be null");
    }

    public final String toString() {
        return "ObjectKey{object=" + this.b + '}';
    }

    @Override // defpackage.ck
    public final boolean equals(Object obj) {
        if (obj instanceof ku) {
            return this.b.equals(((ku) obj).b);
        }
        return false;
    }

    @Override // defpackage.ck
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.ck
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(a));
    }
}
