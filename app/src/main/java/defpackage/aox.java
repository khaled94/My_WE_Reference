package defpackage;

import android.os.RemoteException;
import defpackage.bbb;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: aox  reason: default package */
/* loaded from: classes.dex */
public final class aox extends bbb.a {
    private final /* synthetic */ String d;
    private final /* synthetic */ Object e;
    private final /* synthetic */ bbb h;
    private final /* synthetic */ int c = 5;
    private final /* synthetic */ Object f = null;
    private final /* synthetic */ Object g = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aox(bbb bbbVar, String str, Object obj) {
        super(false);
        this.h = bbbVar;
        this.d = str;
        this.e = obj;
    }

    @Override // defpackage.bbb.a
    final void a() throws RemoteException {
        axz axzVar;
        axzVar = this.h.r;
        axzVar.logHealthData(this.c, this.d, afp.a(this.e), afp.a(this.f), afp.a(this.g));
    }
}
