package defpackage;

import android.content.Context;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 )2\u00020\u0001:\u0005()*+,B«\u0001\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0016\u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001fJ\u0018\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u001fH\u0002J(\u0010$\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001a2\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0&2\u0006\u0010#\u001a\u00020\u001fH\u0002J\b\u0010'\u001a\u00020\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapper;", "", "context", "Landroid/content/Context;", "billingClient", "billingClientClazz", "Ljava/lang/Class;", "purchaseResultClazz", "purchaseClazz", "skuDetailsClazz", "purchaseHistoryRecordClazz", "skuDetailsResponseListenerClazz", "purchaseHistoryResponseListenerClazz", "queryPurchasesMethod", "Ljava/lang/reflect/Method;", "getPurchaseListMethod", "getOriginalJsonMethod", "getOriginalJsonSkuMethod", "getOriginalJsonPurchaseHistoryMethod", "querySkuDetailsAsyncMethod", "queryPurchaseHistoryAsyncMethod", "inAppPurchaseSkuDetailsWrapper", "Lcom/facebook/appevents/iap/InAppPurchaseSkuDetailsWrapper;", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Lcom/facebook/appevents/iap/InAppPurchaseSkuDetailsWrapper;)V", "historyPurchaseSet", "", "", "queryPurchase", "", "skuType", "querySkuRunnable", "Ljava/lang/Runnable;", "queryPurchaseHistory", "queryPurchaseHistoryRunnable", "queryPurchaseHistoryAsync", "runnable", "querySkuDetailsAsync", "skuIDs", "", "startConnection", "BillingClientStateListenerWrapper", "Companion", "PurchaseHistoryResponseListenerWrapper", "PurchasesUpdatedListenerWrapper", "SkuDetailsResponseListenerWrapper", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: nx  reason: default package */
/* loaded from: classes2.dex */
public final class nx {
    private static nx v;
    final Object a;
    final Class<?> b;
    final Class<?> c;
    final Class<?> d;
    final Class<?> e;
    final Method f;
    final Method g;
    final Method h;
    final Method i;
    private final Set<String> l;
    private final Context m;
    private final Class<?> n;
    private final Class<?> o;
    private final Class<?> p;
    private final Method q;
    private final Method r;
    private final Method s;
    private final ob t;
    public static final b k = new b((byte) 0);
    private static final AtomicBoolean u = new AtomicBoolean(false);
    private static final AtomicBoolean w = new AtomicBoolean(false);
    static final Map<String, JSONObject> j = new ConcurrentHashMap();
    private static final Map<String, JSONObject> x = new ConcurrentHashMap();

    public /* synthetic */ nx(Context context, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, ob obVar, byte b2) {
        this(context, obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, method, method2, method3, method4, method5, method6, method7, obVar);
    }

    public static final /* synthetic */ Class a(nx nxVar) {
        if (qx.a(nx.class)) {
            return null;
        }
        try {
            return nxVar.o;
        } catch (Throwable th) {
            qx.a(th, nx.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean a() {
        if (qx.a(nx.class)) {
            return null;
        }
        try {
            return w;
        } catch (Throwable th) {
            qx.a(th, nx.class);
            return null;
        }
    }

    public static final /* synthetic */ void a(nx nxVar, String str, List list, Runnable runnable) {
        if (qx.a(nx.class)) {
            return;
        }
        try {
            nxVar.a(str, list, runnable);
        } catch (Throwable th) {
            qx.a(th, nx.class);
        }
    }

    public static final /* synthetic */ Method b(nx nxVar) {
        if (qx.a(nx.class)) {
            return null;
        }
        try {
            return nxVar.r;
        } catch (Throwable th) {
            qx.a(th, nx.class);
            return null;
        }
    }

    public static final /* synthetic */ Map b() {
        if (qx.a(nx.class)) {
            return null;
        }
        try {
            return j;
        } catch (Throwable th) {
            qx.a(th, nx.class);
            return null;
        }
    }

    public static final /* synthetic */ Context c(nx nxVar) {
        if (qx.a(nx.class)) {
            return null;
        }
        try {
            return nxVar.m;
        } catch (Throwable th) {
            qx.a(th, nx.class);
            return null;
        }
    }

    public static final /* synthetic */ Map c() {
        if (qx.a(nx.class)) {
            return null;
        }
        try {
            return x;
        } catch (Throwable th) {
            qx.a(th, nx.class);
            return null;
        }
    }

    public static final /* synthetic */ Set d(nx nxVar) {
        if (qx.a(nx.class)) {
            return null;
        }
        try {
            return nxVar.l;
        } catch (Throwable th) {
            qx.a(th, nx.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean d() {
        if (qx.a(nx.class)) {
            return null;
        }
        try {
            return u;
        } catch (Throwable th) {
            qx.a(th, nx.class);
            return null;
        }
    }

    public static final /* synthetic */ Class e(nx nxVar) {
        if (qx.a(nx.class)) {
            return null;
        }
        try {
            return nxVar.n;
        } catch (Throwable th) {
            qx.a(th, nx.class);
            return null;
        }
    }

    public static final /* synthetic */ nx e() {
        if (qx.a(nx.class)) {
            return null;
        }
        try {
            return v;
        } catch (Throwable th) {
            qx.a(th, nx.class);
            return null;
        }
    }

    public static final /* synthetic */ Method f(nx nxVar) {
        if (qx.a(nx.class)) {
            return null;
        }
        try {
            return nxVar.q;
        } catch (Throwable th) {
            qx.a(th, nx.class);
            return null;
        }
    }

    public static final /* synthetic */ void g(nx nxVar) {
        if (qx.a(nx.class)) {
            return;
        }
        try {
            v = nxVar;
        } catch (Throwable th) {
            qx.a(th, nx.class);
        }
    }

    public static final /* synthetic */ void h(nx nxVar) {
        Class<?> a2;
        Method a3;
        if (qx.a(nx.class)) {
            return;
        }
        try {
            if (qx.a(nxVar) || (a2 = oc.a("com.android.billingclient.api.BillingClientStateListener")) == null || (a3 = oc.a(nxVar.b, "startConnection", a2)) == null) {
                return;
            }
            Object newProxyInstance = Proxy.newProxyInstance(a2.getClassLoader(), new Class[]{a2}, new a());
            dqc.b(newProxyInstance, "Proxy.newProxyInstance(\n…ntStateListenerWrapper())");
            oc.a(nxVar.b, a3, nxVar.a, newProxyInstance);
        } catch (Throwable th) {
            qx.a(th, nx.class);
        }
    }

    private nx(Context context, Object obj, Class<?> cls, Class<?> cls2, Class<?> cls3, Class<?> cls4, Class<?> cls5, Class<?> cls6, Class<?> cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, ob obVar) {
        this.m = context;
        this.a = obj;
        this.b = cls;
        this.c = cls2;
        this.d = cls3;
        this.n = cls4;
        this.o = cls5;
        this.p = cls6;
        this.e = cls7;
        this.f = method;
        this.g = method2;
        this.h = method3;
        this.q = method4;
        this.r = method5;
        this.s = method6;
        this.i = method7;
        this.t = obVar;
        this.l = new CopyOnWriteArraySet();
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: nx$f */
    /* loaded from: classes2.dex */
    static final class f implements Runnable {
        final /* synthetic */ Runnable b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public f(Runnable runnable) {
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                nx.a(nx.this, "inapp", new ArrayList(nx.d(nx.this)), this.b);
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, List<String> list, Runnable runnable) {
        if (qx.a(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(this.p.getClassLoader(), new Class[]{this.p}, new e(this, runnable));
            dqc.b(newProxyInstance, "Proxy.newProxyInstance(\n…istenerWrapper(runnable))");
            oc.a(this.b, this.s, this.a, this.t.a(str, list), newProxyInstance);
        } catch (Throwable th) {
            qx.a(th, this);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapper$BillingClientStateListenerWrapper;", "Ljava/lang/reflect/InvocationHandler;", "()V", "invoke", "", "proxy", "m", "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: nx$a */
    /* loaded from: classes2.dex */
    public static final class a implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (qx.a(this)) {
                return null;
            }
            try {
                dqc.d(obj, "proxy");
                dqc.d(method, "m");
                if (dqc.a((Object) method.getName(), (Object) "onBillingSetupFinished")) {
                    b bVar = nx.k;
                    nx.a().set(true);
                } else {
                    String name = method.getName();
                    dqc.b(name, "m.name");
                    if (dsg.d(name, "onBillingServiceDisconnected")) {
                        b bVar2 = nx.k;
                        nx.a().set(false);
                    }
                }
                return null;
            } catch (Throwable th) {
                qx.a(th, this);
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapper$PurchasesUpdatedListenerWrapper;", "Ljava/lang/reflect/InvocationHandler;", "()V", "invoke", "", "proxy", "m", "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: nx$d */
    /* loaded from: classes2.dex */
    public static final class d implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (qx.a(this)) {
                return null;
            }
            try {
                dqc.d(obj, "proxy");
                dqc.d(method, "m");
                return null;
            } catch (Throwable th) {
                qx.a(th, this);
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0081\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0002J0\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0002\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapper$PurchaseHistoryResponseListenerWrapper;", "Ljava/lang/reflect/InvocationHandler;", "runnable", "Ljava/lang/Runnable;", "(Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapper;Ljava/lang/Runnable;)V", "getRunnable", "()Ljava/lang/Runnable;", "setRunnable", "(Ljava/lang/Runnable;)V", "getPurchaseHistoryRecord", "", "purchaseHistoryRecordList", "", "invoke", "", "proxy", "method", "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: nx$c */
    /* loaded from: classes2.dex */
    public final class c implements InvocationHandler {
        final /* synthetic */ nx a;
        private Runnable b;

        public c(nx nxVar, Runnable runnable) {
            dqc.d(runnable, "runnable");
            this.a = nxVar;
            this.b = runnable;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (qx.a(this)) {
                return null;
            }
            try {
                dqc.d(obj, "proxy");
                dqc.d(method, "method");
                if (dqc.a((Object) method.getName(), (Object) "onPurchaseHistoryResponse")) {
                    List list = objArr != null ? objArr[1] : null;
                    if (list != null && (list instanceof List)) {
                        List<Object> list2 = list;
                        if (!qx.a(this)) {
                            for (Object obj2 : list2) {
                                try {
                                    Object a = oc.a(nx.a(this.a), nx.b(this.a), obj2, new Object[0]);
                                    if (!(a instanceof String)) {
                                        a = null;
                                    }
                                    String str = (String) a;
                                    if (str != null) {
                                        JSONObject jSONObject = new JSONObject(str);
                                        jSONObject.put("packageName", nx.c(this.a).getPackageName());
                                        if (jSONObject.has("productId")) {
                                            String string = jSONObject.getString("productId");
                                            nx.d(this.a).add(string);
                                            b bVar = nx.k;
                                            Map b = nx.b();
                                            dqc.b(string, "skuID");
                                            b.put(string, jSONObject);
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            this.b.run();
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                qx.a(th, this);
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0081\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapper$SkuDetailsResponseListenerWrapper;", "Ljava/lang/reflect/InvocationHandler;", "runnable", "Ljava/lang/Runnable;", "(Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapper;Ljava/lang/Runnable;)V", "getRunnable", "()Ljava/lang/Runnable;", "setRunnable", "(Ljava/lang/Runnable;)V", "invoke", "", "proxy", "m", "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "parseSkuDetails", "", "skuDetailsObjectList", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: nx$e */
    /* loaded from: classes2.dex */
    public final class e implements InvocationHandler {
        final /* synthetic */ nx a;
        private Runnable b;

        public e(nx nxVar, Runnable runnable) {
            dqc.d(runnable, "runnable");
            this.a = nxVar;
            this.b = runnable;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (qx.a(this)) {
                return null;
            }
            try {
                dqc.d(obj, "proxy");
                dqc.d(method, "m");
                if (dqc.a((Object) method.getName(), (Object) "onSkuDetailsResponse")) {
                    List list = objArr != null ? objArr[1] : null;
                    if (list != null && (list instanceof List)) {
                        List<Object> list2 = list;
                        if (!qx.a(this)) {
                            dqc.d(list2, "skuDetailsObjectList");
                            for (Object obj2 : list2) {
                                try {
                                    Object a = oc.a(nx.e(this.a), nx.f(this.a), obj2, new Object[0]);
                                    if (!(a instanceof String)) {
                                        a = null;
                                    }
                                    String str = (String) a;
                                    if (str != null) {
                                        JSONObject jSONObject = new JSONObject(str);
                                        if (jSONObject.has("productId")) {
                                            String string = jSONObject.getString("productId");
                                            b bVar = nx.k;
                                            Map c = nx.c();
                                            dqc.b(string, "skuID");
                                            c.put(string, jSONObject);
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            this.b.run();
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                qx.a(th, this);
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010,\u001a\u0004\u0018\u00010\u00012\b\u0010-\u001a\u0004\u0018\u00010.2\n\u0010/\u001a\u0006\u0012\u0002\b\u000300H\u0002J\u0010\u00101\u001a\u0002022\u0006\u0010-\u001a\u00020.H\u0002J\u0012\u00103\u001a\u0004\u0018\u00010\"2\u0006\u0010-\u001a\u00020.H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010#\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001d\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020'0&¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001d\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020'0&¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)¨\u00064"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapper$Companion;", "", "()V", "CLASSNAME_BILLING_CLIENT", "", "CLASSNAME_BILLING_CLIENT_BUILDER", "CLASSNAME_BILLING_CLIENT_STATE_LISTENER", "CLASSNAME_PURCHASE", "CLASSNAME_PURCHASES_RESULT", "CLASSNAME_PURCHASE_HISTORY_RECORD", "CLASSNAME_PURCHASE_HISTORY_RESPONSE_LISTENER", "CLASSNAME_PURCHASE_UPDATED_LISTENER", "CLASSNAME_SKU_DETAILS", "CLASSNAME_SKU_DETAILS_RESPONSE_LISTENER", "IN_APP", "METHOD_BUILD", "METHOD_ENABLE_PENDING_PURCHASES", "METHOD_GET_ORIGINAL_JSON", "METHOD_GET_PURCHASE_LIST", "METHOD_NEW_BUILDER", "METHOD_ON_BILLING_SERVICE_DISCONNECTED", "METHOD_ON_BILLING_SETUP_FINISHED", "METHOD_ON_PURCHASE_HISTORY_RESPONSE", "METHOD_ON_SKU_DETAILS_RESPONSE", "METHOD_QUERY_PURCHASES", "METHOD_QUERY_PURCHASE_HISTORY_ASYNC", "METHOD_QUERY_SKU_DETAILS_ASYNC", "METHOD_SET_LISTENER", "METHOD_START_CONNECTION", "PACKAGE_NAME", "PRODUCT_ID", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "instance", "Lcom/facebook/appevents/iap/InAppPurchaseBillingClientWrapper;", "isServiceConnected", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "purchaseDetailsMap", "", "Lorg/json/JSONObject;", "getPurchaseDetailsMap", "()Ljava/util/Map;", "skuDetailsMap", "getSkuDetailsMap", "createBillingClient", "context", "Landroid/content/Context;", "billingClientClazz", "Ljava/lang/Class;", "createInstance", "", "getOrCreateInstance", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: nx$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:70:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x01c7 A[Catch: all -> 0x0205, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0012, B:9:0x0018, B:11:0x0026, B:13:0x002d, B:17:0x003e, B:23:0x006f, B:24:0x0078, B:27:0x0089, B:36:0x00c2, B:45:0x0120, B:49:0x0132, B:55:0x016d, B:58:0x017d, B:61:0x01a3, B:64:0x01ac, B:71:0x01c7, B:73:0x01ec, B:74:0x01f0, B:75:0x01f7, B:76:0x01f8), top: B:81:0x0003 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final synchronized defpackage.nx a(android.content.Context r29) {
            /*
                Method dump skipped, instructions count: 520
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.nx.b.a(android.content.Context):nx");
        }
    }
}
