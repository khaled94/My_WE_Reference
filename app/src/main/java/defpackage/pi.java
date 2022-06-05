package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0007R\u001e\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/internal/BundleJSONConverter;", "", "()V", "SETTERS", "", "Ljava/lang/Class;", "Lcom/facebook/internal/BundleJSONConverter$Setter;", "convertToBundle", "Landroid/os/Bundle;", "jsonObject", "Lorg/json/JSONObject;", "convertToJSON", "bundle", "Setter", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: pi  reason: default package */
/* loaded from: classes2.dex */
public final class pi {
    public static final pi a = new pi();
    private static final Map<Class<?>, a> b;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H&J \u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H&¨\u0006\f"}, d2 = {"Lcom/facebook/internal/BundleJSONConverter$Setter;", "", "setOnBundle", "", "bundle", "Landroid/os/Bundle;", "key", "", "value", "setOnJSON", "json", "Lorg/json/JSONObject;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: pi$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(Bundle bundle, String str, Object obj) throws JSONException;
    }

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(Boolean.class, new a() { // from class: pi.1
            @Override // defpackage.pi.a
            public final void a(Bundle bundle, String str, Object obj) throws JSONException {
                dqc.d(bundle, "bundle");
                dqc.d(str, "key");
                dqc.d(obj, "value");
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            }
        });
        b.put(Integer.class, new a() { // from class: pi.2
            @Override // defpackage.pi.a
            public final void a(Bundle bundle, String str, Object obj) throws JSONException {
                dqc.d(bundle, "bundle");
                dqc.d(str, "key");
                dqc.d(obj, "value");
                bundle.putInt(str, ((Integer) obj).intValue());
            }
        });
        b.put(Long.class, new a() { // from class: pi.3
            @Override // defpackage.pi.a
            public final void a(Bundle bundle, String str, Object obj) throws JSONException {
                dqc.d(bundle, "bundle");
                dqc.d(str, "key");
                dqc.d(obj, "value");
                bundle.putLong(str, ((Long) obj).longValue());
            }
        });
        b.put(Double.class, new a() { // from class: pi.4
            @Override // defpackage.pi.a
            public final void a(Bundle bundle, String str, Object obj) throws JSONException {
                dqc.d(bundle, "bundle");
                dqc.d(str, "key");
                dqc.d(obj, "value");
                bundle.putDouble(str, ((Double) obj).doubleValue());
            }
        });
        b.put(String.class, new a() { // from class: pi.5
            @Override // defpackage.pi.a
            public final void a(Bundle bundle, String str, Object obj) throws JSONException {
                dqc.d(bundle, "bundle");
                dqc.d(str, "key");
                dqc.d(obj, "value");
                bundle.putString(str, (String) obj);
            }
        });
        b.put(String[].class, new a() { // from class: pi.6
            @Override // defpackage.pi.a
            public final void a(Bundle bundle, String str, Object obj) throws JSONException {
                dqc.d(bundle, "bundle");
                dqc.d(str, "key");
                dqc.d(obj, "value");
                throw new IllegalArgumentException("Unexpected type from JSON");
            }
        });
        b.put(JSONArray.class, new a() { // from class: pi.7
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.pi.a
            public final void a(Bundle bundle, String str, Object obj) throws JSONException {
                dqc.d(bundle, "bundle");
                dqc.d(str, "key");
                dqc.d(obj, "value");
                JSONArray jSONArray = (JSONArray) obj;
                ArrayList arrayList = new ArrayList();
                if (jSONArray.length() == 0) {
                    bundle.putStringArrayList(str, arrayList);
                    return;
                }
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj2 = jSONArray.get(i);
                    if (obj2 instanceof String) {
                        arrayList.add(obj2);
                    } else {
                        throw new IllegalArgumentException("Unexpected type in an array: " + obj2.getClass());
                    }
                }
                bundle.putStringArrayList(str, arrayList);
            }
        });
    }

    private pi() {
    }

    public static final Bundle a(JSONObject jSONObject) throws JSONException {
        dqc.d(jSONObject, "jsonObject");
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj != JSONObject.NULL) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(next, a((JSONObject) obj));
                } else {
                    a aVar = b.get(obj.getClass());
                    if (aVar == null) {
                        throw new IllegalArgumentException("Unsupported type: " + obj.getClass());
                    }
                    dqc.b(next, "key");
                    dqc.b(obj, "value");
                    aVar.a(bundle, next, obj);
                }
            }
        }
        return bundle;
    }
}
