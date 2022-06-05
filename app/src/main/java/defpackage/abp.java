package defpackage;

import android.content.Intent;
import androidx.fragment.app.Fragment;

/* renamed from: abp  reason: default package */
/* loaded from: classes.dex */
final class abp extends abr {
    final /* synthetic */ Intent a;
    final /* synthetic */ Fragment b;
    final /* synthetic */ int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abp(Intent intent, Fragment fragment, int i) {
        this.a = intent;
        this.b = fragment;
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
