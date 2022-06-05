package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import defpackage.bbb;

/* renamed from: aoo  reason: default package */
/* loaded from: classes.dex */
public final class aoo extends bbb.a {
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ Bundle e;
    private final /* synthetic */ bbb f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoo(bbb bbbVar, String str, String str2, Bundle bundle) {
        super(bbbVar);
        this.f = bbbVar;
        this.c = str;
        this.d = str2;
        this.e = bundle;
    }

    @Override // defpackage.bbb.a
    final void a() throws RemoteException {
        axz axzVar;
        axzVar = this.f.r;
        axzVar.clearConditionalUserProperty(this.c, this.d, this.e);
    }
}
