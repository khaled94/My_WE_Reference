package defpackage;

import com.google.android.gms.common.ConnectionResult;
import java.util.Map;

/* renamed from: xt  reason: default package */
/* loaded from: classes2.dex */
final class xt implements Runnable {
    final /* synthetic */ ConnectionResult a;
    final /* synthetic */ xu b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public xt(xu xuVar, ConnectionResult connectionResult) {
        this.b = xuVar;
        this.a = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        xu xuVar = this.b;
        map = xuVar.d.s;
        xr xrVar = (xr) map.get(xuVar.b);
        if (xrVar == null) {
            return;
        }
        if (!this.a.b()) {
            xrVar.a(this.a, (Exception) null);
            return;
        }
        this.b.c = true;
        if (!this.b.a.m()) {
            try {
                xu xuVar2 = this.b;
                xuVar2.a.a((aal) null, xuVar2.a.h());
                return;
            } catch (SecurityException unused) {
                this.b.a.a("Failed to get service from broker.");
                xrVar.a(new ConnectionResult(10), (Exception) null);
                return;
            }
        }
        this.b.a();
    }
}
