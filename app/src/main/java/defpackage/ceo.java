package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ceo  reason: default package */
/* loaded from: classes2.dex */
public final class ceo {
    private static final ceo a = new ceo();
    private final ConcurrentMap<Class<?>, cet<?>> c = new ConcurrentHashMap();
    private final ceu b = new cdu();

    public static ceo a() {
        return a;
    }

    public final <T> cet<T> a(Class<T> cls) {
        cdm.a(cls, "messageType");
        cet<T> cetVar = (cet<T>) this.c.get(cls);
        if (cetVar == null) {
            cet<T> a2 = this.b.a(cls);
            cet<T> cetVar2 = (cet<T>) a(cls, a2);
            return cetVar2 != null ? cetVar2 : a2;
        }
        return cetVar;
    }

    public final <T> cet<T> a(T t) {
        return a((Class) t.getClass());
    }

    private cet<?> a(Class<?> cls, cet<?> cetVar) {
        cdm.a(cls, "messageType");
        cdm.a(cetVar, "schema");
        return this.c.putIfAbsent(cls, cetVar);
    }

    private ceo() {
    }
}
