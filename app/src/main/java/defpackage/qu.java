package defpackage;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import defpackage.qp;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/internal/instrument/anrreport/ANRDetector;", "", "()V", "DETECTION_INTERVAL_IN_MS", "", "anrDetectorRunnable", "Ljava/lang/Runnable;", "myUid", "previousStackTrace", "", "scheduledExecutorService", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "checkProcessError", "", "am", "Landroid/app/ActivityManager;", "start", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: qu  reason: default package */
/* loaded from: classes2.dex */
public final class qu {
    public static final qu a = new qu();
    private static final int b = Process.myUid();
    private static final ScheduledExecutorService c = Executors.newSingleThreadScheduledExecutor();
    private static String d = "";
    private static final Runnable e = a.a;

    private qu() {
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: qu$a */
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
                Object systemService = ly.k().getSystemService("activity");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
                }
                qu.a((ActivityManager) systemService);
            } catch (Exception unused) {
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    public static final void a(ActivityManager activityManager) {
        if (!qx.a(qu.class) && activityManager != null) {
            try {
                List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
                if (processesInErrorState == null) {
                    return;
                }
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == b) {
                        Looper mainLooper = Looper.getMainLooper();
                        dqc.b(mainLooper, "Looper.getMainLooper()");
                        Thread thread = mainLooper.getThread();
                        dqc.b(thread, "Looper.getMainLooper().thread");
                        String a2 = qt.a(thread);
                        if (!dqc.a((Object) a2, (Object) d) && qt.b(thread)) {
                            d = a2;
                            qp.a.a(processErrorStateInfo.shortMsg, a2).b();
                        }
                    }
                }
            } catch (Throwable th) {
                qx.a(th, qu.class);
            }
        }
    }

    public static final void a() {
        if (qx.a(qu.class)) {
            return;
        }
        try {
            c.scheduleAtFixedRate(e, 0L, 500L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            qx.a(th, qu.class);
        }
    }
}
