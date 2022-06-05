package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/* renamed from: crk  reason: default package */
/* loaded from: classes2.dex */
public final class crk {
    private static final int[] a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private static int a(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }

    private crk() {
    }

    public static cri a(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        crp crpVar;
        crp crpVar2;
        int i10;
        int i11;
        final crl crlVar = new crl(bArr);
        Collection<crn> singletonList = Collections.singletonList(crn.a);
        int i12 = 0;
        while (true) {
            i3 = 5;
            i4 = 3;
            int i13 = 4;
            i5 = 32;
            i6 = 2;
            if (i12 >= crlVar.d.length) {
                break;
            }
            int i14 = i12 + 1;
            byte b = i14 < crlVar.d.length ? crlVar.d[i14] : (byte) 0;
            byte b2 = crlVar.d[i12];
            if (b2 == 13) {
                if (b != 10) {
                    i6 = 0;
                }
                i3 = i6;
            } else if (b2 == 44) {
                if (b != 32) {
                    i13 = 0;
                }
                i3 = i13;
            } else if (b2 == 46) {
                if (b != 32) {
                    i4 = 0;
                }
                i3 = i4;
            } else if (b2 != 58 || b != 32) {
                i3 = 0;
            }
            if (i3 > 0) {
                singletonList = crl.a(singletonList, i12, i3);
                i12 = i14;
            } else {
                LinkedList linkedList = new LinkedList();
                for (crn crnVar : singletonList) {
                    crlVar.a(crnVar, i12, linkedList);
                }
                singletonList = crl.a(linkedList);
            }
            i12++;
        }
        crp a2 = ((crn) Collections.min(singletonList, new Comparator<crn>() { // from class: crl.1
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(crn crnVar2, crn crnVar3) {
                return crnVar2.d - crnVar3.d;
            }
        })).a(crlVar.d);
        int i15 = 11;
        int i16 = ((a2.b * i) / 100) + 11;
        int i17 = a2.b + i16;
        if (i2 != 0) {
            z = i2 < 0;
            i9 = Math.abs(i2);
            if (z) {
                i5 = 4;
            }
            if (i9 > i5) {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i2)));
            }
            i8 = a(i9, z);
            i7 = a[i9];
            int i18 = i8 - (i8 % i7);
            crpVar = a(a2, i7);
            if (crpVar.b + i16 > i18) {
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
            if (z && crpVar.b > (i7 << 6)) {
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
        } else {
            crp crpVar3 = null;
            int i19 = 0;
            int i20 = 0;
            while (i19 <= i5) {
                boolean z2 = i19 <= i4;
                int i21 = z2 ? i19 + 1 : i19;
                int a3 = a(i21, z2);
                if (i17 <= a3) {
                    if (crpVar3 == null || i20 != a[i21]) {
                        int i22 = a[i21];
                        crpVar3 = a(a2, i22);
                        i20 = i22;
                    }
                    int i23 = a3 - (a3 % i20);
                    if ((!z2 || crpVar3.b <= (i20 << 6)) && crpVar3.b + i16 <= i23) {
                        i8 = a3;
                        crpVar = crpVar3;
                        i7 = i20;
                        z = z2;
                        i9 = i21;
                    }
                }
                i19++;
                i3 = 5;
                i4 = 3;
                i5 = 32;
                i6 = 2;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        crp a4 = a(crpVar, i8, i7);
        int i24 = crpVar.b / i7;
        crp crpVar4 = new crp();
        if (z) {
            crpVar4.a(i9 - 1, i6);
            crpVar4.a(i24 - 1, 6);
            crpVar2 = a(crpVar4, 28, 4);
        } else {
            crpVar4.a(i9 - 1, i3);
            crpVar4.a(i24 - 1, 11);
            crpVar2 = a(crpVar4, 40, 4);
        }
        if (!z) {
            i15 = 14;
        }
        int i25 = i15 + (i9 << 2);
        int[] iArr = new int[i25];
        if (z) {
            for (int i26 = 0; i26 < i25; i26++) {
                iArr[i26] = i26;
            }
            i10 = i25;
        } else {
            int i27 = i25 / 2;
            i10 = i25 + 1 + (((i27 - 1) / 15) * 2);
            int i28 = i10 / 2;
            for (int i29 = 0; i29 < i27; i29++) {
                int i30 = (i29 / 15) + i29;
                iArr[(i27 - i29) - 1] = (i28 - i30) - 1;
                iArr[i27 + i29] = i30 + i28 + 1;
            }
        }
        crq crqVar = new crq(i10);
        int i31 = 0;
        int i32 = 0;
        while (i31 < i9) {
            int i33 = ((i9 - i31) << i6) + (z ? 9 : 12);
            int i34 = 0;
            while (i34 < i33) {
                int i35 = i34 << 1;
                int i36 = 0;
                while (i36 < i6) {
                    if (a4.a(i32 + i35 + i36)) {
                        int i37 = i31 << 1;
                        i11 = i24;
                        crqVar.b(iArr[i37 + i36], iArr[i37 + i34]);
                    } else {
                        i11 = i24;
                    }
                    if (a4.a((i33 << 1) + i32 + i35 + i36)) {
                        int i38 = i31 << 1;
                        crqVar.b(iArr[i38 + i34], iArr[((i25 - 1) - i38) - i36]);
                    }
                    if (a4.a((i33 << 2) + i32 + i35 + i36)) {
                        int i39 = (i25 - 1) - (i31 << 1);
                        crqVar.b(iArr[i39 - i36], iArr[i39 - i34]);
                    }
                    if (a4.a((i33 * 6) + i32 + i35 + i36)) {
                        int i40 = i31 << 1;
                        crqVar.b(iArr[((i25 - 1) - i40) - i34], iArr[i40 + i36]);
                    }
                    i36++;
                    i24 = i11;
                    i6 = 2;
                }
                i34++;
                i6 = 2;
            }
            i32 += i33 << 3;
            i31++;
            i24 = i24;
            i6 = 2;
        }
        int i41 = i24;
        a(crqVar, z, i10, crpVar2);
        if (z) {
            a(crqVar, i10 / 2, 5);
        } else {
            int i42 = i10 / 2;
            a(crqVar, i42, 7);
            int i43 = 0;
            int i44 = 0;
            while (i44 < (i25 / 2) - 1) {
                for (int i45 = i42 & 1; i45 < i10; i45 += 2) {
                    int i46 = i42 - i43;
                    crqVar.b(i46, i45);
                    int i47 = i42 + i43;
                    crqVar.b(i47, i45);
                    crqVar.b(i45, i46);
                    crqVar.b(i45, i47);
                }
                i44 += 15;
                i43 += 16;
            }
        }
        cri criVar = new cri();
        criVar.a = z;
        criVar.b = i10;
        criVar.c = i9;
        criVar.d = i41;
        criVar.e = crqVar;
        return criVar;
    }

    private static void a(crq crqVar, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    crqVar.b(i5, i4);
                    crqVar.b(i5, i6);
                    crqVar.b(i4, i5);
                    crqVar.b(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        crqVar.b(i7, i7);
        int i8 = i7 + 1;
        crqVar.b(i8, i7);
        crqVar.b(i7, i8);
        int i9 = i + i2;
        crqVar.b(i9, i7);
        crqVar.b(i9, i8);
        crqVar.b(i9, i9 - 1);
    }

    private static void a(crq crqVar, boolean z, int i, crp crpVar) {
        int i2 = i / 2;
        int i3 = 0;
        if (z) {
            while (i3 < 7) {
                int i4 = (i2 - 3) + i3;
                if (crpVar.a(i3)) {
                    crqVar.b(i4, i2 - 5);
                }
                if (crpVar.a(i3 + 7)) {
                    crqVar.b(i2 + 5, i4);
                }
                if (crpVar.a(20 - i3)) {
                    crqVar.b(i4, i2 + 5);
                }
                if (crpVar.a(27 - i3)) {
                    crqVar.b(i2 - 5, i4);
                }
                i3++;
            }
            return;
        }
        while (i3 < 10) {
            int i5 = (i2 - 5) + i3 + (i3 / 5);
            if (crpVar.a(i3)) {
                crqVar.b(i5, i2 - 7);
            }
            if (crpVar.a(i3 + 10)) {
                crqVar.b(i2 + 7, i5);
            }
            if (crpVar.a(29 - i3)) {
                crqVar.b(i5, i2 + 7);
            }
            if (crpVar.a(39 - i3)) {
                crqVar.b(i2 - 7, i5);
            }
            i3++;
        }
    }

    private static int[] b(crp crpVar, int i, int i2) {
        int[] iArr = new int[i2];
        int i3 = crpVar.b / i;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                i5 |= crpVar.a((i4 * i) + i6) ? 1 << ((i - i6) - 1) : 0;
            }
            iArr[i4] = i5;
        }
        return iArr;
    }

    private static crp a(crp crpVar, int i) {
        crp crpVar2 = new crp();
        int i2 = crpVar.b;
        int i3 = (1 << i) - 2;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = i4 + i6;
                if (i7 >= i2 || crpVar.a(i7)) {
                    i5 |= 1 << ((i - 1) - i6);
                }
            }
            int i8 = i5 & i3;
            if (i8 == i3) {
                crpVar2.a(i8, i);
            } else if (i8 == 0) {
                crpVar2.a(i5 | 1, i);
            } else {
                crpVar2.a(i5, i);
                i4 += i;
            }
            i4--;
            i4 += i;
        }
        return crpVar2;
    }

    private static crp a(crp crpVar, int i, int i2) {
        crs crsVar;
        int i3 = crpVar.b / i2;
        if (i2 == 4) {
            crsVar = crs.d;
        } else if (i2 == 6) {
            crsVar = crs.c;
        } else if (i2 == 8) {
            crsVar = crs.g;
        } else if (i2 == 10) {
            crsVar = crs.b;
        } else if (i2 == 12) {
            crsVar = crs.a;
        } else {
            throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i2)));
        }
        cru cruVar = new cru(crsVar);
        int i4 = i / i2;
        int[] b = b(crpVar, i2, i4);
        cruVar.a(b, i4 - i3);
        crp crpVar2 = new crp();
        crpVar2.a(0, i % i2);
        for (int i5 : b) {
            crpVar2.a(i5, i2);
        }
        return crpVar2;
    }
}
