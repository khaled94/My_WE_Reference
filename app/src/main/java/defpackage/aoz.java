package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import defpackage.bbb;

/* renamed from: aoz  reason: default package */
/* loaded from: classes.dex */
public final class aoz extends bbb.a {
    private final /* synthetic */ String c;
    private final /* synthetic */ aza d;
    private final /* synthetic */ bbb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoz(bbb bbbVar, String str, aza azaVar) {
        super(bbbVar);
        this.e = bbbVar;
        this.c = str;
        this.d = azaVar;
    }

    @Override // defpackage.bbb.a
    final void a() throws RemoteException {
        axz axzVar;
        axzVar = this.e.r;
        axzVar.getMaxUserProperties(this.c, this.d);
    }

    @Override // defpackage.bbb.a
    protected final void b() {
        this.d.a((Bundle) null);
    }
}
