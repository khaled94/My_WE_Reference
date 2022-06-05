package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* renamed from: ff  reason: default package */
/* loaded from: classes2.dex */
public final class ff {
    public final int a;
    public final int b;
    public final int c;
    private final Context d;

    /* renamed from: ff$c */
    /* loaded from: classes2.dex */
    interface c {
        int a();

        int b();
    }

    public ff(a aVar) {
        int i;
        ActivityManager activityManager;
        this.d = aVar.b;
        if (a(aVar.c)) {
            i = aVar.i / 2;
        } else {
            i = aVar.i;
        }
        this.c = i;
        int round = Math.round(activityManager.getMemoryClass() * 1024 * 1024 * (a(aVar.c) ? aVar.h : aVar.g));
        float a2 = aVar.d.a() * aVar.d.b() * 4;
        int round2 = Math.round(aVar.f * a2);
        int round3 = Math.round(a2 * aVar.e);
        int i2 = round - this.c;
        int i3 = round3 + round2;
        if (i3 <= i2) {
            this.b = round3;
            this.a = round2;
        } else {
            float f = i2 / (aVar.f + aVar.e);
            this.b = Math.round(aVar.e * f);
            this.a = Math.round(f * aVar.f);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb.append(a(this.b));
            sb.append(", pool size: ");
            sb.append(a(this.a));
            sb.append(", byte array size: ");
            sb.append(a(this.c));
            sb.append(", memory class limited? ");
            sb.append(i3 > round);
            sb.append(", max size: ");
            sb.append(a(round));
            sb.append(", memoryClass: ");
            sb.append(aVar.c.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(a(aVar.c));
        }
    }

    private String a(int i) {
        return Formatter.formatFileSize(this.d, i);
    }

    static boolean a(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return true;
    }

    /* renamed from: ff$a */
    /* loaded from: classes2.dex */
    public static final class a {
        static final int a;
        final Context b;
        ActivityManager c;
        c d;
        float f;
        float e = 2.0f;
        float g = 0.4f;
        float h = 0.33f;
        int i = 4194304;

        static {
            a = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f = a;
            this.b = context;
            this.c = (ActivityManager) context.getSystemService("activity");
            this.d = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !ff.a(this.c)) {
                return;
            }
            this.f = 0.0f;
        }
    }

    /* renamed from: ff$b */
    /* loaded from: classes2.dex */
    static final class b implements c {
        private final DisplayMetrics a;

        b(DisplayMetrics displayMetrics) {
            this.a = displayMetrics;
        }

        @Override // defpackage.ff.c
        public final int a() {
            return this.a.widthPixels;
        }

        @Override // defpackage.ff.c
        public final int b() {
            return this.a.heightPixels;
        }
    }
}
