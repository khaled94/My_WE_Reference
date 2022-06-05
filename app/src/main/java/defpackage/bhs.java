package defpackage;

import android.os.RemoteException;
import defpackage.bik;
import defpackage.vc;
import java.util.Arrays;
import java.util.List;

/* renamed from: bhs  reason: default package */
/* loaded from: classes2.dex */
final class bhs extends bik.d<bhu> {
    private final /* synthetic */ String[] g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhs(vc vcVar, vf vfVar, String[] strArr) {
        super(vcVar, vfVar);
        this.g = strArr;
    }

    @Override // defpackage.vq.a
    public final /* synthetic */ void a(vc.b bVar) throws RemoteException {
        bhu bhuVar = (bhu) bVar;
        List<String> asList = Arrays.asList(this.g);
        bik bikVar = new bik(this);
        aat.a(bikVar, "callback == null");
        ((bhx) bhuVar.q()).a(asList, bhuVar.a, bikVar);
    }
}
