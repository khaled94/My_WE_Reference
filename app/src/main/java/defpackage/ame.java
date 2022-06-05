package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: ame  reason: default package */
/* loaded from: classes.dex */
public interface ame {
    ExecutorService a(ThreadFactory threadFactory);

    ScheduledExecutorService b(ThreadFactory threadFactory);
}
