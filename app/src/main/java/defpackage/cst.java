package defpackage;

import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.Map;

/* renamed from: cst  reason: default package */
/* loaded from: classes2.dex */
public final class cst extends cte {
    @Override // defpackage.csy, defpackage.crg
    public final crq a(String str, crc crcVar, int i, int i2, Map<cre, ?> map) throws WriterException {
        if (crcVar != crc.EAN_13) {
            throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(crcVar)));
        }
        return super.a(str, crcVar, i, i2, map);
    }

    @Override // defpackage.csy
    public final boolean[] a(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + ctd.b(str);
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 13) {
            try {
                if (!ctd.a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
        }
        int i = css.a[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int a = a(zArr, 0, ctd.b, true) + 0;
        for (int i2 = 1; i2 <= 6; i2++) {
            int digit = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                digit += 10;
            }
            a += a(zArr, a, ctd.f[digit], false);
        }
        int a2 = a + a(zArr, a, ctd.c, false);
        for (int i3 = 7; i3 <= 12; i3++) {
            a2 += a(zArr, a2, ctd.e[Character.digit(str.charAt(i3), 10)], true);
        }
        a(zArr, a2, ctd.b, true);
        return zArr;
    }
}
