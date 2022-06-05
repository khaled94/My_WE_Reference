package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import defpackage.vc;
import defpackage.vq;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wg  reason: default package */
/* loaded from: classes2.dex */
public final class wg implements ya {
    final xj a;
    final xj b;
    Bundle c;
    final Lock g;
    private final Context h;
    private final xf i;
    private final Looper j;
    private final Map<vc.c<?>, xj> k;
    private final vc.f m;
    private final Set<wc> l = Collections.newSetFromMap(new WeakHashMap());
    ConnectionResult d = null;
    ConnectionResult e = null;
    boolean f = false;
    private int n = 0;

    private wg(Context context, xf xfVar, Lock lock, Looper looper, uy uyVar, Map<vc.c<?>, vc.f> map, Map<vc.c<?>, vc.f> map2, aaf aafVar, vc.a<? extends bwe, bvn> aVar, vc.f fVar, ArrayList<zi> arrayList, ArrayList<zi> arrayList2, Map<vc<?>, Boolean> map3, Map<vc<?>, Boolean> map4) {
        this.h = context;
        this.i = xfVar;
        this.g = lock;
        this.j = looper;
        this.m = fVar;
        this.a = new xj(context, xfVar, lock, looper, uyVar, map2, null, map4, null, arrayList2, new zl(this));
        this.b = new xj(context, this.i, lock, looper, uyVar, map, aafVar, map3, aVar, arrayList, new zm(this));
        ArrayMap arrayMap = new ArrayMap();
        for (vc.c<?> cVar : map2.keySet()) {
            arrayMap.put(cVar, this.a);
        }
        for (vc.c<?> cVar2 : map.keySet()) {
            arrayMap.put(cVar2, this.b);
        }
        this.k = Collections.unmodifiableMap(arrayMap);
    }

    public static wg a(Context context, xf xfVar, Lock lock, Looper looper, uy uyVar, Map<vc.c<?>, vc.f> map, aaf aafVar, Map<vc<?>, Boolean> map2, vc.a<? extends bwe, bvn> aVar, ArrayList<zi> arrayList) {
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        vc.f fVar = null;
        for (Map.Entry<vc.c<?>, vc.f> entry : map.entrySet()) {
            vc.f value = entry.getValue();
            if (true == value.e()) {
                fVar = value;
            }
            if (value.m()) {
                arrayMap.put(entry.getKey(), value);
            } else {
                arrayMap2.put(entry.getKey(), value);
            }
        }
        aat.b(!arrayMap.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        ArrayMap arrayMap3 = new ArrayMap();
        ArrayMap arrayMap4 = new ArrayMap();
        for (vc<?> vcVar : map2.keySet()) {
            vc.g<?> gVar = vcVar.b;
            if (arrayMap.containsKey(gVar)) {
                arrayMap3.put(vcVar, map2.get(vcVar));
            } else if (arrayMap2.containsKey(gVar)) {
                arrayMap4.put(vcVar, map2.get(vcVar));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zi ziVar = arrayList.get(i);
            if (arrayMap3.containsKey(ziVar.a)) {
                arrayList2.add(ziVar);
            } else if (arrayMap4.containsKey(ziVar.a)) {
                arrayList3.add(ziVar);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new wg(context, xfVar, lock, looper, uyVar, arrayMap, arrayMap2, aafVar, aVar, fVar, arrayList2, arrayList3, arrayMap3, arrayMap4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(wg wgVar) {
        ConnectionResult connectionResult;
        if (b(wgVar.d)) {
            if (b(wgVar.e) || wgVar.h()) {
                int i = wgVar.n;
                if (i != 1) {
                    if (i == 2) {
                        ((xf) aat.a(wgVar.i)).a(wgVar.c);
                    } else {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        wgVar.n = 0;
                        return;
                    }
                }
                wgVar.g();
                wgVar.n = 0;
                return;
            }
            ConnectionResult connectionResult2 = wgVar.e;
            if (connectionResult2 == null) {
                return;
            }
            if (wgVar.n == 1) {
                wgVar.g();
                return;
            }
            wgVar.a(connectionResult2);
            wgVar.a.b();
        } else if (wgVar.d == null || !b(wgVar.e)) {
            ConnectionResult connectionResult3 = wgVar.d;
            if (connectionResult3 == null || (connectionResult = wgVar.e) == null) {
                return;
            }
            if (wgVar.b.l < wgVar.a.l) {
                connectionResult3 = connectionResult;
            }
            wgVar.a(connectionResult3);
        } else {
            wgVar.b.b();
            wgVar.a((ConnectionResult) aat.a(wgVar.d));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void a(wg wgVar, int i, boolean z) {
        wgVar.i.a(i, z);
        wgVar.e = null;
        wgVar.d = null;
    }

    private static boolean b(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.b();
    }

    private final PendingIntent f() {
        if (this.m == null) {
            return null;
        }
        return aip.a(this.h, System.identityHashCode(this.i), this.m.b(), aip.a | 134217728);
    }

    private final void g() {
        for (wc wcVar : this.l) {
            wcVar.a();
        }
        this.l.clear();
    }

    private final boolean h() {
        ConnectionResult connectionResult = this.e;
        return connectionResult != null && connectionResult.c == 4;
    }

    private boolean i() {
        this.g.lock();
        try {
            return this.n == 2;
        } finally {
            this.g.unlock();
        }
    }

    @Override // defpackage.ya
    public final <A extends vc.b, R extends vi, T extends vq.a<R, A>> T a(T t) {
        if (c(t)) {
            if (h()) {
                t.b(new Status(4, (String) null, f()));
                return t;
            }
            this.b.a((xj) t);
            return t;
        }
        this.a.a((xj) t);
        return t;
    }

    @Override // defpackage.ya
    public final void a() {
        this.n = 2;
        this.f = false;
        this.e = null;
        this.d = null;
        this.a.a();
        this.b.a();
    }

    @Override // defpackage.ya
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.b.a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.a.a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // defpackage.ya
    public final boolean a(wc wcVar) {
        this.g.lock();
        try {
            if ((!i() && !e()) || this.b.e()) {
                this.g.unlock();
                return false;
            }
            this.l.add(wcVar);
            if (this.n == 0) {
                this.n = 1;
            }
            this.e = null;
            this.b.a();
            return true;
        } finally {
            this.g.unlock();
        }
    }

    @Override // defpackage.ya
    public final <A extends vc.b, T extends vq.a<? extends vi, A>> T b(T t) {
        if (c(t)) {
            if (h()) {
                t.b(new Status(4, (String) null, f()));
                return t;
            }
            return (T) this.b.b(t);
        }
        return (T) this.a.b(t);
    }

    @Override // defpackage.ya
    public final void b() {
        this.e = null;
        this.d = null;
        this.n = 0;
        this.a.b();
        this.b.b();
        g();
    }

    @Override // defpackage.ya
    public final void c() {
        this.a.c();
        this.b.c();
    }

    @Override // defpackage.ya
    public final void d() {
        this.g.lock();
        try {
            boolean i = i();
            this.b.b();
            this.e = new ConnectionResult(4);
            if (i) {
                new ait(this.j).post(new zk(this));
            } else {
                g();
            }
        } finally {
            this.g.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r3.n == 1) goto L11;
     */
    @Override // defpackage.ya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e() {
        /*
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.g
            r0.lock()
            xj r0 = r3.a     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0.e()     // Catch: java.lang.Throwable -> L28
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L22
            xj r0 = r3.b     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0.e()     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L21
            boolean r0 = r3.h()     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L21
            int r0 = r3.n     // Catch: java.lang.Throwable -> L28
            if (r0 != r2) goto L22
        L21:
            r1 = 1
        L22:
            java.util.concurrent.locks.Lock r0 = r3.g
            r0.unlock()
            return r1
        L28:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r3.g
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg.e():boolean");
    }

    private final void a(ConnectionResult connectionResult) {
        int i = this.n;
        if (i != 1) {
            if (i == 2) {
                this.i.a(connectionResult);
            } else {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.n = 0;
            }
        }
        g();
        this.n = 0;
    }

    private final boolean c(vq.a<? extends vi, ? extends vc.b> aVar) {
        xj xjVar = this.k.get(aVar.a);
        aat.a(xjVar, "GoogleApiClient is not configured to use the API required for this call.");
        return xjVar.equals(this.b);
    }
}
