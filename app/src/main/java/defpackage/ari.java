package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: ari  reason: default package */
/* loaded from: classes.dex */
final class ari<T> implements arf<T>, Serializable {
    @NullableDecl
    private final T a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ari(@NullableDecl T t) {
        this.a = t;
    }

    @Override // defpackage.arf
    public final T a() {
        return this.a;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof ari) {
            T t = this.a;
            T t2 = ((ari) obj).a;
            if (t == t2) {
                return true;
            }
            return t != null && t.equals(t2);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
