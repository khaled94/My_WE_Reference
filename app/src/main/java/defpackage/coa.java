package defpackage;

import android.content.BroadcastReceiver;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: coa  reason: default package */
/* loaded from: classes2.dex */
final class coa {
    final Intent a;
    private final BroadcastReceiver.PendingResult b;
    private boolean c = false;
    private final ScheduledFuture<?> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public coa(final Intent intent, BroadcastReceiver.PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.a = intent;
        this.b = pendingResult;
        this.d = scheduledExecutorService.schedule(new Runnable(this, intent) { // from class: cnz
            private final coa a;
            private final Intent b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.b = intent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                coa coaVar = this.a;
                String action = this.b.getAction();
                StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
                sb.append("Service took too long to process intent: ");
                sb.append(action);
                sb.append(" App may get closed.");
                coaVar.a();
            }
        }, 9000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a() {
        if (!this.c) {
            this.b.finish();
            this.d.cancel(false);
            this.c = true;
        }
    }
}
