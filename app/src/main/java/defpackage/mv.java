package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.facebook.FacebookException;
import defpackage.lk;
import defpackage.mu;
import defpackage.pr;
import defpackage.pz;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.json.JSONException;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u0000 :2\u00020\u0001:\u0001:B%\b\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB#\b\u0000\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\nJ\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005J\u001c\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0018\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\u0019J\"\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J;\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0002\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005J.\u0010 \u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J)\u0010 \u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010%J\u0088\u0001\u0010&\u001a\u00020\u00112\b\u0010'\u001a\u0004\u0018\u00010\u00052\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010\u00052\b\u0010-\u001a\u0004\u0018\u00010\u00052\b\u0010.\u001a\u0004\u0018\u00010\u00052\b\u0010/\u001a\u0004\u0018\u00010\u00052\b\u00100\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u00101\u001a\u0004\u0018\u00010\u00052\b\u00102\u001a\u0004\u0018\u00010\u00052\b\u00103\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u001a\u00104\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$J&\u00104\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017J,\u00104\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u0013J$\u00105\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0018\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u00172\b\u00108\u001a\u0004\u0018\u00010\u0005J'\u00109\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010%R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/facebook/appevents/AppEventsLoggerImpl;", "", "context", "Landroid/content/Context;", "applicationId", "", "accessToken", "Lcom/facebook/AccessToken;", "(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/AccessToken;)V", "activityName", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/AccessToken;)V", "accessTokenAppId", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "getApplicationId", "()Ljava/lang/String;", "contextName", "flush", "", "isValidForAccessToken", "", "logEvent", "eventName", "parameters", "Landroid/os/Bundle;", "valueToSum", "", "isImplicitlyLogged", "currentSessionId", "Ljava/util/UUID;", "(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;ZLjava/util/UUID;)V", "logEventFromSE", "buttonText", "logEventImplicitly", "purchaseAmount", "Ljava/math/BigDecimal;", "currency", "Ljava/util/Currency;", "(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V", "logProductItem", "itemID", "availability", "Lcom/facebook/appevents/AppEventsLogger$ProductAvailability;", "condition", "Lcom/facebook/appevents/AppEventsLogger$ProductCondition;", "description", "imageLink", "link", "title", "priceAmount", "gtin", "mpn", "brand", "logPurchase", "logPurchaseImplicitly", "logPushNotificationOpen", "payload", "action", "logSdkEvent", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: mv */
/* loaded from: classes2.dex */
public final class mv {
    public static final String a;
    public static final a b = new a((byte) 0);
    private static ScheduledThreadPoolExecutor e;
    private static int f;
    private static final Object g;
    private static String h;
    private static boolean i;
    private static String j;
    private final String c;
    private mo d;

    public static final /* synthetic */ void a(String str) {
        if (qx.a(mv.class)) {
            return;
        }
        try {
            h = str;
        } catch (Throwable th) {
            qx.a(th, mv.class);
        }
    }

    public static final /* synthetic */ void a(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        if (qx.a(mv.class)) {
            return;
        }
        try {
            e = scheduledThreadPoolExecutor;
        } catch (Throwable th) {
            qx.a(th, mv.class);
        }
    }

    public static final /* synthetic */ Object b() {
        if (qx.a(mv.class)) {
            return null;
        }
        try {
            return g;
        } catch (Throwable th) {
            qx.a(th, mv.class);
            return null;
        }
    }

    public static final /* synthetic */ int c() {
        if (qx.a(mv.class)) {
            return 0;
        }
        try {
            return f;
        } catch (Throwable th) {
            qx.a(th, mv.class);
            return 0;
        }
    }

    public static final /* synthetic */ String d() {
        if (qx.a(mv.class)) {
            return null;
        }
        try {
            return j;
        } catch (Throwable th) {
            qx.a(th, mv.class);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledThreadPoolExecutor e() {
        if (qx.a(mv.class)) {
            return null;
        }
        try {
            return e;
        } catch (Throwable th) {
            qx.a(th, mv.class);
            return null;
        }
    }

    public static final /* synthetic */ boolean f() {
        if (qx.a(mv.class)) {
            return false;
        }
        try {
            return i;
        } catch (Throwable th) {
            qx.a(th, mv.class);
            return false;
        }
    }

    public static final /* synthetic */ void g() {
        if (qx.a(mv.class)) {
            return;
        }
        try {
            i = true;
        } catch (Throwable th) {
            qx.a(th, mv.class);
        }
    }

    public static final /* synthetic */ String h() {
        if (qx.a(mv.class)) {
            return null;
        }
        try {
            return h;
        } catch (Throwable th) {
            qx.a(th, mv.class);
            return null;
        }
    }

    public mv(String str, String str2) {
        dqc.d(str, "activityName");
        qj.a();
        this.c = str;
        lk.b bVar = lk.l;
        lk a2 = lk.b.a();
        if (a2 != null && !a2.a() && (str2 == null || dqc.a((Object) str2, (Object) a2.h))) {
            this.d = new mo(a2);
        } else {
            str2 = str2 == null ? qi.a(ly.k()) : str2;
            if (str2 != null) {
                this.d = new mo(null, str2);
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        a.c();
    }

    public mv(Context context, String str) {
        this(qi.c(context), str);
    }

    public final void a(String str, Bundle bundle) {
        if (qx.a(this)) {
            return;
        }
        try {
            a(str, null, bundle, false, oe.b());
        } catch (Throwable th) {
            qx.a(th, this);
        }
    }

    public final void a() {
        if (qx.a(this)) {
            return;
        }
        try {
            ms.a(mx.EXPLICIT);
        } catch (Throwable th) {
            qx.a(th, this);
        }
    }

    public final void b(String str, Bundle bundle) {
        if (qx.a(this)) {
            return;
        }
        try {
            a(str, null, bundle, true, oe.b());
        } catch (Throwable th) {
            qx.a(th, this);
        }
    }

    public final void a(String str, Double d, Bundle bundle, boolean z, UUID uuid) {
        if (!qx.a(this) && str != null) {
            try {
                if (str.length() == 0) {
                    return;
                }
                if (pu.a("app_events_killswitch", ly.m(), false)) {
                    qc.a.a(mf.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                    return;
                }
                try {
                    a.a(new mq(this.c, str, d, bundle, z, oe.a(), uuid), this.d);
                } catch (FacebookException e2) {
                    qc.a.a(mf.APP_EVENTS, "AppEvents", "Invalid app event: %s", e2.toString());
                } catch (JSONException e3) {
                    qc.a.a(mf.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e3.toString());
                }
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0007J\u0006\u0010\"\u001a\u00020\u0019J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0004H\u0007J\b\u0010%\u001a\u00020&H\u0007J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010 \u001a\u00020!H\u0007J\b\u0010(\u001a\u00020\u0013H\u0007J\n\u0010)\u001a\u0004\u0018\u00010\u0004H\u0007J\n\u0010*\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010+\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010,\u001a\u00020\u0019H\u0002J\u0018\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0002J\u0010\u00102\u001a\u00020\u00192\u0006\u00103\u001a\u00020\u0004H\u0002J\b\u00104\u001a\u00020\u0019H\u0007J\u0010\u00105\u001a\u00020\u00192\u0006\u00106\u001a\u00020\u0013H\u0007J\u0012\u00107\u001a\u00020\u00192\b\u00108\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u00109\u001a\u00020\u00192\b\u0010:\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/facebook/appevents/AppEventsLoggerImpl$Companion;", "", "()V", "ACCOUNT_KIT_EVENT_NAME_PREFIX", "", "APP_EVENTS_KILLSWITCH", "APP_EVENT_NAME_PUSH_OPENED", "APP_EVENT_PREFERENCES", "APP_EVENT_PUSH_PARAMETER_ACTION", "APP_EVENT_PUSH_PARAMETER_CAMPAIGN", "APP_SUPPORTS_ATTRIBUTION_ID_RECHECK_PERIOD_IN_SECONDS", "", "PUSH_PAYLOAD_CAMPAIGN_KEY", "PUSH_PAYLOAD_KEY", "TAG", "anonymousAppDeviceGUID", "backgroundExecutor", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "flushBehaviorField", "Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "isActivateAppEventRequested", "", "pushNotificationsRegistrationIdField", "staticLock", "activateApp", "", "application", "Landroid/app/Application;", "applicationId", "augmentWebView", "webView", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "eagerFlush", "functionDEPRECATED", "extraMsg", "getAnalyticsExecutor", "Ljava/util/concurrent/Executor;", "getAnonymousAppDeviceGUID", "getFlushBehavior", "getInstallReferrer", "getPushNotificationsRegistrationId", "initializeLib", "initializeTimersIfNeeded", "logEvent", NotificationCompat.CATEGORY_EVENT, "Lcom/facebook/appevents/AppEvent;", "accessTokenAppId", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "notifyDeveloperError", "message", "onContextStop", "setFlushBehavior", "flushBehavior", "setInstallReferrer", "referrer", "setPushNotificationsRegistrationId", "registrationId", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: mv$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static int a() {
            int c2;
            synchronized (mv.b()) {
                c2 = mv.c();
            }
            return c2;
        }

        public static String b() {
            String d;
            synchronized (mv.b()) {
                d = mv.d();
            }
            return d;
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
        /* renamed from: mv$a$b */
        /* loaded from: classes2.dex */
        public static final class b implements Runnable {
            final /* synthetic */ Context a;
            final /* synthetic */ mv b;

            public b(Context context, mv mvVar) {
                this.a = context;
                this.b = mvVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (qx.a(this)) {
                    return;
                }
                try {
                    Bundle bundle = new Bundle();
                    String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
                    String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
                    int i = 0;
                    for (int i2 = 0; i2 < 11; i2++) {
                        String str = strArr[i2];
                        String str2 = strArr2[i2];
                        try {
                            Class.forName(str);
                            bundle.putInt(str2, 1);
                            i |= 1 << i2;
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                    SharedPreferences sharedPreferences = this.a.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                    if (sharedPreferences.getInt("kitsBitmask", 0) == i) {
                        return;
                    }
                    sharedPreferences.edit().putInt("kitsBitmask", i).apply();
                    this.b.b("fb_sdk_initialize", bundle);
                } catch (Throwable th) {
                    qx.a(th, this);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/facebook/appevents/AppEventsLoggerImpl$Companion$getInstallReferrer$1", "Lcom/facebook/internal/InstallReferrerUtil$Callback;", "onReceiveReferrerUrl", "", "s", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        /* renamed from: mv$a$a */
        /* loaded from: classes2.dex */
        public static final class C0040a implements pz.a {
            @Override // defpackage.pz.a
            public final void a(String str) {
                a aVar = mv.b;
                SharedPreferences sharedPreferences = ly.k().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                if (str != null) {
                    sharedPreferences.edit().putString("install_referrer", str).apply();
                }
            }
        }

        public static void c() {
            synchronized (mv.b()) {
                if (mv.e() != null) {
                    return;
                }
                mv.a(new ScheduledThreadPoolExecutor(1));
                dmg dmgVar = dmg.a;
                c cVar = c.a;
                ScheduledThreadPoolExecutor e = mv.e();
                if (e == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                e.scheduleAtFixedRate(cVar, 0L, 86400L, TimeUnit.SECONDS);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
        /* renamed from: mv$a$c */
        /* loaded from: classes2.dex */
        public static final class c implements Runnable {
            public static final c a = new c();

            c() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (qx.a(this)) {
                    return;
                }
                try {
                    HashSet<String> hashSet = new HashSet();
                    for (mo moVar : ms.b()) {
                        hashSet.add(moVar.b);
                    }
                    for (String str : hashSet) {
                        pw.a(str, true);
                    }
                } catch (Throwable th) {
                    qx.a(th, this);
                }
            }
        }

        static void a(mq mqVar, mo moVar) {
            ms.a(moVar, mqVar);
            if (pr.a(pr.b.OnDevicePostInstallEventProcessing) && ov.a()) {
                ov.a(moVar.b, mqVar);
            }
            if (mqVar.b || mv.f()) {
                return;
            }
            if (dqc.a((Object) mqVar.c, (Object) "fb_mobile_activate_app")) {
                mv.g();
            } else {
                qc.a.a(mf.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        }

        public static void a(String str) {
            qc.a.a(mf.DEVELOPER_ERRORS, "AppEvents", str);
        }

        public static String a(Context context) {
            dqc.d(context, "context");
            if (mv.h() == null) {
                synchronized (mv.b()) {
                    if (mv.h() == null) {
                        mv.a(context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null));
                        if (mv.h() == null) {
                            mv.a("XZ" + UUID.randomUUID().toString());
                            context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", mv.h()).apply();
                        }
                    }
                    dmg dmgVar = dmg.a;
                }
            }
            String h = mv.h();
            if (h != null) {
                return h;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    static {
        String canonicalName = mv.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        dqc.b(canonicalName, "AppEventsLoggerImpl::cla…ents.AppEventsLoggerImpl\"");
        a = canonicalName;
        f = mu.b.a;
        g = new Object();
    }
}
