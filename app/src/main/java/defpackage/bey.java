package defpackage;

import com.google.android.gms.internal.places.zzbk;

/* renamed from: bey  reason: default package */
/* loaded from: classes2.dex */
final class bey extends bez {
    @Override // defpackage.bez
    final int a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                if (b < -32) {
                    if (i3 >= i2) {
                        return b;
                    }
                    if (b >= -62) {
                        i = i3 + 1;
                        if (bArr[i3] > -65) {
                        }
                    }
                    return -1;
                } else if (b >= -16) {
                    if (i3 >= i2 - 2) {
                        return bex.c(bArr, i3, i2);
                    }
                    int i4 = i3 + 1;
                    byte b2 = bArr[i3];
                    if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                        int i5 = i4 + 1;
                        if (bArr[i4] <= -65) {
                            i3 = i5 + 1;
                            if (bArr[i5] > -65) {
                            }
                        }
                    }
                    return -1;
                } else if (i3 >= i2 - 1) {
                    return bex.c(bArr, i3, i2);
                } else {
                    int i6 = i3 + 1;
                    byte b3 = bArr[i3];
                    if (b3 <= -65 && ((b != -32 || b3 >= -96) && (b != -19 || b3 < -96))) {
                        i = i6 + 1;
                        if (bArr[i6] > -65) {
                        }
                    }
                    return -1;
                }
            }
            i = i3;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.bez
    public final String b(byte[] bArr, int i, int i2) throws zzbk {
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (!(b >= 0)) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = bArr[i];
            if (!(b2 >= 0)) {
                if (bev.a(b2)) {
                    if (i6 >= i3) {
                        throw zzbk.f();
                    }
                    bev.a(b2, bArr[i6], cArr, i5);
                    i = i6 + 1;
                    i5++;
                } else if (bev.b(b2)) {
                    if (i6 >= i3 - 1) {
                        throw zzbk.f();
                    }
                    int i7 = i6 + 1;
                    bev.a(b2, bArr[i6], bArr[i7], cArr, i5);
                    i = i7 + 1;
                    i5++;
                } else if (i6 >= i3 - 2) {
                    throw zzbk.f();
                } else {
                    int i8 = i6 + 1;
                    byte b3 = bArr[i6];
                    int i9 = i8 + 1;
                    bev.a(b2, b3, bArr[i8], bArr[i9], cArr, i5);
                    i = i9 + 1;
                    i5 = i5 + 1 + 1;
                }
            } else {
                int i10 = i5 + 1;
                cArr[i5] = (char) b2;
                while (i6 < i3) {
                    byte b4 = bArr[i6];
                    if (!(b4 >= 0)) {
                        break;
                    }
                    i6++;
                    cArr[i10] = (char) b4;
                    i10++;
                }
                i = i6;
                i5 = i10;
            }
        }
        return new String(cArr, 0, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        return r10 + r0;
     */
    @Override // defpackage.bez
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bey.a(java.lang.CharSequence, byte[], int, int):int");
    }
}
