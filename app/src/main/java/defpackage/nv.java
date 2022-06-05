package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J0\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u001aj\b\u0012\u0004\u0012\u00020\u0004`\u001b2\u0006\u0010\u001c\u001a\u00020\nH\u0002J\b\u0010\u001d\u001a\u00020\u0015H\u0007J\b\u0010\u001e\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\f\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\r\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseActivityLifecycleTracker;", "", "()V", "BILLING_ACTIVITY_NAME", "", "SERVICE_INTERFACE_NAME", "TAG", "callbacks", "Landroid/app/Application$ActivityLifecycleCallbacks;", "hasBillingActivity", "", "Ljava/lang/Boolean;", "hasBillingService", "inAppBillingObj", "intent", "Landroid/content/Intent;", "isTracking", "Ljava/util/concurrent/atomic/AtomicBoolean;", "serviceConnection", "Landroid/content/ServiceConnection;", "initializeIfNotInitialized", "", "logPurchase", "context", "Landroid/content/Context;", "purchases", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "isSubscription", "startIapLogging", "startTracking", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: nv  reason: default package */
/* loaded from: classes2.dex */
public final class nv {
    public static final nv a = new nv();
    private static final String b = nv.class.getCanonicalName();
    private static final AtomicBoolean c = new AtomicBoolean(false);
    private static Boolean d;
    private static Boolean e;
    private static ServiceConnection f;
    private static Application.ActivityLifecycleCallbacks g;
    private static Intent h;
    private static Object i;

    private nv() {
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/facebook/appevents/iap/InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$1", "Landroid/content/ServiceConnection;", "onServiceConnected", "", "name", "Landroid/content/ComponentName;", NotificationCompat.CATEGORY_SERVICE, "Landroid/os/IBinder;", "onServiceDisconnected", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: nv$a */
    /* loaded from: classes2.dex */
    public static final class a implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            dqc.d(componentName, "name");
        }

        a() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            dqc.d(componentName, "name");
            dqc.d(iBinder, NotificationCompat.CATEGORY_SERVICE);
            nv nvVar = nv.a;
            nv.i = ny.a(ly.k(), iBinder);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"com/facebook/appevents/iap/InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2", "Landroid/app/Application$ActivityLifecycleCallbacks;", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: nv$b */
    /* loaded from: classes2.dex */
    public static final class b implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            dqc.d(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            dqc.d(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            dqc.d(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            dqc.d(activity, "activity");
            dqc.d(bundle, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            dqc.d(activity, "activity");
        }

        b() {
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
        /* renamed from: nv$b$a */
        /* loaded from: classes2.dex */
        static final class a implements Runnable {
            public static final a a = new a();

            a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (qx.a(this)) {
                    return;
                }
                try {
                    Context k = ly.k();
                    nv nvVar = nv.a;
                    ArrayList<String> a2 = ny.a(k, nv.i);
                    nv nvVar2 = nv.a;
                    nv.a(k, a2, false);
                    nv nvVar3 = nv.a;
                    ArrayList<String> b = ny.b(k, nv.i);
                    nv nvVar4 = nv.a;
                    nv.a(k, b, true);
                } catch (Throwable th) {
                    qx.a(th, this);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            dqc.d(activity, "activity");
            try {
                ly.a().execute(a.a);
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            dqc.d(activity, "activity");
            try {
                nv nvVar = nv.a;
                if (!dqc.a(nv.e, Boolean.TRUE) || !dqc.a((Object) activity.getLocalClassName(), (Object) "com.android.billingclient.api.ProxyBillingActivity")) {
                    return;
                }
                ly.a().execute(RunnableC0043b.a);
            } catch (Exception unused) {
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
        /* renamed from: nv$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class RunnableC0043b implements Runnable {
            public static final RunnableC0043b a = new RunnableC0043b();

            RunnableC0043b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (qx.a(this)) {
                    return;
                }
                try {
                    Context k = ly.k();
                    nv nvVar = nv.a;
                    ArrayList<String> a2 = ny.a(k, nv.i);
                    if (a2.isEmpty()) {
                        nv nvVar2 = nv.a;
                        a2 = ny.c(k, nv.i);
                    }
                    nv nvVar3 = nv.a;
                    nv.a(k, a2, false);
                } catch (Throwable th) {
                    qx.a(th, this);
                }
            }
        }
    }

    public static final void a() {
        if (d == null) {
            Boolean valueOf = Boolean.valueOf(oc.a("com.android.vending.billing.IInAppBillingService$Stub") != null);
            d = valueOf;
            if (!dqc.a(valueOf, Boolean.FALSE)) {
                e = Boolean.valueOf(oc.a("com.android.billingclient.api.ProxyBillingActivity") != null);
                ny.a();
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                dqc.b(intent, "Intent(\"com.android.vend…ge(\"com.android.vending\")");
                h = intent;
                f = new a();
                g = new b();
            }
        }
        if (!dqc.a(d, Boolean.FALSE) && oh.b() && c.compareAndSet(false, true)) {
            Context k = ly.k();
            if (!(k instanceof Application)) {
                return;
            }
            Application application = (Application) k;
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = g;
            if (activityLifecycleCallbacks == null) {
                dqc.a("callbacks");
            }
            application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
            Intent intent2 = h;
            if (intent2 == null) {
                dqc.a("intent");
            }
            ServiceConnection serviceConnection = f;
            if (serviceConnection == null) {
                dqc.a("serviceConnection");
            }
            k.bindService(intent2, serviceConnection, 1);
        }
    }

    public static final /* synthetic */ void a(Context context, ArrayList arrayList, boolean z) {
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    String string = new JSONObject(str).getString("productId");
                    dqc.b(string, "sku");
                    dqc.b(str, "purchase");
                    hashMap.put(string, str);
                    arrayList2.add(string);
                } catch (JSONException unused) {
                }
            }
            for (Map.Entry<String, String> entry : ny.a(context, arrayList2, i, z).entrySet()) {
                String value = entry.getValue();
                String str2 = (String) hashMap.get(entry.getKey());
                if (str2 != null) {
                    dqc.b(str2, "it");
                    oh.a(str2, value, z);
                }
            }
        }
    }
}
