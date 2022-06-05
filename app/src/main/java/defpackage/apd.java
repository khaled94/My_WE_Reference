package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import defpackage.bbb;

/* renamed from: apd  reason: default package */
/* loaded from: classes.dex */
public final class apd extends bbb.a {
    private final /* synthetic */ Bundle c;
    private final /* synthetic */ bbb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apd(bbb bbbVar, Bundle bundle) {
        super(bbbVar);
        this.d = bbbVar;
        this.c = bundle;
    }

    @Override // defpackage.bbb.a
    final void a() throws RemoteException {
        axz axzVar;
        axzVar = this.d.r;
        axzVar.setConditionalUserProperty(this.c, this.a);
    }
}
