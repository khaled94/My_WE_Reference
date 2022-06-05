package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u001f\u0010\u0017\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\fH¤@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ&\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH$J\u0010\u0010\u001f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010 H\u0016J&\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010\u001c\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0016H\u0016R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R9\u0010\n\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlow;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "collectToFun", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/coroutines/Continuation;", "", "", "getCollectToFun$kotlinx_coroutines_core", "()Lkotlin/jvm/functions/Function2;", "produceCapacity", "getProduceCapacity$kotlinx_coroutines_core", "()I", "additionalToStringProps", "", "collect", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectTo", "scope", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "create", "dropChannelOperators", "Lkotlinx/coroutines/flow/Flow;", "fuse", "produceImpl", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlinx/coroutines/CoroutineScope;", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dxs  reason: default package */
/* loaded from: classes2.dex */
public abstract class dxs<T> implements dxu<T> {
    public final dnw a;
    public final int b = -2;
    public final dwo c;

    protected abstract Object a(dxa<? super T> dxaVar, dnu<? super dmg> dnuVar);

    public dxs(dnw dnwVar, dwo dwoVar) {
        this.a = dnwVar;
        this.c = dwoVar;
        if (dug.a()) {
            if (!(this.b != -1)) {
                throw new AssertionError();
            }
        }
    }

    public String toString() {
        String a2;
        ArrayList arrayList = new ArrayList(4);
        if (this.a != dnx.a) {
            arrayList.add(dqc.a("context=", (Object) this.a));
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add(dqc.a("capacity=", (Object) Integer.valueOf(i)));
        }
        if (this.c != dwo.SUSPEND) {
            arrayList.add(dqc.a("onBufferOverflow=", (Object) this.c));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        a2 = dmq.a(arrayList, ", ", "", "", "...");
        sb.append(a2);
        sb.append(']');
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    @dog(b = "ChannelFlow.kt", c = {123}, d = "invokeSuspend", e = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2")
    /* renamed from: dxs$a */
    /* loaded from: classes2.dex */
    static final class a extends dol implements dph<duc, dnu<? super dmg>, Object> {
        int a;
        final /* synthetic */ dxm<T> b;
        final /* synthetic */ dxs<T> c;
        private /* synthetic */ Object d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(dxm<? super T> dxmVar, dxs<T> dxsVar, dnu<? super a> dnuVar) {
            super(2, dnuVar);
            this.b = dxmVar;
            this.c = dxsVar;
        }

        @Override // defpackage.doc
        public final dnu<dmg> create(Object obj, dnu<?> dnuVar) {
            a aVar = new a(this.b, this.c, dnuVar);
            aVar.d = obj;
            return aVar;
        }

        @Override // defpackage.doc
        public final Object invokeSuspend(Object obj) {
            Object obj2 = dny.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                duc ducVar = (duc) this.d;
                dxm<T> dxmVar = this.b;
                dxs<T> dxsVar = this.c;
                dwz dwzVar = new dwz(dtw.a(ducVar, dxsVar.a), dws.a(dxsVar.b == -3 ? -2 : dxsVar.b, dxsVar.c, 4));
                dwzVar.a(due.ATOMIC, (due) dwzVar, (dph<? super due, ? super dnu<? super T>, ? extends Object>) new b(dxsVar, null));
                this.a = 1;
                Object a = dxo.a(dxmVar, dwzVar, true, this);
                if (a != dny.COROUTINE_SUSPENDED) {
                    a = dmg.a;
                }
                if (a == obj2) {
                    return obj2;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return dmg.a;
        }

        @Override // defpackage.dph
        public final /* synthetic */ Object invoke(duc ducVar, dnu<? super dmg> dnuVar) {
            return ((a) create(ducVar, dnuVar)).invokeSuspend(dmg.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    @dog(b = "ChannelFlow.kt", c = {60}, d = "invokeSuspend", e = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1")
    /* renamed from: dxs$b */
    /* loaded from: classes2.dex */
    public static final class b extends dol implements dph<dxa<? super T>, dnu<? super dmg>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ dxs<T> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(dxs<T> dxsVar, dnu<? super b> dnuVar) {
            super(2, dnuVar);
            this.c = dxsVar;
        }

        @Override // defpackage.doc
        public final dnu<dmg> create(Object obj, dnu<?> dnuVar) {
            b bVar = new b(this.c, dnuVar);
            bVar.b = obj;
            return bVar;
        }

        @Override // defpackage.doc
        public final Object invokeSuspend(Object obj) {
            dny dnyVar = dny.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                dxs<T> dxsVar = this.c;
                this.a = 1;
                if (dxsVar.a((dxa) this.b, this) == dnyVar) {
                    return dnyVar;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return dmg.a;
        }

        @Override // defpackage.dph
        public final /* synthetic */ Object invoke(Object obj, dnu<? super dmg> dnuVar) {
            return ((b) create((dxa) obj, dnuVar)).invokeSuspend(dmg.a);
        }
    }

    @Override // defpackage.dxl
    public final Object a(dxm<? super T> dxmVar, dnu<? super dmg> dnuVar) {
        dyw dywVar = new dyw(dnuVar.getContext(), dnuVar);
        Object a2 = dzj.a(dywVar, dywVar, new a(dxmVar, this, null));
        if (a2 == dny.COROUTINE_SUSPENDED) {
            dqc.d(dnuVar, TypedValues.Attributes.S_FRAME);
        }
        return a2 != dny.COROUTINE_SUSPENDED ? dmg.a : a2;
    }
}
