package defpackage;

import com.google.firebase.FirebaseNetworkException;

/* renamed from: cla  reason: default package */
/* loaded from: classes2.dex */
final class cla implements bwi {
    private final /* synthetic */ clb a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cla(clb clbVar) {
        this.a = clbVar;
    }

    @Override // defpackage.bwi
    public final void a(Exception exc) {
        adj adjVar;
        long j;
        if (exc instanceof FirebaseNetworkException) {
            adjVar = ckz.a;
            adjVar.c("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            ckz ckzVar = this.a.a;
            int i = (int) ckzVar.c;
            if (i == 30 || i == 60 || i == 120 || i == 240 || i == 480) {
                j = 2 * ckzVar.c;
            } else {
                j = i != 960 ? 30L : 960L;
            }
            ckzVar.c = j;
            ckzVar.b = aea.d().a() + (ckzVar.c * 1000);
            adj adjVar2 = ckz.a;
            long j2 = ckzVar.b;
            StringBuilder sb = new StringBuilder(43);
            sb.append("Scheduling refresh for ");
            sb.append(j2);
            adjVar2.c(sb.toString(), new Object[0]);
            ckzVar.d.postDelayed(ckzVar.e, ckzVar.c * 1000);
        }
    }
}
