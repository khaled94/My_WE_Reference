package com.ucare.we;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;

/* loaded from: classes2.dex */
public class RequestRouterUserNamePasswordActivity_ViewBinding implements Unbinder {
    private RequestRouterUserNamePasswordActivity a;

    public RequestRouterUserNamePasswordActivity_ViewBinding(RequestRouterUserNamePasswordActivity requestRouterUserNamePasswordActivity, View view) {
        this.a = requestRouterUserNamePasswordActivity;
        requestRouterUserNamePasswordActivity.imgBackButton = (ImageView) Utils.findRequiredViewAsType(view, R.id.imgBackButton, "field 'imgBackButton'", ImageView.class);
        requestRouterUserNamePasswordActivity.txtTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.txtTitle, "field 'txtTitle'", TextView.class);
        requestRouterUserNamePasswordActivity.userNameEditText = (EditText) Utils.findRequiredViewAsType(view, R.id.userName, "field 'userNameEditText'", EditText.class);
        requestRouterUserNamePasswordActivity.passwordEditText = (EditText) Utils.findRequiredViewAsType(view, R.id.password, "field 'passwordEditText'", EditText.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        RequestRouterUserNamePasswordActivity requestRouterUserNamePasswordActivity = this.a;
        if (requestRouterUserNamePasswordActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.a = null;
        requestRouterUserNamePasswordActivity.imgBackButton = null;
        requestRouterUserNamePasswordActivity.txtTitle = null;
        requestRouterUserNamePasswordActivity.userNameEditText = null;
        requestRouterUserNamePasswordActivity.passwordEditText = null;
    }
}
