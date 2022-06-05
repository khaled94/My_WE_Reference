package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.firebase_auth.zzbl;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cjv  reason: default package */
/* loaded from: classes2.dex */
final class cjv {
    private static final adj a = new adj("JSONParser", new String[0]);

    public static Map<String, Object> a(String str) {
        aat.a(str);
        ajg ajgVar = new ajg();
        ajj.a(ajgVar);
        ajm ajmVar = new ajm(new ajl(ajgVar));
        ajj.a(str);
        Iterator<String> a2 = ajmVar.b.a(ajmVar, str);
        ArrayList arrayList = new ArrayList();
        while (a2.hasNext()) {
            arrayList.add(a2.next());
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        if (unmodifiableList.size() < 2) {
            adj adjVar = a;
            String valueOf = String.valueOf(str);
            adjVar.a(valueOf.length() != 0 ? "Invalid idToken ".concat(valueOf) : new String("Invalid idToken "), new Object[0]);
            return Collections.EMPTY_MAP;
        }
        String str2 = (String) unmodifiableList.get(1);
        try {
            Map<String, Object> b = b(new String(str2 == null ? null : Base64.decode(str2, 11), "UTF-8"));
            return b == null ? Collections.EMPTY_MAP : b;
        } catch (UnsupportedEncodingException unused) {
            a.a("Unable to decode token", new Object[0]);
            return Collections.EMPTY_MAP;
        }
    }

    public static Map<String, Object> b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject == JSONObject.NULL) {
                return null;
            }
            return a(jSONObject);
        } catch (Exception e) {
            throw new zzbl(e);
        }
    }

    private static Map<String, Object> a(JSONObject jSONObject) throws JSONException {
        ArrayMap arrayMap = new ArrayMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = a((JSONObject) obj);
            }
            arrayMap.put(next, obj);
        }
        return arrayMap;
    }

    private static List<Object> a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = a((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}
