package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import defpackage.mu;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/appevents/internal/AppEventsLoggerUtility;", "", "()V", "API_ACTIVITY_TYPE_TO_STRING", "", "Lcom/facebook/appevents/internal/AppEventsLoggerUtility$GraphAPIActivityType;", "", "getJSONObjectForGraphAPICall", "Lorg/json/JSONObject;", "activityType", "attributionIdentifiers", "Lcom/facebook/internal/AttributionIdentifiers;", "anonymousAppDeviceGUID", "limitEventUsage", "", "context", "Landroid/content/Context;", "GraphAPIActivityType", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: og  reason: default package */
/* loaded from: classes2.dex */
public final class og {
    public static final og a = new og();
    private static final Map<a, String> b = dnh.b(dme.a(a.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), dme.a(a.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/appevents/internal/AppEventsLoggerUtility$GraphAPIActivityType;", "", "(Ljava/lang/String;I)V", "MOBILE_INSTALL_EVENT", "CUSTOM_APP_EVENTS", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: og$a */
    /* loaded from: classes2.dex */
    public enum a {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    private og() {
    }

    public static final JSONObject a(a aVar, pg pgVar, String str, boolean z, Context context) throws JSONException {
        dqc.d(aVar, "activityType");
        dqc.d(context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(NotificationCompat.CATEGORY_EVENT, b.get(aVar));
        mu.a aVar2 = mu.b;
        String b2 = mp.b();
        if (b2 != null) {
            jSONObject.put("app_user_id", b2);
        }
        qi.a(jSONObject, pgVar, str, z, context);
        try {
            qi.a(jSONObject, context);
        } catch (Exception e) {
            qc.a.a(mf.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e.toString());
        }
        JSONObject g = qi.g();
        if (g != null) {
            Iterator<String> keys = g.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, g.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
