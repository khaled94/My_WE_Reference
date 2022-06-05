package defpackage;

/* renamed from: cvp  reason: default package */
/* loaded from: classes2.dex */
public final class cvp {
    public static int a(cva cvaVar, int i) {
        if (cvaVar == null) {
            return 0;
        }
        if (cvaVar.b() == cvb.HORIZONTAL) {
            return b(cvaVar, i);
        }
        return c(cvaVar, i);
    }

    public static int b(cva cvaVar, int i) {
        int i2;
        if (cvaVar == null) {
            return 0;
        }
        if (cvaVar.b() == cvb.HORIZONTAL) {
            i2 = d(cvaVar, i);
        } else {
            i2 = a(cvaVar);
        }
        return i2 + cvaVar.e;
    }

    public static int c(cva cvaVar, int i) {
        int i2;
        if (cvaVar == null) {
            return 0;
        }
        if (cvaVar.b() == cvb.HORIZONTAL) {
            i2 = a(cvaVar);
        } else {
            i2 = d(cvaVar, i);
        }
        return i2 + cvaVar.f;
    }

    private static int d(cva cvaVar, int i) {
        int i2 = cvaVar.q;
        int i3 = cvaVar.c;
        int i4 = cvaVar.i;
        int i5 = cvaVar.d;
        int i6 = 0;
        for (int i7 = 0; i7 < i2; i7++) {
            int i8 = i4 / 2;
            int i9 = i6 + i3 + i8;
            if (i == i7) {
                return i9;
            }
            i6 = i9 + i3 + i5 + i8;
        }
        return cvaVar.c() == cum.DROP ? i6 + (i3 * 2) : i6;
    }

    private static int a(cva cvaVar) {
        int i = cvaVar.c;
        return cvaVar.c() == cum.DROP ? i * 3 : i;
    }
}
