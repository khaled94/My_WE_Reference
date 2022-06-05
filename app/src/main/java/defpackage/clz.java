package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: clz  reason: default package */
/* loaded from: classes2.dex */
public final class clz<T> {
    final Set<Class<? super T>> a;
    final Set<cml> b;
    final cme<T> c;
    final Set<Class<?>> d;
    private final int e;
    private final int f;

    /* synthetic */ clz(Set set, Set set2, int i, int i2, cme cmeVar, Set set3, byte b) {
        this(set, set2, i, i2, cmeVar, set3);
    }

    private clz(Set<Class<? super T>> set, Set<cml> set2, int i, int i2, cme<T> cmeVar, Set<Class<?>> set3) {
        this.a = Collections.unmodifiableSet(set);
        this.b = Collections.unmodifiableSet(set2);
        this.e = i;
        this.f = i2;
        this.c = cmeVar;
        this.d = Collections.unmodifiableSet(set3);
    }

    public final boolean a() {
        return this.e == 1;
    }

    public final boolean b() {
        return this.e == 2;
    }

    public final boolean c() {
        return this.f == 0;
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.a.toArray()) + ">{" + this.e + ", type=" + this.f + ", deps=" + Arrays.toString(this.b.toArray()) + "}";
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls, new Class[0], (byte) 0);
    }

    @SafeVarargs
    public static <T> a<T> a(Class<T> cls, Class<? super T>... clsArr) {
        return new a<>(cls, clsArr, (byte) 0);
    }

    @SafeVarargs
    public static <T> clz<T> a(T t, Class<T> cls, Class<? super T>... clsArr) {
        return a(cls, clsArr).a(cma.a(t)).a();
    }

    /* renamed from: clz$a */
    /* loaded from: classes2.dex */
    public static class a<T> {
        int a;
        private final Set<Class<? super T>> b;
        private final Set<cml> c;
        private int d;
        private cme<T> e;
        private Set<Class<?>> f;

        /* synthetic */ a(Class cls, Class[] clsArr, byte b) {
            this(cls, clsArr);
        }

        @SafeVarargs
        private a(Class<T> cls, Class<? super T>... clsArr) {
            this.b = new HashSet();
            this.c = new HashSet();
            this.d = 0;
            this.a = 0;
            this.f = new HashSet();
            aat.a(cls, "Null interface");
            this.b.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                aat.a(cls2, "Null interface");
            }
            Collections.addAll(this.b, clsArr);
        }

        public final a<T> a(cml cmlVar) {
            aat.a(cmlVar, "Null dependency");
            a(cmlVar.a);
            this.c.add(cmlVar);
            return this;
        }

        public final a<T> a(int i) {
            aat.b(this.d == 0, "Instantiation type has already been set.");
            this.d = i;
            return this;
        }

        private void a(Class<?> cls) {
            aat.a(!this.b.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public final a<T> a(cme<T> cmeVar) {
            this.e = (cme) aat.a(cmeVar, "Null factory");
            return this;
        }

        public final clz<T> a() {
            aat.b(this.e != null, "Missing required property: factory.");
            return new clz<>(new HashSet(this.b), new HashSet(this.c), this.d, this.a, this.e, this.f, (byte) 0);
        }
    }

    public static <T> clz<T> a(final T t, Class<T> cls) {
        a a2 = a(cls);
        a2.a = 1;
        return a2.a(new cme(t) { // from class: cmb
            private final Object a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = t;
            }

            @Override // defpackage.cme
            public final Object a(cmc cmcVar) {
                return this.a;
            }
        }).a();
    }
}
