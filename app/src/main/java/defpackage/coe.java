package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: coe  reason: default package */
/* loaded from: classes2.dex */
public final class coe implements ServiceConnection {
    private final Context a;
    private final Intent b;
    private final ScheduledExecutorService c;
    private final Queue<coa> d;
    private coc e;
    private boolean f;

    public coe(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new aei("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private coe(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.d = new ArrayDeque();
        this.f = false;
        this.a = context.getApplicationContext();
        this.b = new Intent(str).setPackage(this.a.getPackageName());
        this.c = scheduledExecutorService;
    }

    public final synchronized void a(Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        this.d.add(new coa(intent, pendingResult, this.c));
        a();
    }

    private final synchronized void a() {
        while (!this.d.isEmpty()) {
            if (this.e != null && this.e.isBinderAlive()) {
                coa poll = this.d.poll();
                coc cocVar = this.e;
                if (Binder.getCallingUid() != Process.myUid()) {
                    throw new SecurityException("Binding only allowed within app");
                }
                if (cocVar.a.c(poll.a)) {
                    poll.a();
                } else {
                    cocVar.a.a.execute(new cob(cocVar, poll));
                }
            } else {
                if (Log.isLoggable("EnhancedIntentService", 3)) {
                    boolean z = !this.f;
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("binder is dead. start connection? ");
                    sb.append(z);
                }
                if (!this.f) {
                    this.f = true;
                    try {
                        if (adt.a().a(this.a, this.b, this, 65)) {
                            return;
                        }
                    } catch (SecurityException unused) {
                    }
                    this.f = false;
                    b();
                }
                return;
            }
        }
    }

    private final void b() {
        while (!this.d.isEmpty()) {
            this.d.poll().a();
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("onServiceConnected: ");
            sb.append(valueOf);
        }
        this.f = false;
        if (!(iBinder instanceof coc)) {
            String valueOf2 = String.valueOf(iBinder);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
            sb2.append("Invalid service connection: ");
            sb2.append(valueOf2);
            b();
            return;
        }
        this.e = (coc) iBinder;
        a();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(valueOf);
        }
        a();
    }
}
