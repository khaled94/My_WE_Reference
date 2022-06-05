package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class AppMeasurementInstallReferrerReceiver extends BroadcastReceiver implements bqc {
    private bqa a;

    @Override // defpackage.bqc
    public final void a(Context context, Intent intent) {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.a == null) {
            this.a = new bqa(this);
        }
        this.a.a(context, intent);
    }

    @Override // defpackage.bqc
    public final BroadcastReceiver.PendingResult a() {
        return goAsync();
    }
}
