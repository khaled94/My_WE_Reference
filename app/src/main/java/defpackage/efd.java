package defpackage;

import defpackage.eez;
import defpackage.efd;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: efd */
/* loaded from: classes2.dex */
public final class efd extends eez.a {
    private final Executor a;

    public efd(Executor executor) {
        this.a = executor;
    }

    /* renamed from: efd$a */
    /* loaded from: classes2.dex */
    public static final class a<T> implements eey<T> {
        final Executor a;
        final eey<T> b;

        a(Executor executor, eey<T> eeyVar) {
            this.a = executor;
            this.b = eeyVar;
        }

        @Override // defpackage.eey
        public final void a(efa<T> efaVar) {
            Objects.requireNonNull(efaVar, "callback == null");
            this.b.a(new AnonymousClass1(efaVar));
        }

        /* renamed from: efd$a$1 */
        /* loaded from: classes2.dex */
        public final class AnonymousClass1 implements efa<T> {
            final /* synthetic */ efa a;

            public static /* synthetic */ void lambda$0TZReAXZr7Ox6_uv80aBzp1BujQ(AnonymousClass1 anonymousClass1, efa efaVar, Throwable th) {
                anonymousClass1.a(efaVar, th);
            }

            public static /* synthetic */ void lambda$pT0r3KlAzceyFZcc_Rnav7nB4Ro(AnonymousClass1 anonymousClass1, efa efaVar, efn efnVar) {
                anonymousClass1.a(efaVar, efnVar);
            }

            AnonymousClass1(efa efaVar) {
                a.this = r1;
                this.a = efaVar;
            }

            @Override // defpackage.efa
            public final void a(eey<T> eeyVar, final efn<T> efnVar) {
                Executor executor = a.this.a;
                final efa efaVar = this.a;
                executor.execute(new Runnable() { // from class: -$$Lambda$efd$a$1$pT0r3KlAzceyFZcc_Rnav7nB4Ro
                    @Override // java.lang.Runnable
                    public final void run() {
                        efd.a.AnonymousClass1.lambda$pT0r3KlAzceyFZcc_Rnav7nB4Ro(efd.a.AnonymousClass1.this, efaVar, efnVar);
                    }
                });
            }

            public /* synthetic */ void a(efa efaVar, efn efnVar) {
                if (a.this.b.b()) {
                    efaVar.a(a.this, new IOException("Canceled"));
                } else {
                    efaVar.a(a.this, efnVar);
                }
            }

            public /* synthetic */ void a(efa efaVar, Throwable th) {
                efaVar.a(a.this, th);
            }

            @Override // defpackage.efa
            public final void a(eey<T> eeyVar, final Throwable th) {
                Executor executor = a.this.a;
                final efa efaVar = this.a;
                executor.execute(new Runnable() { // from class: -$$Lambda$efd$a$1$0TZReAXZr7Ox6_uv80aBzp1BujQ
                    @Override // java.lang.Runnable
                    public final void run() {
                        efd.a.AnonymousClass1.lambda$0TZReAXZr7Ox6_uv80aBzp1BujQ(efd.a.AnonymousClass1.this, efaVar, th);
                    }
                });
            }
        }

        @Override // defpackage.eey
        public final void a() {
            this.b.a();
        }

        @Override // defpackage.eey
        public final boolean b() {
            return this.b.b();
        }

        @Override // defpackage.eey
        /* renamed from: c */
        public final eey<T> clone() {
            return new a(this.a, this.b.c());
        }

        @Override // defpackage.eey
        public final eba d() {
            return this.b.d();
        }
    }

    @Override // defpackage.eez.a
    public final eez<?, ?> a(Type type, Annotation[] annotationArr) {
        final Executor executor = null;
        if (efs.a(type) != eey.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        }
        final Type a2 = efs.a(0, (ParameterizedType) type);
        if (!efs.a(annotationArr, efq.class)) {
            executor = this.a;
        }
        return new eez<Object, eey<?>>() { // from class: efd.1
            {
                efd.this = this;
            }

            @Override // defpackage.eez
            public final Type a() {
                return a2;
            }

            @Override // defpackage.eez
            public final /* synthetic */ eey<?> a(eey<Object> eeyVar) {
                Executor executor2 = executor;
                return executor2 == null ? eeyVar : new a(executor2, eeyVar);
            }
        };
    }
}
