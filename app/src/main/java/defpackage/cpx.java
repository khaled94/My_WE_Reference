package defpackage;

/* renamed from: cpx  reason: default package */
/* loaded from: classes2.dex */
public final class cpx extends cpv {
    public final cqq<String, cpv> a = new cqq<>();

    public final void a(String str, cpv cpvVar) {
        cqq<String, cpv> cqqVar = this.a;
        if (cpvVar == null) {
            cpvVar = cpw.a;
        }
        cqqVar.put(str, cpvVar);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof cpx) && ((cpx) obj).a.equals(this.a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
