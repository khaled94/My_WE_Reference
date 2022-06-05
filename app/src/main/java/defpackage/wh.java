package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import defpackage.vg;

/* renamed from: wh  reason: default package */
/* loaded from: classes2.dex */
final class wh implements vg.a {
    final /* synthetic */ BasePendingResult a;
    final /* synthetic */ wj b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public wh(wj wjVar, BasePendingResult basePendingResult) {
        this.b = wjVar;
        this.a = basePendingResult;
    }

    @Override // defpackage.vg.a
    public final void a(Status status) {
        this.b.a.remove(this.a);
    }
}
