package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: uv  reason: default package */
/* loaded from: classes2.dex */
public final class uv extends DialogFragment {
    private Dialog a;
    private DialogInterface.OnCancelListener b;
    private Dialog c;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.c == null) {
                this.c = new AlertDialog.Builder((Context) aat.a(getActivity())).create();
            }
            return this.c;
        }
        return dialog;
    }

    @Override // android.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }

    public static uv a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        uv uvVar = new uv();
        Dialog dialog2 = (Dialog) aat.a(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        uvVar.a = dialog2;
        if (onCancelListener != null) {
            uvVar.b = onCancelListener;
        }
        return uvVar;
    }
}
