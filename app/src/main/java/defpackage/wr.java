package defpackage;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import defpackage.aad;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* renamed from: wr  reason: default package */
/* loaded from: classes2.dex */
final class wr implements aad.c {
    final boolean a;
    private final WeakReference<xa> b;
    private final vc<?> c;

    public wr(xa xaVar, vc<?> vcVar, boolean z) {
        this.b = new WeakReference<>(xaVar);
        this.c = vcVar;
        this.a = z;
    }

    @Override // defpackage.aad.c
    public final void a(ConnectionResult connectionResult) {
        Lock lock;
        xa xaVar = this.b.get();
        if (xaVar == null) {
            return;
        }
        aat.b(Looper.myLooper() == xaVar.a.m.a(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        xaVar.b.lock();
        try {
            if (xaVar.b(0)) {
                if (!connectionResult.b()) {
                    xaVar.b(connectionResult, this.c, this.a);
                }
                if (xaVar.f()) {
                    xaVar.e();
                }
                lock = xaVar.b;
            } else {
                lock = xaVar.b;
            }
            lock.unlock();
        } catch (Throwable th) {
            xaVar.b.unlock();
            throw th;
        }
    }
}
