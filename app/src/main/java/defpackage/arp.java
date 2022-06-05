package defpackage;

import com.google.android.gms.internal.measurement.zzfi;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: arp  reason: default package */
/* loaded from: classes.dex */
public final class arp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(byte[] bArr, int i, aro aroVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            aroVar.a = b;
            return i2;
        }
        return a(b, bArr, i2, aroVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, byte[] bArr, int i2, aro aroVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            aroVar.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            aroVar.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            aroVar.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            aroVar.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                aroVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(byte[] bArr, int i, aro aroVar) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            aroVar.b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (b & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        aroVar.b = j2;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long b(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double c(byte[] bArr, int i) {
        return Double.longBitsToDouble(b(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float d(byte[] bArr, int i) {
        return Float.intBitsToFloat(a(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(byte[] bArr, int i, aro aroVar) throws zzfi {
        int a = a(bArr, i, aroVar);
        int i2 = aroVar.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                aroVar.c = "";
                return a;
            }
            aroVar.c = new String(bArr, a, i2, atb.a);
            return a + i2;
        }
        throw zzfi.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(byte[] bArr, int i, aro aroVar) throws zzfi {
        int a = a(bArr, i, aroVar);
        int i2 = aroVar.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                aroVar.c = "";
                return a;
            }
            aroVar.c = avx.b(bArr, a, i2);
            return a + i2;
        }
        throw zzfi.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(byte[] bArr, int i, aro aroVar) throws zzfi {
        int a = a(bArr, i, aroVar);
        int i2 = aroVar.a;
        if (i2 < 0) {
            throw zzfi.b();
        }
        if (i2 > bArr.length - a) {
            throw zzfi.a();
        }
        if (i2 == 0) {
            aroVar.c = art.a;
            return a;
        }
        aroVar.c = art.a(bArr, a, i2);
        return a + i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(aux auxVar, byte[] bArr, int i, int i2, aro aroVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = a(i4, bArr, i3, aroVar);
            i4 = aroVar.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzfi.a();
        }
        Object a = auxVar.a();
        int i6 = i4 + i5;
        auxVar.a(a, bArr, i5, i6, aroVar);
        auxVar.c(a);
        aroVar.c = a;
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(aux auxVar, byte[] bArr, int i, int i2, int i3, aro aroVar) throws IOException {
        aum aumVar = (aum) auxVar;
        Object a = aumVar.a();
        int a2 = aumVar.a((aum) a, bArr, i, i2, i3, aroVar);
        aumVar.c((aum) a);
        aroVar.c = a;
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, byte[] bArr, int i2, int i3, ati<?> atiVar, aro aroVar) {
        atd atdVar = (atd) atiVar;
        int a = a(bArr, i2, aroVar);
        atdVar.d(aroVar.a);
        while (a < i3) {
            int a2 = a(bArr, a, aroVar);
            if (i != aroVar.a) {
                break;
            }
            a = a(bArr, a2, aroVar);
            atdVar.d(aroVar.a);
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(byte[] bArr, int i, ati<?> atiVar, aro aroVar) throws IOException {
        atd atdVar = (atd) atiVar;
        int a = a(bArr, i, aroVar);
        int i2 = aroVar.a + a;
        while (a < i2) {
            a = a(bArr, a, aroVar);
            atdVar.d(aroVar.a);
        }
        if (a == i2) {
            return a;
        }
        throw zzfi.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(aux<?> auxVar, int i, byte[] bArr, int i2, int i3, ati<?> atiVar, aro aroVar) throws IOException {
        int a = a(auxVar, bArr, i2, i3, aroVar);
        atiVar.add(aroVar.c);
        while (a < i3) {
            int a2 = a(bArr, a, aroVar);
            if (i != aroVar.a) {
                break;
            }
            a = a(auxVar, bArr, a2, i3, aroVar);
            atiVar.add(aroVar.c);
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, byte[] bArr, int i2, int i3, avr avrVar, aro aroVar) throws zzfi {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int b = b(bArr, i2, aroVar);
                avrVar.a(i, Long.valueOf(aroVar.b));
                return b;
            } else if (i4 == 1) {
                avrVar.a(i, Long.valueOf(b(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int a = a(bArr, i2, aroVar);
                int i5 = aroVar.a;
                if (i5 < 0) {
                    throw zzfi.b();
                }
                if (i5 > bArr.length - a) {
                    throw zzfi.a();
                }
                if (i5 == 0) {
                    avrVar.a(i, art.a);
                } else {
                    avrVar.a(i, art.a(bArr, a, i5));
                }
                return a + i5;
            } else if (i4 != 3) {
                if (i4 == 5) {
                    avrVar.a(i, Integer.valueOf(a(bArr, i2)));
                    return i2 + 4;
                }
                throw zzfi.d();
            } else {
                avr b2 = avr.b();
                int i6 = (i & (-8)) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int a2 = a(bArr, i2, aroVar);
                    int i8 = aroVar.a;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = a2;
                        break;
                    }
                    int a3 = a(i7, bArr, a2, i3, b2, aroVar);
                    i7 = i8;
                    i2 = a3;
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzfi.h();
                }
                avrVar.a(i, b2);
                return i2;
            }
        }
        throw zzfi.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, byte[] bArr, int i2, int i3, aro aroVar) throws zzfi {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return b(bArr, i2, aroVar);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return a(bArr, i2, aroVar) + aroVar.a;
            }
            if (i4 != 3) {
                if (i4 != 5) {
                    throw zzfi.d();
                }
                return i2 + 4;
            }
            int i5 = (i & (-8)) | 4;
            int i6 = 0;
            while (i2 < i3) {
                i2 = a(bArr, i2, aroVar);
                i6 = aroVar.a;
                if (i6 == i5) {
                    break;
                }
                i2 = a(i6, bArr, i2, i3, aroVar);
            }
            if (i2 <= i3 && i6 == i5) {
                return i2;
            }
            throw zzfi.h();
        }
        throw zzfi.d();
    }
}
