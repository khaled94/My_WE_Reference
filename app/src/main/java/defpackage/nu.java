package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\fH\u0002J&\u0010\u000e\u001a\u00020\f2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007J\u0016\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/facebook/appevents/eventdeactivation/EventDeactivationManager;", "", "()V", "deprecatedEvents", "", "", "deprecatedParamFilters", "", "Lcom/facebook/appevents/eventdeactivation/EventDeactivationManager$DeprecatedParamFilter;", "enabled", "", "enable", "", "initialize", "processDeprecatedParameters", "parameters", "", "eventName", "processEvents", "events", "Lcom/facebook/appevents/AppEvent;", "DeprecatedParamFilter", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: nu  reason: default package */
/* loaded from: classes2.dex */
public final class nu {
    private static boolean b;
    public static final nu a = new nu();
    private static final List<a> c = new ArrayList();
    private static final Set<String> d = new HashSet();

    private nu() {
    }

    public static final void a() {
        if (qx.a(nu.class)) {
            return;
        }
        try {
            b = true;
            a.b();
        } catch (Throwable th) {
            qx.a(th, nu.class);
        }
    }

    private final synchronized void b() {
        boolean z;
        pv a2;
        if (qx.a(this)) {
            return;
        }
        try {
            z = false;
            a2 = pw.a(ly.m(), false);
        } catch (Exception unused) {
        } catch (Throwable th) {
            qx.a(th, this);
            return;
        }
        if (a2 == null) {
            return;
        }
        String str = a2.l;
        if (str != null) {
            if (str.length() > 0) {
                z = true;
            }
            if (z) {
                JSONObject jSONObject = new JSONObject(str);
                c.clear();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    if (jSONObject2 != null) {
                        if (jSONObject2.optBoolean("is_deprecated_event")) {
                            Set<String> set = d;
                            dqc.b(next, "key");
                            set.add(next);
                        } else {
                            JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                            dqc.b(next, "key");
                            a aVar = new a(next, new ArrayList());
                            if (optJSONArray != null) {
                                List<String> a3 = qi.a(optJSONArray);
                                dqc.d(a3, "<set-?>");
                                aVar.b = a3;
                            }
                            c.add(aVar);
                        }
                    }
                }
            }
        }
    }

    public static final void a(List<mq> list) {
        if (qx.a(nu.class)) {
            return;
        }
        try {
            dqc.d(list, "events");
            if (!b) {
                return;
            }
            Iterator<mq> it = list.iterator();
            while (it.hasNext()) {
                if (d.contains(it.next().c)) {
                    it.remove();
                }
            }
        } catch (Throwable th) {
            qx.a(th, nu.class);
        }
    }

    public static final void a(Map<String, String> map, String str) {
        if (qx.a(nu.class)) {
            return;
        }
        try {
            dqc.d(map, "parameters");
            dqc.d(str, "eventName");
            if (!b) {
                return;
            }
            ArrayList<String> arrayList = new ArrayList(map.keySet());
            for (a aVar : new ArrayList(c)) {
                if (!(!dqc.a((Object) aVar.a, (Object) str))) {
                    for (String str2 : arrayList) {
                        if (aVar.b.contains(str2)) {
                            map.remove(str2);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            qx.a(th, nu.class);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/facebook/appevents/eventdeactivation/EventDeactivationManager$DeprecatedParamFilter;", "", "eventName", "", "deprecateParams", "", "(Ljava/lang/String;Ljava/util/List;)V", "getDeprecateParams", "()Ljava/util/List;", "setDeprecateParams", "(Ljava/util/List;)V", "getEventName", "()Ljava/lang/String;", "setEventName", "(Ljava/lang/String;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: nu$a */
    /* loaded from: classes2.dex */
    public static final class a {
        String a;
        List<String> b;

        public a(String str, List<String> list) {
            dqc.d(str, "eventName");
            dqc.d(list, "deprecateParams");
            this.a = str;
            this.b = list;
        }
    }
}
