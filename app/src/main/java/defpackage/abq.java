package defpackage;

import android.content.Intent;

/* renamed from: abq  reason: default package */
/* loaded from: classes.dex */
final class abq extends abr {
    final /* synthetic */ Intent a;
    final /* synthetic */ vv b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abq(Intent intent, vv vvVar) {
        this.a = intent;
        this.b = vvVar;
    }

    @Override // defpackage.abr
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
