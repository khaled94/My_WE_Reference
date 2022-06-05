package defpackage;

import android.app.Activity;
import android.os.RemoteException;
import defpackage.bbb;

/* renamed from: aop  reason: default package */
/* loaded from: classes.dex */
public final class aop extends bbb.a {
    private final /* synthetic */ Activity c;
    private final /* synthetic */ String d;
    private final /* synthetic */ String e;
    private final /* synthetic */ bbb f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aop(bbb bbbVar, Activity activity, String str, String str2) {
        super(bbbVar);
        this.f = bbbVar;
        this.c = activity;
        this.d = str;
        this.e = str2;
    }

    @Override // defpackage.bbb.a
    final void a() throws RemoteException {
        axz axzVar;
        axzVar = this.f.r;
        axzVar.setCurrentScreen(afp.a(this.c), this.d, this.e, this.a);
    }
}
