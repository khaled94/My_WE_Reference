package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: vp  reason: default package */
/* loaded from: classes2.dex */
public final class vp implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    private static final vp c = new vp();
    final AtomicBoolean a = new AtomicBoolean();
    final AtomicBoolean b = new AtomicBoolean();
    private final ArrayList<a> d = new ArrayList<>();
    private boolean e = false;

    /* renamed from: vp$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(boolean z);
    }

    private vp() {
    }

    public static vp a() {
        return c;
    }

    public static void a(Application application) {
        synchronized (c) {
            vp vpVar = c;
            if (!vpVar.e) {
                application.registerActivityLifecycleCallbacks(vpVar);
                application.registerComponentCallbacks(c);
                c.e = true;
            }
        }
    }

    private final void a(boolean z) {
        synchronized (c) {
            Iterator<a> it = this.d.iterator();
            while (it.hasNext()) {
                it.next().a(z);
            }
        }
    }

    public final void a(a aVar) {
        synchronized (c) {
            this.d.add(aVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.a.compareAndSet(true, false);
        this.b.set(true);
        if (compareAndSet) {
            a(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.a.compareAndSet(true, false);
        this.b.set(true);
        if (compareAndSet) {
            a(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i != 20 || !this.a.compareAndSet(false, true)) {
            return;
        }
        this.b.set(true);
        a(true);
    }
}
