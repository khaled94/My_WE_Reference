package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import defpackage.lz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u00013B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0004H\u0002J\"\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010!\u001a\u00020\u001fH\u0007J\u001c\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001f0#2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004J\u0017\u0010$\u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0002\u0010%J\u0006\u0010&\u001a\u00020'J\u0012\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0012H\u0007J\u001f\u0010)\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010\u0015H\u0001¢\u0006\u0002\b+J\b\u0010,\u001a\u00020'H\u0002J\u0018\u0010-\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u001fH\u0007J\b\u0010/\u001a\u00020'H\u0007J\u001a\u00100\u001a\u00020'2\b\b\u0002\u0010\u001d\u001a\u00020\u00042\u0006\u00101\u001a\u000202H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001b¨\u00064"}, d2 = {"Lcom/facebook/internal/FetchedAppGateKeepersManager;", "", "()V", "APPLICATION_FIELDS", "", "APPLICATION_GATEKEEPER_CACHE_TIMEOUT", "", "APPLICATION_GATEKEEPER_EDGE", "APPLICATION_GATEKEEPER_FIELD", "APPLICATION_GRAPH_DATA", "APPLICATION_PLATFORM", "APPLICATION_SDK_VERSION", "APP_GATEKEEPERS_PREFS_KEY_FORMAT", "APP_GATEKEEPERS_PREFS_STORE", "APP_PLATFORM", "TAG", "callbacks", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lcom/facebook/internal/FetchedAppGateKeepersManager$Callback;", "fetchedAppGateKeepers", "", "Lorg/json/JSONObject;", "gateKeeperRuntimeCache", "Lcom/facebook/internal/gatekeeper/GateKeeperRuntimeCache;", "isLoading", "Ljava/util/concurrent/atomic/AtomicBoolean;", "timestamp", "Ljava/lang/Long;", "getAppGateKeepersQueryResponse", "applicationId", "getGateKeeperForKey", "", "name", "defaultValue", "getGateKeepersForApplication", "", "isTimestampValid", "(Ljava/lang/Long;)Z", "loadAppGateKeepersAsync", "", "callback", "parseAppGateKeepersFromJSON", "gateKeepersJSON", "parseAppGateKeepersFromJSON$facebook_core_release", "pollCallbacks", "queryAppGateKeepers", "forceRequery", "resetRuntimeGateKeeperCache", "setRuntimeGateKeeper", "gateKeeper", "Lcom/facebook/internal/gatekeeper/GateKeeper;", "Callback", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: pu  reason: default package */
/* loaded from: classes2.dex */
public final class pu {
    public static final pu a = new pu();
    private static final String b = dqg.b(pu.class).b();
    private static final AtomicBoolean c = new AtomicBoolean(false);
    private static final ConcurrentLinkedQueue<a> d = new ConcurrentLinkedQueue<>();
    private static final Map<String, JSONObject> e = new ConcurrentHashMap();
    private static Long f;
    private static qn g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/facebook/internal/FetchedAppGateKeepersManager$Callback;", "", "onCompleted", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: pu$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    private pu() {
    }

    public static final synchronized void a(a aVar) {
        synchronized (pu.class) {
            if (aVar != null) {
                d.add(aVar);
            }
            String m = ly.m();
            Long l = f;
            if ((l != null && System.currentTimeMillis() - l.longValue() < 3600000) && e.containsKey(m)) {
                c();
                return;
            }
            Context k = ly.k();
            dqi dqiVar = dqi.a;
            String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{m}, 1));
            dqc.b(format, "java.lang.String.format(format, *args)");
            if (k == null) {
                return;
            }
            JSONObject jSONObject = null;
            String string = k.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(format, null);
            if (!qi.a(string)) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e2) {
                    qi.a("FacebookSDK", (Exception) e2);
                }
                if (jSONObject != null) {
                    a(m, jSONObject);
                }
            }
            Executor a2 = ly.a();
            if (a2 == null) {
                return;
            }
            if (!c.compareAndSet(false, true)) {
                return;
            }
            a2.execute(new b(m, k, format));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: pu$b */
    /* loaded from: classes2.dex */
    public static final class b implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ Context b;
        final /* synthetic */ String c;

        b(String str, Context context, String str2) {
            this.a = str;
            this.b = context;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                pu puVar = pu.a;
                JSONObject c = pu.c(this.a);
                if (c.length() != 0) {
                    pu.a(this.a, c);
                    this.b.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(this.c, c.toString()).apply();
                    pu puVar2 = pu.a;
                    pu.f = Long.valueOf(System.currentTimeMillis());
                }
                pu puVar3 = pu.a;
                pu.c();
                pu puVar4 = pu.a;
                pu.c.set(false);
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (!d.isEmpty()) {
            a poll = d.poll();
            if (poll != null) {
                handler.post(new c(poll));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: pu$c */
    /* loaded from: classes2.dex */
    public static final class c implements Runnable {
        final /* synthetic */ a a;

        c(a aVar) {
            this.a = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                this.a.a();
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    public static final JSONObject a(String str) {
        dqc.d(str, "applicationId");
        JSONObject c2 = c(str);
        Context k = ly.k();
        dqi dqiVar = dqi.a;
        String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{str}, 1));
        dqc.b(format, "java.lang.String.format(format, *args)");
        k.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(format, c2.toString()).apply();
        return a(str, c2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject c(String str) {
        lz lzVar;
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        bundle.putString("sdk_version", ly.l());
        bundle.putString("fields", "gatekeepers");
        if (qi.a(ly.o())) {
            lz.c cVar = lz.k;
            dqi dqiVar = dqi.a;
            String format = String.format("%s/%s", Arrays.copyOf(new Object[]{str, "mobile_sdk_gk"}, 2));
            dqc.b(format, "java.lang.String.format(format, *args)");
            lzVar = lz.c.a((lk) null, format, (lz.b) null);
            lzVar.h = true;
            lzVar.a(bundle);
        } else {
            lz.c cVar2 = lz.k;
            dqi dqiVar2 = dqi.a;
            String format2 = String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1));
            dqc.b(format2, "java.lang.String.format(format, *args)");
            lzVar = lz.c.a((lk) null, format2, (lz.b) null);
            lzVar.a(bundle);
        }
        JSONObject jSONObject = lz.k.a(lzVar).a;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public static final synchronized JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONArray optJSONArray;
        synchronized (pu.class) {
            dqc.d(str, "applicationId");
            jSONObject2 = e.get(str);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray("data")) == null || (jSONObject3 = optJSONArray.optJSONObject(0)) == null) {
                jSONObject3 = new JSONObject();
            }
            JSONArray optJSONArray2 = jSONObject3.optJSONArray("gatekeepers");
            if (optJSONArray2 == null) {
                optJSONArray2 = new JSONArray();
            }
            int length = optJSONArray2.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject4 = optJSONArray2.getJSONObject(i);
                    jSONObject2.put(jSONObject4.getString("key"), jSONObject4.getBoolean("value"));
                } catch (JSONException e2) {
                    qi.a("FacebookSDK", (Exception) e2);
                }
            }
            e.put(str, jSONObject2);
        }
        return jSONObject2;
    }

    public static final boolean a(String str, String str2, boolean z) {
        HashMap hashMap;
        Boolean bool;
        dqc.d(str, "name");
        List<qm> list = null;
        a((a) null);
        if (str2 == null || !e.containsKey(str2)) {
            hashMap = new HashMap();
        } else {
            qn qnVar = g;
            if (qnVar != null) {
                list = qnVar.a(str2);
            }
            if (list != null) {
                HashMap hashMap2 = new HashMap();
                for (qm qmVar : list) {
                    hashMap2.put(qmVar.a, Boolean.valueOf(qmVar.b));
                }
                hashMap = hashMap2;
            } else {
                HashMap hashMap3 = new HashMap();
                JSONObject jSONObject = e.get(str2);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    dqc.b(next, "key");
                    hashMap3.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
                }
                qn qnVar2 = g;
                if (qnVar2 == null) {
                    qnVar2 = new qn();
                }
                ArrayList arrayList = new ArrayList(hashMap3.size());
                for (Map.Entry entry : hashMap3.entrySet()) {
                    arrayList.add(new qm((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                qnVar2.a(str2, arrayList);
                g = qnVar2;
                hashMap = hashMap3;
            }
        }
        return (hashMap.containsKey(str) && (bool = (Boolean) hashMap.get(str)) != null) ? bool.booleanValue() : z;
    }
}
