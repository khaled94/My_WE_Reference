package com.ucare.we;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public class RequestDeviceActivity_ViewBinding implements Unbinder {
    private RequestDeviceActivity a;

    public RequestDeviceActivity_ViewBinding(RequestDeviceActivity requestDeviceActivity, View view) {
        this.a = requestDeviceActivity;
        requestDeviceActivity.imgBackButton = (ImageView) Utils.findRequiredViewAsType(view, R.id.imgBackButton, "field 'imgBackButton'", ImageView.class);
        requestDeviceActivity.txtTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.txtTitle, "field 'txtTitle'", TextView.class);
        requestDeviceActivity.tvDeviceType = (TextView) Utils.findRequiredViewAsType(view, R.id.tvDeviceType, "field 'tvDeviceType'", TextView.class);
        requestDeviceActivity.needInstallationTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.need_installation, "field 'needInstallationTextView'", TextView.class);
        requestDeviceActivity.addImage = (ImageView) Utils.findRequiredViewAsType(view, R.id.addImage, "field 'addImage'", ImageView.class);
        requestDeviceActivity.imagesRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.imagesRecyclerView, "field 'imagesRecyclerView'", RecyclerView.class);
        requestDeviceActivity.btnGetStarted = (Button) Utils.findRequiredViewAsType(view, R.id.btn_get_started, "field 'btnGetStarted'", Button.class);
        requestDeviceActivity.requestReasonEditText = (EditText) Utils.findRequiredViewAsType(view, R.id.requestReason, "field 'requestReasonEditText'", EditText.class);
        requestDeviceActivity.address = (TextInputEditText) Utils.findRequiredViewAsType(view, R.id.address, "field 'address'", TextInputEditText.class);
        requestDeviceActivity.til_address = (TextInputLayout) Utils.findRequiredViewAsType(view, R.id.til_address, "field 'til_address'", TextInputLayout.class);
        requestDeviceActivity.number = (TextInputEditText) Utils.findRequiredViewAsType(view, R.id.number, "field 'number'", TextInputEditText.class);
        requestDeviceActivity.til_number = (TextInputLayout) Utils.findRequiredViewAsType(view, R.id.til_number, "field 'til_number'", TextInputLayout.class);
        requestDeviceActivity.email = (TextInputEditText) Utils.findRequiredViewAsType(view, R.id.email, "field 'email'", TextInputEditText.class);
        requestDeviceActivity.til_email = (TextInputLayout) Utils.findRequiredViewAsType(view, R.id.til_email, "field 'til_email'", TextInputLayout.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        RequestDeviceActivity requestDeviceActivity = this.a;
        if (requestDeviceActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.a = null;
        requestDeviceActivity.imgBackButton = null;
        requestDeviceActivity.txtTitle = null;
        requestDeviceActivity.tvDeviceType = null;
        requestDeviceActivity.needInstallationTextView = null;
        requestDeviceActivity.addImage = null;
        requestDeviceActivity.imagesRecyclerView = null;
        requestDeviceActivity.btnGetStarted = null;
        requestDeviceActivity.requestReasonEditText = null;
        requestDeviceActivity.address = null;
        requestDeviceActivity.til_address = null;
        requestDeviceActivity.number = null;
        requestDeviceActivity.til_number = null;
        requestDeviceActivity.email = null;
        requestDeviceActivity.til_email = null;
    }
}
