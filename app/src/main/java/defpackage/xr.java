package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import defpackage.vc;
import defpackage.vc.d;
import defpackage.vf;
import defpackage.vw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: xr */
/* loaded from: classes2.dex */
public final class xr<O extends vc.d> implements vf.b, vf.c, zj {
    @NotOnlyInitialized
    final vc.f a;
    final vo<O> b;
    final int e;
    boolean f;
    final /* synthetic */ vs i;
    private final yn l;
    private final Queue<yy> j = new LinkedList();
    final Set<zb> c = new HashSet();
    final Map<vw.a<?>, yh> d = new HashMap();
    private final List<xs> m = new ArrayList();
    ConnectionResult g = null;
    int h = 0;
    private final wj k = new wj();

    public xr(vs vsVar, ve<O> veVar) {
        Handler handler;
        Context context;
        Handler handler2;
        this.i = vsVar;
        handler = vsVar.f;
        this.a = veVar.a(handler.getLooper(), this);
        this.b = veVar.d;
        this.e = veVar.f;
        if (!this.a.m()) {
            this.l = null;
            return;
        }
        context = vsVar.o;
        handler2 = vsVar.f;
        this.l = new yn(context, handler2, veVar.d().a());
    }

    private final uw a(uw[] uwVarArr) {
        if (uwVarArr != null && uwVarArr.length != 0) {
            uw[] n = this.a.n();
            if (n == null) {
                n = new uw[0];
            }
            ArrayMap arrayMap = new ArrayMap(n.length);
            for (uw uwVar : n) {
                arrayMap.put(uwVar.a, Long.valueOf(uwVar.a()));
            }
            for (uw uwVar2 : uwVarArr) {
                Long l = (Long) arrayMap.get(uwVar2.a);
                if (l == null || l.longValue() < uwVar2.a()) {
                    return uwVar2;
                }
            }
        }
        return null;
    }

    private final void a(Status status, Exception exc, boolean z) {
        Handler handler;
        handler = this.i.f;
        aat.a(handler);
        boolean z2 = false;
        boolean z3 = status == null;
        if (exc == null) {
            z2 = true;
        }
        if (z3 == z2) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator<yy> it = this.j.iterator();
        while (it.hasNext()) {
            yy next = it.next();
            if (!z || next.c == 2) {
                if (status != null) {
                    next.a(status);
                } else {
                    next.a(exc);
                }
                it.remove();
            }
        }
    }

    public static /* synthetic */ void a(xr xrVar, xs xsVar) {
        if (xrVar.m.contains(xsVar) && !xrVar.f) {
            if (!xrVar.a.j()) {
                xrVar.b();
            } else {
                xrVar.g();
            }
        }
    }

    private final void b(ConnectionResult connectionResult) {
        for (zb zbVar : this.c) {
            zbVar.a(this.b, connectionResult, aar.a(connectionResult, ConnectionResult.a) ? this.a.f() : null);
        }
        this.c.clear();
    }

    public static /* synthetic */ void b(xr xrVar, xs xsVar) {
        Handler handler;
        Handler handler2;
        uw[] b;
        if (xrVar.m.remove(xsVar)) {
            handler = xrVar.i.f;
            handler.removeMessages(15, xsVar);
            handler2 = xrVar.i.f;
            handler2.removeMessages(16, xsVar);
            uw uwVar = xsVar.b;
            ArrayList arrayList = new ArrayList(xrVar.j.size());
            for (yy yyVar : xrVar.j) {
                if ((yyVar instanceof xz) && (b = ((xz) yyVar).b(xrVar)) != null && adv.a(b, uwVar)) {
                    arrayList.add(yyVar);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                yy yyVar2 = (yy) arrayList.get(i);
                xrVar.j.remove(yyVar2);
                yyVar2.a(new UnsupportedApiCallException(uwVar));
            }
        }
    }

    private final void b(yy yyVar) {
        yyVar.a(this.k, f());
        try {
            yyVar.d(this);
        } catch (DeadObjectException unused) {
            a(1);
            this.a.a("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final boolean c(ConnectionResult connectionResult) {
        Object obj;
        wk wkVar;
        Set set;
        wk wkVar2;
        obj = vs.b;
        synchronized (obj) {
            vs vsVar = this.i;
            wkVar = vsVar.d;
            if (wkVar != null) {
                set = vsVar.e;
                if (set.contains(this.b)) {
                    wkVar2 = this.i.d;
                    wkVar2.b(connectionResult, this.e);
                    return true;
                }
            }
            return false;
        }
    }

    private final boolean c(yy yyVar) {
        boolean z;
        Handler handler;
        Handler handler2;
        long j;
        Handler handler3;
        Handler handler4;
        long j2;
        Handler handler5;
        Handler handler6;
        Handler handler7;
        long j3;
        if (!(yyVar instanceof xz)) {
            b(yyVar);
            return true;
        }
        xz xzVar = (xz) yyVar;
        uw a = a(xzVar.b(this));
        if (a == null) {
            b(yyVar);
            return true;
        }
        String name = this.a.getClass().getName();
        String str = a.a;
        long a2 = a.a();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 77 + String.valueOf(str).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(str);
        sb.append(", ");
        sb.append(a2);
        sb.append(").");
        z = this.i.u;
        if (!z || !xzVar.a((xr<?>) this)) {
            xzVar.a(new UnsupportedApiCallException(a));
            return true;
        }
        xs xsVar = new xs(this.b, a);
        int indexOf = this.m.indexOf(xsVar);
        if (indexOf >= 0) {
            xs xsVar2 = this.m.get(indexOf);
            handler5 = this.i.f;
            handler5.removeMessages(15, xsVar2);
            vs vsVar = this.i;
            handler6 = vsVar.f;
            handler7 = vsVar.f;
            Message obtain = Message.obtain(handler7, 15, xsVar2);
            j3 = this.i.i;
            handler6.sendMessageDelayed(obtain, j3);
            return false;
        }
        this.m.add(xsVar);
        vs vsVar2 = this.i;
        handler = vsVar2.f;
        handler2 = vsVar2.f;
        Message obtain2 = Message.obtain(handler2, 15, xsVar);
        j = this.i.i;
        handler.sendMessageDelayed(obtain2, j);
        vs vsVar3 = this.i;
        handler3 = vsVar3.f;
        handler4 = vsVar3.f;
        Message obtain3 = Message.obtain(handler4, 16, xsVar);
        j2 = this.i.j;
        handler3.sendMessageDelayed(obtain3, j2);
        ConnectionResult connectionResult = new ConnectionResult(2, null);
        if (c(connectionResult)) {
            return false;
        }
        this.i.b(connectionResult, this.e);
        return false;
    }

    private final void g() {
        ArrayList arrayList = new ArrayList(this.j);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            yy yyVar = (yy) arrayList.get(i);
            if (!this.a.j()) {
                return;
            }
            if (c(yyVar)) {
                this.j.remove(yyVar);
            }
        }
    }

    private final void h() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        long j;
        handler = this.i.f;
        handler.removeMessages(12, this.b);
        vs vsVar = this.i;
        handler2 = vsVar.f;
        handler3 = vsVar.f;
        Message obtainMessage = handler3.obtainMessage(12, this.b);
        j = this.i.k;
        handler2.sendMessageDelayed(obtainMessage, j);
    }

    private final void i() {
        Handler handler;
        Handler handler2;
        if (this.f) {
            handler = this.i.f;
            handler.removeMessages(11, this.b);
            handler2 = this.i.f;
            handler2.removeMessages(9, this.b);
            this.f = false;
        }
    }

    public final void a() {
        Handler handler;
        handler = this.i.f;
        aat.a(handler);
        this.g = null;
    }

    @Override // defpackage.vr
    public final void a(int i) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.i.f;
        if (myLooper == handler.getLooper()) {
            b(i);
            return;
        }
        handler2 = this.i.f;
        handler2.post(new xo(this, i));
    }

    @Override // defpackage.vr
    public final void a(Bundle bundle) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.i.f;
        if (myLooper == handler.getLooper()) {
            c();
            return;
        }
        handler2 = this.i.f;
        handler2.post(new xn(this));
    }

    @Override // defpackage.vz
    public final void a(ConnectionResult connectionResult) {
        a(connectionResult, (Exception) null);
    }

    public final void a(ConnectionResult connectionResult, Exception exc) {
        Handler handler;
        abw abwVar;
        boolean z;
        Status b;
        Status b2;
        Status b3;
        Handler handler2;
        Handler handler3;
        long j;
        Handler handler4;
        Status status;
        Handler handler5;
        Handler handler6;
        handler = this.i.f;
        aat.a(handler);
        yn ynVar = this.l;
        if (ynVar != null) {
            ynVar.a();
        }
        a();
        abwVar = this.i.q;
        abwVar.a.clear();
        b(connectionResult);
        if ((this.a instanceof abj) && connectionResult.c != 24) {
            this.i.l = true;
            vs vsVar = this.i;
            handler5 = vsVar.f;
            handler6 = vsVar.f;
            handler5.sendMessageDelayed(handler6.obtainMessage(19), 300000L);
        }
        if (connectionResult.c == 4) {
            status = vs.g;
            a(status);
        } else if (this.j.isEmpty()) {
            this.g = connectionResult;
        } else if (exc != null) {
            handler4 = this.i.f;
            aat.a(handler4);
            a((Status) null, exc, false);
        } else {
            z = this.i.u;
            if (z) {
                b2 = vs.b((vo<?>) this.b, connectionResult);
                a(b2, (Exception) null, true);
                if (this.j.isEmpty() || c(connectionResult) || this.i.b(connectionResult, this.e)) {
                    return;
                }
                if (connectionResult.c == 18) {
                    this.f = true;
                }
                if (!this.f) {
                    b3 = vs.b((vo<?>) this.b, connectionResult);
                    a(b3);
                    return;
                }
                vs vsVar2 = this.i;
                handler2 = vsVar2.f;
                handler3 = vsVar2.f;
                Message obtain = Message.obtain(handler3, 9, this.b);
                j = this.i.i;
                handler2.sendMessageDelayed(obtain, j);
                return;
            }
            b = vs.b((vo<?>) this.b, connectionResult);
            a(b);
        }
    }

    @Override // defpackage.zj
    public final void a(ConnectionResult connectionResult, vc<?> vcVar, boolean z) {
        throw null;
    }

    public final void a(Status status) {
        Handler handler;
        handler = this.i.f;
        aat.a(handler);
        a(status, (Exception) null, false);
    }

    public final void a(yy yyVar) {
        Handler handler;
        handler = this.i.f;
        aat.a(handler);
        if (this.a.j()) {
            if (c(yyVar)) {
                h();
                return;
            } else {
                this.j.add(yyVar);
                return;
            }
        }
        this.j.add(yyVar);
        ConnectionResult connectionResult = this.g;
        if (connectionResult == null || !connectionResult.a()) {
            b();
        } else {
            a(this.g, (Exception) null);
        }
    }

    public final boolean a(boolean z) {
        Handler handler;
        handler = this.i.f;
        aat.a(handler);
        if (!this.a.j() || this.d.size() != 0) {
            return false;
        }
        if (!this.k.a()) {
            this.a.a("Timing out service connection.");
            return true;
        }
        if (z) {
            h();
        }
        return false;
    }

    public final void b() {
        Handler handler;
        abw abwVar;
        Context context;
        handler = this.i.f;
        aat.a(handler);
        if (this.a.j() || this.a.k()) {
            return;
        }
        try {
            vs vsVar = this.i;
            abwVar = vsVar.q;
            context = vsVar.o;
            int a = abwVar.a(context, this.a);
            if (a == 0) {
                vs vsVar2 = this.i;
                vc.f fVar = this.a;
                xu xuVar = new xu(vsVar2, fVar, this.b);
                if (fVar.m()) {
                    ((yn) aat.a(this.l)).a(xuVar);
                }
                try {
                    this.a.a(xuVar);
                    return;
                } catch (SecurityException e) {
                    a(new ConnectionResult(10), e);
                    return;
                }
            }
            ConnectionResult connectionResult = new ConnectionResult(a, null);
            String name = this.a.getClass().getName();
            String obj = connectionResult.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 35 + obj.length());
            sb.append("The service for ");
            sb.append(name);
            sb.append(" is not available: ");
            sb.append(obj);
            a(connectionResult, (Exception) null);
        } catch (IllegalStateException e2) {
            a(new ConnectionResult(10), e2);
        }
    }

    public final void b(int i) {
        Handler handler;
        Handler handler2;
        long j;
        Handler handler3;
        Handler handler4;
        long j2;
        abw abwVar;
        a();
        this.f = true;
        this.k.a(i, this.a.g());
        vs vsVar = this.i;
        handler = vsVar.f;
        handler2 = vsVar.f;
        Message obtain = Message.obtain(handler2, 9, this.b);
        j = this.i.i;
        handler.sendMessageDelayed(obtain, j);
        vs vsVar2 = this.i;
        handler3 = vsVar2.f;
        handler4 = vsVar2.f;
        Message obtain2 = Message.obtain(handler4, 11, this.b);
        j2 = this.i.j;
        handler3.sendMessageDelayed(obtain2, j2);
        abwVar = this.i.q;
        abwVar.a.clear();
        for (yh yhVar : this.d.values()) {
            yhVar.b.run();
        }
    }

    public final void c() {
        a();
        b(ConnectionResult.a);
        i();
        Iterator<yh> it = this.d.values().iterator();
        while (it.hasNext()) {
            if (a(it.next().a.b) != null) {
                it.remove();
            } else {
                try {
                    new bwm();
                } catch (DeadObjectException unused) {
                    a(3);
                    this.a.a("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        g();
        h();
    }

    public final void d() {
        Handler handler;
        handler = this.i.f;
        aat.a(handler);
        a(vs.a);
        this.k.a(false, vs.a);
        for (vw.a aVar : (vw.a[]) this.d.keySet().toArray(new vw.a[0])) {
            a(new yx(aVar, new bwm()));
        }
        b(new ConnectionResult(4));
        if (this.a.j()) {
            this.a.a(new xq(this));
        }
    }

    public final void e() {
        Handler handler;
        ux uxVar;
        Context context;
        Status status;
        handler = this.i.f;
        aat.a(handler);
        if (this.f) {
            i();
            vs vsVar = this.i;
            uxVar = vsVar.p;
            context = vsVar.o;
            if (uxVar.a(context) == 18) {
                status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
            } else {
                status = new Status(22, "API failed to connect while resuming due to an unknown error.");
            }
            a(status);
            this.a.a("Timing out connection while resuming.");
        }
    }

    public final boolean f() {
        return this.a.m();
    }
}
