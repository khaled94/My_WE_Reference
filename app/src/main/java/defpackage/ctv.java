package defpackage;

import com.google.zxing.WriterException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/* renamed from: ctv  reason: default package */
/* loaded from: classes2.dex */
public final class ctv {
    private static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    private ctv() {
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f6 A[LOOP:1: B:58:0x00cb->B:71:0x00f6, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.cty a(java.lang.String r13, defpackage.ctq r14, java.util.Map<defpackage.cre, ?> r15) throws com.google.zxing.WriterException {
        /*
            Method dump skipped, instructions count: 623
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctv.a(java.lang.String, ctq, java.util.Map):cty");
    }

    private static int a(int i) {
        int[] iArr = a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    private static boolean a(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                int i2 = bytes[i] & 255;
                if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v8 */
    private static int a(crp crpVar, ctq ctqVar, cts ctsVar, ctu ctuVar) throws WriterException {
        int i;
        boolean z = false;
        int i2 = Integer.MAX_VALUE;
        int i3 = -1;
        int i4 = 0;
        while (i4 < 8) {
            ctx.a(crpVar, ctqVar, ctsVar, i4, ctuVar);
            int a2 = ctw.a(ctuVar, true) + ctw.a(ctuVar, z);
            byte[][] bArr = ctuVar.a;
            int i5 = ctuVar.b;
            int i6 = ctuVar.c;
            int i7 = 0;
            int i8 = 0;
            boolean z2 = z;
            while (i7 < i6 - 1) {
                byte[] bArr2 = bArr[i7];
                int i9 = z2;
                while (i9 < i5 - 1) {
                    char c = i9 == true ? 1 : 0;
                    char c2 = i9 == true ? 1 : 0;
                    byte b = bArr2[c];
                    int i10 = i9 == true ? 1 : 0;
                    int i11 = i9 == true ? 1 : 0;
                    int i12 = i10 + 1;
                    if (b == bArr2[i12]) {
                        int i13 = i7 + 1;
                        if (b == bArr[i13][i9] && b == bArr[i13][i12]) {
                            i8++;
                        }
                    }
                    i9 = i12;
                }
                i7++;
                z2 = false;
            }
            int i14 = a2 + (i8 * 3);
            byte[][] bArr3 = ctuVar.a;
            int i15 = ctuVar.b;
            int i16 = ctuVar.c;
            int i17 = 0;
            for (int i18 = 0; i18 < i16; i18++) {
                int i19 = 0;
                while (i19 < i15) {
                    byte[] bArr4 = bArr3[i18];
                    int i20 = i19 + 6;
                    if (i20 < i15) {
                        i = i15;
                        if (bArr4[i19] == 1 && bArr4[i19 + 1] == 0 && bArr4[i19 + 2] == 1 && bArr4[i19 + 3] == 1 && bArr4[i19 + 4] == 1 && bArr4[i19 + 5] == 0 && bArr4[i20] == 1 && (ctw.a(bArr4, i19 - 4, i19) || ctw.a(bArr4, i19 + 7, i19 + 11))) {
                            i17++;
                        }
                    } else {
                        i = i15;
                    }
                    int i21 = i18 + 6;
                    if (i21 < i16 && bArr3[i18][i19] == 1 && bArr3[i18 + 1][i19] == 0 && bArr3[i18 + 2][i19] == 1 && bArr3[i18 + 3][i19] == 1 && bArr3[i18 + 4][i19] == 1 && bArr3[i18 + 5][i19] == 0 && bArr3[i21][i19] == 1 && (ctw.a(bArr3, i19, i18 - 4, i18) || ctw.a(bArr3, i19, i18 + 7, i18 + 11))) {
                        i17++;
                    }
                    i19++;
                    i15 = i;
                }
            }
            int i22 = i14 + (i17 * 40);
            byte[][] bArr5 = ctuVar.a;
            int i23 = ctuVar.b;
            int i24 = ctuVar.c;
            int i25 = 0;
            for (int i26 = 0; i26 < i24; i26++) {
                byte[] bArr6 = bArr5[i26];
                for (int i27 = 0; i27 < i23; i27++) {
                    if (bArr6[i27] == 1) {
                        i25++;
                    }
                }
            }
            int i28 = ctuVar.c * ctuVar.b;
            int abs = i22 + (((Math.abs((i25 << 1) - i28) * 10) / i28) * 10);
            if (abs < i2) {
                i3 = i4;
                i2 = abs;
            }
            i4++;
            z = false;
        }
        return i3;
    }

    private static cts a(int i, ctq ctqVar) throws WriterException {
        for (int i2 = 1; i2 <= 40; i2++) {
            cts a2 = cts.a(i2);
            if (a(i, a2, ctqVar)) {
                return a2;
            }
        }
        throw new WriterException("Data too big");
    }

    private static crp a(crp crpVar, int i, int i2, int i3) throws WriterException {
        char c;
        if (crpVar.a() != i2) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList<ctt> arrayList = new ArrayList(i3);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            if (i7 >= i3) {
                throw new WriterException("Block ID too large");
            }
            int i8 = i % i3;
            int i9 = i3 - i8;
            int i10 = i / i3;
            int i11 = i10 + 1;
            int i12 = i2 / i3;
            int i13 = i12 + 1;
            int i14 = i10 - i12;
            int i15 = i11 - i13;
            if (i14 != i15) {
                throw new WriterException("EC bytes mismatch");
            }
            if (i3 != i9 + i8) {
                throw new WriterException("RS blocks mismatch");
            }
            if (i == ((i12 + i14) * i9) + ((i13 + i15) * i8)) {
                if (i7 < i9) {
                    c = 0;
                    iArr[0] = i12;
                    iArr2[0] = i14;
                } else {
                    c = 0;
                    iArr[0] = i13;
                    iArr2[0] = i15;
                }
                int i16 = iArr[c];
                byte[] bArr = new byte[i16];
                crpVar.a(i4 << 3, bArr, i16);
                byte[] a2 = a(bArr, iArr2[c]);
                arrayList.add(new ctt(bArr, a2));
                i5 = Math.max(i5, i16);
                i6 = Math.max(i6, a2.length);
                i4 += iArr[c];
            } else {
                throw new WriterException("Total bytes mismatch");
            }
        }
        if (i2 != i4) {
            throw new WriterException("Data bytes does not match offset");
        }
        crp crpVar2 = new crp();
        for (int i17 = 0; i17 < i5; i17++) {
            for (ctt cttVar : arrayList) {
                byte[] bArr2 = cttVar.a;
                if (i17 < bArr2.length) {
                    crpVar2.a(bArr2[i17], 8);
                }
            }
        }
        for (int i18 = 0; i18 < i6; i18++) {
            for (ctt cttVar2 : arrayList) {
                byte[] bArr3 = cttVar2.b;
                if (i18 < bArr3.length) {
                    crpVar2.a(bArr3[i18], 8);
                }
            }
        }
        if (i == crpVar2.a()) {
            return crpVar2;
        }
        throw new WriterException("Interleaving error: " + i + " and " + crpVar2.a() + " differ.");
    }

    private static byte[] a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length + i];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new cru(crs.e).a(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    private static void a(ctr ctrVar, crp crpVar) {
        crpVar.a(ctrVar.getBits(), 4);
    }

    /* renamed from: ctv$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ctr.values().length];
            a = iArr;
            try {
                iArr[ctr.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ctr.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ctr.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ctr.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static int a(ctr ctrVar, crp crpVar, crp crpVar2, cts ctsVar) {
        return crpVar.b + ctrVar.getCharacterCountBits(ctsVar) + crpVar2.b;
    }

    private static boolean a(int i, cts ctsVar, ctq ctqVar) {
        return ctsVar.b - ctsVar.a(ctqVar).b() >= (i + 7) / 8;
    }

    private static void a(int i, crp crpVar) throws WriterException {
        int i2 = i << 3;
        if (crpVar.b > i2) {
            throw new WriterException("data bits cannot fit in the QR Code" + crpVar.b + " > " + i2);
        }
        for (int i3 = 0; i3 < 4 && crpVar.b < i2; i3++) {
            crpVar.a(false);
        }
        int i4 = crpVar.b & 7;
        if (i4 > 0) {
            while (i4 < 8) {
                crpVar.a(false);
                i4++;
            }
        }
        int a2 = i - crpVar.a();
        for (int i5 = 0; i5 < a2; i5++) {
            crpVar.a((i5 & 1) == 0 ? 236 : 17, 8);
        }
        if (crpVar.b != i2) {
            throw new WriterException("Bits size does not equal capacity");
        }
    }
}
