package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.pe;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/appevents/suggestedevents/ViewObserver;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "activityWeakReference", "Ljava/lang/ref/WeakReference;", "isTracking", "Ljava/util/concurrent/atomic/AtomicBoolean;", "uiThreadHandler", "Landroid/os/Handler;", "onGlobalLayout", "", "process", "startTracking", "stopTracking", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: pd */
/* loaded from: classes2.dex */
public final class pd implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final a a = new a((byte) 0);
    private static final Map<Integer, pd> e = new HashMap();
    private final WeakReference<Activity> b;
    private final Handler c;
    private final AtomicBoolean d;

    private pd(Activity activity) {
        this.b = new WeakReference<>(activity);
        this.c = new Handler(Looper.getMainLooper());
        this.d = new AtomicBoolean(false);
    }

    public /* synthetic */ pd(Activity activity, byte b2) {
        this(activity);
    }

    public static final /* synthetic */ WeakReference a(pd pdVar) {
        if (qx.a(pd.class)) {
            return null;
        }
        try {
            return pdVar.b;
        } catch (Throwable th) {
            qx.a(th, pd.class);
            return null;
        }
    }

    public static final /* synthetic */ Map a() {
        if (qx.a(pd.class)) {
            return null;
        }
        try {
            return e;
        } catch (Throwable th) {
            qx.a(th, pd.class);
            return null;
        }
    }

    public static final /* synthetic */ void b(pd pdVar) {
        View a2;
        if (qx.a(pd.class)) {
            return;
        }
        try {
            if (qx.a(pdVar) || pdVar.d.getAndSet(true) || (a2 = of.a(pdVar.b.get())) == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = a2.getViewTreeObserver();
            dqc.b(viewTreeObserver, "observer");
            if (!viewTreeObserver.isAlive()) {
                return;
            }
            viewTreeObserver.addOnGlobalLayoutListener(pdVar);
            pdVar.b();
        } catch (Throwable th) {
            qx.a(th, pd.class);
        }
    }

    public static final /* synthetic */ void c(pd pdVar) {
        View a2;
        if (qx.a(pd.class)) {
            return;
        }
        try {
            if (qx.a(pdVar) || !pdVar.d.getAndSet(false) || (a2 = of.a(pdVar.b.get())) == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = a2.getViewTreeObserver();
            dqc.b(viewTreeObserver, "observer");
            if (!viewTreeObserver.isAlive()) {
                return;
            }
            viewTreeObserver.removeOnGlobalLayoutListener(pdVar);
        } catch (Throwable th) {
            qx.a(th, pd.class);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (qx.a(this)) {
            return;
        }
        try {
            b();
        } catch (Throwable th) {
            qx.a(th, this);
        }
    }

    private final void b() {
        if (qx.a(this)) {
            return;
        }
        try {
            b bVar = new b();
            Thread currentThread = Thread.currentThread();
            Looper mainLooper = Looper.getMainLooper();
            dqc.b(mainLooper, "Looper.getMainLooper()");
            if (currentThread == mainLooper.getThread()) {
                bVar.run();
            } else {
                this.c.post(bVar);
            }
        } catch (Throwable th) {
            qx.a(th, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: pd$b */
    /* loaded from: classes2.dex */
    public static final class b implements Runnable {
        b() {
            pd.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                View a = of.a((Activity) pd.a(pd.this).get());
                Activity activity = (Activity) pd.a(pd.this).get();
                if (a != null && activity != null) {
                    for (View view : pb.a(a)) {
                        if (!nr.a(view)) {
                            String b = pb.b(view);
                            if ((b.length() > 0) && b.length() <= 300) {
                                pe.a aVar = pe.a;
                                String localClassName = activity.getLocalClassName();
                                dqc.b(localClassName, "activity.localClassName");
                                dqc.d(view, "hostView");
                                dqc.d(a, "rootView");
                                dqc.d(localClassName, "activityName");
                                int hashCode = view.hashCode();
                                if (!pe.a().contains(Integer.valueOf(hashCode))) {
                                    nt.a(view, new pe(view, a, localClassName, (byte) 0));
                                    pe.a().add(Integer.valueOf(hashCode));
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/appevents/suggestedevents/ViewObserver$Companion;", "", "()V", "MAX_TEXT_LENGTH", "", "observers", "", "Lcom/facebook/appevents/suggestedevents/ViewObserver;", "startTrackingActivity", "", "activity", "Landroid/app/Activity;", "stopTrackingActivity", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: pd$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }
}
