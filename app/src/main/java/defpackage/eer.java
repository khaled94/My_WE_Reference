package defpackage;

import defpackage.ees;

/* renamed from: eer  reason: default package */
/* loaded from: classes2.dex */
public final class eer extends ees {
    static final byte[] a = {13, 10};
    private static final byte[] e = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] f = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private static final byte[] g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
    private final byte[] h;
    private final byte[] i;
    private final byte[] j;
    private final int k;
    private final int l;

    public eer() {
        this((byte) 0);
    }

    private eer(byte b) {
        this(a);
    }

    private eer(byte[] bArr) {
        this(bArr, (byte) 0);
    }

    private eer(byte[] bArr, byte b) {
        super(bArr == null ? 0 : bArr.length);
        this.i = g;
        String str = null;
        if (bArr != null) {
            if (!b(bArr)) {
                this.l = 4;
                this.j = null;
            } else {
                str = bArr != null ? new String(bArr, eeq.f) : str;
                throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + str + "]");
            }
        } else {
            this.l = 4;
            this.j = null;
        }
        this.k = this.l - 1;
        this.h = e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.ees
    public final void a(byte[] bArr, int i, int i2, ees.a aVar) {
        if (aVar.f) {
            return;
        }
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                byte[] a2 = a(this.l, aVar);
                aVar.h = (aVar.h + 1) % 3;
                int i4 = i + 1;
                int i5 = bArr[i];
                if (i5 < 0) {
                    i5 += 256;
                }
                aVar.a = (aVar.a << 8) + i5;
                if (aVar.h == 0) {
                    int i6 = aVar.d;
                    aVar.d = i6 + 1;
                    a2[i6] = this.h[(aVar.a >> 18) & 63];
                    int i7 = aVar.d;
                    aVar.d = i7 + 1;
                    a2[i7] = this.h[(aVar.a >> 12) & 63];
                    int i8 = aVar.d;
                    aVar.d = i8 + 1;
                    a2[i8] = this.h[(aVar.a >> 6) & 63];
                    int i9 = aVar.d;
                    aVar.d = i9 + 1;
                    a2[i9] = this.h[aVar.a & 63];
                    aVar.g += 4;
                    if (this.d > 0 && this.d <= aVar.g) {
                        System.arraycopy(this.j, 0, a2, aVar.d, this.j.length);
                        aVar.d += this.j.length;
                        aVar.g = 0;
                    }
                }
                i3++;
                i = i4;
            }
            return;
        }
        aVar.f = true;
        if (aVar.h == 0 && this.d == 0) {
            return;
        }
        byte[] a3 = a(this.l, aVar);
        int i10 = aVar.d;
        int i11 = aVar.h;
        if (i11 != 0) {
            if (i11 == 1) {
                int i12 = aVar.d;
                aVar.d = i12 + 1;
                a3[i12] = this.h[(aVar.a >> 2) & 63];
                int i13 = aVar.d;
                aVar.d = i13 + 1;
                a3[i13] = this.h[(aVar.a << 4) & 63];
                if (this.h == e) {
                    int i14 = aVar.d;
                    aVar.d = i14 + 1;
                    a3[i14] = this.c;
                    int i15 = aVar.d;
                    aVar.d = i15 + 1;
                    a3[i15] = this.c;
                }
            } else if (i11 == 2) {
                int i16 = aVar.d;
                aVar.d = i16 + 1;
                a3[i16] = this.h[(aVar.a >> 10) & 63];
                int i17 = aVar.d;
                aVar.d = i17 + 1;
                a3[i17] = this.h[(aVar.a >> 4) & 63];
                int i18 = aVar.d;
                aVar.d = i18 + 1;
                a3[i18] = this.h[(aVar.a << 2) & 63];
                if (this.h == e) {
                    int i19 = aVar.d;
                    aVar.d = i19 + 1;
                    a3[i19] = this.c;
                }
            } else {
                throw new IllegalStateException("Impossible modulus " + aVar.h);
            }
        }
        aVar.g += aVar.d - i10;
        if (this.d <= 0 || aVar.g <= 0) {
            return;
        }
        System.arraycopy(this.j, 0, a3, aVar.d, this.j.length);
        aVar.d += this.j.length;
    }

    @Override // defpackage.ees
    protected final boolean a(byte b) {
        if (b >= 0) {
            byte[] bArr = this.i;
            return b < bArr.length && bArr[b] != -1;
        }
        return false;
    }

    public static byte[] a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        eer eerVar = new eer(a, (byte) 0);
        long c = eerVar.c(bArr);
        if (c > 2147483647L) {
            throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + c + ") than the specified maximum size of 2147483647");
        }
        if (bArr != null && bArr.length != 0) {
            int length = bArr.length;
            if (bArr != null && bArr.length != 0) {
                ees.a aVar = new ees.a();
                eerVar.a(bArr, 0, length, aVar);
                eerVar.a(bArr, 0, -1, aVar);
                int i = aVar.d - aVar.e;
                byte[] bArr2 = new byte[i];
                if (aVar.c != null) {
                    int min = Math.min(aVar.c != null ? aVar.d - aVar.e : 0, i);
                    System.arraycopy(aVar.c, aVar.e, bArr2, 0, min);
                    aVar.e += min;
                    if (aVar.e >= aVar.d) {
                        aVar.c = null;
                    }
                }
                return bArr2;
            }
        }
        return bArr;
    }
}
