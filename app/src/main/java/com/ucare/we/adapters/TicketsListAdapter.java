package com.ucare.we.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ucare.we.EditTicketActivity;
import com.ucare.we.R;
import com.ucare.we.TicketsListActivity;
import com.ucare.we.model.ticket.QueryTicketResponse;
import java.util.ArrayList;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public final class TicketsListAdapter extends RecyclerView.Adapter<MyViewHolder> {
    Context b;
    ArrayList<QueryTicketResponse> c;
    TicketsListActivity d;
    String a = djv.a("LANGUAGE", "");
    @Inject
    djw e = new djw();

    /* loaded from: classes2.dex */
    public class MyViewHolder_ViewBinding implements Unbinder {
        private MyViewHolder a;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.a = myViewHolder;
            myViewHolder.ticketID = (TextView) Utils.findRequiredViewAsType(view, R.id.ticketID, "field 'ticketID'", TextView.class);
            myViewHolder.serviceNumberHint = (TextView) Utils.findRequiredViewAsType(view, R.id.serviceNumberHint, "field 'serviceNumberHint'", TextView.class);
            myViewHolder.ticketStatusHint = (TextView) Utils.findRequiredViewAsType(view, R.id.ticketStatusHint, "field 'ticketStatusHint'", TextView.class);
            myViewHolder.serviceNumber = (TextView) Utils.findRequiredViewAsType(view, R.id.serviceNumber, "field 'serviceNumber'", TextView.class);
            myViewHolder.ticketStatus = (TextView) Utils.findRequiredViewAsType(view, R.id.ticketStatus, "field 'ticketStatus'", TextView.class);
            myViewHolder.tvTicketName = (TextView) Utils.findRequiredViewAsType(view, R.id.tvTicketName, "field 'tvTicketName'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            MyViewHolder myViewHolder = this.a;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.a = null;
            myViewHolder.ticketID = null;
            myViewHolder.serviceNumberHint = null;
            myViewHolder.ticketStatusHint = null;
            myViewHolder.serviceNumber = null;
            myViewHolder.ticketStatus = null;
            myViewHolder.tvTicketName = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(MyViewHolder myViewHolder, int i) {
        MyViewHolder myViewHolder2 = myViewHolder;
        QueryTicketResponse queryTicketResponse = this.c.get(i);
        TextView textView = myViewHolder2.ticketID;
        textView.setText(this.b.getString(R.string.Ticket_id) + ": " + queryTicketResponse.getRequestNo());
        myViewHolder2.serviceNumber.setText(queryTicketResponse.getServiceNo());
        myViewHolder2.serviceNumber.setText(queryTicketResponse.getServiceNo());
        if (this.e.k().equalsIgnoreCase("en")) {
            myViewHolder2.ticketStatus.setText(queryTicketResponse.getStatusDescEn());
            myViewHolder2.tvTicketName.setText(queryTicketResponse.getSrTypeNameEn());
            return;
        }
        myViewHolder2.ticketStatus.setText(queryTicketResponse.getStatusDescAr());
        myViewHolder2.tvTicketName.setText(queryTicketResponse.getSrTypeNameAr());
    }

    public TicketsListAdapter(Context context, ArrayList<QueryTicketResponse> arrayList) {
        this.b = context;
        this.c = arrayList;
        this.d = (TicketsListActivity) context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    /* loaded from: classes2.dex */
    class MyViewHolder extends RecyclerView.ViewHolder {
        final View a;
        @BindView(R.id.serviceNumber)
        TextView serviceNumber;
        @BindView(R.id.serviceNumberHint)
        TextView serviceNumberHint;
        @BindView(R.id.ticketID)
        TextView ticketID;
        @BindView(R.id.ticketStatus)
        TextView ticketStatus;
        @BindView(R.id.ticketStatusHint)
        TextView ticketStatusHint;
        @BindView(R.id.tvTicketName)
        TextView tvTicketName;

        MyViewHolder(View view) {
            super(view);
            this.a = view;
            ButterKnife.bind(this, view);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.adapters.TicketsListAdapter.MyViewHolder.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Intent intent = new Intent(TicketsListAdapter.this.d, EditTicketActivity.class);
                    intent.putExtra("TICKET", TicketsListAdapter.this.c.get(MyViewHolder.this.getAdapterPosition()));
                    TicketsListAdapter.this.d.startActivity(intent);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ticket_list_adapter_content, viewGroup, false));
    }
}
