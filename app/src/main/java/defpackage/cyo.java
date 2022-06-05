package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.ucare.we.view.AppCompatTextView;

/* renamed from: cyo  reason: default package */
/* loaded from: classes2.dex */
public final class cyo implements ViewBinding {
    public final Button a;
    public final ImageView b;
    public final AppCompatTextView c;
    public final ImageView d;
    public final ConstraintLayout e;
    public final AppCompatTextView f;
    private final ConstraintLayout g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cyo(ConstraintLayout constraintLayout, Button button, ImageView imageView, AppCompatTextView appCompatTextView, ImageView imageView2, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView2) {
        this.g = constraintLayout;
        this.a = button;
        this.b = imageView;
        this.c = appCompatTextView;
        this.d = imageView2;
        this.e = constraintLayout2;
        this.f = appCompatTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.g;
    }
}
