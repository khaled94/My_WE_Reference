package defpackage;

import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzit;
import java.io.IOException;

/* renamed from: awl  reason: default package */
/* loaded from: classes.dex */
public final class awl {
    final byte[] a;
    int d;
    private final int e;
    private int f;
    private int g;
    private int i;
    private asf l;
    private int h = Integer.MAX_VALUE;
    private int j = 64;
    private int k = 67108864;
    final int b = 0;
    int c = 0;

    public static awl a(byte[] bArr, int i) {
        return new awl(bArr, i);
    }

    public final int a() throws IOException {
        if (this.c == this.f) {
            this.d = 0;
            return 0;
        }
        int d = d();
        this.d = d;
        if (d == 0) {
            throw new zzit("Protocol message contained an invalid tag (zero).");
        }
        return d;
    }

    private final void b(int i) throws zzit {
        if (this.d == i) {
            return;
        }
        throw new zzit("Protocol message end-group tag did not match expected tag.");
    }

    public final boolean a(int i) throws IOException {
        int a;
        int i2 = i & 7;
        if (i2 == 0) {
            d();
            return true;
        } else if (i2 == 1) {
            f();
            f();
            f();
            f();
            f();
            f();
            f();
            f();
            return true;
        } else if (i2 == 2) {
            c(d());
            return true;
        } else if (i2 == 3) {
            do {
                a = a();
                if (a == 0) {
                    break;
                }
            } while (a(a));
            b(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                f();
                f();
                f();
                f();
                return true;
            }
            throw new zzit("Protocol message tag had invalid wire type.");
        }
    }

    public final boolean b() throws IOException {
        return d() != 0;
    }

    public final String c() throws IOException {
        int d = d();
        if (d < 0) {
            throw zzit.b();
        }
        if (d > this.f - this.c) {
            throw zzit.a();
        }
        String str = new String(this.a, this.c, d, aws.a);
        this.c += d;
        return str;
    }

    public final void a(awu awuVar) throws IOException {
        int d = d();
        if (this.i < this.j) {
            if (d < 0) {
                throw zzit.b();
            }
            int i = d + this.c;
            int i2 = this.h;
            if (i > i2) {
                throw zzit.a();
            }
            this.h = i;
            g();
            this.i++;
            awuVar.a(this);
            b(0);
            this.i--;
            this.h = i2;
            g();
            return;
        }
        throw new zzit("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final int d() throws IOException {
        int i;
        byte f = f();
        if (f >= 0) {
            return f;
        }
        int i2 = f & Byte.MAX_VALUE;
        byte f2 = f();
        if (f2 >= 0) {
            i = f2 << 7;
        } else {
            i2 |= (f2 & Byte.MAX_VALUE) << 7;
            byte f3 = f();
            if (f3 >= 0) {
                i = f3 << 14;
            } else {
                i2 |= (f3 & Byte.MAX_VALUE) << 14;
                byte f4 = f();
                if (f4 < 0) {
                    int i3 = i2 | ((f4 & Byte.MAX_VALUE) << 21);
                    byte f5 = f();
                    int i4 = i3 | (f5 << 28);
                    if (f5 >= 0) {
                        return i4;
                    }
                    for (int i5 = 0; i5 < 5; i5++) {
                        if (f() >= 0) {
                            return i4;
                        }
                    }
                    throw zzit.c();
                }
                i = f4 << 21;
            }
        }
        return i2 | i;
    }

    private awl(byte[] bArr, int i) {
        this.a = bArr;
        int i2 = i + 0;
        this.f = i2;
        this.e = i2;
    }

    public final <T extends ata<T, ?>> T a(aur<T> aurVar) throws IOException {
        try {
            if (this.l == null) {
                this.l = asf.a(this.a, this.b, this.e);
            }
            int u = this.l.u();
            int i = this.c - this.b;
            if (u > i) {
                throw new IOException(String.format("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", Integer.valueOf(u), Integer.valueOf(i)));
            }
            this.l.e(i - u);
            asf asfVar = this.l;
            int i2 = this.j - this.i;
            if (i2 < 0) {
                StringBuilder sb = new StringBuilder(47);
                sb.append("Recursion limit cannot be negative: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
            asfVar.b = i2;
            T t = (T) this.l.a(aurVar, asn.b());
            a(this.d);
            return t;
        } catch (zzfi e) {
            throw new zzit("", e);
        }
    }

    private final void g() {
        int i = this.f + this.g;
        this.f = i;
        int i2 = this.h;
        if (i > i2) {
            int i3 = i - i2;
            this.g = i3;
            this.f = i - i3;
            return;
        }
        this.g = 0;
    }

    public final int e() {
        return this.c - this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte f() throws IOException {
        int i = this.c;
        if (i == this.f) {
            throw zzit.a();
        }
        byte[] bArr = this.a;
        this.c = i + 1;
        return bArr[i];
    }

    private final void c(int i) throws IOException {
        if (i < 0) {
            throw zzit.b();
        }
        int i2 = this.c;
        int i3 = i2 + i;
        int i4 = this.h;
        if (i3 > i4) {
            c(i4 - i2);
            throw zzit.a();
        } else if (i <= this.f - i2) {
            this.c = i2 + i;
        } else {
            throw zzit.a();
        }
    }
}
