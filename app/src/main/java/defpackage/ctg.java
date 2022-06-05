package defpackage;

import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.Map;

/* renamed from: ctg  reason: default package */
/* loaded from: classes2.dex */
public final class ctg extends cte {
    @Override // defpackage.csy, defpackage.crg
    public final crq a(String str, crc crcVar, int i, int i2, Map<cre, ?> map) throws WriterException {
        if (crcVar != crc.UPC_E) {
            throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(crcVar)));
        }
        return super.a(str, crcVar, i, i2, map);
    }

    @Override // defpackage.csy
    public final boolean[] a(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + ctd.b(ctf.a(str));
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
        int digit = Character.digit(str.charAt(0), 10);
        if (digit != 0 && digit != 1) {
            throw new IllegalArgumentException("Number system must be 0 or 1");
        }
        int i = ctf.a[digit][Character.digit(str.charAt(7), 10)];
        boolean[] zArr = new boolean[51];
        int a = a(zArr, 0, ctd.b, true) + 0;
        for (int i2 = 1; i2 <= 6; i2++) {
            int digit2 = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                digit2 += 10;
            }
            a += a(zArr, a, ctd.f[digit2], false);
        }
        a(zArr, a, ctd.d, false);
        return zArr;
    }
}
