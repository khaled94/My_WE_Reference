package com.ucare.we;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.textfield.TextInputEditText;
import com.reginald.editspinner.EditSpinner;

/* loaded from: classes2.dex */
public class QueryTicketActivity_ViewBinding implements Unbinder {
    private QueryTicketActivity a;

    public QueryTicketActivity_ViewBinding(QueryTicketActivity queryTicketActivity, View view) {
        this.a = queryTicketActivity;
        queryTicketActivity.imgBackButton = (ImageView) Utils.findRequiredViewAsType(view, R.id.imgBackButton, "field 'imgBackButton'", ImageView.class);
        queryTicketActivity.txtTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.txtTitle, "field 'txtTitle'", TextView.class);
        queryTicketActivity.fromDateEditText = (EditText) Utils.findRequiredViewAsType(view, R.id.fromDateEditText, "field 'fromDateEditText'", EditText.class);
        queryTicketActivity.toDateEditText = (EditText) Utils.findRequiredViewAsType(view, R.id.toDateEditText, "field 'toDateEditText'", EditText.class);
        queryTicketActivity.ticketIDEditText = (TextInputEditText) Utils.findRequiredViewAsType(view, R.id.ticketIDEditText, "field 'ticketIDEditText'", TextInputEditText.class);
        queryTicketActivity.statusEditSpinner = (EditSpinner) Utils.findRequiredViewAsType(view, R.id.statusEditSpinner, "field 'statusEditSpinner'", EditSpinner.class);
        queryTicketActivity.btnSendTicket = (Button) Utils.findRequiredViewAsType(view, R.id.btn_send_ticket, "field 'btnSendTicket'", Button.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        QueryTicketActivity queryTicketActivity = this.a;
        if (queryTicketActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.a = null;
        queryTicketActivity.imgBackButton = null;
        queryTicketActivity.txtTitle = null;
        queryTicketActivity.fromDateEditText = null;
        queryTicketActivity.toDateEditText = null;
        queryTicketActivity.ticketIDEditText = null;
        queryTicketActivity.statusEditSpinner = null;
        queryTicketActivity.btnSendTicket = null;
    }
}
