package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import defpackage.bbb;

/* renamed from: apg  reason: default package */
/* loaded from: classes.dex */
final class apg extends bbb.a {
    private final /* synthetic */ Activity c;
    private final /* synthetic */ Bundle d;
    private final /* synthetic */ bbb.b e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apg(bbb.b bVar, Activity activity, Bundle bundle) {
        super(bbb.this);
        this.e = bVar;
        this.c = activity;
        this.d = bundle;
    }

    @Override // defpackage.bbb.a
    final void a() throws RemoteException {
        axz axzVar;
        axzVar = bbb.this.r;
        axzVar.onActivityCreated(afp.a(this.c), this.d, this.b);
    }
}
