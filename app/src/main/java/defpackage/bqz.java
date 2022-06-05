package defpackage;

import android.text.TextUtils;

/* renamed from: bqz  reason: default package */
/* loaded from: classes2.dex */
final class bqz implements Runnable {
    private final /* synthetic */ bli a;
    private final /* synthetic */ bva b;
    private final /* synthetic */ bqm c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bqz(bqm bqmVar, bli bliVar, bva bvaVar) {
        this.c = bqmVar;
        this.a = bliVar;
        this.b = bvaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        buj bujVar;
        buj bujVar2;
        bqm bqmVar = this.c;
        bli bliVar = this.a;
        bva bvaVar = this.b;
        boolean z = false;
        if ("_cmp".equals(bliVar.a) && bliVar.b != null && bliVar.b.a.size() != 0) {
            String d = bliVar.b.d("_cis");
            if (!TextUtils.isEmpty(d) && (("referrer broadcast".equals(d) || "referrer API".equals(d)) && bqmVar.a.b.e.g(bvaVar.a))) {
                z = true;
            }
        }
        if (z) {
            bqmVar.a.q().i.a("Event has been filtered ", bliVar.toString());
            bliVar = new bli("_cmpx", bliVar.b, bliVar.c, bliVar.d);
        }
        bujVar = this.c.a;
        bujVar.k();
        bujVar2 = this.c.a;
        bujVar2.a(bliVar, this.b);
    }
}
