package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import defpackage.og;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001%B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u000fJ\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\rJ\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bJ&\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001bJ0\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010#\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020$2\u0006\u0010\"\u001a\u00020\u001bH\u0002R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/facebook/appevents/SessionEventsState;", "", "attributionIdentifiers", "Lcom/facebook/internal/AttributionIdentifiers;", "anonymousAppDeviceGUID", "", "(Lcom/facebook/internal/AttributionIdentifiers;Ljava/lang/String;)V", "accumulatedEventCount", "", "getAccumulatedEventCount", "()I", "accumulatedEvents", "", "Lcom/facebook/appevents/AppEvent;", "eventsToPersist", "", "getEventsToPersist", "()Ljava/util/List;", "inFlightEvents", "numSkippedEventsDueToFullBuffer", "accumulatePersistedEvents", "", "events", "addEvent", NotificationCompat.CATEGORY_EVENT, "clearInFlightAndStats", "moveToAccumulated", "", "populateRequest", "request", "Lcom/facebook/GraphRequest;", "applicationContext", "Landroid/content/Context;", "includeImplicitEvents", "limitEventUsage", "numSkipped", "Lorg/json/JSONArray;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: nc  reason: default package */
/* loaded from: classes2.dex */
public final class nc {
    private static final String g;
    private List<mq> b = new ArrayList();
    private final List<mq> c = new ArrayList();
    private int d;
    private final pg e;
    private final String f;
    public static final a a = new a((byte) 0);
    private static final int h = 1000;

    public nc(pg pgVar, String str) {
        dqc.d(pgVar, "attributionIdentifiers");
        dqc.d(str, "anonymousAppDeviceGUID");
        this.e = pgVar;
        this.f = str;
    }

    public final synchronized void a(mq mqVar) {
        if (qx.a(this)) {
            return;
        }
        dqc.d(mqVar, NotificationCompat.CATEGORY_EVENT);
        if (this.b.size() + this.c.size() >= h) {
            this.d++;
        } else {
            this.b.add(mqVar);
        }
    }

    public final synchronized int a() {
        if (qx.a(this)) {
            return 0;
        }
        return this.b.size();
    }

    public final synchronized void a(boolean z) {
        if (qx.a(this)) {
            return;
        }
        if (z) {
            this.b.addAll(this.c);
        }
        this.c.clear();
        this.d = 0;
    }

    public final int a(lz lzVar, Context context, boolean z, boolean z2) {
        JSONObject jSONObject;
        if (qx.a(this)) {
            return 0;
        }
        try {
            dqc.d(lzVar, "request");
            dqc.d(context, "applicationContext");
            synchronized (this) {
                int i = this.d;
                nu.a(this.b);
                this.c.addAll(this.b);
                this.b.clear();
                JSONArray jSONArray = new JSONArray();
                for (mq mqVar : this.c) {
                    if (!mqVar.a()) {
                        "Event with invalid checksum: ".concat(String.valueOf(mqVar));
                        qi.a();
                    } else if (z || !mqVar.b) {
                        jSONArray.put(mqVar.a);
                    }
                }
                if (jSONArray.length() == 0) {
                    return 0;
                }
                dmg dmgVar = dmg.a;
                if (!qx.a(this)) {
                    try {
                        jSONObject = og.a(og.a.CUSTOM_APP_EVENTS, this.e, this.f, z2, context);
                        if (this.d > 0) {
                            jSONObject.put("num_skipped_events", i);
                        }
                    } catch (JSONException unused) {
                        jSONObject = new JSONObject();
                    }
                    lzVar.c = jSONObject;
                    Bundle bundle = lzVar.d;
                    String jSONArray2 = jSONArray.toString();
                    dqc.b(jSONArray2, "events.toString()");
                    bundle.putString("custom_events", jSONArray2);
                    lzVar.e = jSONArray2;
                    lzVar.a(bundle);
                }
                return jSONArray.length();
            }
        } catch (Throwable th) {
            qx.a(th, this);
            return 0;
        }
    }

    public final synchronized List<mq> b() {
        if (qx.a(this)) {
            return null;
        }
        List<mq> list = this.b;
        this.b = new ArrayList();
        return list;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/facebook/appevents/SessionEventsState$Companion;", "", "()V", "MAX_ACCUMULATED_LOG_EVENTS", "", "TAG", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: nc$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        String simpleName = nc.class.getSimpleName();
        dqc.b(simpleName, "SessionEventsState::class.java.simpleName");
        g = simpleName;
    }
}
