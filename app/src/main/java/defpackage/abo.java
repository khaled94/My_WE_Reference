package defpackage;

import android.app.Activity;
import android.content.Intent;

/* renamed from: abo  reason: default package */
/* loaded from: classes.dex */
final class abo extends abr {
    final /* synthetic */ Intent a;
    final /* synthetic */ Activity b;
    final /* synthetic */ int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abo(Intent intent, Activity activity, int i) {
        this.a = intent;
        this.b = activity;
        this.c = i;
    }

    @Override // defpackage.abr
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, this.c);
        }
    }
}
