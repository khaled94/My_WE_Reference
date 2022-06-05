package com.ucare.we;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;

/* loaded from: classes2.dex */
public class PayBillActivity_ViewBinding implements Unbinder {
    private PayBillActivity a;

    public PayBillActivity_ViewBinding(PayBillActivity payBillActivity, View view) {
        this.a = payBillActivity;
        payBillActivity.webView = (WebView) Utils.findRequiredViewAsType(view, R.id.webView, "field 'webView'", WebView.class);
        payBillActivity.progressBar = (ProgressBar) Utils.findRequiredViewAsType(view, R.id.progressBar4, "field 'progressBar'", ProgressBar.class);
        payBillActivity.imgBackButton = (ImageView) Utils.findRequiredViewAsType(view, R.id.imgBackButton, "field 'imgBackButton'", ImageView.class);
        payBillActivity.txtTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.txtTitle, "field 'txtTitle'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PayBillActivity payBillActivity = this.a;
        if (payBillActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.a = null;
        payBillActivity.webView = null;
        payBillActivity.progressBar = null;
        payBillActivity.imgBackButton = null;
        payBillActivity.txtTitle = null;
    }
}
