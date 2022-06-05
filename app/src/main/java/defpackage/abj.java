package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: abj  reason: default package */
/* loaded from: classes.dex */
public final class abj extends aai<abf> {
    private final aba a;

    public abj(Context context, Looper looper, aaf aafVar, aba abaVar, vr vrVar, vz vzVar) {
        super(context, looper, 270, aafVar, vrVar, vzVar);
        this.a = abaVar;
    }

    @Override // defpackage.aad, defpackage.vc.f
    public final int a() {
        return 203400000;
    }

    @Override // defpackage.aad
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof abf ? (abf) queryLocalInterface : new abf(iBinder);
    }

    @Override // defpackage.aad
    public final String c() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.aad
    public final String d() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // defpackage.aad
    public final Bundle p() {
        aba abaVar = this.a;
        Bundle bundle = new Bundle();
        String str = abaVar.b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // defpackage.aad
    public final boolean w() {
        return true;
    }

    @Override // defpackage.aad
    public final uw[] z() {
        return aio.b;
    }
}
