package com.ucare.we;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;

/* loaded from: classes2.dex */
public class USSDActivity_ViewBinding implements Unbinder {
    private USSDActivity a;

    public USSDActivity_ViewBinding(USSDActivity uSSDActivity, View view) {
        this.a = uSSDActivity;
        uSSDActivity.webView = (WebView) Utils.findRequiredViewAsType(view, R.id.webView, "field 'webView'", WebView.class);
        uSSDActivity.progressBar = (ProgressBar) Utils.findRequiredViewAsType(view, R.id.progressBar4, "field 'progressBar'", ProgressBar.class);
        uSSDActivity.imgBackButton = (ImageView) Utils.findRequiredViewAsType(view, R.id.imgBackButton, "field 'imgBackButton'", ImageView.class);
        uSSDActivity.txtTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.txtTitle, "field 'txtTitle'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        USSDActivity uSSDActivity = this.a;
        if (uSSDActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.a = null;
        uSSDActivity.webView = null;
        uSSDActivity.progressBar = null;
        uSSDActivity.imgBackButton = null;
        uSSDActivity.txtTitle = null;
    }
}
