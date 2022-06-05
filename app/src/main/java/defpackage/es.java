package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: es  reason: default package */
/* loaded from: classes2.dex */
public final class es implements ek {
    private final eq<a, Object> a;
    private final b b;
    private final Map<Class<?>, NavigableMap<Integer, Integer>> c;
    private final Map<Class<?>, ej<?>> d;
    private final int e;
    private int f;

    public es() {
        this.a = new eq<>();
        this.b = new b();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = 4194304;
    }

    public es(int i) {
        this.a = new eq<>();
        this.b = new b();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = i;
    }

    @Override // defpackage.ek
    public final synchronized <T> void a(T t) {
        Class<?> cls = t.getClass();
        ej<T> c = c(cls);
        int a2 = c.a((ej<T>) t);
        int b2 = c.b() * a2;
        int i = 1;
        if (!(b2 <= this.e / 2)) {
            return;
        }
        a a3 = this.b.a(a2, cls);
        this.a.a(a3, t);
        NavigableMap<Integer, Integer> b3 = b(cls);
        Integer num = (Integer) b3.get(Integer.valueOf(a3.a));
        Integer valueOf = Integer.valueOf(a3.a);
        if (num != null) {
            i = 1 + num.intValue();
        }
        b3.put(valueOf, Integer.valueOf(i));
        this.f += b2;
        b(this.e);
    }

    @Override // defpackage.ek
    public final synchronized <T> T a(Class<T> cls) {
        return (T) a(this.b.a(8, cls), cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025 A[Catch: all -> 0x0048, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:7:0x0017, B:13:0x0025, B:18:0x0031, B:19:0x003c, B:20:0x0042), top: B:25:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031 A[Catch: all -> 0x0048, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:7:0x0017, B:13:0x0025, B:18:0x0031, B:19:0x003c, B:20:0x0042), top: B:25:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c A[Catch: all -> 0x0048, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:7:0x0017, B:13:0x0025, B:18:0x0031, B:19:0x003c, B:20:0x0042), top: B:25:0x0001 }] */
    @Override // defpackage.ek
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized <T> T a(int r6, java.lang.Class<T> r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.NavigableMap r0 = r5.b(r7)     // Catch: java.lang.Throwable -> L48
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L48
            java.lang.Object r0 = r0.ceilingKey(r1)     // Catch: java.lang.Throwable -> L48
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L48
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2e
            int r3 = r5.f     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L22
            int r3 = r5.e     // Catch: java.lang.Throwable -> L48
            int r4 = r5.f     // Catch: java.lang.Throwable -> L48
            int r3 = r3 / r4
            r4 = 2
            if (r3 < r4) goto L20
            goto L22
        L20:
            r3 = 0
            goto L23
        L22:
            r3 = 1
        L23:
            if (r3 != 0) goto L2f
            int r3 = r0.intValue()     // Catch: java.lang.Throwable -> L48
            int r4 = r6 * 8
            if (r3 > r4) goto L2e
            goto L2f
        L2e:
            r1 = 0
        L2f:
            if (r1 == 0) goto L3c
            es$b r6 = r5.b     // Catch: java.lang.Throwable -> L48
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L48
            es$a r6 = r6.a(r0, r7)     // Catch: java.lang.Throwable -> L48
            goto L42
        L3c:
            es$b r0 = r5.b     // Catch: java.lang.Throwable -> L48
            es$a r6 = r0.a(r6, r7)     // Catch: java.lang.Throwable -> L48
        L42:
            java.lang.Object r6 = r5.a(r6, r7)     // Catch: java.lang.Throwable -> L48
            monitor-exit(r5)
            return r6
        L48:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.es.a(int, java.lang.Class):java.lang.Object");
    }

    private <T> T a(a aVar, Class<T> cls) {
        ej<T> c = c(cls);
        T t = (T) a(aVar);
        if (t != null) {
            this.f -= c.a((ej<T>) t) * c.b();
            b(c.a((ej<T>) t), cls);
        }
        if (t == null) {
            if (Log.isLoggable(c.a(), 2)) {
                c.a();
                StringBuilder sb = new StringBuilder("Allocated ");
                sb.append(aVar.a);
                sb.append(" bytes");
            }
            return c.a(aVar.a);
        }
        return t;
    }

    private <T> T a(a aVar) {
        return (T) this.a.a((eq<a, Object>) aVar);
    }

    @Override // defpackage.ek
    public final synchronized void a() {
        b(0);
    }

    @Override // defpackage.ek
    public final synchronized void a(int i) {
        if (i >= 40) {
            a();
            return;
        }
        if (i >= 20 || i == 15) {
            b(this.e / 2);
        }
    }

    private void b(int i) {
        while (this.f > i) {
            Object a2 = this.a.a();
            lf.a(a2, "Argument must not be null");
            ej b2 = b((es) a2);
            this.f -= b2.a((ej) a2) * b2.b();
            b(b2.a((ej) a2), a2.getClass());
            if (Log.isLoggable(b2.a(), 2)) {
                b2.a();
                new StringBuilder("evicted: ").append(b2.a((ej) a2));
            }
        }
    }

    private void b(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> b2 = b(cls);
        Integer num = (Integer) b2.get(Integer.valueOf(i));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
        } else if (num.intValue() == 1) {
            b2.remove(Integer.valueOf(i));
        } else {
            b2.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    private NavigableMap<Integer, Integer> b(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.c.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.c.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    private <T> ej<T> b(T t) {
        return c(t.getClass());
    }

    private <T> ej<T> c(Class<T> cls) {
        ep epVar = (ej<T>) this.d.get(cls);
        if (epVar == null) {
            if (cls.equals(int[].class)) {
                epVar = new er();
            } else if (cls.equals(byte[].class)) {
                epVar = new ep();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.d.put(cls, epVar);
        }
        return epVar;
    }

    /* renamed from: es$b */
    /* loaded from: classes2.dex */
    static final class b extends em<a> {
        b() {
        }

        final a a(int i, Class<?> cls) {
            a b = b();
            b.a(i, cls);
            return b;
        }

        @Override // defpackage.em
        protected final /* synthetic */ a a() {
            return new a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: es$a */
    /* loaded from: classes2.dex */
    public static final class a implements ev {
        int a;
        private final b b;
        private Class<?> c;

        a(b bVar) {
            this.b = bVar;
        }

        final void a(int i, Class<?> cls) {
            this.a = i;
            this.c = cls;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.a == aVar.a && this.c == aVar.c) {
                    return true;
                }
            }
            return false;
        }

        public final String toString() {
            return "Key{size=" + this.a + "array=" + this.c + '}';
        }

        @Override // defpackage.ev
        public final void a() {
            this.b.a(this);
        }

        public final int hashCode() {
            int i = this.a * 31;
            Class<?> cls = this.c;
            return i + (cls != null ? cls.hashCode() : 0);
        }
    }
}
