package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.remote.subscribedoffers.FamilySubscribedOffer;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016¨\u0006\u000f"}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/adapters/GroupInfoAddonsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/ucare/we/model/remote/subscribedoffers/FamilySubscribedOffer;", "Lcom/ucare/we/presentation/family/groupinfo/adapters/GroupInfoAddonsAdapter$ItemViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ItemViewHolder", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dek  reason: default package */
/* loaded from: classes2.dex */
public final class dek extends ListAdapter<FamilySubscribedOffer, a> {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        a aVar = (a) viewHolder;
        dqc.d(aVar, "holder");
        FamilySubscribedOffer item = getItem(i);
        dqc.b(item, "getItem(position)");
        FamilySubscribedOffer familySubscribedOffer = item;
        dqc.d(familySubscribedOffer, "item");
        aVar.c.setText(familySubscribedOffer.getRemainingDaysWithText());
        aVar.a.setText(familySubscribedOffer.getOfferName());
        aVar.b.setText(familySubscribedOffer.getRenewalDate());
        TextView textView = aVar.d;
        textView.setText(familySubscribedOffer.getPrice() + ' ' + aVar.itemView.getContext().getString(R.string.egp));
        if (i % 2 == 0) {
            aVar.e.setBackgroundColor(aVar.itemView.getContext().getResources().getColor(R.color.white));
        } else {
            aVar.e.setBackgroundColor(aVar.itemView.getContext().getResources().getColor(R.color.store_select_area_background_color));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        dqc.d(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.groupinfo_addon_layout, viewGroup, false);
        dqc.b(inflate, "from(parent.context)\n                .inflate(R.layout.groupinfo_addon_layout, parent, false)");
        return new a(inflate);
    }

    public dek() {
        super(new dej());
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/adapters/GroupInfoAddonsAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "parent", "Landroidx/constraintlayout/widget/ConstraintLayout;", "tvCostHint", "Landroid/widget/TextView;", "txtFamilyAddonName", "txtRemainingDays", "txtRenewalDate", "bind", "", "item", "Lcom/ucare/we/model/remote/subscribedoffers/FamilySubscribedOffer;", "position", "", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dek$a */
    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.ViewHolder {
        final TextView a;
        final TextView b;
        final TextView c;
        final TextView d;
        final ConstraintLayout e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            dqc.d(view, "itemView");
            View findViewById = view.findViewById(R.id.txtFamilyAddonName);
            dqc.b(findViewById, "itemView.findViewById(R.id.txtFamilyAddonName)");
            this.a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.txtRenewalDate);
            dqc.b(findViewById2, "itemView.findViewById(R.id.txtRenewalDate)");
            this.b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.txtRemainingDays);
            dqc.b(findViewById3, "itemView.findViewById(R.id.txtRemainingDays)");
            this.c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.tvCostHint);
            dqc.b(findViewById4, "itemView.findViewById(R.id.tvCostHint)");
            this.d = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.cons_parent);
            dqc.b(findViewById5, "itemView.findViewById(R.id.cons_parent)");
            this.e = (ConstraintLayout) findViewById5;
        }
    }
}
