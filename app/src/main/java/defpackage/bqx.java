package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: bqx  reason: default package */
/* loaded from: classes2.dex */
final class bqx implements Callable<List<bvd>> {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ bqm d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bqx(bqm bqmVar, String str, String str2, String str3) {
        this.d = bqmVar;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<bvd> call() throws Exception {
        buj bujVar;
        buj bujVar2;
        bujVar = this.d.a;
        bujVar.k();
        bujVar2 = this.d.a;
        return bujVar2.d().b(this.a, this.b, this.c);
    }
}
