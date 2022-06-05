package defpackage;

import android.os.RemoteException;
import defpackage.bbb;

/* renamed from: ape  reason: default package */
/* loaded from: classes.dex */
public final class ape extends bbb.a {
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ Object e;
    private final /* synthetic */ boolean f = true;
    private final /* synthetic */ bbb g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ape(bbb bbbVar, String str, String str2, Object obj) {
        super(bbbVar);
        this.g = bbbVar;
        this.c = str;
        this.d = str2;
        this.e = obj;
    }

    @Override // defpackage.bbb.a
    final void a() throws RemoteException {
        axz axzVar;
        axzVar = this.g.r;
        axzVar.setUserProperty(this.c, this.d, afp.a(this.e), this.f, this.a);
    }
}
