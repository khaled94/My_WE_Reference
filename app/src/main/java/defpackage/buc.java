package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: buc  reason: default package */
/* loaded from: classes2.dex */
public final class buc implements Runnable {
    private final /* synthetic */ bas a;
    private final /* synthetic */ bli b;
    private final /* synthetic */ String c;
    private final /* synthetic */ AppMeasurementDynamiteService d;

    public buc(AppMeasurementDynamiteService appMeasurementDynamiteService, bas basVar, bli bliVar, String str) {
        this.d = appMeasurementDynamiteService;
        this.a = basVar;
        this.b = bliVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a.i().a(this.a, this.b, this.c);
    }
}
