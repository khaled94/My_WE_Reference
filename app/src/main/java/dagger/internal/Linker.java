package dagger.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes2.dex */
public final class Linker {
    private static final Object c = new Object();
    private final Linker d;
    private final dkd g;
    private final a h;
    public final Queue<djz<?>> a = new LinkedList();
    private boolean e = true;
    private final List<String> f = new ArrayList();
    public final Map<String, djz<?>> b = new HashMap();

    /* loaded from: classes2.dex */
    public interface a {
        public static final a a = new a() { // from class: dagger.internal.Linker.a.1
            @Override // dagger.internal.Linker.a
            public final void a(List<String> list) {
            }
        };

        void a(List<String> list);
    }

    public Linker(Linker linker, dkd dkdVar, a aVar) {
        if (dkdVar == null) {
            throw new NullPointerException("plugin");
        }
        this.d = linker;
        this.g = dkdVar;
        this.h = aVar;
    }

    public final void a(Map<String, ? extends djz<?>> map) {
        for (Map.Entry<String, ? extends djz<?>> entry : map.entrySet()) {
            this.b.put(entry.getKey(), a(entry.getValue()));
        }
    }

    public final void a() {
        c();
        while (true) {
            djz<?> poll = this.a.poll();
            if (poll != null) {
                if (poll instanceof DeferredBinding) {
                    DeferredBinding deferredBinding = (DeferredBinding) poll;
                    String str = deferredBinding.e;
                    boolean z = deferredBinding.f;
                    if (!this.b.containsKey(str)) {
                        try {
                            djz<?> b = b(str, poll.d, z);
                            b.c(poll.f());
                            b.d(poll.g());
                            if (!str.equals(b.b) && !str.equals(b.c)) {
                                throw new IllegalStateException("Unable to create binding for ".concat(String.valueOf(str)));
                                break;
                            }
                            djz<?> a2 = a(b);
                            this.a.add(a2);
                            b(a2);
                        } catch (Exception e) {
                            if (e.getMessage() != null) {
                                a(e.getMessage() + " required by " + poll.d);
                                this.b.put(str, djz.a);
                            } else if (e instanceof RuntimeException) {
                                throw ((RuntimeException) e);
                            } else {
                                throw new RuntimeException(e);
                            }
                        }
                    } else {
                        continue;
                    }
                } else {
                    this.e = true;
                    poll.a(this);
                    if (this.e) {
                        poll.a();
                    } else {
                        this.a.add(poll);
                    }
                }
            } else {
                try {
                    this.h.a(this.f);
                    return;
                } finally {
                    this.f.clear();
                }
            }
        }
    }

    private void c() {
        if (Thread.holdsLock(this)) {
            return;
        }
        throw new AssertionError();
    }

    private djz<?> b(String str, Object obj, boolean z) throws ClassNotFoundException {
        djz<?> a2;
        String a3 = dka.a(str);
        if (a3 != null) {
            return new BuiltInBinding(str, obj, a3);
        }
        String b = dka.b(str);
        if (b != null) {
            return new LazyBinding(str, obj, b);
        }
        String d = dka.d(str);
        if (d != null && !dka.c(str) && (a2 = this.g.a(str, d, z)) != null) {
            return a2;
        }
        throw new IllegalArgumentException("No binding for ".concat(String.valueOf(str)));
    }

    public final djz<?> a(String str, Object obj) {
        return a(str, obj, true);
    }

    public final djz<?> a(String str, Object obj, boolean z) {
        c();
        Linker linker = this;
        djz<?> djzVar = null;
        while (true) {
            if (linker == null) {
                break;
            }
            djzVar = linker.b.get(str);
            if (djzVar == null) {
                linker = linker.d;
            } else if (linker != this && !djzVar.b()) {
                throw new AssertionError();
            }
        }
        if (djzVar == null) {
            DeferredBinding deferredBinding = new DeferredBinding(str, obj, z, (byte) 0);
            deferredBinding.c(true);
            deferredBinding.d(true);
            this.a.add(deferredBinding);
            this.e = false;
            return null;
        }
        if (!djzVar.b()) {
            this.a.add(djzVar);
        }
        djzVar.c(true);
        djzVar.d(true);
        return djzVar;
    }

    private <T> void b(djz<T> djzVar) {
        if (djzVar.b != null) {
            a((Map<String, djz<T>>) this.b, djzVar.b, djzVar);
        }
        if (djzVar.c != null) {
            a((Map<String, djz<T>>) this.b, djzVar.c, djzVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> djz<T> a(djz<T> djzVar) {
        if (!djzVar.c()) {
            return djzVar;
        }
        if (djzVar instanceof SingletonBinding) {
            throw new AssertionError();
        }
        return new SingletonBinding(djzVar, (byte) 0);
    }

    private static <K, V> void a(Map<K, V> map, K k, V v) {
        V put = map.put(k, v);
        if (put != null) {
            map.put(k, put);
        }
    }

    private void a(String str) {
        this.f.add(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SingletonBinding<T> extends djz<T> {
        private final djz<T> e;
        private volatile Object f;

        @Override // defpackage.djz
        public final boolean c() {
            return true;
        }

        /* synthetic */ SingletonBinding(djz djzVar, byte b) {
            this(djzVar);
        }

        private SingletonBinding(djz<T> djzVar) {
            super(djzVar.b, djzVar.c, true, djzVar.d);
            this.f = Linker.c;
            this.e = djzVar;
        }

        @Override // defpackage.djz
        public final void a(Linker linker) {
            this.e.a(linker);
        }

        @Override // defpackage.djz, dagger.MembersInjector
        public void injectMembers(T t) {
            this.e.injectMembers(t);
        }

        @Override // defpackage.djz, javax.inject.Provider
        public T get() {
            if (this.f == Linker.c) {
                synchronized (this) {
                    if (this.f == Linker.c) {
                        this.f = this.e.get();
                    }
                }
            }
            return (T) this.f;
        }

        @Override // defpackage.djz
        public final void a(Set<djz<?>> set, Set<djz<?>> set2) {
            this.e.a(set, set2);
        }

        @Override // defpackage.djz
        public final boolean e() {
            return this.e.e();
        }

        @Override // defpackage.djz
        public final boolean b() {
            return this.e.b();
        }

        @Override // defpackage.djz
        public final boolean d() {
            return this.e.d();
        }

        @Override // defpackage.djz
        public final boolean f() {
            return this.e.f();
        }

        @Override // defpackage.djz
        public final boolean g() {
            return this.e.g();
        }

        @Override // defpackage.djz
        public final void b(boolean z) {
            this.e.b(z);
        }

        @Override // defpackage.djz
        public final void a(boolean z) {
            this.e.a(z);
        }

        @Override // defpackage.djz
        public final void c(boolean z) {
            this.e.c(true);
        }

        @Override // defpackage.djz
        public final void d(boolean z) {
            this.e.d(z);
        }

        @Override // defpackage.djz
        public final void a() {
            this.e.a();
        }

        @Override // defpackage.djz
        public String toString() {
            return "@Singleton/" + this.e.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class DeferredBinding extends djz<Object> {
        final String e;
        final boolean f;

        /* synthetic */ DeferredBinding(String str, Object obj, boolean z, byte b) {
            this(str, obj, z);
        }

        private DeferredBinding(String str, Object obj, boolean z) {
            super(null, null, false, obj);
            this.e = str;
            this.f = z;
        }

        @Override // defpackage.djz, dagger.MembersInjector
        public void injectMembers(Object obj) {
            throw new UnsupportedOperationException("Deferred bindings must resolve first.");
        }

        @Override // defpackage.djz
        public final void a(Set<djz<?>> set, Set<djz<?>> set2) {
            throw new UnsupportedOperationException("Deferred bindings must resolve first.");
        }
    }
}
