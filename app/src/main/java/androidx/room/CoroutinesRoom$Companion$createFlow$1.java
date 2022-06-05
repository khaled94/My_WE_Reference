package androidx.room;

import androidx.room.InvalidationTracker;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u0001H\u0002H\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 15})
@dog(b = "CoroutinesRoom.kt", c = {75}, d = "invokeSuspend", e = "androidx.room.CoroutinesRoom$Companion$createFlow$1")
/* loaded from: classes.dex */
public final class CoroutinesRoom$Companion$createFlow$1 extends dol implements dph<dxm<? super R>, dnu<? super dmg>, Object> {
    final /* synthetic */ Callable $callable;
    final /* synthetic */ RoomDatabase $db;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ String[] $tableNames;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    private dxm p$;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$createFlow$1(String[] strArr, boolean z, RoomDatabase roomDatabase, Callable callable, dnu dnuVar) {
        super(2, dnuVar);
        this.$tableNames = strArr;
        this.$inTransaction = z;
        this.$db = roomDatabase;
        this.$callable = callable;
    }

    @Override // defpackage.doc
    public final dnu<dmg> create(Object obj, dnu<?> dnuVar) {
        dqc.c(dnuVar, "completion");
        CoroutinesRoom$Companion$createFlow$1 coroutinesRoom$Companion$createFlow$1 = new CoroutinesRoom$Companion$createFlow$1(this.$tableNames, this.$inTransaction, this.$db, this.$callable, dnuVar);
        coroutinesRoom$Companion$createFlow$1.p$ = (dxm) obj;
        return coroutinesRoom$Companion$createFlow$1;
    }

    @Override // defpackage.dph
    public final Object invoke(Object obj, dnu<? super dmg> dnuVar) {
        return ((CoroutinesRoom$Companion$createFlow$1) create(obj, dnuVar)).invokeSuspend(dmg.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 15})
    @dog(b = "CoroutinesRoom.kt", c = {80, 82}, d = "invokeSuspend", e = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1")
    /* renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends dol implements dph<duc, dnu<? super dmg>, Object> {
        final /* synthetic */ dnw $flowContext;
        final /* synthetic */ CoroutinesRoom$Companion$createFlow$1$observer$1 $observer;
        final /* synthetic */ dwp $observerChannel;
        final /* synthetic */ dxm $this_flow;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        private duc p$;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(dxm dxmVar, CoroutinesRoom$Companion$createFlow$1$observer$1 coroutinesRoom$Companion$createFlow$1$observer$1, dwp dwpVar, dnw dnwVar, dnu dnuVar) {
            super(2, dnuVar);
            this.$this_flow = dxmVar;
            this.$observer = coroutinesRoom$Companion$createFlow$1$observer$1;
            this.$observerChannel = dwpVar;
            this.$flowContext = dnwVar;
        }

        @Override // defpackage.doc
        public final dnu<dmg> create(Object obj, dnu<?> dnuVar) {
            dqc.c(dnuVar, "completion");
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_flow, this.$observer, this.$observerChannel, this.$flowContext, dnuVar);
            anonymousClass1.p$ = (duc) obj;
            return anonymousClass1;
        }

        @Override // defpackage.dph
        public final Object invoke(duc ducVar, dnu<? super dmg> dnuVar) {
            return ((AnonymousClass1) create(ducVar, dnuVar)).invokeSuspend(dmg.a);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 15})
        @dog(b = "CoroutinesRoom.kt", c = {82}, d = "invokeSuspend", e = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1")
        /* renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00111 extends dol implements dph<duc, dnu<? super dmg>, Object> {
            final /* synthetic */ Object $result;
            Object L$0;
            int label;
            private duc p$;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00111(Object obj, dnu dnuVar) {
                super(2, dnuVar);
                this.$result = obj;
            }

            @Override // defpackage.doc
            public final dnu<dmg> create(Object obj, dnu<?> dnuVar) {
                dqc.c(dnuVar, "completion");
                C00111 c00111 = new C00111(this.$result, dnuVar);
                c00111.p$ = (duc) obj;
                return c00111;
            }

            @Override // defpackage.dph
            public final Object invoke(duc ducVar, dnu<? super dmg> dnuVar) {
                return ((C00111) create(ducVar, dnuVar)).invokeSuspend(dmg.a);
            }

            @Override // defpackage.doc
            public final Object invokeSuspend(Object obj) {
                dny dnyVar = dny.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    duc ducVar = this.p$;
                    dxm dxmVar = AnonymousClass1.this.$this_flow;
                    Object obj2 = this.$result;
                    this.L$0 = ducVar;
                    this.label = 1;
                    if (dxmVar.emit(obj2, this) == dnyVar) {
                        return dnyVar;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return dmg.a;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x009a, TRY_LEAVE, TryCatch #0 {all -> 0x009a, blocks: (B:17:0x0054, B:19:0x005c), top: B:32:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0085 -> B:34:0x0043). Please submit an issue!!! */
        @Override // defpackage.doc
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                dny r0 = defpackage.dny.COROUTINE_SUSPENDED
                int r1 = r11.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r12 = r11.L$2
                dwr r12 = (defpackage.dwr) r12
                java.lang.Object r1 = r11.L$0
                duc r1 = (defpackage.duc) r1
                r4 = r11
                r10 = r1
                r1 = r12
                r12 = r10
                goto L43
            L19:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L21:
                java.lang.Object r1 = r11.L$1
                dwr r1 = (defpackage.dwr) r1
                java.lang.Object r4 = r11.L$0
                duc r4 = (defpackage.duc) r4
                r5 = r11
                goto L54
            L2b:
                duc r12 = r11.p$
                androidx.room.CoroutinesRoom$Companion$createFlow$1 r1 = androidx.room.CoroutinesRoom$Companion$createFlow$1.this
                androidx.room.RoomDatabase r1 = r1.$db
                androidx.room.InvalidationTracker r1 = r1.getInvalidationTracker()
                androidx.room.CoroutinesRoom$Companion$createFlow$1$observer$1 r4 = r11.$observer
                androidx.room.InvalidationTracker$Observer r4 = (androidx.room.InvalidationTracker.Observer) r4
                r1.addObserver(r4)
                dwp r1 = r11.$observerChannel     // Catch: java.lang.Throwable -> L9f
                dwr r1 = r1.y_()     // Catch: java.lang.Throwable -> L9f
                r4 = r11
            L43:
                r4.L$0 = r12     // Catch: java.lang.Throwable -> L9d
                r4.L$1 = r1     // Catch: java.lang.Throwable -> L9d
                r4.label = r3     // Catch: java.lang.Throwable -> L9d
                java.lang.Object r5 = r1.a(r4)     // Catch: java.lang.Throwable -> L9d
                if (r5 != r0) goto L50
                return r0
            L50:
                r10 = r4
                r4 = r12
                r12 = r5
                r5 = r10
            L54:
                java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L9a
                boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L9a
                if (r12 == 0) goto L88
                java.lang.Object r12 = r1.a()     // Catch: java.lang.Throwable -> L9a
                dmg r12 = (defpackage.dmg) r12     // Catch: java.lang.Throwable -> L9a
                androidx.room.CoroutinesRoom$Companion$createFlow$1 r6 = androidx.room.CoroutinesRoom$Companion$createFlow$1.this     // Catch: java.lang.Throwable -> L9a
                java.util.concurrent.Callable r6 = r6.$callable     // Catch: java.lang.Throwable -> L9a
                java.lang.Object r6 = r6.call()     // Catch: java.lang.Throwable -> L9a
                dnw r7 = r5.$flowContext     // Catch: java.lang.Throwable -> L9a
                androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1 r8 = new androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1     // Catch: java.lang.Throwable -> L9a
                r9 = 0
                r8.<init>(r6, r9)     // Catch: java.lang.Throwable -> L9a
                dph r8 = (defpackage.dph) r8     // Catch: java.lang.Throwable -> L9a
                r5.L$0 = r4     // Catch: java.lang.Throwable -> L9a
                r5.L$1 = r12     // Catch: java.lang.Throwable -> L9a
                r5.L$2 = r1     // Catch: java.lang.Throwable -> L9a
                r5.L$3 = r6     // Catch: java.lang.Throwable -> L9a
                r5.label = r2     // Catch: java.lang.Throwable -> L9a
                java.lang.Object r12 = defpackage.dtb.a(r7, r8, r5)     // Catch: java.lang.Throwable -> L9a
                if (r12 != r0) goto L85
                return r0
            L85:
                r12 = r4
                r4 = r5
                goto L43
            L88:
                androidx.room.CoroutinesRoom$Companion$createFlow$1 r12 = androidx.room.CoroutinesRoom$Companion$createFlow$1.this
                androidx.room.RoomDatabase r12 = r12.$db
                androidx.room.InvalidationTracker r12 = r12.getInvalidationTracker()
                androidx.room.CoroutinesRoom$Companion$createFlow$1$observer$1 r0 = r5.$observer
                androidx.room.InvalidationTracker$Observer r0 = (androidx.room.InvalidationTracker.Observer) r0
                r12.removeObserver(r0)
                dmg r12 = defpackage.dmg.a
                return r12
            L9a:
                r12 = move-exception
                r4 = r5
                goto La1
            L9d:
                r12 = move-exception
                goto La1
            L9f:
                r12 = move-exception
                r4 = r11
            La1:
                androidx.room.CoroutinesRoom$Companion$createFlow$1 r0 = androidx.room.CoroutinesRoom$Companion$createFlow$1.this
                androidx.room.RoomDatabase r0 = r0.$db
                androidx.room.InvalidationTracker r0 = r0.getInvalidationTracker()
                androidx.room.CoroutinesRoom$Companion$createFlow$1$observer$1 r1 = r4.$observer
                androidx.room.InvalidationTracker$Observer r1 = (androidx.room.InvalidationTracker.Observer) r1
                r0.removeObserver(r1)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.CoroutinesRoom$Companion$createFlow$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, androidx.room.CoroutinesRoom$Companion$createFlow$1$observer$1] */
    @Override // defpackage.doc
    public final Object invokeSuspend(Object obj) {
        dny dnyVar = dny.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            dxm dxmVar = this.p$;
            final dwp a = dws.a(-1, null, 6);
            ?? r12 = new InvalidationTracker.Observer(this.$tableNames) { // from class: androidx.room.CoroutinesRoom$Companion$createFlow$1$observer$1
                @Override // androidx.room.InvalidationTracker.Observer
                public final void onInvalidated(Set<String> set) {
                    dqc.c(set, "tables");
                    a.a_((dwp) dmg.a);
                }
            };
            a.a_((dwp) dmg.a);
            dnw context = getContext();
            dtx transactionDispatcher = this.$inTransaction ? CoroutinesRoomKt.getTransactionDispatcher(this.$db) : CoroutinesRoomKt.getQueryDispatcher(this.$db);
            this.L$0 = dxmVar;
            this.L$1 = a;
            this.L$2 = r12;
            this.L$3 = context;
            this.L$4 = transactionDispatcher;
            this.label = 1;
            if (dtb.a(transactionDispatcher, new AnonymousClass1(dxmVar, r12, a, context, null), this) == dnyVar) {
                return dnyVar;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return dmg.a;
    }
}
