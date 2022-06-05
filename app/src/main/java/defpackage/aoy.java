package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import defpackage.bbb;

/* renamed from: aoy  reason: default package */
/* loaded from: classes.dex */
public final class aoy extends bbb.a {
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ boolean e;
    private final /* synthetic */ aza f;
    private final /* synthetic */ bbb g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoy(bbb bbbVar, String str, String str2, boolean z, aza azaVar) {
        super(bbbVar);
        this.g = bbbVar;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = azaVar;
    }

    @Override // defpackage.bbb.a
    final void a() throws RemoteException {
        axz axzVar;
        axzVar = this.g.r;
        axzVar.getUserProperties(this.c, this.d, this.e, this.f);
    }

    @Override // defpackage.bbb.a
    protected final void b() {
        this.f.a((Bundle) null);
    }
}
