package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: bpy  reason: default package */
/* loaded from: classes2.dex */
public final class bpy implements ServiceConnection {
    final /* synthetic */ bpv a;
    private final String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bpy(bpv bpvVar, String str) {
        this.a = bpvVar;
        this.b = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.a.a.q().f.a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            atc a = ase.a(iBinder);
            if (a == null) {
                this.a.a.q().f.a("Install Referrer Service implementation was not found");
                return;
            }
            this.a.a.q().i.a("Install Referrer Service connected");
            this.a.a.p().a(new bpx(this, a, this));
        } catch (Exception e) {
            this.a.a.q().f.a("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.a.q().i.a("Install Referrer Service disconnected");
    }
}
