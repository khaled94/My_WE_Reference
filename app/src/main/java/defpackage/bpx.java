package defpackage;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: bpx  reason: default package */
/* loaded from: classes2.dex */
final class bpx implements Runnable {
    private final /* synthetic */ atc a;
    private final /* synthetic */ ServiceConnection b;
    private final /* synthetic */ bpy c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bpx(bpy bpyVar, atc atcVar, ServiceConnection serviceConnection) {
        this.c = bpyVar;
        this.a = atcVar;
        this.b = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        bpv bpvVar = this.c.a;
        str = this.c.b;
        atc atcVar = this.a;
        ServiceConnection serviceConnection = this.b;
        Bundle a = bpvVar.a(str, atcVar);
        bpvVar.a.p().c();
        if (a != null) {
            long j = a.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                bpvVar.a.q().c.a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = a.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    bpvVar.a.q().c.a("No referrer defined in install referrer response");
                } else {
                    bpvVar.a.q().k.a("InstallReferrer API result", string);
                    buv e = bpvVar.a.e();
                    String valueOf = String.valueOf(string);
                    Bundle a2 = e.a(Uri.parse(valueOf.length() != 0 ? "?".concat(valueOf) : new String("?")));
                    if (a2 == null) {
                        bpvVar.a.q().c.a("No campaign params defined in install referrer result");
                    } else {
                        String string2 = a2.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = a.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j2 == 0) {
                                bpvVar.a.q().c.a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                a2.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == bpvVar.a.b().j.a()) {
                            bpvVar.a.q().k.a("Campaign has already been logged");
                        } else {
                            bpvVar.a.b().j.a(j);
                            bpvVar.a.q().k.a("Logging Install Referrer campaign from sdk with ", "referrer API");
                            a2.putString("_cis", "referrer API");
                            bpvVar.a.d().a("auto", "_cmp", a2);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            adt.a().a(bpvVar.a.m(), serviceConnection);
        }
    }
}
