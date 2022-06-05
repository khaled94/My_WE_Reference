package com.ucare.we;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;

/* loaded from: classes2.dex */
public class ServiceTicketActivity_ViewBinding implements Unbinder {
    private ServiceTicketActivity a;

    public ServiceTicketActivity_ViewBinding(ServiceTicketActivity serviceTicketActivity, View view) {
        this.a = serviceTicketActivity;
        serviceTicketActivity.imgBackButton = (ImageView) Utils.findRequiredViewAsType(view, R.id.imgBackButton, "field 'imgBackButton'", ImageView.class);
        serviceTicketActivity.txtTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.txtTitle, "field 'txtTitle'", TextView.class);
        serviceTicketActivity.newRequestLinearLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.newRequestLinearLayout, "field 'newRequestLinearLayout'", LinearLayout.class);
        serviceTicketActivity.newRequestButton = (Button) Utils.findRequiredViewAsType(view, R.id.newRequestButton, "field 'newRequestButton'", Button.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ServiceTicketActivity serviceTicketActivity = this.a;
        if (serviceTicketActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.a = null;
        serviceTicketActivity.imgBackButton = null;
        serviceTicketActivity.txtTitle = null;
        serviceTicketActivity.newRequestLinearLayout = null;
        serviceTicketActivity.newRequestButton = null;
    }
}
