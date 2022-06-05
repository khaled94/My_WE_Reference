package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: bdd  reason: default package */
/* loaded from: classes2.dex */
final class bdd implements bda {
    @Override // defpackage.bda
    public final Map<?, ?> a(Object obj) {
        return (bdb) obj;
    }

    @Override // defpackage.bda
    public final bcy<?, ?> b() {
        throw new NoSuchMethodError();
    }

    @Override // defpackage.bda
    public final Map<?, ?> b(Object obj) {
        return (bdb) obj;
    }

    @Override // defpackage.bda
    public final boolean c(Object obj) {
        return !((bdb) obj).a;
    }

    @Override // defpackage.bda
    public final Object d(Object obj) {
        ((bdb) obj).a = false;
        return obj;
    }

    @Override // defpackage.bda
    public final Object a() {
        return bdb.a().b();
    }

    @Override // defpackage.bda
    public final Object a(Object obj, Object obj2) {
        bdb bdbVar = (bdb) obj;
        bdb bdbVar2 = (bdb) obj2;
        if (!bdbVar2.isEmpty()) {
            if (!bdbVar.a) {
                bdbVar = bdbVar.b();
            }
            bdbVar.c();
            if (!bdbVar2.isEmpty()) {
                bdbVar.putAll(bdbVar2);
            }
        }
        return bdbVar;
    }

    @Override // defpackage.bda
    public final int e(Object obj) {
        bdb bdbVar = (bdb) obj;
        if (bdbVar.isEmpty()) {
            return 0;
        }
        Iterator it = bdbVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
