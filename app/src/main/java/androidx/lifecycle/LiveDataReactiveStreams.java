package androidx.lifecycle;

import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class LiveDataReactiveStreams {
    private LiveDataReactiveStreams() {
    }

    public static <T> eeu<T> toPublisher(LifecycleOwner lifecycleOwner, LiveData<T> liveData) {
        return new LiveDataPublisher(lifecycleOwner, liveData);
    }

    /* loaded from: classes.dex */
    static final class LiveDataPublisher<T> implements eeu<T> {
        final LifecycleOwner mLifecycle;
        final LiveData<T> mLiveData;

        LiveDataPublisher(LifecycleOwner lifecycleOwner, LiveData<T> liveData) {
            this.mLifecycle = lifecycleOwner;
            this.mLiveData = liveData;
        }

        @Override // defpackage.eeu
        public final void subscribe(eev<? super T> eevVar) {
            eevVar.onSubscribe(new LiveDataSubscription(eevVar, this.mLifecycle, this.mLiveData));
        }

        /* loaded from: classes.dex */
        static final class LiveDataSubscription<T> implements Observer<T>, eew {
            volatile boolean mCanceled;
            T mLatest;
            final LifecycleOwner mLifecycle;
            final LiveData<T> mLiveData;
            boolean mObserving;
            long mRequested;
            final eev<? super T> mSubscriber;

            LiveDataSubscription(eev<? super T> eevVar, LifecycleOwner lifecycleOwner, LiveData<T> liveData) {
                this.mSubscriber = eevVar;
                this.mLifecycle = lifecycleOwner;
                this.mLiveData = liveData;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(T t) {
                if (this.mCanceled) {
                    return;
                }
                if (this.mRequested > 0) {
                    this.mLatest = null;
                    this.mSubscriber.onNext(t);
                    long j = this.mRequested;
                    if (j == LocationRequestCompat.PASSIVE_INTERVAL) {
                        return;
                    }
                    this.mRequested = j - 1;
                    return;
                }
                this.mLatest = t;
            }

            @Override // defpackage.eew
            public final void request(final long j) {
                if (this.mCanceled) {
                    return;
                }
                ArchTaskExecutor.getInstance().executeOnMainThread(new Runnable() { // from class: androidx.lifecycle.LiveDataReactiveStreams.LiveDataPublisher.LiveDataSubscription.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (LiveDataSubscription.this.mCanceled) {
                            return;
                        }
                        if (j <= 0) {
                            LiveDataSubscription.this.mCanceled = true;
                            if (LiveDataSubscription.this.mObserving) {
                                LiveDataSubscription.this.mLiveData.removeObserver(LiveDataSubscription.this);
                                LiveDataSubscription.this.mObserving = false;
                            }
                            LiveDataSubscription.this.mLatest = null;
                            LiveDataSubscription.this.mSubscriber.onError(new IllegalArgumentException("Non-positive request"));
                            return;
                        }
                        LiveDataSubscription liveDataSubscription = LiveDataSubscription.this;
                        liveDataSubscription.mRequested = liveDataSubscription.mRequested + j >= LiveDataSubscription.this.mRequested ? LiveDataSubscription.this.mRequested + j : LocationRequestCompat.PASSIVE_INTERVAL;
                        if (!LiveDataSubscription.this.mObserving) {
                            LiveDataSubscription.this.mObserving = true;
                            LiveDataSubscription.this.mLiveData.observe(LiveDataSubscription.this.mLifecycle, LiveDataSubscription.this);
                        } else if (LiveDataSubscription.this.mLatest == null) {
                        } else {
                            LiveDataSubscription liveDataSubscription2 = LiveDataSubscription.this;
                            liveDataSubscription2.onChanged(liveDataSubscription2.mLatest);
                            LiveDataSubscription.this.mLatest = null;
                        }
                    }
                });
            }

            @Override // defpackage.eew
            public final void cancel() {
                if (this.mCanceled) {
                    return;
                }
                this.mCanceled = true;
                ArchTaskExecutor.getInstance().executeOnMainThread(new Runnable() { // from class: androidx.lifecycle.LiveDataReactiveStreams.LiveDataPublisher.LiveDataSubscription.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (LiveDataSubscription.this.mObserving) {
                            LiveDataSubscription.this.mLiveData.removeObserver(LiveDataSubscription.this);
                            LiveDataSubscription.this.mObserving = false;
                        }
                        LiveDataSubscription.this.mLatest = null;
                    }
                });
            }
        }
    }

    public static <T> LiveData<T> fromPublisher(eeu<T> eeuVar) {
        return new PublisherLiveData(eeuVar);
    }

    /* loaded from: classes.dex */
    static class PublisherLiveData<T> extends LiveData<T> {
        private final eeu<T> mPublisher;
        final AtomicReference<PublisherLiveData<T>.LiveDataSubscriber> mSubscriber = new AtomicReference<>();

        PublisherLiveData(eeu<T> eeuVar) {
            this.mPublisher = eeuVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        public void onActive() {
            super.onActive();
            PublisherLiveData<T>.LiveDataSubscriber liveDataSubscriber = new LiveDataSubscriber();
            this.mSubscriber.set(liveDataSubscriber);
            this.mPublisher.subscribe(liveDataSubscriber);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        public void onInactive() {
            super.onInactive();
            PublisherLiveData<T>.LiveDataSubscriber andSet = this.mSubscriber.getAndSet(null);
            if (andSet != null) {
                andSet.cancelSubscription();
            }
        }

        /* loaded from: classes.dex */
        final class LiveDataSubscriber extends AtomicReference<eew> implements eev<T> {
            LiveDataSubscriber() {
            }

            @Override // defpackage.eev
            public final void onSubscribe(eew eewVar) {
                if (compareAndSet(null, eewVar)) {
                    eewVar.request(LocationRequestCompat.PASSIVE_INTERVAL);
                } else {
                    eewVar.cancel();
                }
            }

            @Override // defpackage.eev
            public final void onNext(T t) {
                PublisherLiveData.this.postValue(t);
            }

            @Override // defpackage.eev
            public final void onError(final Throwable th) {
                PublisherLiveData.this.mSubscriber.compareAndSet(this, null);
                ArchTaskExecutor.getInstance().executeOnMainThread(new Runnable() { // from class: androidx.lifecycle.LiveDataReactiveStreams.PublisherLiveData.LiveDataSubscriber.1
                    @Override // java.lang.Runnable
                    public void run() {
                        throw new RuntimeException("LiveData does not handle errors. Errors from publishers should be handled upstream and propagated as state", th);
                    }
                });
            }

            public final void onComplete() {
                PublisherLiveData.this.mSubscriber.compareAndSet(this, null);
            }

            public final void cancelSubscription() {
                eew eewVar = get();
                if (eewVar != null) {
                    eewVar.cancel();
                }
            }
        }
    }
}
