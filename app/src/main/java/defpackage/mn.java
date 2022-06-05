package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.FacebookSdkNotInitializedException;
import defpackage.lz;
import defpackage.pg;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0010\bÁ\u0002\u0018\u00002\u00020\u0001:\u00017B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0007J\b\u0010\u001f\u001a\u00020\u001eH\u0007J\b\u0010 \u001a\u00020\u001eH\u0007J\b\u0010!\u001a\u00020\u001eH\u0007J\b\u0010\"\u001a\u00020\u001eH\u0007J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0002J!\u0010&\u001a\u00020$2\u0012\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130(\"\u00020\u0013H\u0002¢\u0006\u0002\u0010)J\u0010\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020\u0013H\u0002J\b\u0010,\u001a\u00020$H\u0007J\b\u0010-\u001a\u00020$H\u0002J\b\u0010.\u001a\u00020$H\u0002J\u0010\u0010/\u001a\u00020$2\u0006\u0010+\u001a\u00020\u0013H\u0002J\u0010\u00100\u001a\u00020$2\u0006\u00101\u001a\u00020\u001eH\u0007J\u0010\u00102\u001a\u00020$2\u0006\u00101\u001a\u00020\u001eH\u0007J\u0010\u00103\u001a\u00020$2\u0006\u00101\u001a\u00020\u001eH\u0007J\u0010\u00104\u001a\u00020$2\u0006\u00101\u001a\u00020\u001eH\u0007J\b\u00105\u001a\u00020$H\u0002J\u0010\u00106\u001a\u00020$2\u0006\u0010+\u001a\u00020\u0013H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/facebook/UserSettingsManager;", "", "()V", "ADVERTISERID_COLLECTION_FALSE_WARNING", "", "ADVERTISERID_COLLECTION_NOT_SET_WARNING", "ADVERTISER_ID_KEY", "APPLICATION_FIELDS", "AUTOLOG_APPEVENT_NOT_SET_WARNING", "AUTO_APP_LINK_WARNING", "EVENTS_CODELESS_SETUP_ENABLED", "LAST_TIMESTAMP", "TAG", "TIMEOUT_7D", "", "USER_SETTINGS", "USER_SETTINGS_BITMASK", "VALUE", "advertiserIDCollectionEnabled", "Lcom/facebook/UserSettingsManager$UserSetting;", "autoInitEnabled", "autoLogAppEventsEnabled", "codelessSetupEnabled", "isFetchingCodelessStatus", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitialized", "monitorEnabled", "userSettingPref", "Landroid/content/SharedPreferences;", "getAdvertiserIDCollectionEnabled", "", "getAutoInitEnabled", "getAutoLogAppEventsEnabled", "getCodelessSetupEnabled", "getMonitorEnabled", "initializeCodelessSetupEnabledAsync", "", "initializeIfNotInitialized", "initializeUserSetting", "userSettings", "", "([Lcom/facebook/UserSettingsManager$UserSetting;)V", "loadSettingFromManifest", "userSetting", "logIfAutoAppLinkEnabled", "logIfSDKSettingsChanged", "logWarnings", "readSettingFromCache", "setAdvertiserIDCollectionEnabled", "flag", "setAutoInitEnabled", "setAutoLogAppEventsEnabled", "setMonitorEnabled", "validateInitialized", "writeSettingToCache", "UserSetting", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: mn  reason: default package */
/* loaded from: classes2.dex */
public final class mn {
    private static final String b;
    private static SharedPreferences j;
    public static final mn a = new mn();
    private static final AtomicBoolean c = new AtomicBoolean(false);
    private static final AtomicBoolean d = new AtomicBoolean(false);
    private static final a e = new a(true, "com.facebook.sdk.AutoInitEnabled");
    private static final a f = new a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");
    private static final a g = new a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");
    private static final a h = new a(false, "auto_event_setup_enabled");
    private static final a i = new a(true, "com.facebook.sdk.MonitorEnabled");

    static {
        String name = mn.class.getName();
        dqc.b(name, "UserSettingsManager::class.java.name");
        b = name;
    }

    private mn() {
    }

    public static final /* synthetic */ void a(mn mnVar, a aVar) {
        if (qx.a(mn.class)) {
            return;
        }
        try {
            mnVar.a(aVar);
        } catch (Throwable th) {
            qx.a(th, mn.class);
        }
    }

    public static final /* synthetic */ a f() {
        if (qx.a(mn.class)) {
            return null;
        }
        try {
            return g;
        } catch (Throwable th) {
            qx.a(th, mn.class);
            return null;
        }
    }

    public static final /* synthetic */ a g() {
        if (qx.a(mn.class)) {
            return null;
        }
        try {
            return h;
        } catch (Throwable th) {
            qx.a(th, mn.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean h() {
        if (qx.a(mn.class)) {
            return null;
        }
        try {
            return d;
        } catch (Throwable th) {
            qx.a(th, mn.class);
            return null;
        }
    }

    private final void i() {
        if (qx.a(this)) {
            return;
        }
        try {
            if (!ly.i()) {
                return;
            }
            if (!c.compareAndSet(false, true)) {
                return;
            }
            SharedPreferences sharedPreferences = ly.k().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
            dqc.b(sharedPreferences, "FacebookSdk.getApplicati…GS, Context.MODE_PRIVATE)");
            j = sharedPreferences;
            a[] aVarArr = {f, g, e};
            Bundle bundle = null;
            if (!qx.a(this)) {
                for (int i2 = 0; i2 < 3; i2++) {
                    a aVar = aVarArr[i2];
                    if (aVar == h) {
                        j();
                    } else if (aVar.a == null) {
                        b(aVar);
                        if (aVar.a == null && !qx.a(this)) {
                            try {
                                l();
                                try {
                                    Context k = ly.k();
                                    ApplicationInfo applicationInfo = k.getPackageManager().getApplicationInfo(k.getPackageName(), 128);
                                    if ((applicationInfo != null ? applicationInfo.metaData : null) != null && applicationInfo.metaData.containsKey(aVar.d)) {
                                        aVar.a = Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.d, aVar.c));
                                    }
                                } catch (PackageManager.NameNotFoundException e2) {
                                    qi.a(b, (Exception) e2);
                                }
                            } catch (Throwable th) {
                                qx.a(th, this);
                            }
                        }
                    } else {
                        a(aVar);
                    }
                }
            }
            j();
            if (!qx.a(this)) {
                try {
                    Context k2 = ly.k();
                    ApplicationInfo applicationInfo2 = k2.getPackageManager().getApplicationInfo(k2.getPackageName(), 128);
                    if (applicationInfo2 != null) {
                        bundle = applicationInfo2.metaData;
                    }
                    if (bundle != null) {
                        applicationInfo2.metaData.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled");
                        applicationInfo2.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled");
                        d();
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                } catch (Throwable th2) {
                    qx.a(th2, this);
                }
            }
            k();
        } catch (Throwable th3) {
            qx.a(th3, this);
        }
    }

    private final void j() {
        if (qx.a(this)) {
            return;
        }
        try {
            b(h);
            long currentTimeMillis = System.currentTimeMillis();
            if (h.a != null && currentTimeMillis - h.b < 604800000) {
                return;
            }
            h.a = null;
            h.b = 0L;
            if (!d.compareAndSet(false, true)) {
                return;
            }
            ly.a().execute(new b(currentTimeMillis));
        } catch (Throwable th) {
            qx.a(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: mn$b */
    /* loaded from: classes2.dex */
    public static final class b implements Runnable {
        final /* synthetic */ long a;

        b(long j) {
            this.a = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            pv a;
            JSONObject jSONObject;
            if (qx.a(this)) {
                return;
            }
            try {
                mn mnVar = mn.a;
                if (mn.f().a() && (a = pw.a(ly.m(), false)) != null && a.g) {
                    Context k = ly.k();
                    pg.a aVar = pg.e;
                    pg a2 = pg.a.a(k);
                    String a3 = (a2 == null || a2.a() == null) ? null : a2.a();
                    if (a3 != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("advertiser_id", a3);
                        bundle.putString("fields", "auto_event_setup_enabled");
                        if (qi.a(ly.o())) {
                            lz.c cVar = lz.k;
                            lz a4 = lz.c.a((lk) null, ly.m(), (lz.b) null);
                            a4.h = true;
                            a4.a(bundle);
                            jSONObject = lz.k.a(a4).b;
                        } else {
                            lz.c cVar2 = lz.k;
                            lz a5 = lz.c.a((lk) null, "app", (lz.b) null);
                            a5.a(bundle);
                            jSONObject = lz.k.a(a5).b;
                        }
                        if (jSONObject != null) {
                            mn mnVar2 = mn.a;
                            mn.g().a = Boolean.valueOf(jSONObject.optBoolean("auto_event_setup_enabled", false));
                            mn mnVar3 = mn.a;
                            mn.g().b = this.a;
                            mn.a(mn.a, mn.g());
                        }
                    }
                }
                mn mnVar4 = mn.a;
                mn.h().set(false);
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    private final void a(a aVar) {
        if (qx.a(this)) {
            return;
        }
        try {
            l();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", aVar.a);
                jSONObject.put("last_timestamp", aVar.b);
                SharedPreferences sharedPreferences = j;
                if (sharedPreferences == null) {
                    dqc.a("userSettingPref");
                }
                sharedPreferences.edit().putString(aVar.d, jSONObject.toString()).apply();
                k();
            } catch (Exception e2) {
                qi.a(b, e2);
            }
        } catch (Throwable th) {
            qx.a(th, this);
        }
    }

    private final void b(a aVar) {
        String str = "";
        if (qx.a(this)) {
            return;
        }
        try {
            l();
            try {
                SharedPreferences sharedPreferences = j;
                if (sharedPreferences == null) {
                    dqc.a("userSettingPref");
                }
                String string = sharedPreferences.getString(aVar.d, str);
                if (string != null) {
                    str = string;
                }
                dqc.b(str, "userSettingPref.getStrin…serSetting.key, \"\") ?: \"\"");
                if (!(str.length() > 0)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(str);
                aVar.a = Boolean.valueOf(jSONObject.getBoolean("value"));
                aVar.b = jSONObject.getLong("last_timestamp");
            } catch (JSONException e2) {
                qi.a(b, (Exception) e2);
            }
        } catch (Throwable th) {
            qx.a(th, this);
        }
    }

    private final void k() {
        int i2;
        int i3;
        ApplicationInfo applicationInfo;
        if (qx.a(this)) {
            return;
        }
        try {
            if (!c.get() || !ly.i()) {
                return;
            }
            Context k = ly.k();
            int i4 = 0;
            int i5 = ((e.a() ? 1 : 0) << 0) | 0 | ((f.a() ? 1 : 0) << 1) | ((g.a() ? 1 : 0) << 2) | ((i.a() ? 1 : 0) << 3);
            SharedPreferences sharedPreferences = j;
            if (sharedPreferences == null) {
                dqc.a("userSettingPref");
            }
            int i6 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
            if (i6 == i5) {
                return;
            }
            SharedPreferences sharedPreferences2 = j;
            if (sharedPreferences2 == null) {
                dqc.a("userSettingPref");
            }
            sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i5).apply();
            try {
                applicationInfo = k.getPackageManager().getApplicationInfo(k.getPackageName(), 128);
            } catch (PackageManager.NameNotFoundException unused) {
                i3 = 0;
            }
            if ((applicationInfo != null ? applicationInfo.metaData : null) != null) {
                String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                boolean[] zArr = {true, true, true, true};
                i2 = 0;
                i3 = 0;
                for (int i7 = 0; i7 < 4; i7++) {
                    try {
                        i3 |= (applicationInfo.metaData.containsKey(strArr[i7]) ? 1 : 0) << i7;
                        i2 |= (applicationInfo.metaData.getBoolean(strArr[i7], zArr[i7]) ? 1 : 0) << i7;
                    } catch (PackageManager.NameNotFoundException unused2) {
                        i4 = i2;
                        i2 = i4;
                        i4 = i3;
                        na naVar = new na(k);
                        Bundle bundle = new Bundle();
                        bundle.putInt("usage", i4);
                        bundle.putInt("initial", i2);
                        bundle.putInt("previous", i6);
                        bundle.putInt("current", i5);
                        naVar.a(bundle);
                    }
                }
                i4 = i3;
                na naVar2 = new na(k);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("usage", i4);
                bundle2.putInt("initial", i2);
                bundle2.putInt("previous", i6);
                bundle2.putInt("current", i5);
                naVar2.a(bundle2);
            }
            i2 = 0;
            na naVar22 = new na(k);
            Bundle bundle22 = new Bundle();
            bundle22.putInt("usage", i4);
            bundle22.putInt("initial", i2);
            bundle22.putInt("previous", i6);
            bundle22.putInt("current", i5);
            naVar22.a(bundle22);
        } catch (Throwable th) {
            qx.a(th, this);
        }
    }

    public static final void a() {
        if (qx.a(mn.class)) {
            return;
        }
        try {
            Context k = ly.k();
            ApplicationInfo applicationInfo = k.getPackageManager().getApplicationInfo(k.getPackageName(), 128);
            if ((applicationInfo != null ? applicationInfo.metaData : null) == null || !applicationInfo.metaData.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                return;
            }
            na naVar = new na(k);
            Bundle bundle = new Bundle();
            if (!qi.f()) {
                bundle.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
            }
            naVar.a("fb_auto_applink", bundle);
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th) {
            qx.a(th, mn.class);
        }
    }

    private final void l() {
        if (qx.a(this)) {
            return;
        }
        try {
            if (c.get()) {
                return;
            }
            throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
        } catch (Throwable th) {
            qx.a(th, this);
        }
    }

    public static final boolean b() {
        if (qx.a(mn.class)) {
            return false;
        }
        try {
            a.i();
            return e.a();
        } catch (Throwable th) {
            qx.a(th, mn.class);
            return false;
        }
    }

    public static final boolean c() {
        if (qx.a(mn.class)) {
            return false;
        }
        try {
            a.i();
            return f.a();
        } catch (Throwable th) {
            qx.a(th, mn.class);
            return false;
        }
    }

    public static final boolean d() {
        if (qx.a(mn.class)) {
            return false;
        }
        try {
            a.i();
            return g.a();
        } catch (Throwable th) {
            qx.a(th, mn.class);
            return false;
        }
    }

    public static final boolean e() {
        if (qx.a(mn.class)) {
            return false;
        }
        try {
            a.i();
            return h.a();
        } catch (Throwable th) {
            qx.a(th, mn.class);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0016\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/facebook/UserSettingsManager$UserSetting;", "", "defaultVal", "", "key", "", "(ZLjava/lang/String;)V", "getDefaultVal", "()Z", "setDefaultVal", "(Z)V", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "lastTS", "", "getLastTS", "()J", "setLastTS", "(J)V", "value", "getValue", "()Ljava/lang/Boolean;", "setValue", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: mn$a */
    /* loaded from: classes2.dex */
    public static final class a {
        Boolean a;
        long b;
        boolean c;
        String d;

        public a(boolean z, String str) {
            dqc.d(str, "key");
            this.c = z;
            this.d = str;
        }

        public final boolean a() {
            Boolean bool = this.a;
            return bool != null ? bool.booleanValue() : this.c;
        }
    }
}
