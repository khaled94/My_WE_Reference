package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import defpackage.vf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: abv  reason: default package */
/* loaded from: classes.dex */
public final class abv implements Handler.Callback {
    @NotOnlyInitialized
    public final abu a;
    public final Handler h;
    public final ArrayList<vf.b> b = new ArrayList<>();
    public final ArrayList<vf.b> c = new ArrayList<>();
    public final ArrayList<vf.c> d = new ArrayList<>();
    public volatile boolean e = false;
    public final AtomicInteger f = new AtomicInteger(0);
    public boolean g = false;
    public final Object i = new Object();

    public abv(Looper looper, abu abuVar) {
        this.a = abuVar;
        this.h = new ait(looper, this);
    }

    public final void a() {
        this.e = false;
        this.f.incrementAndGet();
    }

    public final void a(int i) {
        aat.a(this.h, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.h.removeMessages(1);
        synchronized (this.i) {
            this.g = true;
            ArrayList arrayList = new ArrayList(this.b);
            int i2 = this.f.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                vf.b bVar = (vf.b) it.next();
                if (!this.e || this.f.get() != i2) {
                    break;
                } else if (this.b.contains(bVar)) {
                    bVar.a(i);
                }
            }
            this.c.clear();
            this.g = false;
        }
    }

    public final void a(ConnectionResult connectionResult) {
        aat.a(this.h, "onConnectionFailure must only be called on the Handler thread");
        this.h.removeMessages(1);
        synchronized (this.i) {
            ArrayList arrayList = new ArrayList(this.d);
            int i = this.f.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                vf.c cVar = (vf.c) it.next();
                if (this.e && this.f.get() == i) {
                    if (this.d.contains(cVar)) {
                        cVar.a(connectionResult);
                    }
                }
                return;
            }
        }
    }

    public final void a(vf.b bVar) {
        aat.a(bVar);
        synchronized (this.i) {
            if (this.b.contains(bVar)) {
                String valueOf = String.valueOf(bVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
                sb.append("registerConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
            } else {
                this.b.add(bVar);
            }
        }
        if (this.a.j()) {
            Handler handler = this.h;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    public final void a(vf.c cVar) {
        aat.a(cVar);
        synchronized (this.i) {
            if (this.d.contains(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
            } else {
                this.d.add(cVar);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            vf.b bVar = (vf.b) message.obj;
            synchronized (this.i) {
                if (this.e && this.a.j() && this.b.contains(bVar)) {
                    bVar.a((Bundle) null);
                }
            }
            return true;
        }
        int i = message.what;
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i);
        Log.wtf("GmsClientEvents", sb.toString(), new Exception());
        return false;
    }
}
