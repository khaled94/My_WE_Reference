package defpackage;

import androidx.collection.ArrayMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: jt  reason: default package */
/* loaded from: classes2.dex */
public final class jt {
    private final AtomicReference<le> b = new AtomicReference<>();
    public final ArrayMap<le, List<Class<?>>> a = new ArrayMap<>();

    public final List<Class<?>> a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        le andSet = this.b.getAndSet(null);
        if (andSet == null) {
            andSet = new le(cls, cls2, cls3);
        } else {
            andSet.a(cls, cls2, cls3);
        }
        synchronized (this.a) {
            list = this.a.get(andSet);
        }
        this.b.set(andSet);
        return list;
    }
}
