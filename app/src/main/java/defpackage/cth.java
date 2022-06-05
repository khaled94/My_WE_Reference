package defpackage;

import com.google.zxing.WriterException;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: cth  reason: default package */
/* loaded from: classes2.dex */
public final class cth implements crg {
    @Override // defpackage.crg
    public final crq a(String str, crc crcVar, int i, int i2, Map<cre, ?> map) throws WriterException {
        boolean z;
        if (crcVar != crc.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(crcVar)));
        }
        ctm ctmVar = new ctm();
        int i3 = 30;
        int i4 = 2;
        if (map != null) {
            if (map.containsKey(cre.PDF417_COMPACT)) {
                ctmVar.b = Boolean.valueOf(map.get(cre.PDF417_COMPACT).toString()).booleanValue();
            }
            if (map.containsKey(cre.PDF417_COMPACTION)) {
                ctmVar.c = ctk.valueOf(map.get(cre.PDF417_COMPACTION).toString());
            }
            if (map.containsKey(cre.PDF417_DIMENSIONS)) {
                ctl ctlVar = (ctl) map.get(cre.PDF417_DIMENSIONS);
                int i5 = ctlVar.b;
                int i6 = ctlVar.a;
                int i7 = ctlVar.d;
                int i8 = ctlVar.c;
                ctmVar.f = i5;
                ctmVar.e = i6;
                ctmVar.g = i7;
                ctmVar.h = i8;
            }
            if (map.containsKey(cre.MARGIN)) {
                i3 = Integer.parseInt(map.get(cre.MARGIN).toString());
            }
            if (map.containsKey(cre.ERROR_CORRECTION)) {
                i4 = Integer.parseInt(map.get(cre.ERROR_CORRECTION).toString());
            }
            if (map.containsKey(cre.CHARACTER_SET)) {
                ctmVar.d = Charset.forName(map.get(cre.CHARACTER_SET).toString());
            }
        }
        ctmVar.a(str, i4);
        byte[][] a = ctmVar.a.a(1, 4);
        if ((i2 > i) != (a[0].length < a.length)) {
            a = a(a);
            z = true;
        } else {
            z = false;
        }
        int length = i / a[0].length;
        int length2 = i2 / a.length;
        if (length >= length2) {
            length = length2;
        }
        if (length > 1) {
            byte[][] a2 = ctmVar.a.a(length, length << 2);
            if (z) {
                a2 = a(a2);
            }
            return a(a2, i3);
        }
        return a(a, i3);
    }

    private static crq a(byte[][] bArr, int i) {
        int i2 = i * 2;
        crq crqVar = new crq(bArr[0].length + i2, bArr.length + i2);
        crqVar.a();
        int i3 = (crqVar.b - i) - 1;
        int i4 = 0;
        while (i4 < bArr.length) {
            byte[] bArr2 = bArr[i4];
            for (int i5 = 0; i5 < bArr[0].length; i5++) {
                if (bArr2[i5] == 1) {
                    crqVar.b(i5 + i, i3);
                }
            }
            i4++;
            i3--;
        }
        return crqVar;
    }

    private static byte[][] a(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance(byte.class, bArr[0].length, bArr.length);
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length] = bArr[i][i2];
            }
        }
        return bArr2;
    }
}
