package androidx.lifecycle;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
@dog(b = "CoroutineLiveData.kt", c = {227, 228}, d = "emitSource$lifecycle_livedata_ktx_release", e = "androidx.lifecycle.CoroutineLiveData")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0080@"}, d2 = {"emitSource", "", ExifInterface.GPS_DIRECTION_TRUE, "source", "Landroidx/lifecycle/LiveData;", "continuation", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/DisposableHandle;"}, k = 3, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class CoroutineLiveData$emitSource$1 extends doe {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CoroutineLiveData this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineLiveData$emitSource$1(CoroutineLiveData coroutineLiveData, dnu dnuVar) {
        super(dnuVar);
        this.this$0 = coroutineLiveData;
    }

    @Override // defpackage.doc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emitSource$lifecycle_livedata_ktx_release(null, this);
    }
}
