package defpackage;

/* renamed from: csl  reason: default package */
/* loaded from: classes2.dex */
public final class csl extends csy {
    private static final char[] a;
    private static final char[] b = {'T', 'N', '*', 'E'};
    private static final char[] c = {'/', ':', '+', '.'};
    private static final char d;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        a = cArr;
        d = cArr[0];
    }

    @Override // defpackage.csy
    public final boolean[] a(String str) {
        int i;
        if (str.length() < 2) {
            str = d + str + d;
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            boolean a2 = csk.a(a, upperCase);
            boolean a3 = csk.a(a, upperCase2);
            boolean a4 = csk.a(b, upperCase);
            boolean a5 = csk.a(b, upperCase2);
            if (a2) {
                if (!a3) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(String.valueOf(str)));
                }
            } else if (a4) {
                if (!a5) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(String.valueOf(str)));
                }
            } else if (a3 || a5) {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(String.valueOf(str)));
            } else {
                str = d + str + d;
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                i2 += 9;
            } else if (!csk.a(c, str.charAt(i3))) {
                throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i3) + '\'');
            } else {
                i2 += 10;
            }
        }
        boolean[] zArr = new boolean[i2 + (str.length() - 1)];
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i5));
            if (i5 == 0 || i5 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i6 = 0;
            while (true) {
                if (i6 >= csk.a.length) {
                    i = 0;
                    break;
                } else if (upperCase3 == csk.a[i6]) {
                    i = csk.b[i6];
                    break;
                } else {
                    i6++;
                }
            }
            int i7 = 0;
            boolean z = true;
            while (true) {
                int i8 = 0;
                while (i7 < 7) {
                    zArr[i4] = z;
                    i4++;
                    if (((i >> (6 - i7)) & 1) == 0 || i8 == 1) {
                        z = !z;
                        i7++;
                    } else {
                        i8++;
                    }
                }
                break;
            }
            if (i5 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
        }
        return zArr;
    }
}
