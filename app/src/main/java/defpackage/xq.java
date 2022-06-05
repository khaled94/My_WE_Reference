package defpackage;

import android.os.Handler;
import defpackage.aad;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: xq  reason: default package */
/* loaded from: classes2.dex */
public final class xq implements aad.e {
    final /* synthetic */ xr a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public xq(xr xrVar) {
        this.a = xrVar;
    }

    @Override // defpackage.aad.e
    public final void a() {
        Handler handler;
        handler = this.a.i.f;
        handler.post(new xp(this));
    }
}
