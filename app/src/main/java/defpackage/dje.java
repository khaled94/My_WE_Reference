package defpackage;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0007J \u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u000eH\u0017J\b\u0010\u000f\u001a\u00020\tH\u0002J\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ucare/we/util/MutableLiveDataFlow;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/MutableLiveData;", "()V", "mPending", "Ljava/util/concurrent/atomic/AtomicBoolean;", "values", "Ljava/util/Queue;", NotificationCompat.CATEGORY_CALL, "", "observe", "owner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "pollValue", "postValue", "value", "(Ljava/lang/Object;)V", "setValue", "t", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dje */
/* loaded from: classes2.dex */
public final class dje<T> extends MutableLiveData<T> {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final Queue<T> b = new LinkedList();

    /* renamed from: lambda$YmhyD_BAqptxG2FNxLa1Tz-MJOc */
    public static /* synthetic */ void m119lambda$YmhyD_BAqptxG2FNxLa1TzMJOc(dje djeVar, Observer observer, Object obj) {
        a(djeVar, observer, obj);
    }

    @Override // androidx.lifecycle.LiveData
    public final void observe(LifecycleOwner lifecycleOwner, final Observer<? super T> observer) {
        dqc.d(lifecycleOwner, "owner");
        dqc.d(observer, "observer");
        if (hasActiveObservers()) {
            getClass().getName();
        }
        super.observe(lifecycleOwner, new Observer() { // from class: -$$Lambda$dje$YmhyD_BAqptxG2FNxLa1Tz-MJOc
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                dje.m119lambda$YmhyD_BAqptxG2FNxLa1TzMJOc(dje.this, observer, obj);
            }
        });
    }

    public static final void a(dje djeVar, Observer observer, Object obj) {
        dqc.d(djeVar, "this$0");
        dqc.d(observer, "$observer");
        if (djeVar.a.compareAndSet(true, false)) {
            observer.onChanged(obj);
            if (!(!djeVar.b.isEmpty())) {
                return;
            }
            djeVar.a();
        }
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public final void postValue(T t) {
        this.b.add(t);
        a();
    }

    private final void a() {
        setValue(this.b.poll());
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public final void setValue(T t) {
        this.a.set(true);
        super.setValue(t);
    }
}
