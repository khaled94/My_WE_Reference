package defpackage;

import android.os.RemoteException;
import defpackage.bbb;

/* renamed from: apa  reason: default package */
/* loaded from: classes.dex */
public final class apa extends bbb.a {
    private final /* synthetic */ boolean c;
    private final /* synthetic */ bbb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apa(bbb bbbVar, boolean z) {
        super(bbbVar);
        this.d = bbbVar;
        this.c = z;
    }

    @Override // defpackage.bbb.a
    final void a() throws RemoteException {
        axz axzVar;
        axzVar = this.d.r;
        axzVar.setDataCollectionEnabled(this.c);
    }
}
