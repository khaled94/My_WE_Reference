package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: bbb  reason: default package */
/* loaded from: classes.dex */
public class bbb {
    private static volatile bbb b = null;
    private static Boolean h = null;
    private static Boolean i = null;
    private static boolean j = false;
    private static Boolean k = null;
    private static String l = "use_dynamite_api";
    private static String m = "allow_remote_dynamite";
    private static boolean n = false;
    private static boolean o = false;
    private List<Pair<brq, Object>> f;
    private int g;
    private boolean p;
    private String q;
    private axz r;
    private final String c = "FA";
    protected final ady a = aea.d();
    private final ExecutorService d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private final bky e = new bky(this);

    /* renamed from: bbb$b */
    /* loaded from: classes.dex */
    class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            bbb.this.a(new apg(this, activity, bundle));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            bbb.this.a(new apf(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            bbb.this.a(new api(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            bbb.this.a(new aph(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            bbb.this.a(new apk(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            aza azaVar = new aza();
            bbb.this.a(new apj(this, activity, azaVar));
            Bundle b = azaVar.b(50L);
            if (b != null) {
                bundle.putAll(b);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            bbb.this.a(new apl(this, activity));
        }
    }

    public static bbb a(Context context) {
        return a(context, (Bundle) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bbb$a */
    /* loaded from: classes.dex */
    public abstract class a implements Runnable {
        final long a;
        final long b;
        private final boolean c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(bbb bbbVar) {
            this(true);
        }

        abstract void a() throws RemoteException;

        protected void b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(boolean z) {
            this.a = bbb.this.a.a();
            this.b = bbb.this.a.b();
            this.c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (bbb.this.p) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e) {
                bbb.this.a(e, false, this.c);
                b();
            }
        }
    }

    public static bbb a(Context context, Bundle bundle) {
        aat.a(context);
        if (b == null) {
            synchronized (bbb.class) {
                if (b == null) {
                    b = new bbb(context, bundle);
                }
            }
        }
        return b;
    }

    private bbb(Context context, Bundle bundle) {
        if (!(!f(context) || c())) {
            this.q = null;
            this.p = true;
            return;
        }
        if (!b(null, null)) {
            this.q = "fa";
        } else {
            this.q = null;
        }
        a(new bba(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new b());
    }

    private static boolean f(Context context) {
        try {
            vt.a(context);
        } catch (IllegalStateException unused) {
        }
        return vt.a() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(String str, String str2) {
        return (str2 == null || str == null || c()) ? false : true;
    }

    public final void a(a aVar) {
        this.d.execute(aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final axz a(Context context, boolean z) {
        DynamiteModule.a aVar;
        try {
            if (z) {
                aVar = DynamiteModule.f;
            } else {
                aVar = DynamiteModule.b;
            }
            return baq.asInterface(DynamiteModule.a(context, aVar, ModuleDescriptor.MODULE_ID).a("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e) {
            a(e, true, false);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Exception exc, boolean z, boolean z2) {
        this.p |= z;
        if (!z && z2) {
            a("Error with data collection. Data lost.", exc);
        }
    }

    private static boolean c() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final long a() {
        aza azaVar = new aza();
        a(new aot(this, azaVar));
        Long l2 = (Long) aza.a(azaVar.b(500L), Long.class);
        if (l2 == null) {
            long nextLong = new Random(System.nanoTime() ^ this.a.a()).nextLong();
            int i2 = this.g + 1;
            this.g = i2;
            return nextLong + i2;
        }
        return l2.longValue();
    }

    private void a(String str, Object obj) {
        a(new aox(this, str, obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(Context context) {
        synchronized (bbb.class) {
            try {
            } catch (ClassCastException | IllegalStateException | NullPointerException unused) {
                h = Boolean.FALSE;
                i = Boolean.FALSE;
            }
            if (h == null || i == null) {
                if (a(context, "app_measurement_internal_disable_startup_flags")) {
                    h = Boolean.FALSE;
                    i = Boolean.FALSE;
                    return;
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                h = Boolean.valueOf(sharedPreferences.getBoolean(l, false));
                i = Boolean.valueOf(sharedPreferences.getBoolean(m, false));
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.remove(l);
                edit.remove(m);
                edit.apply();
            }
        }
    }

    public static boolean b(Context context) {
        g(context);
        synchronized (bbb.class) {
            if (!j) {
                try {
                    String str = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, "measurement.dynamite.enabled", "");
                    if ("true".equals(str)) {
                        k = Boolean.TRUE;
                    } else if ("false".equals(str)) {
                        k = Boolean.FALSE;
                    } else {
                        k = null;
                    }
                    j = true;
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    k = null;
                    j = true;
                }
            }
        }
        Boolean bool = k;
        if (bool == null) {
            bool = h;
        }
        return bool.booleanValue();
    }

    private static boolean a(Context context, String str) {
        aat.a(str);
        try {
            ApplicationInfo a2 = aep.a(context).a(context.getPackageName(), 128);
            if (a2 != null && a2.metaData != null) {
                return a2.metaData.getBoolean(str);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}
