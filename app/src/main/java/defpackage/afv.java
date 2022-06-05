package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;

/* renamed from: afv  reason: default package */
/* loaded from: classes.dex */
final class afv implements View.OnClickListener {
    final /* synthetic */ Context a;
    final /* synthetic */ Intent b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public afv(Context context, Intent intent) {
        this.a = context;
        this.b = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.a.startActivity(this.b);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
