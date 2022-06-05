package defpackage;

import android.os.Looper;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cnr  reason: default package */
/* loaded from: classes2.dex */
public final class cnr extends amg {
    private final /* synthetic */ cno a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnr(cno cnoVar, Looper looper) {
        super(looper);
        this.a = cnoVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        cno.a(this.a, message);
    }
}
