package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* renamed from: bvf  reason: default package */
/* loaded from: classes2.dex */
public final class bvf extends bri {
    bvh a = bvi.a;
    private Boolean b;
    private Boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bvf(bql bqlVar) {
        super(bqlVar);
        blk.a(bqlVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String d() {
        return blk.d.a(null);
    }

    public final int a(String str) {
        return b(str, blk.r);
    }

    public final boolean e() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    ApplicationInfo applicationInfo = m().getApplicationInfo();
                    String a = aef.a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.c = Boolean.valueOf(str != null && str.equals(a));
                    }
                    if (this.c == null) {
                        this.c = Boolean.TRUE;
                        q().c.a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.c.booleanValue();
    }

    public final long a(String str, bow<Long> bowVar) {
        if (str == null) {
            return bowVar.a(null).longValue();
        }
        String a = this.a.a(str, bowVar.a);
        if (TextUtils.isEmpty(a)) {
            return bowVar.a(null).longValue();
        }
        try {
            return bowVar.a(Long.valueOf(Long.parseLong(a))).longValue();
        } catch (NumberFormatException unused) {
            return bowVar.a(null).longValue();
        }
    }

    public final int b(String str, bow<Integer> bowVar) {
        if (str == null) {
            return bowVar.a(null).intValue();
        }
        String a = this.a.a(str, bowVar.a);
        if (TextUtils.isEmpty(a)) {
            return bowVar.a(null).intValue();
        }
        try {
            return bowVar.a(Integer.valueOf(Integer.parseInt(a))).intValue();
        } catch (NumberFormatException unused) {
            return bowVar.a(null).intValue();
        }
    }

    public final double c(String str, bow<Double> bowVar) {
        if (str == null) {
            return bowVar.a(null).doubleValue();
        }
        String a = this.a.a(str, bowVar.a);
        if (TextUtils.isEmpty(a)) {
            return bowVar.a(null).doubleValue();
        }
        try {
            return bowVar.a(Double.valueOf(Double.parseDouble(a))).doubleValue();
        } catch (NumberFormatException unused) {
            return bowVar.a(null).doubleValue();
        }
    }

    public final boolean d(String str, bow<Boolean> bowVar) {
        if (str == null) {
            return bowVar.a(null).booleanValue();
        }
        String a = this.a.a(str, bowVar.a);
        if (TextUtils.isEmpty(a)) {
            return bowVar.a(null).booleanValue();
        }
        return bowVar.a(Boolean.valueOf(Boolean.parseBoolean(a))).booleanValue();
    }

    private final Bundle w() {
        try {
            if (m().getPackageManager() == null) {
                q().c.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a = aep.a(m()).a(m().getPackageName(), 128);
            if (a == null) {
                q().c.a("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return a.metaData;
        } catch (PackageManager.NameNotFoundException e) {
            q().c.a("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean b(String str) {
        aat.a(str);
        Bundle w = w();
        if (w == null) {
            q().c.a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (w.containsKey(str)) {
            return Boolean.valueOf(w.getBoolean(str));
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.String> c(java.lang.String r4) {
        /*
            r3 = this;
            defpackage.aat.a(r4)
            android.os.Bundle r0 = r3.w()
            r1 = 0
            if (r0 != 0) goto L17
            bpi r4 = r3.q()
            bpk r4 = r4.c
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L15:
            r4 = r1
            goto L26
        L17:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L1e
            goto L15
        L1e:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L26:
            if (r4 != 0) goto L29
            return r1
        L29:
            android.content.Context r0 = r3.m()     // Catch: android.content.res.Resources.NotFoundException -> L41
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L41
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L41
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L41
            if (r4 != 0) goto L3c
            return r1
        L3c:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L41
            return r4
        L41:
            r4 = move-exception
            bpi r0 = r3.q()
            bpk r0 = r0.c
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.a(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvf.c(java.lang.String):java.util.List");
    }

    public final boolean f() {
        Boolean b = b("firebase_analytics_collection_deactivated");
        return b != null && b.booleanValue();
    }

    public final Boolean g() {
        Boolean b = b("google_analytics_adid_collection_enabled");
        return Boolean.valueOf(b == null || b.booleanValue());
    }

    public static long h() {
        return blk.G.a(null).longValue();
    }

    public static long i() {
        return blk.g.a(null).longValue();
    }

    public final String j() {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, "debug.firebase.analytics.app", "");
        } catch (ClassNotFoundException e) {
            q().c.a("Could not find SystemProperties class", e);
            return "";
        } catch (IllegalAccessException e2) {
            q().c.a("Could not access SystemProperties.get()", e2);
            return "";
        } catch (NoSuchMethodException e3) {
            q().c.a("Could not find SystemProperties.get() method", e3);
            return "";
        } catch (InvocationTargetException e4) {
            q().c.a("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    public static boolean t() {
        return blk.c.a(null).booleanValue();
    }

    public final boolean d(String str) {
        return "1".equals(this.a.a(str, "gaia_collection_enabled"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e(String str) {
        return d(str, blk.R);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f(String str) {
        return d(str, blk.S);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g(String str) {
        return d(str, blk.V);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean u() {
        if (this.b == null) {
            Boolean b = b("app_measurement_lite");
            this.b = b;
            if (b == null) {
                this.b = Boolean.FALSE;
            }
        }
        return this.b.booleanValue() || !this.w.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean v() {
        return blk.W.a(null).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h(String str) {
        return d(str, blk.X);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i(String str) {
        return d(str, blk.Y);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean j(String str) {
        return d(str, blk.aa);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k(String str) {
        return d(str, blk.af);
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
