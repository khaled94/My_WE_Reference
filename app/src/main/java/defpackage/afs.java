package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: afs  reason: default package */
/* loaded from: classes.dex */
final class afs implements afy {
    final /* synthetic */ Activity a;
    final /* synthetic */ Bundle b;
    final /* synthetic */ Bundle c;
    final /* synthetic */ afm d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public afs(afm afmVar, Activity activity, Bundle bundle, Bundle bundle2) {
        this.d = afmVar;
        this.a = activity;
        this.b = bundle;
        this.c = bundle2;
    }

    @Override // defpackage.afy
    public final int a() {
        return 0;
    }

    @Override // defpackage.afy
    public final void b() {
        this.d.a.a(this.a, this.b, this.c);
    }
}
