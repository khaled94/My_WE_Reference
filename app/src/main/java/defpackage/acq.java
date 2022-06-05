package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* renamed from: acq  reason: default package */
/* loaded from: classes.dex */
public final class acq extends ach {
    private aad a;
    private final int b;

    public acq(aad aadVar, int i) {
        this.a = aadVar;
        this.b = i;
    }

    @Override // defpackage.aan
    public final void a() {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // defpackage.aan
    public final void a(int i, IBinder iBinder, acu acuVar) {
        aad aadVar = this.a;
        aat.a(aadVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        aat.a(acuVar);
        aad.a(aadVar, acuVar);
        a(i, iBinder, acuVar.a);
    }

    @Override // defpackage.aan
    public final void a(int i, IBinder iBinder, Bundle bundle) {
        aat.a(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.a.a(i, iBinder, bundle, this.b);
        this.a = null;
    }
}
