package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: brd  reason: default package */
/* loaded from: classes2.dex */
final class brd implements Callable<List<bus>> {
    private final /* synthetic */ bva a;
    private final /* synthetic */ bqm b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public brd(bqm bqmVar, bva bvaVar) {
        this.b = bqmVar;
        this.a = bvaVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<bus> call() throws Exception {
        buj bujVar;
        buj bujVar2;
        bujVar = this.b.a;
        bujVar.k();
        bujVar2 = this.b.a;
        return bujVar2.d().a(this.a.a);
    }
}
