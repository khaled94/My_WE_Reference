package defpackage;

import android.app.Activity;
import android.os.RemoteException;
import defpackage.bbb;

/* renamed from: apl  reason: default package */
/* loaded from: classes.dex */
final class apl extends bbb.a {
    private final /* synthetic */ Activity c;
    private final /* synthetic */ bbb.b d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apl(bbb.b bVar, Activity activity) {
        super(bbb.this);
        this.d = bVar;
        this.c = activity;
    }

    @Override // defpackage.bbb.a
    final void a() throws RemoteException {
        axz axzVar;
        axzVar = bbb.this.r;
        axzVar.onActivityDestroyed(afp.a(this.c), this.b);
    }
}
