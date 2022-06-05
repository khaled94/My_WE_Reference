package defpackage;

import android.content.Context;
import java.util.List;

/* renamed from: bpa  reason: default package */
/* loaded from: classes2.dex */
public final class bpa extends brc {
    List<String> a;
    private String b;
    private String c;
    private int d;
    private String e;
    private String f;
    private long g;
    private long h;
    private long i;
    private int j;
    private String k;
    private String l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bpa(bql bqlVar, long j) {
        super(bqlVar);
        this.i = j;
    }

    @Override // defpackage.brc
    protected final boolean t() {
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:2|(1:4)(6:102|6|(1:9)(2:10|(1:12))|98|13|(24:15|(1:17)(1:18)|100|19|23|(1:28)(1:27)|29|(1:34)(1:33)|35|(1:(1:38)(1:39))|(2:41|(2:43|(1:45))(1:(1:(13:56|58|(1:62)|104|63|(1:65)(1:66)|67|(1:69)|(1:71)|74|(3:76|(3:78|(1:80)(3:82|(3:85|(1:107)|83)|106)|81)(0)|(1:88))|89|(1:(2:92|93)(2:94|95))(2:96|97))(1:55))(2:49|(1:51))))|57|58|(2:60|62)|104|63|(0)(0)|67|(0)|(0)|74|(0)|89|(0)(0)))|5|23|(1:25)|28|29|(1:31)|34|35|(0)|(0)|57|58|(0)|104|63|(0)(0)|67|(0)|(0)|74|(0)|89|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01aa, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01ab, code lost:
        q().c.a("getGoogleAppId or isMeasurementEnabled failed with exception. appId", defpackage.bpi.a(r0), r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0187 A[Catch: IllegalStateException -> 0x01aa, TryCatch #3 {IllegalStateException -> 0x01aa, blocks: (B:63:0x0173, B:67:0x017f, B:69:0x0187, B:71:0x019a), top: B:104:0x0173 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019a A[Catch: IllegalStateException -> 0x01aa, TRY_LEAVE, TryCatch #3 {IllegalStateException -> 0x01aa, blocks: (B:63:0x0173, B:67:0x017f, B:69:0x0187, B:71:0x019a), top: B:104:0x0173 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0221  */
    @Override // defpackage.brc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void u() {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpa.u():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bva a(String str) {
        long j;
        long j2;
        Boolean b;
        c();
        String v = v();
        String w = w();
        B();
        String str2 = this.c;
        long y = y();
        B();
        String str3 = this.e;
        B();
        c();
        if (this.g == 0) {
            this.g = this.w.e().a(m(), m().getPackageName());
        }
        long j3 = this.g;
        boolean r = this.w.r();
        boolean z = !r().t;
        c();
        String E = !this.w.r() ? null : E();
        B();
        long j4 = this.h;
        bql bqlVar = this.w;
        Long valueOf = Long.valueOf(bqlVar.b().i.a());
        if (valueOf.longValue() == 0) {
            j2 = j4;
            j = bqlVar.k;
        } else {
            j2 = j4;
            j = Math.min(bqlVar.k, valueOf.longValue());
        }
        int z2 = z();
        boolean booleanValue = s().g().booleanValue();
        Boolean b2 = s().b("google_analytics_ssaid_collection_enabled");
        boolean z3 = b2 == null || b2.booleanValue();
        bpq r2 = r();
        r2.c();
        return new bva(v, w, str2, y, str3, 16250L, j3, str, r, z, E, j2, j, z2, booleanValue, z3, r2.f().getBoolean("deferred_analytics_collection", false), x(), (!s().d(v(), blk.ah) || (b = s().b("google_analytics_default_allow_ad_personalization_signals")) == null) ? null : Boolean.valueOf(!b.booleanValue()), this.i, s().d(v(), blk.au) ? this.a : null);
    }

    private final String E() {
        try {
            Class<?> loadClass = m().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (loadClass == null) {
                return null;
            }
            try {
                Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, m());
                if (invoke == null) {
                    return null;
                }
                try {
                    return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                } catch (Exception unused) {
                    q().h.a("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                q().g.a("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String v() {
        B();
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String w() {
        B();
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String x() {
        B();
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int y() {
        B();
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int z() {
        B();
        return this.j;
    }

    @Override // defpackage.boc, defpackage.bri
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // defpackage.boc, defpackage.bri
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // defpackage.boc, defpackage.bri
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // defpackage.boc
    public final /* bridge */ /* synthetic */ bkz d() {
        return super.d();
    }

    @Override // defpackage.boc
    public final /* bridge */ /* synthetic */ brs e() {
        return super.e();
    }

    @Override // defpackage.boc
    public final /* bridge */ /* synthetic */ bpa f() {
        return super.f();
    }

    @Override // defpackage.boc
    public final /* bridge */ /* synthetic */ bsx g() {
        return super.g();
    }

    @Override // defpackage.boc
    public final /* bridge */ /* synthetic */ bss h() {
        return super.h();
    }

    @Override // defpackage.boc
    public final /* bridge */ /* synthetic */ bpe i() {
        return super.i();
    }

    @Override // defpackage.boc
    public final /* bridge */ /* synthetic */ bty j() {
        return super.j();
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
