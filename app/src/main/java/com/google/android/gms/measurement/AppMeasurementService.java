package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements btz {
    private btv<AppMeasurementService> a;

    private final btv<AppMeasurementService> a() {
        if (this.a == null) {
            this.a = new btv<>(this);
        }
        return this.a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        a().a();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        a().b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        btv<AppMeasurementService> a = a();
        bpi q = bql.a(a.a, (baz) null).q();
        if (intent == null) {
            q.f.a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        q.k.a("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        a.a(new Runnable(a, i2, q, intent) { // from class: btu
            private final btv a;
            private final int b;
            private final bpi c;
            private final Intent d;

            {
                this.a = a;
                this.b = i2;
                this.c = q;
                this.d = intent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                btv btvVar = this.a;
                int i3 = this.b;
                bpi bpiVar = this.c;
                Intent intent2 = this.d;
                if (btvVar.a.a(i3)) {
                    bpiVar.k.a("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i3));
                    btvVar.c().k.a("Completed wakeful intent.");
                    btvVar.a.a(intent2);
                }
            }
        });
        return 2;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        btv<AppMeasurementService> a = a();
        if (intent == null) {
            a.c().c.a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new bqm(buj.a(a.a));
        }
        a.c().f.a("onBind received unknown action", action);
        return null;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return a().a(intent);
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        a().b(intent);
    }

    @Override // defpackage.btz
    public final boolean a(int i) {
        return stopSelfResult(i);
    }

    @Override // defpackage.btz
    public final void a(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.btz
    public final void a(Intent intent) {
        AppMeasurementReceiver.completeWakefulIntent(intent);
    }
}
