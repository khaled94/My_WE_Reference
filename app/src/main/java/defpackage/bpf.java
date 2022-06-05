package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import defpackage.aad;

/* renamed from: bpf  reason: default package */
/* loaded from: classes2.dex */
public final class bpf extends aad<boz> {
    public bpf(Context context, Looper looper, aad.a aVar, aad.b bVar) {
        super(context, looper, aVar, bVar);
    }

    @Override // defpackage.aad, defpackage.vc.f
    public final int a() {
        return uz.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @Override // defpackage.aad
    public final String c() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // defpackage.aad
    public final String d() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // defpackage.aad
    public final /* synthetic */ boz a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof boz) {
            return (boz) queryLocalInterface;
        }
        return new bpb(iBinder);
    }
}
