package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: ckd  reason: default package */
/* loaded from: classes2.dex */
public final class ckd implements Executor {
    private static ckd a = new ckd();
    private Handler b = new aly(Looper.getMainLooper());

    private ckd() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.post(runnable);
    }

    public static ckd a() {
        return a;
    }
}
