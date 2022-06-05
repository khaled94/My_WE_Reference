package defpackage;

import android.content.Intent;

/* renamed from: cnw  reason: default package */
/* loaded from: classes2.dex */
final class cnw implements Runnable {
    private final /* synthetic */ Intent a;
    private final /* synthetic */ Intent b;
    private final /* synthetic */ cny c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cnw(cny cnyVar, Intent intent, Intent intent2) {
        this.c = cnyVar;
        this.a = intent;
        this.b = intent2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b(this.a);
        this.c.d(this.b);
    }
}
