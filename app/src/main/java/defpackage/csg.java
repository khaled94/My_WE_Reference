package defpackage;

/* renamed from: csg  reason: default package */
/* loaded from: classes2.dex */
public class csg {
    static final csg[] a;
    private static csg[] g;
    final int b;
    final int c;
    public final int d;
    public final int e;
    final int f;
    private final boolean h;
    private final int i;
    private final int j;

    static {
        csg[] csgVarArr = {new csg(false, 3, 5, 8, 8, 1), new csg(false, 5, 7, 10, 10, 1), new csg(true, 5, 7, 16, 6, 1), new csg(false, 8, 10, 12, 12, 1), new csg(true, 10, 11, 14, 6, 2), new csg(false, 12, 12, 14, 14, 1), new csg(true, 16, 14, 24, 10, 1), new csg(false, 18, 14, 16, 16, 1), new csg(false, 22, 18, 18, 18, 1), new csg(true, 22, 18, 16, 10, 2), new csg(false, 30, 20, 20, 20, 1), new csg(true, 32, 24, 16, 14, 2), new csg(false, 36, 24, 22, 22, 1), new csg(false, 44, 28, 24, 24, 1), new csg(true, 49, 28, 22, 14, 2), new csg(false, 62, 36, 14, 14, 4), new csg(false, 86, 42, 16, 16, 4), new csg(false, 114, 48, 18, 18, 4), new csg(false, 144, 56, 20, 20, 4), new csg(false, 174, 68, 22, 22, 4), new csg(false, 204, 84, 24, 24, 4, 102, 42), new csg(false, 280, 112, 14, 14, 16, 140, 56), new csg(false, 368, 144, 16, 16, 16, 92, 36), new csg(false, 456, 192, 18, 18, 16, 114, 48), new csg(false, 576, 224, 20, 20, 16, 144, 56), new csg(false, 696, 272, 22, 22, 16, 174, 68), new csg(false, 816, 336, 24, 24, 16, 136, 56), new csg(false, 1050, 408, 18, 18, 36, 175, 68), new csg(false, 1304, 496, 20, 20, 36, 163, 62), new crz()};
        a = csgVarArr;
        g = csgVarArr;
    }

    private csg(boolean z, int i, int i2, int i3, int i4, int i5) {
        this(z, i, i2, i3, i4, i5, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public csg(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.h = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.i = i5;
        this.j = i6;
        this.f = i7;
    }

    public static csg a(int i, csh cshVar, crd crdVar, crd crdVar2) {
        csg[] csgVarArr;
        for (csg csgVar : g) {
            if ((cshVar != csh.FORCE_SQUARE || !csgVar.h) && ((cshVar != csh.FORCE_RECTANGLE || csgVar.h) && ((crdVar == null || (csgVar.d() >= crdVar.a && csgVar.e() >= crdVar.b)) && ((crdVar2 == null || (csgVar.d() <= crdVar2.a && csgVar.e() <= crdVar2.b)) && i <= csgVar.b)))) {
                return csgVar;
            }
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i)));
    }

    private int f() {
        int i = this.i;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 4) {
                if (i == 16) {
                    return 4;
                }
                if (i != 36) {
                    throw new IllegalStateException("Cannot handle this number of data regions");
                }
                return 6;
            }
        }
        return i2;
    }

    private int g() {
        int i = this.i;
        if (i == 1 || i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 36) {
            throw new IllegalStateException("Cannot handle this number of data regions");
        }
        return 6;
    }

    public final int b() {
        return f() * this.d;
    }

    public final int c() {
        return g() * this.e;
    }

    public final int d() {
        return b() + (f() << 1);
    }

    public final int e() {
        return c() + (g() << 1);
    }

    public int a() {
        return this.b / this.j;
    }

    public int a(int i) {
        return this.j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.h ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        sb.append(this.d);
        sb.append('x');
        sb.append(this.e);
        sb.append(", symbol size ");
        sb.append(d());
        sb.append('x');
        sb.append(e());
        sb.append(", symbol data size ");
        sb.append(b());
        sb.append('x');
        sb.append(c());
        sb.append(", codewords ");
        sb.append(this.b);
        sb.append('+');
        sb.append(this.c);
        return sb.toString();
    }
}
