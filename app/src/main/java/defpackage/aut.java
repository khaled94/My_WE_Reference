package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: aut  reason: default package */
/* loaded from: classes.dex */
public final class aut {
    private static final aut a = new aut();
    private final ConcurrentMap<Class<?>, aux<?>> c = new ConcurrentHashMap();
    private final avb b = new atu();

    public static aut a() {
        return a;
    }

    public final <T> aux<T> a(Class<T> cls) {
        atb.a(cls, "messageType");
        aux<T> auxVar = (aux<T>) this.c.get(cls);
        if (auxVar == null) {
            aux<T> a2 = this.b.a(cls);
            atb.a(cls, "messageType");
            atb.a(a2, "schema");
            aux<T> auxVar2 = (aux<T>) this.c.putIfAbsent(cls, a2);
            return auxVar2 != null ? auxVar2 : a2;
        }
        return auxVar;
    }

    public final <T> aux<T> a(T t) {
        return a((Class) t.getClass());
    }

    private aut() {
    }
}
