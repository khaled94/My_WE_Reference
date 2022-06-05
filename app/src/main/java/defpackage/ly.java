package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import androidx.core.app.NotificationCompat;
import com.facebook.FacebookException;
import defpackage.lk;
import defpackage.lz;
import defpackage.mg;
import defpackage.mu;
import defpackage.mv;
import defpackage.og;
import defpackage.pg;
import defpackage.ph;
import defpackage.pr;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u008e\u0001\u008f\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020=H\u0007J\b\u0010F\u001a\u00020DH\u0007J\b\u0010G\u001a\u00020DH\u0007J\b\u0010H\u001a\u00020(H\u0007J\b\u0010I\u001a\u00020$H\u0007J\b\u0010J\u001a\u00020\u0004H\u0007J\n\u0010K\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010L\u001a\u0004\u0018\u00010\u00042\b\u0010M\u001a\u0004\u0018\u00010$H\u0007J\b\u0010N\u001a\u00020(H\u0007J\b\u0010O\u001a\u00020(H\u0007J\n\u0010P\u001a\u0004\u0018\u00010+H\u0007J\b\u0010Q\u001a\u00020\u0015H\u0007J\n\u0010R\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010S\u001a\u00020(H\u0007J\b\u0010T\u001a\u00020(H\u0007J\b\u0010U\u001a\u000200H\u0007J\b\u0010V\u001a\u00020\u0004H\u0007J\b\u0010W\u001a\u00020\u0004H\u0007J\b\u0010X\u001a\u00020\u0004H\u0007J\b\u0010Y\u001a\u00020\u0004H\u0007J\u0010\u0010Z\u001a\u00020(2\u0006\u0010M\u001a\u00020$H\u0007J\u000e\u0010[\u001a\b\u0012\u0004\u0012\u00020=0\\H\u0007J\b\u0010]\u001a\u00020(H\u0007J\b\u0010^\u001a\u00020_H\u0007J\b\u0010`\u001a\u00020\u0004H\u0007J\b\u0010a\u001a\u00020(H\u0007J\u0010\u0010b\u001a\u00020(2\u0006\u0010c\u001a\u00020\u0015H\u0007J\b\u00109\u001a\u00020(H\u0007J\b\u0010d\u001a\u00020(H\u0007J\b\u0010:\u001a\u00020(H\u0007J\u0010\u0010e\u001a\u00020(2\u0006\u0010E\u001a\u00020=H\u0007J\u0017\u0010f\u001a\u00020D2\b\u0010M\u001a\u0004\u0018\u00010$H\u0001¢\u0006\u0002\bgJ\u0018\u0010h\u001a\u00020D2\u0006\u0010M\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0004H\u0003J\u0018\u0010i\u001a\u00020D2\u0006\u0010M\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0010\u0010j\u001a\u00020D2\u0006\u0010E\u001a\u00020=H\u0007J\u0010\u0010k\u001a\u00020D2\u0006\u0010#\u001a\u00020$H\u0007J\u001a\u0010k\u001a\u00020D2\u0006\u0010#\u001a\u00020$2\b\u0010l\u001a\u0004\u0018\u00010mH\u0007J\u0018\u0010k\u001a\u00020D2\u0006\u0010#\u001a\u00020$2\u0006\u0010,\u001a\u00020\u0015H\u0007J\"\u0010k\u001a\u00020D2\u0006\u0010#\u001a\u00020$2\u0006\u0010,\u001a\u00020\u00152\b\u0010l\u001a\u0004\u0018\u00010mH\u0007J\u0010\u0010n\u001a\u00020D2\u0006\u0010o\u001a\u00020(H\u0007J\u0010\u0010p\u001a\u00020D2\u0006\u0010%\u001a\u00020\u0004H\u0007J\u0012\u0010q\u001a\u00020D2\b\u0010&\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010r\u001a\u00020D2\u0006\u0010o\u001a\u00020(H\u0007J\u0010\u0010s\u001a\u00020D2\u0006\u0010o\u001a\u00020(H\u0007J\u0010\u0010t\u001a\u00020D2\u0006\u0010)\u001a\u00020+H\u0007J\u0012\u0010u\u001a\u00020D2\b\u0010v\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010w\u001a\u00020D2\u0006\u0010o\u001a\u00020(H\u0007J\u001d\u0010x\u001a\u00020D2\u000e\u0010y\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010zH\u0007¢\u0006\u0002\u0010{J-\u0010x\u001a\u00020D2\u000e\u0010y\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010z2\u0006\u0010|\u001a\u00020\u00152\u0006\u0010}\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010~J\u0010\u0010\u007f\u001a\u00020D2\u0006\u0010/\u001a\u000200H\u0007J\u0011\u0010\u0080\u0001\u001a\u00020D2\u0006\u00101\u001a\u00020\u0004H\u0007J\u0011\u0010\u0081\u0001\u001a\u00020D2\u0006\u00102\u001a\u00020\u0004H\u0007J\u0017\u0010\u0082\u0001\u001a\u00020D2\u0006\u00103\u001a\u000204H\u0001¢\u0006\u0003\b\u0083\u0001J\u0012\u0010\u0084\u0001\u001a\u00020D2\u0007\u0010\u0085\u0001\u001a\u00020(H\u0007J\u0012\u0010\u0086\u0001\u001a\u00020D2\u0007\u0010\u0087\u0001\u001a\u00020(H\u0007J\u001a\u0010\u0088\u0001\u001a\u00020D2\u0006\u0010M\u001a\u00020$2\u0007\u0010\u0089\u0001\u001a\u00020(H\u0007J\u0011\u0010\u008a\u0001\u001a\u00020D2\u0006\u0010o\u001a\u00020(H\u0007J\u0012\u0010\u008b\u0001\u001a\u00020D2\u0007\u0010\u008c\u0001\u001a\u00020_H\u0007J\t\u0010\u008d\u0001\u001a\u00020DH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010'\u001a\u00020(8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010-\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0004\n\u0002\u0010.R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u00105\u001a\u00020(8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u00106\u001a\u00020(8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010;\u001a\u0012\u0012\u0004\u0012\u00020=0<j\b\u0012\u0004\u0012\u00020=`>X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020@X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020BX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0090\u0001"}, d2 = {"Lcom/facebook/FacebookSdk;", "", "()V", "ADVERTISER_ID_COLLECTION_ENABLED_PROPERTY", "", "APPLICATION_ID_PROPERTY", "APPLICATION_NAME_PROPERTY", "APP_EVENT_PREFERENCES", "ATTRIBUTION_PREFERENCES", "AUTO_INIT_ENABLED_PROPERTY", "AUTO_LOG_APP_EVENTS_ENABLED_PROPERTY", "CALLBACK_OFFSET_CHANGED_AFTER_INIT", "CALLBACK_OFFSET_NEGATIVE", "CALLBACK_OFFSET_PROPERTY", "CLIENT_TOKEN_PROPERTY", "CODELESS_DEBUG_LOG_ENABLED_PROPERTY", "DATA_PROCESSING_OPTIONS_PREFERENCES", "DATA_PROCESSION_OPTIONS", "DATA_PROCESSION_OPTIONS_COUNTRY", "DATA_PROCESSION_OPTIONS_STATE", "DEFAULT_CALLBACK_REQUEST_CODE_OFFSET", "", "FACEBOOK_COM", "FB_GG", "GAMING", "INSTAGRAM", "INSTAGRAM_COM", "LOCK", "Ljava/util/concurrent/locks/ReentrantLock;", "MAX_REQUEST_CODE_RANGE", "MONITOR_ENABLED_PROPERTY", "PUBLISH_ACTIVITY_PATH", "TAG", "WEB_DIALOG_THEME", "appClientToken", "applicationContext", "Landroid/content/Context;", "applicationId", "applicationName", "bypassAppSwitch", "", "cacheDir", "Lcom/facebook/internal/LockOnGetVariable;", "Ljava/io/File;", "callbackRequestCodeOffset", "codelessDebugLogEnabled", "Ljava/lang/Boolean;", "executor", "Ljava/util/concurrent/Executor;", "facebookDomain", "graphApiVersion", "graphRequestCreator", "Lcom/facebook/FacebookSdk$GraphRequestCreator;", "hasCustomTabsPrefetching", "ignoreAppSwitchToLoggedOut", "instagramDomain", "isDebugEnabledField", "isFullyInitialized", "isLegacyTokenUpgradeSupported", "loggingBehaviors", "Ljava/util/HashSet;", "Lcom/facebook/LoggingBehavior;", "Lkotlin/collections/HashSet;", "onProgressThreshold", "Ljava/util/concurrent/atomic/AtomicLong;", "sdkInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "addLoggingBehavior", "", "behavior", "clearLoggingBehaviors", "fullyInitialize", "getAdvertiserIDCollectionEnabled", "getApplicationContext", "getApplicationId", "getApplicationName", "getApplicationSignature", "context", "getAutoInitEnabled", "getAutoLogAppEventsEnabled", "getCacheDir", "getCallbackRequestCodeOffset", "getClientToken", "getCodelessDebugLogEnabled", "getCodelessSetupEnabled", "getExecutor", "getFacebookDomain", "getGraphApiVersion", "getGraphDomain", "getInstagramDomain", "getLimitEventAndDataUsage", "getLoggingBehaviors", "", "getMonitorEnabled", "getOnProgressThreshold", "", "getSdkVersion", "isDebugEnabled", "isFacebookRequestCode", "requestCode", "isInitialized", "isLoggingBehaviorEnabled", "loadDefaultsFromMetadata", "loadDefaultsFromMetadata$facebook_core_release", "publishInstallAndWaitForResponse", "publishInstallAsync", "removeLoggingBehavior", "sdkInitialize", "callback", "Lcom/facebook/FacebookSdk$InitializeCallback;", "setAdvertiserIDCollectionEnabled", "flag", "setApplicationId", "setApplicationName", "setAutoInitEnabled", "setAutoLogAppEventsEnabled", "setCacheDir", "setClientToken", "clientToken", "setCodelessDebugLogEnabled", "setDataProcessingOptions", "options", "", "([Ljava/lang/String;)V", "country", "state", "([Ljava/lang/String;II)V", "setExecutor", "setFacebookDomain", "setGraphApiVersion", "setGraphRequestCreator", "setGraphRequestCreator$facebook_core_release", "setIsDebugEnabled", "enabled", "setLegacyTokenUpgradeSupported", "supported", "setLimitEventAndDataUsage", "limitEventUsage", "setMonitorEnabled", "setOnProgressThreshold", "threshold", "updateGraphDebugBehavior", "GraphRequestCreator", "InitializeCallback", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: ly  reason: default package */
/* loaded from: classes2.dex */
public final class ly {
    public static boolean a;
    public static boolean b;
    public static boolean c;
    private static Executor g;
    private static volatile String h;
    private static volatile String i;
    private static volatile String j;
    private static volatile Boolean k;
    private static volatile boolean m;
    private static boolean n;
    private static qb<File> o;
    private static Context p;
    private static boolean x;
    public static final ly d = new ly();
    private static final String e = ly.class.getCanonicalName();
    private static final HashSet<mf> f = dnm.b(mf.DEVELOPER_ERRORS);
    private static AtomicLong l = new AtomicLong(65536);
    private static int q = 64206;
    private static final ReentrantLock r = new ReentrantLock();
    private static String s = qg.a();
    private static final AtomicBoolean t = new AtomicBoolean(false);
    private static volatile String u = "instagram.com";
    private static volatile String v = "facebook.com";
    private static a w = c.a;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bá\u0080\u0001\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&¨\u0006\f"}, d2 = {"Lcom/facebook/FacebookSdk$GraphRequestCreator;", "", "createPostRequest", "Lcom/facebook/GraphRequest;", "accessToken", "Lcom/facebook/AccessToken;", "publishUrl", "", "publishParams", "Lorg/json/JSONObject;", "callback", "Lcom/facebook/GraphRequest$Callback;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: ly$a */
    /* loaded from: classes2.dex */
    public interface a {
        lz a(String str, JSONObject jSONObject);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/facebook/FacebookSdk$InitializeCallback;", "", "onInitialized", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: ly$b */
    /* loaded from: classes2.dex */
    public interface b {
    }

    public static final String l() {
        return "12.3.0";
    }

    private ly() {
    }

    public static final /* synthetic */ void a(ly lyVar, Context context, String str) {
        try {
            if (qx.a(lyVar)) {
                return;
            }
            try {
                pg.a aVar = pg.e;
                pg a2 = pg.a.a(context);
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                String str2 = str + "ping";
                long j2 = sharedPreferences.getLong(str2, 0L);
                try {
                    og.a aVar2 = og.a.MOBILE_INSTALL_EVENT;
                    mu.a aVar3 = mu.b;
                    JSONObject a3 = og.a(aVar2, a2, mu.a.b(context), b(context), context);
                    dqi dqiVar = dqi.a;
                    String format = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
                    dqc.b(format, "java.lang.String.format(format, *args)");
                    lz a4 = w.a(format, a3);
                    if (j2 != 0 || lz.k.a(a4).c != null) {
                        return;
                    }
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putLong(str2, System.currentTimeMillis());
                    edit.apply();
                } catch (JSONException e2) {
                    throw new FacebookException("An error occurred while publishing install.", e2);
                }
            } catch (Exception e3) {
                qi.a("Facebook-publish", e3);
            }
        } catch (Throwable th) {
            qx.a(th, lyVar);
        }
    }

    public static final /* synthetic */ Context t() {
        Context context = p;
        if (context == null) {
            dqc.a("applicationContext");
        }
        return context;
    }

    @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "Lcom/facebook/GraphRequest;", "accessToken", "Lcom/facebook/AccessToken;", "publishUrl", "", "publishParams", "Lorg/json/JSONObject;", "callback", "Lcom/facebook/GraphRequest$Callback;", "createPostRequest"}, k = 3, mv = {1, 5, 1})
    /* renamed from: ly$c */
    /* loaded from: classes2.dex */
    static final class c implements a {
        public static final c a = new c();

        c() {
        }

        @Override // defpackage.ly.a
        public final lz a(String str, JSONObject jSONObject) {
            lz.c cVar = lz.k;
            return lz.c.a((lk) null, str, jSONObject, (lz.b) null);
        }
    }

    /* JADX WARN: Finally extract failed */
    public static final Executor a() {
        ReentrantLock reentrantLock = r;
        reentrantLock.lock();
        try {
            if (g == null) {
                g = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            dmg dmgVar = dmg.a;
            reentrantLock.unlock();
            Executor executor = g;
            if (executor == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            return executor;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final long b() {
        qj.a();
        return l.get();
    }

    public static final boolean c() {
        return m;
    }

    public static final boolean d() {
        return n;
    }

    public static final String e() {
        dqi dqiVar = dqi.a;
        dqc.b(String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{s}, 1)), "java.lang.String.format(format, *args)");
        qi.a();
        return s;
    }

    public static final synchronized boolean f() {
        boolean z;
        synchronized (ly.class) {
            z = x;
        }
        return z;
    }

    public static final String g() {
        return v;
    }

    public static final String h() {
        return u;
    }

    public static final synchronized void a(Context context) {
        synchronized (ly.class) {
            dqc.d(context, "applicationContext");
            c(context);
        }
    }

    private static synchronized void c(Context context) {
        synchronized (ly.class) {
            dqc.d(context, "applicationContext");
            if (t.get()) {
                return;
            }
            qj.b(context);
            qj.a(context);
            Context applicationContext = context.getApplicationContext();
            dqc.b(applicationContext, "applicationContext.applicationContext");
            p = applicationContext;
            mu.a aVar = mu.b;
            mu.a.b(context);
            Context context2 = p;
            if (context2 == null) {
                dqc.a("applicationContext");
            }
            if (context2 != null) {
                try {
                    ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo(context2.getPackageName(), 128);
                    if (applicationInfo.metaData != null) {
                        if (h == null) {
                            Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                            if (obj instanceof String) {
                                Locale locale = Locale.ROOT;
                                dqc.b(locale, "Locale.ROOT");
                                String lowerCase = ((String) obj).toLowerCase(locale);
                                dqc.b(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                                if (dsg.c(lowerCase, "fb")) {
                                    String substring = ((String) obj).substring(2);
                                    dqc.b(substring, "(this as java.lang.String).substring(startIndex)");
                                    h = substring;
                                } else {
                                    h = (String) obj;
                                }
                            } else if (obj instanceof Number) {
                                throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                            }
                        }
                        if (i == null) {
                            i = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
                        }
                        if (j == null) {
                            j = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
                        }
                        if (q == 64206) {
                            q = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
                        }
                        if (k == null) {
                            k = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            if (qi.a(h)) {
                throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
            }
            t.set(true);
            if (mn.b()) {
                x = true;
            }
            Context context3 = p;
            if (context3 == null) {
                dqc.a("applicationContext");
            }
            if ((context3 instanceof Application) && mn.c()) {
                Context context4 = p;
                if (context4 == null) {
                    dqc.a("applicationContext");
                }
                if (context4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
                }
                oe.a((Application) context4, h);
            }
            pw.a();
            qd.b();
            ph.a aVar2 = ph.a;
            Context context5 = p;
            if (context5 == null) {
                dqc.a("applicationContext");
            }
            dqc.d(context5, "context");
            if (ph.a() != null) {
                ph.a();
            } else {
                ph phVar = new ph(context5, (byte) 0);
                ph.b(phVar);
                ph.a(phVar);
                ph.a();
            }
            o = new qb<>(e.a);
            pr.a(pr.b.Instrument, f.a);
            pr.a(pr.b.AppEvents, g.a);
            pr.a(pr.b.ChromeCustomTabsPrefetching, h.a);
            pr.a(pr.b.IgnoreAppSwitchToLoggedOut, i.a);
            pr.a(pr.b.BypassAppSwitch, j.a);
            a().execute(new FutureTask(new k()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "enabled", "", "onCompleted"}, k = 3, mv = {1, 5, 1})
    /* renamed from: ly$f */
    /* loaded from: classes2.dex */
    public static final class f implements pr.a {
        public static final f a = new f();

        f() {
        }

        @Override // defpackage.pr.a
        public final void a(boolean z) {
            if (z) {
                qs.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "enabled", "", "onCompleted"}, k = 3, mv = {1, 5, 1})
    /* renamed from: ly$g */
    /* loaded from: classes2.dex */
    public static final class g implements pr.a {
        public static final g a = new g();

        g() {
        }

        @Override // defpackage.pr.a
        public final void a(boolean z) {
            if (z) {
                mw.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "enabled", "", "onCompleted"}, k = 3, mv = {1, 5, 1})
    /* renamed from: ly$h */
    /* loaded from: classes2.dex */
    public static final class h implements pr.a {
        public static final h a = new h();

        h() {
        }

        @Override // defpackage.pr.a
        public final void a(boolean z) {
            if (z) {
                ly.a = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "enabled", "", "onCompleted"}, k = 3, mv = {1, 5, 1})
    /* renamed from: ly$i */
    /* loaded from: classes2.dex */
    public static final class i implements pr.a {
        public static final i a = new i();

        i() {
        }

        @Override // defpackage.pr.a
        public final void a(boolean z) {
            if (z) {
                ly.b = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "enabled", "", "onCompleted"}, k = 3, mv = {1, 5, 1})
    /* renamed from: ly$j */
    /* loaded from: classes2.dex */
    public static final class j implements pr.a {
        public static final j a = new j();

        j() {
        }

        @Override // defpackage.pr.a
        public final void a(boolean z) {
            if (z) {
                ly.c = true;
            }
        }
    }

    public static final boolean i() {
        return t.get();
    }

    public static final boolean a(mf mfVar) {
        boolean z;
        dqc.d(mfVar, "behavior");
        synchronized (f) {
            if (m) {
                if (f.contains(mfVar)) {
                    z = true;
                }
            }
            z = false;
        }
        return z;
    }

    public static final String j() {
        lk.b bVar = lk.l;
        lk a2 = lk.b.a();
        return qi.g(a2 != null ? a2.k : null);
    }

    public static final Context k() {
        qj.a();
        Context context = p;
        if (context == null) {
            dqc.a("applicationContext");
        }
        return context;
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: ly$d */
    /* loaded from: classes2.dex */
    static final class d implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        d(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                ly lyVar = ly.d;
                Context context = this.a;
                dqc.b(context, "applicationContext");
                ly.a(lyVar, context, this.b);
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    public static final void a(Context context, String str) {
        if (qx.a(ly.class)) {
            return;
        }
        try {
            dqc.d(context, "context");
            dqc.d(str, "applicationId");
            a().execute(new d(context.getApplicationContext(), str));
            if (!pr.a(pr.b.OnDeviceEventProcessing) || !ov.a()) {
                return;
            }
            ov.a(str, "com.facebook.sdk.attributionTracking");
        } catch (Throwable th) {
            qx.a(th, ly.class);
        }
    }

    public static final boolean b(Context context) {
        dqc.d(context, "context");
        qj.a();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static final String m() {
        qj.a();
        String str = h;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final String n() {
        qj.a();
        return i;
    }

    public static final String o() {
        qj.a();
        return j;
    }

    public static final boolean p() {
        return mn.c();
    }

    public static final boolean q() {
        return mn.e();
    }

    public static final boolean r() {
        return mn.d();
    }

    public static final int s() {
        qj.a();
        return q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/io/File;", "kotlin.jvm.PlatformType", NotificationCompat.CATEGORY_CALL}, k = 3, mv = {1, 5, 1})
    /* renamed from: ly$e */
    /* loaded from: classes2.dex */
    public static final class e<V> implements Callable {
        public static final e a = new e();

        e() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            ly lyVar = ly.d;
            return ly.t().getCacheDir();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", NotificationCompat.CATEGORY_CALL}, k = 3, mv = {1, 5, 1})
    /* renamed from: ly$k */
    /* loaded from: classes2.dex */
    public static final class k<V> implements Callable {
        final /* synthetic */ b a = null;

        k() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            ln a = ln.c.a();
            lk a2 = a.b.a();
            if (a2 != null) {
                a.a(a2, false);
            }
            mi a3 = mi.c.a();
            mg a4 = a3.b.a();
            if (a4 != null) {
                a3.a(a4, false);
            }
            lk.b bVar = lk.l;
            if (lk.b.b()) {
                mg.a aVar = mg.a;
                if (mi.c.a().a == null) {
                    mg.a aVar2 = mg.a;
                    mg.a.a();
                }
            }
            mu.a aVar3 = mu.b;
            Context k = ly.k();
            ly lyVar = ly.d;
            String str = ly.h;
            dqc.d(k, "context");
            mv.a aVar4 = mv.b;
            dqc.d(k, "context");
            if (ly.p()) {
                mv mvVar = new mv(k, str);
                ScheduledThreadPoolExecutor e = mv.e();
                if (e == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                e.execute(new mv.a.b(k, mvVar));
            }
            mn.a();
            mu.a aVar5 = mu.b;
            Context applicationContext = ly.k().getApplicationContext();
            dqc.b(applicationContext, "getApplicationContext().applicationContext");
            mu.a.a(applicationContext).a.a();
            return null;
        }
    }
}
