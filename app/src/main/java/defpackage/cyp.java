package defpackage;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;

/* renamed from: cyp  reason: default package */
/* loaded from: classes2.dex */
public final class cyp implements ViewBinding {
    public final ProgressBar a;
    public final RelativeLayout b;
    private final RelativeLayout c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cyp(RelativeLayout relativeLayout, ProgressBar progressBar, RelativeLayout relativeLayout2) {
        this.c = relativeLayout;
        this.a = progressBar;
        this.b = relativeLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.c;
    }
}
