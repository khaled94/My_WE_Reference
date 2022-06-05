package defpackage;

import androidx.core.location.LocationRequestCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* renamed from: edu  reason: default package */
/* loaded from: classes2.dex */
public final class edu implements edv, edw, Cloneable, ByteChannel {
    private static final byte[] c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    eej a;
    public long b;

    @Override // defpackage.edv, defpackage.edw
    public final edu b() {
        return this;
    }

    @Override // defpackage.edw
    public final edu c() {
        return this;
    }

    @Override // defpackage.eem, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.edv, defpackage.eem, java.io.Flushable
    public final void flush() {
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.edv
    public final /* bridge */ /* synthetic */ edv t() throws IOException {
        return this;
    }

    @Override // defpackage.edw
    public final boolean d() {
        return this.b == 0;
    }

    @Override // defpackage.edw
    public final void a(long j) throws EOFException {
        if (this.b >= j) {
            return;
        }
        throw new EOFException();
    }

    @Override // defpackage.edw
    public final boolean b(long j) {
        return this.b >= j;
    }

    @Override // defpackage.edw
    public final InputStream e() {
        return new InputStream() { // from class: edu.2
            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            @Override // java.io.InputStream
            public final int read() {
                if (edu.this.b > 0) {
                    return edu.this.g() & 255;
                }
                return -1;
            }

            @Override // java.io.InputStream
            public final int read(byte[] bArr, int i, int i2) {
                return edu.this.a(bArr, i, i2);
            }

            @Override // java.io.InputStream
            public final int available() {
                return (int) Math.min(edu.this.b, 2147483647L);
            }

            public final String toString() {
                return edu.this + ".inputStream()";
            }
        };
    }

    public final edu a(edu eduVar, long j, long j2) {
        if (eduVar == null) {
            throw new IllegalArgumentException("out == null");
        }
        eep.a(this.b, j, j2);
        if (j2 == 0) {
            return this;
        }
        eduVar.b += j2;
        eej eejVar = this.a;
        while (j >= eejVar.c - eejVar.b) {
            j -= eejVar.c - eejVar.b;
            eejVar = eejVar.f;
        }
        while (j2 > 0) {
            eej a = eejVar.a();
            a.b = (int) (a.b + j);
            a.c = Math.min(a.b + ((int) j2), a.c);
            eej eejVar2 = eduVar.a;
            if (eejVar2 == null) {
                a.g = a;
                a.f = a;
                eduVar.a = a;
            } else {
                eejVar2.g.a(a);
            }
            j2 -= a.c - a.b;
            eejVar = eejVar.f;
            j = 0;
        }
        return this;
    }

    public final long f() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        eej eejVar = this.a.g;
        return (eejVar.c >= 8192 || !eejVar.e) ? j : j - (eejVar.c - eejVar.b);
    }

    @Override // defpackage.edw
    public final byte g() {
        if (this.b == 0) {
            throw new IllegalStateException("size == 0");
        }
        eej eejVar = this.a;
        int i = eejVar.b;
        int i2 = eejVar.c;
        int i3 = i + 1;
        byte b = eejVar.a[i];
        this.b--;
        if (i3 == i2) {
            this.a = eejVar.b();
            eek.a(eejVar);
        } else {
            eejVar.b = i3;
        }
        return b;
    }

    public final byte c(long j) {
        eep.a(this.b, j, 1L);
        long j2 = this.b;
        if (j2 - j > j) {
            eej eejVar = this.a;
            while (true) {
                long j3 = eejVar.c - eejVar.b;
                if (j >= j3) {
                    j -= j3;
                    eejVar = eejVar.f;
                } else {
                    return eejVar.a[eejVar.b + ((int) j)];
                }
            }
        } else {
            long j4 = j - j2;
            eej eejVar2 = this.a;
            do {
                eejVar2 = eejVar2.g;
                j4 += eejVar2.c - eejVar2.b;
            } while (j4 < 0);
            return eejVar2.a[eejVar2.b + ((int) j4)];
        }
    }

    @Override // defpackage.edw
    public final short h() {
        if (this.b < 2) {
            throw new IllegalStateException("size < 2: " + this.b);
        }
        eej eejVar = this.a;
        int i = eejVar.b;
        int i2 = eejVar.c;
        if (i2 - i < 2) {
            return (short) (((g() & 255) << 8) | (g() & 255));
        }
        byte[] bArr = eejVar.a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
        this.b -= 2;
        if (i4 == i2) {
            this.a = eejVar.b();
            eek.a(eejVar);
        } else {
            eejVar.b = i4;
        }
        return (short) i5;
    }

    @Override // defpackage.edw
    public final int i() {
        if (this.b < 4) {
            throw new IllegalStateException("size < 4: " + this.b);
        }
        eej eejVar = this.a;
        int i = eejVar.b;
        int i2 = eejVar.c;
        if (i2 - i < 4) {
            return ((g() & 255) << 24) | ((g() & 255) << 16) | ((g() & 255) << 8) | (g() & 255);
        }
        byte[] bArr = eejVar.a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & 255);
        this.b -= 4;
        if (i8 == i2) {
            this.a = eejVar.b();
            eek.a(eejVar);
        } else {
            eejVar.b = i8;
        }
        return i9;
    }

    @Override // defpackage.edw
    public final short j() {
        return eep.a(h());
    }

    @Override // defpackage.edw
    public final int k() {
        return eep.a(i());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[EDGE_INSN: B:42:0x009f->B:38:0x009f ?: BREAK  , SYNTHETIC] */
    @Override // defpackage.edw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long l() {
        /*
            r15 = this;
            long r0 = r15.b
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto La6
            r0 = 0
            r4 = r2
            r1 = 0
        Lb:
            eej r6 = r15.a
            byte[] r7 = r6.a
            int r8 = r6.b
            int r9 = r6.c
        L13:
            if (r8 >= r9) goto L8b
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L22
            r11 = 57
            if (r10 > r11) goto L22
            int r11 = r10 + (-48)
            goto L3a
        L22:
            r11 = 97
            if (r10 < r11) goto L2f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2f
            int r11 = r10 + (-97)
        L2c:
            int r11 = r11 + 10
            goto L3a
        L2f:
            r11 = 65
            if (r10 < r11) goto L6f
            r11 = 70
            if (r10 > r11) goto L6f
            int r11 = r10 + (-65)
            goto L2c
        L3a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L4a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L13
        L4a:
            edu r0 = new edu
            r0.<init>()
            edu r0 = r0.k(r4)
            edu r0 = r0.h(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Number too large: "
            r2.<init>(r3)
            java.lang.String r0 = r0.n()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L6f:
            if (r0 == 0) goto L73
            r1 = 1
            goto L8b
        L73:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L8b:
            if (r8 != r9) goto L97
            eej r7 = r6.b()
            r15.a = r7
            defpackage.eek.a(r6)
            goto L99
        L97:
            r6.b = r8
        L99:
            if (r1 != 0) goto L9f
            eej r6 = r15.a
            if (r6 != 0) goto Lb
        L9f:
            long r1 = r15.b
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.b = r1
            return r4
        La6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edu.l():long");
    }

    public final edx m() {
        return new edx(p());
    }

    @Override // defpackage.edw
    public final edx d(long j) throws EOFException {
        return new edx(g(j));
    }

    @Override // defpackage.edw
    public final int a(eee eeeVar) {
        int a = a(eeeVar, false);
        if (a == -1) {
            return -1;
        }
        try {
            h(eeeVar.a[a].g());
            return a;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009a, code lost:
        if (r19 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009c, code lost:
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009d, code lost:
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(defpackage.eee r18, boolean r19) {
        /*
            r17 = this;
            r0 = r18
            r1 = r17
            eej r2 = r1.a
            r3 = -2
            if (r2 != 0) goto L13
            if (r19 == 0) goto Lc
            return r3
        Lc:
            edx r2 = defpackage.edx.b
            int r0 = r0.indexOf(r2)
            return r0
        L13:
            byte[] r4 = r2.a
            int r5 = r2.b
            int r6 = r2.c
            int[] r0 = r0.b
            r8 = -1
            r10 = r2
            r9 = 0
            r11 = -1
        L1f:
            int r12 = r9 + 1
            r9 = r0[r9]
            int r13 = r12 + 1
            r12 = r0[r12]
            if (r12 == r8) goto L2a
            r11 = r12
        L2a:
            if (r10 == 0) goto L9a
            r12 = 0
            if (r9 >= 0) goto L6f
            int r9 = r9 * (-1)
            int r14 = r13 + r9
        L33:
            int r9 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r15 = r13 + 1
            r13 = r0[r13]
            if (r5 == r13) goto L40
            return r11
        L40:
            if (r15 != r14) goto L44
            r5 = 1
            goto L45
        L44:
            r5 = 0
        L45:
            if (r9 != r6) goto L5c
            eej r4 = r10.f
            int r6 = r4.b
            byte[] r9 = r4.a
            int r10 = r4.c
            if (r4 != r2) goto L56
            if (r5 == 0) goto L9a
            r4 = r9
            r9 = r12
            goto L62
        L56:
            r16 = r9
            r9 = r4
            r4 = r16
            goto L62
        L5c:
            r16 = r10
            r10 = r6
            r6 = r9
            r9 = r16
        L62:
            if (r5 == 0) goto L6a
            r5 = r0[r15]
            r14 = r6
            r6 = r10
            r10 = r9
            goto L91
        L6a:
            r5 = r6
            r6 = r10
            r13 = r15
            r10 = r9
            goto L33
        L6f:
            int r14 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r15 = r13 + r9
        L77:
            if (r13 != r15) goto L7a
            return r11
        L7a:
            r7 = r0[r13]
            if (r5 != r7) goto L97
            int r13 = r13 + r9
            r5 = r0[r13]
            if (r14 != r6) goto L91
            eej r10 = r10.f
            int r4 = r10.b
            byte[] r6 = r10.a
            int r7 = r10.c
            r14 = r4
            r4 = r6
            r6 = r7
            if (r10 != r2) goto L91
            r10 = r12
        L91:
            if (r5 < 0) goto L94
            return r5
        L94:
            int r9 = -r5
            r5 = r14
            goto L1f
        L97:
            int r13 = r13 + 1
            goto L77
        L9a:
            if (r19 == 0) goto L9d
            return r3
        L9d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edu.a(eee, boolean):int");
    }

    @Override // defpackage.edw
    public final long a(eem eemVar) throws IOException {
        long j = this.b;
        if (j > 0) {
            eemVar.a_(this, j);
        }
        return j;
    }

    public final String n() {
        try {
            return a(this.b, eep.a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    private String m(long j) throws EOFException {
        return a(j, eep.a);
    }

    public final String a(Charset charset) {
        try {
            return a(this.b, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    private String a(long j, Charset charset) throws EOFException {
        eep.a(this.b, 0L, j);
        if (charset != null) {
            if (j > 2147483647L) {
                throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
            }
            if (j == 0) {
                return "";
            }
            eej eejVar = this.a;
            if (eejVar.b + j > eejVar.c) {
                return new String(g(j), charset);
            }
            String str = new String(eejVar.a, eejVar.b, (int) j, charset);
            eejVar.b = (int) (eejVar.b + j);
            this.b -= j;
            if (eejVar.b == eejVar.c) {
                this.a = eejVar.b();
                eek.a(eejVar);
            }
            return str;
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // defpackage.edw
    public final String o() throws EOFException {
        return e(LocationRequestCompat.PASSIVE_INTERVAL);
    }

    @Override // defpackage.edw
    public final String e(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: ".concat(String.valueOf(j)));
        }
        long j2 = LocationRequestCompat.PASSIVE_INTERVAL;
        if (j != LocationRequestCompat.PASSIVE_INTERVAL) {
            j2 = j + 1;
        }
        long a = a((byte) 10, 0L, j2);
        if (a != -1) {
            return f(a);
        }
        if (j2 < this.b && c(j2 - 1) == 13 && c(j2) == 10) {
            return f(j2);
        }
        edu eduVar = new edu();
        a(eduVar, 0L, Math.min(32L, this.b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.b, j) + " content=" + eduVar.m().e() + (char) 8230);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String f(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (c(j2) == 13) {
                String m = m(j2);
                h(2L);
                return m;
            }
        }
        String m2 = m(j);
        h(1L);
        return m2;
    }

    public final byte[] p() {
        try {
            return g(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.edw
    public final byte[] g(long j) throws EOFException {
        eep.a(this.b, 0L, j);
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        }
        byte[] bArr = new byte[(int) j];
        a(bArr);
        return bArr;
    }

    @Override // defpackage.edw
    public final void a(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int a = a(bArr, i, bArr.length - i);
            if (a == -1) {
                throw new EOFException();
            }
            i += a;
        }
    }

    public final int a(byte[] bArr, int i, int i2) {
        eep.a(bArr.length, i, i2);
        eej eejVar = this.a;
        if (eejVar == null) {
            return -1;
        }
        int min = Math.min(i2, eejVar.c - eejVar.b);
        System.arraycopy(eejVar.a, eejVar.b, bArr, i, min);
        eejVar.b += min;
        this.b -= min;
        if (eejVar.b == eejVar.c) {
            this.a = eejVar.b();
            eek.a(eejVar);
        }
        return min;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) throws IOException {
        eej eejVar = this.a;
        if (eejVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), eejVar.c - eejVar.b);
        byteBuffer.put(eejVar.a, eejVar.b, min);
        eejVar.b += min;
        this.b -= min;
        if (eejVar.b == eejVar.c) {
            this.a = eejVar.b();
            eek.a(eejVar);
        }
        return min;
    }

    public final void q() {
        try {
            h(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.edw
    public final void h(long j) throws EOFException {
        eej eejVar;
        while (j > 0) {
            if (this.a == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, eejVar.c - this.a.b);
            long j2 = min;
            this.b -= j2;
            j -= j2;
            this.a.b += min;
            if (this.a.b == this.a.c) {
                eej eejVar2 = this.a;
                this.a = eejVar2.b();
                eek.a(eejVar2);
            }
        }
    }

    /* renamed from: a */
    public final edu b(edx edxVar) {
        if (edxVar == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        edxVar.a(this);
        return this;
    }

    /* renamed from: a */
    public final edu b(String str) {
        return a(str, 0, str.length());
    }

    public final edu a(String str, int i, int i2) {
        char charAt;
        if (str != null) {
            if (i < 0) {
                throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i)));
            }
            if (i2 < i) {
                throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
            } else if (i2 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
            } else {
                while (i < i2) {
                    char charAt2 = str.charAt(i);
                    if (charAt2 < 128) {
                        eej e = e(1);
                        byte[] bArr = e.a;
                        int i3 = e.c - i;
                        int min = Math.min(i2, 8192 - i3);
                        int i4 = i + 1;
                        bArr[i + i3] = (byte) charAt2;
                        while (true) {
                            i = i4;
                            if (i >= min || (charAt = str.charAt(i)) >= 128) {
                                break;
                            }
                            i4 = i + 1;
                            bArr[i + i3] = (byte) charAt;
                        }
                        int i5 = (i3 + i) - e.c;
                        e.c += i5;
                        this.b += i5;
                    } else {
                        if (charAt2 < 2048) {
                            h((charAt2 >> 6) | 192);
                            h((charAt2 & '?') | 128);
                        } else if (charAt2 < 55296 || charAt2 > 57343) {
                            h((charAt2 >> '\f') | 224);
                            h(((charAt2 >> 6) & 63) | 128);
                            h((charAt2 & '?') | 128);
                        } else {
                            int i6 = i + 1;
                            char charAt3 = i6 < i2 ? str.charAt(i6) : (char) 0;
                            if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                                h(63);
                                i = i6;
                            } else {
                                int i7 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 65536;
                                h((i7 >> 18) | 240);
                                h(((i7 >> 12) & 63) | 128);
                                h(((i7 >> 6) & 63) | 128);
                                h((i7 & 63) | 128);
                                i += 2;
                            }
                        }
                        i++;
                    }
                }
                return this;
            }
        }
        throw new IllegalArgumentException("string == null");
    }

    public final edu a(int i) {
        if (i < 128) {
            h(i);
        } else if (i < 2048) {
            h((i >> 6) | 192);
            h((i & 63) | 128);
        } else if (i < 65536) {
            if (i >= 55296 && i <= 57343) {
                h(63);
            } else {
                h((i >> 12) | 224);
                h(((i >> 6) & 63) | 128);
                h((i & 63) | 128);
            }
        } else if (i <= 1114111) {
            h((i >> 18) | 240);
            h(((i >> 12) & 63) | 128);
            h(((i >> 6) & 63) | 128);
            h((i & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
        }
        return this;
    }

    /* renamed from: b */
    public final edu c(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        return c(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public final edu c(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = i2;
        eep.a(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            eej e = e(1);
            int min = Math.min(i3 - i, 8192 - e.c);
            System.arraycopy(bArr, i, e.a, e.c, min);
            i += min;
            e.c += min;
        }
        this.b += j;
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            eej e = e(1);
            int min = Math.min(i, 8192 - e.c);
            byteBuffer.get(e.a, e.c, min);
            i -= min;
            e.c += min;
        }
        this.b += remaining;
        return remaining;
    }

    @Override // defpackage.edv
    public final long a(een eenVar) throws IOException {
        if (eenVar != null) {
            long j = 0;
            while (true) {
                long a = eenVar.a(this, 8192L);
                if (a == -1) {
                    return j;
                }
                j += a;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    /* renamed from: b */
    public final edu h(int i) {
        eej e = e(1);
        byte[] bArr = e.a;
        int i2 = e.c;
        e.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
        return this;
    }

    /* renamed from: c */
    public final edu g(int i) {
        eej e = e(2);
        byte[] bArr = e.a;
        int i2 = e.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        e.c = i3 + 1;
        this.b += 2;
        return this;
    }

    /* renamed from: d */
    public final edu f(int i) {
        eej e = e(4);
        byte[] bArr = e.a;
        int i2 = e.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        e.c = i5 + 1;
        this.b += 4;
        return this;
    }

    /* renamed from: i */
    public final edu l(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return h(48);
        }
        boolean z = false;
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return b("-9223372036854775808");
            }
            z = true;
        }
        if (j >= 100000000) {
            i2 = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i2 = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i2 = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i2 = 2;
        }
        if (z) {
            i2++;
        }
        eej e = e(i2);
        byte[] bArr = e.a;
        int i3 = e.c + i2;
        while (j != 0) {
            i3--;
            bArr[i3] = c[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i3 - 1] = 45;
        }
        e.c += i2;
        this.b += i2;
        return this;
    }

    /* renamed from: j */
    public final edu k(long j) {
        if (j == 0) {
            return h(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        eej e = e(numberOfTrailingZeros);
        byte[] bArr = e.a;
        int i = e.c;
        for (int i2 = (e.c + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = c[(int) (15 & j)];
            j >>>= 4;
        }
        e.c += numberOfTrailingZeros;
        this.b += numberOfTrailingZeros;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final eej e(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException();
        }
        eej eejVar = this.a;
        if (eejVar == null) {
            eej a = eek.a();
            this.a = a;
            a.g = a;
            a.f = a;
            return a;
        }
        eej eejVar2 = eejVar.g;
        return (eejVar2.c + i > 8192 || !eejVar2.e) ? eejVar2.a(eek.a()) : eejVar2;
    }

    @Override // defpackage.eem
    public final void a_(edu eduVar, long j) {
        eej eejVar;
        if (eduVar != null) {
            if (eduVar == this) {
                throw new IllegalArgumentException("source == this");
            }
            eep.a(eduVar.b, 0L, j);
            while (j > 0) {
                int i = 0;
                if (j < eduVar.a.c - eduVar.a.b) {
                    eej eejVar2 = this.a;
                    eej eejVar3 = eejVar2 != null ? eejVar2.g : null;
                    if (eejVar3 != null && eejVar3.e) {
                        if ((eejVar3.c + j) - (eejVar3.d ? 0 : eejVar3.b) <= 8192) {
                            eduVar.a.a(eejVar3, (int) j);
                            eduVar.b -= j;
                            this.b += j;
                            return;
                        }
                    }
                    eej eejVar4 = eduVar.a;
                    int i2 = (int) j;
                    if (i2 <= 0 || i2 > eejVar4.c - eejVar4.b) {
                        throw new IllegalArgumentException();
                    }
                    if (i2 >= 1024) {
                        eejVar = eejVar4.a();
                    } else {
                        eejVar = eek.a();
                        System.arraycopy(eejVar4.a, eejVar4.b, eejVar.a, 0, i2);
                    }
                    eejVar.c = eejVar.b + i2;
                    eejVar4.b += i2;
                    eejVar4.g.a(eejVar);
                    eduVar.a = eejVar;
                }
                eej eejVar5 = eduVar.a;
                long j2 = eejVar5.c - eejVar5.b;
                eduVar.a = eejVar5.b();
                eej eejVar6 = this.a;
                if (eejVar6 == null) {
                    this.a = eejVar5;
                    eejVar5.g = eejVar5;
                    eejVar5.f = eejVar5;
                } else {
                    eej a = eejVar6.g.a(eejVar5);
                    if (a.g == a) {
                        throw new IllegalStateException();
                    }
                    if (a.g.e) {
                        int i3 = a.c - a.b;
                        int i4 = 8192 - a.g.c;
                        if (!a.g.d) {
                            i = a.g.b;
                        }
                        if (i3 <= i4 + i) {
                            a.a(a.g, i3);
                            a.b();
                            eek.a(a);
                        }
                    }
                }
                eduVar.b -= j2;
                this.b += j2;
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // defpackage.een
    public final long a(edu eduVar, long j) {
        if (eduVar != null) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
            }
            long j2 = this.b;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            eduVar.a_(this, j);
            return j;
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // defpackage.edw
    public final long r() {
        return a((byte) 0, 0L, LocationRequestCompat.PASSIVE_INTERVAL);
    }

    public final long a(byte b, long j, long j2) {
        eej eejVar;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.b), Long.valueOf(j), Long.valueOf(j2)));
        }
        long j4 = this.b;
        if (j2 <= j4) {
            j4 = j2;
        }
        if (j == j4 || (eejVar = this.a) == null) {
            return -1L;
        }
        long j5 = this.b;
        if (j5 - j < j) {
            while (j5 > j) {
                eejVar = eejVar.g;
                j5 -= eejVar.c - eejVar.b;
            }
        } else {
            while (true) {
                long j6 = (eejVar.c - eejVar.b) + j3;
                if (j6 >= j) {
                    break;
                }
                eejVar = eejVar.f;
                j3 = j6;
            }
            j5 = j3;
        }
        long j7 = j;
        while (j5 < j4) {
            byte[] bArr = eejVar.a;
            int min = (int) Math.min(eejVar.c, (eejVar.b + j4) - j5);
            for (int i = (int) ((eejVar.b + j7) - j5); i < min; i++) {
                if (bArr[i] == b) {
                    return (i - eejVar.b) + j5;
                }
            }
            j5 += eejVar.c - eejVar.b;
            eejVar = eejVar.f;
            j7 = j5;
        }
        return -1L;
    }

    @Override // defpackage.eem
    public final eeo a() {
        return eeo.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edu)) {
            return false;
        }
        edu eduVar = (edu) obj;
        long j = this.b;
        if (j != eduVar.b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        eej eejVar = this.a;
        eej eejVar2 = eduVar.a;
        int i = eejVar.b;
        int i2 = eejVar2.b;
        while (j2 < this.b) {
            long min = Math.min(eejVar.c - i, eejVar2.c - i2);
            int i3 = 0;
            while (i3 < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (eejVar.a[i] != eejVar2.a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == eejVar.c) {
                eejVar = eejVar.f;
                i = eejVar.b;
            }
            if (i2 == eejVar2.c) {
                eejVar2 = eejVar2.f;
                i2 = eejVar2.b;
            }
            j2 += min;
        }
        return true;
    }

    public final int hashCode() {
        eej eejVar = this.a;
        if (eejVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = eejVar.c;
            for (int i3 = eejVar.b; i3 < i2; i3++) {
                i = (i * 31) + eejVar.a[i3];
            }
            eejVar = eejVar.f;
        } while (eejVar != this.a);
        return i;
    }

    /* renamed from: s */
    public final edu clone() {
        edu eduVar = new edu();
        if (this.b == 0) {
            return eduVar;
        }
        eej a = this.a.a();
        eduVar.a = a;
        a.g = a;
        a.f = a;
        eej eejVar = this.a;
        while (true) {
            eejVar = eejVar.f;
            if (eejVar != this.a) {
                eduVar.a.g.a(eejVar.a());
            } else {
                eduVar.b = this.b;
                return eduVar;
            }
        }
    }

    public final String toString() {
        edx edxVar;
        long j = this.b;
        if (j <= 2147483647L) {
            int i = (int) j;
            if (i == 0) {
                edxVar = edx.b;
            } else {
                edxVar = new eel(this, i);
            }
            return edxVar.toString();
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.b);
    }
}
