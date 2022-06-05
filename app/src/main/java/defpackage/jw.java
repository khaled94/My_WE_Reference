package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import defpackage.jw;
import java.util.Map;

/* renamed from: jw  reason: default package */
/* loaded from: classes2.dex */
public abstract class jw<T extends jw<T>> implements Cloneable {
    private int a;
    Drawable e;
    int f;
    Drawable g;
    int h;
    boolean m;
    Drawable o;
    int p;
    public boolean t;
    Resources.Theme u;
    public boolean v;
    boolean w;
    boolean x;
    boolean z;
    float b = 1.0f;
    dt c = dt.e;
    protected bt d = bt.NORMAL;
    public boolean i = true;
    protected int j = -1;
    protected int k = -1;
    ck l = kt.a();
    protected boolean n = true;
    cm q = new cm();
    Map<Class<?>, cq<?>> r = new kw();
    Class<?> s = Object.class;
    boolean y = true;

    private static boolean b(int i, int i2) {
        return (i & i2) != 0;
    }

    public final T a(float f) {
        jw<T> jwVar = this;
        while (jwVar.v) {
            jwVar = jwVar.clone();
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        jwVar.b = f;
        jwVar.a |= 2;
        return jwVar.e();
    }

    public final T b() {
        jw<T> jwVar = this;
        while (jwVar.v) {
            jwVar = jwVar.clone();
        }
        jwVar.z = true;
        jwVar.a |= 1048576;
        return jwVar.e();
    }

    public final T a(dt dtVar) {
        jw<T> jwVar = this;
        while (jwVar.v) {
            jwVar = jwVar.clone();
        }
        jwVar.c = (dt) lf.a(dtVar, "Argument must not be null");
        jwVar.a |= 4;
        return jwVar.e();
    }

    public final T a(bt btVar) {
        jw<T> jwVar = this;
        while (jwVar.v) {
            jwVar = jwVar.clone();
        }
        jwVar.d = (bt) lf.a(btVar, "Argument must not be null");
        jwVar.a |= 8;
        return jwVar.e();
    }

    public final T a(int i) {
        jw<T> jwVar = this;
        while (jwVar.v) {
            jwVar = jwVar.clone();
        }
        jwVar.h = i;
        int i2 = jwVar.a | 128;
        jwVar.a = i2;
        jwVar.g = null;
        jwVar.a = i2 & (-65);
        return jwVar.e();
    }

    public final T b(int i) {
        jw<T> jwVar = this;
        while (jwVar.v) {
            jwVar = jwVar.clone();
        }
        jwVar.f = i;
        int i2 = jwVar.a | 32;
        jwVar.a = i2;
        jwVar.e = null;
        jwVar.a = i2 & (-17);
        return jwVar.e();
    }

    public final T c() {
        jw<T> jwVar = this;
        while (jwVar.v) {
            jwVar = jwVar.clone();
        }
        jwVar.i = false;
        jwVar.a |= 256;
        return jwVar.e();
    }

    public final T a(int i, int i2) {
        jw<T> jwVar = this;
        while (jwVar.v) {
            jwVar = jwVar.clone();
        }
        jwVar.k = i;
        jwVar.j = i2;
        jwVar.a |= 512;
        return jwVar.e();
    }

    public final T a(ck ckVar) {
        jw<T> jwVar = this;
        while (jwVar.v) {
            jwVar = jwVar.clone();
        }
        jwVar.l = (ck) lf.a(ckVar, "Argument must not be null");
        jwVar.a |= 1024;
        return jwVar.e();
    }

    /* renamed from: a */
    public T clone() {
        try {
            T t = (T) super.clone();
            cm cmVar = new cm();
            t.q = cmVar;
            cmVar.a(this.q);
            kw kwVar = new kw();
            t.r = kwVar;
            kwVar.putAll(this.r);
            t.t = false;
            t.v = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final T a(Class<?> cls) {
        jw<T> jwVar = this;
        while (jwVar.v) {
            jwVar = jwVar.clone();
        }
        jwVar.s = (Class) lf.a(cls, "Argument must not be null");
        jwVar.a |= 4096;
        return jwVar.e();
    }

    private T a(gz gzVar) {
        cl<gz> clVar = gz.h;
        Object a = lf.a(gzVar, "Argument must not be null");
        jw<T> jwVar = this;
        while (jwVar.v) {
            jwVar = jwVar.clone();
        }
        lf.a(clVar, "Argument must not be null");
        lf.a(a, "Argument must not be null");
        jwVar.q.a(clVar, a);
        return jwVar.e();
    }

    public final T d() {
        return b(gz.d, new gy());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final T a(gz gzVar, cq<Bitmap> cqVar) {
        jw<T> jwVar = this;
        while (jwVar.v) {
            jwVar = jwVar.clone();
        }
        jwVar.a(gzVar);
        return jwVar.a(cqVar, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final T b(gz gzVar, cq<Bitmap> cqVar) {
        T a = a(gzVar, cqVar);
        a.y = true;
        return a;
    }

    public final T a(cq<Bitmap> cqVar) {
        return a(cqVar, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private T a(cq<Bitmap> cqVar, boolean z) {
        jw<T> jwVar = this;
        while (jwVar.v) {
            jwVar = jwVar.clone();
        }
        hc hcVar = new hc(cqVar, z);
        jwVar.a(Bitmap.class, cqVar, z);
        jwVar.a(Drawable.class, hcVar, z);
        jwVar.a(BitmapDrawable.class, hcVar, z);
        jwVar.a(ic.class, new C0054if(cqVar), z);
        return jwVar.e();
    }

    private <Y> T a(Class<Y> cls, cq<Y> cqVar, boolean z) {
        jw<T> jwVar = this;
        while (jwVar.v) {
            jwVar = jwVar.clone();
        }
        lf.a(cls, "Argument must not be null");
        lf.a(cqVar, "Argument must not be null");
        jwVar.r.put(cls, cqVar);
        int i = jwVar.a | 2048;
        jwVar.a = i;
        jwVar.n = true;
        int i2 = i | 65536;
        jwVar.a = i2;
        jwVar.y = false;
        if (z) {
            jwVar.a = i2 | 131072;
            jwVar.m = true;
        }
        return jwVar.e();
    }

    public T b(jw<?> jwVar) {
        if (this.v) {
            return (T) clone().b(jwVar);
        }
        if (b(jwVar.a, 2)) {
            this.b = jwVar.b;
        }
        if (b(jwVar.a, 262144)) {
            this.w = jwVar.w;
        }
        if (b(jwVar.a, 1048576)) {
            this.z = jwVar.z;
        }
        if (b(jwVar.a, 4)) {
            this.c = jwVar.c;
        }
        if (b(jwVar.a, 8)) {
            this.d = jwVar.d;
        }
        if (b(jwVar.a, 16)) {
            this.e = jwVar.e;
            this.f = 0;
            this.a &= -33;
        }
        if (b(jwVar.a, 32)) {
            this.f = jwVar.f;
            this.e = null;
            this.a &= -17;
        }
        if (b(jwVar.a, 64)) {
            this.g = jwVar.g;
            this.h = 0;
            this.a &= -129;
        }
        if (b(jwVar.a, 128)) {
            this.h = jwVar.h;
            this.g = null;
            this.a &= -65;
        }
        if (b(jwVar.a, 256)) {
            this.i = jwVar.i;
        }
        if (b(jwVar.a, 512)) {
            this.k = jwVar.k;
            this.j = jwVar.j;
        }
        if (b(jwVar.a, 1024)) {
            this.l = jwVar.l;
        }
        if (b(jwVar.a, 4096)) {
            this.s = jwVar.s;
        }
        if (b(jwVar.a, 8192)) {
            this.o = jwVar.o;
            this.p = 0;
            this.a &= -16385;
        }
        if (b(jwVar.a, 16384)) {
            this.p = jwVar.p;
            this.o = null;
            this.a &= -8193;
        }
        if (b(jwVar.a, 32768)) {
            this.u = jwVar.u;
        }
        if (b(jwVar.a, 65536)) {
            this.n = jwVar.n;
        }
        if (b(jwVar.a, 131072)) {
            this.m = jwVar.m;
        }
        if (b(jwVar.a, 2048)) {
            this.r.putAll(jwVar.r);
            this.y = jwVar.y;
        }
        if (b(jwVar.a, 524288)) {
            this.x = jwVar.x;
        }
        if (!this.n) {
            this.r.clear();
            int i = this.a & (-2049);
            this.a = i;
            this.m = false;
            this.a = i & (-131073);
            this.y = true;
        }
        this.a |= jwVar.a;
        this.q.a(jwVar.q);
        return e();
    }

    public boolean equals(Object obj) {
        if (obj instanceof jw) {
            jw jwVar = (jw) obj;
            if (Float.compare(jwVar.b, this.b) == 0 && this.f == jwVar.f && lg.a(this.e, jwVar.e) && this.h == jwVar.h && lg.a(this.g, jwVar.g) && this.p == jwVar.p && lg.a(this.o, jwVar.o) && this.i == jwVar.i && this.j == jwVar.j && this.k == jwVar.k && this.m == jwVar.m && this.n == jwVar.n && this.w == jwVar.w && this.x == jwVar.x && this.c.equals(jwVar.c) && this.d == jwVar.d && this.q.equals(jwVar.q) && this.r.equals(jwVar.r) && this.s.equals(jwVar.s) && lg.a(this.l, jwVar.l) && lg.a(this.u, jwVar.u)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return lg.a(this.u, lg.a(this.l, lg.a(this.s, lg.a(this.r, lg.a(this.q, lg.a(this.d, lg.a(this.c, lg.a(this.x, lg.a(this.w, lg.a(this.n, lg.a(this.m, lg.b(this.k, lg.b(this.j, lg.a(this.i, lg.a(this.o, lg.b(this.p, lg.a(this.g, lg.b(this.h, lg.a(this.e, lg.b(this.f, lg.a(this.b)))))))))))))))))))));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final T e() {
        if (!this.t) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    public final boolean f() {
        return lg.a(this.k, this.j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean c(int i) {
        return b(this.a, i);
    }
}
