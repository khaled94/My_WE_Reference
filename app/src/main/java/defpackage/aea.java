package defpackage;

import android.os.SystemClock;

/* renamed from: aea  reason: default package */
/* loaded from: classes.dex */
public final class aea implements ady {
    private static final aea a = new aea();

    private aea() {
    }

    public static ady d() {
        return a;
    }

    @Override // defpackage.ady
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.ady
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.ady
    public final long c() {
        return System.nanoTime();
    }
}
