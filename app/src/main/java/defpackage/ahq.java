package defpackage;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: ahq  reason: default package */
/* loaded from: classes.dex */
final class ahq extends ahw {
    final /* synthetic */ bwm a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ahq(bwm bwmVar) {
        this.a = bwmVar;
    }

    @Override // defpackage.ahx
    public final void a(Status status) {
        bwm bwmVar = this.a;
        if (status.c()) {
            bwmVar.a((bwm) null);
        } else {
            bwmVar.a((Exception) new ApiException(status));
        }
    }
}
