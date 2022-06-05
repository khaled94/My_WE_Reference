package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.internal.firebase_auth.zzbl;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ckc  reason: default package */
/* loaded from: classes2.dex */
public final class ckc {
    public SharedPreferences a;
    private Context b;
    private String c;
    private adj d = new adj("StorageHelpers", new String[0]);

    public ckc(Context context, String str) {
        aat.a(context);
        this.c = aat.a(str);
        this.b = context.getApplicationContext();
        this.a = this.b.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", this.c), 0);
    }

    public final void a(chm chmVar) {
        aat.a(chmVar);
        String b = b(chmVar);
        if (!TextUtils.isEmpty(b)) {
            this.a.edit().putString("com.google.firebase.auth.FIREBASE_USER", b).apply();
        }
    }

    public final chm a() {
        String string = this.a.getString("com.google.firebase.auth.FIREBASE_USER", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                return a(jSONObject);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final void a(chm chmVar, alf alfVar) {
        aat.a(chmVar);
        aat.a(alfVar);
        this.a.edit().putString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", chmVar.a()), alfVar.b()).apply();
    }

    public final void a(String str) {
        this.a.edit().remove(str).apply();
    }

    private final String b(chm chmVar) {
        JSONObject jSONObject = new JSONObject();
        if (ckq.class.isAssignableFrom(chmVar.getClass())) {
            ckq ckqVar = (ckq) chmVar;
            try {
                jSONObject.put("cachedTokenState", ckqVar.i());
                jSONObject.put("applicationName", ckqVar.f().b());
                jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
                if (ckqVar.a != null) {
                    JSONArray jSONArray = new JSONArray();
                    List<ckm> list = ckqVar.a;
                    for (int i = 0; i < list.size(); i++) {
                        jSONArray.put(list.get(i).a());
                    }
                    jSONObject.put("userInfos", jSONArray);
                }
                jSONObject.put("anonymous", ckqVar.b());
                jSONObject.put("version", ExifInterface.GPS_MEASUREMENT_2D);
                if (ckqVar.k() != null) {
                    jSONObject.put("userMetadata", ((cks) ckqVar.k()).a());
                }
                List<clw> a = ((cku) ckqVar.l()).a();
                if (a != null && !a.isEmpty()) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i2 = 0; i2 < a.size(); i2++) {
                        jSONArray2.put(a.get(i2).a());
                    }
                    jSONObject.put("userMultiFactorInfo", jSONArray2);
                }
                return jSONObject.toString();
            } catch (Exception e) {
                adj adjVar = this.d;
                Log.wtf(adjVar.a, adjVar.a("Failed to turn object into JSON", new Object[0]), e);
                throw new zzbl(e);
            }
        }
        return null;
    }

    private final ckq a(JSONObject jSONObject) {
        JSONArray jSONArray;
        cks a;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z = jSONObject.getBoolean("anonymous");
            String str = ExifInterface.GPS_MEASUREMENT_2D;
            String string3 = jSONObject.getString("version");
            if (string3 != null) {
                str = string3;
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray2.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(ckm.a(jSONArray2.getString(i)));
            }
            ckq ckqVar = new ckq(cgw.a(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                ckqVar.a(alf.a(string));
            }
            if (!z) {
                ckqVar.e();
            }
            ckqVar.b = str;
            if (jSONObject.has("userMetadata") && (a = cks.a(jSONObject.getJSONObject("userMetadata"))) != null) {
                ckqVar.c = a;
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray.getString(i2));
                    arrayList2.add("phone".equals(jSONObject2.optString("factorIdKey")) ? clf.a(jSONObject2) : null);
                }
                ckqVar.b(arrayList2);
            }
            return ckqVar;
        } catch (zzbl | ArrayIndexOutOfBoundsException | IllegalArgumentException | JSONException e) {
            Log.wtf(this.d.a, e);
            return null;
        }
    }
}
