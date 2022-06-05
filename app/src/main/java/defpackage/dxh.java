package defpackage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/flow/AbstractFlow;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "()V", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectSafely", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dxh  reason: default package */
/* loaded from: classes2.dex */
public abstract class dxh<T> implements dxj<T>, dxl<T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    @dog(b = "Flow.kt", c = {212}, d = "collect", e = "kotlinx.coroutines.flow.AbstractFlow")
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dxh$a */
    /* loaded from: classes2.dex */
    public static final class a extends doe {
        Object a;
        /* synthetic */ Object b;
        final /* synthetic */ dxh<T> c;
        int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(dxh<T> dxhVar, dnu<? super a> dnuVar) {
            super(dnuVar);
            this.c = dxhVar;
        }

        @Override // defpackage.doc
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return this.c.a(null, this);
        }
    }

    public abstract Object b(dxm<? super T> dxmVar, dnu<? super dmg> dnuVar);

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // defpackage.dxl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.dxm<? super T> r5, defpackage.dnu<? super defpackage.dmg> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dxh.a
            if (r0 == 0) goto L14
            r0 = r6
            dxh$a r0 = (defpackage.dxh.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.d
            int r6 = r6 - r2
            r0.d = r6
            goto L19
        L14:
            dxh$a r0 = new dxh$a
            r0.<init>(r4, r6)
        L19:
            dny r6 = defpackage.dny.COROUTINE_SUSPENDED
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            java.lang.Object r5 = r0.a
            dxx r5 = (defpackage.dxx) r5
            goto L47
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            dxx r1 = new dxx
            dnw r3 = r0.getContext()
            r1.<init>(r5, r3)
            r5 = r1
            dxm r5 = (defpackage.dxm) r5     // Catch: java.lang.Throwable -> L4d
            r0.a = r1     // Catch: java.lang.Throwable -> L4d
            r0.d = r2     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r5 = r4.b(r5, r0)     // Catch: java.lang.Throwable -> L4d
            if (r5 != r6) goto L46
            return r6
        L46:
            r5 = r1
        L47:
            r5.releaseIntercepted()
            dmg r5 = defpackage.dmg.a
            return r5
        L4d:
            r5 = move-exception
            r1.releaseIntercepted()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxh.a(dxm, dnu):java.lang.Object");
    }
}
