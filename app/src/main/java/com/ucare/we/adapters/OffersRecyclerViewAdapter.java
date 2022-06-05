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
import com.ucare.we.model.special.SpecialList;
import com.ucare.we.presentation.offers.OffersAndExtraActivity;
import java.util.ArrayList;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public final class OffersRecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> implements dco {
    @Inject
    djw a = new djw();
    ArrayList<SpecialList> b;
    Context c;
    dcp d;

    /* loaded from: classes2.dex */
    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder a;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.a = viewHolder;
            viewHolder.offerNameTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.offerName, "field 'offerNameTextView'", TextView.class);
            viewHolder.unsubscribeTextView = (Button) Utils.findRequiredViewAsType(view, R.id.unsubscribe, "field 'unsubscribeTextView'", Button.class);
            viewHolder.renewTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.renew, "field 'renewTextView'", TextView.class);
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
            viewHolder.renewTextView = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        final String str;
        ViewHolder viewHolder2 = viewHolder;
        final SpecialList specialList = this.b.get(i);
        if (this.a.l().booleanValue()) {
            viewHolder2.offerNameTextView.setText(specialList.getOfferEnName());
        } else {
            viewHolder2.offerNameTextView.setText(specialList.getOfferArName());
        }
        if (specialList.getRenewable().booleanValue()) {
            viewHolder2.renewTextView.setVisibility(0);
        } else {
            viewHolder2.renewTextView.setVisibility(8);
        }
        if (specialList.getAlreadySubscribed().booleanValue()) {
            str = this.c.getString(R.string.un_subscribe);
            viewHolder2.unsubscribeTextView.setText(R.string.un_subscribe);
        } else {
            str = this.c.getString(R.string.subscribe);
            viewHolder2.unsubscribeTextView.setText(R.string.subscribe);
        }
        viewHolder2.unsubscribeTextView.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.adapters.OffersRecyclerViewAdapter.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (specialList.getAlreadySubscribed().booleanValue()) {
                    if (OffersRecyclerViewAdapter.this.a.k().equalsIgnoreCase("ar")) {
                        OffersRecyclerViewAdapter.this.d.a(specialList.getOfferId(), str, specialList.getOfferArName());
                    } else {
                        OffersRecyclerViewAdapter.this.d.a(specialList.getOfferId(), str, specialList.getOfferEnName());
                    }
                } else if (OffersRecyclerViewAdapter.this.a.k().equalsIgnoreCase("ar")) {
                    OffersRecyclerViewAdapter.this.d.b(specialList.getOfferId(), str, specialList.getOfferArName());
                } else {
                    OffersRecyclerViewAdapter.this.d.b(specialList.getOfferId(), str, specialList.getOfferEnName());
                }
            }
        });
        viewHolder2.renewTextView.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.adapters.OffersRecyclerViewAdapter.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (OffersRecyclerViewAdapter.this.a.k().equalsIgnoreCase("ar")) {
                    OffersRecyclerViewAdapter.this.d.b(specialList.getOfferId(), specialList.getOfferArName());
                } else {
                    OffersRecyclerViewAdapter.this.d.b(specialList.getOfferId(), specialList.getOfferEnName());
                }
            }
        });
    }

    public OffersRecyclerViewAdapter(ArrayList<SpecialList> arrayList, Context context) {
        this.c = context;
        this.d = (OffersAndExtraActivity) context;
        this.b = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.b.size();
    }

    /* loaded from: classes2.dex */
    class ViewHolder extends RecyclerView.ViewHolder {
        final View a;
        @BindView(R.id.offerName)
        TextView offerNameTextView;
        @BindView(R.id.renew)
        TextView renewTextView;
        @BindView(R.id.unsubscribe)
        Button unsubscribeTextView;

        ViewHolder(View view) {
            super(view);
            this.a = view;
            ButterKnife.bind(this, view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.offer_adapter_content, viewGroup, false));
    }
}
