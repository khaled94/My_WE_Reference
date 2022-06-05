package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: bux  reason: default package */
/* loaded from: classes2.dex */
public final class bux implements Runnable {
    private final /* synthetic */ bas a;
    private final /* synthetic */ AppMeasurementDynamiteService b;

    public bux(AppMeasurementDynamiteService appMeasurementDynamiteService, bas basVar) {
        this.b = appMeasurementDynamiteService;
        this.a = basVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.e().a(this.a, this.b.a.o());
    }
}
