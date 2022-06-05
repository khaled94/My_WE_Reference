package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import defpackage.ca;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* renamed from: ce  reason: default package */
/* loaded from: classes2.dex */
public class ce implements ca {
    private static final String a = ce.class.getSimpleName();
    private int[] b;
    private final int[] c;
    private final ca.a d;
    private ByteBuffer e;
    private byte[] f;
    private short[] g;
    private byte[] h;
    private byte[] i;
    private byte[] j;
    private int[] k;
    private int l;
    private cc m;
    private Bitmap n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private int s;
    private Boolean t;
    private Bitmap.Config u;

    public ce(ca.a aVar, cc ccVar, ByteBuffer byteBuffer, int i) {
        this(aVar);
        a(ccVar, byteBuffer, i);
    }

    private ce(ca.a aVar) {
        this.c = new int[256];
        this.u = Bitmap.Config.ARGB_8888;
        this.d = aVar;
        this.m = new cc();
    }

    @Override // defpackage.ca
    public final ByteBuffer a() {
        return this.e;
    }

    @Override // defpackage.ca
    public final void b() {
        this.l = (this.l + 1) % this.m.c;
    }

    @Override // defpackage.ca
    public final int c() {
        int i;
        if (this.m.c <= 0 || (i = this.l) < 0) {
            return 0;
        }
        if (i >= 0 && i < this.m.c) {
            return this.m.e.get(i).i;
        }
        return -1;
    }

    @Override // defpackage.ca
    public final int d() {
        return this.m.c;
    }

    @Override // defpackage.ca
    public final int e() {
        return this.l;
    }

    @Override // defpackage.ca
    public final void f() {
        this.l = -1;
    }

    @Override // defpackage.ca
    public final int g() {
        return this.e.limit() + this.j.length + (this.k.length * 4);
    }

    @Override // defpackage.ca
    public final synchronized Bitmap h() {
        if (this.m.c <= 0 || this.l < 0) {
            if (Log.isLoggable(a, 3)) {
                StringBuilder sb = new StringBuilder("Unable to decode frame, frameCount=");
                sb.append(this.m.c);
                sb.append(", framePointer=");
                sb.append(this.l);
            }
            this.p = 1;
        }
        if (this.p != 1 && this.p != 2) {
            this.p = 0;
            if (this.f == null) {
                this.f = this.d.a(255);
            }
            cb cbVar = this.m.e.get(this.l);
            int i = this.l - 1;
            cb cbVar2 = i >= 0 ? this.m.e.get(i) : null;
            int[] iArr = cbVar.k != null ? cbVar.k : this.m.a;
            this.b = iArr;
            if (iArr == null) {
                if (Log.isLoggable(a, 3)) {
                    new StringBuilder("No valid color table found for frame #").append(this.l);
                }
                this.p = 1;
                return null;
            }
            if (cbVar.f) {
                System.arraycopy(this.b, 0, this.c, 0, this.b.length);
                int[] iArr2 = this.c;
                this.b = iArr2;
                iArr2[cbVar.h] = 0;
                if (cbVar.g == 2 && this.l == 0) {
                    this.t = Boolean.TRUE;
                }
            }
            return a(cbVar, cbVar2);
        }
        if (Log.isLoggable(a, 3)) {
            new StringBuilder("Unable to decode frame, status=").append(this.p);
        }
        return null;
    }

    @Override // defpackage.ca
    public final void i() {
        this.m = null;
        byte[] bArr = this.j;
        if (bArr != null) {
            this.d.a(bArr);
        }
        int[] iArr = this.k;
        if (iArr != null) {
            this.d.a(iArr);
        }
        Bitmap bitmap = this.n;
        if (bitmap != null) {
            this.d.a(bitmap);
        }
        this.n = null;
        this.e = null;
        this.t = null;
        byte[] bArr2 = this.f;
        if (bArr2 != null) {
            this.d.a(bArr2);
        }
    }

    private synchronized void a(cc ccVar, ByteBuffer byteBuffer, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Sample size must be >=0, not: ".concat(String.valueOf(i)));
        }
        int highestOneBit = Integer.highestOneBit(i);
        this.p = 0;
        this.m = ccVar;
        this.l = -1;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.e = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.e.order(ByteOrder.LITTLE_ENDIAN);
        this.o = false;
        Iterator<cb> it = ccVar.e.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().g == 3) {
                    this.o = true;
                    break;
                }
            } else {
                break;
            }
        }
        this.q = highestOneBit;
        this.s = ccVar.f / highestOneBit;
        this.r = ccVar.g / highestOneBit;
        this.j = this.d.a(ccVar.f * ccVar.g);
        this.k = this.d.b(this.s * this.r);
    }

    @Override // defpackage.ca
    public final void a(Bitmap.Config config) {
        if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
            throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
        }
        this.u = config;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0045, code lost:
        if (r33.m.j == r34.h) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.graphics.Bitmap a(defpackage.cb r34, defpackage.cb r35) {
        /*
            Method dump skipped, instructions count: 1103
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ce.a(cb, cb):android.graphics.Bitmap");
    }

    private int j() {
        return this.e.get() & 255;
    }

    private Bitmap k() {
        Boolean bool = this.t;
        Bitmap a2 = this.d.a(this.s, this.r, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.u);
        a2.setHasAlpha(true);
        return a2;
    }
}
