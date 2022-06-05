package defpackage;

import com.google.zxing.WriterException;
import java.util.Map;

/* renamed from: csr  reason: default package */
/* loaded from: classes2.dex */
public final class csr extends csy {
    @Override // defpackage.csy, defpackage.crg
    public final crq a(String str, crc crcVar, int i, int i2, Map<cre, ?> map) throws WriterException {
        if (crcVar != crc.CODE_93) {
            throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(crcVar)));
        }
        return super.a(str, crcVar, i, i2, map);
    }

    @Override // defpackage.csy
    public final boolean[] a(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        int[] iArr = new int[9];
        a(csq.a[47], iArr);
        boolean[] zArr = new boolean[((str.length() + 2 + 2) * 9) + 1];
        int a = a(zArr, 0, iArr);
        for (int i = 0; i < length; i++) {
            a(csq.a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i))], iArr);
            a += a(zArr, a, iArr);
        }
        int a2 = a(str, 20);
        a(csq.a[a2], iArr);
        int a3 = a + a(zArr, a, iArr);
        a(csq.a[a(str + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(a2), 15)], iArr);
        int a4 = a3 + a(zArr, a3, iArr);
        a(csq.a[47], iArr);
        zArr[a4 + a(zArr, a4, iArr)] = true;
        return zArr;
    }

    private static void a(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) == 0) {
                i3 = 0;
            }
            iArr[i2] = i3;
        }
    }

    private static int a(boolean[] zArr, int i, int[] iArr) {
        int i2 = 0;
        while (i2 < 9) {
            int i3 = i + 1;
            zArr[i] = iArr[i2] != 0;
            i2++;
            i = i3;
        }
        return 9;
    }

    private static int a(String str, int i) {
        int i2 = 0;
        int i3 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i2 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i3;
            i3++;
            if (i3 > i) {
                i3 = 1;
            }
        }
        return i2 % 47;
    }
}
