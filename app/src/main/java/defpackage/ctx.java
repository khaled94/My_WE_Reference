package defpackage;

import com.google.zxing.WriterException;
import java.util.Arrays;

/* renamed from: ctx  reason: default package */
/* loaded from: classes2.dex */
final class ctx {
    private static final int[][] a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    private static final int[][] b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    private static final int[][] c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    private static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    private static boolean a(int i) {
        return i == -1;
    }

    private ctx() {
    }

    private static void a(int i, int i2, ctu ctuVar) throws WriterException {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (!a(ctuVar.a(i4, i2))) {
                throw new WriterException();
            }
            ctuVar.a(i4, i2, 0);
        }
    }

    private static void b(int i, int i2, ctu ctuVar) throws WriterException {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (!a(ctuVar.a(i, i4))) {
                throw new WriterException();
            }
            ctuVar.a(i, i4, 0);
        }
    }

    private static void c(int i, int i2, ctu ctuVar) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                ctuVar.a(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(crp crpVar, ctq ctqVar, cts ctsVar, int i, ctu ctuVar) throws WriterException {
        int i2 = 0;
        for (byte[] bArr : ctuVar.a) {
            Arrays.fill(bArr, (byte) -1);
        }
        int length = a[0].length;
        c(0, 0, ctuVar);
        c(ctuVar.b - length, 0, ctuVar);
        c(0, ctuVar.b - length, ctuVar);
        a(0, 7, ctuVar);
        a(ctuVar.b - 8, 7, ctuVar);
        a(0, ctuVar.b - 8, ctuVar);
        b(7, 0, ctuVar);
        b((ctuVar.c - 7) - 1, 0, ctuVar);
        b(7, ctuVar.c - 7, ctuVar);
        if (ctuVar.a(8, ctuVar.c - 8) == 0) {
            throw new WriterException();
        }
        ctuVar.a(8, ctuVar.c - 8, 1);
        int i3 = 5;
        if (ctsVar.a >= 2) {
            int[] iArr = c[ctsVar.a - 1];
            int length2 = iArr.length;
            int i4 = 0;
            while (i4 < length2) {
                int i5 = iArr[i4];
                if (i5 >= 0) {
                    int length3 = iArr.length;
                    int i6 = 0;
                    while (i6 < length3) {
                        int i7 = iArr[i6];
                        if (i7 >= 0 && a(ctuVar.a(i7, i5))) {
                            int i8 = i7 - 2;
                            int i9 = i5 - 2;
                            int i10 = 0;
                            while (i10 < i3) {
                                int[] iArr2 = b[i10];
                                while (i2 < i3) {
                                    ctuVar.a(i8 + i2, i9 + i10, iArr2[i2]);
                                    i2++;
                                    i3 = 5;
                                }
                                i10++;
                                i2 = 0;
                                i3 = 5;
                            }
                        }
                        i6++;
                        i2 = 0;
                        i3 = 5;
                    }
                }
                i4++;
                i2 = 0;
                i3 = 5;
            }
        }
        int i11 = 8;
        while (i11 < ctuVar.b - 8) {
            int i12 = i11 + 1;
            int i13 = i12 % 2;
            if (a(ctuVar.a(i11, 6))) {
                ctuVar.a(i11, 6, i13);
            }
            if (a(ctuVar.a(6, i11))) {
                ctuVar.a(6, i11, i13);
            }
            i11 = i12;
        }
        crp crpVar2 = new crp();
        if (!(i >= 0 && i < 8)) {
            throw new WriterException("Invalid mask pattern");
        }
        int bits = (ctqVar.getBits() << 3) | i;
        crpVar2.a(bits, 5);
        crpVar2.a(a(bits, 1335), 10);
        crp crpVar3 = new crp();
        crpVar3.a(21522, 15);
        if (crpVar2.b != crpVar3.b) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        for (int i14 = 0; i14 < crpVar2.a.length; i14++) {
            int[] iArr3 = crpVar2.a;
            iArr3[i14] = iArr3[i14] ^ crpVar3.a[i14];
        }
        if (crpVar2.b != 15) {
            throw new WriterException("should not happen but we got: " + crpVar2.b);
        }
        for (int i15 = 0; i15 < crpVar2.b; i15++) {
            boolean a2 = crpVar2.a((crpVar2.b - 1) - i15);
            int[] iArr4 = d[i15];
            ctuVar.a(iArr4[0], iArr4[1], a2);
            if (i15 < 8) {
                ctuVar.a((ctuVar.b - i15) - 1, 8, a2);
            } else {
                ctuVar.a(8, (ctuVar.c - 7) + (i15 - 8), a2);
            }
        }
        a(ctsVar, ctuVar);
        a(crpVar, i, ctuVar);
    }

    private static void a(cts ctsVar, ctu ctuVar) throws WriterException {
        if (ctsVar.a < 7) {
            return;
        }
        crp crpVar = new crp();
        crpVar.a(ctsVar.a, 6);
        crpVar.a(a(ctsVar.a, 7973), 12);
        if (crpVar.b != 18) {
            throw new WriterException("should not happen but we got: " + crpVar.b);
        }
        int i = 17;
        for (int i2 = 0; i2 < 6; i2++) {
            for (int i3 = 0; i3 < 3; i3++) {
                boolean a2 = crpVar.a(i);
                i--;
                ctuVar.a(i2, (ctuVar.c - 11) + i3, a2);
                ctuVar.a((ctuVar.c - 11) + i3, i2, a2);
            }
        }
    }

    private static void a(crp crpVar, int i, ctu ctuVar) throws WriterException {
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = ctuVar.b - 1;
        int i7 = ctuVar.c - 1;
        int i8 = 0;
        int i9 = -1;
        while (i6 > 0) {
            if (i6 == 6) {
                i6--;
            }
            while (i7 >= 0 && i7 < ctuVar.c) {
                for (int i10 = 0; i10 < 2; i10++) {
                    int i11 = i6 - i10;
                    if (a(ctuVar.a(i11, i7))) {
                        if (i8 < crpVar.b) {
                            z = crpVar.a(i8);
                            i8++;
                        } else {
                            z = false;
                        }
                        if (i != -1) {
                            switch (i) {
                                case 0:
                                    i3 = i7 + i11;
                                    i2 = i3 & 1;
                                    break;
                                case 1:
                                    i2 = i7 & 1;
                                    break;
                                case 2:
                                    i2 = i11 % 3;
                                    break;
                                case 3:
                                    i2 = (i7 + i11) % 3;
                                    break;
                                case 4:
                                    i5 = i7 / 2;
                                    i4 = i11 / 3;
                                    i3 = i5 + i4;
                                    i2 = i3 & 1;
                                    break;
                                case 5:
                                    int i12 = i7 * i11;
                                    i2 = (i12 % 3) + (i12 & 1);
                                    break;
                                case 6:
                                    int i13 = i7 * i11;
                                    i2 = ((i13 & 1) + (i13 % 3)) & 1;
                                    break;
                                case 7:
                                    i5 = (i7 * i11) % 3;
                                    i4 = (i7 + i11) & 1;
                                    i3 = i5 + i4;
                                    i2 = i3 & 1;
                                    break;
                                default:
                                    throw new IllegalArgumentException("Invalid mask pattern: ".concat(String.valueOf(i)));
                            }
                            if (i2 == 0) {
                                z = !z;
                            }
                        }
                        ctuVar.a(i11, i7, z);
                    }
                }
                i7 += i9;
            }
            i9 = -i9;
            i7 += i9;
            i6 -= 2;
        }
        if (i8 == crpVar.b) {
            return;
        }
        throw new WriterException("Not all bits consumed: " + i8 + '/' + crpVar.b);
    }

    private static int a(int i, int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(i2);
        int i3 = i << (numberOfLeadingZeros - 1);
        while (32 - Integer.numberOfLeadingZeros(i3) >= numberOfLeadingZeros) {
            i3 ^= i2 << ((32 - Integer.numberOfLeadingZeros(i3)) - numberOfLeadingZeros);
        }
        return i3;
    }
}
