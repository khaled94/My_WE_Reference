package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\f\b\u0002\u0010\n\u001a\u00060\u0005j\u0002`\u0006J\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00072\f\b\u0002\u0010\n\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\f\u001a\u00020\u0005J$\u0010\r\u001a\u00020\u000e2\f\b\u0002\u0010\n\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eJ\u0014\u0010\u0010\u001a\u00020\u00112\f\b\u0002\u0010\n\u001a\u00060\u0005j\u0002`\u0006J\u001c\u0010\u0012\u001a\u00020\u00112\f\b\u0002\u0010\n\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0013\u001a\u00020\u0007J$\u0010\u0014\u001a\u00020\u00112\f\b\u0002\u0010\n\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000eJ\"\u0010\u0016\u001a\u00020\u00112\f\b\u0002\u0010\n\u001a\u00060\u0005j\u0002`\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\tR*\u0010\u0003\u001a\u001e\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/facebook/internal/gatekeeper/GateKeeperRuntimeCache;", "", "()V", "gateKeepers", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/facebook/internal/gatekeeper/AppID;", "Lcom/facebook/internal/gatekeeper/GateKeeper;", "dumpGateKeepers", "", "appId", "getGateKeeper", "name", "getGateKeeperValue", "", "defaultValue", "resetCache", "", "setGateKeeper", "gateKeeper", "setGateKeeperValue", "value", "setGateKeepers", "gateKeeperList", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: qn  reason: default package */
/* loaded from: classes2.dex */
public final class qn {
    private final ConcurrentHashMap<String, ConcurrentHashMap<String, qm>> a = new ConcurrentHashMap<>();

    public final void a(String str, List<qm> list) {
        dqc.d(str, "appId");
        dqc.d(list, "gateKeeperList");
        ConcurrentHashMap<String, qm> concurrentHashMap = new ConcurrentHashMap<>();
        for (qm qmVar : list) {
            concurrentHashMap.put(qmVar.a, qmVar);
        }
        this.a.put(str, concurrentHashMap);
    }

    public final List<qm> a(String str) {
        dqc.d(str, "appId");
        ConcurrentHashMap<String, qm> concurrentHashMap = this.a.get(str);
        if (concurrentHashMap != null) {
            ConcurrentHashMap<String, qm> concurrentHashMap2 = concurrentHashMap;
            ArrayList arrayList = new ArrayList(concurrentHashMap2.size());
            for (Map.Entry<String, qm> entry : concurrentHashMap2.entrySet()) {
                arrayList.add(entry.getValue());
            }
            return arrayList;
        }
        return null;
    }
}
