package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import defpackage.aad;

/* renamed from: btp  reason: default package */
/* loaded from: classes2.dex */
public final class btp implements aad.a, aad.b, ServiceConnection {
    volatile boolean a;
    volatile bpf b;
    final /* synthetic */ bsx c;

    /* JADX INFO: Access modifiers changed from: protected */
    public btp(bsx bsxVar) {
        this.c = bsxVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boz bozVar;
        aat.b("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.a = false;
                this.c.q().c.a("Service connected with null binder");
                return;
            }
            boz bozVar2 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                        if (queryLocalInterface instanceof boz) {
                            bozVar = (boz) queryLocalInterface;
                        } else {
                            bozVar = new bpb(iBinder);
                        }
                        bozVar2 = bozVar;
                    }
                    this.c.q().k.a("Bound to IMeasurementService interface");
                } else {
                    this.c.q().c.a("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.c.q().c.a("Service connect failed to get IMeasurementService");
            }
            if (bozVar2 == null) {
                this.a = false;
                try {
                    adt.a().a(this.c.m(), this.c.a);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.c.p().a(new bto(this, bozVar2));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        aat.b("MeasurementServiceConnection.onServiceDisconnected");
        this.c.q().j.a("Service disconnected");
        this.c.p().a(new btr(this, componentName));
    }

    @Override // defpackage.aad.a
    public final void a() {
        aat.b("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.c.p().a(new btq(this, this.b.q()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.b = null;
                this.a = false;
            }
        }
    }

    @Override // defpackage.aad.a
    public final void a(int i) {
        aat.b("MeasurementServiceConnection.onConnectionSuspended");
        this.c.q().j.a("Service connection suspended");
        this.c.p().a(new btt(this));
    }

    @Override // defpackage.aad.b
    public final void a(ConnectionResult connectionResult) {
        aat.b("MeasurementServiceConnection.onConnectionFailed");
        bql bqlVar = this.c.w;
        bpi bpiVar = (bqlVar.f == null || !bqlVar.f.v()) ? null : bqlVar.f;
        if (bpiVar != null) {
            bpiVar.f.a("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.a = false;
            this.b = null;
        }
        this.c.p().a(new bts(this));
    }
}
