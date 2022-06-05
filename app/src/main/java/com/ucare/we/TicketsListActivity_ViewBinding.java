package com.ucare.we;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;

/* loaded from: classes2.dex */
public class TicketsListActivity_ViewBinding implements Unbinder {
    private TicketsListActivity a;

    public TicketsListActivity_ViewBinding(TicketsListActivity ticketsListActivity, View view) {
        this.a = ticketsListActivity;
        ticketsListActivity.imgBackButton = (ImageView) Utils.findRequiredViewAsType(view, R.id.imgBackButton, "field 'imgBackButton'", ImageView.class);
        ticketsListActivity.txtTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.txtTitle, "field 'txtTitle'", TextView.class);
        ticketsListActivity.ticketList = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.ticket_list, "field 'ticketList'", RecyclerView.class);
        ticketsListActivity.tvNoData = (TextView) Utils.findRequiredViewAsType(view, R.id.tvNoData, "field 'tvNoData'", TextView.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TicketsListActivity ticketsListActivity = this.a;
        if (ticketsListActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.a = null;
        ticketsListActivity.imgBackButton = null;
        ticketsListActivity.txtTitle = null;
        ticketsListActivity.ticketList = null;
        ticketsListActivity.tvNoData = null;
    }
}
