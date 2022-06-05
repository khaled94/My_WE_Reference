package defpackage;

import android.app.ProgressDialog;
import android.content.Context;

/* renamed from: djg  reason: default package */
/* loaded from: classes2.dex */
public final class djg extends czz {
    ProgressDialog a;

    public final void a(Context context, String str) {
        ProgressDialog progressDialog = this.a;
        if (progressDialog != null && progressDialog.isShowing()) {
            a();
        }
        ProgressDialog progressDialog2 = new ProgressDialog(context);
        this.a = progressDialog2;
        progressDialog2.setMessage(str);
        this.a.setCancelable(false);
        this.a.setCanceledOnTouchOutside(false);
        this.a.show();
    }

    public final void a() {
        ProgressDialog progressDialog = this.a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
