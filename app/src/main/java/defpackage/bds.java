package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bds  reason: default package */
/* loaded from: classes2.dex */
public final class bds {
    private static final bds a = new bds();
    private final ConcurrentMap<Class<?>, bdy<?>> c = new ConcurrentHashMap();
    private final bdw b = new bct();

    public static bds a() {
        return a;
    }

    public final <T> bdy<T> a(Class<T> cls) {
        bcd.a(cls, "messageType");
        bdy<T> bdyVar = (bdy<T>) this.c.get(cls);
        if (bdyVar == null) {
            bdy<T> a2 = this.b.a(cls);
            bcd.a(cls, "messageType");
            bcd.a(a2, "schema");
            bdy<T> bdyVar2 = (bdy<T>) this.c.putIfAbsent(cls, a2);
            return bdyVar2 != null ? bdyVar2 : a2;
        }
        return bdyVar;
    }

    public final <T> bdy<T> a(T t) {
        return a((Class) t.getClass());
    }

    private bds() {
    }
}
