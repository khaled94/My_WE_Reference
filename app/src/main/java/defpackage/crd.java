package defpackage;

/* renamed from: crd  reason: default package */
/* loaded from: classes2.dex */
public final class crd {
    public final int a;
    public final int b;

    public final boolean equals(Object obj) {
        if (obj instanceof crd) {
            crd crdVar = (crd) obj;
            if (this.a == crdVar.a && this.b == crdVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 32713) + this.b;
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
