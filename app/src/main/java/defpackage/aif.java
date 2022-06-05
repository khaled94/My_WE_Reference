package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import defpackage.tb;
import defpackage.vf;

/* renamed from: aif  reason: default package */
/* loaded from: classes.dex */
public final class aif extends aai {
    private final tb.a a;

    public aif(Context context, Looper looper, aaf aafVar, tb.a aVar, vf.b bVar, vf.c cVar) {
        super(context, looper, 68, aafVar, bVar, cVar);
        tb.a.C0049a c0049a = new tb.a.C0049a(aVar == null ? tb.a.a : aVar);
        c0049a.a(aic.a());
        this.a = new tb.a(c0049a);
    }

    @Override // defpackage.aad, defpackage.vc.f
    public final int a() {
        return 12800000;
    }

    @Override // defpackage.aad
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof aig ? (aig) queryLocalInterface : new aig(iBinder);
    }

    @Override // defpackage.aad
    public final String c() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // defpackage.aad
    public final String d() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // defpackage.aad
    public final Bundle p() {
        tb.a aVar = this.a;
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", aVar.b);
        bundle.putString("log_session_id", aVar.c);
        return bundle;
    }
}
