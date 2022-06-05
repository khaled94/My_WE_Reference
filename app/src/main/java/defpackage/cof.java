package defpackage;

import java.util.concurrent.Executor;

/* renamed from: cof  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class cof implements Executor {
    static final Executor a = new cof();

    private cof() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
