package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import defpackage.it;
import defpackage.la;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: jj  reason: default package */
/* loaded from: classes2.dex */
final class jj {
    private static volatile jj b;
    final Set<it.a> a = new HashSet();
    private final a c;
    private boolean d;

    /* renamed from: jj$a */
    /* loaded from: classes2.dex */
    interface a {
        boolean a();

        void b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static jj a(Context context) {
        if (b == null) {
            synchronized (jj.class) {
                if (b == null) {
                    b = new jj(context.getApplicationContext());
                }
            }
        }
        return b;
    }

    private jj(final Context context) {
        a aVar;
        final la.a<ConnectivityManager> aVar2 = new la.a<ConnectivityManager>() { // from class: jj.1
            @Override // defpackage.la.a
            public final /* synthetic */ ConnectivityManager a() {
                return (ConnectivityManager) context.getSystemService("connectivity");
            }
        };
        la.a<T> aVar3 = new la.a<T>() { // from class: la.1
            private volatile T b;

            /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
            @Override // defpackage.la.a
            public final T a() {
                if (this.b == 0) {
                    synchronized (this) {
                        if (this.b == 0) {
                            this.b = lf.a(aVar2.a(), "Argument must not be null");
                        }
                    }
                }
                return this.b;
            }
        };
        it.a aVar4 = new it.a() { // from class: jj.2
            @Override // defpackage.it.a
            public final void a(boolean z) {
                ArrayList<it.a> arrayList;
                synchronized (jj.this) {
                    arrayList = new ArrayList(jj.this.a);
                }
                for (it.a aVar5 : arrayList) {
                    aVar5.a(z);
                }
            }
        };
        if (Build.VERSION.SDK_INT >= 24) {
            aVar = new b(aVar3, aVar4);
        } else {
            aVar = new c(context, aVar3, aVar4);
        }
        this.c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(it.a aVar) {
        this.a.add(aVar);
        if (!this.d && !this.a.isEmpty()) {
            this.d = this.c.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(it.a aVar) {
        this.a.remove(aVar);
        if (this.d && this.a.isEmpty()) {
            this.c.b();
            this.d = false;
        }
    }

    /* renamed from: jj$b */
    /* loaded from: classes2.dex */
    static final class b implements a {
        boolean a;
        final it.a b;
        private final la.a<ConnectivityManager> c;
        private final ConnectivityManager.NetworkCallback d = new ConnectivityManager.NetworkCallback() { // from class: jj.b.1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                a(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                a(false);
            }

            private void a(final boolean z) {
                lg.a(new Runnable() { // from class: jj.b.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        boolean z2 = z;
                        lg.a();
                        boolean z3 = b.this.a;
                        b.this.a = z2;
                        if (z3 != z2) {
                            b.this.b.a(z2);
                        }
                    }
                });
            }
        };

        b(la.a<ConnectivityManager> aVar, it.a aVar2) {
            this.c = aVar;
            this.b = aVar2;
        }

        @Override // defpackage.jj.a
        public final boolean a() {
            this.a = this.c.a().getActiveNetwork() != null;
            try {
                this.c.a().registerDefaultNetworkCallback(this.d);
                return true;
            } catch (RuntimeException unused) {
                return false;
            }
        }

        @Override // defpackage.jj.a
        public final void b() {
            this.c.a().unregisterNetworkCallback(this.d);
        }
    }

    /* renamed from: jj$c */
    /* loaded from: classes2.dex */
    static final class c implements a {
        final it.a a;
        boolean b;
        private final Context c;
        private final la.a<ConnectivityManager> d;
        private final BroadcastReceiver e = new BroadcastReceiver() { // from class: jj.c.1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                boolean z = c.this.b;
                c cVar = c.this;
                cVar.b = cVar.c();
                if (z != c.this.b) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        new StringBuilder("connectivity changed, isConnected: ").append(c.this.b);
                    }
                    c.this.a.a(c.this.b);
                }
            }
        };

        c(Context context, la.a<ConnectivityManager> aVar, it.a aVar2) {
            this.c = context.getApplicationContext();
            this.d = aVar;
            this.a = aVar2;
        }

        @Override // defpackage.jj.a
        public final boolean a() {
            this.b = c();
            try {
                this.c.registerReceiver(this.e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        }

        @Override // defpackage.jj.a
        public final void b() {
            this.c.unregisterReceiver(this.e);
        }

        final boolean c() {
            try {
                NetworkInfo activeNetworkInfo = this.d.a().getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            } catch (RuntimeException unused) {
                return true;
            }
        }
    }
}
