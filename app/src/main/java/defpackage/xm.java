package defpackage;

import android.os.Handler;
import defpackage.vp;

/* renamed from: xm  reason: default package */
/* loaded from: classes2.dex */
final class xm implements vp.a {
    final /* synthetic */ vs a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public xm(vs vsVar) {
        this.a = vsVar;
    }

    @Override // defpackage.vp.a
    public final void a(boolean z) {
        Handler handler;
        Handler handler2;
        vs vsVar = this.a;
        handler = vsVar.f;
        handler2 = vsVar.f;
        handler.sendMessage(handler2.obtainMessage(1, Boolean.valueOf(z)));
    }
}
