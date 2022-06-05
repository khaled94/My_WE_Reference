package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: cod  reason: default package */
/* loaded from: classes2.dex */
public final class cod {
    private static final Executor a = cof.a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor a() {
        return a;
    }

    public static Executor b() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), cog.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ Thread a(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }
}
