package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cjh  reason: default package */
/* loaded from: classes2.dex */
public final class cjh extends cix {
    final /* synthetic */ cjf a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cjh(cjf cjfVar) {
        this.a = cjfVar;
    }

    @Override // defpackage.ciw
    public final void a(alf alfVar) throws RemoteException {
        boolean z = true;
        if (this.a.a != 1) {
            z = false;
        }
        int i = this.a.a;
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unexpected response type: ");
        sb.append(i);
        aat.b(z, sb.toString());
        this.a.j = alfVar;
        cjf.a(this.a);
    }

    @Override // defpackage.ciw
    public final void a(alf alfVar, ald aldVar) throws RemoteException {
        boolean z = this.a.a == 2;
        int i = this.a.a;
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unexpected response type: ");
        sb.append(i);
        aat.b(z, sb.toString());
        this.a.j = alfVar;
        this.a.k = aldVar;
        cjf.a(this.a);
    }

    @Override // defpackage.ciw
    public final void a(alb albVar) throws RemoteException {
        boolean z = this.a.a == 3;
        int i = this.a.a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        aat.b(z, sb.toString());
        this.a.l = albVar;
        cjf.a(this.a);
    }

    @Override // defpackage.ciw
    public final void a(alo aloVar) throws RemoteException {
        boolean z = this.a.a == 4;
        int i = this.a.a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        aat.b(z, sb.toString());
        this.a.m = aloVar;
        cjf.a(this.a);
    }

    @Override // defpackage.ciw
    public final void a() throws RemoteException {
        boolean z = this.a.a == 5;
        int i = this.a.a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        aat.b(z, sb.toString());
        cjf.a(this.a);
    }

    @Override // defpackage.ciw
    public final void b() throws RemoteException {
        boolean z = this.a.a == 6;
        int i = this.a.a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        aat.b(z, sb.toString());
        cjf.a(this.a);
    }

    @Override // defpackage.ciw
    public final void a(String str) throws RemoteException {
        boolean z = this.a.a == 7;
        int i = this.a.a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        aat.b(z, sb.toString());
        this.a.n = str;
        cjf.a(this.a);
    }

    @Override // defpackage.ciw
    public final void b(String str) throws RemoteException {
        boolean z = this.a.a == 8;
        int i = this.a.a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        aat.b(z, sb.toString());
        this.a.o = str;
        a(new cjg(str));
    }

    @Override // defpackage.ciw
    public final void a(chs chsVar) throws RemoteException {
        boolean z = this.a.a == 8;
        int i = this.a.a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        aat.b(z, sb.toString());
        this.a.u = true;
        this.a.v = true;
        a(new cjj(chsVar));
    }

    @Override // defpackage.ciw
    public final void c(String str) throws RemoteException {
        boolean z = this.a.a == 8;
        int i = this.a.a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        aat.b(z, sb.toString());
        this.a.o = str;
        this.a.u = true;
        this.a.v = true;
        a(new cji(str));
    }

    @Override // defpackage.ciw
    public final void a(Status status) throws RemoteException {
        if (this.a.a != 8) {
            cjf.a(this.a, status);
            this.a.a(status);
            return;
        }
        this.a.u = true;
        this.a.v = false;
        a(new cjl(status));
    }

    @Override // defpackage.ciw
    public final void a(Status status, chs chsVar) throws RemoteException {
        boolean z = this.a.a == 2;
        int i = this.a.a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        aat.b(z, sb.toString());
        a(status, chsVar, null, null);
    }

    @Override // defpackage.ciw
    public final void a(ala alaVar) {
        this.a.s = alaVar;
        this.a.a(ckx.a("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    private final void a(Status status, chh chhVar, String str, String str2) {
        cjf.a(this.a, status);
        this.a.p = chhVar;
        this.a.q = str;
        this.a.r = str2;
        if (this.a.f != null) {
            this.a.f.a(status);
        }
        this.a.a(status);
    }

    @Override // defpackage.ciw
    public final void c() throws RemoteException {
        boolean z = this.a.a == 9;
        int i = this.a.a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("Unexpected response type ");
        sb.append(i);
        aat.b(z, sb.toString());
        cjf.a(this.a);
    }

    private final void a(cjn cjnVar) {
        this.a.i.execute(new cjk(this, cjnVar));
    }

    @Override // defpackage.ciw
    public final void a(akx akxVar) {
        a(akxVar.a, akxVar.b, akxVar.c, akxVar.d);
    }
}
