package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import defpackage.vc;
import defpackage.vf;
import defpackage.vq;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* renamed from: xf  reason: default package */
/* loaded from: classes2.dex */
public final class xf extends vf implements xy {
    xx b;
    final Map<vc.c<?>, vc.f> c;
    final aaf e;
    final Map<vc<?>, Boolean> f;
    final vc.a<? extends bwe, bvn> g;
    final yu i;
    private final Lock j;
    private final abv k;
    private final int m;
    private final Context n;
    private final Looper o;
    private volatile boolean p;
    private final xd s;
    private final ux t;
    private final ArrayList<zi> v;
    private Integer w;
    private final abu x;
    private ya l = null;
    final Queue<vq.a<?, ?>> a = new LinkedList();
    private long q = 120000;
    private long r = CoroutineLiveDataKt.DEFAULT_TIMEOUT;
    Set<Scope> d = new HashSet();
    private final vx u = new vx();
    Set<ys> h = null;

    public xf(Context context, Lock lock, Looper looper, aaf aafVar, ux uxVar, vc.a<? extends bwe, bvn> aVar, Map<vc<?>, Boolean> map, List<vf.b> list, List<vf.c> list2, Map<vc.c<?>, vc.f> map2, int i, int i2, ArrayList<zi> arrayList) {
        this.w = null;
        xc xcVar = new xc(this);
        this.x = xcVar;
        this.n = context;
        this.j = lock;
        this.k = new abv(looper, xcVar);
        this.o = looper;
        this.s = new xd(this, looper);
        this.t = uxVar;
        this.m = i;
        if (i >= 0) {
            this.w = Integer.valueOf(i2);
        }
        this.f = map;
        this.c = map2;
        this.v = arrayList;
        this.i = new yu();
        for (vf.b bVar : list) {
            this.k.a(bVar);
        }
        for (vf.c cVar : list2) {
            this.k.a(cVar);
        }
        this.e = aafVar;
        this.g = aVar;
    }

    public static int a(Iterable<vc.f> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (vc.f fVar : iterable) {
            z2 |= fVar.m();
            z3 |= fVar.e();
        }
        if (z2) {
            return (!z3 || !z) ? 1 : 2;
        }
        return 3;
    }

    private static String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(xf xfVar) {
        xfVar.j.lock();
        try {
            if (xfVar.p) {
                xfVar.j();
            }
        } finally {
            xfVar.j.unlock();
        }
    }

    private final void b(int i) {
        Integer num = this.w;
        if (num == null) {
            this.w = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String a = a(i);
            String a2 = a(this.w.intValue());
            StringBuilder sb = new StringBuilder(a.length() + 51 + a2.length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(a);
            sb.append(". Mode was already set to ");
            sb.append(a2);
            throw new IllegalStateException(sb.toString());
        }
        if (this.l != null) {
            return;
        }
        boolean z = false;
        boolean z2 = false;
        for (vc.f fVar : this.c.values()) {
            z |= fVar.m();
            z2 |= fVar.e();
        }
        int intValue = this.w.intValue();
        if (intValue != 1) {
            if (intValue == 2 && z) {
                this.l = wg.a(this.n, this, this.j, this.o, this.t, this.c, this.e, this.f, this.g, this.v);
                return;
            }
        } else if (!z) {
            throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
        } else {
            if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        }
        this.l = new xj(this.n, this, this.j, this.o, this.t, this.c, this.e, this.f, this.g, this.v, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(xf xfVar) {
        xfVar.j.lock();
        try {
            if (xfVar.i()) {
                xfVar.j();
            }
        } finally {
            xfVar.j.unlock();
        }
    }

    private final void j() {
        this.k.e = true;
        ((ya) aat.a(this.l)).a();
    }

    @Override // defpackage.vf
    public final Looper a() {
        return this.o;
    }

    @Override // defpackage.xy
    public final void a(Bundle bundle) {
        while (!this.a.isEmpty()) {
            b((xf) this.a.remove());
        }
        abv abvVar = this.k;
        aat.a(abvVar.h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (abvVar.i) {
            aat.b(!abvVar.g);
            abvVar.h.removeMessages(1);
            abvVar.g = true;
            aat.b(abvVar.c.isEmpty());
            ArrayList arrayList = new ArrayList(abvVar.b);
            int i = abvVar.f.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                vf.b bVar = (vf.b) it.next();
                if (!abvVar.e || !abvVar.a.j() || abvVar.f.get() != i) {
                    break;
                } else if (!abvVar.c.contains(bVar)) {
                    bVar.a(bundle);
                }
            }
            abvVar.c.clear();
            abvVar.g = false;
        }
    }

    @Override // defpackage.vf
    public final void a(FragmentActivity fragmentActivity) {
        vu vuVar = new vu(fragmentActivity);
        if (this.m >= 0) {
            za.b(vuVar).a(this.m);
            return;
        }
        throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
    }

    @Override // defpackage.xy
    public final void a(ConnectionResult connectionResult) {
        if (!ux.c(this.n, connectionResult.c)) {
            i();
        }
        if (!this.p) {
            this.k.a(connectionResult);
            this.k.a();
        }
    }

    @Override // defpackage.vf
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.n);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.p);
        printWriter.append(" mWorkQueue.size()=").print(this.a.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.i.b.size());
        ya yaVar = this.l;
        if (yaVar != null) {
            yaVar.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // defpackage.vf
    public final void a(vf.c cVar) {
        this.k.a(cVar);
    }

    @Override // defpackage.vf
    public final void a(ys ysVar) {
        this.j.lock();
        try {
            if (this.h == null) {
                this.h = new HashSet();
            }
            this.h.add(ysVar);
        } finally {
            this.j.unlock();
        }
    }

    @Override // defpackage.vf
    public final boolean a(wc wcVar) {
        ya yaVar = this.l;
        return yaVar != null && yaVar.a(wcVar);
    }

    @Override // defpackage.vf
    public final void b(vf.c cVar) {
        abv abvVar = this.k;
        aat.a(cVar);
        synchronized (abvVar.i) {
            if (!abvVar.d.remove(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
                sb.append("unregisterConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r3 == false) goto L18;
     */
    @Override // defpackage.vf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.ys r3) {
        /*
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.j
            r0.lock()
            java.util.Set<ys> r0 = r2.h     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = "GoogleApiClientImpl"
            if (r0 != 0) goto L16
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Throwable -> L57
            r3.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = "Attempted to remove pending transform when no transforms are registered."
            android.util.Log.wtf(r1, r0, r3)     // Catch: java.lang.Throwable -> L57
            goto L4a
        L16:
            boolean r3 = r0.remove(r3)     // Catch: java.lang.Throwable -> L57
            if (r3 != 0) goto L27
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Throwable -> L57
            r3.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = "Failed to remove pending transform - this may lead to memory leaks!"
            android.util.Log.wtf(r1, r0, r3)     // Catch: java.lang.Throwable -> L57
            goto L4a
        L27:
            java.util.concurrent.locks.Lock r3 = r2.j     // Catch: java.lang.Throwable -> L57
            r3.lock()     // Catch: java.lang.Throwable -> L57
            java.util.Set<ys> r3 = r2.h     // Catch: java.lang.Throwable -> L50
            if (r3 != 0) goto L36
            java.util.concurrent.locks.Lock r3 = r2.j     // Catch: java.lang.Throwable -> L57
            r3.unlock()     // Catch: java.lang.Throwable -> L57
            goto L43
        L36:
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L50
            r3 = r3 ^ 1
            java.util.concurrent.locks.Lock r0 = r2.j     // Catch: java.lang.Throwable -> L57
            r0.unlock()     // Catch: java.lang.Throwable -> L57
            if (r3 != 0) goto L4a
        L43:
            ya r3 = r2.l     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L4a
            r3.c()     // Catch: java.lang.Throwable -> L57
        L4a:
            java.util.concurrent.locks.Lock r3 = r2.j
            r3.unlock()
            return
        L50:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.j     // Catch: java.lang.Throwable -> L57
            r0.unlock()     // Catch: java.lang.Throwable -> L57
            throw r3     // Catch: java.lang.Throwable -> L57
        L57:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.j
            r0.unlock()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xf.b(ys):void");
    }

    @Override // defpackage.vf
    public final void c() {
        this.j.lock();
        try {
            int i = 2;
            boolean z = false;
            if (this.m >= 0) {
                aat.b(this.w != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.w;
                if (num != null) {
                    if (num.intValue() == 2) {
                        throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    }
                } else {
                    this.w = Integer.valueOf(a((Iterable<vc.f>) this.c.values(), false));
                }
            }
            int intValue = ((Integer) aat.a(this.w)).intValue();
            this.j.lock();
            if (intValue == 3 || intValue == 1) {
                i = intValue;
            } else if (intValue != 2) {
                i = intValue;
                StringBuilder sb = new StringBuilder(33);
                sb.append("Illegal sign-in mode: ");
                sb.append(i);
                aat.a(z, sb.toString());
                b(i);
                j();
                this.j.unlock();
            }
            z = true;
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append("Illegal sign-in mode: ");
            sb2.append(i);
            aat.a(z, sb2.toString());
            b(i);
            j();
            this.j.unlock();
        } finally {
            this.j.unlock();
        }
    }

    @Override // defpackage.vf
    public final void d() {
        Lock lock;
        this.j.lock();
        try {
            this.i.a();
            ya yaVar = this.l;
            if (yaVar != null) {
                yaVar.b();
            }
            vx vxVar = this.u;
            for (vw<?> vwVar : vxVar.a) {
                vwVar.a();
            }
            vxVar.a.clear();
            for (vq.a<?, ?> aVar : this.a) {
                aVar.a((yt) null);
                aVar.a();
            }
            this.a.clear();
            if (this.l == null) {
                lock = this.j;
            } else {
                i();
                this.k.a();
                lock = this.j;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.j.unlock();
            throw th;
        }
    }

    @Override // defpackage.vf
    public final void e() {
        ya yaVar = this.l;
        if (yaVar != null) {
            yaVar.d();
        }
    }

    @Override // defpackage.vf
    public final boolean f() {
        ya yaVar = this.l;
        return yaVar != null && yaVar.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String h() {
        StringWriter stringWriter = new StringWriter();
        a("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i() {
        if (!this.p) {
            return false;
        }
        this.p = false;
        this.s.removeMessages(2);
        this.s.removeMessages(1);
        xx xxVar = this.b;
        if (xxVar != null) {
            xxVar.a();
            this.b = null;
        }
        return true;
    }

    @Override // defpackage.xy
    public final void a(int i, boolean z) {
        if (i == 1) {
            if (!z && !this.p) {
                this.p = true;
                if (this.b == null) {
                    try {
                        this.b = ux.a(this.n.getApplicationContext(), new xe(this));
                    } catch (SecurityException unused) {
                    }
                }
                xd xdVar = this.s;
                xdVar.sendMessageDelayed(xdVar.obtainMessage(1), this.q);
                xd xdVar2 = this.s;
                xdVar2.sendMessageDelayed(xdVar2.obtainMessage(2), this.r);
            }
            i = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.i.b.toArray(new BasePendingResult[0])) {
            basePendingResult.c(yu.a);
        }
        this.k.a(i);
        this.k.a();
        if (i == 2) {
            j();
        }
    }

    @Override // defpackage.vf
    public final <A extends vc.b, R extends vi, T extends vq.a<R, A>> T a(T t) {
        Lock lock;
        vc<?> vcVar = t.b;
        boolean containsKey = this.c.containsKey(t.a);
        String str = vcVar != null ? vcVar.c : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(str);
        sb.append(" required for this call.");
        aat.a(containsKey, sb.toString());
        this.j.lock();
        try {
            ya yaVar = this.l;
            if (yaVar != null) {
                t = (T) yaVar.a((ya) t);
                lock = this.j;
            } else {
                this.a.add(t);
                lock = this.j;
            }
            lock.unlock();
            return t;
        } catch (Throwable th) {
            this.j.unlock();
            throw th;
        }
    }

    @Override // defpackage.vf
    public final <A extends vc.b, T extends vq.a<? extends vi, A>> T b(T t) {
        Lock lock;
        vc<?> vcVar = t.b;
        boolean containsKey = this.c.containsKey(t.a);
        String str = vcVar != null ? vcVar.c : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(str);
        sb.append(" required for this call.");
        aat.a(containsKey, sb.toString());
        this.j.lock();
        try {
            ya yaVar = this.l;
            if (yaVar != null) {
                if (this.p) {
                    this.a.add(t);
                    while (!this.a.isEmpty()) {
                        vq.a<?, ?> remove = this.a.remove();
                        this.i.a(remove);
                        remove.b(Status.c);
                    }
                    lock = this.j;
                } else {
                    t = (T) yaVar.b(t);
                    lock = this.j;
                }
                lock.unlock();
                return t;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } catch (Throwable th) {
            this.j.unlock();
            throw th;
        }
    }
}
