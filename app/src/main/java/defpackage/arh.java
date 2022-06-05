package defpackage;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: arh  reason: default package */
/* loaded from: classes.dex */
final class arh<T> implements arf<T>, Serializable {
    private final arf<T> a;
    private volatile transient boolean b;
    @NullableDecl
    private transient T c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public arh(arf<T> arfVar) {
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
                    return a;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj;
        if (this.b) {
            String valueOf = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.a;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
