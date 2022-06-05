package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: air  reason: default package */
/* loaded from: classes.dex */
final class air implements aiq {
    private air() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ air(byte b) {
    }

    @Override // defpackage.aiq
    public final ExecutorService a(int i, ThreadFactory threadFactory) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // defpackage.aiq
    public final ExecutorService a(ThreadFactory threadFactory) {
        return a(1, threadFactory);
    }
}
