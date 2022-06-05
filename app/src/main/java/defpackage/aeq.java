package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: aeq  reason: default package */
/* loaded from: classes.dex */
public final class aeq extends ait {
    final /* synthetic */ ux a;
    private final Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeq(ux uxVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.a = uxVar;
        this.b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 1) {
            int a = this.a.a(this.b);
            if (!this.a.b(a)) {
                return;
            }
            this.a.b(this.b, a);
            return;
        }
        int i = message.what;
        StringBuilder sb = new StringBuilder(50);
        sb.append("Don't know how to handle this message: ");
        sb.append(i);
    }
}
