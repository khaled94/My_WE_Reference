package defpackage;

import com.google.android.gms.internal.measurement.zzfi;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ash  reason: default package */
/* loaded from: classes.dex */
public final class ash extends asf {
    private final byte[] d;
    private final boolean e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;

    private ash(byte[] bArr, int i, int i2) {
        super((byte) 0);
        this.k = Integer.MAX_VALUE;
        this.d = bArr;
        this.f = i2 + i;
        this.h = i;
        this.i = i;
        this.e = false;
    }

    @Override // defpackage.asf
    public final int a() throws IOException {
        if (t()) {
            this.j = 0;
            return 0;
        }
        int v = v();
        this.j = v;
        if ((v >>> 3) == 0) {
            throw zzfi.d();
        }
        return v;
    }

    @Override // defpackage.asf
    public final void a(int i) throws zzfi {
        if (this.j == i) {
            return;
        }
        throw zzfi.e();
    }

    @Override // defpackage.asf
    public final boolean b(int i) throws IOException {
        int a;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f - this.h >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.d;
                    int i4 = this.h;
                    this.h = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw zzfi.c();
            }
            while (i3 < 10) {
                if (A() < 0) {
                    i3++;
                }
            }
            throw zzfi.c();
            return true;
        } else if (i2 == 1) {
            e(8);
            return true;
        } else if (i2 == 2) {
            e(v());
            return true;
        } else if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                e(4);
                return true;
            }
            throw zzfi.f();
        } else {
            do {
                a = a();
                if (a == 0) {
                    break;
                }
            } while (b(a));
            a(((i >>> 3) << 3) | 4);
            return true;
        }
    }

    @Override // defpackage.asf
    public final double b() throws IOException {
        return Double.longBitsToDouble(y());
    }

    @Override // defpackage.asf
    public final float c() throws IOException {
        return Float.intBitsToFloat(x());
    }

    @Override // defpackage.asf
    public final long d() throws IOException {
        return w();
    }

    @Override // defpackage.asf
    public final long e() throws IOException {
        return w();
    }

    @Override // defpackage.asf
    public final int f() throws IOException {
        return v();
    }

    @Override // defpackage.asf
    public final long g() throws IOException {
        return y();
    }

    @Override // defpackage.asf
    public final int h() throws IOException {
        return x();
    }

    @Override // defpackage.asf
    public final boolean i() throws IOException {
        return w() != 0;
    }

    @Override // defpackage.asf
    public final String j() throws IOException {
        int v = v();
        if (v > 0 && v <= this.f - this.h) {
            String str = new String(this.d, this.h, v, atb.a);
            this.h += v;
            return str;
        } else if (v == 0) {
            return "";
        } else {
            if (v < 0) {
                throw zzfi.b();
            }
            throw zzfi.a();
        }
    }

    @Override // defpackage.asf
    public final String k() throws IOException {
        int v = v();
        if (v > 0) {
            int i = this.f;
            int i2 = this.h;
            if (v <= i - i2) {
                String b = avx.b(this.d, i2, v);
                this.h += v;
                return b;
            }
        }
        if (v == 0) {
            return "";
        }
        if (v <= 0) {
            throw zzfi.b();
        }
        throw zzfi.a();
    }

    @Override // defpackage.asf
    public final <T extends aui> T a(aur<T> aurVar, asn asnVar) throws IOException {
        int v = v();
        if (this.a >= this.b) {
            throw zzfi.g();
        }
        int c = c(v);
        this.a++;
        T a = aurVar.a(this, asnVar);
        a(0);
        this.a--;
        d(c);
        return a;
    }

    @Override // defpackage.asf
    public final art l() throws IOException {
        byte[] bArr;
        int v = v();
        if (v > 0) {
            int i = this.f;
            int i2 = this.h;
            if (v <= i - i2) {
                art a = art.a(this.d, i2, v);
                this.h += v;
                return a;
            }
        }
        if (v == 0) {
            return art.a;
        }
        if (v > 0) {
            int i3 = this.f;
            int i4 = this.h;
            if (v <= i3 - i4) {
                int i5 = v + i4;
                this.h = i5;
                bArr = Arrays.copyOfRange(this.d, i4, i5);
                return art.a(bArr);
            }
        }
        if (v > 0) {
            throw zzfi.a();
        }
        if (v == 0) {
            bArr = atb.b;
            return art.a(bArr);
        }
        throw zzfi.b();
    }

    @Override // defpackage.asf
    public final int m() throws IOException {
        return v();
    }

    @Override // defpackage.asf
    public final int n() throws IOException {
        return v();
    }

    @Override // defpackage.asf
    public final int o() throws IOException {
        return x();
    }

    @Override // defpackage.asf
    public final long p() throws IOException {
        return y();
    }

    @Override // defpackage.asf
    public final int q() throws IOException {
        return f(v());
    }

    @Override // defpackage.asf
    public final long r() throws IOException {
        return a(w());
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
        if (r2[r3] >= 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int v() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.h
            int r1 = r5.f
            if (r1 == r0) goto L6b
            byte[] r2 = r5.d
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L11
            r5.h = r3
            return r0
        L11:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6b
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L22
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L68
        L22:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L2f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2d:
            r1 = r3
            goto L68
        L2f:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L68
        L3d:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6b
        L68:
            r5.h = r1
            return r0
        L6b:
            long r0 = r5.s()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ash.v():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
        if (r2[r0] >= 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long w() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ash.w():long");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.asf
    public final long s() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte A = A();
            j |= (A & Byte.MAX_VALUE) << i;
            if ((A & 128) == 0) {
                return j;
            }
        }
        throw zzfi.c();
    }

    private final int x() throws IOException {
        int i = this.h;
        if (this.f - i < 4) {
            throw zzfi.a();
        }
        byte[] bArr = this.d;
        this.h = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private final long y() throws IOException {
        int i = this.h;
        if (this.f - i < 8) {
            throw zzfi.a();
        }
        byte[] bArr = this.d;
        this.h = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // defpackage.asf
    public final int c(int i) throws zzfi {
        if (i < 0) {
            throw zzfi.b();
        }
        int u = i + u();
        int i2 = this.k;
        if (u > i2) {
            throw zzfi.a();
        }
        this.k = u;
        z();
        return i2;
    }

    private final void z() {
        int i = this.f + this.g;
        this.f = i;
        int i2 = i - this.i;
        int i3 = this.k;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.g = i4;
            this.f = i - i4;
            return;
        }
        this.g = 0;
    }

    @Override // defpackage.asf
    public final void d(int i) {
        this.k = i;
        z();
    }

    @Override // defpackage.asf
    public final boolean t() throws IOException {
        return this.h == this.f;
    }

    @Override // defpackage.asf
    public final int u() {
        return this.h - this.i;
    }

    private final byte A() throws IOException {
        int i = this.h;
        if (i == this.f) {
            throw zzfi.a();
        }
        byte[] bArr = this.d;
        this.h = i + 1;
        return bArr[i];
    }

    @Override // defpackage.asf
    public final void e(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.f;
            int i3 = this.h;
            if (i <= i2 - i3) {
                this.h = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw zzfi.b();
        }
        throw zzfi.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ash(byte[] bArr, int i, int i2, byte b) {
        this(bArr, i, i2);
    }
}
