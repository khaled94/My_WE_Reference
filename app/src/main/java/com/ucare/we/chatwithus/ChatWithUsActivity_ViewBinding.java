package com.ucare.we.chatwithus;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ucare.we.R;

/* loaded from: classes2.dex */
public class ChatWithUsActivity_ViewBinding implements Unbinder {
    private ChatWithUsActivity a;

    public ChatWithUsActivity_ViewBinding(ChatWithUsActivity chatWithUsActivity, View view) {
        this.a = chatWithUsActivity;
        chatWithUsActivity.imgBackButton = (ImageView) Utils.findRequiredViewAsType(view, R.id.imgBackButton, "field 'imgBackButton'", ImageView.class);
        chatWithUsActivity.txtTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.txtTitle, "field 'txtTitle'", TextView.class);
        chatWithUsActivity.webView = (WebView) Utils.findRequiredViewAsType(view, R.id.webView, "field 'webView'", WebView.class);
        chatWithUsActivity.progressBar = (ProgressBar) Utils.findRequiredViewAsType(view, R.id.progressBar4, "field 'progressBar'", ProgressBar.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ChatWithUsActivity chatWithUsActivity = this.a;
        if (chatWithUsActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.a = null;
        chatWithUsActivity.imgBackButton = null;
        chatWithUsActivity.txtTitle = null;
        chatWithUsActivity.webView = null;
        chatWithUsActivity.progressBar = null;
    }
}
