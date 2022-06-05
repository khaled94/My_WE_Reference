package defpackage;

import android.os.Binder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: bqm  reason: default package */
/* loaded from: classes2.dex */
public final class bqm extends boy {
    final buj a;
    private Boolean b;
    private String c;

    public bqm(buj bujVar) {
        this(bujVar, (byte) 0);
    }

    private bqm(buj bujVar, byte b) {
        aat.a(bujVar);
        this.a = bujVar;
        this.c = null;
    }

    @Override // defpackage.boz
    public final void b(bva bvaVar) {
        e(bvaVar);
        a(new bqp(this, bvaVar));
    }

    @Override // defpackage.boz
    public final void a(bli bliVar, bva bvaVar) {
        aat.a(bliVar);
        e(bvaVar);
        a(new bqz(this, bliVar, bvaVar));
    }

    @Override // defpackage.boz
    public final void a(bli bliVar, String str, String str2) {
        aat.a(bliVar);
        aat.a(str);
        a(str, true);
        a(new bqy(this, bliVar, str));
    }

    @Override // defpackage.boz
    public final byte[] a(bli bliVar, String str) {
        aat.a(str);
        aat.a(bliVar);
        a(str, true);
        this.a.q().j.a("Log and bundle. event", this.a.b.f().a(bliVar.a));
        long c = this.a.l().c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.a.p().b(new brb(this, bliVar, str)).get();
            if (bArr == null) {
                this.a.q().c.a("Log and bundle returned null. appId", bpi.a(str));
                bArr = new byte[0];
            }
            this.a.q().j.a("Log and bundle processed. event, size, time_ms", this.a.b.f().a(bliVar.a), Integer.valueOf(bArr.length), Long.valueOf((this.a.l().c() / 1000000) - c));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.a.q().c.a("Failed to log and bundle. appId, event, error", bpi.a(str), this.a.b.f().a(bliVar.a), e);
            return null;
        }
    }

    @Override // defpackage.boz
    public final void a(buq buqVar, bva bvaVar) {
        aat.a(buqVar);
        e(bvaVar);
        if (buqVar.a() == null) {
            a(new bra(this, buqVar, bvaVar));
        } else {
            a(new bre(this, buqVar, bvaVar));
        }
    }

    @Override // defpackage.boz
    public final List<buq> a(bva bvaVar, boolean z) {
        e(bvaVar);
        try {
            List<bus> list = (List) this.a.p().a(new brd(this, bvaVar)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (bus busVar : list) {
                if (z || !buv.e(busVar.c)) {
                    arrayList.add(new buq(busVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.q().c.a("Failed to get user attributes. appId", bpi.a(bvaVar.a), e);
            return null;
        }
    }

    @Override // defpackage.boz
    public final void a(bva bvaVar) {
        e(bvaVar);
        a(new brg(this, bvaVar));
    }

    private final void e(bva bvaVar) {
        aat.a(bvaVar);
        a(bvaVar.a, false);
        this.a.b.e().c(bvaVar.b, bvaVar.r);
    }

    private final void a(String str, boolean z) {
        boolean z2;
        if (TextUtils.isEmpty(str)) {
            this.a.q().c.a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.b == null) {
                    if (!"com.google.android.gms".equals(this.c) && !aeh.a(this.a.m(), Binder.getCallingUid()) && !va.a(this.a.m()).a(Binder.getCallingUid())) {
                        z2 = false;
                        this.b = Boolean.valueOf(z2);
                    }
                    z2 = true;
                    this.b = Boolean.valueOf(z2);
                }
                if (this.b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                this.a.q().c.a("Measurement Service called with invalid calling package. appId", bpi.a(str));
                throw e;
            }
        }
        if (this.c == null && uz.uidHasPackageName(this.a.m(), Binder.getCallingUid(), str)) {
            this.c = str;
        }
        if (str.equals(this.c)) {
            return;
        }
        throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
    }

    @Override // defpackage.boz
    public final void a(long j, String str, String str2, String str3) {
        a(new brf(this, str2, str3, str, j));
    }

    @Override // defpackage.boz
    public final String c(bva bvaVar) {
        e(bvaVar);
        return this.a.d(bvaVar);
    }

    @Override // defpackage.boz
    public final void a(bvd bvdVar, bva bvaVar) {
        aat.a(bvdVar);
        aat.a(bvdVar.c);
        e(bvaVar);
        bvd bvdVar2 = new bvd(bvdVar);
        bvdVar2.a = bvaVar.a;
        if (bvdVar.c.a() == null) {
            a(new bqo(this, bvdVar2, bvaVar));
        } else {
            a(new bqr(this, bvdVar2, bvaVar));
        }
    }

    @Override // defpackage.boz
    public final void a(bvd bvdVar) {
        aat.a(bvdVar);
        aat.a(bvdVar.c);
        a(bvdVar.a, true);
        bvd bvdVar2 = new bvd(bvdVar);
        if (bvdVar.c.a() == null) {
            a(new bqq(this, bvdVar2));
        } else {
            a(new bqt(this, bvdVar2));
        }
    }

    @Override // defpackage.boz
    public final List<buq> a(String str, String str2, boolean z, bva bvaVar) {
        e(bvaVar);
        try {
            List<bus> list = (List) this.a.p().a(new bqs(this, bvaVar, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (bus busVar : list) {
                if (z || !buv.e(busVar.c)) {
                    arrayList.add(new buq(busVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.q().c.a("Failed to get user attributes. appId", bpi.a(bvaVar.a), e);
            return Collections.emptyList();
        }
    }

    @Override // defpackage.boz
    public final List<buq> a(String str, String str2, String str3, boolean z) {
        a(str, true);
        try {
            List<bus> list = (List) this.a.p().a(new bqv(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (bus busVar : list) {
                if (z || !buv.e(busVar.c)) {
                    arrayList.add(new buq(busVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.q().c.a("Failed to get user attributes. appId", bpi.a(str), e);
            return Collections.emptyList();
        }
    }

    @Override // defpackage.boz
    public final List<bvd> a(String str, String str2, bva bvaVar) {
        e(bvaVar);
        try {
            return (List) this.a.p().a(new bqu(this, bvaVar, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.q().c.a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @Override // defpackage.boz
    public final List<bvd> a(String str, String str2, String str3) {
        a(str, true);
        try {
            return (List) this.a.p().a(new bqx(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.q().c.a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @Override // defpackage.boz
    public final void d(bva bvaVar) {
        a(bvaVar.a, false);
        a(new bqw(this, bvaVar));
    }

    private final void a(Runnable runnable) {
        aat.a(runnable);
        if (this.a.p().f()) {
            runnable.run();
        } else {
            this.a.p().a(runnable);
        }
    }
}
