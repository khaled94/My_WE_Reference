package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: aad  reason: default package */
/* loaded from: classes.dex */
public abstract class aad<T extends IInterface> {
    private static final uw[] a = new uw[0];
    public static final String[] b = {"service_esmobile", "service_googleme"};
    private final b A;
    private final String B;
    private ConnectionResult C;
    private boolean D;
    private volatile acu E;
    int c;
    long d;
    ade e;
    protected final Context f;
    final Handler g;
    protected c h;
    public final int i;
    public volatile String j;
    protected AtomicInteger k;
    private long l;
    private int m;
    private long n;
    private volatile String o;
    private final Looper p;
    private final aaj q;
    private final uy r;
    private final Object s;
    private final Object t;
    private aao u;
    private T v;
    private final ArrayList<acp<?>> w;
    private acr x;
    private int y;
    private final a z;

    /* renamed from: aad$a */
    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(int i);
    }

    /* renamed from: aad$b */
    /* loaded from: classes.dex */
    public interface b {
        void a(ConnectionResult connectionResult);
    }

    /* renamed from: aad$c */
    /* loaded from: classes.dex */
    public interface c {
        void a(ConnectionResult connectionResult);
    }

    /* renamed from: aad$d */
    /* loaded from: classes.dex */
    public class d implements c {
        public d() {
        }

        @Override // defpackage.aad.c
        public final void a(ConnectionResult connectionResult) {
            if (connectionResult.b()) {
                aad aadVar = aad.this;
                aadVar.a((aal) null, aadVar.t());
            } else if (aad.this.A == null) {
            } else {
                aad.this.A.a(connectionResult);
            }
        }
    }

    /* renamed from: aad$e */
    /* loaded from: classes.dex */
    public interface e {
        void a();
    }

    private String A() {
        String str = this.B;
        return str == null ? this.f.getClass().getName() : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i, T t) {
        ade adeVar;
        boolean z = false;
        if ((i == 4) == (t != null)) {
            z = true;
        }
        aat.a(z);
        synchronized (this.s) {
            this.y = i;
            this.v = t;
            if (i == 1) {
                acr acrVar = this.x;
                if (acrVar != null) {
                    aaj aajVar = this.q;
                    String str = this.e.a;
                    aat.a(str);
                    String str2 = this.e.b;
                    int i2 = this.e.c;
                    A();
                    aajVar.a(str, str2, i2, acrVar, this.e.d);
                    this.x = null;
                }
            } else if (i == 2 || i == 3) {
                acr acrVar2 = this.x;
                if (acrVar2 != null && (adeVar = this.e) != null) {
                    String str3 = adeVar.a;
                    String str4 = adeVar.b;
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 70 + String.valueOf(str4).length());
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(str3);
                    sb.append(" on ");
                    sb.append(str4);
                    aaj aajVar2 = this.q;
                    String str5 = this.e.a;
                    aat.a(str5);
                    String str6 = this.e.b;
                    int i3 = this.e.c;
                    A();
                    aajVar2.a(str5, str6, i3, acrVar2, this.e.d);
                    this.k.incrementAndGet();
                }
                acr acrVar3 = new acr(this, this.k.get());
                this.x = acrVar3;
                int i4 = this.y;
                ade adeVar2 = new ade(s(), d(), aaj.a(), w());
                this.e = adeVar2;
                if (adeVar2.d && a() < 17895000) {
                    String valueOf = String.valueOf(this.e.a);
                    throw new IllegalStateException(valueOf.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf) : new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                }
                aaj aajVar3 = this.q;
                String str7 = this.e.a;
                aat.a(str7);
                if (!aajVar3.a(new acy(str7, this.e.b, this.e.c, this.e.d), acrVar3, A())) {
                    String str8 = this.e.a;
                    String str9 = this.e.b;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str8).length() + 34 + String.valueOf(str9).length());
                    sb2.append("unable to connect to service: ");
                    sb2.append(str8);
                    sb2.append(" on ");
                    sb2.append(str9);
                    a(16, this.k.get());
                }
            } else if (i == 4) {
                aat.a(t);
                this.l = System.currentTimeMillis();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(aad aadVar, acu acuVar) {
        aadVar.E = acuVar;
        if (aadVar.y()) {
            aag aagVar = acuVar.d;
            aau.a().a(aagVar == null ? null : aagVar.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean a(aad aadVar, int i, int i2, IInterface iInterface) {
        synchronized (aadVar.s) {
            if (aadVar.y != i) {
                return false;
            }
            aadVar.a(i2, (int) iInterface);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void f(aad aadVar) {
        int i;
        int i2;
        synchronized (aadVar.s) {
            i = aadVar.y;
        }
        if (i == 3) {
            aadVar.D = true;
            i2 = 5;
        } else {
            i2 = 4;
        }
        Handler handler = aadVar.g;
        handler.sendMessage(handler.obtainMessage(i2, aadVar.k.get(), 16));
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot read field "wordsInUse" because "set" is null
        	at java.base/java.util.BitSet.or(BitSet.java:943)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:732)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:811)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:706)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    static /* synthetic */ boolean h(defpackage.aad r2) {
        /*
            boolean r0 = r2.D
            r1 = 0
            if (r0 == 0) goto L6
            goto L21
        L6:
            java.lang.String r0 = r2.c()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L21
        L11:
            r0 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L19
            goto L21
        L19:
            java.lang.String r2 = r2.c()     // Catch: java.lang.ClassNotFoundException -> L21
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L21
            r1 = 1
        L21:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aad.h(aad):boolean");
    }

    public int a() {
        return uy.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract T a(IBinder iBinder);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(int i, int i2) {
        Handler handler = this.g;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new act(this, i)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.g;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new acs(this, i, iBinder, bundle)));
    }

    public final void a(c cVar) {
        aat.a(cVar, "Connection progress callbacks cannot be null.");
        this.h = cVar;
        a(2, (int) null);
    }

    public final void a(e eVar) {
        eVar.a();
    }

    public final void a(aal aalVar, Set<Scope> set) {
        Bundle p = p();
        aah aahVar = new aah(this.i, this.j);
        aahVar.d = this.f.getPackageName();
        aahVar.g = p;
        if (set != null) {
            aahVar.f = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (m()) {
            Account o = o();
            if (o == null) {
                o = new Account("<<default account>>", "com.google");
            }
            aahVar.h = o;
            if (aalVar != null) {
                aahVar.e = aalVar.asBinder();
            }
        }
        aahVar.i = a;
        aahVar.j = z();
        if (y()) {
            aahVar.m = true;
        }
        try {
            try {
                synchronized (this.t) {
                    aao aaoVar = this.u;
                    if (aaoVar != null) {
                        aaoVar.a(new acq(this, this.k.get()), aahVar);
                    }
                }
            } catch (RemoteException | RuntimeException unused) {
                a(8, (IBinder) null, (Bundle) null, this.k.get());
            }
        } catch (DeadObjectException unused2) {
            Handler handler = this.g;
            handler.sendMessage(handler.obtainMessage(6, this.k.get(), 3));
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    public final void a(String str, PrintWriter printWriter) {
        int i;
        T t;
        aao aaoVar;
        synchronized (this.s) {
            i = this.y;
            t = this.v;
        }
        synchronized (this.t) {
            aaoVar = this.u;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i == 5) {
            printWriter.print("DISCONNECTING");
        } else {
            printWriter.print("UNKNOWN");
        }
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) c()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (aaoVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(aaoVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.l > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.l;
            String format = simpleDateFormat.format(new Date(j));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.d > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.c;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i2 == 3) {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            } else {
                printWriter.append((CharSequence) String.valueOf(i2));
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.d;
            String format2 = simpleDateFormat.format(new Date(j2));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j2);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.n > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) vd.a(this.m));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.n;
            String format3 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb3.append(j3);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    public Intent b() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String c();

    protected abstract String d();

    public boolean e() {
        return false;
    }

    public final String f() {
        ade adeVar;
        if (!j() || (adeVar = this.e) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return adeVar.b;
    }

    public final String g() {
        return this.o;
    }

    public void i() {
        this.k.incrementAndGet();
        synchronized (this.w) {
            int size = this.w.size();
            for (int i = 0; i < size; i++) {
                this.w.get(i).d();
            }
            this.w.clear();
        }
        synchronized (this.t) {
            this.u = null;
        }
        a(1, (int) null);
    }

    public final boolean j() {
        boolean z;
        synchronized (this.s) {
            z = this.y == 4;
        }
        return z;
    }

    public final boolean k() {
        boolean z;
        synchronized (this.s) {
            int i = this.y;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public boolean l() {
        return true;
    }

    public boolean m() {
        return false;
    }

    public final uw[] n() {
        acu acuVar = this.E;
        if (acuVar == null) {
            return null;
        }
        return acuVar.b;
    }

    public Account o() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Bundle p() {
        return new Bundle();
    }

    public final T q() throws DeadObjectException {
        T t;
        synchronized (this.s) {
            if (this.y == 5) {
                throw new DeadObjectException();
            }
            v();
            t = this.v;
            aat.a(t, "Client is connected but service is null");
        }
        return t;
    }

    public final aag r() {
        acu acuVar = this.E;
        if (acuVar == null) {
            return null;
        }
        return acuVar.d;
    }

    protected String s() {
        return "com.google.android.gms";
    }

    protected Set<Scope> t() {
        return Collections.emptySet();
    }

    public final void u() {
        int a2 = this.r.a(this.f, a());
        if (a2 != 0) {
            a(1, (int) null);
            d dVar = new d();
            aat.a(dVar, "Connection progress callbacks cannot be null.");
            this.h = dVar;
            Handler handler = this.g;
            handler.sendMessage(handler.obtainMessage(3, this.k.get(), a2, null));
            return;
        }
        a(new d());
    }

    public final void v() {
        if (j()) {
            return;
        }
        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }

    protected boolean w() {
        return a() >= 211700000;
    }

    public final boolean x() {
        return this.E != null;
    }

    public boolean y() {
        return false;
    }

    public uw[] z() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public aad(android.content.Context r10, android.os.Looper r11, defpackage.aad.a r12, defpackage.aad.b r13) {
        /*
            r9 = this;
            aaj r3 = defpackage.aaj.a(r10)
            uy r4 = defpackage.uy.b()
            defpackage.aat.a(r12)
            defpackage.aat.a(r13)
            r5 = 93
            r8 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r6 = r12
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aad.<init>(android.content.Context, android.os.Looper, aad$a, aad$b):void");
    }

    public final void a(String str) {
        this.o = str;
        i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public aad(Context context, Looper looper, aaj aajVar, uy uyVar, int i, a aVar, b bVar, String str) {
        this.o = null;
        this.s = new Object();
        this.t = new Object();
        this.w = new ArrayList<>();
        this.y = 1;
        this.C = null;
        this.D = false;
        this.E = null;
        this.k = new AtomicInteger(0);
        aat.a(context, "Context must not be null");
        this.f = context;
        aat.a(looper, "Looper must not be null");
        this.p = looper;
        aat.a(aajVar, "Supervisor must not be null");
        this.q = aajVar;
        aat.a(uyVar, "API availability must not be null");
        this.r = uyVar;
        this.g = new aco(this, looper);
        this.i = i;
        this.z = aVar;
        this.A = bVar;
        this.B = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(ConnectionResult connectionResult) {
        this.m = connectionResult.c;
        this.n = System.currentTimeMillis();
    }
}
