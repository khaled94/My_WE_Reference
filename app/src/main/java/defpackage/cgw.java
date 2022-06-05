package defpackage;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import defpackage.cmd;
import defpackage.vp;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: cgw  reason: default package */
/* loaded from: classes2.dex */
public class cgw {
    private final Context i;
    private final String j;
    private final cgy k;
    private final cmg l;
    private final SharedPreferences m;
    private final cms n;
    private static final List<String> b = Arrays.asList("com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId");
    private static final List<String> c = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");
    private static final List<String> d = Arrays.asList("com.google.android.gms.measurement.AppMeasurement");
    private static final List<String> e = Arrays.asList(new String[0]);
    private static final Set<String> f = Collections.emptySet();
    private static final Object g = new Object();
    private static final Executor h = new b((byte) 0);
    static final Map<String, cgw> a = new ArrayMap();
    private final AtomicBoolean o = new AtomicBoolean(false);
    private final AtomicBoolean p = new AtomicBoolean();
    private final List<Object> r = new CopyOnWriteArrayList();
    private final List<Object> s = new CopyOnWriteArrayList();
    private final AtomicBoolean q = new AtomicBoolean(h());

    public final Context a() {
        i();
        return this.i;
    }

    public final String b() {
        i();
        return this.j;
    }

    public final cgy c() {
        i();
        return this.k;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof cgw)) {
            return false;
        }
        return this.j.equals(((cgw) obj).b());
    }

    public int hashCode() {
        return this.j.hashCode();
    }

    public String toString() {
        return aar.a(this).a("name", this.j).a("options", this.k).toString();
    }

    public static cgw d() {
        cgw cgwVar;
        synchronized (g) {
            cgwVar = a.get("[DEFAULT]");
            if (cgwVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + aef.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return cgwVar;
    }

    public static cgw a(String str) {
        cgw cgwVar;
        List<String> j;
        String str2;
        synchronized (g) {
            cgwVar = a.get(str.trim());
            if (cgwVar == null) {
                if (j().isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", j);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
            }
        }
        return cgwVar;
    }

    public static cgw a(Context context) {
        synchronized (g) {
            if (a.containsKey("[DEFAULT]")) {
                return d();
            }
            cgy a2 = cgy.a(context);
            if (a2 == null) {
                return null;
            }
            return a(context, a2, "[DEFAULT]");
        }
    }

    private static cgw a(Context context, cgy cgyVar, String str) {
        cgw cgwVar;
        a.a(context);
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (g) {
            boolean z = !a.containsKey(trim);
            aat.b(z, "FirebaseApp name " + trim + " already exists!");
            aat.a(context, "Application context cannot be null.");
            cgwVar = new cgw(context, trim, cgyVar);
            a.put(trim, cgwVar);
        }
        cgwVar.k();
        return cgwVar;
    }

    public final <T> T a(Class<T> cls) {
        i();
        return (T) this.l.a(cls);
    }

    public final boolean e() {
        i();
        return this.q.get();
    }

    private cgw(Context context, String str, cgy cgyVar) {
        this.i = (Context) aat.a(context);
        this.j = aat.a(str);
        this.k = (cgy) aat.a(cgyVar);
        this.m = context.getSharedPreferences("com.google.firebase.common.prefs:".concat(String.valueOf(str)), 0);
        cmd cmdVar = new cmd(context, new cmd.a((byte) 0));
        cmg cmgVar = new cmg(h, cmd.a(cmdVar.b.a(cmdVar.a)), clz.a(context, Context.class, new Class[0]), clz.a(this, cgw.class, new Class[0]), clz.a(cgyVar, cgy.class, new Class[0]), cpm.a("fire-android", ""), cpm.a("fire-core", "17.0.0"), cpi.b());
        this.l = cmgVar;
        this.n = (cms) cmgVar.a(cms.class);
    }

    private boolean h() {
        ApplicationInfo applicationInfo;
        if (this.m.contains("firebase_data_collection_default_enabled")) {
            return this.m.getBoolean("firebase_data_collection_default_enabled", true);
        }
        try {
            PackageManager packageManager = this.i.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(this.i.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled")) {
                return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return true;
    }

    private void i() {
        aat.b(!this.p.get(), "FirebaseApp was deleted");
    }

    public final boolean f() {
        return "[DEFAULT]".equals(b());
    }

    private static List<String> j() {
        ArrayList arrayList = new ArrayList();
        synchronized (g) {
            for (cgw cgwVar : a.values()) {
                arrayList.add(cgwVar.b());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        boolean isDeviceProtectedStorage = ContextCompat.isDeviceProtectedStorage(this.i);
        if (isDeviceProtectedStorage) {
            c.a(this.i);
        } else {
            this.l.a(f());
        }
        a(cgw.class, this, b, isDeviceProtectedStorage);
        if (f()) {
            a(cgw.class, this, c, isDeviceProtectedStorage);
            a(Context.class, this.i, d, isDeviceProtectedStorage);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void a(Class<T> cls, T t, Iterable<String> iterable, boolean z) {
        for (String str : iterable) {
            if (z) {
                try {
                } catch (ClassNotFoundException unused) {
                    if (f.contains(str)) {
                        throw new IllegalStateException(str + " is missing, but is required. Check if it has been removed by Proguard.");
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(" is not linked. Skipping initialization.");
                } catch (IllegalAccessException e2) {
                    Log.wtf("FirebaseApp", "Failed to initialize ".concat(String.valueOf(str)), e2);
                } catch (NoSuchMethodException unused2) {
                    throw new IllegalStateException(str + "#getInstance has been removed by Proguard. Add keep rule to prevent it.");
                } catch (InvocationTargetException e3) {
                    Log.wtf("FirebaseApp", "Firebase API initialization failure.", e3);
                }
                if (e.contains(str)) {
                }
            }
            Method method = Class.forName(str).getMethod("getInstance", cls);
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers)) {
                method.invoke(null, t);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cgw$c */
    /* loaded from: classes2.dex */
    public static class c extends BroadcastReceiver {
        private static AtomicReference<c> a = new AtomicReference<>();
        private final Context b;

        private c(Context context) {
            this.b = context;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            synchronized (cgw.g) {
                for (cgw cgwVar : cgw.a.values()) {
                    cgwVar.k();
                }
            }
            this.b.unregisterReceiver(this);
        }

        static /* synthetic */ void a(Context context) {
            if (a.get() == null) {
                c cVar = new c(context);
                if (!a.compareAndSet(null, cVar)) {
                    return;
                }
                context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cgw$a */
    /* loaded from: classes2.dex */
    public static class a implements vp.a {
        private static AtomicReference<a> a = new AtomicReference<>();

        private a() {
        }

        @Override // defpackage.vp.a
        public final void a(boolean z) {
            synchronized (cgw.g) {
                Iterator it = new ArrayList(cgw.a.values()).iterator();
                while (it.hasNext()) {
                    cgw cgwVar = (cgw) it.next();
                    if (cgwVar.o.get()) {
                        cgw.c(cgwVar);
                    }
                }
            }
        }

        static /* synthetic */ void a(Context context) {
            if (context.getApplicationContext() instanceof Application) {
                Application application = (Application) context.getApplicationContext();
                if (a.get() != null) {
                    return;
                }
                a aVar = new a();
                if (!a.compareAndSet(null, aVar)) {
                    return;
                }
                vp.a(application);
                vp.a().a(aVar);
            }
        }
    }

    /* renamed from: cgw$b */
    /* loaded from: classes2.dex */
    static class b implements Executor {
        private static final Handler a = new Handler(Looper.getMainLooper());

        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            a.post(runnable);
        }
    }

    static /* synthetic */ void c(cgw cgwVar) {
        Iterator<Object> it = cgwVar.r.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
