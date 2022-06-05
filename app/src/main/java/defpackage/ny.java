package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010&\u001a\u0004\u0018\u00010\u00012\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0007J\b\u0010+\u001a\u00020,H\u0007J0\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\u00040.j\b\u0012\u0004\u0012\u00020\u0004`/2\u0016\u00100\u001a\u0012\u0012\u0004\u0012\u00020\u00040.j\b\u0012\u0004\u0012\u00020\u0004`/H\u0002J\u001e\u00101\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001f2\u0006\u0010'\u001a\u00020(2\u0006\u00102\u001a\u00020\u0004H\u0002J\u001e\u00103\u001a\u0004\u0018\u00010\"2\n\u00104\u001a\u0006\u0012\u0002\b\u00030\u001f2\u0006\u00105\u001a\u00020\u0004H\u0002J0\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u00040.j\b\u0012\u0004\u0012\u00020\u0004`/2\u0006\u0010'\u001a\u00020(2\u0006\u00107\u001a\u00020\u00012\u0006\u00108\u001a\u00020\u0004H\u0002J*\u00109\u001a\u0012\u0012\u0004\u0012\u00020\u00040.j\b\u0012\u0004\u0012\u00020\u0004`/2\u0006\u0010'\u001a\u00020(2\b\u00107\u001a\u0004\u0018\u00010\u0001H\u0007J2\u0010:\u001a\u0012\u0012\u0004\u0012\u00020\u00040.j\b\u0012\u0004\u0012\u00020\u0004`/2\u0006\u0010'\u001a\u00020(2\b\u00107\u001a\u0004\u0018\u00010\u00012\u0006\u00108\u001a\u00020\u0004H\u0002J*\u0010;\u001a\u0012\u0012\u0004\u0012\u00020\u00040.j\b\u0012\u0004\u0012\u00020\u0004`/2\u0006\u0010'\u001a\u00020(2\b\u00107\u001a\u0004\u0018\u00010\u0001H\u0007J*\u0010<\u001a\u0012\u0012\u0004\u0012\u00020\u00040.j\b\u0012\u0004\u0012\u00020\u0004`/2\u0006\u0010'\u001a\u00020(2\b\u00107\u001a\u0004\u0018\u00010\u0001H\u0007JF\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040>2\u0006\u0010'\u001a\u00020(2\u0016\u0010?\u001a\u0012\u0012\u0004\u0012\u00020\u00040.j\b\u0012\u0004\u0012\u00020\u0004`/2\b\u00107\u001a\u0004\u0018\u00010\u00012\u0006\u0010@\u001a\u00020AH\u0007JF\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040>2\u0006\u0010'\u001a\u00020(2\u0016\u0010?\u001a\u0012\u0012\u0004\u0012\u00020\u00040.j\b\u0012\u0004\u0012\u00020\u0004`/2\b\u00107\u001a\u0004\u0018\u00010\u00012\u0006\u0010@\u001a\u00020AH\u0002J\u000e\u0010C\u001a\u00020A2\u0006\u0010D\u001a\u00020\u0004JA\u0010E\u001a\u0004\u0018\u00010\u00012\u0006\u0010'\u001a\u00020(2\u0006\u00102\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00042\b\u0010F\u001a\u0004\u0018\u00010\u00012\u000e\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010HH\u0002¢\u0006\u0002\u0010IJ\"\u0010J\u001a\u00020A2\u0006\u0010'\u001a\u00020(2\b\u00107\u001a\u0004\u0018\u00010\u00012\u0006\u00108\u001a\u00020\u0004H\u0002J,\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040L2\u0016\u0010?\u001a\u0012\u0012\u0004\u0012\u00020\u00040.j\b\u0012\u0004\u0012\u00020\u0004`/H\u0002J\u001c\u0010M\u001a\u00020,2\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040>H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0015*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R2\u0010\u001d\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f0\u001ej\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f` X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\"0\u001ej\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\"` X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010#\u001a\n \u0015*\u0004\u0018\u00010$0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010%\u001a\n \u0015*\u0004\u0018\u00010$0$X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006O"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseEventManager;", "", "()V", "AS_INTERFACE", "", "CACHE_CLEAR_TIME_LIMIT_SEC", "", "DETAILS_LIST", "GET_PURCHASES", "GET_PURCHASE_HISTORY", "GET_SKU_DETAILS", "INAPP", "INAPP_CONTINUATION_TOKEN", "INAPP_PURCHASE_DATA_LIST", "IN_APP_BILLING_SERVICE", "IN_APP_BILLING_SERVICE_STUB", "IS_BILLING_SUPPORTED", "ITEM_ID_LIST", "LAST_CLEARED_TIME", "MAX_QUERY_PURCHASE_NUM", "PACKAGE_NAME", "kotlin.jvm.PlatformType", "PURCHASE_EXPIRE_TIME_SEC", "PURCHASE_INAPP_STORE", "PURCHASE_STOP_QUERY_TIME_SEC", "RESPONSE_CODE", "SKU_DETAILS_STORE", "SKU_DETAIL_EXPIRE_TIME_SEC", "SUBSCRIPTION", "classMap", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Lkotlin/collections/HashMap;", "methodMap", "Ljava/lang/reflect/Method;", "purchaseInappSharedPrefs", "Landroid/content/SharedPreferences;", "skuDetailSharedPrefs", "asInterface", "context", "Landroid/content/Context;", NotificationCompat.CATEGORY_SERVICE, "Landroid/os/IBinder;", "clearSkuDetailsCache", "", "filterPurchases", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "purchases", "getClass", "className", "getMethod", "classObj", "methodName", "getPurchaseHistory", "inAppBillingObj", "type", "getPurchaseHistoryInapp", "getPurchases", "getPurchasesInapp", "getPurchasesSubs", "getSkuDetails", "", "skuList", "isSubscription", "", "getSkuDetailsFromGoogle", "hasFreeTrialPeirod", "skuDetail", "invokeMethod", "obj", "args", "", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "isBillingSupported", "readSkuDetailsFromCache", "", "writeSkuDetailsToCache", "skuDetailsMap", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: ny  reason: default package */
/* loaded from: classes2.dex */
public final class ny {
    public static final ny a = new ny();
    private static final HashMap<String, Method> b = new HashMap<>();
    private static final HashMap<String, Class<?>> c = new HashMap<>();
    private static final String d = ly.k().getPackageName();
    private static final SharedPreferences e = ly.k().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
    private static final SharedPreferences f = ly.k().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    private ny() {
    }

    public static final Object a(Context context, IBinder iBinder) {
        if (qx.a(ny.class)) {
            return null;
        }
        try {
            dqc.d(context, "context");
            return a.a(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
        } catch (Throwable th) {
            qx.a(th, ny.class);
            return null;
        }
    }

    public static final Map<String, String> a(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        if (qx.a(ny.class)) {
            return null;
        }
        try {
            dqc.d(context, "context");
            dqc.d(arrayList, "skuList");
            Map<String, String> a2 = a.a(arrayList);
            ArrayList<String> arrayList2 = new ArrayList<>();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!a2.containsKey(next)) {
                    arrayList2.add(next);
                }
            }
            a2.putAll(a.b(context, arrayList2, obj, z));
            return a2;
        } catch (Throwable th) {
            qx.a(th, ny.class);
            return null;
        }
    }

    private final Map<String, String> b(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        if (qx.a(this)) {
            return null;
        }
        try {
            Map<String, String> linkedHashMap = new LinkedHashMap<>();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                Object[] objArr = new Object[4];
                objArr[0] = 3;
                objArr[1] = d;
                objArr[2] = z ? "subs" : "inapp";
                objArr[3] = bundle;
                Object a2 = a(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
                if (a2 != null) {
                    Bundle bundle2 = (Bundle) a2;
                    if (bundle2.getInt("RESPONSE_CODE") == 0) {
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                            int size = arrayList.size();
                            for (int i = 0; i < size; i++) {
                                String str = arrayList.get(i);
                                dqc.b(str, "skuList[i]");
                                String str2 = stringArrayList.get(i);
                                dqc.b(str2, "skuDetailsList[i]");
                                linkedHashMap.put(str, str2);
                            }
                        }
                        a(linkedHashMap);
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    private final Map<String, String> a(ArrayList<String> arrayList) {
        if (qx.a(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                String string = e.getString(next, null);
                if (string != null) {
                    List a2 = dsg.a(string, new String[]{";"}, 2, 2);
                    if (currentTimeMillis - Long.parseLong((String) a2.get(0)) < 43200) {
                        dqc.b(next, "sku");
                        linkedHashMap.put(next, a2.get(1));
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    private final void a(Map<String, String> map) {
        if (qx.a(this)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor edit = e.edit();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                edit.putString(entry.getKey(), currentTimeMillis + ';' + entry.getValue());
            }
            edit.apply();
        } catch (Throwable th) {
            qx.a(th, this);
        }
    }

    private final boolean a(Context context, Object obj, String str) {
        if (!qx.a(this) && obj != null) {
            try {
                Object a2 = a(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, d, str});
                if (a2 != null) {
                    if (((Integer) a2).intValue() == 0) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                qx.a(th, this);
                return false;
            }
        }
        return false;
    }

    public static final ArrayList<String> a(Context context, Object obj) {
        if (qx.a(ny.class)) {
            return null;
        }
        try {
            dqc.d(context, "context");
            ny nyVar = a;
            return nyVar.b(nyVar.b(context, obj, "inapp"));
        } catch (Throwable th) {
            qx.a(th, ny.class);
            return null;
        }
    }

    public static final ArrayList<String> b(Context context, Object obj) {
        if (qx.a(ny.class)) {
            return null;
        }
        try {
            dqc.d(context, "context");
            ny nyVar = a;
            return nyVar.b(nyVar.b(context, obj, "subs"));
        } catch (Throwable th) {
            qx.a(th, ny.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0064 A[EDGE_INSN: B:28:0x0064->B:22:0x0064 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.ArrayList<java.lang.String> b(android.content.Context r13, java.lang.Object r14, java.lang.String r15) {
        /*
            r12 = this;
            boolean r0 = defpackage.qx.a(r12)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L65
            r0.<init>()     // Catch: java.lang.Throwable -> L65
            if (r14 != 0) goto L10
            return r0
        L10:
            boolean r2 = r12.a(r13, r14, r15)     // Catch: java.lang.Throwable -> L65
            if (r2 == 0) goto L64
            r2 = 0
            r3 = r1
            r4 = 0
        L19:
            r5 = 4
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L65
            r5 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L65
            r11[r2] = r6     // Catch: java.lang.Throwable -> L65
            r6 = 1
            java.lang.String r7 = defpackage.ny.d     // Catch: java.lang.Throwable -> L65
            r11[r6] = r7     // Catch: java.lang.Throwable -> L65
            r6 = 2
            r11[r6] = r15     // Catch: java.lang.Throwable -> L65
            r11[r5] = r3     // Catch: java.lang.Throwable -> L65
            java.lang.String r8 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r9 = "getPurchases"
            r6 = r12
            r7 = r13
            r10 = r14
            java.lang.Object r3 = r6.a(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto L5d
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch: java.lang.Throwable -> L65
            java.lang.String r5 = "RESPONSE_CODE"
            int r5 = r3.getInt(r5)     // Catch: java.lang.Throwable -> L65
            if (r5 != 0) goto L5d
            java.lang.String r5 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r5 = r3.getStringArrayList(r5)     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L64
            int r6 = r5.size()     // Catch: java.lang.Throwable -> L65
            int r4 = r4 + r6
            java.util.Collection r5 = (java.util.Collection) r5     // Catch: java.lang.Throwable -> L65
            r0.addAll(r5)     // Catch: java.lang.Throwable -> L65
            java.lang.String r5 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Throwable -> L65
            goto L5e
        L5d:
            r3 = r1
        L5e:
            r5 = 30
            if (r4 >= r5) goto L64
            if (r3 != 0) goto L19
        L64:
            return r0
        L65:
            r13 = move-exception
            defpackage.qx.a(r13, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ny.b(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    public final boolean a(String str) {
        if (qx.a(this)) {
            return false;
        }
        try {
            dqc.d(str, "skuDetail");
            try {
                String optString = new JSONObject(str).optString("freeTrialPeriod");
                if (optString != null) {
                    if (optString.length() > 0) {
                        return true;
                    }
                }
            } catch (JSONException unused) {
            }
            return false;
        } catch (Throwable th) {
            qx.a(th, this);
            return false;
        }
    }

    public static final ArrayList<String> c(Context context, Object obj) {
        Class<?> a2;
        if (qx.a(ny.class)) {
            return null;
        }
        try {
            dqc.d(context, "context");
            ArrayList<String> arrayList = new ArrayList<>();
            return (obj == null || (a2 = a.a(context, "com.android.vending.billing.IInAppBillingService")) == null || a.a(a2, "getPurchaseHistory") == null) ? arrayList : a.b(a.c(context, obj, "inapp"));
        } catch (Throwable th) {
            qx.a(th, ny.class);
            return null;
        }
    }

    private final ArrayList<String> c(Context context, Object obj, String str) {
        ArrayList<String> stringArrayList;
        if (qx.a(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (a(context, obj, str)) {
                String str2 = null;
                int i = 0;
                boolean z = false;
                do {
                    Object a2 = a(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, new Object[]{6, d, str, str2, new Bundle()});
                    if (a2 != null) {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) a2;
                        if (bundle.getInt("RESPONSE_CODE") == 0 && (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                            dqc.b(stringArrayList, "purchaseDetails.getStrin…SE_DATA_LIST) ?: continue");
                            Iterator<String> it = stringArrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String next = it.next();
                                if (currentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / 1000) > 1200) {
                                    z = true;
                                    break;
                                }
                                arrayList.add(next);
                                i++;
                            }
                            str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                            if (i < 30 || str2 == null) {
                                break;
                                break;
                            }
                        }
                    }
                    str2 = null;
                    if (i < 30) {
                        break;
                    }
                } while (!z);
            }
            return arrayList;
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    private final ArrayList<String> b(ArrayList<String> arrayList) {
        if (qx.a(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList2 = new ArrayList<>();
            SharedPreferences.Editor edit = f.edit();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                try {
                    JSONObject jSONObject = new JSONObject(next);
                    String string = jSONObject.getString("productId");
                    long j = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (currentTimeMillis - (j / 1000) <= 86400 && !dqc.a((Object) f.getString(string, ""), (Object) string2)) {
                        edit.putString(string, string2);
                        arrayList2.add(next);
                    }
                } catch (JSONException unused) {
                }
            }
            edit.apply();
            return arrayList2;
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final Method a(Class<?> cls, String str) {
        Class[] clsArr;
        Method method;
        Method method2;
        if (qx.a(this)) {
            return null;
        }
        try {
            Method method3 = b.get(str);
            if (method3 != null) {
                return method3;
            }
            try {
                switch (str.hashCode()) {
                    case -1801122596:
                        if (str.equals("getPurchases")) {
                            Class cls2 = Integer.TYPE;
                            dqc.b(cls2, "Integer.TYPE");
                            clsArr = new Class[]{cls2, String.class, String.class, String.class};
                            break;
                        }
                        clsArr = null;
                        break;
                    case -1450694211:
                        if (str.equals("isBillingSupported")) {
                            Class cls3 = Integer.TYPE;
                            dqc.b(cls3, "Integer.TYPE");
                            clsArr = new Class[]{cls3, String.class, String.class};
                            break;
                        }
                        clsArr = null;
                        break;
                    case -1123215065:
                        if (str.equals("asInterface")) {
                            clsArr = new Class[]{IBinder.class};
                            break;
                        }
                        clsArr = null;
                        break;
                    case -594356707:
                        if (str.equals("getPurchaseHistory")) {
                            Class cls4 = Integer.TYPE;
                            dqc.b(cls4, "Integer.TYPE");
                            clsArr = new Class[]{cls4, String.class, String.class, String.class, Bundle.class};
                            break;
                        }
                        clsArr = null;
                        break;
                    case -573310373:
                        if (str.equals("getSkuDetails")) {
                            Class cls5 = Integer.TYPE;
                            dqc.b(cls5, "Integer.TYPE");
                            clsArr = new Class[]{cls5, String.class, String.class, Bundle.class};
                            break;
                        }
                        clsArr = null;
                        break;
                    default:
                        clsArr = null;
                        break;
                }
                if (clsArr == null) {
                    method = cls.getDeclaredMethod(str, null);
                } else {
                    method = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                }
                method2 = method;
                b.put(str, method2);
                return method2;
            } catch (NoSuchMethodException unused) {
                return method2;
            }
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    private final Class<?> a(Context context, String str) {
        Class<?> loadClass;
        if (qx.a(this)) {
            return null;
        }
        try {
            Class<?> cls = c.get(str);
            if (cls != null) {
                return cls;
            }
            try {
                loadClass = context.getClassLoader().loadClass(str);
                dqc.b(loadClass, "classObj");
                c.put(str, loadClass);
                return loadClass;
            } catch (ClassNotFoundException unused) {
                return loadClass;
            }
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    private final Object a(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method a2;
        if (qx.a(this)) {
            return null;
        }
        try {
            Class<?> a3 = a(context, str);
            if (a3 == null || (a2 = a(a3, str2)) == null) {
                return null;
            }
            if (obj != null) {
                obj = a3.cast(obj);
            }
            try {
                return a2.invoke(obj, Arrays.copyOf(objArr, objArr.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    public static final void a() {
        if (qx.a(ny.class)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            long j = e.getLong("LAST_CLEARED_TIME", 0L);
            if (j == 0) {
                e.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
            } else if (currentTimeMillis - j <= 604800) {
            } else {
                e.edit().clear().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
            }
        } catch (Throwable th) {
            qx.a(th, ny.class);
        }
    }
}
