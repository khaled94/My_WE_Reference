package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import defpackage.vc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: tz  reason: default package */
/* loaded from: classes2.dex */
public final class tz extends ua {
    /* JADX INFO: Access modifiers changed from: package-private */
    public tz(vf vfVar) {
        super(vfVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ vi a(Status status) {
        return status;
    }

    @Override // defpackage.vq.a
    public final /* synthetic */ void a(vc.b bVar) throws RemoteException {
        tv tvVar = (tv) bVar;
        ((uh) tvVar.q()).a(new ty(this), tvVar.a);
    }
}
