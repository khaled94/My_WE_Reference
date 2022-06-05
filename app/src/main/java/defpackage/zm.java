package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zm  reason: default package */
/* loaded from: classes2.dex */
public final class zm implements xy {
    final /* synthetic */ wg a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zm(wg wgVar) {
        this.a = wgVar;
    }

    @Override // defpackage.xy
    public final void a(int i, boolean z) {
        Lock lock;
        this.a.g.lock();
        try {
            wg wgVar = this.a;
            if (wgVar.f) {
                wgVar.f = false;
                wg.a(this.a, i, z);
                lock = this.a.g;
            } else {
                wgVar.f = true;
                this.a.a.a(i);
                lock = this.a.g;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.a.g.unlock();
            throw th;
        }
    }

    @Override // defpackage.xy
    public final void a(Bundle bundle) {
        this.a.g.lock();
        try {
            this.a.e = ConnectionResult.a;
            wg.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }

    @Override // defpackage.xy
    public final void a(ConnectionResult connectionResult) {
        this.a.g.lock();
        try {
            this.a.e = connectionResult;
            wg.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }
}
