package defpackage;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import defpackage.ox;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONArray;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007J\u001e\u0010\r\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceParametersHelper;", "", "()V", "TAG", "", "buildEventsBundle", "Landroid/os/Bundle;", "eventType", "Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$EventType;", "applicationId", "appEvents", "", "Lcom/facebook/appevents/AppEvent;", "buildEventsJson", "Lorg/json/JSONArray;", "includeImplicitEvents", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: ow  reason: default package */
/* loaded from: classes2.dex */
public final class ow {
    public static final ow a = new ow();
    private static final String b;

    static {
        String simpleName = ox.class.getSimpleName();
        dqc.b(simpleName, "RemoteServiceWrapper::class.java.simpleName");
        b = simpleName;
    }

    private ow() {
    }

    public static final Bundle a(ox.a aVar, String str, List<mq> list) {
        if (qx.a(ow.class)) {
            return null;
        }
        try {
            dqc.d(aVar, "eventType");
            dqc.d(str, "applicationId");
            dqc.d(list, "appEvents");
            Bundle bundle = new Bundle();
            bundle.putString(NotificationCompat.CATEGORY_EVENT, aVar.toString());
            bundle.putString("app_id", str);
            if (ox.a.CUSTOM_APP_EVENTS == aVar) {
                JSONArray a2 = a.a(list, str);
                if (a2.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", a2.toString());
            }
            return bundle;
        } catch (Throwable th) {
            qx.a(th, ow.class);
            return null;
        }
    }

    private final JSONArray a(List<mq> list, String str) {
        if (qx.a(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            List<mq> a2 = dmq.a((Collection) list);
            nu.a(a2);
            boolean a3 = a(str);
            for (mq mqVar : a2) {
                if (!mqVar.a()) {
                    "Event with invalid checksum: ".concat(String.valueOf(mqVar));
                    qi.a();
                } else if ((!mqVar.b) || (mqVar.b && a3)) {
                    jSONArray.put(mqVar.a);
                }
            }
            return jSONArray;
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    private final boolean a(String str) {
        if (qx.a(this)) {
            return false;
        }
        try {
            pv a2 = pw.a(str, false);
            if (a2 == null) {
                return false;
            }
            return a2.a;
        } catch (Throwable th) {
            qx.a(th, this);
            return false;
        }
    }
}
