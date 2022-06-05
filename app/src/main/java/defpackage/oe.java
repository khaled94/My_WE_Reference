package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import defpackage.mu;
import defpackage.mv;
import defpackage.ol;
import defpackage.on;
import defpackage.pr;
import defpackage.qc;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\n\u0010 \u001a\u0004\u0018\u00010\rH\u0007J\n\u0010!\u001a\u0004\u0018\u00010\"H\u0007J\b\u0010#\u001a\u00020$H\u0007J\b\u0010%\u001a\u00020$H\u0007J\u0012\u0010&\u001a\u00020\u001f2\b\u0010'\u001a\u0004\u0018\u00010\rH\u0007J\u0010\u0010(\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\rH\u0002J\u0010\u0010)\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\rH\u0002J\u0010\u0010*\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\rH\u0007J\u001a\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020-2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/facebook/appevents/internal/ActivityLifecycleTracker;", "", "()V", "INCORRECT_IMPL_WARNING", "", "INTERRUPTION_THRESHOLD_MILLISECONDS", "", "TAG", "activityReferences", "", "appId", "currActivity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "currentActivityAppearTime", "currentFuture", "Ljava/util/concurrent/ScheduledFuture;", "currentFutureLock", "currentSession", "Lcom/facebook/appevents/internal/SessionInfo;", "foregroundActivityCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "sessionTimeoutInSeconds", "getSessionTimeoutInSeconds", "()I", "singleThreadExecutor", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "tracking", "Ljava/util/concurrent/atomic/AtomicBoolean;", "cancelCurrentTask", "", "getCurrentActivity", "getCurrentSessionGuid", "Ljava/util/UUID;", "isInBackground", "", "isTracking", "onActivityCreated", "activity", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "startTracking", "application", "Landroid/app/Application;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: oe  reason: default package */
/* loaded from: classes2.dex */
public final class oe {
    public static final oe a = new oe();
    private static final String b;
    private static final ScheduledExecutorService c;
    private static volatile ScheduledFuture<?> d;
    private static final Object e;
    private static final AtomicInteger f;
    private static volatile ol g;
    private static final AtomicBoolean h;
    private static String i;
    private static long j;
    private static int k;
    private static WeakReference<Activity> l;

    static {
        String canonicalName = oe.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        b = canonicalName;
        c = Executors.newSingleThreadScheduledExecutor();
        e = new Object();
        f = new AtomicInteger(0);
        h = new AtomicBoolean(false);
    }

    private oe() {
    }

    public static final void a(Application application, String str) {
        dqc.d(application, "application");
        if (!h.compareAndSet(false, true)) {
            return;
        }
        pr.a(pr.b.CodelessEvents, d.a);
        i = str;
        application.registerActivityLifecycleCallbacks(new e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "enabled", "", "onCompleted"}, k = 3, mv = {1, 5, 1})
    /* renamed from: oe$d */
    /* loaded from: classes2.dex */
    public static final class d implements pr.a {
        public static final d a = new d();

        d() {
        }

        @Override // defpackage.pr.a
        public final void a(boolean z) {
            if (z) {
                nj.a();
            } else {
                nj.b();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"com/facebook/appevents/internal/ActivityLifecycleTracker$startTracking$2", "Landroid/app/Application$ActivityLifecycleCallbacks;", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: oe$e */
    /* loaded from: classes2.dex */
    public static final class e implements Application.ActivityLifecycleCallbacks {
        e() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            dqc.d(activity, "activity");
            qc.a aVar = qc.a;
            mf mfVar = mf.APP_EVENTS;
            oe oeVar = oe.a;
            aVar.a(mfVar, oe.b, "onActivityCreated");
            of.b();
            oe.c();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            dqc.d(activity, "activity");
            oe oeVar = oe.a;
            oe.k++;
            qc.a aVar = qc.a;
            mf mfVar = mf.APP_EVENTS;
            oe oeVar2 = oe.a;
            aVar.a(mfVar, oe.b, "onActivityStarted");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            dqc.d(activity, "activity");
            qc.a aVar = qc.a;
            mf mfVar = mf.APP_EVENTS;
            oe oeVar = oe.a;
            aVar.a(mfVar, oe.b, "onActivityResumed");
            of.b();
            oe.a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            dqc.d(activity, "activity");
            qc.a aVar = qc.a;
            mf mfVar = mf.APP_EVENTS;
            oe oeVar = oe.a;
            aVar.a(mfVar, oe.b, "onActivityPaused");
            of.b();
            oe oeVar2 = oe.a;
            oe.b(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            dqc.d(activity, "activity");
            qc.a aVar = qc.a;
            mf mfVar = mf.APP_EVENTS;
            oe oeVar = oe.a;
            aVar.a(mfVar, oe.b, "onActivityStopped");
            mu.a aVar2 = mu.b;
            mv.a aVar3 = mv.b;
            ms.a();
            oe oeVar2 = oe.a;
            oe.k--;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            dqc.d(activity, "activity");
            dqc.d(bundle, "outState");
            qc.a aVar = qc.a;
            mf mfVar = mf.APP_EVENTS;
            oe oeVar = oe.a;
            aVar.a(mfVar, oe.b, "onActivitySaveInstanceState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            dqc.d(activity, "activity");
            qc.a aVar = qc.a;
            mf mfVar = mf.APP_EVENTS;
            oe oeVar = oe.a;
            aVar.a(mfVar, oe.b, "onActivityDestroyed");
            oe oeVar2 = oe.a;
            nj.c(activity);
        }
    }

    public static final boolean a() {
        return k == 0;
    }

    public static final UUID b() {
        ol olVar;
        if (g == null || (olVar = g) == null) {
            return null;
        }
        return olVar.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: oe$a */
    /* loaded from: classes2.dex */
    public static final class a implements Runnable {
        public static final a a = new a();

        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                oe oeVar = oe.a;
                if (oe.g != null) {
                    return;
                }
                oe oeVar2 = oe.a;
                ol.a aVar = ol.g;
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(ly.k());
                long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
                long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
                ol olVar = null;
                olVar = null;
                on onVar = null;
                olVar = null;
                String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
                if (j != 0 && j2 != 0 && string != null) {
                    ol olVar2 = new ol(Long.valueOf(j), Long.valueOf(j2));
                    ol.a(olVar2, defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0));
                    on.a aVar2 = on.a;
                    SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(ly.k());
                    if (defaultSharedPreferences2.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                        onVar = new on(defaultSharedPreferences2.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences2.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false), (byte) 0);
                    }
                    olVar2.c = onVar;
                    olVar2.b = Long.valueOf(System.currentTimeMillis());
                    UUID fromString = UUID.fromString(string);
                    dqc.b(fromString, "UUID.fromString(sessionIDStr)");
                    dqc.d(fromString, "<set-?>");
                    olVar2.f = fromString;
                    olVar = olVar2;
                }
                oe.g = olVar;
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    public static final void c() {
        c.execute(a.a);
    }

    public static final void a(Activity activity) {
        dqc.d(activity, "activity");
        l = new WeakReference<>(activity);
        f.incrementAndGet();
        n();
        long currentTimeMillis = System.currentTimeMillis();
        j = currentTimeMillis;
        String c2 = qi.c(activity);
        nj.a(activity);
        ne.a(activity);
        pc.a(activity);
        oa.b();
        c.execute(new c(currentTimeMillis, c2, activity.getApplicationContext()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: oe$c */
    /* loaded from: classes2.dex */
    public static final class c implements Runnable {
        final /* synthetic */ long a;
        final /* synthetic */ String b;
        final /* synthetic */ Context c;

        c(long j, String str, Context context) {
            this.a = j;
            this.b = str;
            this.c = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                oe oeVar = oe.a;
                ol olVar = oe.g;
                Long l = olVar != null ? olVar.e : null;
                oe oeVar2 = oe.a;
                if (oe.g == null) {
                    oe oeVar3 = oe.a;
                    oe.g = new ol(Long.valueOf(this.a), null);
                    String str = this.b;
                    oe oeVar4 = oe.a;
                    String str2 = oe.i;
                    Context context = this.c;
                    dqc.b(context, "appContext");
                    om.a(str, str2, context);
                } else if (l != null) {
                    long longValue = this.a - l.longValue();
                    oe oeVar5 = oe.a;
                    if (longValue > oe.i() * 1000) {
                        String str3 = this.b;
                        oe oeVar6 = oe.a;
                        ol olVar2 = oe.g;
                        oe oeVar7 = oe.a;
                        om.a(str3, olVar2, oe.i);
                        String str4 = this.b;
                        oe oeVar8 = oe.a;
                        String str5 = oe.i;
                        Context context2 = this.c;
                        dqc.b(context2, "appContext");
                        om.a(str4, str5, context2);
                        oe oeVar9 = oe.a;
                        oe.g = new ol(Long.valueOf(this.a), null);
                    } else if (longValue > 1000) {
                        oe oeVar10 = oe.a;
                        ol olVar3 = oe.g;
                        if (olVar3 != null) {
                            olVar3.a++;
                        }
                    }
                }
                oe oeVar11 = oe.a;
                ol olVar4 = oe.g;
                if (olVar4 != null) {
                    olVar4.e = Long.valueOf(this.a);
                }
                oe oeVar12 = oe.a;
                ol olVar5 = oe.g;
                if (olVar5 == null) {
                    return;
                }
                olVar5.a();
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: oe$b */
    /* loaded from: classes2.dex */
    public static final class b implements Runnable {
        final /* synthetic */ long a;
        final /* synthetic */ String b;

        b(long j, String str) {
            this.a = j;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                oe oeVar = oe.a;
                if (oe.g == null) {
                    oe oeVar2 = oe.a;
                    oe.g = new ol(Long.valueOf(this.a), null);
                }
                oe oeVar3 = oe.a;
                ol olVar = oe.g;
                if (olVar != null) {
                    olVar.e = Long.valueOf(this.a);
                }
                oe oeVar4 = oe.a;
                if (oe.f.get() <= 0) {
                    a aVar = new a();
                    oe oeVar5 = oe.a;
                    synchronized (oe.e) {
                        oe oeVar6 = oe.a;
                        ScheduledExecutorService scheduledExecutorService = oe.c;
                        oe oeVar7 = oe.a;
                        oe.d = scheduledExecutorService.schedule(aVar, oe.i(), TimeUnit.SECONDS);
                        dmg dmgVar = dmg.a;
                    }
                }
                oe oeVar8 = oe.a;
                long j = oe.j;
                long j2 = 0;
                if (j > 0) {
                    j2 = (this.a - j) / 1000;
                }
                oh.a(this.b, j2);
                oe oeVar9 = oe.a;
                ol olVar2 = oe.g;
                if (olVar2 == null) {
                    return;
                }
                olVar2.a();
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
        /* renamed from: oe$b$a */
        /* loaded from: classes2.dex */
        static final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (qx.a(this)) {
                    return;
                }
                try {
                    oe oeVar = oe.a;
                    if (oe.g == null) {
                        oe oeVar2 = oe.a;
                        oe.g = new ol(Long.valueOf(b.this.a), null);
                    }
                    oe oeVar3 = oe.a;
                    if (oe.f.get() <= 0) {
                        String str = b.this.b;
                        oe oeVar4 = oe.a;
                        ol olVar = oe.g;
                        oe oeVar5 = oe.a;
                        om.a(str, olVar, oe.i);
                        ol.a aVar = ol.g;
                        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(ly.k()).edit();
                        edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
                        edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
                        edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
                        edit.remove("com.facebook.appevents.SessionInfo.sessionId");
                        edit.apply();
                        on.a aVar2 = on.a;
                        SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(ly.k()).edit();
                        edit2.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
                        edit2.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
                        edit2.apply();
                        oe oeVar6 = oe.a;
                        oe.g = null;
                    }
                    oe oeVar7 = oe.a;
                    synchronized (oe.e) {
                        oe oeVar8 = oe.a;
                        oe.d = null;
                        dmg dmgVar = dmg.a;
                    }
                } catch (Throwable th) {
                    qx.a(th, this);
                }
            }
        }
    }

    private static void n() {
        ScheduledFuture<?> scheduledFuture;
        synchronized (e) {
            if (d != null && (scheduledFuture = d) != null) {
                scheduledFuture.cancel(false);
            }
            d = null;
            dmg dmgVar = dmg.a;
        }
    }

    public static final Activity d() {
        WeakReference<Activity> weakReference = l;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static final /* synthetic */ void b(Activity activity) {
        if (f.decrementAndGet() < 0) {
            f.set(0);
        }
        n();
        long currentTimeMillis = System.currentTimeMillis();
        String c2 = qi.c(activity);
        nj.b(activity);
        c.execute(new b(currentTimeMillis, c2));
    }

    public static final /* synthetic */ int i() {
        pv a2 = pw.a(ly.m());
        if (a2 == null) {
            return oi.a();
        }
        return a2.b;
    }
}
