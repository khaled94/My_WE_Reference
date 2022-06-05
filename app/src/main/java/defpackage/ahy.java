package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: ahy  reason: default package */
/* loaded from: classes.dex */
public final class ahy extends aai<ahv> {
    public ahy(Context context, Looper looper, aaf aafVar, vr vrVar, vz vzVar) {
        super(context, looper, 126, aafVar, vrVar, vzVar);
    }

    @Override // defpackage.aad, defpackage.vc.f
    public final int a() {
        return uz.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @Override // defpackage.aad
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        if (queryLocalInterface instanceof ahv) {
            return (ahv) queryLocalInterface;
        }
        return new ahv(iBinder);
    }

    @Override // defpackage.aad
    public final String c() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // defpackage.aad
    public final String d() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    @Override // defpackage.aad
    public final boolean y() {
        return true;
    }

    @Override // defpackage.aad
    public final uw[] z() {
        return ahs.e;
    }
}
