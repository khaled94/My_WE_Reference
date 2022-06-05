package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* renamed from: crh  reason: default package */
/* loaded from: classes2.dex */
public final class crh implements crg {
    @Override // defpackage.crg
    public final crq a(String str, crc crcVar, int i, int i2, Map<cre, ?> map) {
        Charset charset = StandardCharsets.ISO_8859_1;
        int i3 = 33;
        int i4 = 0;
        if (map != null) {
            if (map.containsKey(cre.CHARACTER_SET)) {
                charset = Charset.forName(map.get(cre.CHARACTER_SET).toString());
            }
            if (map.containsKey(cre.ERROR_CORRECTION)) {
                i3 = Integer.parseInt(map.get(cre.ERROR_CORRECTION).toString());
            }
            if (map.containsKey(cre.AZTEC_LAYERS)) {
                i4 = Integer.parseInt(map.get(cre.AZTEC_LAYERS).toString());
            }
        }
        if (crcVar != crc.AZTEC) {
            throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(crcVar)));
        }
        return a(crk.a(str.getBytes(charset), i3, i4), i, i2);
    }

    private static crq a(cri criVar, int i, int i2) {
        crq crqVar = criVar.e;
        if (crqVar == null) {
            throw new IllegalStateException();
        }
        int i3 = crqVar.a;
        int i4 = crqVar.b;
        int max = Math.max(i, i3);
        int max2 = Math.max(i2, i4);
        int min = Math.min(max / i3, max2 / i4);
        int i5 = (max - (i3 * min)) / 2;
        int i6 = (max2 - (i4 * min)) / 2;
        crq crqVar2 = new crq(max, max2);
        int i7 = 0;
        while (i7 < i4) {
            int i8 = i5;
            int i9 = 0;
            while (i9 < i3) {
                if (crqVar.a(i9, i7)) {
                    crqVar2.a(i8, i6, min, min);
                }
                i9++;
                i8 += min;
            }
            i7++;
            i6 += min;
        }
        return crqVar2;
    }
}
