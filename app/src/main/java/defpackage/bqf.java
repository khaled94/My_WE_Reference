package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import defpackage.apn;
import defpackage.apt;
import defpackage.ata;
import java.io.IOException;
import java.util.Map;

/* renamed from: bqf  reason: default package */
/* loaded from: classes2.dex */
public final class bqf extends buk implements bvh {
    private static int a = 65535;
    private static int c = 2;
    private final Map<String, Map<String, String>> d = new ArrayMap();
    private final Map<String, Map<String, Boolean>> e = new ArrayMap();
    private final Map<String, Map<String, Boolean>> f = new ArrayMap();
    private final Map<String, apz> g = new ArrayMap();
    private final Map<String, String> i = new ArrayMap();
    private final Map<String, Map<String, Integer>> h = new ArrayMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public bqf(buj bujVar) {
        super(bujVar);
    }

    @Override // defpackage.buk
    protected final boolean d() {
        return false;
    }

    private final void i(String str) {
        t();
        c();
        aat.a(str);
        if (this.g.get(str) == null) {
            byte[] d = h().d(str);
            if (d == null) {
                this.d.put(str, null);
                this.e.put(str, null);
                this.f.put(str, null);
                this.g.put(str, null);
                this.i.put(str, null);
                this.h.put(str, null);
                return;
            }
            apz a2 = a(str, d);
            this.d.put(str, a(a2));
            a(str, a2);
            this.g.put(str, a2);
            this.i.put(str, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final apz a(String str) {
        t();
        c();
        aat.a(str);
        i(str);
        return this.g.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String b(String str) {
        c();
        return this.i.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(String str) {
        c();
        this.i.put(str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(String str) {
        c();
        this.g.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e(String str) {
        Boolean bool;
        c();
        apz a2 = a(str);
        if (a2 == null || (bool = a2.f) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // defpackage.bvh
    public final String a(String str, String str2) {
        c();
        i(str);
        Map<String, String> map = this.d.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    private static Map<String, String> a(apz apzVar) {
        apt.a[] aVarArr;
        ArrayMap arrayMap = new ArrayMap();
        if (apzVar != null && apzVar.c != null) {
            for (apt.a aVar : apzVar.c) {
                if (aVar != null) {
                    arrayMap.put(aVar.zzvy, aVar.zzvz);
                }
            }
        }
        return arrayMap;
    }

    private final void a(String str, apz apzVar) {
        aqa[] aqaVarArr;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        if (apzVar != null && apzVar.d != null) {
            for (aqa aqaVar : apzVar.d) {
                if (TextUtils.isEmpty(aqaVar.a)) {
                    q().f.a("EventConfig contained null event name");
                } else {
                    String a2 = brm.a(aqaVar.a);
                    if (!TextUtils.isEmpty(a2)) {
                        aqaVar.a = a2;
                    }
                    arrayMap.put(aqaVar.a, aqaVar.b);
                    arrayMap2.put(aqaVar.a, aqaVar.c);
                    if (aqaVar.d != null) {
                        if (aqaVar.d.intValue() < c || aqaVar.d.intValue() > a) {
                            q().f.a("Invalid sampling rate. Event name, sample rate", aqaVar.a, aqaVar.d);
                        } else {
                            arrayMap3.put(aqaVar.a, aqaVar.d);
                        }
                    }
                }
            }
        }
        this.e.put(str, arrayMap);
        this.f.put(str, arrayMap2);
        this.h.put(str, arrayMap3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a(String str, byte[] bArr, String str2) {
        byte[] bArr2;
        ContentValues contentValues;
        boolean z;
        t();
        c();
        aat.a(str);
        apz a2 = a(str, bArr);
        a(str, a2);
        this.g.put(str, a2);
        this.i.put(str, str2);
        this.d.put(str, a(a2));
        bvc g = g();
        apy[] apyVarArr = a2.e;
        aat.a(apyVarArr);
        for (apy apyVar : apyVarArr) {
            if (apyVar.c != null) {
                for (int i = 0; i < apyVar.c.length; i++) {
                    apn.a.C0013a n = apyVar.c[i].n();
                    apn.a.C0013a c0013a = (apn.a.C0013a) ((ata.a) n.clone());
                    String a3 = brm.a(n.a());
                    if (a3 != null) {
                        c0013a.a(a3);
                        z = true;
                    } else {
                        z = false;
                    }
                    for (int i2 = 0; i2 < n.b(); i2++) {
                        apn.b a4 = n.a(i2);
                        String a5 = brl.a(a4.zzus);
                        if (a5 != null) {
                            c0013a.a(i2, (apn.b) ((ata) a4.n().a(a5).v()));
                            z = true;
                        }
                    }
                    if (z) {
                        apyVar.c[i] = (apn.a) ((ata) c0013a.v());
                    }
                }
            }
            if (apyVar.b != null) {
                for (int i3 = 0; i3 < apyVar.b.length; i3++) {
                    apn.d dVar = apyVar.b[i3];
                    String a6 = bro.a(dVar.zzvh);
                    if (a6 != null) {
                        apyVar.b[i3] = (apn.d) ((ata) dVar.n().a(a6).v());
                    }
                }
            }
        }
        g.h().a(str, apyVarArr);
        try {
            a2.e = null;
            int d = a2.d();
            bArr2 = new byte[d];
            a2.a(new awn(bArr2, d));
        } catch (IOException e) {
            q().f.a("Unable to serialize reduced-size config. Storing full config instead. appId", bpi.a(str), e);
            bArr2 = bArr;
        }
        bvk h = h();
        aat.a(str);
        h.c();
        h.t();
        new ContentValues().put("remote_config", bArr2);
        try {
            if (h.x().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                h.q().c.a("Failed to update remote config (got 0). appId", bpi.a(str));
            }
        } catch (SQLiteException e2) {
            h.q().c.a("Error storing remote config. appId", bpi.a(str), e2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(String str, String str2) {
        Boolean bool;
        c();
        i(str);
        if (!g(str) || !buv.e(str2)) {
            if (h(str) && buv.a(str2)) {
                return true;
            }
            Map<String, Boolean> map = this.e.get(str);
            if (map != null && (bool = map.get(str2)) != null) {
                return bool.booleanValue();
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(String str, String str2) {
        Boolean bool;
        c();
        i(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f.get(str);
        if (map != null && (bool = map.get(str2)) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d(String str, String str2) {
        Integer num;
        c();
        i(str);
        Map<String, Integer> map = this.h.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long f(String str) {
        String a2 = a(str, "measurement.account.time_zone_offset_minutes");
        if (!TextUtils.isEmpty(a2)) {
            try {
                return Long.parseLong(a2);
            } catch (NumberFormatException e) {
                q().f.a("Unable to parse timezone offset. appId", bpi.a(str), e);
                return 0L;
            }
        }
        return 0L;
    }

    private final apz a(String str, byte[] bArr) {
        if (bArr == null) {
            return new apz();
        }
        awl a2 = awl.a(bArr, bArr.length);
        apz apzVar = new apz();
        try {
            apzVar.a(a2);
            q().k.a("Parsed config. version, gmp_app_id", apzVar.a, apzVar.b);
            return apzVar;
        } catch (IOException e) {
            q().f.a("Unable to merge remote config. appId", bpi.a(str), e);
            return new apz();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_internal"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_public"));
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
