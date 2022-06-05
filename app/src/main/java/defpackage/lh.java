package defpackage;

import android.util.Log;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.List;

/* renamed from: lh  reason: default package */
/* loaded from: classes2.dex */
public final class lh {
    private static final d<Object> a = new d<Object>() { // from class: lh.1
        @Override // defpackage.lh.d
        public final void a(Object obj) {
        }
    };

    /* renamed from: lh$a */
    /* loaded from: classes2.dex */
    public interface a<T> {
        T a();
    }

    /* renamed from: lh$c */
    /* loaded from: classes2.dex */
    public interface c {
        lj a_();
    }

    /* renamed from: lh$d */
    /* loaded from: classes2.dex */
    public interface d<T> {
        void a(T t);
    }

    private lh() {
    }

    public static <T extends c> Pools.Pool<T> a(int i, a<T> aVar) {
        return a(new Pools.SynchronizedPool(i), aVar, a);
    }

    private static <T> Pools.Pool<T> a(Pools.Pool<T> pool, a<T> aVar, d<T> dVar) {
        return new b(pool, aVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lh$b */
    /* loaded from: classes2.dex */
    public static final class b<T> implements Pools.Pool<T> {
        private final a<T> a;
        private final d<T> b;
        private final Pools.Pool<T> c;

        b(Pools.Pool<T> pool, a<T> aVar, d<T> dVar) {
            this.c = pool;
            this.a = aVar;
            this.b = dVar;
        }

        @Override // androidx.core.util.Pools.Pool
        public final T acquire() {
            T acquire = this.c.acquire();
            if (acquire == null) {
                acquire = this.a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    new StringBuilder("Created new ").append(acquire.getClass());
                }
            }
            if (acquire instanceof c) {
                ((c) acquire).a_().a(false);
            }
            return acquire;
        }

        @Override // androidx.core.util.Pools.Pool
        public final boolean release(T t) {
            if (t instanceof c) {
                ((c) t).a_().a(true);
            }
            this.b.a(t);
            return this.c.release(t);
        }
    }

    public static <T> Pools.Pool<List<T>> a() {
        return a(new Pools.SynchronizedPool(20), new a<List<T>>() { // from class: lh.2
            @Override // defpackage.lh.a
            public final /* synthetic */ Object a() {
                return new ArrayList();
            }
        }, new d<List<T>>() { // from class: lh.3
            @Override // defpackage.lh.d
            public final /* synthetic */ void a(Object obj) {
                ((List) obj).clear();
            }
        });
    }
}
