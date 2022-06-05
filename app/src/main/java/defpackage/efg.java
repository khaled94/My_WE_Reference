package defpackage;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import defpackage.dmb;
import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import kotlin.Metadata;
import retrofit2.HttpException;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001a+\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0003H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a'\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0007\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001a\u001a\u0010\b\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\tH\u0086\b¢\u0006\u0002\u0010\n\u001a\u0019\u0010\u000b\u001a\u00020\f*\u00060\rj\u0002`\u000eH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"await", ExifInterface.GPS_DIRECTION_TRUE, "", "Lretrofit2/Call;", "(Lretrofit2/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitNullable", "awaitResponse", "Lretrofit2/Response;", "create", "Lretrofit2/Retrofit;", "(Lretrofit2/Retrofit;)Ljava/lang/Object;", "suspendAndThrow", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrofit"}, k = 2, mv = {1, 1, 15})
/* renamed from: efg  reason: default package */
/* loaded from: classes2.dex */
public final class efg {

    /* JADX INFO: Access modifiers changed from: package-private */
    @dog(b = "KotlinExtensions.kt", c = {113}, d = "suspendAndThrow", e = "retrofit2.KotlinExtensions")
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00060\u0002j\u0002`\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080@"}, d2 = {"suspendAndThrow", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 1, 15})
    /* renamed from: efg$h */
    /* loaded from: classes2.dex */
    public static final class h extends doe {
        /* synthetic */ Object a;
        int b;
        Object c;

        h(dnu dnuVar) {
            super(dnuVar);
        }

        @Override // defpackage.doc
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return efg.a(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J$\u0010\b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¨\u0006\u000b"}, d2 = {"retrofit2/KotlinExtensions$await$2$2", "Lretrofit2/Callback;", "onFailure", "", NotificationCompat.CATEGORY_CALL, "Lretrofit2/Call;", "t", "", "onResponse", "response", "Lretrofit2/Response;", "retrofit"}, k = 1, mv = {1, 1, 15})
    /* renamed from: efg$c */
    /* loaded from: classes2.dex */
    public static final class c implements efa<T> {
        final /* synthetic */ dtf a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(dtf dtfVar) {
            this.a = dtfVar;
        }

        @Override // defpackage.efa
        public final void a(eey<T> eeyVar, Throwable th) {
            dqc.c(eeyVar, NotificationCompat.CATEGORY_CALL);
            dqc.c(th, "t");
            dmb.a aVar = dmb.a;
            this.a.resumeWith(dmb.d(dmc.a(th)));
        }

        @Override // defpackage.efa
        public final void a(eey<T> eeyVar, efn<T> efnVar) {
            dqc.c(eeyVar, NotificationCompat.CATEGORY_CALL);
            dqc.c(efnVar, "response");
            if (!efnVar.a.d()) {
                dmb.a aVar = dmb.a;
                this.a.resumeWith(dmb.d(dmc.a(new HttpException(efnVar))));
                return;
            }
            T t = efnVar.b;
            if (t != 0) {
                dmb.a aVar2 = dmb.a;
                this.a.resumeWith(dmb.d(t));
                return;
            }
            Object cast = eff.class.cast(eeyVar.d().e.get(eff.class));
            if (cast == null) {
                dqc.a();
            }
            dqc.a(cast, "call.request().tag(Invocation::class.java)!!");
            Method method = ((eff) cast).a;
            StringBuilder sb = new StringBuilder("Response from ");
            dqc.a((Object) method, "method");
            Class<?> declaringClass = method.getDeclaringClass();
            dqc.a((Object) declaringClass, "method.declaringClass");
            sb.append(declaringClass.getName());
            sb.append('.');
            sb.append(method.getName());
            sb.append(" was null but response body type was declared as non-null");
            KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb.toString());
            dmb.a aVar3 = dmb.a;
            this.a.resumeWith(dmb.d(dmc.a(kotlinNullPointerException)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J \u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J(\u0010\b\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00052\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\nH\u0016¨\u0006\u000b"}, d2 = {"retrofit2/KotlinExtensions$await$4$2", "Lretrofit2/Callback;", "onFailure", "", NotificationCompat.CATEGORY_CALL, "Lretrofit2/Call;", "t", "", "onResponse", "response", "Lretrofit2/Response;", "retrofit"}, k = 1, mv = {1, 1, 15})
    /* renamed from: efg$d */
    /* loaded from: classes2.dex */
    public static final class d implements efa<T> {
        final /* synthetic */ dtf a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(dtf dtfVar) {
            this.a = dtfVar;
        }

        @Override // defpackage.efa
        public final void a(eey<T> eeyVar, Throwable th) {
            dqc.c(eeyVar, NotificationCompat.CATEGORY_CALL);
            dqc.c(th, "t");
            dmb.a aVar = dmb.a;
            this.a.resumeWith(dmb.d(dmc.a(th)));
        }

        @Override // defpackage.efa
        public final void a(eey<T> eeyVar, efn<T> efnVar) {
            dqc.c(eeyVar, NotificationCompat.CATEGORY_CALL);
            dqc.c(efnVar, "response");
            if (!efnVar.a.d()) {
                dmb.a aVar = dmb.a;
                this.a.resumeWith(dmb.d(dmc.a(new HttpException(efnVar))));
                return;
            }
            T t = efnVar.b;
            dmb.a aVar2 = dmb.a;
            this.a.resumeWith(dmb.d(t));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J$\u0010\b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¨\u0006\u000b"}, d2 = {"retrofit2/KotlinExtensions$awaitResponse$2$2", "Lretrofit2/Callback;", "onFailure", "", NotificationCompat.CATEGORY_CALL, "Lretrofit2/Call;", "t", "", "onResponse", "response", "Lretrofit2/Response;", "retrofit"}, k = 1, mv = {1, 1, 15})
    /* renamed from: efg$f */
    /* loaded from: classes2.dex */
    public static final class f implements efa<T> {
        final /* synthetic */ dtf a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public f(dtf dtfVar) {
            this.a = dtfVar;
        }

        @Override // defpackage.efa
        public final void a(eey<T> eeyVar, efn<T> efnVar) {
            dqc.c(eeyVar, NotificationCompat.CATEGORY_CALL);
            dqc.c(efnVar, "response");
            dmb.a aVar = dmb.a;
            this.a.resumeWith(dmb.d(efnVar));
        }

        @Override // defpackage.efa
        public final void a(eey<T> eeyVar, Throwable th) {
            dqc.c(eeyVar, NotificationCompat.CATEGORY_CALL);
            dqc.c(th, "t");
            dmb.a aVar = dmb.a;
            this.a.resumeWith(dmb.d(dmc.a(th)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "retrofit2/KotlinExtensions$suspendAndThrow$2$1"}, k = 3, mv = {1, 1, 15})
    /* renamed from: efg$g */
    /* loaded from: classes2.dex */
    public static final class g implements Runnable {
        final /* synthetic */ dnu a;
        final /* synthetic */ Exception b;

        g(dnu dnuVar, Exception exc) {
            this.a = dnuVar;
            this.b = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            dnu a = dnz.a(this.a);
            dmb.a aVar = dmb.a;
            a.resumeWith(dmb.d(dmc.a(this.b)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "", "it", "", "invoke", "retrofit2/KotlinExtensions$await$2$1"}, k = 3, mv = {1, 1, 15})
    /* renamed from: efg$a */
    /* loaded from: classes2.dex */
    static final class a extends dqd implements dow<Throwable, dmg> {
        final /* synthetic */ eey a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(eey eeyVar) {
            super(1);
            this.a = eeyVar;
        }

        @Override // defpackage.dow
        public final /* synthetic */ dmg invoke(Throwable th) {
            this.a.a();
            return dmg.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(java.lang.Exception r4, defpackage.dnu<?> r5) {
        /*
            boolean r0 = r5 instanceof defpackage.efg.h
            if (r0 == 0) goto L14
            r0 = r5
            efg$h r0 = (defpackage.efg.h) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.b
            int r5 = r5 - r2
            r0.b = r5
            goto L19
        L14:
            efg$h r0 = new efg$h
            r0.<init>(r5)
        L19:
            dny r5 = defpackage.dny.COROUTINE_SUSPENDED
            int r1 = r0.b
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 != r2) goto L23
            goto L51
        L23:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            r0.c = r4
            r0.b = r2
            dnu r0 = (defpackage.dnu) r0
            dtx r1 = defpackage.dup.a()
            dnw r2 = r0.getContext()
            efg$g r3 = new efg$g
            r3.<init>(r0, r4)
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r1.dispatch(r2, r3)
            dny r4 = defpackage.dny.COROUTINE_SUSPENDED
            dny r1 = defpackage.dny.COROUTINE_SUSPENDED
            if (r4 != r1) goto L4e
            java.lang.String r1 = "frame"
            defpackage.dqc.d(r0, r1)
        L4e:
            if (r4 != r5) goto L51
            return r5
        L51:
            dmg r4 = defpackage.dmg.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efg.a(java.lang.Exception, dnu):java.lang.Object");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "", "it", "", "invoke", "retrofit2/KotlinExtensions$await$4$1"}, k = 3, mv = {1, 1, 15})
    /* renamed from: efg$b */
    /* loaded from: classes2.dex */
    static final class b extends dqd implements dow<Throwable, dmg> {
        final /* synthetic */ eey a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(eey eeyVar) {
            super(1);
            this.a = eeyVar;
        }

        @Override // defpackage.dow
        public final /* synthetic */ dmg invoke(Throwable th) {
            this.a.a();
            return dmg.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "", "invoke", "retrofit2/KotlinExtensions$awaitResponse$2$1"}, k = 3, mv = {1, 1, 15})
    /* renamed from: efg$e */
    /* loaded from: classes2.dex */
    static final class e extends dqd implements dow<Throwable, dmg> {
        final /* synthetic */ eey a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(eey eeyVar) {
            super(1);
            this.a = eeyVar;
        }

        @Override // defpackage.dow
        public final /* synthetic */ dmg invoke(Throwable th) {
            this.a.a();
            return dmg.a;
        }
    }
}
