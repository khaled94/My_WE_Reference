package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import defpackage.lz;
import defpackage.oj;
import defpackage.op;
import defpackage.pr;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u000289B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001aH\u0007J\b\u0010\u001e\u001a\u00020\u001aH\u0002J\n\u0010\u001f\u001a\u0004\u0018\u00010\u001cH\u0002J\u0012\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#H\u0007J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&H\u0002J\u0014\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0002J\u0010\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u001cH\u0002J9\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010.2\u0006\u0010\"\u001a\u00020#2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020(0.2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040.H\u0007¢\u0006\u0002\u00101J%\u00102\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010.2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020(H\u0002¢\u0006\u0002\u00106J%\u00107\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010.2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020(H\u0002¢\u0006\u0002\u00106R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u001c\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/facebook/appevents/ml/ModelManager;", "", "()V", "ASSET_URI_KEY", "", "CACHE_KEY_MODELS", "CACHE_KEY_REQUEST_TIMESTAMP", "MODEL_ASSERT_STORE", "MODEL_REQUEST_INTERVAL_MILLISECONDS", "", "MTML_INTEGRITY_DETECT_PREDICTION", "", "MTML_SUGGESTED_EVENTS_PREDICTION", "MTML_USE_CASE", "RULES_URI_KEY", "SDK_MODEL_ASSET", "THRESHOLD_KEY", "USE_CASE_KEY", "VERSION_ID_KEY", "isLocaleEnglish", "", "()Z", "taskHandlers", "", "Lcom/facebook/appevents/ml/ModelManager$TaskHandler;", "addModels", "", "models", "Lorg/json/JSONObject;", "enable", "enableMTML", "fetchModels", "getRuleFile", "Ljava/io/File;", "task", "Lcom/facebook/appevents/ml/ModelManager$Task;", "isValidTimestamp", "timestamp", "", "parseJsonArray", "", "jsonArray", "Lorg/json/JSONArray;", "parseRawJsonObject", "jsonObject", "predict", "", "denses", "texts", "(Lcom/facebook/appevents/ml/ModelManager$Task;[[F[Ljava/lang/String;)[Ljava/lang/String;", "processIntegrityDetectionResult", "res", "Lcom/facebook/appevents/ml/MTensor;", "thresholds", "(Lcom/facebook/appevents/ml/MTensor;[F)[Ljava/lang/String;", "processSuggestedEventResult", "Task", "TaskHandler", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: oq  reason: default package */
/* loaded from: classes2.dex */
public final class oq {
    public static final oq a = new oq();
    private static final Map<String, b> b = new ConcurrentHashMap();
    private static final List<String> c = dmq.b("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");
    private static final List<String> d = dmq.b("none", "address", "health");

    private oq() {
    }

    public static final /* synthetic */ JSONObject a(oq oqVar) {
        if (qx.a(oq.class)) {
            return null;
        }
        try {
            return oqVar.b();
        } catch (Throwable th) {
            qx.a(th, oq.class);
            return null;
        }
    }

    public static final /* synthetic */ void a(oq oqVar, JSONObject jSONObject) {
        if (qx.a(oq.class)) {
            return;
        }
        try {
            if (qx.a(oqVar)) {
                return;
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    b.a aVar = b.i;
                    b a2 = b.a.a(jSONObject.getJSONObject(keys.next()));
                    if (a2 != null) {
                        b.put(a2.d, a2);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th) {
            qx.a(th, oq.class);
        }
    }

    public static final /* synthetic */ boolean a(oq oqVar, long j) {
        if (qx.a(oq.class)) {
            return false;
        }
        try {
            return oqVar.a(j);
        } catch (Throwable th) {
            qx.a(th, oq.class);
            return false;
        }
    }

    public static final /* synthetic */ float[] a(oq oqVar, JSONArray jSONArray) {
        if (qx.a(oq.class)) {
            return null;
        }
        try {
            return oqVar.a(jSONArray);
        } catch (Throwable th) {
            qx.a(th, oq.class);
            return null;
        }
    }

    public static final /* synthetic */ void b(oq oqVar) {
        if (qx.a(oq.class)) {
            return;
        }
        try {
            if (qx.a(oqVar)) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            String str = null;
            int i = 0;
            for (Map.Entry<String, b> entry : b.entrySet()) {
                String key = entry.getKey();
                b value = entry.getValue();
                if (dqc.a((Object) key, (Object) a.MTML_APP_EVENT_PREDICTION.toUseCase())) {
                    str = value.e;
                    i = Math.max(i, value.g);
                    if (pr.a(pr.b.SuggestedEvents) && oqVar.c()) {
                        value.c = d.a;
                        arrayList.add(value);
                    }
                }
                if (dqc.a((Object) key, (Object) a.MTML_INTEGRITY_DETECT.toUseCase())) {
                    String str2 = value.e;
                    int max = Math.max(i, value.g);
                    if (pr.a(pr.b.IntelligentIntegrity)) {
                        value.c = e.a;
                        arrayList.add(value);
                    }
                    str = str2;
                    i = max;
                }
            }
            if (str == null || i <= 0 || arrayList.isEmpty()) {
                return;
            }
            b bVar = new b("MTML", str, null, i, null);
            b.a aVar = b.i;
            dqc.d(bVar, "master");
            dqc.d(arrayList, "slaves");
            b.a.a(bVar.d, bVar.g);
            b.a.a(bVar.e, bVar.d + "_" + bVar.g, new b.a.C0044a(arrayList));
        } catch (Throwable th) {
            qx.a(th, oq.class);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/appevents/ml/ModelManager$Task;", "", "(Ljava/lang/String;I)V", "toKey", "", "toUseCase", "MTML_INTEGRITY_DETECT", "MTML_APP_EVENT_PREDICTION", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: oq$a */
    /* loaded from: classes2.dex */
    public enum a {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        public final String toKey() {
            int i = or.$EnumSwitchMapping$0[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return "app_event_pred";
            }
            return "integrity_detect";
        }

        public final String toUseCase() {
            int i = or.$EnumSwitchMapping$1[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return "MTML_APP_EVENT_PRED";
            }
            return "MTML_INTEGRITY_DETECT";
        }
    }

    public static final void a() {
        if (qx.a(oq.class)) {
            return;
        }
        try {
            qi.a(c.a);
        } catch (Throwable th) {
            qx.a(th, oq.class);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: oq$c */
    /* loaded from: classes2.dex */
    static final class c implements Runnable {
        public static final c a = new c();

        c() {
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0059 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005a A[Catch: all -> 0x007c, Exception -> 0x0080, TryCatch #2 {Exception -> 0x0080, all -> 0x007c, blocks: (B:5:0x000b, B:7:0x001d, B:12:0x002a, B:13:0x0030, B:14:0x0035, B:16:0x0043, B:18:0x0049, B:20:0x0051, B:23:0x005a, B:24:0x0071), top: B:30:0x000b }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r7 = this;
                java.lang.String r0 = "model_request_timestamp"
                java.lang.String r1 = "models"
                boolean r2 = defpackage.qx.a(r7)
                if (r2 == 0) goto Lb
                return
            Lb:
                android.content.Context r2 = defpackage.ly.k()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L80
                java.lang.String r3 = "com.facebook.internal.MODEL_STORE"
                r4 = 0
                android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r4)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L80
                r3 = 0
                java.lang.String r3 = r2.getString(r1, r3)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L80
                if (r3 == 0) goto L30
                r5 = r3
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L80
                int r5 = r5.length()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L80
                if (r5 != 0) goto L27
                r4 = 1
            L27:
                if (r4 == 0) goto L2a
                goto L30
            L2a:
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L80
                r4.<init>(r3)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L80
                goto L35
            L30:
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L80
                r4.<init>()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L80
            L35:
                r5 = 0
                long r5 = r2.getLong(r0, r5)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L80
                pr$b r3 = defpackage.pr.b.ModelRequest     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L80
                boolean r3 = defpackage.pr.a(r3)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L80
                if (r3 == 0) goto L51
                int r3 = r4.length()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L80
                if (r3 == 0) goto L51
                oq r3 = defpackage.oq.a     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L80
                boolean r3 = defpackage.oq.a(r3, r5)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L80
                if (r3 != 0) goto L71
            L51:
                oq r3 = defpackage.oq.a     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L80
                org.json.JSONObject r4 = defpackage.oq.a(r3)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L80
                if (r4 != 0) goto L5a
                return
            L5a:
                android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L80
                java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L80
                android.content.SharedPreferences$Editor r1 = r2.putString(r1, r3)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L80
                long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L80
                android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L80
                r0.apply()     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L80
            L71:
                oq r0 = defpackage.oq.a     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L80
                defpackage.oq.a(r0, r4)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L80
                oq r0 = defpackage.oq.a     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L80
                defpackage.oq.b(r0)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L80
                return
            L7c:
                r0 = move-exception
                defpackage.qx.a(r0, r7)
            L80:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.oq.c.run():void");
        }
    }

    private final boolean a(long j) {
        if (!qx.a(this) && j != 0) {
            try {
                if (System.currentTimeMillis() - j < 259200000) {
                    return true;
                }
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
        return false;
    }

    private final JSONObject a(JSONObject jSONObject) {
        if (qx.a(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                    jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                    jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                    jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                    if (jSONObject3.has("rules_uri")) {
                        jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                    }
                    jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                }
                return jSONObject2;
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    private final JSONObject b() {
        JSONObject jSONObject;
        if (qx.a(this)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            if (qi.a(ly.o())) {
                lz.c cVar = lz.k;
                dqi dqiVar = dqi.a;
                String format = String.format("%s/model_asset", Arrays.copyOf(new Object[]{ly.m()}, 1));
                dqc.b(format, "java.lang.String.format(format, *args)");
                lz a2 = lz.c.a((lk) null, format, (lz.b) null);
                a2.h = true;
                a2.a(bundle);
                jSONObject = lz.k.a(a2).b;
                if (jSONObject == null) {
                    return null;
                }
            } else {
                lz.c cVar2 = lz.k;
                lz a3 = lz.c.a((lk) null, "app/model_asset", (lz.b) null);
                a3.a(bundle);
                jSONObject = lz.k.a(a3).b;
                if (jSONObject == null) {
                    return null;
                }
            }
            return a(jSONObject);
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: oq$d */
    /* loaded from: classes2.dex */
    public static final class d implements Runnable {
        public static final d a = new d();

        d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                pc.a();
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: oq$e */
    /* loaded from: classes2.dex */
    public static final class e implements Runnable {
        public static final e a = new e();

        e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                od.a();
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    private final boolean c() {
        if (qx.a(this)) {
            return false;
        }
        try {
            Locale d2 = qi.d();
            if (d2 == null) {
                return true;
            }
            String language = d2.getLanguage();
            dqc.b(language, "locale.language");
            return dsg.a((CharSequence) language, (CharSequence) "en");
        } catch (Throwable th) {
            qx.a(th, this);
            return false;
        }
    }

    private final float[] a(JSONArray jSONArray) {
        if (!qx.a(this) && jSONArray != null) {
            try {
                float[] fArr = new float[jSONArray.length()];
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    try {
                        String string = jSONArray.getString(i);
                        dqc.b(string, "jsonArray.getString(i)");
                        fArr[i] = Float.parseFloat(string);
                    } catch (JSONException unused) {
                    }
                }
                return fArr;
            } catch (Throwable th) {
                qx.a(th, this);
                return null;
            }
        }
        return null;
    }

    public static final File a(a aVar) {
        if (qx.a(oq.class)) {
            return null;
        }
        try {
            dqc.d(aVar, "task");
            b bVar = b.get(aVar.toUseCase());
            if (bVar != null) {
                return bVar.a;
            }
            return null;
        } catch (Throwable th) {
            qx.a(th, oq.class);
            return null;
        }
    }

    public static final String[] a(a aVar, float[][] fArr, String[] strArr) {
        op opVar;
        if (qx.a(oq.class)) {
            return null;
        }
        try {
            dqc.d(aVar, "task");
            dqc.d(fArr, "denses");
            dqc.d(strArr, "texts");
            b bVar = b.get(aVar.toUseCase());
            if (bVar != null && (opVar = bVar.b) != null) {
                float[] fArr2 = bVar.h;
                boolean z = false;
                int length = fArr[0].length;
                oo ooVar = new oo(new int[]{1, length});
                for (int i = 0; i <= 0; i++) {
                    System.arraycopy(fArr[0], 0, ooVar.b, length * 0, length);
                }
                oo a2 = opVar.a(ooVar, strArr, aVar.toKey());
                if (a2 != null && fArr2 != null) {
                    if (!(a2.b.length == 0)) {
                        if (fArr2.length == 0) {
                            z = true;
                        }
                        if (!z) {
                            int i2 = os.$EnumSwitchMapping$0[aVar.ordinal()];
                            if (i2 == 1) {
                                return a.a(a2, fArr2);
                            }
                            if (i2 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return a.b(a2, fArr2);
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            qx.a(th, oq.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0002\u0018\u0000 *2\u00020\u0001:\u0001*B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010)\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/facebook/appevents/ml/ModelManager$TaskHandler;", "", "useCase", "", "assetUri", "ruleUri", "versionId", "", "thresholds", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I[F)V", "getAssetUri", "()Ljava/lang/String;", "setAssetUri", "(Ljava/lang/String;)V", "model", "Lcom/facebook/appevents/ml/Model;", "getModel", "()Lcom/facebook/appevents/ml/Model;", "setModel", "(Lcom/facebook/appevents/ml/Model;)V", "onPostExecute", "Ljava/lang/Runnable;", "ruleFile", "Ljava/io/File;", "getRuleFile", "()Ljava/io/File;", "setRuleFile", "(Ljava/io/File;)V", "getRuleUri", "setRuleUri", "getThresholds", "()[F", "setThresholds", "([F)V", "getUseCase", "setUseCase", "getVersionId", "()I", "setVersionId", "(I)V", "setOnPostExecute", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: oq$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public static final a i = new a((byte) 0);
        File a;
        op b;
        Runnable c;
        String d;
        String e;
        String f;
        int g;
        float[] h;

        public b(String str, String str2, String str3, int i2, float[] fArr) {
            dqc.d(str, "useCase");
            dqc.d(str2, "assetUri");
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.g = i2;
            this.h = fArr;
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\"\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0004J\u001c\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016¨\u0006\u0017"}, d2 = {"Lcom/facebook/appevents/ml/ModelManager$TaskHandler$Companion;", "", "()V", "build", "Lcom/facebook/appevents/ml/ModelManager$TaskHandler;", "json", "Lorg/json/JSONObject;", "deleteOldFiles", "", "useCase", "", "versionId", "", "download", "uri", "name", "onComplete", "Lcom/facebook/appevents/internal/FileDownloadTask$Callback;", "execute", "handler", "master", "slaves", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        /* renamed from: oq$b$a */
        /* loaded from: classes2.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }

            public static b a(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return null;
                }
                try {
                    String string = jSONObject.getString("use_case");
                    String string2 = jSONObject.getString("asset_uri");
                    String optString = jSONObject.optString("rules_uri", null);
                    int i = jSONObject.getInt("version_id");
                    float[] a = oq.a(oq.a, jSONObject.getJSONArray("thresholds"));
                    dqc.b(string, "useCase");
                    dqc.b(string2, "assetUri");
                    return new b(string, string2, optString, i, a);
                } catch (Exception unused) {
                    return null;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "file", "Ljava/io/File;", "onComplete"}, k = 3, mv = {1, 5, 1})
            /* renamed from: oq$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0044a implements oj.a {
                final /* synthetic */ List a;

                C0044a(List list) {
                    this.a = list;
                }

                @Override // defpackage.oj.a
                public final void a(File file) {
                    dqc.d(file, "file");
                    op.a aVar = op.a;
                    final op a = op.a.a(file);
                    if (a != null) {
                        for (final b bVar : this.a) {
                            a aVar2 = b.i;
                            a.a(bVar.f, bVar.d + "_" + bVar.g + "_rule", new oj.a() { // from class: oq.b.a.a.1
                                @Override // defpackage.oj.a
                                public final void a(File file2) {
                                    dqc.d(file2, "file");
                                    b.this.b = a;
                                    b.this.a = file2;
                                    Runnable runnable = b.this.c;
                                    if (runnable != null) {
                                        runnable.run();
                                    }
                                }
                            });
                        }
                    }
                }
            }

            static void a(String str, int i) {
                File[] listFiles;
                File a = ou.a();
                if (a == null || (listFiles = a.listFiles()) == null) {
                    return;
                }
                if (listFiles.length == 0) {
                    return;
                }
                String str2 = str + "_" + i;
                for (File file : listFiles) {
                    dqc.b(file, "f");
                    String name = file.getName();
                    dqc.b(name, "name");
                    if (dsg.c(name, str) && !dsg.c(name, str2)) {
                        file.delete();
                    }
                }
            }

            static void a(String str, String str2, oj.a aVar) {
                File file = new File(ou.a(), str2);
                if (str == null || file.exists()) {
                    aVar.a(file);
                } else {
                    new oj(str, file, aVar).execute(new String[0]);
                }
            }
        }
    }

    private final String[] a(oo ooVar, float[] fArr) {
        if (qx.a(this)) {
            return null;
        }
        try {
            int i = ooVar.c[0];
            int i2 = ooVar.c[1];
            float[] fArr2 = ooVar.b;
            if (i2 != fArr.length) {
                return null;
            }
            dra a2 = drb.a(0, i);
            ArrayList arrayList = new ArrayList(dmq.a((Iterable) a2));
            Iterator<Integer> it = a2.iterator();
            while (it.hasNext()) {
                int nextInt = ((dnf) it).nextInt();
                String str = "other";
                int length = fArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = i4 + 1;
                    if (fArr2[(nextInt * i2) + i4] >= fArr[i3]) {
                        str = c.get(i4);
                    }
                    i3++;
                    i4 = i5;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            return (String[]) array;
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    private final String[] b(oo ooVar, float[] fArr) {
        if (qx.a(this)) {
            return null;
        }
        try {
            int i = ooVar.c[0];
            int i2 = ooVar.c[1];
            float[] fArr2 = ooVar.b;
            if (i2 != fArr.length) {
                return null;
            }
            dra a2 = drb.a(0, i);
            ArrayList arrayList = new ArrayList(dmq.a((Iterable) a2));
            Iterator<Integer> it = a2.iterator();
            while (it.hasNext()) {
                int nextInt = ((dnf) it).nextInt();
                String str = "none";
                int length = fArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = i4 + 1;
                    if (fArr2[(nextInt * i2) + i4] >= fArr[i3]) {
                        str = d.get(i4);
                    }
                    i3++;
                    i4 = i5;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            return (String[]) array;
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }
}
