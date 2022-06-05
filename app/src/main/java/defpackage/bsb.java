package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: bsb  reason: default package */
/* loaded from: classes2.dex */
public final class bsb implements Runnable {
    private final /* synthetic */ bas a;
    private final /* synthetic */ AppMeasurementDynamiteService b;

    public bsb(AppMeasurementDynamiteService appMeasurementDynamiteService, bas basVar) {
        this.b = appMeasurementDynamiteService;
        this.a = basVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.i().a(this.a);
    }
}
