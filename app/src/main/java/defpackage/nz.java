package defpackage;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\t\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J-\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00150\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00150\rH\u0001¢\u0006\u0002\b\u0017J\r\u0010\u0018\u001a\u00020\u0019H\u0001¢\u0006\u0002\b\u001aJC\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00150\u00142\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0001¢\u0006\u0002\b\u001dJ\b\u0010\u001e\u001a\u00020\u001fH\u0007J2\u0010 \u001a\u00020\u00192\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00150\r2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0007J\u001c\u0010!\u001a\u00020\u00192\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0014H\u0002J\b\u0010\"\u001a\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseLoggerManager;", "", "()V", "CACHE_CLEAR_TIME_LIMIT_SEC", "", "LAST_CLEARED_TIME", "", "LAST_QUERY_PURCHASE_HISTORY_TIME", "PRODUCT_DETAILS_STORE", "PURCHASE_DETAILS_SET", "PURCHASE_IN_CACHE_INTERVAL", "PURCHASE_TIME", "cachedPurchaseMap", "", "", "cachedPurchaseSet", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "cacheDeDupPurchase", "", "Lorg/json/JSONObject;", "purchaseDetailsMap", "cacheDeDupPurchase$facebook_core_release", "clearOutdatedProductInfoInCache", "", "clearOutdatedProductInfoInCache$facebook_core_release", "constructLoggingReadyMap", "skuDetailsMap", "constructLoggingReadyMap$facebook_core_release", "eligibleQueryPurchaseHistory", "", "filterPurchaseLogging", "logPurchases", "readPurchaseCache", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: nz  reason: default package */
/* loaded from: classes2.dex */
public final class nz {
    private static SharedPreferences b;
    public static final nz a = new nz();
    private static final Set<String> c = new CopyOnWriteArraySet();
    private static final Map<String, Long> d = new ConcurrentHashMap();

    private nz() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void b() {
        if (qx.a(this)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = ly.k().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = ly.k().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            if (sharedPreferences.contains("LAST_CLEARED_TIME")) {
                sharedPreferences.edit().clear().apply();
                sharedPreferences2.edit().clear().apply();
            }
            SharedPreferences sharedPreferences3 = ly.k().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            dqc.b(sharedPreferences3, "getApplicationContext().…RE, Context.MODE_PRIVATE)");
            b = sharedPreferences3;
            Set<String> set = c;
            if (sharedPreferences3 == null) {
                dqc.a("sharedPreferences");
            }
            Set<String> stringSet = sharedPreferences3.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
            if (stringSet == null) {
                stringSet = new HashSet<>();
            }
            set.addAll(stringSet);
            for (String str : c) {
                List a2 = dsg.a(str, new String[]{";"}, 2, 2);
                d.put(a2.get(0), Long.valueOf(Long.parseLong((String) a2.get(1))));
            }
            c();
        } catch (Throwable th) {
            qx.a(th, this);
        }
    }

    public static final void a(Map<String, JSONObject> map, Map<String, ? extends JSONObject> map2) {
        if (qx.a(nz.class)) {
            return;
        }
        try {
            dqc.d(map, "purchaseDetailsMap");
            dqc.d(map2, "skuDetailsMap");
            a.b();
            nz nzVar = a;
            Map<String, String> b2 = nzVar.b(nzVar.a(map), map2);
            if (qx.a(a)) {
                return;
            }
            for (Map.Entry<String, String> entry : b2.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null && value != null) {
                    oh.a(key, value, false);
                }
            }
        } catch (Throwable th) {
            qx.a(th, nz.class);
        }
    }

    private Map<String, JSONObject> a(Map<String, JSONObject> map) {
        if (qx.a(this)) {
            return null;
        }
        try {
            dqc.d(map, "purchaseDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            for (Map.Entry entry : dnh.b(map).entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken")) {
                        String string = jSONObject.getString("purchaseToken");
                        if (d.containsKey(string)) {
                            map.remove(str);
                        } else {
                            Set<String> set = c;
                            set.add(string + ';' + currentTimeMillis);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            SharedPreferences sharedPreferences = b;
            if (sharedPreferences == null) {
                dqc.a("sharedPreferences");
            }
            sharedPreferences.edit().putStringSet("PURCHASE_DETAILS_SET", c).apply();
            return new HashMap(map);
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    private void c() {
        if (qx.a(this)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = b;
            if (sharedPreferences == null) {
                dqc.a("sharedPreferences");
            }
            long j = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
            if (j == 0) {
                SharedPreferences sharedPreferences2 = b;
                if (sharedPreferences2 == null) {
                    dqc.a("sharedPreferences");
                }
                sharedPreferences2.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
            } else if (currentTimeMillis - j > 604800) {
                for (Map.Entry entry : dnh.b(d).entrySet()) {
                    String str = (String) entry.getKey();
                    long longValue = ((Number) entry.getValue()).longValue();
                    if (currentTimeMillis - longValue > 86400) {
                        Set<String> set = c;
                        set.remove(str + ';' + longValue);
                        d.remove(str);
                    }
                }
                SharedPreferences sharedPreferences3 = b;
                if (sharedPreferences3 == null) {
                    dqc.a("sharedPreferences");
                }
                sharedPreferences3.edit().putStringSet("PURCHASE_DETAILS_SET", c).putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
            }
        } catch (Throwable th) {
            qx.a(th, this);
        }
    }

    public static final boolean a() {
        if (qx.a(nz.class)) {
            return false;
        }
        try {
            a.b();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = b;
            if (sharedPreferences == null) {
                dqc.a("sharedPreferences");
            }
            long j = sharedPreferences.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", 0L);
            if (j != 0 && currentTimeMillis - j < 86400) {
                return false;
            }
            SharedPreferences sharedPreferences2 = b;
            if (sharedPreferences2 == null) {
                dqc.a("sharedPreferences");
            }
            sharedPreferences2.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", currentTimeMillis).apply();
            return true;
        } catch (Throwable th) {
            qx.a(th, nz.class);
            return false;
        }
    }

    private Map<String, String> b(Map<String, ? extends JSONObject> map, Map<String, ? extends JSONObject> map2) {
        if (qx.a(this)) {
            return null;
        }
        try {
            dqc.d(map, "purchaseDetailsMap");
            dqc.d(map2, "skuDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends JSONObject> entry : map.entrySet()) {
                JSONObject value = entry.getValue();
                JSONObject jSONObject = map2.get(entry.getKey());
                if (value != null && value.has("purchaseTime")) {
                    try {
                        if (currentTimeMillis - (value.getLong("purchaseTime") / 1000) <= 86400 && jSONObject != null) {
                            String jSONObject2 = value.toString();
                            dqc.b(jSONObject2, "purchaseDetail.toString()");
                            String jSONObject3 = jSONObject.toString();
                            dqc.b(jSONObject3, "skuDetail.toString()");
                            linkedHashMap.put(jSONObject2, jSONObject3);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }
}
