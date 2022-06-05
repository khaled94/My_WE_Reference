package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: jv  reason: default package */
/* loaded from: classes2.dex */
public final class jv {
    private final List<a<?>> a = new ArrayList();

    public final synchronized <Z> void a(Class<Z> cls, cp<Z> cpVar) {
        this.a.add(new a<>(cls, cpVar));
    }

    public final synchronized <Z> cp<Z> a(Class<Z> cls) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            a<?> aVar = this.a.get(i);
            if (aVar.a.isAssignableFrom(cls)) {
                return (cp<Z>) aVar.b;
            }
        }
        return null;
    }

    /* renamed from: jv$a */
    /* loaded from: classes2.dex */
    static final class a<T> {
        final Class<T> a;
        final cp<T> b;

        a(Class<T> cls, cp<T> cpVar) {
            this.a = cls;
            this.b = cpVar;
        }
    }
}
