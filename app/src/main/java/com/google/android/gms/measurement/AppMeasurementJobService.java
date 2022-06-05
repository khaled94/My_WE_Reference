package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;

/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements btz {
    private btv<AppMeasurementJobService> a;

    private final btv<AppMeasurementJobService> a() {
        if (this.a == null) {
            this.a = new btv<>(this);
        }
        return this.a;
    }

    @Override // defpackage.btz
    public final void a(Intent intent) {
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        btv<AppMeasurementJobService> a = a();
        bpi q = bql.a(a.a, (baz) null).q();
        String string = jobParameters.getExtras().getString("action");
        q.k.a("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            a.a(new Runnable(a, q, jobParameters) { // from class: btx
                private final btv a;
                private final bpi b;
                private final JobParameters c;

                {
                    this.a = a;
                    this.b = q;
                    this.c = jobParameters;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    btv btvVar = this.a;
                    bpi bpiVar = this.b;
                    JobParameters jobParameters2 = this.c;
                    bpiVar.k.a("AppMeasurementJobService processed last upload request.");
                    btvVar.a.a(jobParameters2);
                }
            });
            return true;
        }
        return true;
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
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.btz
    public final void a(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }
}
