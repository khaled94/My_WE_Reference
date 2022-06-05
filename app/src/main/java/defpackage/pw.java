package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import defpackage.lz;
import defpackage.pn;
import defpackage.pv;
import defpackage.qh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002BCB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020$H\u0007J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0004H\u0002J\u0014\u00104\u001a\u0004\u0018\u00010!2\b\u00103\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u00105\u001a\u00020/H\u0007J\u001d\u00106\u001a\u00020!2\u0006\u00103\u001a\u00020\u00042\u0006\u00107\u001a\u000202H\u0000¢\u0006\u0002\b8J*\u00109\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020;0 0:2\b\u0010<\u001a\u0004\u0018\u000102H\u0002J\b\u0010=\u001a\u00020/H\u0002J\u001a\u0010>\u001a\u0004\u0018\u00010!2\u0006\u00103\u001a\u00020\u00042\u0006\u0010?\u001a\u00020&H\u0007J\u0010\u0010@\u001a\u00020/2\u0006\u0010A\u001a\u00020&H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020!0 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010'\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010)0)0(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Lcom/facebook/internal/FetchedAppSettingsManager;", "", "()V", "APPLICATION_FIELDS", "", "APP_SETTINGS_PREFS_KEY_FORMAT", "APP_SETTINGS_PREFS_STORE", "APP_SETTING_ANDROID_SDK_ERROR_CATEGORIES", "APP_SETTING_APP_EVENTS_AAM_RULE", "APP_SETTING_APP_EVENTS_EVENT_BINDINGS", "APP_SETTING_APP_EVENTS_FEATURE_BITMASK", "APP_SETTING_APP_EVENTS_SESSION_TIMEOUT", "APP_SETTING_DIALOG_CONFIGS", "APP_SETTING_FIELDS", "", "APP_SETTING_NUX_CONTENT", "APP_SETTING_NUX_ENABLED", "APP_SETTING_RESTRICTIVE_EVENT_FILTER_FIELD", "APP_SETTING_SMART_LOGIN_OPTIONS", "APP_SETTING_SUPPORTS_IMPLICIT_SDK_LOGGING", "AUTOMATIC_LOGGING_ENABLED_BITMASK_FIELD", "", "CODELESS_EVENTS_ENABLED_BITMASK_FIELD", "IAP_AUTOMATIC_LOGGING_ENABLED_BITMASK_FIELD", "MONITOR_ENABLED_BITMASK_FIELD", "SDK_UPDATE_MESSAGE", "SMART_LOGIN_BOOKMARK_ICON_URL", "SMART_LOGIN_MENU_ICON_URL", "SUGGESTED_EVENTS_SETTING", "TAG", "TRACK_UNINSTALL_ENABLED_BITMASK_FIELD", "fetchedAppSettings", "", "Lcom/facebook/internal/FetchedAppSettings;", "fetchedAppSettingsCallbacks", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lcom/facebook/internal/FetchedAppSettingsManager$FetchedAppSettingsCallback;", "isUnityInit", "", "loadingState", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/facebook/internal/FetchedAppSettingsManager$FetchAppSettingState;", "kotlin.jvm.PlatformType", "printedSDKUpdatedMessage", "unityEventBindings", "Lorg/json/JSONArray;", "getAppSettingsAsync", "", "callback", "getAppSettingsQueryResponse", "Lorg/json/JSONObject;", "applicationId", "getAppSettingsWithoutQuery", "loadAppSettingsAsync", "parseAppSettingsFromJSON", "settingsJSON", "parseAppSettingsFromJSON$facebook_core_release", "parseDialogConfigurations", "", "Lcom/facebook/internal/FetchedAppSettings$DialogFeatureConfig;", "dialogConfigResponse", "pollCallbacks", "queryAppSettings", "forceRequery", "setIsUnityInit", "flag", "FetchAppSettingState", "FetchedAppSettingsCallback", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: pw  reason: default package */
/* loaded from: classes2.dex */
public final class pw {
    private static final String b;
    private static boolean g;
    private static JSONArray h;
    public static final pw a = new pw();
    private static final List<String> c = dmq.b("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting");
    private static final Map<String, pv> d = new ConcurrentHashMap();
    private static final AtomicReference<a> e = new AtomicReference<>(a.NOT_LOADED);
    private static final ConcurrentLinkedQueue<b> f = new ConcurrentLinkedQueue<>();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/internal/FetchedAppSettingsManager$FetchAppSettingState;", "", "(Ljava/lang/String;I)V", "NOT_LOADED", "LOADING", "SUCCESS", "ERROR", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: pw$a */
    /* loaded from: classes2.dex */
    public enum a {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/facebook/internal/FetchedAppSettingsManager$FetchedAppSettingsCallback;", "", "onError", "", "onSuccess", "fetchedAppSettings", "Lcom/facebook/internal/FetchedAppSettings;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: pw$b */
    /* loaded from: classes2.dex */
    public interface b {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: pw$d */
    /* loaded from: classes2.dex */
    public static final class d implements Runnable {
        final /* synthetic */ b a;

        d(b bVar) {
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
            }
        }
    }

    static {
        String simpleName = pw.class.getSimpleName();
        dqc.b(simpleName, "FetchedAppSettingsManager::class.java.simpleName");
        b = simpleName;
    }

    private pw() {
    }

    public static final void a() {
        Context k = ly.k();
        String m = ly.m();
        if (qi.a(m)) {
            e.set(a.ERROR);
            a.g();
        } else if (d.containsKey(m)) {
            e.set(a.SUCCESS);
            a.g();
        } else {
            if (!(e.compareAndSet(a.NOT_LOADED, a.LOADING) || e.compareAndSet(a.ERROR, a.LOADING))) {
                a.g();
                return;
            }
            dqi dqiVar = dqi.a;
            String format = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{m}, 1));
            dqc.b(format, "java.lang.String.format(format, *args)");
            ly.a().execute(new c(k, format, m));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: pw$c */
    /* loaded from: classes2.dex */
    public static final class c implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        c(Context context, String str, String str2) {
            this.a = context;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            JSONObject jSONObject;
            if (qx.a(this)) {
                return;
            }
            try {
                SharedPreferences sharedPreferences = this.a.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                pv pvVar = null;
                String string = sharedPreferences.getString(this.b, null);
                if (!qi.a(string)) {
                    if (string == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    try {
                        jSONObject = new JSONObject(string);
                    } catch (JSONException e) {
                        qi.a("FacebookSDK", (Exception) e);
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        pw pwVar = pw.a;
                        pvVar = pw.a(this.c, jSONObject);
                    }
                }
                pw pwVar2 = pw.a;
                JSONObject c = pw.c(this.c);
                if (c != null) {
                    pw pwVar3 = pw.a;
                    pw.a(this.c, c);
                    sharedPreferences.edit().putString(this.b, c.toString()).apply();
                }
                if (pvVar != null) {
                    String str = pvVar.i;
                    pw pwVar4 = pw.a;
                    if (!pw.g && str != null && str.length() > 0) {
                        pw pwVar5 = pw.a;
                        pw.g = true;
                        pw pwVar6 = pw.a;
                        String unused = pw.b;
                    }
                }
                pu.a(this.c);
                oh.a();
                pw pwVar7 = pw.a;
                AtomicReference atomicReference = pw.e;
                pw pwVar8 = pw.a;
                atomicReference.set(pw.d.containsKey(this.c) ? a.SUCCESS : a.ERROR);
                pw.a.g();
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    public static final pv a(String str) {
        if (str != null) {
            return d.get(str);
        }
        return null;
    }

    public static final void a(b bVar) {
        dqc.d(bVar, "callback");
        f.add(bVar);
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void g() {
        a aVar = e.get();
        if (a.NOT_LOADED != aVar && a.LOADING != aVar) {
            pv pvVar = d.get(ly.m());
            Handler handler = new Handler(Looper.getMainLooper());
            if (a.ERROR == aVar) {
                while (!f.isEmpty()) {
                    handler.post(new d(f.poll()));
                }
                return;
            }
            while (!f.isEmpty()) {
                handler.post(new e(f.poll(), pvVar));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: pw$e */
    /* loaded from: classes2.dex */
    public static final class e implements Runnable {
        final /* synthetic */ b a;
        final /* synthetic */ pv b;

        e(b bVar, pv pvVar) {
            this.a = bVar;
            this.b = pvVar;
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

    public static final pv a(String str, boolean z) {
        dqc.d(str, "applicationId");
        if (!z && d.containsKey(str)) {
            return d.get(str);
        }
        JSONObject c2 = c(str);
        if (c2 == null) {
            return null;
        }
        pv a2 = a(str, c2);
        if (dqc.a((Object) str, (Object) ly.m())) {
            e.set(a.SUCCESS);
            a.g();
        }
        return a2;
    }

    public static pv a(String str, JSONObject jSONObject) {
        dqc.d(str, "applicationId");
        dqc.d(jSONObject, "settingsJSON");
        JSONArray optJSONArray = jSONObject.optJSONArray("android_sdk_error_categories");
        pn.a aVar = pn.g;
        pn a2 = pn.a.a(optJSONArray);
        if (a2 == null) {
            a2 = pn.g.a();
        }
        pn pnVar = a2;
        int optInt = jSONObject.optInt("app_events_feature_bitmask", 0);
        boolean z = (optInt & 8) != 0;
        boolean z2 = (optInt & 16) != 0;
        boolean z3 = (optInt & 32) != 0;
        boolean z4 = (optInt & 256) != 0;
        boolean z5 = (optInt & 16384) != 0;
        JSONArray optJSONArray2 = jSONObject.optJSONArray("auto_event_mapping_android");
        h = optJSONArray2;
        if (optJSONArray2 != null && qa.b()) {
            ns.a(optJSONArray2 != null ? optJSONArray2.toString() : null);
        }
        boolean optBoolean = jSONObject.optBoolean("supports_implicit_sdk_logging", false);
        String optString = jSONObject.optString("gdpv4_nux_content", "");
        dqc.b(optString, "settingsJSON.optString(A…_SETTING_NUX_CONTENT, \"\")");
        boolean optBoolean2 = jSONObject.optBoolean("gdpv4_nux_enabled", false);
        int optInt2 = jSONObject.optInt("app_events_session_timeout", oi.a());
        qh.a aVar2 = qh.Companion;
        EnumSet<qh> a3 = qh.a.a(jSONObject.optLong("seamless_login"));
        Map<String, Map<String, pv.b>> a4 = a(jSONObject.optJSONObject("android_dialog_configs"));
        String optString2 = jSONObject.optString("smart_login_bookmark_icon_url");
        dqc.b(optString2, "settingsJSON.optString(S…_LOGIN_BOOKMARK_ICON_URL)");
        String optString3 = jSONObject.optString("smart_login_menu_icon_url");
        dqc.b(optString3, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String optString4 = jSONObject.optString("sdk_update_message");
        dqc.b(optString4, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        pv pvVar = new pv(optBoolean, optString, optBoolean2, optInt2, a3, a4, z, pnVar, optString2, optString3, z2, z3, optJSONArray2, optString4, z4, z5, jSONObject.optString("aam_rules"), jSONObject.optString("suggested_events_setting"), jSONObject.optString("restrictive_data_filter_params"));
        d.put(str, pvVar);
        return pvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject c(String str) {
        lz lzVar;
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        if (qi.a(ly.o())) {
            lz.c cVar = lz.k;
            lzVar = lz.c.a((lk) null, str, (lz.b) null);
            lzVar.i = true;
            lzVar.h = true;
            lzVar.a(bundle);
        } else {
            lz.c cVar2 = lz.k;
            lzVar = lz.c.a((lk) null, "app", (lz.b) null);
            lzVar.i = true;
            lzVar.a(bundle);
        }
        JSONObject jSONObject = lz.k.a(lzVar).a;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    private static Map<String, Map<String, pv.b>> a(JSONObject jSONObject) {
        JSONArray optJSONArray;
        HashMap hashMap = new HashMap();
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("data")) != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                pv.b.a aVar = pv.b.c;
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                dqc.b(optJSONObject, "dialogConfigData.optJSONObject(i)");
                dqc.d(optJSONObject, "dialogConfigJSON");
                String optString = optJSONObject.optString("name");
                pv.b bVar = null;
                Uri uri = null;
                bVar = null;
                bVar = null;
                bVar = null;
                if (!qi.a(optString)) {
                    dqc.b(optString, "dialogNameWithFeature");
                    List a2 = dsg.a(optString, new String[]{"|"}, 0, 6);
                    if (a2.size() == 2) {
                        dqc.d(a2, "$this$first");
                        if (!a2.isEmpty()) {
                            String str = (String) a2.get(0);
                            String str2 = (String) dmq.d((List<? extends Object>) a2);
                            if (!qi.a(str) && !qi.a(str2)) {
                                String optString2 = optJSONObject.optString("url");
                                if (!qi.a(optString2)) {
                                    uri = Uri.parse(optString2);
                                }
                                bVar = new pv.b(str, str2, uri, pv.b.a.a(optJSONObject.optJSONArray("versions")), (byte) 0);
                            }
                        } else {
                            throw new NoSuchElementException("List is empty.");
                        }
                    }
                }
                if (bVar != null) {
                    String str3 = bVar.a;
                    HashMap hashMap2 = (Map) hashMap.get(str3);
                    if (hashMap2 == null) {
                        hashMap2 = new HashMap();
                        hashMap.put(str3, hashMap2);
                    }
                    hashMap2.put(bVar.b, bVar);
                }
            }
        }
        return hashMap;
    }
}
