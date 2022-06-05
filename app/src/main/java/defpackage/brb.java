package defpackage;

import java.util.concurrent.Callable;

/* renamed from: brb  reason: default package */
/* loaded from: classes2.dex */
final class brb implements Callable<byte[]> {
    private final /* synthetic */ bli a;
    private final /* synthetic */ String b;
    private final /* synthetic */ bqm c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public brb(bqm bqmVar, bli bliVar, String str) {
        this.c = bqmVar;
        this.a = bliVar;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() throws Exception {
        buj bujVar;
        buj bujVar2;
        bujVar = this.c.a;
        bujVar.k();
        bujVar2 = this.c.a;
        buj.a(bujVar2.a);
        return bujVar2.a.a(this.a, this.b);
    }
}
