package androidx.room;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.dmb;
import defpackage.dnw;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001a9\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b*\u00020\b2\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"acquireTransactionThread", "Lkotlin/coroutines/ContinuationInterceptor;", "Ljava/util/concurrent/Executor;", "controlJob", "Lkotlinx/coroutines/Job;", "(Ljava/util/concurrent/Executor;Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createTransactionContext", "Lkotlin/coroutines/CoroutineContext;", "Landroidx/room/RoomDatabase;", "(Landroidx/room/RoomDatabase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTransaction", "R", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "room-ktx_release"}, k = 2, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class RoomDatabaseKt {
    static final /* synthetic */ Object acquireTransactionThread(final Executor executor, final dvi dviVar, dnu<? super dnv> dnuVar) {
        dtg dtgVar = new dtg(dnz.a(dnuVar), 1);
        final dtg dtgVar2 = dtgVar;
        dtgVar2.a((dow<? super Throwable, dmg>) new RoomDatabaseKt$acquireTransactionThread$$inlined$suspendCancellableCoroutine$lambda$1(executor, dviVar));
        try {
            executor.execute(new Runnable() { // from class: androidx.room.RoomDatabaseKt$acquireTransactionThread$$inlined$suspendCancellableCoroutine$lambda$2
                @Override // java.lang.Runnable
                public final void run() {
                    dut dutVar;
                    dnw dnwVar;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                    dnx dnxVar = dnx.a;
                    Thread currentThread = Thread.currentThread();
                    if (((dnv) dnxVar.get(dnv.a)) == null) {
                        dwc dwcVar = dwc.a;
                        dutVar = dwc.a();
                        dnwVar = dtw.a(dvb.a, dnxVar.plus(dutVar));
                    } else {
                        dwc dwcVar2 = dwc.a;
                        dutVar = dwc.b();
                        dnwVar = dtw.a(dvb.a, dnxVar);
                    }
                    dsy dsyVar = new dsy(dnwVar, currentThread, dutVar);
                    dsyVar.a(due.DEFAULT, (due) dsyVar, (dph<? super due, ? super dnu<? super T>, ? extends Object>) anonymousClass1);
                    dsyVar.u_();
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "androidx/room/RoomDatabaseKt$acquireTransactionThread$2$2$1"}, k = 3, mv = {1, 1, 15})
                /* renamed from: androidx.room.RoomDatabaseKt$acquireTransactionThread$$inlined$suspendCancellableCoroutine$lambda$2$1  reason: invalid class name */
                /* loaded from: classes.dex */
                static final class AnonymousClass1 extends dol implements dph<duc, dnu<? super dmg>, Object> {
                    Object L$0;
                    int label;
                    private duc p$;

                    AnonymousClass1(dnu dnuVar) {
                        super(2, dnuVar);
                    }

                    @Override // defpackage.doc
                    public final dnu<dmg> create(Object obj, dnu<?> dnuVar) {
                        dqc.c(dnuVar, "completion");
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(dnuVar);
                        anonymousClass1.p$ = (duc) obj;
                        return anonymousClass1;
                    }

                    @Override // defpackage.dph
                    public final Object invoke(duc ducVar, dnu<? super dmg> dnuVar) {
                        return ((AnonymousClass1) create(ducVar, dnuVar)).invokeSuspend(dmg.a);
                    }

                    @Override // defpackage.doc
                    public final Object invokeSuspend(Object obj) {
                        dny dnyVar = dny.COROUTINE_SUSPENDED;
                        int i = this.label;
                        if (i == 0) {
                            duc ducVar = this.p$;
                            dtf dtfVar = dtf.this;
                            dnw.b bVar = ducVar.getCoroutineContext().get(dnv.a);
                            if (bVar == null) {
                                dqc.a();
                            }
                            dmb.a aVar = dmb.a;
                            dtfVar.resumeWith(dmb.d(bVar));
                            dvi dviVar = dviVar;
                            this.L$0 = ducVar;
                            this.label = 1;
                            if (dviVar.a(this) == dnyVar) {
                                return dnyVar;
                            }
                        } else if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        return dmg.a;
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            dtgVar2.b((Throwable) new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        Object e2 = dtgVar.e();
        if (e2 == dny.COROUTINE_SUSPENDED) {
            dqc.d(dnuVar, TypedValues.Attributes.S_FRAME);
        }
        return e2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076 A[PHI: r7 
      PHI: (r7v2 java.lang.Object) = (r7v5 java.lang.Object), (r7v1 java.lang.Object) binds: [B:23:0x0073, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <R> java.lang.Object withTransaction(androidx.room.RoomDatabase r5, defpackage.dow<? super defpackage.dnu<? super R>, ? extends java.lang.Object> r6, defpackage.dnu<? super R> r7) {
        /*
            boolean r0 = r7 instanceof androidx.room.RoomDatabaseKt$withTransaction$1
            if (r0 == 0) goto L14
            r0 = r7
            androidx.room.RoomDatabaseKt$withTransaction$1 r0 = (androidx.room.RoomDatabaseKt$withTransaction$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            androidx.room.RoomDatabaseKt$withTransaction$1 r0 = new androidx.room.RoomDatabaseKt$withTransaction$1
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.result
            dny r1 = defpackage.dny.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L30
            if (r2 != r3) goto L28
            goto L76
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            java.lang.Object r5 = r0.L$1
            r6 = r5
            dow r6 = (defpackage.dow) r6
            java.lang.Object r5 = r0.L$0
            androidx.room.RoomDatabase r5 = (androidx.room.RoomDatabase) r5
            goto L5d
        L3a:
            dnw r7 = r0.getContext()
            androidx.room.TransactionElement$Key r2 = androidx.room.TransactionElement.Key
            dnw$c r2 = (defpackage.dnw.c) r2
            dnw$b r7 = r7.get(r2)
            androidx.room.TransactionElement r7 = (androidx.room.TransactionElement) r7
            if (r7 == 0) goto L50
            dnv r7 = r7.getTransactionDispatcher$room_ktx_release()
            if (r7 != 0) goto L5d
        L50:
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = createTransactionContext(r5, r0)
            if (r7 != r1) goto L5d
            return r1
        L5d:
            dnw r7 = (defpackage.dnw) r7
            androidx.room.RoomDatabaseKt$withTransaction$2 r2 = new androidx.room.RoomDatabaseKt$withTransaction$2
            r4 = 0
            r2.<init>(r5, r6, r4)
            dph r2 = (defpackage.dph) r2
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r7 = defpackage.dtb.a(r7, r2, r0)
            if (r7 != r1) goto L76
            return r1
        L76:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabaseKt.withTransaction(androidx.room.RoomDatabase, dow, dnu):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ java.lang.Object createTransactionContext(androidx.room.RoomDatabase r6, defpackage.dnu<? super defpackage.dnw> r7) {
        /*
            boolean r0 = r7 instanceof androidx.room.RoomDatabaseKt$createTransactionContext$1
            if (r0 == 0) goto L14
            r0 = r7
            androidx.room.RoomDatabaseKt$createTransactionContext$1 r0 = (androidx.room.RoomDatabaseKt$createTransactionContext$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            androidx.room.RoomDatabaseKt$createTransactionContext$1 r0 = new androidx.room.RoomDatabaseKt$createTransactionContext$1
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.result
            dny r1 = defpackage.dny.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.L$1
            dtp r6 = (defpackage.dtp) r6
            java.lang.Object r0 = r0.L$0
            androidx.room.RoomDatabase r0 = (androidx.room.RoomDatabase) r0
            goto L70
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            dtp r7 = defpackage.dvl.a()
            dnw r2 = r0.getContext()
            dvi$b r4 = defpackage.dvi.b
            dnw$c r4 = (defpackage.dnw.c) r4
            dnw$b r2 = r2.get(r4)
            dvi r2 = (defpackage.dvi) r2
            if (r2 == 0) goto L53
            androidx.room.RoomDatabaseKt$createTransactionContext$2 r4 = new androidx.room.RoomDatabaseKt$createTransactionContext$2
            r4.<init>(r7)
            dow r4 = (defpackage.dow) r4
            r2.a_(r4)
        L53:
            java.util.concurrent.Executor r2 = r6.getTransactionExecutor()
            java.lang.String r4 = "transactionExecutor"
            defpackage.dqc.a(r2, r4)
            r4 = r7
            dvi r4 = (defpackage.dvi) r4
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r0 = acquireTransactionThread(r2, r4, r0)
            if (r0 != r1) goto L6c
            return r1
        L6c:
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L70:
            dnv r7 = (defpackage.dnv) r7
            androidx.room.TransactionElement r1 = new androidx.room.TransactionElement
            r2 = r6
            dvi r2 = (defpackage.dvi) r2
            r1.<init>(r2, r7)
            java.lang.ThreadLocal r0 = r0.getSuspendingTransactionId()
            java.lang.String r2 = "suspendingTransactionId"
            defpackage.dqc.a(r0, r2)
            int r6 = java.lang.System.identityHashCode(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            dzd r2 = new dzd
            r2.<init>(r6, r0)
            dwb r2 = (defpackage.dwb) r2
            dnw r1 = (defpackage.dnw) r1
            dnw r6 = r7.plus(r1)
            dnw r2 = (defpackage.dnw) r2
            dnw r6 = r6.plus(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabaseKt.createTransactionContext(androidx.room.RoomDatabase, dnu):java.lang.Object");
    }
}
