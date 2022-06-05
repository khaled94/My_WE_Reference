package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zl  reason: default package */
/* loaded from: classes2.dex */
public final class zl implements xy {
    final /* synthetic */ wg a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zl(wg wgVar) {
        this.a = wgVar;
    }

    @Override // defpackage.xy
    public final void a(int i, boolean z) {
        Lock lock;
        this.a.g.lock();
        try {
            wg wgVar = this.a;
            if (!wgVar.f && wgVar.e != null && wgVar.e.b()) {
                this.a.f = true;
                this.a.b.a(i);
                lock = this.a.g;
                lock.unlock();
            }
            this.a.f = false;
            wg.a(this.a, i, z);
            lock = this.a.g;
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
            wg wgVar = this.a;
            Bundle bundle2 = wgVar.c;
            if (bundle2 == null) {
                wgVar.c = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            this.a.d = ConnectionResult.a;
            wg.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }

    @Override // defpackage.xy
    public final void a(ConnectionResult connectionResult) {
        this.a.g.lock();
        try {
            this.a.d = connectionResult;
            wg.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }
}
