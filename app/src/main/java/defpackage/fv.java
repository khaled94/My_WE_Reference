package defpackage;

import java.util.Queue;

/* renamed from: fv  reason: default package */
/* loaded from: classes2.dex */
public final class fv<A, B> {
    public final lc<a<A>, B> a;

    public fv() {
        this(250L);
    }

    public fv(long j) {
        this.a = new lc<a<A>, B>(j) { // from class: fv.1
            @Override // defpackage.lc
            public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
                ((a) obj).a();
            }
        };
    }

    public final B a(A a2) {
        a<A> a3 = a.a(a2);
        B b = this.a.b(a3);
        a3.a();
        return b;
    }

    /* renamed from: fv$a */
    /* loaded from: classes2.dex */
    public static final class a<A> {
        private static final Queue<a<?>> a = lg.a(0);
        private int b;
        private int c;
        private A d;

        public static <A> a<A> a(A a2) {
            a<A> aVar;
            synchronized (a) {
                aVar = (a<A>) a.poll();
            }
            if (aVar == null) {
                aVar = new a<>();
            }
            ((a) aVar).d = a2;
            ((a) aVar).c = 0;
            ((a) aVar).b = 0;
            return aVar;
        }

        private a() {
        }

        public final void a() {
            synchronized (a) {
                a.offer(this);
            }
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.c == aVar.c && this.b == aVar.b && this.d.equals(aVar.d)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (((this.b * 31) + this.c) * 31) + this.d.hashCode();
        }
    }
}
