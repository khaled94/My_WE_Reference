package defpackage;

import android.os.Process;

/* renamed from: aga  reason: default package */
/* loaded from: classes.dex */
final class aga extends Thread {
    /* JADX INFO: Access modifiers changed from: package-private */
    public aga(ThreadGroup threadGroup) {
        super(threadGroup, "GmsDynamite");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }
}
