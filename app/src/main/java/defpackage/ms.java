package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import defpackage.lz;
import defpackage.mu;
import defpackage.mv;
import defpackage.na;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J*\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190!2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u001fH\u0007J\u0010\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%H\u0007J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%H\u0007J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00150(H\u0007J0\u0010)\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\b\u0010-\u001a\u00020\u0013H\u0007J\u001a\u0010.\u001a\u0004\u0018\u00010\u001f2\u0006\u0010$\u001a\u00020%2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/facebook/appevents/AppEventQueue;", "", "()V", "FLUSH_PERIOD_IN_SECONDS", "", "NO_CONNECTIVITY_ERROR_CODE", "NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER", "TAG", "", "appEventCollection", "Lcom/facebook/appevents/AppEventCollection;", "flushRunnable", "Ljava/lang/Runnable;", "scheduledFuture", "Ljava/util/concurrent/ScheduledFuture;", "singleThreadExecutor", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "add", "", "accessTokenAppId", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "appEvent", "Lcom/facebook/appevents/AppEvent;", "buildRequestForSession", "Lcom/facebook/GraphRequest;", "appEvents", "Lcom/facebook/appevents/SessionEventsState;", "limitEventUsage", "", "flushState", "Lcom/facebook/appevents/FlushStatistics;", "buildRequests", "", "flushResults", "flush", "reason", "Lcom/facebook/appevents/FlushReason;", "flushAndWait", "getKeySet", "", "handleResponse", "request", "response", "Lcom/facebook/GraphResponse;", "persistToDisk", "sendEventsToServer", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: ms  reason: default package */
/* loaded from: classes2.dex */
public final class ms {
    private static final String b;
    private static ScheduledFuture<?> f;
    public static final ms a = new ms();
    private static final int c = 100;
    private static volatile mr d = new mr();
    private static final ScheduledExecutorService e = Executors.newSingleThreadScheduledExecutor();
    private static final Runnable g = d.a;

    static {
        String name = ms.class.getName();
        dqc.b(name, "AppEventQueue::class.java.name");
        b = name;
    }

    private ms() {
    }

    public static final /* synthetic */ void a(ScheduledFuture scheduledFuture) {
        if (qx.a(ms.class)) {
            return;
        }
        try {
            f = scheduledFuture;
        } catch (Throwable th) {
            qx.a(th, ms.class);
        }
    }

    public static final /* synthetic */ void a(mr mrVar) {
        if (qx.a(ms.class)) {
            return;
        }
        try {
            d = mrVar;
        } catch (Throwable th) {
            qx.a(th, ms.class);
        }
    }

    public static final /* synthetic */ mr c() {
        if (qx.a(ms.class)) {
            return null;
        }
        try {
            return d;
        } catch (Throwable th) {
            qx.a(th, ms.class);
            return null;
        }
    }

    public static final /* synthetic */ int d() {
        if (qx.a(ms.class)) {
            return 0;
        }
        try {
            return c;
        } catch (Throwable th) {
            qx.a(th, ms.class);
            return 0;
        }
    }

    public static final /* synthetic */ ScheduledFuture e() {
        if (qx.a(ms.class)) {
            return null;
        }
        try {
            return f;
        } catch (Throwable th) {
            qx.a(th, ms.class);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledExecutorService f() {
        if (qx.a(ms.class)) {
            return null;
        }
        try {
            return e;
        } catch (Throwable th) {
            qx.a(th, ms.class);
            return null;
        }
    }

    public static final /* synthetic */ Runnable g() {
        if (qx.a(ms.class)) {
            return null;
        }
        try {
            return g;
        } catch (Throwable th) {
            qx.a(th, ms.class);
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: ms$d */
    /* loaded from: classes2.dex */
    static final class d implements Runnable {
        public static final d a = new d();

        d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                ms msVar = ms.a;
                ms.a((ScheduledFuture) null);
                mu.a aVar = mu.b;
                mv.a aVar2 = mv.b;
                if (mv.a.a() == mu.b.b) {
                    return;
                }
                ms.b(mx.TIMER);
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: ms$f */
    /* loaded from: classes2.dex */
    public static final class f implements Runnable {
        public static final f a = new f();

        f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                ms msVar = ms.a;
                mt.a(ms.c());
                ms msVar2 = ms.a;
                ms.a(new mr());
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    public static final void a() {
        if (qx.a(ms.class)) {
            return;
        }
        try {
            e.execute(f.a);
        } catch (Throwable th) {
            qx.a(th, ms.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: ms$c */
    /* loaded from: classes2.dex */
    public static final class c implements Runnable {
        final /* synthetic */ mx a;

        c(mx mxVar) {
            this.a = mxVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                ms.b(this.a);
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    public static final void a(mx mxVar) {
        if (qx.a(ms.class)) {
            return;
        }
        try {
            dqc.d(mxVar, "reason");
            e.execute(new c(mxVar));
        } catch (Throwable th) {
            qx.a(th, ms.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: ms$a */
    /* loaded from: classes2.dex */
    public static final class a implements Runnable {
        final /* synthetic */ mo a;
        final /* synthetic */ mq b;

        a(mo moVar, mq mqVar) {
            this.a = moVar;
            this.b = mqVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                ms msVar = ms.a;
                ms.c().a(this.a, this.b);
                mu.a aVar = mu.b;
                mv.a aVar2 = mv.b;
                if (mv.a.a() != mu.b.b) {
                    ms msVar2 = ms.a;
                    int b = ms.c().b();
                    ms msVar3 = ms.a;
                    if (b > ms.d()) {
                        ms.b(mx.EVENT_THRESHOLD);
                        return;
                    }
                }
                ms msVar4 = ms.a;
                if (ms.e() != null) {
                    return;
                }
                ms msVar5 = ms.a;
                ScheduledExecutorService f = ms.f();
                ms msVar6 = ms.a;
                ms.a(f.schedule(ms.g(), 15L, TimeUnit.SECONDS));
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    public static final void a(mo moVar, mq mqVar) {
        if (qx.a(ms.class)) {
            return;
        }
        try {
            dqc.d(moVar, "accessTokenAppId");
            dqc.d(mqVar, "appEvent");
            e.execute(new a(moVar, mqVar));
        } catch (Throwable th) {
            qx.a(th, ms.class);
        }
    }

    public static final Set<mo> b() {
        if (qx.a(ms.class)) {
            return null;
        }
        try {
            return d.a();
        } catch (Throwable th) {
            qx.a(th, ms.class);
            return null;
        }
    }

    public static final void b(mx mxVar) {
        if (qx.a(ms.class)) {
            return;
        }
        try {
            dqc.d(mxVar, "reason");
            d.a(mt.a());
            try {
                mz a2 = a(mxVar, d);
                if (a2 == null) {
                    return;
                }
                Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", a2.a);
                intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", a2.b);
                LocalBroadcastManager.getInstance(ly.k()).sendBroadcast(intent);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            qx.a(th, ms.class);
        }
    }

    private static mz a(mx mxVar, mr mrVar) {
        if (qx.a(ms.class)) {
            return null;
        }
        try {
            dqc.d(mxVar, "reason");
            dqc.d(mrVar, "appEventCollection");
            mz mzVar = new mz();
            List<lz> a2 = a(mrVar, mzVar);
            if (!(!a2.isEmpty())) {
                return null;
            }
            qc.a.a(mf.APP_EVENTS, b, "Flushing %d events due to %s.", Integer.valueOf(mzVar.a), mxVar.toString());
            for (lz lzVar : a2) {
                lz.k.a(lzVar);
            }
            return mzVar;
        } catch (Throwable th) {
            qx.a(th, ms.class);
            return null;
        }
    }

    private static List<lz> a(mr mrVar, mz mzVar) {
        if (qx.a(ms.class)) {
            return null;
        }
        try {
            dqc.d(mrVar, "appEventCollection");
            dqc.d(mzVar, "flushResults");
            boolean b2 = ly.b(ly.k());
            ArrayList arrayList = new ArrayList();
            for (mo moVar : mrVar.a()) {
                nc a2 = mrVar.a(moVar);
                if (a2 != null) {
                    lz a3 = a(moVar, a2, b2, mzVar);
                    if (a3 != null) {
                        arrayList.add(a3);
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
            return arrayList;
        } catch (Throwable th) {
            qx.a(th, ms.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "response", "Lcom/facebook/GraphResponse;", "onCompleted"}, k = 3, mv = {1, 5, 1})
    /* renamed from: ms$b */
    /* loaded from: classes2.dex */
    public static final class b implements lz.b {
        final /* synthetic */ mo a;
        final /* synthetic */ lz b;
        final /* synthetic */ nc c;
        final /* synthetic */ mz d;

        b(mo moVar, lz lzVar, nc ncVar, mz mzVar) {
            this.a = moVar;
            this.b = lzVar;
            this.c = ncVar;
            this.d = mzVar;
        }

        @Override // defpackage.lz.b
        public final void a(mc mcVar) {
            dqc.d(mcVar, "response");
            ms.a(this.a, this.b, mcVar, this.c, this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: ms$e */
    /* loaded from: classes2.dex */
    public static final class e implements Runnable {
        final /* synthetic */ mo a;
        final /* synthetic */ nc b;

        e(mo moVar, nc ncVar) {
            this.a = moVar;
            this.b = ncVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                mt.a(this.a, this.b);
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    private static lz a(mo moVar, nc ncVar, boolean z, mz mzVar) {
        if (qx.a(ms.class)) {
            return null;
        }
        try {
            dqc.d(moVar, "accessTokenAppId");
            dqc.d(ncVar, "appEvents");
            dqc.d(mzVar, "flushState");
            String str = moVar.b;
            boolean z2 = false;
            pv a2 = pw.a(str, false);
            lz.c cVar = lz.k;
            dqi dqiVar = dqi.a;
            String format = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
            dqc.b(format, "java.lang.String.format(format, *args)");
            lz a3 = lz.c.a((lk) null, format, (JSONObject) null, (lz.b) null);
            a3.i = true;
            Bundle bundle = a3.d;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("access_token", moVar.a);
            na.a aVar = na.b;
            mv.a aVar2 = mv.b;
            String b2 = mv.a.b();
            if (b2 != null) {
                bundle.putString("device_token", b2);
            }
            mv.a aVar3 = mv.b;
            pz.a(new mv.a.C0040a());
            String string = ly.k().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
            if (string != null) {
                bundle.putString("install_referrer", string);
            }
            a3.a(bundle);
            if (a2 != null) {
                z2 = a2.a;
            }
            int a4 = ncVar.a(a3, ly.k(), z2, z);
            if (a4 == 0) {
                return null;
            }
            mzVar.a += a4;
            a3.a(new b(moVar, a3, ncVar, mzVar));
            return a3;
        } catch (Throwable th) {
            qx.a(th, ms.class);
            return null;
        }
    }

    public static final void a(mo moVar, lz lzVar, mc mcVar, nc ncVar, mz mzVar) {
        String str;
        if (qx.a(ms.class)) {
            return;
        }
        try {
            dqc.d(moVar, "accessTokenAppId");
            dqc.d(lzVar, "request");
            dqc.d(mcVar, "response");
            dqc.d(ncVar, "appEvents");
            dqc.d(mzVar, "flushState");
            lx lxVar = mcVar.c;
            String str2 = "Success";
            my myVar = my.SUCCESS;
            boolean z = true;
            if (lxVar != null) {
                if (lxVar.c == -1) {
                    str2 = "Failed: No Connectivity";
                    myVar = my.NO_CONNECTIVITY;
                } else {
                    dqi dqiVar = dqi.a;
                    str2 = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{mcVar.toString(), lxVar.toString()}, 2));
                    dqc.b(str2, "java.lang.String.format(format, *args)");
                    myVar = my.SERVER_ERROR;
                }
            }
            if (ly.a(mf.APP_EVENTS)) {
                try {
                    str = new JSONArray((String) lzVar.e).toString(2);
                    dqc.b(str, "jsonArray.toString(2)");
                } catch (JSONException unused) {
                    str = "<Can't encode events for debug logging>";
                }
                qc.a.a(mf.APP_EVENTS, b, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(lzVar.c), str2, str);
            }
            if (lxVar == null) {
                z = false;
            }
            ncVar.a(z);
            if (myVar == my.NO_CONNECTIVITY) {
                ly.a().execute(new e(moVar, ncVar));
            }
            if (myVar == my.SUCCESS || mzVar.b == my.NO_CONNECTIVITY) {
                return;
            }
            dqc.d(myVar, "<set-?>");
            mzVar.b = myVar;
        } catch (Throwable th) {
            qx.a(th, ms.class);
        }
    }
}
