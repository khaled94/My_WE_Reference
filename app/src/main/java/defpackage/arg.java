package defpackage;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: arg  reason: default package */
/* loaded from: classes.dex */
final class arg<T> implements arf<T> {
    private volatile arf<T> a;
    private volatile boolean b;
    @NullableDecl
    private T c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public arg(arf<T> arfVar) {
        this.a = (arf) arc.a(arfVar);
    }

    @Override // defpackage.arf
    public final T a() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    T a = this.a.a();
                    this.c = a;
                    this.b = true;
                    this.a = null;
                    return a;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj = this.a;
        if (obj == null) {
            String valueOf = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
