package com.ucare.we;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public class TroubleOrServicesRequestTicketActivity_ViewBinding implements Unbinder {
    private TroubleOrServicesRequestTicketActivity a;

    public TroubleOrServicesRequestTicketActivity_ViewBinding(TroubleOrServicesRequestTicketActivity troubleOrServicesRequestTicketActivity, View view) {
        this.a = troubleOrServicesRequestTicketActivity;
        troubleOrServicesRequestTicketActivity.imgBackButton = (ImageView) Utils.findRequiredViewAsType(view, R.id.imgBackButton, "field 'imgBackButton'", ImageView.class);
        troubleOrServicesRequestTicketActivity.txtTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.txtTitle, "field 'txtTitle'", TextView.class);
        troubleOrServicesRequestTicketActivity.troubleType = (TextView) Utils.findRequiredViewAsType(view, R.id.troubleType, "field 'troubleType'", TextView.class);
        troubleOrServicesRequestTicketActivity.troubleTypeLinearLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.troubleTypeLinearLayout, "field 'troubleTypeLinearLayout'", LinearLayout.class);
        troubleOrServicesRequestTicketActivity.troubleDescriptionEditText = (EditText) Utils.findRequiredViewAsType(view, R.id.troubleDescriptionEditText, "field 'troubleDescriptionEditText'", EditText.class);
        troubleOrServicesRequestTicketActivity.address = (EditText) Utils.findRequiredViewAsType(view, R.id.address, "field 'address'", EditText.class);
        troubleOrServicesRequestTicketActivity.contactNumber = (TextInputEditText) Utils.findRequiredViewAsType(view, R.id.contactNumber, "field 'contactNumber'", TextInputEditText.class);
        troubleOrServicesRequestTicketActivity.contactEmailEditText = (TextInputEditText) Utils.findRequiredViewAsType(view, R.id.contactEmailEditText, "field 'contactEmailEditText'", TextInputEditText.class);
        troubleOrServicesRequestTicketActivity.addImage = (ImageView) Utils.findRequiredViewAsType(view, R.id.addImage, "field 'addImage'", ImageView.class);
        troubleOrServicesRequestTicketActivity.btnSendTicket = (Button) Utils.findRequiredViewAsType(view, R.id.btn_send_ticket, "field 'btnSendTicket'", Button.class);
        troubleOrServicesRequestTicketActivity.imagesRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.imagesRecyclerView, "field 'imagesRecyclerView'", RecyclerView.class);
        troubleOrServicesRequestTicketActivity.reasonTypeHintTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.reasonTypeHint, "field 'reasonTypeHintTextView'", TextView.class);
        troubleOrServicesRequestTicketActivity.txtInputNumber = (TextInputLayout) Utils.findRequiredViewAsType(view, R.id.til_number, "field 'txtInputNumber'", TextInputLayout.class);
        troubleOrServicesRequestTicketActivity.txtInputEmail = (TextInputLayout) Utils.findRequiredViewAsType(view, R.id.til_email, "field 'txtInputEmail'", TextInputLayout.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TroubleOrServicesRequestTicketActivity troubleOrServicesRequestTicketActivity = this.a;
        if (troubleOrServicesRequestTicketActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.a = null;
        troubleOrServicesRequestTicketActivity.imgBackButton = null;
        troubleOrServicesRequestTicketActivity.txtTitle = null;
        troubleOrServicesRequestTicketActivity.troubleType = null;
        troubleOrServicesRequestTicketActivity.troubleTypeLinearLayout = null;
        troubleOrServicesRequestTicketActivity.troubleDescriptionEditText = null;
        troubleOrServicesRequestTicketActivity.address = null;
        troubleOrServicesRequestTicketActivity.contactNumber = null;
        troubleOrServicesRequestTicketActivity.contactEmailEditText = null;
        troubleOrServicesRequestTicketActivity.addImage = null;
        troubleOrServicesRequestTicketActivity.btnSendTicket = null;
        troubleOrServicesRequestTicketActivity.imagesRecyclerView = null;
        troubleOrServicesRequestTicketActivity.reasonTypeHintTextView = null;
        troubleOrServicesRequestTicketActivity.txtInputNumber = null;
        troubleOrServicesRequestTicketActivity.txtInputEmail = null;
    }
}
