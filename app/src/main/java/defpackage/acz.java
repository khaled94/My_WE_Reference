package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: acz  reason: default package */
/* loaded from: classes.dex */
public final class acz implements adc, ServiceConnection {
    final Map<ServiceConnection, ServiceConnection> a = new HashMap();
    int b = 2;
    boolean c;
    IBinder d;
    final acy e;
    ComponentName f;
    final /* synthetic */ adb g;

    public acz(adb adbVar, acy acyVar) {
        this.g = adbVar;
        this.e = acyVar;
    }

    public final void a(ServiceConnection serviceConnection, ServiceConnection serviceConnection2) {
        this.a.put(serviceConnection, serviceConnection2);
    }

    public final void a(String str) {
        adt adtVar;
        Context context;
        Context context2;
        adt adtVar2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j;
        this.b = 3;
        adb adbVar = this.g;
        adtVar = adbVar.f;
        context = adbVar.c;
        acy acyVar = this.e;
        context2 = adbVar.c;
        boolean a = adtVar.a(context, str, acyVar.a(context2), this, this.e.c);
        this.c = a;
        if (a) {
            handler = this.g.d;
            Message obtainMessage = handler.obtainMessage(1, this.e);
            handler2 = this.g.d;
            j = this.g.h;
            handler2.sendMessageDelayed(obtainMessage, j);
            return;
        }
        this.b = 2;
        try {
            adb adbVar2 = this.g;
            adtVar2 = adbVar2.f;
            context3 = adbVar2.c;
            adtVar2.a(context3, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final boolean a() {
        return this.a.isEmpty();
    }

    public final boolean a(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.g.b;
        synchronized (hashMap) {
            handler = this.g.d;
            handler.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            for (ServiceConnection serviceConnection : this.a.values()) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.g.b;
        synchronized (hashMap) {
            handler = this.g.d;
            handler.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            for (ServiceConnection serviceConnection : this.a.values()) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }
}
