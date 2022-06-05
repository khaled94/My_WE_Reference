package com.ucare.we;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;

/* loaded from: classes2.dex */
public class NewRequestActivity_ViewBinding implements Unbinder {
    private NewRequestActivity a;

    public NewRequestActivity_ViewBinding(NewRequestActivity newRequestActivity, View view) {
        this.a = newRequestActivity;
        newRequestActivity.imgBackButton = (ImageView) Utils.findRequiredViewAsType(view, R.id.imgBackButton, "field 'imgBackButton'", ImageView.class);
        newRequestActivity.txtTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.txtTitle, "field 'txtTitle'", TextView.class);
        newRequestActivity.serviceRequest = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.newRequestLinearLayout, "field 'serviceRequest'", LinearLayout.class);
        newRequestActivity.serviceTicketButton = (Button) Utils.findRequiredViewAsType(view, R.id.serviceTicketButton, "field 'serviceTicketButton'", Button.class);
        newRequestActivity.usageTitleTv = (TextView) Utils.findRequiredViewAsType(view, R.id.usage_title_tv, "field 'usageTitleTv'", TextView.class);
        newRequestActivity.troubleTicketLinearLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.troubleTicketLinearLayout, "field 'troubleTicketLinearLayout'", LinearLayout.class);
        newRequestActivity.troubleTicketButton = (Button) Utils.findRequiredViewAsType(view, R.id.troubleTicketButton, "field 'troubleTicketButton'", Button.class);
        newRequestActivity.queryTicketLinearLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.queryTicketLinearLayout, "field 'queryTicketLinearLayout'", LinearLayout.class);
        newRequestActivity.queryTicketButton = (Button) Utils.findRequiredViewAsType(view, R.id.queryTicketButton, "field 'queryTicketButton'", Button.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        NewRequestActivity newRequestActivity = this.a;
        if (newRequestActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.a = null;
        newRequestActivity.imgBackButton = null;
        newRequestActivity.txtTitle = null;
        newRequestActivity.serviceRequest = null;
        newRequestActivity.serviceTicketButton = null;
        newRequestActivity.usageTitleTv = null;
        newRequestActivity.troubleTicketLinearLayout = null;
        newRequestActivity.troubleTicketButton = null;
        newRequestActivity.queryTicketLinearLayout = null;
        newRequestActivity.queryTicketButton = null;
    }
}
