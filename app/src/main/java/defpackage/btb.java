package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: btb  reason: default package */
/* loaded from: classes2.dex */
public final class btb implements Runnable {
    private final /* synthetic */ bas a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ boolean d;
    private final /* synthetic */ AppMeasurementDynamiteService e;

    public btb(AppMeasurementDynamiteService appMeasurementDynamiteService, bas basVar, String str, String str2, boolean z) {
        this.e = appMeasurementDynamiteService;
        this.a = basVar;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.a.i().a(this.a, this.b, this.c, this.d);
    }
}
