package androidx.lifecycle;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 0})
@dog(b = "FlowLiveData.kt", c = {96, 100, 101}, d = "invokeSuspend", e = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1")
/* loaded from: classes.dex */
public final class FlowLiveDataConversions$asFlow$1 extends dol implements dph<dxm<? super T>, dnu<? super dmg>, Object> {
    final /* synthetic */ LiveData $this_asFlow;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    private dxm p$;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLiveDataConversions$asFlow$1(LiveData liveData, dnu dnuVar) {
        super(2, dnuVar);
        this.$this_asFlow = liveData;
    }

    @Override // defpackage.doc
    public final dnu<dmg> create(Object obj, dnu<?> dnuVar) {
        dqc.d(dnuVar, "completion");
        FlowLiveDataConversions$asFlow$1 flowLiveDataConversions$asFlow$1 = new FlowLiveDataConversions$asFlow$1(this.$this_asFlow, dnuVar);
        flowLiveDataConversions$asFlow$1.p$ = (dxm) obj;
        return flowLiveDataConversions$asFlow$1;
    }

    @Override // defpackage.dph
    public final Object invoke(Object obj, dnu<? super dmg> dnuVar) {
        return ((FlowLiveDataConversions$asFlow$1) create(obj, dnuVar)).invokeSuspend(dmg.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 0})
    @dog(b = "FlowLiveData.kt", c = {}, d = "invokeSuspend", e = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1")
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends dol implements dph<duc, dnu<? super dmg>, Object> {
        final /* synthetic */ Observer $observer;
        int label;
        private duc p$;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Observer observer, dnu dnuVar) {
            super(2, dnuVar);
            this.$observer = observer;
        }

        @Override // defpackage.doc
        public final dnu<dmg> create(Object obj, dnu<?> dnuVar) {
            dqc.d(dnuVar, "completion");
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$observer, dnuVar);
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
            if (this.label == 0) {
                FlowLiveDataConversions$asFlow$1.this.$this_asFlow.observeForever(this.$observer);
                return dmg.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 0})
    @dog(b = "FlowLiveData.kt", c = {}, d = "invokeSuspend", e = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2")
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends dol implements dph<duc, dnu<? super dmg>, Object> {
        final /* synthetic */ Observer $observer;
        int label;
        private duc p$;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Observer observer, dnu dnuVar) {
            super(2, dnuVar);
            this.$observer = observer;
        }

        @Override // defpackage.doc
        public final dnu<dmg> create(Object obj, dnu<?> dnuVar) {
            dqc.d(dnuVar, "completion");
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$observer, dnuVar);
            anonymousClass2.p$ = (duc) obj;
            return anonymousClass2;
        }

        @Override // defpackage.dph
        public final Object invoke(duc ducVar, dnu<? super dmg> dnuVar) {
            return ((AnonymousClass2) create(ducVar, dnuVar)).invokeSuspend(dmg.a);
        }

        @Override // defpackage.doc
        public final Object invokeSuspend(Object obj) {
            dny dnyVar = dny.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                FlowLiveDataConversions$asFlow$1.this.$this_asFlow.removeObserver(this.$observer);
                return dmg.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a5 A[Catch: all -> 0x00de, TRY_LEAVE, TryCatch #2 {all -> 0x00de, blocks: (B:22:0x009d, B:24:0x00a5), top: B:42:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00bc -> B:38:0x0084). Please submit an issue!!! */
    @Override // defpackage.doc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FlowLiveDataConversions$asFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
