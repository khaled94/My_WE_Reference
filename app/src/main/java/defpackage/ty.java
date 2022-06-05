package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: ty  reason: default package */
/* loaded from: classes2.dex */
final class ty extends tr {
    final /* synthetic */ tz a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ty(tz tzVar) {
        this.a = tzVar;
    }

    @Override // defpackage.tr, defpackage.ug
    public final void a(Status status) throws RemoteException {
        this.a.a((tz) status);
    }
}
