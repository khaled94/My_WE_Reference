package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

/* renamed from: vb  reason: default package */
/* loaded from: classes2.dex */
public class vb extends DialogFragment {
    private Dialog a;
    private DialogInterface.OnCancelListener b;
    private Dialog c;

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.c == null) {
                this.c = new AlertDialog.Builder((Context) aat.a(getContext())).create();
            }
            return this.c;
        }
        return dialog;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }

    public static vb a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        vb vbVar = new vb();
        Dialog dialog2 = (Dialog) aat.a(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        vbVar.a = dialog2;
        if (onCancelListener != null) {
            vbVar.b = onCancelListener;
        }
        return vbVar;
    }
}
