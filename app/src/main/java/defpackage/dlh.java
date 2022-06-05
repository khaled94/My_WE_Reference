package defpackage;

import defpackage.dlh.b;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: dlh  reason: default package */
/* loaded from: classes2.dex */
public final class dlh<T extends b> {
    public List<T> a = new CopyOnWriteArrayList();
    public boolean b = false;

    /* renamed from: dlh$a */
    /* loaded from: classes2.dex */
    public interface a<T extends b> {
        void a(T t);
    }

    /* renamed from: dlh$b */
    /* loaded from: classes2.dex */
    public static abstract class b<T, S> {
        final WeakReference<T> a;
        protected final S b;
        boolean c = false;

        public b(T t, S s) {
            this.b = s;
            this.a = new WeakReference<>(t);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.b.equals(bVar.b) && this.a.get() == bVar.a.get()) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            T t = this.a.get();
            int i = 0;
            int hashCode = ((t != null ? t.hashCode() : 0) + 527) * 31;
            S s = this.b;
            if (s != null) {
                i = s.hashCode();
            }
            return hashCode + i;
        }
    }

    public final void a(a<T> aVar) {
        for (T t : this.a) {
            if (this.b) {
                return;
            }
            if (t.a.get() == null) {
                this.a.remove(t);
            } else if (!t.c) {
                aVar.a(t);
            }
        }
    }

    public final boolean a() {
        return this.a.isEmpty();
    }

    public final void a(T t) {
        if (!this.a.contains(t)) {
            this.a.add(t);
            t.c = false;
        }
        if (this.b) {
            this.b = false;
        }
    }

    public final <S, U> void a(S s, U u) {
        for (T t : this.a) {
            if (s == t.a.get() && u.equals(t.b)) {
                t.c = true;
                this.a.remove(t);
                return;
            }
        }
    }

    public final void a(Object obj) {
        for (T t : this.a) {
            Object obj2 = t.a.get();
            if (obj2 == null || obj2 == obj) {
                t.c = true;
                this.a.remove(t);
            }
        }
    }
}
