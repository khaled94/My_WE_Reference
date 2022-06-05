package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: ccv  reason: default package */
/* loaded from: classes2.dex */
public abstract class ccv {
    int a;
    int b;
    int c;
    ccw d;
    private boolean e;

    public static long a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static int e(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public abstract int a() throws IOException;

    public abstract void a(int i) throws InvalidProtocolBufferException;

    public abstract double b() throws IOException;

    public abstract boolean b(int i) throws IOException;

    public abstract float c() throws IOException;

    public abstract int c(int i) throws InvalidProtocolBufferException;

    public abstract long d() throws IOException;

    public abstract void d(int i);

    public abstract long e() throws IOException;

    public abstract int f() throws IOException;

    public abstract long g() throws IOException;

    public abstract int h() throws IOException;

    public abstract boolean i() throws IOException;

    public abstract String j() throws IOException;

    public abstract String k() throws IOException;

    public abstract ccu l() throws IOException;

    public abstract int m() throws IOException;

    public abstract int n() throws IOException;

    public abstract int o() throws IOException;

    public abstract long p() throws IOException;

    public abstract int q() throws IOException;

    public abstract long r() throws IOException;

    abstract long s() throws IOException;

    public abstract boolean t() throws IOException;

    public abstract int u();

    /* synthetic */ ccv(byte b) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ccv a(byte[] bArr, int i, int i2, boolean z) {
        a aVar = new a(bArr, i, i2, z, (byte) 0);
        try {
            aVar.c(i2);
            return aVar;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private ccv() {
        this.b = 100;
        this.c = Integer.MAX_VALUE;
        this.e = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ccv$a */
    /* loaded from: classes2.dex */
    public static final class a extends ccv {
        private final byte[] e;
        private final boolean f;
        private int g;
        private int h;
        private int i;
        private int j;
        private int k;
        private boolean l;
        private int m;

        /* synthetic */ a(byte[] bArr, int i, int i2, boolean z, byte b) {
            this(bArr, i, i2, z);
        }

        private a(byte[] bArr, int i, int i2, boolean z) {
            super((byte) 0);
            this.m = Integer.MAX_VALUE;
            this.e = bArr;
            this.g = i2 + i;
            this.i = i;
            this.j = i;
            this.f = z;
        }

        @Override // defpackage.ccv
        public final int a() throws IOException {
            if (t()) {
                this.k = 0;
                return 0;
            }
            int v = v();
            this.k = v;
            if (cff.b(v) == 0) {
                throw InvalidProtocolBufferException.d();
            }
            return this.k;
        }

        @Override // defpackage.ccv
        public final void a(int i) throws InvalidProtocolBufferException {
            if (this.k == i) {
                return;
            }
            throw InvalidProtocolBufferException.e();
        }

        @Override // defpackage.ccv
        public final boolean b(int i) throws IOException {
            int a;
            int a2 = cff.a(i);
            int i2 = 0;
            if (a2 == 0) {
                if (this.g - this.i >= 10) {
                    while (i2 < 10) {
                        byte[] bArr = this.e;
                        int i3 = this.i;
                        this.i = i3 + 1;
                        if (bArr[i3] < 0) {
                            i2++;
                        }
                    }
                    throw InvalidProtocolBufferException.c();
                }
                while (i2 < 10) {
                    if (A() < 0) {
                        i2++;
                    }
                }
                throw InvalidProtocolBufferException.c();
                return true;
            } else if (a2 == 1) {
                f(8);
                return true;
            } else if (a2 == 2) {
                f(v());
                return true;
            } else if (a2 != 3) {
                if (a2 == 4) {
                    return false;
                }
                if (a2 == 5) {
                    f(4);
                    return true;
                }
                throw InvalidProtocolBufferException.f();
            } else {
                do {
                    a = a();
                    if (a == 0) {
                        break;
                    }
                } while (b(a));
                a(cff.a(cff.b(i), 4));
                return true;
            }
        }

        @Override // defpackage.ccv
        public final double b() throws IOException {
            return Double.longBitsToDouble(y());
        }

        @Override // defpackage.ccv
        public final float c() throws IOException {
            return Float.intBitsToFloat(x());
        }

        @Override // defpackage.ccv
        public final long d() throws IOException {
            return w();
        }

        @Override // defpackage.ccv
        public final long e() throws IOException {
            return w();
        }

        @Override // defpackage.ccv
        public final int f() throws IOException {
            return v();
        }

        @Override // defpackage.ccv
        public final long g() throws IOException {
            return y();
        }

        @Override // defpackage.ccv
        public final int h() throws IOException {
            return x();
        }

        @Override // defpackage.ccv
        public final boolean i() throws IOException {
            return w() != 0;
        }

        @Override // defpackage.ccv
        public final String j() throws IOException {
            int v = v();
            if (v > 0 && v <= this.g - this.i) {
                String str = new String(this.e, this.i, v, cdm.a);
                this.i += v;
                return str;
            } else if (v == 0) {
                return "";
            } else {
                if (v < 0) {
                    throw InvalidProtocolBufferException.b();
                }
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // defpackage.ccv
        public final String k() throws IOException {
            int v = v();
            if (v > 0) {
                int i = this.g;
                int i2 = this.i;
                if (v <= i - i2) {
                    String b = cfe.b(this.e, i2, v);
                    this.i += v;
                    return b;
                }
            }
            if (v == 0) {
                return "";
            }
            if (v <= 0) {
                throw InvalidProtocolBufferException.b();
            }
            throw InvalidProtocolBufferException.a();
        }

        @Override // defpackage.ccv
        public final ccu l() throws IOException {
            byte[] bArr;
            ccu ccuVar;
            int v = v();
            if (v > 0) {
                int i = this.g;
                int i2 = this.i;
                if (v <= i - i2) {
                    if (this.f && this.l) {
                        ccuVar = ccu.b(this.e, i2, v);
                    } else {
                        ccuVar = ccu.a(this.e, this.i, v);
                    }
                    this.i += v;
                    return ccuVar;
                }
            }
            if (v == 0) {
                return ccu.a;
            }
            if (v > 0) {
                int i3 = this.g;
                int i4 = this.i;
                if (v <= i3 - i4) {
                    int i5 = v + i4;
                    this.i = i5;
                    bArr = Arrays.copyOfRange(this.e, i4, i5);
                    return ccu.b(bArr);
                }
            }
            if (v > 0) {
                throw InvalidProtocolBufferException.a();
            }
            if (v == 0) {
                bArr = cdm.c;
                return ccu.b(bArr);
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // defpackage.ccv
        public final int m() throws IOException {
            return v();
        }

        @Override // defpackage.ccv
        public final int n() throws IOException {
            return v();
        }

        @Override // defpackage.ccv
        public final int o() throws IOException {
            return x();
        }

        @Override // defpackage.ccv
        public final long p() throws IOException {
            return y();
        }

        @Override // defpackage.ccv
        public final int q() throws IOException {
            return e(v());
        }

        @Override // defpackage.ccv
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
        private int v() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.i
                int r1 = r5.g
                if (r1 == r0) goto L6b
                byte[] r2 = r5.e
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L11
                r5.i = r3
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
                r5.i = r1
                return r0
            L6b:
                long r0 = r5.s()
                int r1 = (int) r0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ccv.a.v():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
            if (r2[r0] >= 0) goto L39;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private long w() throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 189
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ccv.a.w():long");
        }

        @Override // defpackage.ccv
        final long s() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte A = A();
                j |= (A & Byte.MAX_VALUE) << i;
                if ((A & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.c();
        }

        private int x() throws IOException {
            int i = this.i;
            if (this.g - i < 4) {
                throw InvalidProtocolBufferException.a();
            }
            byte[] bArr = this.e;
            this.i = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        private long y() throws IOException {
            int i = this.i;
            if (this.g - i < 8) {
                throw InvalidProtocolBufferException.a();
            }
            byte[] bArr = this.e;
            this.i = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        @Override // defpackage.ccv
        public final int c(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.b();
            }
            int u = i + u();
            int i2 = this.m;
            if (u > i2) {
                throw InvalidProtocolBufferException.a();
            }
            this.m = u;
            z();
            return i2;
        }

        private void z() {
            int i = this.g + this.h;
            this.g = i;
            int i2 = i - this.j;
            int i3 = this.m;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.h = i4;
                this.g = i - i4;
                return;
            }
            this.h = 0;
        }

        @Override // defpackage.ccv
        public final void d(int i) {
            this.m = i;
            z();
        }

        @Override // defpackage.ccv
        public final boolean t() throws IOException {
            return this.i == this.g;
        }

        @Override // defpackage.ccv
        public final int u() {
            return this.i - this.j;
        }

        private byte A() throws IOException {
            int i = this.i;
            if (i == this.g) {
                throw InvalidProtocolBufferException.a();
            }
            byte[] bArr = this.e;
            this.i = i + 1;
            return bArr[i];
        }

        private void f(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.g;
                int i3 = this.i;
                if (i <= i2 - i3) {
                    this.i = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.b();
            }
            throw InvalidProtocolBufferException.a();
        }
    }
}
