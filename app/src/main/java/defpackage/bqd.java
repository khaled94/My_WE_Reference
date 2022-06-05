package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Bundle;

/* renamed from: bqd  reason: default package */
/* loaded from: classes2.dex */
final class bqd implements Runnable {
    private final /* synthetic */ bql a;
    private final /* synthetic */ long b;
    private final /* synthetic */ Bundle c;
    private final /* synthetic */ Context d;
    private final /* synthetic */ bpi e;
    private final /* synthetic */ BroadcastReceiver.PendingResult f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bqd(bql bqlVar, long j, Bundle bundle, Context context, bpi bpiVar, BroadcastReceiver.PendingResult pendingResult) {
        this.a = bqlVar;
        this.b = j;
        this.c = bundle;
        this.d = context;
        this.e = bpiVar;
        this.f = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long a = this.a.b().i.a();
        long j = this.b;
        if (a > 0 && (j >= a || j <= 0)) {
            j = a - 1;
        }
        if (j > 0) {
            this.c.putLong("click_timestamp", j);
        }
        this.c.putString("_cis", "referrer broadcast");
        bql.a(this.d, (baz) null).d().a("auto", "_cmp", this.c);
        this.e.k.a("Install campaign recorded");
        BroadcastReceiver.PendingResult pendingResult = this.f;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
