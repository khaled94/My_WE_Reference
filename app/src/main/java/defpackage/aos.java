package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import defpackage.bbb;

/* renamed from: aos  reason: default package */
/* loaded from: classes.dex */
public final class aos extends bbb.a {
    private final /* synthetic */ aza c;
    private final /* synthetic */ bbb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aos(bbb bbbVar, aza azaVar) {
        super(bbbVar);
        this.d = bbbVar;
        this.c = azaVar;
    }

    @Override // defpackage.bbb.a
    final void a() throws RemoteException {
        axz axzVar;
        axzVar = this.d.r;
        axzVar.getGmpAppId(this.c);
    }

    @Override // defpackage.bbb.a
    protected final void b() {
        this.c.a((Bundle) null);
    }
}