package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: tw  reason: default package */
/* loaded from: classes2.dex */
final class tw extends tr {
    final /* synthetic */ tx a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public tw(tx txVar) {
        this.a = txVar;
    }

    @Override // defpackage.tr, defpackage.ug
    public final void b(Status status) throws RemoteException {
        this.a.a((tx) status);
    }
}
