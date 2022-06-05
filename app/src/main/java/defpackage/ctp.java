package defpackage;

import com.google.zxing.WriterException;
import java.util.Map;

/* renamed from: ctp  reason: default package */
/* loaded from: classes2.dex */
public final class ctp implements crg {
    @Override // defpackage.crg
    public final crq a(String str, crc crcVar, int i, int i2, Map<cre, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (crcVar != crc.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(crcVar)));
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        }
        ctq ctqVar = ctq.L;
        int i3 = 4;
        if (map != null) {
            if (map.containsKey(cre.ERROR_CORRECTION)) {
                ctqVar = ctq.valueOf(map.get(cre.ERROR_CORRECTION).toString());
            }
            if (map.containsKey(cre.MARGIN)) {
                i3 = Integer.parseInt(map.get(cre.MARGIN).toString());
            }
        }
        return a(ctv.a(str, ctqVar, map), i, i2, i3);
    }

    private static crq a(cty ctyVar, int i, int i2, int i3) {
        ctu ctuVar = ctyVar.e;
        if (ctuVar == null) {
            throw new IllegalStateException();
        }
        int i4 = ctuVar.b;
        int i5 = ctuVar.c;
        int i6 = i3 << 1;
        int i7 = i4 + i6;
        int i8 = i6 + i5;
        int max = Math.max(i, i7);
        int max2 = Math.max(i2, i8);
        int min = Math.min(max / i7, max2 / i8);
        int i9 = (max - (i4 * min)) / 2;
        int i10 = (max2 - (i5 * min)) / 2;
        crq crqVar = new crq(max, max2);
        int i11 = 0;
        while (i11 < i5) {
            int i12 = i9;
            int i13 = 0;
            while (i13 < i4) {
                if (ctuVar.a(i13, i11) == 1) {
                    crqVar.a(i12, i10, min, min);
                }
                i13++;
                i12 += min;
            }
            i11++;
            i10 += min;
        }
        return crqVar;
    }
}
