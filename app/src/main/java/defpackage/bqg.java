package defpackage;

import java.lang.Thread;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bqg  reason: default package */
/* loaded from: classes2.dex */
public final class bqg implements Thread.UncaughtExceptionHandler {
    private final String a;
    private final /* synthetic */ bqe b;

    public bqg(bqe bqeVar, String str) {
        this.b = bqeVar;
        aat.a(str);
        this.a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.b.q().c.a(this.a, th);
    }
}
