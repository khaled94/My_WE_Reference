package defpackage;

import io.realm.internal.NativeObjectReference;
import io.realm.log.RealmLog;
import java.lang.ref.ReferenceQueue;

/* renamed from: dlc  reason: default package */
/* loaded from: classes2.dex */
final class dlc implements Runnable {
    private final ReferenceQueue<dlf> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public dlc(ReferenceQueue<dlf> referenceQueue) {
        this.a = referenceQueue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                ((NativeObjectReference) this.a.remove()).a();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                RealmLog.c("The FinalizerRunnable thread has been interrupted. Native resources cannot be freed anymore", new Object[0]);
                return;
            }
        }
    }
}
