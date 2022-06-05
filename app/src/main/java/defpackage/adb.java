package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.CoroutineLiveDataKt;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: adb  reason: default package */
/* loaded from: classes.dex */
public final class adb extends aaj {
    private final Context c;
    private volatile Handler d;
    private final HashMap<acy, acz> b = new HashMap<>();
    private final ada e = new ada(this);
    private final adt f = adt.a();
    private final long g = CoroutineLiveDataKt.DEFAULT_TIMEOUT;
    private final long h = 300000;

    /* JADX INFO: Access modifiers changed from: package-private */
    public adb(Context context, Looper looper) {
        this.c = context.getApplicationContext();
        this.d = new aiy(looper, this.e);
    }

    @Override // defpackage.aaj
    protected final void a(acy acyVar, ServiceConnection serviceConnection) {
        aat.a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.b) {
            acz aczVar = this.b.get(acyVar);
            if (aczVar == null) {
                String obj = acyVar.toString();
                StringBuilder sb = new StringBuilder(obj.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString());
            } else if (!aczVar.a(serviceConnection)) {
                String obj2 = acyVar.toString();
                StringBuilder sb2 = new StringBuilder(obj2.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(obj2);
                throw new IllegalStateException(sb2.toString());
            } else {
                aczVar.a.remove(serviceConnection);
                if (aczVar.a()) {
                    this.d.sendMessageDelayed(this.d.obtainMessage(0, acyVar), this.g);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaj
    public final boolean a(acy acyVar, ServiceConnection serviceConnection, String str) {
        boolean z;
        aat.a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.b) {
            acz aczVar = this.b.get(acyVar);
            if (aczVar == null) {
                aczVar = new acz(this, acyVar);
                aczVar.a(serviceConnection, serviceConnection);
                aczVar.a(str);
                this.b.put(acyVar, aczVar);
            } else {
                this.d.removeMessages(0, acyVar);
                if (aczVar.a(serviceConnection)) {
                    String obj = acyVar.toString();
                    StringBuilder sb = new StringBuilder(obj.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(obj);
                    throw new IllegalStateException(sb.toString());
                }
                aczVar.a(serviceConnection, serviceConnection);
                int i = aczVar.b;
                if (i == 1) {
                    serviceConnection.onServiceConnected(aczVar.f, aczVar.d);
                } else if (i == 2) {
                    aczVar.a(str);
                }
            }
            z = aczVar.c;
        }
        return z;
    }
}
