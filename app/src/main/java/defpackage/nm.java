package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.view.View;
import androidx.core.app.NotificationCompat;
import defpackage.lk;
import defpackage.lz;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u0012\u001a\u00020\u000eJ\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\nH\u0002J\u0006\u0010\u0015\u001a\u00020\u000eR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/facebook/appevents/codeless/ViewIndexer;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "activityReference", "Ljava/lang/ref/WeakReference;", "indexingTimer", "Ljava/util/Timer;", "previousDigest", "", "uiThreadHandler", "Landroid/os/Handler;", "processRequest", "", "request", "Lcom/facebook/GraphRequest;", "currentDigest", "schedule", "sendToServer", "tree", "unschedule", "Companion", "ScreenshotTaker", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: nm  reason: default package */
/* loaded from: classes2.dex */
public final class nm {
    static final String d;
    public static final a e = new a((byte) 0);
    private static nm g;
    final WeakReference<Activity> a;
    Timer b;
    String c = null;
    private final Handler f = new Handler(Looper.getMainLooper());

    public nm(Activity activity) {
        dqc.d(activity, "activity");
        this.a = new WeakReference<>(activity);
        g = this;
    }

    public static final /* synthetic */ WeakReference a(nm nmVar) {
        if (qx.a(nm.class)) {
            return null;
        }
        try {
            return nmVar.a;
        } catch (Throwable th) {
            qx.a(th, nm.class);
            return null;
        }
    }

    public static final /* synthetic */ void a(nm nmVar, String str) {
        if (qx.a(nm.class)) {
            return;
        }
        try {
            if (qx.a(nmVar)) {
                return;
            }
            ly.a().execute(new e(str));
        } catch (Throwable th) {
            qx.a(th, nm.class);
        }
    }

    public static final /* synthetic */ void a(nm nmVar, Timer timer) {
        if (qx.a(nm.class)) {
            return;
        }
        try {
            nmVar.b = timer;
        } catch (Throwable th) {
            qx.a(th, nm.class);
        }
    }

    public static final /* synthetic */ Handler b(nm nmVar) {
        if (qx.a(nm.class)) {
            return null;
        }
        try {
            return nmVar.f;
        } catch (Throwable th) {
            qx.a(th, nm.class);
            return null;
        }
    }

    public static final /* synthetic */ String b() {
        if (qx.a(nm.class)) {
            return null;
        }
        try {
            return d;
        } catch (Throwable th) {
            qx.a(th, nm.class);
            return null;
        }
    }

    public static final /* synthetic */ Timer c(nm nmVar) {
        if (qx.a(nm.class)) {
            return null;
        }
        try {
            return nmVar.b;
        } catch (Throwable th) {
            qx.a(th, nm.class);
            return null;
        }
    }

    public static final /* synthetic */ String d(nm nmVar) {
        if (qx.a(nm.class)) {
            return null;
        }
        try {
            return nmVar.c;
        } catch (Throwable th) {
            qx.a(th, nm.class);
            return null;
        }
    }

    public static final /* synthetic */ void e(nm nmVar) {
        if (qx.a(nm.class)) {
            return;
        }
        try {
            nmVar.c = null;
        } catch (Throwable th) {
            qx.a(th, nm.class);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/facebook/appevents/codeless/ViewIndexer$schedule$indexingTask$1", "Ljava/util/TimerTask;", "run", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: nm$d */
    /* loaded from: classes2.dex */
    public static final class d extends TimerTask {
        d() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            try {
                Activity activity = (Activity) nm.a(nm.this).get();
                View a = of.a(activity);
                if (activity != null && a != null) {
                    String simpleName = activity.getClass().getSimpleName();
                    dqc.b(simpleName, "activity.javaClass.simpleName");
                    if (!nj.d()) {
                        return;
                    }
                    if (qa.b()) {
                        ns.a();
                        return;
                    }
                    FutureTask futureTask = new FutureTask(new b(a));
                    nm.b(nm.this).post(futureTask);
                    String str = "";
                    try {
                        str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                    } catch (Exception unused) {
                        nm.b();
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("screenname", simpleName);
                        jSONObject.put("screenshot", str);
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(nt.c(a));
                        jSONObject.put("view", jSONArray);
                    } catch (JSONException unused2) {
                        nm.b();
                    }
                    String jSONObject2 = jSONObject.toString();
                    dqc.b(jSONObject2, "viewTree.toString()");
                    nm.a(nm.this, jSONObject2);
                }
            } catch (Exception unused3) {
                nm.b();
            }
        }
    }

    public final void a() {
        if (qx.a(this)) {
            return;
        }
        try {
            try {
                ly.a().execute(new c(new d()));
            } catch (RejectedExecutionException unused) {
            }
        } catch (Throwable th) {
            qx.a(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: nm$c */
    /* loaded from: classes2.dex */
    public static final class c implements Runnable {
        final /* synthetic */ TimerTask b;

        c(TimerTask timerTask) {
            this.b = timerTask;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                try {
                    Timer c = nm.c(nm.this);
                    if (c != null) {
                        c.cancel();
                    }
                    nm.e(nm.this);
                    Timer timer = new Timer();
                    timer.scheduleAtFixedRate(this.b, 0L, 1000L);
                    nm.a(nm.this, timer);
                } catch (Exception unused) {
                    nm.b();
                }
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: nm$e */
    /* loaded from: classes2.dex */
    public static final class e implements Runnable {
        final /* synthetic */ String b;

        e(String str) {
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                String b = qi.b(this.b);
                lk.b bVar = lk.l;
                lk a = lk.b.a();
                if (b != null && dqc.a((Object) b, (Object) nm.d(nm.this))) {
                    return;
                }
                a aVar = nm.e;
                String str = this.b;
                String m = ly.m();
                dqc.d("app_indexing", "requestType");
                lz lzVar = null;
                if (str != null) {
                    lz.c cVar = lz.k;
                    dqi dqiVar = dqi.a;
                    String format = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{m}, 1));
                    dqc.b(format, "java.lang.String.format(locale, format, *args)");
                    lzVar = lz.c.a(a, format, (JSONObject) null, (lz.b) null);
                    Bundle bundle = lzVar.d;
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    bundle.putString("tree", str);
                    bundle.putString("app_version", of.d());
                    bundle.putString("platform", "android");
                    bundle.putString("request_type", "app_indexing");
                    if (dqc.a((Object) "app_indexing", (Object) "app_indexing")) {
                        bundle.putString("device_session_id", nj.c());
                    }
                    lzVar.a(bundle);
                    lzVar.a(a.C0042a.a);
                }
                nm nmVar = nm.this;
                if (qx.a(nmVar) || lzVar == null) {
                    return;
                }
                mc a2 = lz.k.a(lzVar);
                try {
                    JSONObject jSONObject = a2.b;
                    if (jSONObject != null) {
                        if (dqc.a((Object) "true", (Object) jSONObject.optString("success"))) {
                            qc.a.a(mf.APP_EVENTS, nm.d, "Successfully send UI component tree to server");
                            nmVar.c = b;
                        }
                        if (!jSONObject.has("is_app_indexing_enabled")) {
                            return;
                        }
                        nj.a(jSONObject.getBoolean("is_app_indexing_enabled"));
                        return;
                    }
                    new StringBuilder("Error sending UI component tree to Facebook: ").append(a2.c);
                } catch (JSONException unused) {
                }
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/facebook/appevents/codeless/ViewIndexer$ScreenshotTaker;", "Ljava/util/concurrent/Callable;", "", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "Ljava/lang/ref/WeakReference;", NotificationCompat.CATEGORY_CALL, "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: nm$b */
    /* loaded from: classes2.dex */
    static final class b implements Callable<String> {
        private final WeakReference<View> a;

        public b(View view) {
            dqc.d(view, "rootView");
            this.a = new WeakReference<>(view);
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ String call() {
            View view = this.a.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            dqc.b(encodeToString, "Base64.encodeToString(ou…eArray(), Base64.NO_WRAP)");
            return encodeToString;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/facebook/appevents/codeless/ViewIndexer$Companion;", "", "()V", "APP_VERSION_PARAM", "", "PLATFORM_PARAM", "REQUEST_TYPE", "SUCCESS", "TAG", "TREE_PARAM", "instance", "Lcom/facebook/appevents/codeless/ViewIndexer;", "buildAppIndexingRequest", "Lcom/facebook/GraphRequest;", "appIndex", "accessToken", "Lcom/facebook/AccessToken;", "appId", "requestType", "sendToServerUnityInstance", "", "tree", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: nm$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/facebook/GraphResponse;", "onCompleted"}, k = 3, mv = {1, 5, 1})
        /* renamed from: nm$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C0042a implements lz.b {
            public static final C0042a a = new C0042a();

            C0042a() {
            }

            @Override // defpackage.lz.b
            public final void a(mc mcVar) {
                dqc.d(mcVar, "it");
                qc.a.a(mf.APP_EVENTS, nm.b(), "App index sent to FB!");
            }
        }
    }

    static {
        String canonicalName = nm.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        dqc.b(canonicalName, "ViewIndexer::class.java.canonicalName ?: \"\"");
        d = canonicalName;
    }
}
