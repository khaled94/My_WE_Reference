package defpackage;

import androidx.collection.ArrayMap;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: js  reason: default package */
/* loaded from: classes2.dex */
public final class js {
    public static final ec<?, ?, ?> a = new ec<>(Object.class, Object.class, Object.class, Collections.singletonList(new ds(Object.class, Object.class, Object.class, Collections.emptyList(), new iq(), null)), null);
    public final ArrayMap<le, ec<?, ?, ?>> b = new ArrayMap<>();
    private final AtomicReference<le> c = new AtomicReference<>();

    public static boolean a(ec<?, ?, ?> ecVar) {
        return a.equals(ecVar);
    }

    public final <Data, TResource, Transcode> ec<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ec<Data, TResource, Transcode> ecVar;
        le andSet = this.c.getAndSet(null);
        if (andSet == null) {
            andSet = new le();
        }
        andSet.a(cls, cls2, cls3);
        synchronized (this.b) {
            ecVar = (ec<Data, TResource, Transcode>) this.b.get(andSet);
        }
        this.c.set(andSet);
        return ecVar;
    }
}
