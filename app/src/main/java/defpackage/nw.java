package defpackage;

import android.content.Context;
import defpackage.nx;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseAutoLogger;", "", "()V", "BILLING_CLIENT_PURCHASE_NAME", "", "logPurchase", "", "startIapLogging", "context", "Landroid/content/Context;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: nw  reason: default package */
/* loaded from: classes2.dex */
public final class nw {
    public static final nw a = new nw();

    private nw() {
    }

    public static final /* synthetic */ void a(nw nwVar) {
        if (qx.a(nw.class)) {
            return;
        }
        try {
            if (qx.a(nwVar)) {
                return;
            }
            nx.b bVar = nx.k;
            Map b2 = nx.b();
            nx.b bVar2 = nx.k;
            nz.a(b2, nx.c());
            nx.b bVar3 = nx.k;
            nx.b().clear();
        } catch (Throwable th) {
            qx.a(th, nw.class);
        }
    }

    public static final void a(Context context) {
        nx a2;
        if (qx.a(nw.class)) {
            return;
        }
        try {
            dqc.d(context, "context");
            if (oc.a("com.android.billingclient.api.Purchase") == null || (a2 = nx.k.a(context)) == null) {
                return;
            }
            nx.b bVar = nx.k;
            if (!nx.a().get()) {
                return;
            }
            if (nz.a()) {
                a aVar = a.a;
                if (qx.a(a2)) {
                    return;
                }
                dqc.d("inapp", "skuType");
                dqc.d(aVar, "queryPurchaseHistoryRunnable");
                nx.f fVar = new nx.f(aVar);
                if (qx.a(a2)) {
                    return;
                }
                try {
                    Object newProxyInstance = Proxy.newProxyInstance(a2.e.getClassLoader(), new Class[]{a2.e}, new nx.c(a2, fVar));
                    dqc.b(newProxyInstance, "Proxy.newProxyInstance(\n…istenerWrapper(runnable))");
                    oc.a(a2.b, a2.i, a2.a, "inapp", newProxyInstance);
                    return;
                } catch (Throwable th) {
                    qx.a(th, a2);
                    return;
                }
            }
            b bVar2 = b.a;
            if (qx.a(a2)) {
                return;
            }
            dqc.d("inapp", "skuType");
            dqc.d(bVar2, "querySkuRunnable");
            Object a3 = oc.a(a2.c, a2.g, oc.a(a2.b, a2.f, a2.a, "inapp"), new Object[0]);
            if (!(a3 instanceof List)) {
                a3 = null;
            }
            List<Object> list = (List) a3;
            if (list == null) {
                return;
            }
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    Object a4 = oc.a(a2.d, a2.h, obj, new Object[0]);
                    if (!(a4 instanceof String)) {
                        a4 = null;
                    }
                    String str = (String) a4;
                    if (str != null) {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has("productId")) {
                            String string = jSONObject.getString("productId");
                            arrayList.add(string);
                            Map<String, JSONObject> map = nx.j;
                            dqc.b(string, "skuID");
                            map.put(string, jSONObject);
                        }
                    }
                }
                a2.a("inapp", arrayList, bVar2);
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            qx.a(th2, nw.class);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: nw$a */
    /* loaded from: classes2.dex */
    static final class a implements Runnable {
        public static final a a = new a();

        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                nw.a(nw.a);
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: nw$b */
    /* loaded from: classes2.dex */
    static final class b implements Runnable {
        public static final b a = new b();

        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                nw.a(nw.a);
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }
}
