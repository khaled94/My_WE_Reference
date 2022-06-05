package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import defpackage.bbb;

/* renamed from: apb  reason: default package */
/* loaded from: classes.dex */
public final class apb extends bbb.a {
    private final /* synthetic */ String d;
    private final /* synthetic */ String e;
    private final /* synthetic */ Bundle f;
    private final /* synthetic */ bbb i;
    private final /* synthetic */ Long c = null;
    private final /* synthetic */ boolean g = true;
    private final /* synthetic */ boolean h = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apb(bbb bbbVar, String str, String str2, Bundle bundle) {
        super(bbbVar);
        this.i = bbbVar;
        this.d = str;
        this.e = str2;
        this.f = bundle;
    }

    @Override // defpackage.bbb.a
    final void a() throws RemoteException {
        axz axzVar;
        Long l = this.c;
        long longValue = l == null ? this.a : l.longValue();
        axzVar = this.i.r;
        axzVar.logEvent(this.d, this.e, this.f, this.g, this.h, longValue);
    }
}
