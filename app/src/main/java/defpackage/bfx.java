package defpackage;

import com.google.android.gms.internal.places.zzbk;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bfx  reason: default package */
/* loaded from: classes2.dex */
public final class bfx {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(byte[] bArr, int i, bfw bfwVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            bfwVar.a = b;
            return i2;
        }
        return a(b, bArr, i2, bfwVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, byte[] bArr, int i2, bfw bfwVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            bfwVar.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            bfwVar.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            bfwVar.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            bfwVar.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                bfwVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(byte[] bArr, int i, bfw bfwVar) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            bfwVar.b = j;
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
        bfwVar.b = j2;
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
    public static int c(byte[] bArr, int i, bfw bfwVar) throws zzbk {
        int a = a(bArr, i, bfwVar);
        int i2 = bfwVar.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                bfwVar.c = "";
                return a;
            }
            bfwVar.c = new String(bArr, a, i2, bcd.a);
            return a + i2;
        }
        throw zzbk.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(byte[] bArr, int i, bfw bfwVar) throws zzbk {
        int a = a(bArr, i, bfwVar);
        int i2 = bfwVar.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                bfwVar.c = "";
                return a;
            }
            bfwVar.c = bex.b(bArr, a, i2);
            return a + i2;
        }
        throw zzbk.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(byte[] bArr, int i, bfw bfwVar) throws zzbk {
        int a = a(bArr, i, bfwVar);
        int i2 = bfwVar.a;
        if (i2 < 0) {
            throw zzbk.b();
        }
        if (i2 > bArr.length - a) {
            throw zzbk.a();
        }
        if (i2 == 0) {
            bfwVar.c = bgb.b;
            return a;
        }
        bfwVar.c = bgb.a(bArr, a, i2);
        return a + i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(bdy bdyVar, byte[] bArr, int i, int i2, bfw bfwVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = a(i4, bArr, i3, bfwVar);
            i4 = bfwVar.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzbk.a();
        }
        Object a = bdyVar.a();
        int i6 = i4 + i5;
        bdyVar.a(a, bArr, i5, i6, bfwVar);
        bdyVar.c(a);
        bfwVar.c = a;
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(bdy bdyVar, byte[] bArr, int i, int i2, int i3, bfw bfwVar) throws IOException {
        bdl bdlVar = (bdl) bdyVar;
        Object a = bdlVar.a();
        int a2 = bdlVar.a((bdl) a, bArr, i, i2, i3, bfwVar);
        bdlVar.c((bdl) a);
        bfwVar.c = a;
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, byte[] bArr, int i2, int i3, bch<?> bchVar, bfw bfwVar) {
        bce bceVar = (bce) bchVar;
        int a = a(bArr, i2, bfwVar);
        bceVar.c(bfwVar.a);
        while (a < i3) {
            int a2 = a(bArr, a, bfwVar);
            if (i != bfwVar.a) {
                break;
            }
            a = a(bArr, a2, bfwVar);
            bceVar.c(bfwVar.a);
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(byte[] bArr, int i, bch<?> bchVar, bfw bfwVar) throws IOException {
        bce bceVar = (bce) bchVar;
        int a = a(bArr, i, bfwVar);
        int i2 = bfwVar.a + a;
        while (a < i2) {
            a = a(bArr, a, bfwVar);
            bceVar.c(bfwVar.a);
        }
        if (a == i2) {
            return a;
        }
        throw zzbk.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(bdy<?> bdyVar, int i, byte[] bArr, int i2, int i3, bch<?> bchVar, bfw bfwVar) throws IOException {
        int a = a(bdyVar, bArr, i2, i3, bfwVar);
        bchVar.add(bfwVar.c);
        while (a < i3) {
            int a2 = a(bArr, a, bfwVar);
            if (i != bfwVar.a) {
                break;
            }
            a = a(bdyVar, bArr, a2, i3, bfwVar);
            bchVar.add(bfwVar.c);
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, byte[] bArr, int i2, int i3, ben benVar, bfw bfwVar) throws zzbk {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int b = b(bArr, i2, bfwVar);
                benVar.a(i, Long.valueOf(bfwVar.b));
                return b;
            } else if (i4 == 1) {
                benVar.a(i, Long.valueOf(b(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int a = a(bArr, i2, bfwVar);
                int i5 = bfwVar.a;
                if (i5 < 0) {
                    throw zzbk.b();
                }
                if (i5 > bArr.length - a) {
                    throw zzbk.a();
                }
                if (i5 == 0) {
                    benVar.a(i, bgb.b);
                } else {
                    benVar.a(i, bgb.a(bArr, a, i5));
                }
                return a + i5;
            } else if (i4 != 3) {
                if (i4 == 5) {
                    benVar.a(i, Integer.valueOf(a(bArr, i2)));
                    return i2 + 4;
                }
                throw zzbk.c();
            } else {
                ben b2 = ben.b();
                int i6 = (i & (-8)) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int a2 = a(bArr, i2, bfwVar);
                    int i8 = bfwVar.a;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = a2;
                        break;
                    }
                    int a3 = a(i7, bArr, a2, i3, b2, bfwVar);
                    i7 = i8;
                    i2 = a3;
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzbk.e();
                }
                benVar.a(i, b2);
                return i2;
            }
        }
        throw zzbk.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, byte[] bArr, int i2, int i3, bfw bfwVar) throws zzbk {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return b(bArr, i2, bfwVar);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return a(bArr, i2, bfwVar) + bfwVar.a;
            }
            if (i4 != 3) {
                if (i4 != 5) {
                    throw zzbk.c();
                }
                return i2 + 4;
            }
            int i5 = (i & (-8)) | 4;
            int i6 = 0;
            while (i2 < i3) {
                i2 = a(bArr, i2, bfwVar);
                i6 = bfwVar.a;
                if (i6 == i5) {
                    break;
                }
                i2 = a(i6, bArr, i2, i3, bfwVar);
            }
            if (i2 <= i3 && i6 == i5) {
                return i2;
            }
            throw zzbk.e();
        }
        throw zzbk.c();
    }
}
