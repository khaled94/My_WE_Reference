package defpackage;

import android.content.ComponentName;

/* renamed from: btr  reason: default package */
/* loaded from: classes2.dex */
final class btr implements Runnable {
    private final /* synthetic */ ComponentName a;
    private final /* synthetic */ btp b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public btr(btp btpVar, ComponentName componentName) {
        this.b = btpVar;
        this.a = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bsx.a(this.b.c, this.a);
    }
}
