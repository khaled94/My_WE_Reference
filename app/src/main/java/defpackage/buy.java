package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: buy  reason: default package */
/* loaded from: classes2.dex */
public final class buy implements Runnable {
    private final /* synthetic */ bas a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ AppMeasurementDynamiteService d;

    public buy(AppMeasurementDynamiteService appMeasurementDynamiteService, bas basVar, String str, String str2) {
        this.d = appMeasurementDynamiteService;
        this.a = basVar;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a.i().a(this.a, this.b, this.c);
    }
}
