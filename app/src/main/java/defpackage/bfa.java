package defpackage;

import com.google.android.gms.internal.places.zzbk;

/* renamed from: bfa  reason: default package */
/* loaded from: classes2.dex */
final class bfa extends bez {
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b0, code lost:
        return -1;
     */
    @Override // defpackage.bez
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int a(byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfa.a(byte[], int, int):int");
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
            byte a = beu.a(bArr, i);
            if (!(a >= 0)) {
                break;
            }
            i++;
            cArr[i4] = (char) a;
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte a2 = beu.a(bArr, i);
            if (!(a2 >= 0)) {
                if (bev.a(a2)) {
                    if (i6 >= i3) {
                        throw zzbk.f();
                    }
                    bev.a(a2, beu.a(bArr, i6), cArr, i5);
                    i = i6 + 1;
                    i5++;
                } else if (bev.b(a2)) {
                    if (i6 >= i3 - 1) {
                        throw zzbk.f();
                    }
                    int i7 = i6 + 1;
                    bev.a(a2, beu.a(bArr, i6), beu.a(bArr, i7), cArr, i5);
                    i = i7 + 1;
                    i5++;
                } else if (i6 >= i3 - 2) {
                    throw zzbk.f();
                } else {
                    int i8 = i6 + 1;
                    int i9 = i8 + 1;
                    bev.a(a2, beu.a(bArr, i6), beu.a(bArr, i8), beu.a(bArr, i9), cArr, i5);
                    i = i9 + 1;
                    i5 = i5 + 1 + 1;
                }
            } else {
                int i10 = i5 + 1;
                cArr[i5] = (char) a2;
                while (i6 < i3) {
                    byte a3 = beu.a(bArr, i6);
                    if (!(a3 >= 0)) {
                        break;
                    }
                    i6++;
                    cArr[i10] = (char) a3;
                    i10++;
                }
                i = i6;
                i5 = i10;
            }
        }
        return new String(cArr, 0, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.bez
    public final int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        char c;
        long j;
        long j2;
        long j3;
        int i3;
        char charAt;
        long j4 = i;
        long j5 = i2 + j4;
        int length = charSequence.length();
        if (length > i2 || bArr.length - i2 < i) {
            char charAt2 = charSequence.charAt(length - 1);
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(charAt2);
            sb.append(" at index ");
            sb.append(i + i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i4 = 0;
        while (true) {
            c = 128;
            j = 1;
            if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                break;
            }
            beu.a(bArr, j4, (byte) charAt);
            i4++;
            j4 = 1 + j4;
        }
        if (i4 == length) {
            return (int) j4;
        }
        while (i4 < length) {
            char charAt3 = charSequence.charAt(i4);
            if (charAt3 >= c || j4 >= j5) {
                if (charAt3 < 2048 && j4 <= j5 - 2) {
                    long j6 = j4 + j;
                    beu.a(bArr, j4, (byte) ((charAt3 >>> 6) | 960));
                    beu.a(bArr, j6, (byte) ((charAt3 & '?') | 128));
                    j2 = j6 + j;
                    j3 = j;
                } else if ((charAt3 >= 55296 && 57343 >= charAt3) || j4 > j5 - 3) {
                    if (j4 <= j5 - 4) {
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char charAt4 = charSequence.charAt(i5);
                            if (Character.isSurrogatePair(charAt3, charAt4)) {
                                int codePoint = Character.toCodePoint(charAt3, charAt4);
                                long j7 = j4 + 1;
                                beu.a(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                long j8 = j7 + 1;
                                beu.a(bArr, j7, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j9 = j8 + 1;
                                beu.a(bArr, j8, (byte) (((codePoint >>> 6) & 63) | 128));
                                j3 = 1;
                                j2 = j9 + 1;
                                beu.a(bArr, j9, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new bfb(i4 - 1, length);
                    } else if (55296 <= charAt3 && charAt3 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i3)))) {
                        throw new bfb(i4, length);
                    } else {
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("Failed writing ");
                        sb2.append(charAt3);
                        sb2.append(" at index ");
                        sb2.append(j4);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                } else {
                    long j10 = j4 + j;
                    beu.a(bArr, j4, (byte) ((charAt3 >>> '\f') | 480));
                    long j11 = j10 + j;
                    beu.a(bArr, j10, (byte) (((charAt3 >>> 6) & 63) | 128));
                    beu.a(bArr, j11, (byte) ((charAt3 & '?') | 128));
                    j2 = j11 + 1;
                    j3 = 1;
                }
                i4++;
                c = 128;
                long j12 = j3;
                j4 = j2;
                j = j12;
            } else {
                long j13 = j4 + j;
                beu.a(bArr, j4, (byte) charAt3);
                j3 = j;
                j2 = j13;
            }
            i4++;
            c = 128;
            long j122 = j3;
            j4 = j2;
            j = j122;
        }
        return (int) j4;
    }

    private static int a(byte[] bArr, int i, long j, int i2) {
        int b;
        int b2;
        int b3;
        if (i2 == 0) {
            b = bex.b(i);
            return b;
        } else if (i2 == 1) {
            b2 = bex.b(i, beu.a(bArr, j));
            return b2;
        } else if (i2 == 2) {
            b3 = bex.b(i, beu.a(bArr, j), beu.a(bArr, j + 1));
            return b3;
        } else {
            throw new AssertionError();
        }
    }
}
