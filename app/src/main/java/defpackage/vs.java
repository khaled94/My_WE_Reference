package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.collection.ArraySet;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import defpackage.vc;
import defpackage.vq;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: vs  reason: default package */
/* loaded from: classes2.dex */
public final class vs implements Handler.Callback {
    private static vs h;
    @NotOnlyInitialized
    public final Handler f;
    private aax m;
    private aaz n;
    private final Context o;
    private final ux p;
    private final abw q;
    private volatile boolean u;
    public static final Status a = new Status(4, "Sign-out occurred while this API call was in progress.");
    private static final Status g = new Status(4, "The user must be signed in to make this API call.");
    static final Object b = new Object();
    private long i = CoroutineLiveDataKt.DEFAULT_TIMEOUT;
    private long j = 120000;
    private long k = 10000;
    private boolean l = false;
    public final AtomicInteger c = new AtomicInteger(1);
    private final AtomicInteger r = new AtomicInteger(0);
    private final Map<vo<?>, xr<?>> s = new ConcurrentHashMap(5, 0.75f, 1);
    wk d = null;
    final Set<vo<?>> e = new ArraySet();
    private final Set<vo<?>> t = new ArraySet();

    private vs(Context context, Looper looper, ux uxVar) {
        this.u = true;
        this.o = context;
        this.f = new ait(looper, this);
        this.p = uxVar;
        this.q = new abw(uxVar);
        if (aeb.a(context)) {
            this.u = false;
        }
        Handler handler = this.f;
        handler.sendMessage(handler.obtainMessage(6));
    }

    public static vs a(Context context) {
        vs vsVar;
        synchronized (b) {
            if (h == null) {
                h = new vs(context.getApplicationContext(), aaj.b().getLooper(), ux.a());
            }
            vsVar = h;
        }
        return vsVar;
    }

    public static void a() {
        synchronized (b) {
            vs vsVar = h;
            if (vsVar != null) {
                vsVar.r.incrementAndGet();
                Handler handler = vsVar.f;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status b(vo<?> voVar, ConnectionResult connectionResult) {
        String str = voVar.a.c;
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(valueOf).length());
        sb.append("API: ");
        sb.append(str);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(connectionResult, sb.toString());
    }

    private final aaz f() {
        if (this.n == null) {
            this.n = aay.a(this.o, aba.a);
        }
        return this.n;
    }

    private final void g() {
        aax aaxVar = this.m;
        if (aaxVar != null) {
            if (aaxVar.a > 0 || e()) {
                f().a(aaxVar);
            }
            this.m = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final xr a(vo<?> voVar) {
        return this.s.get(voVar);
    }

    public final void a(ConnectionResult connectionResult, int i) {
        if (!b(connectionResult, i)) {
            Handler handler = this.f;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }

    public final <O extends vc.d> void a(ve<O> veVar, int i, vq.a<? extends vi, vc.b> aVar) {
        yv yvVar = new yv(i, aVar);
        Handler handler = this.f;
        handler.sendMessage(handler.obtainMessage(4, new yg(yvVar, this.r.get(), veVar)));
    }

    public final void a(wk wkVar) {
        synchronized (b) {
            if (this.d != wkVar) {
                this.d = wkVar;
                this.e.clear();
            }
            this.e.addAll(wkVar.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(ConnectionResult connectionResult, int i) {
        return this.p.a(this.o, connectionResult, i);
    }

    public final void d() {
        Handler handler = this.f;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        if (this.l) {
            return false;
        }
        aav aavVar = aau.a().a;
        if (aavVar != null && !aavVar.b) {
            return false;
        }
        int a2 = this.q.a(203400000);
        return a2 == -1 || a2 == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01f2  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r9) {
        /*
            Method dump skipped, instructions count: 936
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vs.handleMessage(android.os.Message):boolean");
    }

    private final xr<?> a(ve<?> veVar) {
        vo<?> voVar = veVar.d;
        xr<?> xrVar = this.s.get(voVar);
        if (xrVar == null) {
            xrVar = new xr<>(this, veVar);
            this.s.put(voVar, xrVar);
        }
        if (xrVar.f()) {
            this.t.add(voVar);
        }
        xrVar.b();
        return xrVar;
    }

    public final <O extends vc.d, ResultT> void a(ve<O> veVar, int i, wf<vc.b, ResultT> wfVar, bwm<ResultT> bwmVar, wd wdVar) {
        a(bwmVar, wfVar.c, veVar);
        yw ywVar = new yw(i, wfVar, bwmVar, wdVar);
        Handler handler = this.f;
        handler.sendMessage(handler.obtainMessage(4, new yg(ywVar, this.r.get(), veVar)));
    }

    private final <T> void a(bwm<T> bwmVar, int i, ve veVar) {
        yc a2;
        if (i == 0 || (a2 = yc.a(this, i, (vo<?>) veVar.d)) == null) {
            return;
        }
        bxj<T> bxjVar = bwmVar.a;
        final Handler handler = this.f;
        handler.getClass();
        bxjVar.a(new Executor() { // from class: xl
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, a2);
    }
}
