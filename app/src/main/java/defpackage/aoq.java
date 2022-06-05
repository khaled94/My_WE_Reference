package defpackage;

import android.os.RemoteException;
import defpackage.bbb;

/* renamed from: aoq  reason: default package */
/* loaded from: classes.dex */
public final class aoq extends bbb.a {
    private final /* synthetic */ String c;
    private final /* synthetic */ bbb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoq(bbb bbbVar, String str) {
        super(bbbVar);
        this.d = bbbVar;
        this.c = str;
    }

    @Override // defpackage.bbb.a
    final void a() throws RemoteException {
        axz axzVar;
        axzVar = this.d.r;
        axzVar.endAdUnitExposure(this.c, this.b);
    }
}
