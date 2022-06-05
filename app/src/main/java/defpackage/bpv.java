package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import java.util.List;

/* renamed from: bpv  reason: default package */
/* loaded from: classes2.dex */
public final class bpv {
    final bql a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bpv(bql bqlVar) {
        this.a = bqlVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(String str) {
        if (str == null || str.isEmpty()) {
            this.a.q().i.a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.a.p().c();
        if (!a()) {
            this.a.q().i.a("Install Referrer Reporter is not available");
            return;
        }
        this.a.q().i.a("Install Referrer Reporter is initializing");
        bpy bpyVar = new bpy(this, str);
        this.a.p().c();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.a.m().getPackageManager();
        if (packageManager == null) {
            this.a.q().f.a("Failed to obtain Package Manager to verify binding conditions");
            return;
        }
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            ResolveInfo resolveInfo = queryIntentServices.get(0);
            if (resolveInfo.serviceInfo == null) {
                return;
            }
            String str2 = resolveInfo.serviceInfo.packageName;
            if (resolveInfo.serviceInfo.name != null && "com.android.vending".equals(str2) && a()) {
                try {
                    this.a.q().i.a("Install Referrer Service is", adt.a().a(this.a.m(), new Intent(intent), bpyVar, 1) ? "available" : "not available");
                    return;
                } catch (Exception e) {
                    this.a.q().c.a("Exception occurred while binding to Install Referrer Service", e.getMessage());
                    return;
                }
            }
            this.a.q().i.a("Play Store missing or incompatible. Version 8.3.73 or later required");
            return;
        }
        this.a.q().i.a("Play Service for fetching Install Referrer is unavailable on device");
    }

    private final boolean a() {
        try {
            aeo a = aep.a(this.a.m());
            if (a != null) {
                return a.b("com.android.vending", 128).versionCode >= 80837300;
            }
            this.a.q().i.a("Failed to retrieve Package Manager to check Play Store compatibility");
            return false;
        } catch (Exception e) {
            this.a.q().i.a("Failed to retrieve Play Store version", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle a(String str, atc atcVar) {
        this.a.p().c();
        if (atcVar == null) {
            this.a.q().f.a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle a = atcVar.a(bundle);
            if (a != null) {
                return a;
            }
            this.a.q().c.a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e) {
            this.a.q().c.a("Exception occurred while retrieving the Install Referrer", e.getMessage());
            return null;
        }
    }
}
