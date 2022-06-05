package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J\b\u0010\u0014\u001a\u00020\rH\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/facebook/appevents/suggestedevents/PredictionHistoryManager;", "", "()V", "CLICKED_PATH_STORE", "", "SUGGESTED_EVENTS_HISTORY", "clickedViewPaths", "", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "shardPreferences", "Landroid/content/SharedPreferences;", "addPrediction", "", "pathID", "predictedEvent", "getPathID", "view", "Landroid/view/View;", "text", "initAndWait", "queryEvent", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: pa  reason: default package */
/* loaded from: classes2.dex */
public final class pa {
    private static SharedPreferences c;
    public static final pa a = new pa();
    private static final Map<String, String> b = new LinkedHashMap();
    private static final AtomicBoolean d = new AtomicBoolean(false);

    private pa() {
    }

    public static final void a(String str, String str2) {
        String str3 = "";
        if (qx.a(pa.class)) {
            return;
        }
        try {
            dqc.d(str, "pathID");
            dqc.d(str2, "predictedEvent");
            if (!d.get() && !qx.a(a) && !d.get()) {
                SharedPreferences sharedPreferences = ly.k().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
                dqc.b(sharedPreferences, "FacebookSdk.getApplicati…RE, Context.MODE_PRIVATE)");
                c = sharedPreferences;
                Map<String, String> map = b;
                if (sharedPreferences == null) {
                    dqc.a("shardPreferences");
                }
                String string = sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", str3);
                if (string != null) {
                    str3 = string;
                }
                dqc.b(str3, "shardPreferences.getStri…EVENTS_HISTORY, \"\") ?: \"\"");
                map.putAll(qi.f(str3));
                d.set(true);
            }
            b.put(str, str2);
            SharedPreferences sharedPreferences2 = c;
            if (sharedPreferences2 == null) {
                dqc.a("shardPreferences");
            }
            sharedPreferences2.edit().putString("SUGGESTED_EVENTS_HISTORY", qi.a(dnh.b(b))).apply();
        } catch (Throwable th) {
            qx.a(th, pa.class);
        }
    }

    public static final String a(View view, String str) {
        if (qx.a(pa.class)) {
            return null;
        }
        try {
            dqc.d(view, "view");
            dqc.d(str, "text");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", str);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = nt.a(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            return qi.c(jSONObject.toString());
        } catch (Throwable th) {
            qx.a(th, pa.class);
            return null;
        }
    }

    public static final String a(String str) {
        if (qx.a(pa.class)) {
            return null;
        }
        try {
            dqc.d(str, "pathID");
            if (!b.containsKey(str)) {
                return null;
            }
            return b.get(str);
        } catch (Throwable th) {
            qx.a(th, pa.class);
            return null;
        }
    }
}
