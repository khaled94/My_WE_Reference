package defpackage;

import defpackage.cv;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: cw  reason: default package */
/* loaded from: classes2.dex */
public final class cw {
    private static final cv.a<?> b = new cv.a<Object>() { // from class: cw.1
        @Override // defpackage.cv.a
        public final cv<Object> a(Object obj) {
            return new a(obj);
        }

        @Override // defpackage.cv.a
        public final Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }
    };
    private final Map<Class<?>, cv.a<?>> a = new HashMap();

    public final synchronized void a(cv.a<?> aVar) {
        this.a.put(aVar.a(), aVar);
    }

    /* renamed from: cw$a */
    /* loaded from: classes2.dex */
    static final class a implements cv<Object> {
        private final Object a;

        @Override // defpackage.cv
        public final void b() {
        }

        a(Object obj) {
            this.a = obj;
        }

        @Override // defpackage.cv
        public final Object a() {
            return this.a;
        }
    }

    public final synchronized <T> cv<T> a(T t) {
        cv.a<?> aVar;
        lf.a(t, "Argument must not be null");
        aVar = this.a.get(t.getClass());
        if (aVar == null) {
            Iterator<cv.a<?>> it = this.a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                cv.a<?> next = it.next();
                if (next.a().isAssignableFrom(t.getClass())) {
                    aVar = next;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = b;
        }
        return (cv<T>) aVar.a(t);
    }
}
