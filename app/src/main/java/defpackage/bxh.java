package defpackage;

import java.util.concurrent.Executor;

/* renamed from: bxh  reason: default package */
/* loaded from: classes2.dex */
final class bxh implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
