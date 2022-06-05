package defpackage;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: xs  reason: default package */
/* loaded from: classes2.dex */
public final class xs {
    final vo<?> a;
    final uw b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ xs(vo voVar, uw uwVar) {
        this.a = voVar;
        this.b = uwVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof xs)) {
            xs xsVar = (xs) obj;
            if (aar.a(this.a, xsVar.a) && aar.a(this.b, xsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return aar.a(this).a("key", this.a).a("feature", this.b).toString();
    }
}
