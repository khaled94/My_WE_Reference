package defpackage;

/* renamed from: brv  reason: default package */
/* loaded from: classes2.dex */
public final class brv implements Runnable {
    private final /* synthetic */ brn a;
    private final /* synthetic */ brs b;

    public brv(brs brsVar, brn brnVar) {
        this.b = brsVar;
        this.a = brnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a(this.a);
    }
}
