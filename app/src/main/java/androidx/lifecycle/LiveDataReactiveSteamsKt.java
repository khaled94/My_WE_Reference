package androidx.lifecycle;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086\b\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\b¨\u0006\u0007"}, d2 = {"toLiveData", "Landroidx/lifecycle/LiveData;", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/reactivestreams/Publisher;", "toPublisher", "lifecycle", "Landroidx/lifecycle/LifecycleOwner;", "lifecycle-reactivestreams-ktx_release"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class LiveDataReactiveSteamsKt {
    public static final <T> eeu<T> toPublisher(LiveData<T> liveData, LifecycleOwner lifecycleOwner) {
        dqc.d(liveData, "$this$toPublisher");
        dqc.d(lifecycleOwner, "lifecycle");
        eeu<T> publisher = LiveDataReactiveStreams.toPublisher(lifecycleOwner, liveData);
        dqc.b(publisher, "LiveDataReactiveStreams.…ublisher(lifecycle, this)");
        return publisher;
    }

    public static final <T> LiveData<T> toLiveData(eeu<T> eeuVar) {
        dqc.d(eeuVar, "$this$toLiveData");
        LiveData<T> fromPublisher = LiveDataReactiveStreams.fromPublisher(eeuVar);
        dqc.b(fromPublisher, "LiveDataReactiveStreams.fromPublisher(this)");
        return fromPublisher;
    }
}
