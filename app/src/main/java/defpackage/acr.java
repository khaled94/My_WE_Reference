package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: acr  reason: default package */
/* loaded from: classes.dex */
public final class acr implements ServiceConnection {
    final /* synthetic */ aad a;
    private final int b;

    public acr(aad aadVar, int i) {
        this.a = aadVar;
        this.b = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        aao aaoVar;
        aad aadVar = this.a;
        if (iBinder == null) {
            aad.f(aadVar);
            return;
        }
        obj = aadVar.t;
        synchronized (obj) {
            aad aadVar2 = this.a;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface != null && (queryLocalInterface instanceof aao)) {
                aaoVar = (aao) queryLocalInterface;
            } else {
                aaoVar = new aci(iBinder);
            }
            aadVar2.u = aaoVar;
        }
        this.a.a(0, this.b);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.a.t;
        synchronized (obj) {
            this.a.u = null;
        }
        Handler handler = this.a.g;
        handler.sendMessage(handler.obtainMessage(6, this.b, 1));
    }
}
