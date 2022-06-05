package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: brt  reason: default package */
/* loaded from: classes2.dex */
public final class brt implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ Object c;
    private final /* synthetic */ long d;
    private final /* synthetic */ brs e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public brt(brs brsVar, String str, String str2, Object obj, long j) {
        this.e = brsVar;
        this.a = str;
        this.b = str2;
        this.c = obj;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.a(this.a, this.b, this.c, this.d);
    }
}
