package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J&\u0010\u0018\u001a\u00020\u00112\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001a2\u0006\u0010\u0013\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/facebook/appevents/restrictivedatafilter/RestrictiveDataManager;", "", "()V", "PROCESS_EVENT_NAME", "", "REPLACEMENT_STRING", "RESTRICTIVE_PARAM", "RESTRICTIVE_PARAM_KEY", "TAG", "enabled", "", "restrictedEvents", "", "restrictiveParamFilters", "", "Lcom/facebook/appevents/restrictivedatafilter/RestrictiveDataManager$RestrictiveParamFilter;", "enable", "", "getMatchedRuleType", "eventName", "paramKey", "initialize", "isRestrictedEvent", "processEvent", "processParameters", "parameters", "", "RestrictiveParamFilter", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: oy  reason: default package */
/* loaded from: classes2.dex */
public final class oy {
    private static boolean b;
    public static final oy a = new oy();
    private static final String c = oy.class.getCanonicalName();
    private static final List<a> d = new ArrayList();
    private static final Set<String> e = new CopyOnWriteArraySet();

    private oy() {
    }

    public static final void a() {
        String str;
        if (qx.a(oy.class)) {
            return;
        }
        boolean z = true;
        try {
            b = true;
            oy oyVar = a;
            if (qx.a(oyVar)) {
                return;
            }
            try {
                pv a2 = pw.a(ly.m(), false);
                if (a2 == null || (str = a2.l) == null) {
                    return;
                }
                if (str.length() != 0) {
                    z = false;
                }
                if (z) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(str);
                d.clear();
                e.clear();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    if (jSONObject2 != null) {
                        JSONObject optJSONObject = jSONObject2.optJSONObject("restrictive_param");
                        dqc.b(next, "key");
                        a aVar = new a(next, new HashMap());
                        if (optJSONObject != null) {
                            Map<String, String> b2 = qi.b(optJSONObject);
                            dqc.d(b2, "<set-?>");
                            aVar.b = b2;
                            d.add(aVar);
                        }
                        if (jSONObject2.has("process_event_name")) {
                            e.add(aVar.a);
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                qx.a(th, oyVar);
            }
        } catch (Throwable th2) {
            qx.a(th2, oy.class);
        }
    }

    public static final String a(String str) {
        if (qx.a(oy.class)) {
            return null;
        }
        try {
            dqc.d(str, "eventName");
            return b ? a.b(str) ? "_removed_" : str : str;
        } catch (Throwable th) {
            qx.a(th, oy.class);
            return null;
        }
    }

    public static final void a(Map<String, String> map, String str) {
        if (qx.a(oy.class)) {
            return;
        }
        try {
            dqc.d(map, "parameters");
            dqc.d(str, "eventName");
            if (!b) {
                return;
            }
            HashMap hashMap = new HashMap();
            for (String str2 : new ArrayList(map.keySet())) {
                String a2 = a.a(str, str2);
                if (a2 != null) {
                    hashMap.put(str2, a2);
                    map.remove(str2);
                }
            }
            if (!(!hashMap.isEmpty())) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : hashMap.entrySet()) {
                    jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                }
                map.put("_restrictedParams", jSONObject.toString());
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            qx.a(th, oy.class);
        }
    }

    private final String a(String str, String str2) {
        if (qx.a(this)) {
            return null;
        }
        try {
            for (a aVar : new ArrayList(d)) {
                if (aVar != null && dqc.a((Object) str, (Object) aVar.a)) {
                    for (String str3 : aVar.b.keySet()) {
                        if (dqc.a((Object) str2, (Object) str3)) {
                            return aVar.b.get(str3);
                        }
                    }
                    continue;
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            qx.a(th, this);
        }
        return null;
    }

    private final boolean b(String str) {
        if (qx.a(this)) {
            return false;
        }
        try {
            return e.contains(str);
        } catch (Throwable th) {
            qx.a(th, this);
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/facebook/appevents/restrictivedatafilter/RestrictiveDataManager$RestrictiveParamFilter;", "", "eventName", "", "restrictiveParams", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getEventName", "()Ljava/lang/String;", "setEventName", "(Ljava/lang/String;)V", "getRestrictiveParams", "()Ljava/util/Map;", "setRestrictiveParams", "(Ljava/util/Map;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: oy$a */
    /* loaded from: classes2.dex */
    public static final class a {
        String a;
        Map<String, String> b;

        public a(String str, Map<String, String> map) {
            dqc.d(str, "eventName");
            dqc.d(map, "restrictiveParams");
            this.a = str;
            this.b = map;
        }
    }
}
