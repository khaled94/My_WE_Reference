package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: amr  reason: default package */
/* loaded from: classes.dex */
final class amr {
    private final ConcurrentHashMap<amq, List<Throwable>> a = new ConcurrentHashMap<>(16, 0.75f, 10);
    private final ReferenceQueue<Throwable> b = new ReferenceQueue<>();

    public final List<Throwable> a(Throwable th) {
        Reference<? extends Throwable> poll = this.b.poll();
        while (poll != null) {
            this.a.remove(poll);
            poll = this.b.poll();
        }
        List<Throwable> list = this.a.get(new amq(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.a.putIfAbsent(new amq(th, this.b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
