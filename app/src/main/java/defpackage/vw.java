package defpackage;

import java.util.concurrent.Executor;

/* renamed from: vw  reason: default package */
/* loaded from: classes2.dex */
public final class vw<L> {
    private final Executor a;
    private volatile L b;
    private volatile a<L> c;

    /* renamed from: vw$a */
    /* loaded from: classes2.dex */
    public static final class a<L> {
        private final L a;
        private final String b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
        }
    }

    /* renamed from: vw$b */
    /* loaded from: classes2.dex */
    public interface b<L> {
    }

    public final void a() {
        this.b = null;
        this.c = null;
    }

    public final void a(final b<? super L> bVar) {
        aat.a(bVar, "Notifier must not be null");
        this.a.execute(new Runnable() { // from class: yb
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }
}
