package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import defpackage.apv;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bsr  reason: default package */
/* loaded from: classes2.dex */
public final class bsr extends buk {
    public bsr(buj bujVar) {
        super(bujVar);
    }

    @Override // defpackage.buk
    protected final boolean d() {
        return false;
    }

    public final byte[] a(bli bliVar, String str) {
        bus busVar;
        Bundle bundle;
        long j;
        ble bleVar;
        c();
        bql.s();
        aat.a(bliVar);
        aat.a(str);
        if (!s().d(str, blk.am)) {
            q().j.a("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        } else if (!"_iap".equals(bliVar.a) && !"_iapx".equals(bliVar.a)) {
            q().j.a("Generating a payload for this event is not available. package_name, event_name", str, bliVar.a);
            return null;
        } else {
            apv.f.a a = apv.f.a();
            h().e();
            try {
                bqb b = h().b(str);
                if (b == null) {
                    q().j.a("Log and bundle not available. package_name", str);
                    return new byte[0];
                } else if (!b.o()) {
                    q().j.a("Log and bundle disabled. package_name", str);
                    return new byte[0];
                } else {
                    apv.g.a a2 = apv.g.c().a().a("android");
                    if (!TextUtils.isEmpty(b.a())) {
                        a2.f(b.a());
                    }
                    if (!TextUtils.isEmpty(b.k())) {
                        a2.e(b.k());
                    }
                    if (!TextUtils.isEmpty(b.i())) {
                        a2.g(b.i());
                    }
                    if (b.j() != -2147483648L) {
                        a2.f((int) b.j());
                    }
                    a2.f(b.l()).j(b.n());
                    if (!TextUtils.isEmpty(b.c())) {
                        a2.k(b.c());
                    } else if (!TextUtils.isEmpty(b.d())) {
                        a2.n(b.d());
                    }
                    a2.g(b.m());
                    if (this.w.r() && bvf.t() && s().d(a2.k()) && !TextUtils.isEmpty(null)) {
                        a2.p();
                    }
                    Pair<String, Boolean> a3 = r().a(b.a());
                    if (b.v() && !TextUtils.isEmpty((CharSequence) a3.first)) {
                        Object obj = a3.first;
                        Long.toString(bliVar.d);
                        a2.h(e());
                        if (a3.second != null) {
                            a2.a(((Boolean) a3.second).booleanValue());
                        }
                    }
                    k().w();
                    apv.g.a c = a2.c(Build.MODEL);
                    k().w();
                    c.b(Build.VERSION.RELEASE).d((int) k().m_()).d(k().f());
                    b.b();
                    Long.toString(bliVar.d);
                    a2.i(e());
                    if (!TextUtils.isEmpty(b.f())) {
                        a2.l(b.f());
                    }
                    String a4 = b.a();
                    List<bus> a5 = h().a(a4);
                    Iterator<bus> it = a5.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            busVar = null;
                            break;
                        }
                        busVar = it.next();
                        if ("_lte".equals(busVar.c)) {
                            break;
                        }
                    }
                    if (busVar == null || busVar.e == null) {
                        bus busVar2 = new bus(a4, "auto", "_lte", l().a(), 0L);
                        a5.add(busVar2);
                        h().a(busVar2);
                    }
                    if (s().d(a4, blk.ah)) {
                        bur f = f();
                        f.q().k.a("Checking account type status for ad personalization signals");
                        if (f.k().h()) {
                            String a6 = b.a();
                            if (b.v() && f.i().e(a6)) {
                                f.q().j.a("Turning off ad personalization due to account type");
                                Iterator<bus> it2 = a5.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if ("_npa".equals(it2.next().c)) {
                                        it2.remove();
                                        break;
                                    }
                                }
                                a5.add(new bus(a6, "auto", "_npa", f.l().a(), 1L));
                            }
                        }
                    }
                    apv.k[] kVarArr = new apv.k[a5.size()];
                    for (int i = 0; i < a5.size(); i++) {
                        apv.k.a a7 = apv.k.e().a(a5.get(i).c).a(a5.get(i).d);
                        f().a(a7, a5.get(i).e);
                        kVarArr[i] = (apv.k) ((ata) a7.v());
                    }
                    a2.b(Arrays.asList(kVarArr));
                    Bundle a8 = bliVar.b.a();
                    a8.putLong("_c", 1L);
                    q().j.a("Marking in-app purchase as real-time");
                    a8.putLong("_r", 1L);
                    a8.putString("_o", bliVar.c);
                    if (o().f(a2.k())) {
                        o().a(a8, "_dbg", (Object) 1L);
                        o().a(a8, "_r", (Object) 1L);
                    }
                    ble a9 = h().a(str, bliVar.a);
                    if (a9 == null) {
                        bundle = a8;
                        bleVar = new ble(str, bliVar.a, 0L, 0L, bliVar.d);
                        j = 0;
                    } else {
                        bundle = a8;
                        j = a9.f;
                        bleVar = a9.a(bliVar.d);
                    }
                    h().a(bleVar);
                    ble bleVar2 = bleVar;
                    blf blfVar = new blf(this.w, bliVar.c, str, bliVar.a, bliVar.d, j, bundle);
                    apv.c.a b2 = apv.c.c().a(blfVar.c).a(blfVar.b).b(blfVar.d);
                    Iterator<String> it3 = blfVar.e.iterator();
                    while (it3.hasNext()) {
                        String next = it3.next();
                        apv.e.a a10 = apv.e.d().a(next);
                        f().a(a10, blfVar.e.a(next));
                        b2.a(a10);
                    }
                    a2.a(b2).a(apv.h.a().a(apv.d.a().a(bleVar2.c).a(bliVar.a)));
                    a2.c(g().a(b.a(), Collections.emptyList(), a2.e()));
                    if (b2.d()) {
                        a2.b(b2.e()).c(b2.e());
                    }
                    long h = b.h();
                    int i2 = (h > 0L ? 1 : (h == 0L ? 0 : -1));
                    if (i2 != 0) {
                        a2.e(h);
                    }
                    long g = b.g();
                    if (g != 0) {
                        a2.d(g);
                    } else if (i2 != 0) {
                        a2.d(h);
                    }
                    b.s();
                    a2.e((int) b.p()).l().a(l().a()).b(true);
                    a.a(a2);
                    b.a(a2.g());
                    b.b(a2.h());
                    h().a(b);
                    h().v();
                    try {
                        return f().c(((apv.f) ((ata) a.v())).i());
                    } catch (IOException e) {
                        q().c.a("Data loss. Failed to bundle and serialize. appId", bpi.a(str), e);
                        return null;
                    }
                }
            } catch (SecurityException e2) {
                q().j.a("app instance id encryption failed", e2.getMessage());
                return new byte[0];
            } catch (SecurityException e3) {
                q().j.a("Resettable device id encryption failed", e3.getMessage());
                return new byte[0];
            } finally {
                h().w();
            }
        }
    }

    private static String e() {
        throw new SecurityException("This implementation should not be used.");
    }
}
