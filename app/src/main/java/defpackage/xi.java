package defpackage;

import android.os.Looper;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: xi  reason: default package */
/* loaded from: classes2.dex */
public final class xi extends ait {
    final /* synthetic */ xj a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi(xj xjVar, Looper looper) {
        super(looper);
        this.a = xjVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((xh) message.obj).a(this.a);
        } else if (i == 2) {
            throw ((RuntimeException) message.obj);
        } else {
            int i2 = message.what;
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i2);
        }
    }
}
