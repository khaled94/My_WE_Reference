package defpackage;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import com.facebook.FacebookException;
import defpackage.lz;
import defpackage.nk;
import defpackage.nn;
import defpackage.pg;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0002\b\u0013J\b\u0010\u0014\u001a\u00020\u0011H\u0007J\b\u0010\u0015\u001a\u00020\u0011H\u0007J\r\u0010\u0016\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0017J\r\u0010\u0018\u001a\u00020\bH\u0001¢\u0006\u0002\b\u0019J\r\u0010\u001a\u001a\u00020\bH\u0001¢\u0006\u0002\b\u001bJ\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0010\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0010\u0010 \u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0015\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\bH\u0001¢\u0006\u0002\b#R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/facebook/appevents/codeless/CodelessManager;", "", "()V", "deviceSessionID", "", "isAppIndexingEnabled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCheckingSession", "", "isCodelessEnabled", "sensorManager", "Landroid/hardware/SensorManager;", "viewIndexer", "Lcom/facebook/appevents/codeless/ViewIndexer;", "viewIndexingTrigger", "Lcom/facebook/appevents/codeless/ViewIndexingTrigger;", "checkCodelessSession", "", "applicationId", "checkCodelessSession$facebook_core_release", "disable", "enable", "getCurrentDeviceSessionID", "getCurrentDeviceSessionID$facebook_core_release", "getIsAppIndexingEnabled", "getIsAppIndexingEnabled$facebook_core_release", "isDebugOnEmulator", "isDebugOnEmulator$facebook_core_release", "onActivityDestroyed", "activity", "Landroid/app/Activity;", "onActivityPaused", "onActivityResumed", "updateAppIndexing", "appIndexingEnabled", "updateAppIndexing$facebook_core_release", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: nj  reason: default package */
/* loaded from: classes2.dex */
public final class nj {
    private static SensorManager c;
    private static nm d;
    private static String e;
    private static volatile boolean h;
    public static final nj a = new nj();
    private static final nn b = new nn();
    private static final AtomicBoolean f = new AtomicBoolean(true);
    private static final AtomicBoolean g = new AtomicBoolean(false);

    private static boolean i() {
        if (qx.a(nj.class)) {
        }
        return false;
    }

    private nj() {
    }

    public static final /* synthetic */ AtomicBoolean e() {
        if (qx.a(nj.class)) {
            return null;
        }
        try {
            return g;
        } catch (Throwable th) {
            qx.a(th, nj.class);
            return null;
        }
    }

    public static final /* synthetic */ void f() {
        if (qx.a(nj.class)) {
            return;
        }
        try {
            e = null;
        } catch (Throwable th) {
            qx.a(th, nj.class);
        }
    }

    public static final /* synthetic */ nm g() {
        if (qx.a(nj.class)) {
            return null;
        }
        try {
            return d;
        } catch (Throwable th) {
            qx.a(th, nj.class);
            return null;
        }
    }

    public static final /* synthetic */ void h() {
        if (qx.a(nj.class)) {
            return;
        }
        try {
            h = false;
        } catch (Throwable th) {
            qx.a(th, nj.class);
        }
    }

    public static final void a(Activity activity) {
        if (qx.a(nj.class)) {
            return;
        }
        try {
            dqc.d(activity, "activity");
            if (!f.get()) {
                return;
            }
            nk a2 = nk.f.a();
            if (!qx.a(a2)) {
                dqc.d(activity, "activity");
                if (!qa.b()) {
                    Thread currentThread = Thread.currentThread();
                    Looper mainLooper = Looper.getMainLooper();
                    dqc.b(mainLooper, "Looper.getMainLooper()");
                    if (currentThread != mainLooper.getThread()) {
                        throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
                    }
                    a2.b.add(activity);
                    a2.d.clear();
                    HashSet<String> hashSet = a2.e.get(Integer.valueOf(activity.hashCode()));
                    if (hashSet != null) {
                        dqc.b(hashSet, "it");
                        a2.d = hashSet;
                    }
                    if (!qx.a(a2)) {
                        try {
                            Thread currentThread2 = Thread.currentThread();
                            Looper mainLooper2 = Looper.getMainLooper();
                            dqc.b(mainLooper2, "Looper.getMainLooper()");
                            if (currentThread2 == mainLooper2.getThread()) {
                                a2.a();
                            } else {
                                a2.a.post(new nk.d());
                            }
                        } catch (Throwable th) {
                            qx.a(th, a2);
                        }
                    }
                }
            }
            Context applicationContext = activity.getApplicationContext();
            String m = ly.m();
            pv a3 = pw.a(m);
            if (a3 != null && a3.g) {
                SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                c = sensorManager;
                if (sensorManager == null) {
                    return;
                }
                if (sensorManager != null) {
                    Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                    d = new nm(activity);
                    nn nnVar = b;
                    b bVar = new b(a3, m);
                    if (!qx.a(nnVar)) {
                        nnVar.a = bVar;
                    }
                    SensorManager sensorManager2 = c;
                    if (sensorManager2 == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    sensorManager2.registerListener(b, defaultSensor, 2);
                    if (a3 != null && a3.g) {
                        nm nmVar = d;
                        if (nmVar == null) {
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                        nmVar.a();
                    }
                    i();
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
            i();
            i();
        } catch (Throwable th2) {
            qx.a(th2, nj.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onShake"}, k = 3, mv = {1, 5, 1})
    /* renamed from: nj$b */
    /* loaded from: classes2.dex */
    public static final class b implements nn.b {
        final /* synthetic */ pv a;
        final /* synthetic */ String b;

        b(pv pvVar, String str) {
            this.a = pvVar;
            this.b = str;
        }

        @Override // defpackage.nn.b
        public final void a() {
            pv pvVar = this.a;
            boolean z = pvVar != null && pvVar.g;
            boolean q = ly.q();
            if (!z || !q) {
                return;
            }
            nj.a(this.b);
        }
    }

    public static final void b(Activity activity) {
        if (qx.a(nj.class)) {
            return;
        }
        try {
            dqc.d(activity, "activity");
            if (!f.get()) {
                return;
            }
            nk a2 = nk.f.a();
            if (!qx.a(a2)) {
                dqc.d(activity, "activity");
                if (!qa.b()) {
                    Thread currentThread = Thread.currentThread();
                    Looper mainLooper = Looper.getMainLooper();
                    dqc.b(mainLooper, "Looper.getMainLooper()");
                    if (currentThread != mainLooper.getThread()) {
                        throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
                    }
                    a2.b.remove(activity);
                    a2.c.clear();
                    HashMap<Integer, HashSet<String>> hashMap = a2.e;
                    Integer valueOf = Integer.valueOf(activity.hashCode());
                    Object clone = a2.d.clone();
                    if (clone == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.HashSet<kotlin.String> /* = java.util.HashSet<kotlin.String> */");
                    }
                    hashMap.put(valueOf, (HashSet) clone);
                    a2.d.clear();
                }
            }
            nm nmVar = d;
            if (nmVar != null && !qx.a(nmVar) && nmVar.a.get() != null) {
                try {
                    Timer timer = nmVar.b;
                    if (timer != null) {
                        timer.cancel();
                    }
                    nmVar.b = null;
                } catch (Exception unused) {
                }
            }
            SensorManager sensorManager = c;
            if (sensorManager == null) {
                return;
            }
            sensorManager.unregisterListener(b);
        } catch (Throwable th) {
            qx.a(th, nj.class);
        }
    }

    public static final void c(Activity activity) {
        if (qx.a(nj.class)) {
            return;
        }
        try {
            dqc.d(activity, "activity");
            nk a2 = nk.f.a();
            if (qx.a(a2)) {
                return;
            }
            dqc.d(activity, "activity");
            a2.e.remove(Integer.valueOf(activity.hashCode()));
        } catch (Throwable th) {
            qx.a(th, nj.class);
        }
    }

    public static final void a() {
        if (qx.a(nj.class)) {
            return;
        }
        try {
            f.set(true);
        } catch (Throwable th) {
            qx.a(th, nj.class);
        }
    }

    public static final void b() {
        if (qx.a(nj.class)) {
            return;
        }
        try {
            f.set(false);
        } catch (Throwable th) {
            qx.a(th, nj.class);
        }
    }

    public static final void a(String str) {
        if (qx.a(nj.class)) {
            return;
        }
        try {
            if (h) {
                return;
            }
            h = true;
            ly.a().execute(new a(str));
        } catch (Throwable th) {
            qx.a(th, nj.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: nj$a */
    /* loaded from: classes2.dex */
    public static final class a implements Runnable {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str = "0";
            if (qx.a(this)) {
                return;
            }
            try {
                lz.c cVar = lz.k;
                dqi dqiVar = dqi.a;
                boolean z = true;
                String format = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{this.a}, 1));
                dqc.b(format, "java.lang.String.format(locale, format, *args)");
                String str2 = null;
                lz a = lz.c.a((lk) null, format, (JSONObject) null, (lz.b) null);
                Bundle bundle = a.d;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Context k = ly.k();
                pg.a aVar = pg.e;
                pg a2 = pg.a.a(k);
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(Build.MODEL != null ? Build.MODEL : "");
                if (a2 != null) {
                    str2 = a2.a();
                }
                if (str2 != null) {
                    jSONArray.put(a2.a());
                } else {
                    jSONArray.put("");
                }
                jSONArray.put(str);
                if (of.c()) {
                    str = "1";
                }
                jSONArray.put(str);
                Locale e = qi.e();
                jSONArray.put(e.getLanguage() + "_" + e.getCountry());
                String jSONArray2 = jSONArray.toString();
                dqc.b(jSONArray2, "extInfoArray.toString()");
                bundle.putString("device_session_id", nj.c());
                bundle.putString("extinfo", jSONArray2);
                a.a(bundle);
                JSONObject jSONObject = lz.k.a(a).b;
                nj njVar = nj.a;
                AtomicBoolean e2 = nj.e();
                if (jSONObject == null || !jSONObject.optBoolean("is_app_indexing_enabled", false)) {
                    z = false;
                }
                e2.set(z);
                nj njVar2 = nj.a;
                if (!nj.e().get()) {
                    nj njVar3 = nj.a;
                    nj.f();
                } else {
                    nj njVar4 = nj.a;
                    nm g = nj.g();
                    if (g != null) {
                        g.a();
                    }
                }
                nj njVar5 = nj.a;
                nj.h();
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    public static final String c() {
        if (qx.a(nj.class)) {
            return null;
        }
        try {
            if (e == null) {
                e = UUID.randomUUID().toString();
            }
            String str = e;
            if (str != null) {
                return str;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th) {
            qx.a(th, nj.class);
            return null;
        }
    }

    public static final boolean d() {
        if (qx.a(nj.class)) {
            return false;
        }
        try {
            return g.get();
        } catch (Throwable th) {
            qx.a(th, nj.class);
            return false;
        }
    }

    public static final void a(boolean z) {
        if (qx.a(nj.class)) {
            return;
        }
        try {
            g.set(z);
        } catch (Throwable th) {
            qx.a(th, nj.class);
        }
    }
}
