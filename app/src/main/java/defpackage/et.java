package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Set;

/* renamed from: et  reason: default package */
/* loaded from: classes2.dex */
public final class et implements en {
    private static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
    private final eu b;
    private final Set<Bitmap.Config> c;
    private final long d;
    private final a e;
    private long f;
    private long g;
    private int h;
    private int i;
    private int j;
    private int k;

    /* renamed from: et$a */
    /* loaded from: classes2.dex */
    interface a {
    }

    private et(long j, eu euVar, Set<Bitmap.Config> set) {
        this.d = j;
        this.f = j;
        this.b = euVar;
        this.c = set;
        this.e = new b();
    }

    @Override // defpackage.en
    public final synchronized void a(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.b.c(bitmap) <= this.f && this.c.contains(bitmap.getConfig())) {
                int c = this.b.c(bitmap);
                this.b.a(bitmap);
                this.j++;
                this.g += c;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    new StringBuilder("Put bitmap in pool=").append(this.b.b(bitmap));
                }
                b();
                a(this.f);
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb = new StringBuilder("Reject bitmap from pool, bitmap: ");
                sb.append(this.b.b(bitmap));
                sb.append(", is mutable: ");
                sb.append(bitmap.isMutable());
                sb.append(", is allowed config: ");
                sb.append(this.c.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.en
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        Bitmap d = d(i, i2, config);
        if (d != null) {
            d.eraseColor(0);
            return d;
        }
        return c(i, i2, config);
    }

    @Override // defpackage.en
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap d = d(i, i2, config);
        return d == null ? c(i, i2, config) : d;
    }

    private static Bitmap c(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = a;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.en
    public final void a() {
        a(0L);
    }

    @Override // defpackage.en
    public final void a(int i) {
        if (i >= 40 || (Build.VERSION.SDK_INT >= 23 && i >= 20)) {
            a(0L);
        } else if (i < 20 && i != 15) {
        } else {
            a(this.f / 2);
        }
    }

    private synchronized void a(long j) {
        while (this.g > j) {
            Bitmap a2 = this.b.a();
            if (a2 == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    c();
                }
                this.g = 0L;
                return;
            }
            this.g -= this.b.c(a2);
            this.k++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                new StringBuilder("Evicting bitmap=").append(this.b.b(a2));
            }
            b();
            a2.recycle();
        }
    }

    private void b() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            c();
        }
    }

    private void c() {
        StringBuilder sb = new StringBuilder("Hits=");
        sb.append(this.h);
        sb.append(", misses=");
        sb.append(this.i);
        sb.append(", puts=");
        sb.append(this.j);
        sb.append(", evictions=");
        sb.append(this.k);
        sb.append(", currentSize=");
        sb.append(this.g);
        sb.append(", maxSize=");
        sb.append(this.f);
        sb.append("\nStrategy=");
        sb.append(this.b);
    }

    /* renamed from: et$b */
    /* loaded from: classes2.dex */
    static final class b implements a {
        b() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public et(long r5) {
        /*
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto Lc
            ew r0 = new ew
            r0.<init>()
            goto L11
        Lc:
            el r0 = new el
            r0.<init>()
        L11:
            java.util.HashSet r2 = new java.util.HashSet
            android.graphics.Bitmap$Config[] r3 = android.graphics.Bitmap.Config.values()
            java.util.List r3 = java.util.Arrays.asList(r3)
            r2.<init>(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r1) goto L26
            r1 = 0
            r2.add(r1)
        L26:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r1 < r3) goto L31
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.HARDWARE
            r2.remove(r1)
        L31:
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r2)
            r4.<init>(r5, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.et.<init>(long):void");
    }

    private synchronized Bitmap d(int i, int i2, Bitmap.Config config) {
        Bitmap a2;
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
        a2 = this.b.a(i, i2, config != null ? config : a);
        if (a2 == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                new StringBuilder("Missing bitmap=").append(this.b.b(i, i2, config));
            }
            this.i++;
        } else {
            this.h++;
            this.g -= this.b.c(a2);
            a2.setHasAlpha(true);
            if (Build.VERSION.SDK_INT >= 19) {
                a2.setPremultiplied(true);
            }
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            new StringBuilder("Get bitmap=").append(this.b.b(i, i2, config));
        }
        b();
        return a2;
    }
}
