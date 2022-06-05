package defpackage;

import android.os.Process;

/* renamed from: aek  reason: default package */
/* loaded from: classes.dex */
final class aek implements Runnable {
    private final Runnable a;

    public aek(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.a.run();
    }
}
