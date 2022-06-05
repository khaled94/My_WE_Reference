package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.firebase.iid.zzak;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cna  reason: default package */
/* loaded from: classes2.dex */
public final class cna implements ServiceConnection {
    int a;
    final Messenger b;
    cng c;
    final Queue<cnh<?>> d;
    final SparseArray<cnh<?>> e;
    final /* synthetic */ cmz f;

    private cna(cmz cmzVar) {
        this.f = cmzVar;
        this.a = 0;
        this.b = new Messenger(new amg(Looper.getMainLooper(), new Handler.Callback(this) { // from class: cnc
            private final cna a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.a.a(message);
            }
        }));
        this.d = new ArrayDeque();
        this.e = new SparseArray<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean a(cnh cnhVar) {
        int i = this.a;
        if (i == 0) {
            this.d.add(cnhVar);
            aat.b(this.a == 0);
            this.a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            if (!adt.a().a(this.f.a, intent, this, 1)) {
                a(0, "Unable to bind to service");
            } else {
                this.f.b.schedule(new Runnable(this) { // from class: cnb
                    private final cna a;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b();
                    }
                }, 30L, TimeUnit.SECONDS);
            }
            return true;
        } else if (i == 1) {
            this.d.add(cnhVar);
            return true;
        } else if (i == 2) {
            this.d.add(cnhVar);
            c();
            return true;
        } else {
            if (i != 3 && i != 4) {
                int i2 = this.a;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(Message message) {
        int i = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Received response to request: ");
            sb.append(i);
        }
        synchronized (this) {
            cnh<?> cnhVar = this.e.get(i);
            if (cnhVar == null) {
                StringBuilder sb2 = new StringBuilder(50);
                sb2.append("Received response for unknown request: ");
                sb2.append(i);
                return true;
            }
            this.e.remove(i);
            a();
            Bundle data = message.getData();
            if (data.getBoolean("unsupported", false)) {
                cnhVar.a(new zzak(4, "Not supported by GmsCore"));
            } else {
                cnhVar.a(data);
            }
            return true;
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            a(0, "Null service connection");
            return;
        }
        try {
            this.c = new cng(iBinder);
            this.a = 2;
            c();
        } catch (RemoteException e) {
            a(0, e.getMessage());
        }
    }

    private final void c() {
        this.f.b.execute(new Runnable(this) { // from class: cne
            private final cna a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cna cnaVar = this.a;
                while (true) {
                    synchronized (cnaVar) {
                        if (cnaVar.a != 2) {
                            return;
                        }
                        if (cnaVar.d.isEmpty()) {
                            cnaVar.a();
                            return;
                        }
                        cnh<?> poll = cnaVar.d.poll();
                        cnaVar.e.put(poll.a, poll);
                        cnaVar.f.b.schedule(new Runnable(cnaVar, poll) { // from class: cnd
                            private final cna a;
                            private final cnh b;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.a = cnaVar;
                                this.b = poll;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.a.a(this.b.a);
                            }
                        }, 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            String valueOf = String.valueOf(poll);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
                            sb.append("Sending ");
                            sb.append(valueOf);
                        }
                        Context context = cnaVar.f.a;
                        Messenger messenger = cnaVar.b;
                        Message obtain = Message.obtain();
                        obtain.what = poll.c;
                        obtain.arg1 = poll.a;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", poll.a());
                        bundle.putString("pkg", context.getPackageName());
                        bundle.putBundle("data", poll.d);
                        obtain.setData(bundle);
                        try {
                            cng cngVar = cnaVar.c;
                            if (cngVar.a != null) {
                                cngVar.a.send(obtain);
                            } else if (cngVar.b != null) {
                                cngVar.b.a(obtain);
                            } else {
                                throw new IllegalStateException("Both messengers are null");
                                break;
                            }
                        } catch (RemoteException e) {
                            cnaVar.a(2, e.getMessage());
                        }
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        a(2, "Service disconnected");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Disconnected: ".concat(valueOf);
            } else {
                new String("Disconnected: ");
            }
        }
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    this.a = 4;
                    return;
                } else if (i2 == 4) {
                    return;
                } else {
                    int i3 = this.a;
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("Unknown state: ");
                    sb.append(i3);
                    throw new IllegalStateException(sb.toString());
                }
            }
            this.a = 4;
            adt.a().a(this.f.a, this);
            zzak zzakVar = new zzak(i, str);
            for (cnh<?> cnhVar : this.d) {
                cnhVar.a(zzakVar);
            }
            this.d.clear();
            for (int i4 = 0; i4 < this.e.size(); i4++) {
                this.e.valueAt(i4).a(zzakVar);
            }
            this.e.clear();
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a() {
        if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
            this.a = 3;
            adt.a().a(this.f.a, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        if (this.a == 1) {
            a(1, "Timed out while binding");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(int i) {
        cnh<?> cnhVar = this.e.get(i);
        if (cnhVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            this.e.remove(i);
            cnhVar.a(new zzak(3, "Timed out waiting for response"));
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ cna(cmz cmzVar, byte b) {
        this(cmzVar);
    }
}
