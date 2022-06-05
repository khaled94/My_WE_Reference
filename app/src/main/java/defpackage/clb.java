package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: clb  reason: default package */
/* loaded from: classes2.dex */
public final class clb implements Runnable {
    final /* synthetic */ ckz a;
    private final String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public clb(ckz ckzVar, String str) {
        this.a = ckzVar;
        this.b = aat.a(str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        bwl bwlVar;
        adj adjVar;
        cgw a = cgw.a(this.b);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(a);
        cju.a(a.a());
        try {
            z = ((Boolean) ags.b().a(cju.a)).booleanValue();
        } catch (SecurityException unused) {
            z = true;
        }
        if (firebaseAuth.c == null || !z) {
            return;
        }
        chm chmVar = firebaseAuth.c;
        if (chmVar == null) {
            bwlVar = bwo.a((Exception) civ.a(new Status(17495)));
        } else {
            alf h = chmVar.h();
            h.d.longValue();
            h.c.longValue();
            aea.d().a();
            cif cifVar = firebaseAuth.b;
            cgw cgwVar = firebaseAuth.a;
            String str = h.a;
            clq clqVar = new clq(firebaseAuth);
            cih cihVar = (cih) new cih(str).a(cgwVar).a(chmVar).a((cjf<cho, cjq>) clqVar).a((clc) clqVar);
            bwlVar = cifVar.a(cifVar.a(cihVar), cihVar);
        }
        adjVar = ckz.a;
        adjVar.c("Token refreshing started", new Object[0]);
        bwlVar.a(new cla(this));
    }
}
