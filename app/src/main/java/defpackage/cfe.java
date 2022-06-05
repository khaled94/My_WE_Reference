package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

/* renamed from: cfe  reason: default package */
/* loaded from: classes2.dex */
public final class cfe {
    private static final b a;

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static boolean a(byte[] bArr) {
        return a.a(bArr, 0, bArr.length);
    }

    public static boolean a(byte[] bArr, int i, int i2) {
        return a.a(bArr, i, i2);
    }

    /* renamed from: cfe$d */
    /* loaded from: classes2.dex */
    public static class d extends IllegalArgumentException {
        d(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    public static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new d(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }

    public static int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return a.a(charSequence, bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        return a.c(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cfe$b */
    /* loaded from: classes2.dex */
    public static abstract class b {
        abstract int a(CharSequence charSequence, byte[] bArr, int i, int i2);

        abstract int b(byte[] bArr, int i, int i2);

        abstract String c(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException;

        b() {
        }

        final boolean a(byte[] bArr, int i, int i2) {
            return b(bArr, i, i2) == 0;
        }
    }

    /* renamed from: cfe$c */
    /* loaded from: classes2.dex */
    static final class c extends b {
        c() {
        }

        @Override // defpackage.cfe.b
        final String c(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
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
                    if (a.a(b2)) {
                        if (i6 >= i3) {
                            throw InvalidProtocolBufferException.i();
                        }
                        a.a(b2, bArr[i6], cArr, i5);
                        i = i6 + 1;
                        i5++;
                    } else if (a.b(b2)) {
                        if (i6 >= i3 - 1) {
                            throw InvalidProtocolBufferException.i();
                        }
                        int i7 = i6 + 1;
                        a.a(b2, bArr[i6], bArr[i7], cArr, i5);
                        i = i7 + 1;
                        i5++;
                    } else if (i6 >= i3 - 2) {
                        throw InvalidProtocolBufferException.i();
                    } else {
                        int i8 = i6 + 1;
                        byte b3 = bArr[i6];
                        int i9 = i8 + 1;
                        a.a(b2, b3, bArr[i8], bArr[i9], cArr, i5);
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

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
            return r10 + r0;
         */
        @Override // defpackage.cfe.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        final int a(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 251
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.cfe.c.a(java.lang.CharSequence, byte[], int, int):int");
        }

        @Override // defpackage.cfe.b
        final int b(byte[] bArr, int i, int i2) {
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
                            return cfe.c(bArr, i3, i2);
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
                        return cfe.c(bArr, i3, i2);
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
    }

    /* renamed from: cfe$e */
    /* loaded from: classes2.dex */
    static final class e extends b {
        e() {
        }

        @Override // defpackage.cfe.b
        final int b(byte[] bArr, int i, int i2) {
            if ((i | i2 | (bArr.length - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            long j = i;
            return a(bArr, j, (int) (i2 - j));
        }

        @Override // defpackage.cfe.b
        final String c(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte a = cfd.a(bArr, i);
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
                byte a2 = cfd.a(bArr, i);
                if (!(a2 >= 0)) {
                    if (a.a(a2)) {
                        if (i6 >= i3) {
                            throw InvalidProtocolBufferException.i();
                        }
                        a.a(a2, cfd.a(bArr, i6), cArr, i5);
                        i = i6 + 1;
                        i5++;
                    } else if (a.b(a2)) {
                        if (i6 >= i3 - 1) {
                            throw InvalidProtocolBufferException.i();
                        }
                        int i7 = i6 + 1;
                        a.a(a2, cfd.a(bArr, i6), cfd.a(bArr, i7), cArr, i5);
                        i = i7 + 1;
                        i5++;
                    } else if (i6 >= i3 - 2) {
                        throw InvalidProtocolBufferException.i();
                    } else {
                        int i8 = i6 + 1;
                        int i9 = i8 + 1;
                        a.a(a2, cfd.a(bArr, i6), cfd.a(bArr, i8), cfd.a(bArr, i9), cArr, i5);
                        i = i9 + 1;
                        i5 = i5 + 1 + 1;
                    }
                } else {
                    int i10 = i5 + 1;
                    cArr[i5] = (char) a2;
                    while (i6 < i3) {
                        byte a3 = cfd.a(bArr, i6);
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

        @Override // defpackage.cfe.b
        final int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
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
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i2));
            }
            int i4 = 0;
            while (true) {
                c = 128;
                j = 1;
                if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                cfd.a(bArr, j4, (byte) charAt);
                i4++;
                j4 = 1 + j4;
            }
            if (i4 == length) {
                return (int) j4;
            }
            while (i4 < length) {
                char charAt2 = charSequence.charAt(i4);
                if (charAt2 >= c || j4 >= j5) {
                    if (charAt2 < 2048 && j4 <= j5 - 2) {
                        long j6 = j4 + j;
                        cfd.a(bArr, j4, (byte) ((charAt2 >>> 6) | 960));
                        cfd.a(bArr, j6, (byte) ((charAt2 & '?') | 128));
                        j2 = j6 + j;
                        j3 = j;
                    } else if ((charAt2 >= 55296 && 57343 >= charAt2) || j4 > j5 - 3) {
                        if (j4 <= j5 - 4) {
                            int i5 = i4 + 1;
                            if (i5 != length) {
                                char charAt3 = charSequence.charAt(i5);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    long j7 = j4 + 1;
                                    cfd.a(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                    long j8 = j7 + 1;
                                    cfd.a(bArr, j7, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j9 = j8 + 1;
                                    cfd.a(bArr, j8, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j3 = 1;
                                    j2 = j9 + 1;
                                    cfd.a(bArr, j9, (byte) ((codePoint & 63) | 128));
                                    i4 = i5;
                                } else {
                                    i4 = i5;
                                }
                            }
                            throw new d(i4 - 1, length);
                        } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                            throw new d(i4, length);
                        } else {
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j4);
                        }
                    } else {
                        long j10 = j4 + j;
                        cfd.a(bArr, j4, (byte) ((charAt2 >>> '\f') | 480));
                        long j11 = j10 + j;
                        cfd.a(bArr, j10, (byte) (((charAt2 >>> 6) & 63) | 128));
                        cfd.a(bArr, j11, (byte) ((charAt2 & '?') | 128));
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
                    cfd.a(bArr, j4, (byte) charAt2);
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
            if (i2 != 0) {
                if (i2 == 1) {
                    return cfe.b(i, cfd.a(bArr, j));
                }
                if (i2 == 2) {
                    return cfe.b(i, cfd.a(bArr, j), cfd.a(bArr, j + 1));
                }
                throw new AssertionError();
            }
            return cfe.b(i);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00a9, code lost:
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static int a(byte[] r11, long r12, int r14) {
            /*
                r0 = 0
                r1 = 1
                r3 = 16
                if (r14 >= r3) goto L9
                r3 = 0
                goto L1b
            L9:
                r4 = r12
                r3 = 0
            Lb:
                if (r3 >= r14) goto L1a
                long r6 = r4 + r1
                byte r4 = defpackage.cfd.a(r11, r4)
                if (r4 >= 0) goto L16
                goto L1b
            L16:
                int r3 = r3 + 1
                r4 = r6
                goto Lb
            L1a:
                r3 = r14
            L1b:
                int r14 = r14 - r3
                long r3 = (long) r3
                long r12 = r12 + r3
            L1e:
                r3 = 0
            L1f:
                if (r14 <= 0) goto L32
                long r3 = r12 + r1
                byte r12 = defpackage.cfd.a(r11, r12)
                if (r12 < 0) goto L2f
                int r14 = r14 + (-1)
                r9 = r3
                r3 = r12
                r12 = r9
                goto L1f
            L2f:
                r9 = r3
                r3 = r12
                r12 = r9
            L32:
                if (r14 != 0) goto L35
                return r0
            L35:
                int r14 = r14 + (-1)
                r4 = -32
                r5 = -65
                r6 = -1
                if (r3 >= r4) goto L53
                if (r14 != 0) goto L41
                return r3
            L41:
                int r14 = r14 + (-1)
                r4 = -62
                if (r3 < r4) goto L52
                long r3 = r12 + r1
                byte r12 = defpackage.cfd.a(r11, r12)
                if (r12 <= r5) goto L50
                goto L52
            L50:
                r12 = r3
                goto L1e
            L52:
                return r6
            L53:
                r7 = -16
                if (r3 >= r7) goto L7e
                r7 = 2
                if (r14 >= r7) goto L5f
                int r11 = a(r11, r3, r12, r14)
                return r11
            L5f:
                int r14 = r14 + (-2)
                long r7 = r12 + r1
                byte r12 = defpackage.cfd.a(r11, r12)
                if (r12 > r5) goto L7d
                r13 = -96
                if (r3 != r4) goto L6f
                if (r12 < r13) goto L7d
            L6f:
                r4 = -19
                if (r3 != r4) goto L75
                if (r12 >= r13) goto L7d
            L75:
                long r12 = r7 + r1
                byte r3 = defpackage.cfd.a(r11, r7)
                if (r3 <= r5) goto L1e
            L7d:
                return r6
            L7e:
                r4 = 3
                if (r14 >= r4) goto L86
                int r11 = a(r11, r3, r12, r14)
                return r11
            L86:
                int r14 = r14 + (-3)
                long r7 = r12 + r1
                byte r12 = defpackage.cfd.a(r11, r12)
                if (r12 > r5) goto La9
                int r13 = r3 << 28
                int r12 = r12 + 112
                int r13 = r13 + r12
                int r12 = r13 >> 30
                if (r12 != 0) goto La9
                long r12 = r7 + r1
                byte r3 = defpackage.cfd.a(r11, r7)
                if (r3 > r5) goto La9
                long r3 = r12 + r1
                byte r12 = defpackage.cfd.a(r11, r12)
                if (r12 <= r5) goto L50
            La9:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.cfe.e.a(byte[], long, int):int");
        }
    }

    /* renamed from: cfe$a */
    /* loaded from: classes2.dex */
    static class a {
        static /* synthetic */ boolean a(byte b) {
            return b < -32;
        }

        static /* synthetic */ boolean b(byte b) {
            return b < -16;
        }

        private static boolean c(byte b) {
            return b > -65;
        }

        private a() {
        }

        static /* synthetic */ void a(byte b, byte b2, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (b < -62 || c(b2)) {
                throw InvalidProtocolBufferException.i();
            }
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
        }

        static /* synthetic */ void a(byte b, byte b2, byte b3, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (c(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || c(b3)))) {
                throw InvalidProtocolBufferException.i();
            }
            cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
        }

        static /* synthetic */ void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (c(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || c(b3) || c(b4)) {
                throw InvalidProtocolBufferException.i();
            }
            int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
            cArr[i] = (char) ((i2 >>> 10) + 55232);
            cArr[i + 1] = (char) ((i2 & 1023) + 56320);
        }
    }

    private cfe() {
    }

    static /* synthetic */ int c(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 == 1) {
                return b(b2, bArr[i]);
            }
            if (i3 == 2) {
                return b(b2, bArr[i], bArr[i + 1]);
            }
            throw new AssertionError();
        }
        return b(b2);
    }

    static {
        b bVar;
        if ((cfd.a() && cfd.b()) && !ccp.a()) {
            bVar = new e();
        } else {
            bVar = new c();
        }
        a = bVar;
    }
}
