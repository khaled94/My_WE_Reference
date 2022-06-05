package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import defpackage.vf;

/* renamed from: zi  reason: default package */
/* loaded from: classes2.dex */
public final class zi implements vf.b, vf.c {
    public final vc<?> a;
    zj b;
    private final boolean c;

    public zi(vc<?> vcVar, boolean z) {
        this.a = vcVar;
        this.c = z;
    }

    private final zj a() {
        aat.a(this.b, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.b;
    }

    @Override // defpackage.vr
    public final void a(int i) {
        a().a(i);
    }

    @Override // defpackage.vr
    public final void a(Bundle bundle) {
        a().a(bundle);
    }

    @Override // defpackage.vz
    public final void a(ConnectionResult connectionResult) {
        a().a(connectionResult, this.a, this.c);
    }
}
