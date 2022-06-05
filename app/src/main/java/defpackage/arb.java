package defpackage;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: arb  reason: default package */
/* loaded from: classes.dex */
public final class arb<T> extends aqz<T> {
    private final T a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public arb(T t) {
        this.a = t;
    }

    @Override // defpackage.aqz
    public final boolean a() {
        return true;
    }

    @Override // defpackage.aqz
    public final T b() {
        return this.a;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof arb) {
            return this.a.equals(((arb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
