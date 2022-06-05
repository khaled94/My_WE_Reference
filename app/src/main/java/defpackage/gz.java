package defpackage;

import android.os.Build;

/* renamed from: gz  reason: default package */
/* loaded from: classes2.dex */
public abstract class gz {
    public static final gz a = new a();
    public static final gz b = new b();
    public static final gz c = new e();
    public static final gz d = new c();
    public static final gz e = new d();
    public static final gz f = new f();
    public static final gz g;
    public static final cl<gz> h;
    static final boolean i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: gz$g */
    /* loaded from: classes2.dex */
    public static final class g extends Enum<g> {
        public static final int a = 1;
        public static final int b = 2;
        private static final /* synthetic */ int[] c = {1, 2};
    }

    public abstract float a(int i2, int i3, int i4, int i5);

    public abstract int b(int i2, int i3, int i4, int i5);

    static {
        gz gzVar = e;
        g = gzVar;
        h = cl.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", gzVar);
        i = Build.VERSION.SDK_INT >= 19;
    }

    /* renamed from: gz$e */
    /* loaded from: classes2.dex */
    static class e extends gz {
        e() {
        }

        @Override // defpackage.gz
        public final float a(int i, int i2, int i3, int i4) {
            if (i) {
                return Math.min(i3 / i, i4 / i2);
            }
            int max = Math.max(i2 / i4, i / i3);
            if (max != 0) {
                return 1.0f / Integer.highestOneBit(max);
            }
            return 1.0f;
        }

        @Override // defpackage.gz
        public final int b(int i, int i2, int i3, int i4) {
            if (i) {
                return g.b;
            }
            return g.a;
        }
    }

    /* renamed from: gz$d */
    /* loaded from: classes2.dex */
    static class d extends gz {
        d() {
        }

        @Override // defpackage.gz
        public final float a(int i, int i2, int i3, int i4) {
            return Math.max(i3 / i, i4 / i2);
        }

        @Override // defpackage.gz
        public final int b(int i, int i2, int i3, int i4) {
            return g.b;
        }
    }

    /* renamed from: gz$a */
    /* loaded from: classes2.dex */
    static class a extends gz {
        a() {
        }

        @Override // defpackage.gz
        public final float a(int i, int i2, int i3, int i4) {
            int min = Math.min(i2 / i4, i / i3);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(min);
        }

        @Override // defpackage.gz
        public final int b(int i, int i2, int i3, int i4) {
            return g.b;
        }
    }

    /* renamed from: gz$b */
    /* loaded from: classes2.dex */
    static class b extends gz {
        b() {
        }

        @Override // defpackage.gz
        public final float a(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            int i5 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i5 = 0;
            }
            return 1.0f / (max << i5);
        }

        @Override // defpackage.gz
        public final int b(int i, int i2, int i3, int i4) {
            return g.a;
        }
    }

    /* renamed from: gz$f */
    /* loaded from: classes2.dex */
    static class f extends gz {
        @Override // defpackage.gz
        public final float a(int i, int i2, int i3, int i4) {
            return 1.0f;
        }

        f() {
        }

        @Override // defpackage.gz
        public final int b(int i, int i2, int i3, int i4) {
            return g.b;
        }
    }

    /* renamed from: gz$c */
    /* loaded from: classes2.dex */
    static class c extends gz {
        c() {
        }

        @Override // defpackage.gz
        public final float a(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, c.a(i, i2, i3, i4));
        }

        @Override // defpackage.gz
        public final int b(int i, int i2, int i3, int i4) {
            if (a(i, i2, i3, i4) == 1.0f) {
                return g.b;
            }
            return c.b(i, i2, i3, i4);
        }
    }
}
