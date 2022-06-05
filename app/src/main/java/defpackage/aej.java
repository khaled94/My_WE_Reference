package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: aej  reason: default package */
/* loaded from: classes.dex */
public final class aej implements ThreadFactory {
    private final String a;
    private final AtomicInteger b = new AtomicInteger();
    private final ThreadFactory c = Executors.defaultThreadFactory();

    public aej(String str) {
        aat.a(str, (Object) "Name must not be null");
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.c.newThread(new aek(runnable));
        String str = this.a;
        int andIncrement = this.b.getAndIncrement();
        StringBuilder sb = new StringBuilder(str.length() + 13);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }
}
