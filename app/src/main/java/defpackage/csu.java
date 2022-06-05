package defpackage;

import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.Map;

/* renamed from: csu  reason: default package */
/* loaded from: classes2.dex */
public final class csu extends cte {
    @Override // defpackage.csy, defpackage.crg
    public final crq a(String str, crc crcVar, int i, int i2, Map<cre, ?> map) throws WriterException {
        if (crcVar != crc.EAN_8) {
            throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(crcVar)));
        }
        return super.a(str, crcVar, i, i2, map);
    }

    @Override // defpackage.csy
    public final boolean[] a(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + ctd.b(str);
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 8) {
            try {
                if (!ctd.a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
        }
        boolean[] zArr = new boolean[67];
        int a = a(zArr, 0, ctd.b, true) + 0;
        for (int i = 0; i <= 3; i++) {
            a += a(zArr, a, ctd.e[Character.digit(str.charAt(i), 10)], false);
        }
        int a2 = a + a(zArr, a, ctd.c, false);
        for (int i2 = 4; i2 <= 7; i2++) {
            a2 += a(zArr, a2, ctd.e[Character.digit(str.charAt(i2), 10)], true);
        }
        a(zArr, a2, ctd.b, true);
        return zArr;
    }
}
