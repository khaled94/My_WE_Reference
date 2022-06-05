package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: aue  reason: default package */
/* loaded from: classes.dex */
final class aue implements aub {
    @Override // defpackage.aub
    public final Map<?, ?> a(Object obj) {
        return (auc) obj;
    }

    @Override // defpackage.aub
    public final aty<?, ?> b() {
        throw new NoSuchMethodError();
    }

    @Override // defpackage.aub
    public final Map<?, ?> b(Object obj) {
        return (auc) obj;
    }

    @Override // defpackage.aub
    public final boolean c(Object obj) {
        return !((auc) obj).a;
    }

    @Override // defpackage.aub
    public final Object d(Object obj) {
        ((auc) obj).a = false;
        return obj;
    }

    @Override // defpackage.aub
    public final Object a() {
        return auc.a().b();
    }

    @Override // defpackage.aub
    public final Object a(Object obj, Object obj2) {
        auc aucVar = (auc) obj;
        auc aucVar2 = (auc) obj2;
        if (!aucVar2.isEmpty()) {
            if (!aucVar.a) {
                aucVar = aucVar.b();
            }
            aucVar.c();
            if (!aucVar2.isEmpty()) {
                aucVar.putAll(aucVar2);
            }
        }
        return aucVar;
    }

    @Override // defpackage.aub
    public final int e(Object obj) {
        auc aucVar = (auc) obj;
        if (aucVar.isEmpty()) {
            return 0;
        }
        Iterator it = aucVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
