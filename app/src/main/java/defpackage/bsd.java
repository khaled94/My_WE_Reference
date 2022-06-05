package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bsd  reason: default package */
/* loaded from: classes2.dex */
public final class bsd implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ boolean e;
    private final /* synthetic */ brs f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bsd(brs brsVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f = brsVar;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.w.i().a(this.a, this.b, this.c, this.d, this.e);
    }
}
