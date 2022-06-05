package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: aei  reason: default package */
/* loaded from: classes.dex */
public final class aei implements ThreadFactory {
    private final String a;
    private final ThreadFactory b = Executors.defaultThreadFactory();

    public aei(String str) {
        aat.a(str, (Object) "Name must not be null");
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.b.newThread(new aek(runnable));
        newThread.setName(this.a);
        return newThread;
    }
}
