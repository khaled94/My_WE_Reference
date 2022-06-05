package com.ucare.we;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;

/* loaded from: classes2.dex */
public class EditTicketActivity_ViewBinding implements Unbinder {
    private EditTicketActivity a;

    public EditTicketActivity_ViewBinding(EditTicketActivity editTicketActivity, View view) {
        this.a = editTicketActivity;
        editTicketActivity.imgBackButton = (ImageView) Utils.findRequiredViewAsType(view, R.id.imgBackButton, "field 'imgBackButton'", ImageView.class);
        editTicketActivity.txtTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.txtTitle, "field 'txtTitle'", TextView.class);
        editTicketActivity.ticketID = (TextView) Utils.findRequiredViewAsType(view, R.id.ticketID, "field 'ticketID'", TextView.class);
        editTicketActivity.serviceNumber = (TextView) Utils.findRequiredViewAsType(view, R.id.serviceNumber, "field 'serviceNumber'", TextView.class);
        editTicketActivity.ticketStatus = (TextView) Utils.findRequiredViewAsType(view, R.id.ticketStatus, "field 'ticketStatus'", TextView.class);
        editTicketActivity.addImage = (ImageView) Utils.findRequiredViewAsType(view, R.id.addImage, "field 'addImage'", ImageView.class);
        editTicketActivity.imagesRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.imagesRecyclerView, "field 'imagesRecyclerView'", RecyclerView.class);
        editTicketActivity.btnSendTicket = (Button) Utils.findRequiredViewAsType(view, R.id.btn_send_ticket, "field 'btnSendTicket'", Button.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        EditTicketActivity editTicketActivity = this.a;
        if (editTicketActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.a = null;
        editTicketActivity.imgBackButton = null;
        editTicketActivity.txtTitle = null;
        editTicketActivity.ticketID = null;
        editTicketActivity.serviceNumber = null;
        editTicketActivity.ticketStatus = null;
        editTicketActivity.addImage = null;
        editTicketActivity.imagesRecyclerView = null;
        editTicketActivity.btnSendTicket = null;
    }
}
