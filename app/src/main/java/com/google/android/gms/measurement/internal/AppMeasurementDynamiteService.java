package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.collection.ArrayMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends baq {
    public bql a = null;
    private Map<Integer, brq> b = new ArrayMap();

    /* loaded from: classes.dex */
    class a implements brq {
        private bat a;

        a(bat batVar) {
            this.a = batVar;
        }

        @Override // defpackage.brq
        public final void a(String str, String str2, Bundle bundle, long j) {
            try {
                this.a.a(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.a.q().f.a("Event listener threw exception", e);
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements brn {
        private bat a;

        b(bat batVar) {
            this.a = batVar;
        }

        @Override // defpackage.brn
        public final void a(String str, String str2, Bundle bundle, long j) {
            try {
                this.a.a(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.a.q().f.a("Event interceptor threw exception", e);
            }
        }
    }

    private final void a() {
        if (this.a != null) {
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }

    @Override // defpackage.axz
    public void initialize(afn afnVar, baz bazVar, long j) throws RemoteException {
        Context context = (Context) afp.a(afnVar);
        bql bqlVar = this.a;
        if (bqlVar == null) {
            this.a = bql.a(context, bazVar);
        } else {
            bqlVar.q().f.a("Attempting to initialize multiple times");
        }
    }

    @Override // defpackage.axz
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        a();
        this.a.d().a(str, str2, bundle, z, z2, j);
    }

    @Override // defpackage.axz
    public void setUserProperty(String str, String str2, afn afnVar, boolean z, long j) throws RemoteException {
        a();
        this.a.d().a(str, str2, afp.a(afnVar), z, j);
    }

    @Override // defpackage.axz
    public void setUserId(String str, long j) throws RemoteException {
        a();
        this.a.d().a(null, "_id", str, true, j);
    }

    @Override // defpackage.axz
    public void setCurrentScreen(afn afnVar, String str, String str2, long j) throws RemoteException {
        a();
        this.a.h().a((Activity) afp.a(afnVar), str, str2);
    }

    @Override // defpackage.axz
    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        a();
        this.a.d().a(z);
    }

    @Override // defpackage.axz
    public void resetAnalyticsData(long j) throws RemoteException {
        a();
        brs d = this.a.d();
        d.a((String) null);
        d.p().a(new brw(d, j));
    }

    @Override // defpackage.axz
    public void setMinimumSessionDuration(long j) throws RemoteException {
        a();
        brs d = this.a.d();
        d.p().a(new bsj(d, j));
    }

    @Override // defpackage.axz
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        a();
        brs d = this.a.d();
        d.p().a(new bsi(d, j));
    }

    @Override // defpackage.axz
    public void getMaxUserProperties(String str, bas basVar) throws RemoteException {
        a();
        this.a.d();
        aat.a(str);
        this.a.e().a(basVar, 25);
    }

    @Override // defpackage.axz
    public void getCurrentScreenName(bas basVar) throws RemoteException {
        a();
        a(basVar, this.a.d().y());
    }

    @Override // defpackage.axz
    public void getCurrentScreenClass(bas basVar) throws RemoteException {
        a();
        a(basVar, this.a.d().z());
    }

    @Override // defpackage.axz
    public void getCachedAppInstanceId(bas basVar) throws RemoteException {
        a();
        a(basVar, this.a.d().w());
    }

    @Override // defpackage.axz
    public void getAppInstanceId(bas basVar) throws RemoteException {
        a();
        this.a.p().a(new bsb(this, basVar));
    }

    @Override // defpackage.axz
    public void getDeepLink(bas basVar) throws RemoteException {
        a();
        brs d = this.a.d();
        d.c();
        if (!d.s().d(null, blk.az)) {
            d.o().a(basVar, "");
        } else if (d.r().v.a() > 0) {
            d.o().a(basVar, "");
        } else {
            d.r().v.a(d.l().a());
            d.w.a(basVar);
        }
    }

    @Override // defpackage.axz
    public void getGmpAppId(bas basVar) throws RemoteException {
        a();
        a(basVar, this.a.d().E());
    }

    @Override // defpackage.axz
    public void generateEventId(bas basVar) throws RemoteException {
        a();
        this.a.e().a(basVar, this.a.e().f());
    }

    @Override // defpackage.axz
    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        a();
        this.a.n().a(str, j);
    }

    @Override // defpackage.axz
    public void endAdUnitExposure(String str, long j) throws RemoteException {
        a();
        this.a.n().b(str, j);
    }

    @Override // defpackage.axz
    public void initForTests(Map map) throws RemoteException {
        a();
    }

    @Override // defpackage.axz
    public void logEventAndBundle(String str, String str2, Bundle bundle, bas basVar, long j) throws RemoteException {
        a();
        aat.a(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.a.p().a(new buc(this, basVar, new bli(str2, new blh(bundle), "app", j), str));
    }

    @Override // defpackage.axz
    public void onActivityStarted(afn afnVar, long j) throws RemoteException {
        a();
        bsl bslVar = this.a.d().a;
        if (bslVar != null) {
            this.a.d().v();
            bslVar.onActivityStarted((Activity) afp.a(afnVar));
        }
    }

    @Override // defpackage.axz
    public void onActivityStopped(afn afnVar, long j) throws RemoteException {
        a();
        bsl bslVar = this.a.d().a;
        if (bslVar != null) {
            this.a.d().v();
            bslVar.onActivityStopped((Activity) afp.a(afnVar));
        }
    }

    @Override // defpackage.axz
    public void onActivityCreated(afn afnVar, Bundle bundle, long j) throws RemoteException {
        a();
        bsl bslVar = this.a.d().a;
        if (bslVar != null) {
            this.a.d().v();
            bslVar.onActivityCreated((Activity) afp.a(afnVar), bundle);
        }
    }

    @Override // defpackage.axz
    public void onActivityDestroyed(afn afnVar, long j) throws RemoteException {
        a();
        bsl bslVar = this.a.d().a;
        if (bslVar != null) {
            this.a.d().v();
            bslVar.onActivityDestroyed((Activity) afp.a(afnVar));
        }
    }

    @Override // defpackage.axz
    public void onActivityPaused(afn afnVar, long j) throws RemoteException {
        a();
        bsl bslVar = this.a.d().a;
        if (bslVar != null) {
            this.a.d().v();
            bslVar.onActivityPaused((Activity) afp.a(afnVar));
        }
    }

    @Override // defpackage.axz
    public void onActivityResumed(afn afnVar, long j) throws RemoteException {
        a();
        bsl bslVar = this.a.d().a;
        if (bslVar != null) {
            this.a.d().v();
            bslVar.onActivityResumed((Activity) afp.a(afnVar));
        }
    }

    @Override // defpackage.axz
    public void onActivitySaveInstanceState(afn afnVar, bas basVar, long j) throws RemoteException {
        a();
        bsl bslVar = this.a.d().a;
        Bundle bundle = new Bundle();
        if (bslVar != null) {
            this.a.d().v();
            bslVar.onActivitySaveInstanceState((Activity) afp.a(afnVar), bundle);
        }
        try {
            basVar.a(bundle);
        } catch (RemoteException e) {
            this.a.q().f.a("Error returning bundle value to wrapper", e);
        }
    }

    @Override // defpackage.axz
    public void performAction(Bundle bundle, bas basVar, long j) throws RemoteException {
        a();
        basVar.a(null);
    }

    @Override // defpackage.axz
    public void getUserProperties(String str, String str2, boolean z, bas basVar) throws RemoteException {
        a();
        this.a.p().a(new btb(this, basVar, str, str2, z));
    }

    @Override // defpackage.axz
    public void logHealthData(int i, String str, afn afnVar, afn afnVar2, afn afnVar3) throws RemoteException {
        a();
        Object obj = null;
        Object a2 = afnVar == null ? null : afp.a(afnVar);
        Object a3 = afnVar2 == null ? null : afp.a(afnVar2);
        if (afnVar3 != null) {
            obj = afp.a(afnVar3);
        }
        this.a.q().a(i, true, false, str, a2, a3, obj);
    }

    @Override // defpackage.axz
    public void setEventInterceptor(bat batVar) throws RemoteException {
        a();
        brs d = this.a.d();
        b bVar = new b(batVar);
        d.B();
        d.p().a(new brv(d, bVar));
    }

    @Override // defpackage.axz
    public void registerOnMeasurementEventListener(bat batVar) throws RemoteException {
        a();
        brq brqVar = this.b.get(Integer.valueOf(batVar.a()));
        if (brqVar == null) {
            brqVar = new a(batVar);
            this.b.put(Integer.valueOf(batVar.a()), brqVar);
        }
        this.a.d().a(brqVar);
    }

    @Override // defpackage.axz
    public void unregisterOnMeasurementEventListener(bat batVar) throws RemoteException {
        a();
        brq remove = this.b.remove(Integer.valueOf(batVar.a()));
        if (remove == null) {
            remove = new a(batVar);
        }
        this.a.d().b(remove);
    }

    @Override // defpackage.axz
    public void setInstanceIdProvider(bax baxVar) throws RemoteException {
        a();
    }

    @Override // defpackage.axz
    public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        a();
        if (bundle == null) {
            this.a.q().c.a("Conditional user property must not be null");
        } else {
            this.a.d().a(bundle, j);
        }
    }

    @Override // defpackage.axz
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        a();
        this.a.d().b(str, str2, bundle);
    }

    @Override // defpackage.axz
    public void getConditionalUserProperties(String str, String str2, bas basVar) throws RemoteException {
        a();
        this.a.p().a(new buy(this, basVar, str, str2));
    }

    @Override // defpackage.axz
    public void getTestFlag(bas basVar, int i) throws RemoteException {
        a();
        if (i == 0) {
            buv e = this.a.e();
            brs d = this.a.d();
            AtomicReference atomicReference = new AtomicReference();
            e.a(basVar, (String) d.p().a(atomicReference, "String test flag value", new brz(d, atomicReference)));
        } else if (i == 1) {
            buv e2 = this.a.e();
            brs d2 = this.a.d();
            AtomicReference atomicReference2 = new AtomicReference();
            e2.a(basVar, ((Long) d2.p().a(atomicReference2, "long test flag value", new bsc(d2, atomicReference2))).longValue());
        } else if (i == 2) {
            buv e3 = this.a.e();
            brs d3 = this.a.d();
            AtomicReference atomicReference3 = new AtomicReference();
            double doubleValue = ((Double) d3.p().a(atomicReference3, "double test flag value", new bse(d3, atomicReference3))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                basVar.a(bundle);
            } catch (RemoteException e4) {
                e3.w.q().f.a("Error returning double value to wrapper", e4);
            }
        } else if (i == 3) {
            buv e5 = this.a.e();
            brs d4 = this.a.d();
            AtomicReference atomicReference4 = new AtomicReference();
            e5.a(basVar, ((Integer) d4.p().a(atomicReference4, "int test flag value", new bsf(d4, atomicReference4))).intValue());
        } else if (i != 4) {
        } else {
            buv e6 = this.a.e();
            brs d5 = this.a.d();
            AtomicReference atomicReference5 = new AtomicReference();
            e6.a(basVar, ((Boolean) d5.p().a(atomicReference5, "boolean test flag value", new brr(d5, atomicReference5))).booleanValue());
        }
    }

    private final void a(bas basVar, String str) {
        this.a.e().a(basVar, str);
    }

    @Override // defpackage.axz
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        a();
        this.a.d().b(z);
    }

    @Override // defpackage.axz
    public void isDataCollectionEnabled(bas basVar) throws RemoteException {
        a();
        this.a.p().a(new bux(this, basVar));
    }
}
