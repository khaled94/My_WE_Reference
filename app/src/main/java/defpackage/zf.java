package defpackage;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zf  reason: default package */
/* loaded from: classes2.dex */
public abstract class zf extends LifecycleCallback implements DialogInterface.OnCancelListener {
    protected volatile boolean c;
    protected final ux e;
    protected final AtomicReference<zc> d = new AtomicReference<>(null);
    private final Handler b = new ait(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    public zf(vv vvVar, ux uxVar) {
        super(vvVar);
        this.e = uxVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(ConnectionResult connectionResult, int i) {
        this.d.set(null);
        a(connectionResult, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        this.d.set(null);
        e();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void a(int i, int i2, Intent intent) {
        zc zcVar = this.d.get();
        if (i != 1) {
            if (i == 2) {
                int a = this.e.a(a());
                if (a == 0) {
                    f();
                    return;
                } else if (zcVar == null) {
                    return;
                } else {
                    if (zcVar.b.c == 18 && a == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            f();
            return;
        } else if (i2 == 0) {
            if (zcVar == null) {
                return;
            }
            int i3 = 13;
            if (intent != null) {
                i3 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
            }
            c(new ConnectionResult(i3, null, zcVar.b.toString()), a(zcVar));
            return;
        }
        if (zcVar != null) {
            c(zcVar.b, zcVar.a);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void a(Bundle bundle) {
        super.a(bundle);
        if (bundle != null) {
            this.d.set(bundle.getBoolean("resolving_error", false) ? new zc(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    protected abstract void a(ConnectionResult connectionResult, int i);

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void b(Bundle bundle) {
        super.b(bundle);
        zc zcVar = this.d.get();
        if (zcVar == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", zcVar.a);
        bundle.putInt("failed_status", zcVar.b.c);
        bundle.putParcelable("failed_resolution", zcVar.b.d);
    }

    public final void b(ConnectionResult connectionResult, int i) {
        zc zcVar = new zc(connectionResult, i);
        if (this.d.compareAndSet(null, zcVar)) {
            this.b.post(new ze(this, zcVar));
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void c() {
        super.c();
        this.c = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void d() {
        super.d();
        this.c = false;
    }

    protected abstract void e();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        c(new ConnectionResult(13, null), a(this.d.get()));
    }

    private static final int a(zc zcVar) {
        if (zcVar == null) {
            return -1;
        }
        return zcVar.a;
    }
}
