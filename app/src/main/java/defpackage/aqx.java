package defpackage;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: aqx  reason: default package */
/* loaded from: classes.dex */
final class aqx<T> extends aqz<T> {
    static final aqx<Object> a = new aqx<>();

    private aqx() {
    }

    @Override // defpackage.aqz
    public final boolean a() {
        return false;
    }

    public final boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // defpackage.aqz
    public final T b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }
}
