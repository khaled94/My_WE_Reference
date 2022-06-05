package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import defpackage.vf;

/* renamed from: wy  reason: default package */
/* loaded from: classes2.dex */
final class wy implements vf.b, vf.c {
    final /* synthetic */ xa a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ wy(xa xaVar) {
        this.a = xaVar;
    }

    @Override // defpackage.vr
    public final void a(int i) {
    }

    @Override // defpackage.vr
    public final void a(Bundle bundle) {
        aat.a(this.a.k);
        ((bwe) aat.a(this.a.e)).a(new wx(this.a));
    }

    @Override // defpackage.vz
    public final void a(ConnectionResult connectionResult) {
        this.a.b.lock();
        try {
            if (this.a.b(connectionResult)) {
                this.a.c();
                this.a.e();
            } else {
                this.a.a(connectionResult);
            }
        } finally {
            this.a.b.unlock();
        }
    }
}
