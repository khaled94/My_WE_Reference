package defpackage;

import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import defpackage.fw;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: ga  reason: default package */
/* loaded from: classes2.dex */
public final class ga {
    private static final c a = new c();
    private static final fw<Object, Object> b = new a();
    private final List<b<?, ?>> c;
    private final c d;
    private final Set<b<?, ?>> e;
    private final Pools.Pool<List<Throwable>> f;

    public ga(Pools.Pool<List<Throwable>> pool) {
        this(pool, a);
    }

    private ga(Pools.Pool<List<Throwable>> pool, c cVar) {
        this.c = new ArrayList();
        this.e = new HashSet();
        this.f = pool;
        this.d = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized <Model> List<fw<Model, ?>> a(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.c) {
                if (!this.e.contains(bVar) && bVar.a(cls)) {
                    this.e.add(bVar);
                    arrayList.add(a(bVar));
                    this.e.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.e.clear();
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized List<Class<?>> b(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.c) {
            if (!arrayList.contains(bVar.a) && bVar.a(cls)) {
                arrayList.add(bVar.a);
            }
        }
        return arrayList;
    }

    public final synchronized <Model, Data> fw<Model, Data> a(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (b<?, ?> bVar : this.c) {
                if (this.e.contains(bVar)) {
                    z = true;
                } else if (bVar.a(cls) && bVar.a.isAssignableFrom(cls2)) {
                    this.e.add(bVar);
                    arrayList.add(a(bVar));
                    this.e.remove(bVar);
                }
            }
            if (arrayList.size() <= 1) {
                if (arrayList.size() == 1) {
                    return (fw) arrayList.get(0);
                } else if (!z) {
                    throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
                } else {
                    return (fw<Model, Data>) b;
                }
            }
            return new fz(arrayList, this.f);
        } catch (Throwable th) {
            this.e.clear();
            throw th;
        }
    }

    private <Model, Data> fw<Model, Data> a(b<?, ?> bVar) {
        return (fw) lf.a(bVar.b.a(this), "Argument must not be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ga$b */
    /* loaded from: classes2.dex */
    public static class b<Model, Data> {
        final Class<Data> a;
        final fx<? extends Model, ? extends Data> b;
        private final Class<Model> c;

        public b(Class<Model> cls, Class<Data> cls2, fx<? extends Model, ? extends Data> fxVar) {
            this.c = cls;
            this.a = cls2;
            this.b = fxVar;
        }

        public final boolean a(Class<?> cls) {
            return this.c.isAssignableFrom(cls);
        }
    }

    /* renamed from: ga$c */
    /* loaded from: classes2.dex */
    static class c {
        c() {
        }
    }

    /* renamed from: ga$a */
    /* loaded from: classes2.dex */
    static class a implements fw<Object, Object> {
        @Override // defpackage.fw
        public final fw.a<Object> a(Object obj, int i, int i2, cm cmVar) {
            return null;
        }

        @Override // defpackage.fw
        public final boolean a(Object obj) {
            return false;
        }

        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, fx<? extends Model, ? extends Data> fxVar) {
        this.c.add(this.c.size(), new b<>(cls, cls2, fxVar));
    }
}
