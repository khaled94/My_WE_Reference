package defpackage;

import java.util.concurrent.Executor;

/* renamed from: che  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class che implements Executor {
    static final Executor a = new che();

    private che() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
