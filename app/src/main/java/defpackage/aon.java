package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import defpackage.bbb;

/* renamed from: aon  reason: default package */
/* loaded from: classes.dex */
public final class aon extends bbb.a {
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ aza e;
    private final /* synthetic */ bbb f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aon(bbb bbbVar, String str, String str2, aza azaVar) {
        super(bbbVar);
        this.f = bbbVar;
        this.c = str;
        this.d = str2;
        this.e = azaVar;
    }

    @Override // defpackage.bbb.a
    final void a() throws RemoteException {
        axz axzVar;
        axzVar = this.f.r;
        axzVar.getConditionalUserProperties(this.c, this.d, this.e);
    }

    @Override // defpackage.bbb.a
    protected final void b() {
        this.e.a((Bundle) null);
    }
}
