package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bqn  reason: default package */
/* loaded from: classes2.dex */
public final class bqn implements Runnable {
    private final /* synthetic */ brp a;
    private final /* synthetic */ bql b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bqn(bql bqlVar, brp brpVar) {
        this.b = bqlVar;
        this.a = brpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bql.a(this.b, this.a);
        this.b.a();
    }
}
