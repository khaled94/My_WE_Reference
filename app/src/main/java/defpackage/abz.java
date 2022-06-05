package defpackage;

import com.google.android.gms.common.api.Status;
import defpackage.aas;
import defpackage.vg;
import java.util.concurrent.TimeUnit;

/* renamed from: abz  reason: default package */
/* loaded from: classes.dex */
final class abz implements vg.a {
    final /* synthetic */ vg a;
    final /* synthetic */ bwm b;
    final /* synthetic */ aas.a c;
    final /* synthetic */ acb d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abz(vg vgVar, bwm bwmVar, aas.a aVar, acb acbVar) {
        this.a = vgVar;
        this.b = bwmVar;
        this.c = aVar;
        this.d = acbVar;
    }

    @Override // defpackage.vg.a
    public final void a(Status status) {
        if (status.c()) {
            this.b.a((bwm) this.c.a(this.a.a(0L, TimeUnit.MILLISECONDS)));
            return;
        }
        this.b.a((Exception) aac.a(status));
    }
}
