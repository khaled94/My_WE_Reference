package defpackage;

/* renamed from: ecn  reason: default package */
/* loaded from: classes2.dex */
public final class ecn {
    public static final edx a = edx.a(":");
    public static final edx b = edx.a(":status");
    public static final edx c = edx.a(":method");
    public static final edx d = edx.a(":path");
    public static final edx e = edx.a(":scheme");
    public static final edx f = edx.a(":authority");
    public final edx g;
    public final edx h;
    final int i;

    public ecn(String str, String str2) {
        this(edx.a(str), edx.a(str2));
    }

    public ecn(edx edxVar, String str) {
        this(edxVar, edx.a(str));
    }

    public ecn(edx edxVar, edx edxVar2) {
        this.g = edxVar;
        this.h = edxVar2;
        this.i = edxVar.g() + 32 + edxVar2.g();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ecn) {
            ecn ecnVar = (ecn) obj;
            if (this.g.equals(ecnVar.g) && this.h.equals(ecnVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.g.hashCode() + 527) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return ebk.a("%s: %s", this.g.a(), this.h.a());
    }
}
