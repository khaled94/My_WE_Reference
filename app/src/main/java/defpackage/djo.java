package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import com.ucare.we.SplashActivity;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.Deque;
import java.util.Locale;

/* renamed from: djo  reason: default package */
/* loaded from: classes2.dex */
public final class djo {
    static String a;
    private static Application c;
    private static boolean e;
    private static boolean f;
    private static boolean g;
    private static final Deque<String> b = new ArrayDeque(50);
    private static boolean d = true;
    private static WeakReference<Activity> h = new WeakReference<>(null);

    public djo(a aVar) {
        f = aVar.b;
        g = aVar.d;
        e = aVar.e;
        a = aVar.c;
        Context context = aVar.a;
        if (context != null) {
            try {
                final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                if (defaultUncaughtExceptionHandler != null && defaultUncaughtExceptionHandler.getClass().getName().startsWith("com.rohitss.uceh")) {
                    return;
                }
                if (defaultUncaughtExceptionHandler != null) {
                    defaultUncaughtExceptionHandler.getClass().getName().startsWith("com.android.internal.os");
                }
                c = (Application) context.getApplicationContext();
                Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: djo.1
                    @Override // java.lang.Thread.UncaughtExceptionHandler
                    public final void uncaughtException(Thread thread, Throwable th) {
                        if (djo.f) {
                            if (!djo.a(djo.c)) {
                                djo.a(djo.c, new Date().getTime());
                                if (!djo.d || djo.e) {
                                    Intent intent = new Intent(djo.c, SplashActivity.class);
                                    intent.setFlags(268468224);
                                    djo.c.startActivity(intent);
                                } else {
                                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                                    if (uncaughtExceptionHandler != null) {
                                        uncaughtExceptionHandler.uncaughtException(thread, th);
                                        return;
                                    }
                                }
                            } else {
                                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = defaultUncaughtExceptionHandler;
                                if (uncaughtExceptionHandler2 != null) {
                                    uncaughtExceptionHandler2.uncaughtException(thread, th);
                                    return;
                                }
                            }
                            Activity activity = (Activity) djo.h.get();
                            if (activity != null) {
                                activity.finish();
                                djo.h.clear();
                            }
                            djo.f();
                            return;
                        }
                        Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = defaultUncaughtExceptionHandler;
                        if (uncaughtExceptionHandler3 == null) {
                            return;
                        }
                        uncaughtExceptionHandler3.uncaughtException(thread, th);
                    }
                });
                c.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: djo.2
                    final DateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
                    int b = 0;

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                        if (activity.getClass() != SplashActivity.class) {
                            WeakReference unused = djo.h = new WeakReference(activity);
                        }
                        if (djo.g) {
                            Deque deque = djo.b;
                            deque.add(this.a.format(new Date()) + ": " + activity.getClass().getSimpleName() + " created\n");
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStarted(Activity activity) {
                        boolean z = true;
                        int i = this.b + 1;
                        this.b = i;
                        if (i != 0) {
                            z = false;
                        }
                        boolean unused = djo.d = z;
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityResumed(Activity activity) {
                        if (djo.g) {
                            Deque deque = djo.b;
                            deque.add(this.a.format(new Date()) + ": " + activity.getClass().getSimpleName() + " resumed\n");
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPaused(Activity activity) {
                        if (djo.g) {
                            Deque deque = djo.b;
                            deque.add(this.a.format(new Date()) + ": " + activity.getClass().getSimpleName() + " paused\n");
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStopped(Activity activity) {
                        boolean z = true;
                        int i = this.b - 1;
                        this.b = i;
                        if (i != 0) {
                            z = false;
                        }
                        boolean unused = djo.d = z;
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityDestroyed(Activity activity) {
                        if (djo.g) {
                            Deque deque = djo.b;
                            deque.add(this.a.format(new Date()) + ": " + activity.getClass().getSimpleName() + " destroyed\n");
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: djo$a */
    /* loaded from: classes2.dex */
    public static class a {
        Context a;
        String c;
        boolean b = true;
        boolean d = false;
        boolean e = true;

        public a(Context context) {
            this.a = context;
        }
    }

    static /* synthetic */ boolean a(Context context) {
        long j = context.getSharedPreferences("uceh_preferences", 0).getLong("last_crash_timestamp", -1L);
        long time = new Date().getTime();
        return j <= time && time - j < 3000;
    }

    static /* synthetic */ void a(Context context, long j) {
        context.getSharedPreferences("uceh_preferences", 0).edit().putLong("last_crash_timestamp", j).commit();
    }

    static /* synthetic */ void f() {
        Process.killProcess(Process.myPid());
        System.exit(10);
    }
}
