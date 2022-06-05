package defpackage;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: cmm  reason: default package */
/* loaded from: classes2.dex */
class cmm implements cms, cmt {
    private final Map<Class<?>, ConcurrentHashMap<cmr<Object>, Executor>> a = new HashMap();
    private Queue<cmq<?>> b = new ArrayDeque();
    private final Executor c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cmm(Executor executor) {
        this.c = executor;
    }

    private void a(cmq<?> cmqVar) {
        aat.a(cmqVar);
        synchronized (this) {
            if (this.b != null) {
                this.b.add(cmqVar);
                return;
            }
            for (Map.Entry<cmr<Object>, Executor> entry : b(cmqVar)) {
                entry.getValue().execute(cmn.a(entry, cmqVar));
            }
        }
    }

    private synchronized Set<Map.Entry<cmr<Object>, Executor>> b(cmq<?> cmqVar) {
        ConcurrentHashMap<cmr<Object>, Executor> concurrentHashMap = this.a.get(cmqVar.a);
        if (concurrentHashMap == null) {
            return Collections.emptySet();
        }
        return concurrentHashMap.entrySet();
    }

    @Override // defpackage.cmt
    public final synchronized <T> void a(Class<T> cls, Executor executor, cmr<? super T> cmrVar) {
        aat.a(cls);
        aat.a(cmrVar);
        aat.a(executor);
        if (!this.a.containsKey(cls)) {
            this.a.put(cls, new ConcurrentHashMap<>());
        }
        this.a.get(cls).put(cmrVar, executor);
    }

    @Override // defpackage.cmt
    public final <T> void a(Class<T> cls, cmr<? super T> cmrVar) {
        a(cls, this.c, cmrVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        Queue<cmq<?>> queue;
        synchronized (this) {
            queue = null;
            if (this.b != null) {
                Queue<cmq<?>> queue2 = this.b;
                this.b = null;
                queue = queue2;
            }
        }
        if (queue != null) {
            for (cmq<?> cmqVar : queue) {
                a(cmqVar);
            }
        }
    }
}
