package defpackage;

import android.content.Context;
import defpackage.mu;
import defpackage.pg;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0013\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\tH\u0086\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0015\u001a\u00020\tH\u0002J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0017R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/facebook/appevents/AppEventCollection;", "", "()V", "eventCount", "", "getEventCount", "()I", "stateMap", "Ljava/util/HashMap;", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "Lcom/facebook/appevents/SessionEventsState;", "addEvent", "", "accessTokenAppIdPair", "appEvent", "Lcom/facebook/appevents/AppEvent;", "addPersistedEvents", "persistedEvents", "Lcom/facebook/appevents/PersistedEvents;", "get", "getSessionEventsState", "accessTokenAppId", "keySet", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: mr  reason: default package */
/* loaded from: classes2.dex */
public final class mr {
    private final HashMap<mo, nc> a = new HashMap<>();

    public final synchronized void a(nb nbVar) {
        if (nbVar == null) {
            return;
        }
        for (mo moVar : nbVar.a()) {
            nc b = b(moVar);
            if (b != null) {
                List<mq> a = nbVar.a(moVar);
                if (a == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                for (mq mqVar : a) {
                    b.a(mqVar);
                }
            }
        }
    }

    public final synchronized void a(mo moVar, mq mqVar) {
        dqc.d(moVar, "accessTokenAppIdPair");
        dqc.d(mqVar, "appEvent");
        nc b = b(moVar);
        if (b != null) {
            b.a(mqVar);
        }
    }

    public final synchronized Set<mo> a() {
        Set<mo> keySet;
        keySet = this.a.keySet();
        dqc.b(keySet, "stateMap.keys");
        return keySet;
    }

    public final synchronized nc a(mo moVar) {
        dqc.d(moVar, "accessTokenAppIdPair");
        return this.a.get(moVar);
    }

    public final synchronized int b() {
        int i;
        i = 0;
        for (nc ncVar : this.a.values()) {
            i += ncVar.a();
        }
        return i;
    }

    private final synchronized nc b(mo moVar) {
        nc ncVar = this.a.get(moVar);
        if (ncVar == null) {
            Context k = ly.k();
            pg.a aVar = pg.e;
            pg a = pg.a.a(k);
            if (a != null) {
                mu.a aVar2 = mu.b;
                ncVar = new nc(a, mu.a.b(k));
            } else {
                ncVar = null;
            }
        }
        if (ncVar == null) {
            return null;
        }
        this.a.put(moVar, ncVar);
        return ncVar;
    }
}
