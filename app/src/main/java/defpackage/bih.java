package defpackage;

import android.view.View;

/* renamed from: bih  reason: default package */
/* loaded from: classes2.dex */
final class bih implements View.OnClickListener {
    private final /* synthetic */ bid a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bih(bid bidVar) {
        this.a = bidVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        z = this.a.d;
        if (!z) {
            bid.b(this.a);
        }
    }
}
