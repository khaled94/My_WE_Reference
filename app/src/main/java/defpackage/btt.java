package defpackage;

import android.content.ComponentName;

/* renamed from: btt  reason: default package */
/* loaded from: classes2.dex */
final class btt implements Runnable {
    private final /* synthetic */ btp a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public btt(btp btpVar) {
        this.a = btpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bsx.a(this.a.c, new ComponentName(this.a.c.m(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
