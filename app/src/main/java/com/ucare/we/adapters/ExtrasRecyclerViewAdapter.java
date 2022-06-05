package com.ucare.we.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ucare.we.R;
import com.ucare.we.model.extras.ExtrasList;
import java.util.ArrayList;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public final class ExtrasRecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> {
    ArrayList<ExtrasList> a;
    Context b;
    @Inject
    djw c = new djw();
    dcp d;

    public static /* synthetic */ void lambda$ZMZ6Qe7Tb04e7udM_LQpl649nbM(ExtrasRecyclerViewAdapter extrasRecyclerViewAdapter, ExtrasList extrasList, View view) {
        extrasRecyclerViewAdapter.a(extrasList, view);
    }

    /* loaded from: classes2.dex */
    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder a;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.a = viewHolder;
            viewHolder.offerNameTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.offerName, "field 'offerNameTextView'", TextView.class);
            viewHolder.unsubscribeTextView = (Button) Utils.findRequiredViewAsType(view, R.id.unsubscribe, "field 'unsubscribeTextView'", Button.class);
            viewHolder.startDateTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.startDate, "field 'startDateTextView'", TextView.class);
            viewHolder.startDateHeader = (TextView) Utils.findRequiredViewAsType(view, R.id.startDateHeader, "field 'startDateHeader'", TextView.class);
            viewHolder.endDateTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.endDate, "field 'endDateTextView'", TextView.class);
            viewHolder.endDateHeader = (TextView) Utils.findRequiredViewAsType(view, R.id.endDateHeader, "field 'endDateHeader'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ViewHolder viewHolder = this.a;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.a = null;
            viewHolder.offerNameTextView = null;
            viewHolder.unsubscribeTextView = null;
            viewHolder.startDateTextView = null;
            viewHolder.startDateHeader = null;
            viewHolder.endDateTextView = null;
            viewHolder.endDateHeader = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = viewHolder;
        final ExtrasList extrasList = this.a.get(i);
        if (this.c.l().booleanValue()) {
            viewHolder2.offerNameTextView.setText(extrasList.getOfferEnName());
        } else {
            viewHolder2.offerNameTextView.setText(extrasList.getOfferArName());
        }
        if (extrasList.getSubscriptionDate() == null) {
            viewHolder2.startDateHeader.setVisibility(8);
            viewHolder2.startDateTextView.setVisibility(8);
        } else {
            viewHolder2.startDateHeader.setVisibility(0);
            viewHolder2.startDateTextView.setVisibility(0);
            viewHolder2.startDateTextView.setText(djm.a(extrasList.getSubscriptionDate()));
        }
        if (extrasList.getExpiryDate() == null) {
            viewHolder2.endDateHeader.setVisibility(8);
            viewHolder2.endDateTextView.setVisibility(8);
        } else {
            viewHolder2.endDateHeader.setVisibility(0);
            viewHolder2.endDateTextView.setVisibility(0);
            viewHolder2.endDateTextView.setText(djm.a(extrasList.getExpiryDate()));
        }
        viewHolder2.unsubscribeTextView.setText(R.string.un_subscribe);
        viewHolder2.unsubscribeTextView.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.adapters.-$$Lambda$ExtrasRecyclerViewAdapter$ZMZ6Qe7Tb04e7udM_LQpl649nbM
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExtrasRecyclerViewAdapter.lambda$ZMZ6Qe7Tb04e7udM_LQpl649nbM(ExtrasRecyclerViewAdapter.this, extrasList, view);
            }
        });
    }

    public ExtrasRecyclerViewAdapter(ArrayList<ExtrasList> arrayList, Context context) {
        this.b = context;
        this.d = (dcp) context;
        this.a = arrayList;
    }

    public /* synthetic */ void a(ExtrasList extrasList, View view) {
        if (this.c.k().equalsIgnoreCase("ar")) {
            this.d.a(extrasList.getOfferId(), this.b.getString(R.string.un_subscribe), extrasList.getOfferArName());
        } else {
            this.d.a(extrasList.getOfferId(), this.b.getString(R.string.un_subscribe), extrasList.getOfferEnName());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.size();
    }

    /* loaded from: classes2.dex */
    class ViewHolder extends RecyclerView.ViewHolder {
        final View a;
        @BindView(R.id.endDateHeader)
        TextView endDateHeader;
        @BindView(R.id.endDate)
        TextView endDateTextView;
        @BindView(R.id.offerName)
        TextView offerNameTextView;
        @BindView(R.id.startDateHeader)
        TextView startDateHeader;
        @BindView(R.id.startDate)
        TextView startDateTextView;
        @BindView(R.id.unsubscribe)
        Button unsubscribeTextView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ViewHolder(View view) {
            super(view);
            ExtrasRecyclerViewAdapter.this = r1;
            this.a = view;
            ButterKnife.bind(this, view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.offers_and_extra_adapter_content, viewGroup, false));
    }
}
