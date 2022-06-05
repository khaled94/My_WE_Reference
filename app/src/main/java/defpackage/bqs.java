package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: bqs  reason: default package */
/* loaded from: classes2.dex */
final class bqs implements Callable<List<bus>> {
    private final /* synthetic */ bva a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ bqm d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bqs(bqm bqmVar, bva bvaVar, String str, String str2) {
        this.d = bqmVar;
        this.a = bvaVar;
        this.b = str;
        this.c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<bus> call() throws Exception {
        buj bujVar;
        buj bujVar2;
        bujVar = this.d.a;
        bujVar.k();
        bujVar2 = this.d.a;
        return bujVar2.d().a(this.a.a, this.b, this.c);
    }
}
