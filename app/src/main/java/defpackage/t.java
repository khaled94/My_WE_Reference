package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.afollestad.materialdialogs.internal.MDRootLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: t  reason: default package */
/* loaded from: classes2.dex */
public class t extends Dialog implements DialogInterface.OnShowListener {
    protected MDRootLayout a;
    private DialogInterface.OnShowListener b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(Context context, int i) {
        super(context, i);
    }

    @Override // android.app.Dialog
    public View findViewById(int i) {
        return this.a.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.b = onShowListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        super.setOnShowListener(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(View view) {
        super.setContentView(view);
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        DialogInterface.OnShowListener onShowListener = this.b;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    @Override // android.app.Dialog
    @Deprecated
    public void setContentView(int i) throws IllegalAccessError {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    @Override // android.app.Dialog
    @Deprecated
    public void setContentView(View view) throws IllegalAccessError {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    @Override // android.app.Dialog
    @Deprecated
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessError {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }
}
