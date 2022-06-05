package defpackage;

import android.app.Activity;
import androidx.core.app.NotificationCompat;
import defpackage.oq;
import defpackage.pd;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\fH\u0002J\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0011J\b\u0010\u0012\u001a\u00020\u000fH\u0007J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0014J\u0017\u0010\u0015\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0002\b\u0017J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/facebook/appevents/suggestedevents/SuggestedEventsManager;", "", "()V", "ELIGIBLE_EVENTS_KEY", "", "PRODUCTION_EVENTS_KEY", "eligibleEvents", "", "enabled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "productionEvents", "enable", "", "initialize", "isEligibleEvents", "", NotificationCompat.CATEGORY_EVENT, "isEligibleEvents$facebook_core_release", "isEnabled", "isProductionEvents", "isProductionEvents$facebook_core_release", "populateEventsFromRawJsonString", "rawSuggestedEventSetting", "populateEventsFromRawJsonString$facebook_core_release", "trackActivity", "activity", "Landroid/app/Activity;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: pc  reason: default package */
/* loaded from: classes2.dex */
public final class pc {
    public static final pc a = new pc();
    private static final AtomicBoolean b = new AtomicBoolean(false);
    private static final Set<String> c = new LinkedHashSet();
    private static final Set<String> d = new LinkedHashSet();

    private pc() {
    }

    public static final /* synthetic */ void a(pc pcVar) {
        String str;
        File a2;
        if (qx.a(pc.class)) {
            return;
        }
        try {
            if (qx.a(pcVar)) {
                return;
            }
            try {
                pv a3 = pw.a(ly.m(), false);
                if (a3 == null || (str = a3.k) == null) {
                    return;
                }
                if (!qx.a(pcVar)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has("production_events")) {
                            JSONArray jSONArray = jSONObject.getJSONArray("production_events");
                            int length = jSONArray.length();
                            for (int i = 0; i < length; i++) {
                                Set<String> set = c;
                                String string = jSONArray.getString(i);
                                dqc.b(string, "jsonArray.getString(i)");
                                set.add(string);
                            }
                        }
                        if (jSONObject.has("eligible_for_prediction_events")) {
                            JSONArray jSONArray2 = jSONObject.getJSONArray("eligible_for_prediction_events");
                            int length2 = jSONArray2.length();
                            for (int i2 = 0; i2 < length2; i2++) {
                                Set<String> set2 = d;
                                String string2 = jSONArray2.getString(i2);
                                dqc.b(string2, "jsonArray.getString(i)");
                                set2.add(string2);
                            }
                        }
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        qx.a(th, pcVar);
                    }
                }
                if ((!(!c.isEmpty()) && !(!d.isEmpty())) || (a2 = oq.a(oq.a.MTML_APP_EVENT_PREDICTION)) == null) {
                    return;
                }
                oz.a(a2);
                Activity d2 = oe.d();
                if (d2 == null) {
                    return;
                }
                a(d2);
            } catch (Exception unused2) {
            } catch (Throwable th2) {
                qx.a(th2, pcVar);
            }
        } catch (Throwable th3) {
            qx.a(th3, pc.class);
        }
    }

    public static final /* synthetic */ AtomicBoolean b() {
        if (qx.a(pc.class)) {
            return null;
        }
        try {
            return b;
        } catch (Throwable th) {
            qx.a(th, pc.class);
            return null;
        }
    }

    public static final synchronized void a() {
        synchronized (pc.class) {
            if (qx.a(pc.class)) {
                return;
            }
            ly.a().execute(a.a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
    /* renamed from: pc$a */
    /* loaded from: classes2.dex */
    static final class a implements Runnable {
        public static final a a = new a();

        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qx.a(this)) {
                return;
            }
            try {
                pc pcVar = pc.a;
                if (pc.b().get()) {
                    return;
                }
                pc pcVar2 = pc.a;
                pc.b().set(true);
                pc.a(pc.a);
            } catch (Throwable th) {
                qx.a(th, this);
            }
        }
    }

    public static final void a(Activity activity) {
        if (qx.a(pc.class)) {
            return;
        }
        try {
            dqc.d(activity, "activity");
            try {
                if (b.get() && oz.a() && (!c.isEmpty() || !d.isEmpty())) {
                    pd.a aVar = pd.a;
                    dqc.d(activity, "activity");
                    int hashCode = activity.hashCode();
                    Map a2 = pd.a();
                    Integer valueOf = Integer.valueOf(hashCode);
                    Object obj = a2.get(valueOf);
                    if (obj == null) {
                        obj = new pd(activity, (byte) 0);
                        a2.put(valueOf, obj);
                    }
                    pd.b((pd) obj);
                    return;
                }
                pd.a aVar2 = pd.a;
                dqc.d(activity, "activity");
                int hashCode2 = activity.hashCode();
                pd pdVar = (pd) pd.a().get(Integer.valueOf(hashCode2));
                if (pdVar == null) {
                    return;
                }
                pd.a().remove(Integer.valueOf(hashCode2));
                pd.c(pdVar);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            qx.a(th, pc.class);
        }
    }

    public static final boolean a(String str) {
        if (qx.a(pc.class)) {
            return false;
        }
        try {
            dqc.d(str, NotificationCompat.CATEGORY_EVENT);
            return c.contains(str);
        } catch (Throwable th) {
            qx.a(th, pc.class);
            return false;
        }
    }

    public static final boolean b(String str) {
        if (qx.a(pc.class)) {
            return false;
        }
        try {
            dqc.d(str, NotificationCompat.CATEGORY_EVENT);
            return d.contains(str);
        } catch (Throwable th) {
            qx.a(th, pc.class);
            return false;
        }
    }
}
