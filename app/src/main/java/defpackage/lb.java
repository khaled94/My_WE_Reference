package defpackage;

import android.os.Build;
import android.os.SystemClock;

/* renamed from: lb  reason: default package */
/* loaded from: classes2.dex */
public final class lb {
    private static final double a;

    static {
        double d = 1.0d;
        if (Build.VERSION.SDK_INT >= 17) {
            d = 1.0d / Math.pow(10.0d, 6.0d);
        }
        a = d;
    }

    private lb() {
    }

    public static long a() {
        if (Build.VERSION.SDK_INT >= 17) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return SystemClock.uptimeMillis();
    }

    public static double a(long j) {
        return (a() - j) * a;
    }
}
