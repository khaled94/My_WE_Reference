package com.ucare.we.paybillautheduser;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ucare.we.R;

/* loaded from: classes2.dex */
public class PayBillForUserActivity_ViewBinding implements Unbinder {
    private PayBillForUserActivity a;

    public PayBillForUserActivity_ViewBinding(PayBillForUserActivity payBillForUserActivity, View view) {
        this.a = payBillForUserActivity;
        payBillForUserActivity.webView = (WebView) Utils.findRequiredViewAsType(view, R.id.webView, "field 'webView'", WebView.class);
        payBillForUserActivity.progressBar = (ProgressBar) Utils.findRequiredViewAsType(view, R.id.progressBar4, "field 'progressBar'", ProgressBar.class);
        payBillForUserActivity.imgBackButton = (ImageView) Utils.findRequiredViewAsType(view, R.id.imgBackButton, "field 'imgBackButton'", ImageView.class);
        payBillForUserActivity.txtTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.txtTitle, "field 'txtTitle'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PayBillForUserActivity payBillForUserActivity = this.a;
        if (payBillForUserActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.a = null;
        payBillForUserActivity.webView = null;
        payBillForUserActivity.progressBar = null;
        payBillForUserActivity.imgBackButton = null;
        payBillForUserActivity.txtTitle = null;
    }
}
