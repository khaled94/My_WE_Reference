package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import defpackage.na;
import defpackage.ng;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u000fH\u0002J\b\u0010\u001a\u001a\u00020\u000fH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/facebook/appevents/aam/MetadataViewObserver;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "activityWeakReference", "Ljava/lang/ref/WeakReference;", "isTracking", "Ljava/util/concurrent/atomic/AtomicBoolean;", "processedText", "", "", "uiThreadHandler", "Landroid/os/Handler;", "onGlobalFocusChanged", "", "oldView", "Landroid/view/View;", "newView", "process", "view", "processEditText", "runOnUIThread", "runnable", "Ljava/lang/Runnable;", "startTracking", "stopTracking", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: nh  reason: default package */
/* loaded from: classes2.dex */
public final class nh implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public static final a a = new a((byte) 0);
    private static final Map<Integer, nh> f = new HashMap();
    private final Set<String> b;
    private final Handler c;
    private final WeakReference<Activity> d;
    private final AtomicBoolean e;

    private nh(Activity activity) {
        this.b = new LinkedHashSet();
        this.c = new Handler(Looper.getMainLooper());
        this.d = new WeakReference<>(activity);
        this.e = new AtomicBoolean(false);
    }

    public /* synthetic */ nh(Activity activity, byte b2) {
        this(activity);
    }

    public static final /* synthetic */ Map a() {
        if (qx.a(nh.class)) {
            return null;
        }
        try {
            return f;
        } catch (Throwable th) {
            qx.a(th, nh.class);
            return null;
        }
    }

    public static final /* synthetic */ void a(nh nhVar) {
        View a2;
        if (qx.a(nh.class)) {
            return;
        }
        try {
            if (qx.a(nhVar) || nhVar.e.getAndSet(true) || (a2 = of.a(nhVar.d.get())) == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = a2.getViewTreeObserver();
            dqc.b(viewTreeObserver, "observer");
            if (!viewTreeObserver.isAlive()) {
                return;
            }
            viewTreeObserver.addOnGlobalFocusChangeListener(nhVar);
        } catch (Throwable th) {
            qx.a(th, nh.class);
        }
    }

    public static final /* synthetic */ void a(nh nhVar, View view) {
        if (qx.a(nh.class)) {
            return;
        }
        try {
            if (qx.a(nhVar)) {
                return;
            }
            if (view == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.EditText");
            }
            String obj = ((EditText) view).getText().toString();
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            String obj2 = dsg.b((CharSequence) obj).toString();
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = obj2.toLowerCase();
            dqc.b(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (!(lowerCase.length() == 0) && !nhVar.b.contains(lowerCase) && lowerCase.length() <= 100) {
                nhVar.b.add(lowerCase);
                HashMap hashMap = new HashMap();
                List<String> a2 = nf.a(view);
                List<String> list = null;
                ng.a aVar = ng.a;
                for (ng ngVar : ng.a.a()) {
                    String a3 = dqc.a((Object) "r2", (Object) ngVar.b()) ? new dsf("[^\\d.]").a(lowerCase, "") : lowerCase;
                    if (!(ngVar.c().length() > 0) || nf.a(a3, ngVar.c())) {
                        if (nf.a(a2, ngVar.a())) {
                            a.b(hashMap, ngVar.b(), a3);
                        } else {
                            if (list == null) {
                                list = nf.b(view);
                            }
                            if (nf.a(list, ngVar.a())) {
                                a.b(hashMap, ngVar.b(), a3);
                            }
                        }
                    }
                }
                na.a aVar2 = na.b;
                dqc.d(hashMap, "ud");
                nd.a(hashMap);
            }
        } catch (Throwable th) {
            qx.a(th, nh.class);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (qx.a(this)) {
            return;
        }
        if (view != null) {
            try {
                a(view);
            } catch (Throwable th) {
                qx.a(th, this);
                return;
            }
        }
        if (view2 == null) {
            return;
        }
        a(view2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: nh$b */
    /* loaded from: classes2.dex */
    public static final class b implements Runnable {
        final /* synthetic */ View b;

        b(View view) {
            this.b = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                if (!(this.b instanceof EditText)) {
                    return;
                }
                nh.a(nh.this, this.b);
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    private final void a(View view) {
        if (qx.a(this)) {
            return;
        }
        try {
            a(new b(view));
        } catch (Throwable th) {
            qx.a(th, this);
        }
    }

    private final void a(Runnable runnable) {
        if (qx.a(this)) {
            return;
        }
        try {
            Thread currentThread = Thread.currentThread();
            Looper mainLooper = Looper.getMainLooper();
            dqc.b(mainLooper, "Looper.getMainLooper()");
            if (currentThread == mainLooper.getThread()) {
                runnable.run();
            } else {
                this.c.post(runnable);
            }
        } catch (Throwable th) {
            qx.a(th, this);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J,\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/facebook/appevents/aam/MetadataViewObserver$Companion;", "", "()V", "MAX_TEXT_LENGTH", "", "observers", "", "Lcom/facebook/appevents/aam/MetadataViewObserver;", "preNormalize", "", "key", "value", "putUserData", "", "userData", "startTrackingActivity", "activity", "Landroid/app/Activity;", "stopTrackingActivity", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: nh$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
            if (r4.equals("r5") != false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
            if (r4.equals("r4") != false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
            r5 = new defpackage.dsf("[^a-z]+").a(r5, "");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void b(java.util.Map<java.lang.String, java.lang.String> r3, java.lang.String r4, java.lang.String r5) {
            /*
                int r0 = r4.hashCode()
                switch(r0) {
                    case 3585: goto L61;
                    case 3586: goto L49;
                    case 3587: goto L40;
                    case 3588: goto L9;
                    default: goto L7;
                }
            L7:
                goto L86
            L9:
                java.lang.String r0 = "r6"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L86
                r0 = r5
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                java.lang.String r1 = "-"
                r2 = r1
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r2 = defpackage.dsg.a(r0, r2)
                if (r2 == 0) goto L86
                dsf r5 = new dsf
                r5.<init>(r1)
                java.util.List r5 = r5.b(r0)
                java.util.Collection r5 = (java.util.Collection) r5
                r0 = 0
                java.lang.String[] r1 = new java.lang.String[r0]
                java.lang.Object[] r5 = r5.toArray(r1)
                if (r5 == 0) goto L38
                java.lang.String[] r5 = (java.lang.String[]) r5
                r5 = r5[r0]
                goto L86
            L38:
                java.lang.NullPointerException r3 = new java.lang.NullPointerException
                java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<T>"
                r3.<init>(r4)
                throw r3
            L40:
                java.lang.String r0 = "r5"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L86
                goto L51
            L49:
                java.lang.String r0 = "r4"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L86
            L51:
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                dsf r0 = new dsf
                java.lang.String r1 = "[^a-z]+"
                r0.<init>(r1)
                java.lang.String r1 = ""
                java.lang.String r5 = r0.a(r5, r1)
                goto L86
            L61:
                java.lang.String r0 = "r3"
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L86
                java.lang.String r0 = "m"
                boolean r1 = defpackage.dsg.c(r5, r0)
                if (r1 != 0) goto L85
                java.lang.String r1 = "b"
                boolean r1 = defpackage.dsg.c(r5, r1)
                if (r1 != 0) goto L85
                java.lang.String r1 = "ge"
                boolean r5 = defpackage.dsg.c(r5, r1)
                if (r5 == 0) goto L82
                goto L85
            L82:
                java.lang.String r5 = "f"
                goto L86
            L85:
                r5 = r0
            L86:
                r3.put(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.nh.a.b(java.util.Map, java.lang.String, java.lang.String):void");
        }
    }
}
