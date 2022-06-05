package defpackage;

/* renamed from: cml  reason: default package */
/* loaded from: classes2.dex */
public final class cml {
    final Class<?> a;
    final int b;
    private final int c = 0;

    public cml(Class<?> cls, int i) {
        this.a = (Class) aat.a(cls, "Null dependency anInterface.");
        this.b = i;
    }

    public static cml a(Class<?> cls) {
        return new cml(cls, 1);
    }

    public final boolean a() {
        return this.b == 2;
    }

    public final boolean b() {
        return this.c == 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cml) {
            cml cmlVar = (cml) obj;
            if (this.a == cmlVar.a && this.b == cmlVar.b && this.c == cmlVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        boolean z = true;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", direct=");
        if (this.c != 0) {
            z = false;
        }
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
