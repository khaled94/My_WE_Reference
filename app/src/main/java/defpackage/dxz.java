package defpackage;

import androidx.exifinterface.media.ExifInterface;
import defpackage.dnw;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aN\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022/\b\u0005\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH\u0081\bø\u0001\u0000¢\u0006\u0002\u0010\n\u001a\u0018\u0010\u000b\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001a\u00020\u000eH\u0001\u001a\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0080\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"unsafeFlow", "Lkotlinx/coroutines/flow/Flow;", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "checkContext", "Lkotlinx/coroutines/flow/internal/SafeCollector;", "currentContext", "Lkotlin/coroutines/CoroutineContext;", "transitiveCoroutineParent", "Lkotlinx/coroutines/Job;", "collectJob", "kotlinx-coroutines-core"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* renamed from: dxz  reason: default package */
/* loaded from: classes2.dex */
public final class dxz {

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "count", "element", "Lkotlin/coroutines/CoroutineContext$Element;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dxz$a */
    /* loaded from: classes2.dex */
    static final class a extends dqd implements dph<Integer, dnw.b, Integer> {
        final /* synthetic */ dxx<?> a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dxx<?> dxxVar) {
            super(2);
            this.a = dxxVar;
        }

        @Override // defpackage.dph
        public final /* synthetic */ Integer invoke(Integer num, dnw.b bVar) {
            int intValue = num.intValue();
            dnw.b bVar2 = bVar;
            dnw.c<?> key = bVar2.getKey();
            dnw.b bVar3 = this.a.b.get(key);
            if (key != dvi.b) {
                return Integer.valueOf(bVar2 != bVar3 ? Integer.MIN_VALUE : intValue + 1);
            }
            dvi dviVar = (dvi) bVar3;
            dvi dviVar2 = (dvi) bVar2;
            while (true) {
                if (dviVar2 != null) {
                    if (dviVar2 == dviVar || !(dviVar2 instanceof dyw)) {
                        break;
                    }
                    dtl dtlVar = (dtl) ((dyw) dviVar2)._parentHandle;
                    dviVar2 = dtlVar == null ? null : dtlVar.a();
                } else {
                    dviVar2 = null;
                    break;
                }
            }
            if (dviVar2 != dviVar) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + dviVar2 + ", expected child of " + dviVar + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
            }
            if (dviVar != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
    }
}
