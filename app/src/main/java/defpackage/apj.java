package defpackage;

import android.app.Activity;
import android.os.RemoteException;
import defpackage.bbb;

/* renamed from: apj  reason: default package */
/* loaded from: classes.dex */
final class apj extends bbb.a {
    private final /* synthetic */ Activity c;
    private final /* synthetic */ aza d;
    private final /* synthetic */ bbb.b e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apj(bbb.b bVar, Activity activity, aza azaVar) {
        super(bbb.this);
        this.e = bVar;
        this.c = activity;
        this.d = azaVar;
    }

    @Override // defpackage.bbb.a
    final void a() throws RemoteException {
        axz axzVar;
        axzVar = bbb.this.r;
        axzVar.onActivitySaveInstanceState(afp.a(this.c), this.d, this.b);
    }
}
