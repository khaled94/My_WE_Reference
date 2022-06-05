package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: jq  reason: default package */
/* loaded from: classes2.dex */
public final class jq {
    private final List<a<?>> a = new ArrayList();

    public final synchronized <T> ci<T> a(Class<T> cls) {
        for (a<?> aVar : this.a) {
            if (aVar.a.isAssignableFrom(cls)) {
                return (ci<T>) aVar.b;
            }
        }
        return null;
    }

    public final synchronized <T> void a(Class<T> cls, ci<T> ciVar) {
        this.a.add(new a<>(cls, ciVar));
    }

    /* renamed from: jq$a */
    /* loaded from: classes2.dex */
    static final class a<T> {
        final Class<T> a;
        final ci<T> b;

        a(Class<T> cls, ci<T> ciVar) {
            this.a = cls;
            this.b = ciVar;
        }
    }
}
