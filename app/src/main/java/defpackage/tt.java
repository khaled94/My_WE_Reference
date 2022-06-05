package defpackage;

import android.content.Context;
import androidx.loader.content.AsyncTaskLoader;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: tt  reason: default package */
/* loaded from: classes2.dex */
public final class tt extends AsyncTaskLoader implements wc {
    private final Semaphore a = new Semaphore(0);
    private final Set b;

    public tt(Context context, Set set) {
        super(context);
        this.b = set;
    }

    @Override // defpackage.wc
    public final void a() {
        this.a.release();
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public final /* synthetic */ Object loadInBackground() {
        int i = 0;
        for (vf vfVar : this.b) {
            if (vfVar.a(this)) {
                i++;
            }
        }
        try {
            this.a.tryAcquire(i, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // androidx.loader.content.Loader
    public final void onStartLoading() {
        this.a.drainPermits();
        forceLoad();
    }
}
