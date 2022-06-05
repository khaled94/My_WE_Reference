package defpackage;

import android.os.Looper;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: xd  reason: default package */
/* loaded from: classes2.dex */
public final class xd extends ait {
    final /* synthetic */ xf a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd(xf xfVar, Looper looper) {
        super(looper);
        this.a = xfVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            xf.b(this.a);
        } else if (i == 2) {
            xf.a(this.a);
        } else {
            int i2 = message.what;
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i2);
        }
    }
}
