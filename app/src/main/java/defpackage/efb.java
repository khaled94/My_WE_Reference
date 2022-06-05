package defpackage;

import defpackage.eez;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import retrofit2.HttpException;

/* renamed from: efb  reason: default package */
/* loaded from: classes2.dex */
final class efb extends eez.a {
    static final eez.a a = new efb();

    efb() {
    }

    /* renamed from: efb$a */
    /* loaded from: classes2.dex */
    static final class a<R> implements eez<R, CompletableFuture<R>> {
        private final Type a;

        a(Type type) {
            this.a = type;
        }

        @Override // defpackage.eez
        public final Type a() {
            return this.a;
        }

        /* renamed from: efb$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class C0030a implements efa<R> {
            private final CompletableFuture<R> b;

            public C0030a(CompletableFuture<R> completableFuture) {
                this.b = completableFuture;
            }

            @Override // defpackage.efa
            public final void a(eey<R> eeyVar, Throwable th) {
                this.b.completeExceptionally(th);
            }

            @Override // defpackage.efa
            public final void a(eey<R> eeyVar, efn<R> efnVar) {
                if (efnVar.a.d()) {
                    this.b.complete(efnVar.b);
                } else {
                    this.b.completeExceptionally(new HttpException(efnVar));
                }
            }
        }

        @Override // defpackage.eez
        public final /* synthetic */ Object a(eey eeyVar) {
            b bVar = new b(eeyVar);
            eeyVar.a(new C0030a(bVar));
            return bVar;
        }
    }

    /* renamed from: efb$c */
    /* loaded from: classes2.dex */
    static final class c<R> implements eez<R, CompletableFuture<efn<R>>> {
        private final Type a;

        c(Type type) {
            this.a = type;
        }

        @Override // defpackage.eez
        public final Type a() {
            return this.a;
        }

        /* renamed from: efb$c$a */
        /* loaded from: classes2.dex */
        class a implements efa<R> {
            private final CompletableFuture<efn<R>> b;

            public a(CompletableFuture<efn<R>> completableFuture) {
                this.b = completableFuture;
            }

            @Override // defpackage.efa
            public final void a(eey<R> eeyVar, efn<R> efnVar) {
                this.b.complete(efnVar);
            }

            @Override // defpackage.efa
            public final void a(eey<R> eeyVar, Throwable th) {
                this.b.completeExceptionally(th);
            }
        }

        @Override // defpackage.eez
        public final /* synthetic */ Object a(eey eeyVar) {
            b bVar = new b(eeyVar);
            eeyVar.a(new a(bVar));
            return bVar;
        }
    }

    /* renamed from: efb$b */
    /* loaded from: classes2.dex */
    static final class b<T> extends CompletableFuture<T> {
        private final eey<?> a;

        b(eey<?> eeyVar) {
            this.a = eeyVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            if (z) {
                this.a.a();
            }
            return super.cancel(z);
        }
    }

    @Override // defpackage.eez.a
    public final eez<?, ?> a(Type type, Annotation[] annotationArr) {
        if (efs.a(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type a2 = efs.a(0, (ParameterizedType) type);
        if (efs.a(a2) != efn.class) {
            return new a(a2);
        }
        if (!(a2 instanceof ParameterizedType)) {
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        return new c(efs.a(0, (ParameterizedType) a2));
    }
}
