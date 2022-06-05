package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bun  reason: default package */
/* loaded from: classes2.dex */
public final class bun implements Callable<String> {
    private final /* synthetic */ bva a;
    private final /* synthetic */ buj b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bun(buj bujVar, bva bvaVar) {
        this.b = bujVar;
        this.a = bvaVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        bqb c;
        c = this.b.c(this.a);
        if (c == null) {
            this.b.q().f.a("App info was null when attempting to get app instance id");
            return null;
        }
        return c.b();
    }
}
