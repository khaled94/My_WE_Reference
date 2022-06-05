package defpackage;

import androidx.core.internal.view.SupportMenu;
import androidx.core.os.EnvironmentCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import defpackage.pu;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\b\u0010\u0014\u001a\u00020\nH\u0002J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/facebook/internal/FeatureManager;", "", "()V", "FEATURE_MANAGER_STORE", "", "featureMapping", "", "Lcom/facebook/internal/FeatureManager$Feature;", "", "checkFeature", "", "feature", "callback", "Lcom/facebook/internal/FeatureManager$Callback;", "defaultStatus", "", "disableFeature", "getFeature", "className", "getGKStatus", "initializeFeatureMapping", "isEnabled", "Callback", "Feature", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: pr  reason: default package */
/* loaded from: classes2.dex */
public final class pr {
    public static final pr a = new pr();
    private static final Map<b, String[]> b = new HashMap();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/facebook/internal/FeatureManager$Callback;", "", "onCompleted", "", "enabled", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: pr$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(boolean z);
    }

    private pr() {
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/facebook/internal/FeatureManager$checkFeature$1", "Lcom/facebook/internal/FetchedAppGateKeepersManager$Callback;", "onCompleted", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: pr$c */
    /* loaded from: classes2.dex */
    public static final class c implements pu.a {
        final /* synthetic */ a a;
        final /* synthetic */ b b;

        c(a aVar, b bVar) {
            this.a = aVar;
            this.b = bVar;
        }

        @Override // defpackage.pu.a
        public final void a() {
            this.a.a(pr.a(this.b));
        }
    }

    public static final void a(b bVar, a aVar) {
        dqc.d(bVar, "feature");
        dqc.d(aVar, "callback");
        pu.a(new c(aVar, bVar));
    }

    public static final boolean a(b bVar) {
        dqc.d(bVar, "feature");
        if (b.Unknown == bVar) {
            return false;
        }
        if (b.Core == bVar) {
            return true;
        }
        String string = ly.k().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(bVar.toKey(), null);
        if (string != null && dqc.a((Object) string, (Object) ly.l())) {
            return false;
        }
        b parent = bVar.getParent();
        if (parent == bVar) {
            return c(bVar);
        }
        return a(parent) && c(bVar);
    }

    public static final void b(b bVar) {
        dqc.d(bVar, "feature");
        ly.k().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(bVar.toKey(), ly.l()).apply();
    }

    public static final b a(String str) {
        dqc.d(str, "className");
        a.a();
        for (Map.Entry<b, String[]> entry : b.entrySet()) {
            b key = entry.getKey();
            for (String str2 : entry.getValue()) {
                if (dsg.c(str, str2)) {
                    return key;
                }
            }
        }
        return b.Unknown;
    }

    private final synchronized void a() {
        if (!b.isEmpty()) {
            return;
        }
        b.put(b.AAM, new String[]{"com.facebook.appevents.aam."});
        b.put(b.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
        b.put(b.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
        b.put(b.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
        b.put(b.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
        b.put(b.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
        b.put(b.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
        b.put(b.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
        b.put(b.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
        b.put(b.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
        b.put(b.IapLogging, new String[]{"com.facebook.appevents.iap."});
        b.put(b.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
    }

    private static boolean c(b bVar) {
        return pu.a(bVar.toKey(), ly.m(), d(bVar));
    }

    private static boolean d(b bVar) {
        switch (pt.$EnumSwitchMapping$0[bVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                return false;
            default:
                return true;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b \b\u0086\u0001\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001(B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'¨\u0006)"}, d2 = {"Lcom/facebook/internal/FeatureManager$Feature;", "", "code", "", "(Ljava/lang/String;II)V", "parent", "getParent", "()Lcom/facebook/internal/FeatureManager$Feature;", "toKey", "", "toString", "Unknown", "Core", "AppEvents", "CodelessEvents", "RestrictiveDataFiltering", "AAM", "PrivacyProtection", "SuggestedEvents", "IntelligentIntegrity", "ModelRequest", "EventDeactivation", "OnDeviceEventProcessing", "OnDevicePostInstallEventProcessing", "IapLogging", "IapLoggingLib2", "Instrument", "CrashReport", "CrashShield", "ThreadCheck", "ErrorReport", "AnrReport", "Monitoring", "ServiceUpdateCompliance", "Login", "ChromeCustomTabsPrefetching", "IgnoreAppSwitchToLoggedOut", "BypassAppSwitch", "Share", "Places", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: pr$b */
    /* loaded from: classes2.dex */
    public enum b {
        Unknown(-1),
        Core(0),
        AppEvents(65536),
        CodelessEvents(65792),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        IapLogging(67328),
        IapLoggingLib2(67329),
        Instrument(131072),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        AnrReport(131840),
        Monitoring(196608),
        ServiceUpdateCompliance(196864),
        Login(16777216),
        ChromeCustomTabsPrefetching(16842752),
        IgnoreAppSwitchToLoggedOut(16908288),
        BypassAppSwitch(16973824),
        Share(33554432),
        Places(50331648);
        
        public static final a Companion = new a((byte) 0);
        private final int code;

        b(int i) {
            this.code = i;
        }

        @Override // java.lang.Enum
        public final String toString() {
            switch (ps.$EnumSwitchMapping$0[ordinal()]) {
                case 1:
                    return "CoreKit";
                case 2:
                    return "AppEvents";
                case 3:
                    return "CodelessEvents";
                case 4:
                    return "RestrictiveDataFiltering";
                case 5:
                    return "Instrument";
                case 6:
                    return "CrashReport";
                case 7:
                    return "CrashShield";
                case 8:
                    return "ThreadCheck";
                case 9:
                    return "ErrorReport";
                case 10:
                    return "AnrReport";
                case 11:
                    return "AAM";
                case 12:
                    return "PrivacyProtection";
                case 13:
                    return "SuggestedEvents";
                case 14:
                    return "IntelligentIntegrity";
                case 15:
                    return "ModelRequest";
                case 16:
                    return "EventDeactivation";
                case 17:
                    return "OnDeviceEventProcessing";
                case 18:
                    return "OnDevicePostInstallEventProcessing";
                case 19:
                    return "IAPLogging";
                case 20:
                    return "IAPLoggingLib2";
                case 21:
                    return "Monitoring";
                case 22:
                    return "ServiceUpdateCompliance";
                case 23:
                    return "LoginKit";
                case 24:
                    return "ChromeCustomTabsPrefetching";
                case 25:
                    return "IgnoreAppSwitchToLoggedOut";
                case 26:
                    return "BypassAppSwitch";
                case 27:
                    return "ShareKit";
                case 28:
                    return "PlacesKit";
                default:
                    return EnvironmentCompat.MEDIA_UNKNOWN;
            }
        }

        public final String toKey() {
            return "FBSDKFeature".concat(String.valueOf(this));
        }

        public final b getParent() {
            int i = this.code;
            if ((i & 255) > 0) {
                return a.a(i & InputDeviceCompat.SOURCE_ANY);
            }
            if ((65280 & i) > 0) {
                return a.a(i & SupportMenu.CATEGORY_MASK);
            }
            if ((16711680 & i) > 0) {
                return a.a(i & ViewCompat.MEASURED_STATE_MASK);
            }
            return a.a(0);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/internal/FeatureManager$Feature$Companion;", "", "()V", "fromInt", "Lcom/facebook/internal/FeatureManager$Feature;", "code", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        /* renamed from: pr$b$a */
        /* loaded from: classes2.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }

            public static b a(int i) {
                b[] values;
                for (b bVar : b.values()) {
                    if (bVar.code == i) {
                        return bVar;
                    }
                }
                return b.Unknown;
            }
        }
    }
}
