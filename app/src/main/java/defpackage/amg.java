package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: amg  reason: default package */
/* loaded from: classes.dex */
public class amg extends Handler {
    private static volatile amj a;

    public amg() {
    }

    public amg(Looper looper) {
        super(looper);
    }

    public amg(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        super.dispatchMessage(message);
    }
}
