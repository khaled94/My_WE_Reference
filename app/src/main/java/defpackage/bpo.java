package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bpo  reason: default package */
/* loaded from: classes2.dex */
public class bpo extends BroadcastReceiver {
    private static final String a = bpo.class.getName();
    private final buj b;
    private boolean c;
    private boolean d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bpo(buj bujVar) {
        aat.a(bujVar);
        this.b = bujVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.b.h();
        String action = intent.getAction();
        this.b.q().k.a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean e = this.b.c().e();
            if (this.d == e) {
                return;
            }
            this.d = e;
            this.b.p().a(new bpr(this, e));
            return;
        }
        this.b.q().f.a("NetworkBroadcastReceiver received unknown action", action);
    }

    public final void a() {
        this.b.h();
        this.b.p().c();
        if (this.c) {
            return;
        }
        this.b.m().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.d = this.b.c().e();
        this.b.q().k.a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.d));
        this.c = true;
    }

    public final void b() {
        this.b.h();
        this.b.p().c();
        this.b.p().c();
        if (!this.c) {
            return;
        }
        this.b.q().k.a("Unregistering connectivity change receiver");
        this.c = false;
        this.d = false;
        try {
            this.b.m().unregisterReceiver(this);
        } catch (IllegalArgumentException e) {
            this.b.q().c.a("Failed to unregister the network broadcast receiver", e);
        }
    }
}
