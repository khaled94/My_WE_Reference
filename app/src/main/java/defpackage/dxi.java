package defpackage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002BU\u0012-\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0094@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014R:\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tX\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/flow/CallbackFlowBuilder;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/ChannelFlowBuilder;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "Lkotlin/jvm/functions/Function2;", "collectTo", "scope", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "create", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dxi  reason: default package */
/* loaded from: classes2.dex */
public final class dxi<T> extends dxk<T> {
    private final dph<dxa<? super T>, dnu<? super dmg>, Object> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @dog(b = "Builders.kt", c = {355}, d = "collectTo", e = "kotlinx.coroutines.flow.CallbackFlowBuilder")
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dxi$a */
    /* loaded from: classes2.dex */
    public static final class a extends doe {
        Object a;
        /* synthetic */ Object b;
        final /* synthetic */ dxi<T> c;
        int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(dxi<T> dxiVar, dnu<? super a> dnuVar) {
            super(dnuVar);
            this.c = dxiVar;
        }

        @Override // defpackage.doc
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return this.c.a((dxa) null, this);
        }
    }

    public /* synthetic */ dxi(dph dphVar) {
        this(dphVar, dnx.a, dwo.SUSPEND);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private dxi(dph<? super dxa<? super T>, ? super dnu<? super dmg>, ? extends Object> dphVar, dnw dnwVar, dwo dwoVar) {
        super(dphVar, dnwVar, dwoVar);
        this.d = dphVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    @Override // defpackage.dxk, defpackage.dxs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.dxa<? super T> r4, defpackage.dnu<? super defpackage.dmg> r5) {
        /*
            r3 = this;
            boolean r0 = r5 instanceof defpackage.dxi.a
            if (r0 == 0) goto L14
            r0 = r5
            dxi$a r0 = (defpackage.dxi.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.d
            int r5 = r5 - r2
            r0.d = r5
            goto L19
        L14:
            dxi$a r0 = new dxi$a
            r0.<init>(r3, r5)
        L19:
            dny r5 = defpackage.dny.COROUTINE_SUSPENDED
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            java.lang.Object r4 = r0.a
            dxa r4 = (defpackage.dxa) r4
            goto L3a
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            r0.a = r4
            r0.d = r2
            java.lang.Object r0 = super.a(r4, r0)
            if (r0 != r5) goto L3a
            return r5
        L3a:
            boolean r4 = r4.x_()
            if (r4 == 0) goto L43
            dmg r4 = defpackage.dmg.a
            return r4
        L43:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxi.a(dxa, dnu):java.lang.Object");
    }
}
