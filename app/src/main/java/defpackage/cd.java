package defpackage;

import android.util.Log;
import androidx.core.view.ViewCompat;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* renamed from: cd  reason: default package */
/* loaded from: classes2.dex */
public final class cd {
    public ByteBuffer b;
    public cc c;
    public final byte[] a = new byte[256];
    public int d = 0;

    public final void a() {
        boolean z = false;
        while (!z && !c() && this.c.c <= Integer.MAX_VALUE) {
            int g = g();
            if (g == 33) {
                int g2 = g();
                if (g2 == 1) {
                    e();
                } else if (g2 == 249) {
                    this.c.d = new cb();
                    g();
                    int g3 = g();
                    this.c.d.g = (g3 & 28) >> 2;
                    if (this.c.d.g == 0) {
                        this.c.d.g = 1;
                    }
                    this.c.d.f = (g3 & 1) != 0;
                    short s = this.b.getShort();
                    if (s < 2) {
                        s = 10;
                    }
                    this.c.d.i = s * 10;
                    this.c.d.h = g();
                    g();
                } else if (g2 == 254) {
                    e();
                } else if (g2 == 255) {
                    f();
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < 11; i++) {
                        sb.append((char) this.a[i]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        d();
                    } else {
                        e();
                    }
                } else {
                    e();
                }
            } else if (g == 44) {
                if (this.c.d == null) {
                    this.c.d = new cb();
                }
                this.c.d.a = this.b.getShort();
                this.c.d.b = this.b.getShort();
                this.c.d.c = this.b.getShort();
                this.c.d.d = this.b.getShort();
                int g4 = g();
                boolean z2 = (g4 & 128) != 0;
                int pow = (int) Math.pow(2.0d, (g4 & 7) + 1);
                this.c.d.e = (g4 & 64) != 0;
                if (z2) {
                    this.c.d.k = a(pow);
                } else {
                    this.c.d.k = null;
                }
                this.c.d.j = this.b.position();
                g();
                e();
                if (!c()) {
                    this.c.c++;
                    this.c.e.add(this.c.d);
                }
            } else if (g != 59) {
                this.c.b = 1;
            } else {
                z = true;
            }
        }
    }

    private void d() {
        do {
            f();
            byte[] bArr = this.a;
            if (bArr[0] == 1) {
                this.c.m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.d <= 0) {
                return;
            }
        } while (!c());
    }

    public final void b() {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (int i = 0; i < 6; i++) {
            sb.append((char) g());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.c.b = 1;
            return;
        }
        this.c.f = this.b.getShort();
        this.c.g = this.b.getShort();
        int g = g();
        cc ccVar = this.c;
        if ((g & 128) != 0) {
            z = true;
        }
        ccVar.h = z;
        this.c.i = (int) Math.pow(2.0d, (g & 7) + 1);
        this.c.j = g();
        this.c.k = g();
        if (!this.c.h || c()) {
            return;
        }
        cc ccVar2 = this.c;
        ccVar2.a = a(ccVar2.i);
        cc ccVar3 = this.c;
        ccVar3.l = ccVar3.a[this.c.j];
    }

    private int[] a(int i) {
        int[] iArr;
        byte[] bArr = new byte[i * 3];
        try {
            this.b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                try {
                    int i5 = i4 + 1;
                    int i6 = i5 + 1;
                    int i7 = i2 + 1;
                    iArr[i2] = ((bArr[i3] & 255) << 16) | ViewCompat.MEASURED_STATE_MASK | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                    i3 = i6;
                    i2 = i7;
                } catch (BufferUnderflowException unused) {
                    this.c.b = 1;
                    return iArr;
                }
            }
        } catch (BufferUnderflowException unused2) {
            iArr = null;
        }
        return iArr;
    }

    private void e() {
        int g;
        do {
            g = g();
            this.b.position(Math.min(this.b.position() + g, this.b.limit()));
        } while (g > 0);
    }

    private void f() {
        int g = g();
        this.d = g;
        if (g > 0) {
            int i = 0;
            int i2 = 0;
            while (i < this.d) {
                try {
                    i2 = this.d - i;
                    this.b.get(this.a, i, i2);
                    i += i2;
                } catch (Exception unused) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        StringBuilder sb = new StringBuilder("Error Reading Block n: ");
                        sb.append(i);
                        sb.append(" count: ");
                        sb.append(i2);
                        sb.append(" blockSize: ");
                        sb.append(this.d);
                    }
                    this.c.b = 1;
                    return;
                }
            }
        }
    }

    private int g() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    public final boolean c() {
        return this.c.b != 0;
    }
}
