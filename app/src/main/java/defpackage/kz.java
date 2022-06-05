package defpackage;

import java.util.concurrent.Executor;

/* renamed from: kz  reason: default package */
/* loaded from: classes2.dex */
public final class kz {
    private static final Executor a = new Executor() { // from class: kz.1
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            lg.a(runnable);
        }
    };
    private static final Executor b = new Executor() { // from class: kz.2
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    private kz() {
    }

    public static Executor a() {
        return a;
    }

    public static Executor b() {
        return b;
    }
}
