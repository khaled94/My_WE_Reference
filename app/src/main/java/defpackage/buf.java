package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.core.app.NotificationCompat;

/* renamed from: buf  reason: default package */
/* loaded from: classes2.dex */
public final class buf extends buk {
    private final AlarmManager a = (AlarmManager) m().getSystemService(NotificationCompat.CATEGORY_ALARM);
    private final bla c;
    private Integer d;

    /* JADX INFO: Access modifiers changed from: protected */
    public buf(buj bujVar) {
        super(bujVar);
        this.c = new bui(this, bujVar.b, bujVar);
    }

    @Override // defpackage.buk
    protected final boolean d() {
        this.a.cancel(x());
        if (Build.VERSION.SDK_INT >= 24) {
            v();
            return false;
        }
        return false;
    }

    private final void v() {
        int w = w();
        q().k.a("Cancelling job. JobID", Integer.valueOf(w));
        ((JobScheduler) m().getSystemService("jobscheduler")).cancel(w);
    }

    public final void a(long j) {
        t();
        Context m = m();
        if (!bqa.a(m)) {
            q().j.a("Receiver not registered/enabled");
        }
        if (!buv.a(m)) {
            q().j.a("Service not registered/enabled");
        }
        e();
        long b = l().b() + j;
        if (j < Math.max(0L, blk.A.a(null).longValue()) && !this.c.b()) {
            q().k.a("Scheduling upload with DelayedRunnable");
            this.c.a(j);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            q().k.a("Scheduling upload with JobScheduler");
            Context m2 = m();
            ComponentName componentName = new ComponentName(m2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int w = w();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            JobInfo build = new JobInfo.Builder(w, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build();
            q().k.a("Scheduling job. JobID", Integer.valueOf(w));
            avz.a(m2, build, "com.google.android.gms", "UploadAlarm");
            return;
        }
        q().k.a("Scheduling upload with AlarmManager");
        this.a.setInexactRepeating(2, b, Math.max(blk.v.a(null).longValue(), j), x());
    }

    private final int w() {
        if (this.d == null) {
            String valueOf = String.valueOf(m().getPackageName());
            this.d = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.d.intValue();
    }

    public final void e() {
        t();
        this.a.cancel(x());
        this.c.c();
        if (Build.VERSION.SDK_INT >= 24) {
            v();
        }
    }

    private final PendingIntent x() {
        Context m = m();
        return PendingIntent.getBroadcast(m, 0, new Intent().setClassName(m, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    @Override // defpackage.buh
    public final /* bridge */ /* synthetic */ bur f() {
        return super.f();
    }

    @Override // defpackage.buh
    public final /* bridge */ /* synthetic */ bvc g() {
        return super.g();
    }

    @Override // defpackage.buh
    public final /* bridge */ /* synthetic */ bvk h() {
        return super.h();
    }

    @Override // defpackage.buh
    public final /* bridge */ /* synthetic */ bqf i() {
        return super.i();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ blc k() {
        return super.k();
    }

    @Override // defpackage.bri, defpackage.brk
    public final /* bridge */ /* synthetic */ ady l() {
        return super.l();
    }

    @Override // defpackage.bri, defpackage.brk
    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ bpg n() {
        return super.n();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ buv o() {
        return super.o();
    }

    @Override // defpackage.bri, defpackage.brk
    public final /* bridge */ /* synthetic */ bqe p() {
        return super.p();
    }

    @Override // defpackage.bri, defpackage.brk
    public final /* bridge */ /* synthetic */ bpi q() {
        return super.q();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ bpq r() {
        return super.r();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ bvf s() {
        return super.s();
    }
}
