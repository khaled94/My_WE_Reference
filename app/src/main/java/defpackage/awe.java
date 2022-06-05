package defpackage;

import com.google.android.gms.internal.measurement.zzfi;
import java.nio.ByteBuffer;

/* renamed from: awe  reason: default package */
/* loaded from: classes.dex */
final class awe extends avy {
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005b, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b0, code lost:
        return -1;
     */
    @Override // defpackage.avy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int b(byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awe.b(byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.avy
    public final String c(byte[] bArr, int i, int i2) throws zzfi {
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte a = avu.a(bArr, i);
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
            byte a2 = avu.a(bArr, i);
            if (!(a2 >= 0)) {
                if (awa.a(a2)) {
                    if (i6 >= i3) {
                        throw zzfi.i();
                    }
                    awa.a(a2, avu.a(bArr, i6), cArr, i5);
                    i = i6 + 1;
                    i5++;
                } else if (awa.b(a2)) {
                    if (i6 >= i3 - 1) {
                        throw zzfi.i();
                    }
                    int i7 = i6 + 1;
                    awa.a(a2, avu.a(bArr, i6), avu.a(bArr, i7), cArr, i5);
                    i = i7 + 1;
                    i5++;
                } else if (i6 >= i3 - 2) {
                    throw zzfi.i();
                } else {
                    int i8 = i6 + 1;
                    int i9 = i8 + 1;
                    awa.a(a2, avu.a(bArr, i6), avu.a(bArr, i8), avu.a(bArr, i9), cArr, i5);
                    i = i9 + 1;
                    i5 = i5 + 1 + 1;
                }
            } else {
                int i10 = i5 + 1;
                cArr[i5] = (char) a2;
                while (i6 < i3) {
                    byte a3 = avu.a(bArr, i6);
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
    @Override // defpackage.avy
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
            avu.a(bArr, j4, (byte) charAt);
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
                    avu.a(bArr, j4, (byte) ((charAt3 >>> 6) | 960));
                    avu.a(bArr, j6, (byte) ((charAt3 & '?') | 128));
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
                                avu.a(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                long j8 = j7 + 1;
                                avu.a(bArr, j7, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j9 = j8 + 1;
                                avu.a(bArr, j8, (byte) (((codePoint >>> 6) & 63) | 128));
                                j3 = 1;
                                j2 = j9 + 1;
                                avu.a(bArr, j9, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new awb(i4 - 1, length);
                    } else if (55296 <= charAt3 && charAt3 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i3)))) {
                        throw new awb(i4, length);
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
                    avu.a(bArr, j4, (byte) ((charAt3 >>> '\f') | 480));
                    long j11 = j10 + j;
                    avu.a(bArr, j10, (byte) (((charAt3 >>> 6) & 63) | 128));
                    avu.a(bArr, j11, (byte) ((charAt3 & '?') | 128));
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
                avu.a(bArr, j4, (byte) charAt3);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.avy
    public final void a(CharSequence charSequence, ByteBuffer byteBuffer) {
        char c;
        long j;
        int i;
        char charAt;
        long a = avu.a(byteBuffer);
        long position = byteBuffer.position() + a;
        long limit = byteBuffer.limit() + a;
        int length = charSequence.length();
        if (length > limit - position) {
            char charAt2 = charSequence.charAt(length - 1);
            int limit2 = byteBuffer.limit();
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(charAt2);
            sb.append(" at index ");
            sb.append(limit2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i2 = 0;
        while (true) {
            c = 128;
            if (i2 >= length || (charAt = charSequence.charAt(i2)) >= 128) {
                break;
            }
            avu.a(position, (byte) charAt);
            i2++;
            position++;
        }
        if (i2 == length) {
            byteBuffer.position((int) (position - a));
            return;
        }
        while (i2 < length) {
            char charAt3 = charSequence.charAt(i2);
            if (charAt3 < c && position < limit) {
                avu.a(position, (byte) charAt3);
                position++;
                j = a;
            } else if (charAt3 >= 2048 || position > limit - 2) {
                j = a;
                if ((charAt3 >= 55296 && 57343 >= charAt3) || position > limit - 3) {
                    if (position <= limit - 4) {
                        int i3 = i2 + 1;
                        if (i3 != length) {
                            char charAt4 = charSequence.charAt(i3);
                            if (Character.isSurrogatePair(charAt3, charAt4)) {
                                int codePoint = Character.toCodePoint(charAt3, charAt4);
                                long j2 = position + 1;
                                avu.a(position, (byte) ((codePoint >>> 18) | 240));
                                long j3 = j2 + 1;
                                avu.a(j2, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j4 = j3 + 1;
                                avu.a(j3, (byte) (((codePoint >>> 6) & 63) | 128));
                                long j5 = j4 + 1;
                                avu.a(j4, (byte) ((codePoint & 63) | 128));
                                i2 = i3;
                                position = j5;
                            } else {
                                i2 = i3;
                            }
                        }
                        throw new awb(i2 - 1, length);
                    } else if (55296 <= charAt3 && charAt3 <= 57343 && ((i = i2 + 1) == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i)))) {
                        throw new awb(i2, length);
                    } else {
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("Failed writing ");
                        sb2.append(charAt3);
                        sb2.append(" at index ");
                        sb2.append(position);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                }
                long j6 = position + 1;
                avu.a(position, (byte) ((charAt3 >>> '\f') | 480));
                long j7 = j6 + 1;
                avu.a(j6, (byte) (((charAt3 >>> 6) & 63) | 128));
                avu.a(j7, (byte) ((charAt3 & '?') | 128));
                position = j7 + 1;
            } else {
                j = a;
                long j8 = position + 1;
                avu.a(position, (byte) ((charAt3 >>> 6) | 960));
                avu.a(j8, (byte) ((charAt3 & '?') | 128));
                position = j8 + 1;
            }
            i2++;
            a = j;
            c = 128;
        }
        byteBuffer.position((int) (position - a));
    }

    private static int a(byte[] bArr, int i, long j, int i2) {
        int b;
        int b2;
        int b3;
        if (i2 == 0) {
            b = avx.b(i);
            return b;
        } else if (i2 == 1) {
            b2 = avx.b(i, avu.a(bArr, j));
            return b2;
        } else if (i2 == 2) {
            b3 = avx.b(i, avu.a(bArr, j), avu.a(bArr, j + 1));
            return b3;
        } else {
            throw new AssertionError();
        }
    }
}
