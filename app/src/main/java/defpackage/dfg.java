package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.remote.transferpackage.TransferablePackages;
import defpackage.dfg;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0013\u001a\u00020\u00102\n\u0010\u0014\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001c\u0010\u0015\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eH\u0016J \u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000eJU\u0010\u001b\u001a\u00020\u00102M\u0010\u0007\u001aI\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\bRW\u0010\u0007\u001aK\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/transferablepackages/adapter/TransferPackagesAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/ucare/we/model/remote/transferpackage/TransferablePackages;", "Lcom/ucare/we/presentation/family/groupinfo/transferablepackages/adapter/TransferPackagesAdapter$ItemViewHolder;", "languageSwitcher", "Lcom/ucare/we/util/LanguageSwitcher;", "(Lcom/ucare/we/util/LanguageSwitcher;)V", "clickListener", "Lkotlin/Function3;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "clickedView", "item", "", "position", "", "getLanguageSwitcher", "()Lcom/ucare/we/util/LanguageSwitcher;", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewClicked", "view", "setOnClickListener", "ItemViewHolder", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dfg */
/* loaded from: classes2.dex */
public final class dfg extends ListAdapter<TransferablePackages, a> {
    final djb a;
    public dpl<? super View, ? super TransferablePackages, ? super Integer, dmg> b;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        a aVar = (a) viewHolder;
        dqc.d(aVar, "holder");
        TransferablePackages item = getItem(i);
        dqc.b(item, "getItem(position)");
        aVar.a(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        dqc.d(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_transfer_package, viewGroup, false);
        dqc.b(inflate, "from(parent.context)\n                .inflate(R.layout.item_transfer_package, parent, false)");
        return new a(this, inflate);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfg(djb djbVar) {
        super(new dfh());
        dqc.d(djbVar, "languageSwitcher");
        this.a = djbVar;
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/transferablepackages/adapter/TransferPackagesAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ucare/we/presentation/family/groupinfo/transferablepackages/adapter/TransferPackagesAdapter;Landroid/view/View;)V", "ivAdjustBalance", "Landroid/widget/ImageView;", "llTransferBg", "Landroidx/appcompat/widget/LinearLayoutCompat;", "tvAddonDesc", "Landroid/widget/TextView;", "tvAmount", "bind", "", "item", "Lcom/ucare/we/model/remote/transferpackage/TransferablePackages;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dfg$a */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.ViewHolder {
        final /* synthetic */ dfg a;
        private final TextView b;
        private final TextView c;
        private final LinearLayoutCompat d;
        private final ImageView e;

        public static /* synthetic */ void lambda$JOB0K3c7RWMxmK2GebvLl6AjQmE(dfg dfgVar, TransferablePackages transferablePackages, a aVar, View view) {
            a(dfgVar, transferablePackages, aVar, view);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dfg dfgVar, View view) {
            super(view);
            dqc.d(dfgVar, "this$0");
            dqc.d(view, "itemView");
            this.a = dfgVar;
            View findViewById = view.findViewById(R.id.tvAmount);
            dqc.b(findViewById, "itemView.findViewById(R.id.tvAmount)");
            this.b = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.tvAddonDesc);
            dqc.b(findViewById2, "itemView.findViewById(R.id.tvAddonDesc)");
            this.c = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.llTransferBg);
            dqc.b(findViewById3, "itemView.findViewById(R.id.llTransferBg)");
            this.d = (LinearLayoutCompat) findViewById3;
            View findViewById4 = view.findViewById(R.id.ivAdjustBalance);
            dqc.b(findViewById4, "itemView.findViewById(R.id.ivAdjustBalance)");
            this.e = (ImageView) findViewById4;
        }

        public final void a(final TransferablePackages transferablePackages) {
            String str;
            StringBuilder sb;
            dqc.d(transferablePackages, "item");
            final dfg dfgVar = this.a;
            if (dfgVar.a.f()) {
                sb = new StringBuilder();
                sb.append(transferablePackages.getDeductedAmount());
                sb.append(' ');
                str = transferablePackages.getMeasureUnitAr();
            } else {
                sb = new StringBuilder();
                sb.append(transferablePackages.getDeductedAmount());
                sb.append(' ');
                str = transferablePackages.getMeasureUnit();
            }
            sb.append(str);
            this.b.setText(sb.toString());
            this.c.setText(dfgVar.a.f() ? transferablePackages.getAddonDescAr() : transferablePackages.getAddonDesc());
            if (getAdapterPosition() % 2 == 0) {
                LinearLayoutCompat linearLayoutCompat = this.d;
                linearLayoutCompat.setBackgroundColor(ContextCompat.getColor(linearLayoutCompat.getContext(), 17170445));
            } else {
                LinearLayoutCompat linearLayoutCompat2 = this.d;
                linearLayoutCompat2.setBackgroundColor(ContextCompat.getColor(linearLayoutCompat2.getContext(), R.color.colorSliver));
            }
            this.e.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$dfg$a$JOB0K3c7RWMxmK2GebvLl6AjQmE
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dfg.a.lambda$JOB0K3c7RWMxmK2GebvLl6AjQmE(dfg.this, transferablePackages, this, view);
                }
            });
        }

        public static final void a(dfg dfgVar, TransferablePackages transferablePackages, a aVar, View view) {
            dqc.d(dfgVar, "this$0");
            dqc.d(transferablePackages, "$item");
            dqc.d(aVar, "this$1");
            dqc.b(view, "it");
            int adapterPosition = aVar.getAdapterPosition();
            dqc.d(view, "view");
            dpl<? super View, ? super TransferablePackages, ? super Integer, dmg> dplVar = dfgVar.b;
            if (dplVar != null) {
                dplVar.a(view, transferablePackages, Integer.valueOf(adapterPosition));
            }
        }
    }
}
