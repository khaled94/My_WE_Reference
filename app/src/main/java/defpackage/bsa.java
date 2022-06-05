package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bsa  reason: default package */
/* loaded from: classes2.dex */
public final class bsa implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ brs e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bsa(brs brsVar, AtomicReference atomicReference, String str, String str2, String str3) {
        this.e = brsVar;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.w.i().a(this.a, this.b, this.c, this.d);
    }
}
