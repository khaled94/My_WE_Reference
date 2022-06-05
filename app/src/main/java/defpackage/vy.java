package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import defpackage.aad;
import defpackage.vc;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;

/* renamed from: vy  reason: default package */
/* loaded from: classes2.dex */
public final class vy implements ServiceConnection, vc.f {
    private static final String e = vy.class.getSimpleName();
    final vr a;
    IBinder b;
    boolean c;
    public String d;
    private final String f;
    private final String g;
    private final ComponentName h;
    private final Context i;
    private final Handler j;
    private final vz k;
    private String l;

    private final void d() {
        if (Thread.currentThread() == this.j.getLooper().getThread()) {
            return;
        }
        throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
    }

    @Override // defpackage.vc.f
    public final int a() {
        return 0;
    }

    @Override // defpackage.vc.f
    public final void a(aad.c cVar) {
        d();
        c();
        if (j()) {
            try {
                a("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.h;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f).setAction(this.g);
            }
            boolean bindService = this.i.bindService(intent, this, aaj.a());
            this.c = bindService;
            if (!bindService) {
                this.b = null;
                this.k.a(new ConnectionResult(16));
            }
            c();
        } catch (SecurityException e2) {
            this.c = false;
            this.b = null;
            throw e2;
        }
    }

    @Override // defpackage.vc.f
    public final void a(aad.e eVar) {
    }

    @Override // defpackage.vc.f
    public final void a(aal aalVar, Set<Scope> set) {
    }

    @Override // defpackage.vc.f
    public final void a(String str, PrintWriter printWriter) {
    }

    @Override // defpackage.vc.f
    public final Intent b() {
        return new Intent();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        String.valueOf(String.valueOf(this.b)).length();
    }

    @Override // defpackage.vc.f
    public final boolean e() {
        return false;
    }

    @Override // defpackage.vc.f
    public final String f() {
        String str = this.f;
        if (str != null) {
            return str;
        }
        aat.a(this.h);
        return this.h.getPackageName();
    }

    @Override // defpackage.vc.f
    public final String g() {
        return this.l;
    }

    @Override // defpackage.vc.f
    public final Set<Scope> h() {
        return Collections.emptySet();
    }

    @Override // defpackage.vc.f
    public final void i() {
        d();
        c();
        try {
            this.i.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.c = false;
        this.b = null;
    }

    @Override // defpackage.vc.f
    public final boolean j() {
        d();
        return this.b != null;
    }

    @Override // defpackage.vc.f
    public final boolean k() {
        d();
        return this.c;
    }

    @Override // defpackage.vc.f
    public final boolean l() {
        return false;
    }

    @Override // defpackage.vc.f
    public final boolean m() {
        return false;
    }

    @Override // defpackage.vc.f
    public final uw[] n() {
        return new uw[0];
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.j.post(new Runnable() { // from class: yf
            @Override // java.lang.Runnable
            public final void run() {
                vy vyVar = vy.this;
                IBinder iBinder2 = iBinder;
                vyVar.c = false;
                vyVar.b = iBinder2;
                vyVar.c();
                vyVar.a.a(new Bundle());
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.j.post(new Runnable() { // from class: ye
            @Override // java.lang.Runnable
            public final void run() {
                vy vyVar = vy.this;
                vyVar.c = false;
                vyVar.b = null;
                vyVar.c();
                vyVar.a.a(1);
            }
        });
    }

    @Override // defpackage.vc.f
    public final void a(String str) {
        d();
        this.l = str;
        i();
    }
}
