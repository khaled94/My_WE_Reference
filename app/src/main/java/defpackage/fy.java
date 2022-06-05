package defpackage;

import androidx.core.util.Pools;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: fy  reason: default package */
/* loaded from: classes2.dex */
public final class fy {
    private final ga a;
    private final a b;

    public fy(Pools.Pool<List<Throwable>> pool) {
        this(new ga(pool));
    }

    private fy(ga gaVar) {
        this.b = new a();
        this.a = gaVar;
    }

    public final synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, fx<? extends Model, ? extends Data> fxVar) {
        this.a.a(cls, cls2, fxVar);
        this.b.a.clear();
    }

    public final synchronized List<Class<?>> a(Class<?> cls) {
        return this.a.b(cls);
    }

    public final synchronized <A> List<fw<A, ?>> b(Class<A> cls) {
        List<fw<A, ?>> list;
        a.C0032a<?> c0032a = this.b.a.get(cls);
        list = c0032a == null ? null : (List<fw<A, ?>>) c0032a.a;
        if (list == null) {
            list = Collections.unmodifiableList(this.a.a(cls));
            if (this.b.a.put(cls, new a.C0032a<>(list)) != null) {
                throw new IllegalStateException("Already cached loaders for model: ".concat(String.valueOf(cls)));
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fy$a */
    /* loaded from: classes2.dex */
    public static class a {
        final Map<Class<?>, C0032a<?>> a = new HashMap();

        a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: fy$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0032a<Model> {
            final List<fw<Model, ?>> a;

            public C0032a(List<fw<Model, ?>> list) {
                this.a = list;
            }
        }
    }
}
