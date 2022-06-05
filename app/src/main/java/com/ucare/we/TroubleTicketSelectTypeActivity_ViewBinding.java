package com.ucare.we;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;

/* loaded from: classes2.dex */
public class TroubleTicketSelectTypeActivity_ViewBinding implements Unbinder {
    private TroubleTicketSelectTypeActivity a;

    public TroubleTicketSelectTypeActivity_ViewBinding(TroubleTicketSelectTypeActivity troubleTicketSelectTypeActivity, View view) {
        this.a = troubleTicketSelectTypeActivity;
        troubleTicketSelectTypeActivity.imgBackButton = (ImageView) Utils.findRequiredViewAsType(view, R.id.imgBackButton, "field 'imgBackButton'", ImageView.class);
        troubleTicketSelectTypeActivity.txtTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.txtTitle, "field 'txtTitle'", TextView.class);
        troubleTicketSelectTypeActivity.troubleValueRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.troubleValueRecyclerView, "field 'troubleValueRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TroubleTicketSelectTypeActivity troubleTicketSelectTypeActivity = this.a;
        if (troubleTicketSelectTypeActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.a = null;
        troubleTicketSelectTypeActivity.imgBackButton = null;
        troubleTicketSelectTypeActivity.txtTitle = null;
        troubleTicketSelectTypeActivity.troubleValueRecyclerView = null;
    }
}
