package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: eh  reason: default package */
/* loaded from: classes2.dex */
final class eh {
    private boolean a;
    private final Handler b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(ee<?> eeVar, boolean z) {
        if (!this.a && !z) {
            this.a = true;
            eeVar.d();
            this.a = false;
            return;
        }
        this.b.obtainMessage(1, eeVar).sendToTarget();
    }

    /* renamed from: eh$a */
    /* loaded from: classes2.dex */
    static final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((ee) message.obj).d();
                return true;
            }
            return false;
        }
    }
}
