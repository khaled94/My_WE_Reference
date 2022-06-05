package androidx.lifecycle;

import androidx.exifinterface.media.ExifInterface;
import java.time.Duration;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a0\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a2\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"asFlow", "Lkotlinx/coroutines/flow/Flow;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/LiveData;", "asLiveData", "context", "Lkotlin/coroutines/CoroutineContext;", "timeout", "Ljava/time/Duration;", "timeoutInMs", "", "lifecycle-livedata-ktx_release"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class FlowLiveDataConversions {
    public static final <T> LiveData<T> asLiveData(dxl<? extends T> dxlVar) {
        return asLiveData$default(dxlVar, (dnw) null, 0L, 3, (Object) null);
    }

    public static final <T> LiveData<T> asLiveData(dxl<? extends T> dxlVar, dnw dnwVar) {
        return asLiveData$default(dxlVar, dnwVar, 0L, 2, (Object) null);
    }

    public static /* synthetic */ LiveData asLiveData$default(dxl dxlVar, dnw dnwVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            dnwVar = dnx.a;
        }
        if ((i & 2) != 0) {
            j = CoroutineLiveDataKt.DEFAULT_TIMEOUT;
        }
        return asLiveData(dxlVar, dnwVar, j);
    }

    public static final <T> LiveData<T> asLiveData(dxl<? extends T> dxlVar, dnw dnwVar, long j) {
        dqc.d(dxlVar, "$this$asLiveData");
        dqc.d(dnwVar, "context");
        return CoroutineLiveDataKt.liveData(dnwVar, j, new FlowLiveDataConversions$asLiveData$1(dxlVar, null));
    }

    public static final <T> dxl<T> asFlow(LiveData<T> liveData) {
        dqc.d(liveData, "$this$asFlow");
        return dxn.a(new FlowLiveDataConversions$asFlow$1(liveData, null));
    }

    public static /* synthetic */ LiveData asLiveData$default(dxl dxlVar, dnw dnwVar, Duration duration, int i, Object obj) {
        if ((i & 1) != 0) {
            dnwVar = dnx.a;
        }
        return asLiveData(dxlVar, dnwVar, duration);
    }

    public static final <T> LiveData<T> asLiveData(dxl<? extends T> dxlVar, dnw dnwVar, Duration duration) {
        dqc.d(dxlVar, "$this$asLiveData");
        dqc.d(dnwVar, "context");
        dqc.d(duration, "timeout");
        return asLiveData(dxlVar, dnwVar, duration.toMillis());
    }
}
