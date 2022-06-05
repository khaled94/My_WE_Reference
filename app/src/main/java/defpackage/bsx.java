package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bsx  reason: default package */
/* loaded from: classes2.dex */
public final class bsx extends brc {
    boz b;
    volatile Boolean c;
    private final bla d;
    private final bug e;
    private final bla g;
    private final List<Runnable> f = new ArrayList();
    final btp a = new btp(this);

    /* JADX INFO: Access modifiers changed from: protected */
    public bsx(bql bqlVar) {
        super(bqlVar);
        this.e = new bug(bqlVar.l());
        this.d = new bsw(this, bqlVar);
        this.g = new bth(this, bqlVar);
    }

    @Override // defpackage.brc
    protected final boolean t() {
        return false;
    }

    public final boolean v() {
        c();
        B();
        return this.b != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w() {
        c();
        B();
        a(new btg(this, a(true)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boz bozVar, abb abbVar, bva bvaVar) {
        int i;
        c();
        B();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List<abb> w = i().w();
            if (w != null) {
                arrayList.addAll(w);
                i = w.size();
            } else {
                i = 0;
            }
            if (abbVar != null && i < 100) {
                arrayList.add(abbVar);
            }
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                abb abbVar2 = (abb) obj;
                if (abbVar2 instanceof bli) {
                    try {
                        bozVar.a((bli) abbVar2, bvaVar);
                    } catch (RemoteException e) {
                        q().c.a("Failed to send event to the service", e);
                    }
                } else if (abbVar2 instanceof buq) {
                    try {
                        bozVar.a((buq) abbVar2, bvaVar);
                    } catch (RemoteException e2) {
                        q().c.a("Failed to send attribute to the service", e2);
                    }
                } else if (abbVar2 instanceof bvd) {
                    try {
                        bozVar.a((bvd) abbVar2, bvaVar);
                    } catch (RemoteException e3) {
                        q().c.a("Failed to send conditional property to the service", e3);
                    }
                } else {
                    q().c.a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(bli bliVar, String str) {
        boolean z;
        aat.a(bliVar);
        c();
        B();
        bpe i = i();
        Parcel obtain = Parcel.obtain();
        bliVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            i.q().f.a("Event is too long for local database. Sending event directly to service");
            z = false;
        } else {
            z = i.a(0, marshall);
        }
        a(new btj(this, z, bliVar, a(true), str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(bvd bvdVar) {
        boolean z;
        aat.a(bvdVar);
        c();
        B();
        bpe i = i();
        i.o();
        byte[] a = buv.a((Parcelable) bvdVar);
        if (a.length > 131072) {
            i.q().f.a("Conditional user property too long for local database. Sending directly to service");
            z = false;
        } else {
            z = i.a(2, a);
        }
        a(new bti(this, z, new bvd(bvdVar), a(true), bvdVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(AtomicReference<List<bvd>> atomicReference, String str, String str2, String str3) {
        c();
        B();
        a(new btl(this, atomicReference, str, str2, str3, a(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(bas basVar, String str, String str2) {
        c();
        B();
        a(new btk(this, str, str2, a(false), basVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(AtomicReference<List<buq>> atomicReference, String str, String str2, String str3, boolean z) {
        c();
        B();
        a(new btn(this, atomicReference, str, str2, str3, z, a(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(bas basVar, String str, String str2, boolean z) {
        c();
        B();
        a(new btm(this, str, str2, z, a(false), basVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(buq buqVar) {
        c();
        B();
        bpe i = i();
        Parcel obtain = Parcel.obtain();
        boolean z = false;
        buqVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            i.q().f.a("User property too long for local database. Sending directly to service");
        } else {
            z = i.a(1, marshall);
        }
        a(new bsy(this, z, buqVar, a(true)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x() {
        c();
        B();
        bva a = a(false);
        i().v();
        a(new bta(this, a));
    }

    public final void a(AtomicReference<String> atomicReference) {
        c();
        B();
        a(new bsz(this, atomicReference, a(false)));
    }

    public final void a(bas basVar) {
        c();
        B();
        a(new btd(this, a(false), basVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void y() {
        c();
        B();
        bva a = a(true);
        boolean d = s().d(null, blk.aA);
        if (d) {
            i().a(3, new byte[0]);
        }
        a(new btc(this, a, d));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(bst bstVar) {
        c();
        B();
        a(new btf(this, bstVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void z() {
        c();
        this.e.a();
        this.d.a(blk.J.a(null).longValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E() {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsx.E():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(boz bozVar) {
        c();
        aat.a(bozVar);
        this.b = bozVar;
        z();
        G();
    }

    public final void F() {
        c();
        B();
        btp btpVar = this.a;
        if (btpVar.b != null && (btpVar.b.j() || btpVar.b.k())) {
            btpVar.b.i();
        }
        btpVar.b = null;
        try {
            adt.a().a(m(), this.a);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.b = null;
    }

    private final void a(Runnable runnable) throws IllegalStateException {
        c();
        if (v()) {
            runnable.run();
        } else if (this.f.size() >= 1000) {
            q().c.a("Discarding data. Max runnable queue size reached");
        } else {
            this.f.add(runnable);
            this.g.a(60000L);
            E();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void G() {
        c();
        q().k.a("Processing queued up service tasks", Integer.valueOf(this.f.size()));
        for (Runnable runnable : this.f) {
            try {
                runnable.run();
            } catch (Exception e) {
                q().c.a("Task exception while flushing queue", e);
            }
        }
        this.f.clear();
        this.g.c();
    }

    private final bva a(boolean z) {
        return f().a(z ? q().n_() : null);
    }

    public final void a(bas basVar, bli bliVar, String str) {
        c();
        B();
        if (o().j() != 0) {
            q().f.a("Not bundling data. Service unavailable or out of date");
            o().a(basVar, new byte[0]);
            return;
        }
        a(new bte(this, bliVar, str, basVar));
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(bsx bsxVar, ComponentName componentName) {
        bsxVar.c();
        if (bsxVar.b != null) {
            bsxVar.b = null;
            bsxVar.q().k.a("Disconnected from device MeasurementService", componentName);
            bsxVar.c();
            bsxVar.E();
        }
    }
}
