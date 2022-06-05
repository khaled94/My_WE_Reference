package defpackage;

import java.util.Map;

/* renamed from: crv  reason: default package */
/* loaded from: classes2.dex */
public final class crv implements crg {
    @Override // defpackage.crg
    public final crq a(String str, crc crcVar, int i, int i2, Map<cre, ?> map) {
        crd crdVar;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (crcVar != crc.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(crcVar)));
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i + 'x' + i2);
        }
        csh cshVar = csh.FORCE_NONE;
        crd crdVar2 = null;
        if (map != null) {
            csh cshVar2 = (csh) map.get(cre.DATA_MATRIX_SHAPE);
            if (cshVar2 != null) {
                cshVar = cshVar2;
            }
            crd crdVar3 = (crd) map.get(cre.MIN_SIZE);
            if (crdVar3 == null) {
                crdVar3 = null;
            }
            crdVar = (crd) map.get(cre.MAX_SIZE);
            if (crdVar == null) {
                crdVar = null;
            }
            crdVar2 = crdVar3;
        } else {
            crdVar = null;
        }
        String a = csf.a(str, cshVar, crdVar2, crdVar);
        csg a2 = csg.a(a.length(), cshVar, crdVar2, crdVar);
        csa csaVar = new csa(cse.a(a, a2), a2.b(), a2.c());
        csaVar.a();
        return a(csaVar, a2, i, i2);
    }

    private static crq a(csa csaVar, csg csgVar, int i, int i2) {
        crq crqVar;
        int b = csgVar.b();
        int c = csgVar.c();
        ctu ctuVar = new ctu(csgVar.d(), csgVar.e());
        int i3 = 0;
        for (int i4 = 0; i4 < c; i4++) {
            if (i4 % csgVar.e == 0) {
                int i5 = 0;
                for (int i6 = 0; i6 < csgVar.d(); i6++) {
                    ctuVar.a(i5, i3, i6 % 2 == 0);
                    i5++;
                }
                i3++;
            }
            int i7 = 0;
            for (int i8 = 0; i8 < b; i8++) {
                if (i8 % csgVar.d == 0) {
                    ctuVar.a(i7, i3, true);
                    i7++;
                }
                ctuVar.a(i7, i3, csaVar.b[(csaVar.a * i4) + i8] == 1);
                i7++;
                if (i8 % csgVar.d == csgVar.d - 1) {
                    ctuVar.a(i7, i3, i4 % 2 == 0);
                    i7++;
                }
            }
            i3++;
            if (i4 % csgVar.e == csgVar.e - 1) {
                int i9 = 0;
                for (int i10 = 0; i10 < csgVar.d(); i10++) {
                    ctuVar.a(i9, i3, true);
                    i9++;
                }
                i3++;
            }
        }
        int i11 = ctuVar.b;
        int i12 = ctuVar.c;
        int max = Math.max(i, i11);
        int max2 = Math.max(i2, i12);
        int min = Math.min(max / i11, max2 / i12);
        int i13 = (max - (i11 * min)) / 2;
        int i14 = (max2 - (i12 * min)) / 2;
        if (i2 < i12 || i < i11) {
            crqVar = new crq(i11, i12);
            i13 = 0;
            i14 = 0;
        } else {
            crqVar = new crq(i, i2);
        }
        crqVar.a();
        int i15 = 0;
        while (i15 < i12) {
            int i16 = i13;
            int i17 = 0;
            while (i17 < i11) {
                if (ctuVar.a(i17, i15) == 1) {
                    crqVar.a(i16, i14, min, min);
                }
                i17++;
                i16 += min;
            }
            i15++;
            i14 += min;
        }
        return crqVar;
    }
}
