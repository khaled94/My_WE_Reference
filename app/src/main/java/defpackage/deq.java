package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.remote.transferunits.DetailedLineUsage;
import com.ucare.we.view.CircularProgressView;
import defpackage.deq;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0013\u001a\u00020\u00102\n\u0010\u0014\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001c\u0010\u0015\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eH\u0016J \u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000eJU\u0010\u001b\u001a\u00020\u00102M\u0010\u0007\u001aI\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\bRW\u0010\u0007\u001aK\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/managebundle/adapter/TransferUnitsBundlesAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/ucare/we/model/remote/transferunits/DetailedLineUsage;", "Lcom/ucare/we/presentation/family/groupinfo/managebundle/adapter/TransferUnitsBundlesAdapter$ItemViewHolder;", "languageSwitcher", "Lcom/ucare/we/util/LanguageSwitcher;", "(Lcom/ucare/we/util/LanguageSwitcher;)V", "clickListener", "Lkotlin/Function3;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "clickedView", "item", "", "position", "", "getLanguageSwitcher", "()Lcom/ucare/we/util/LanguageSwitcher;", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewClicked", "view", "setOnClickListener", "ItemViewHolder", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: deq */
/* loaded from: classes2.dex */
public final class deq extends ListAdapter<DetailedLineUsage, a> {
    final djb a;
    public dpl<? super View, ? super DetailedLineUsage, ? super Integer, dmg> b;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        a aVar = (a) viewHolder;
        dqc.d(aVar, "holder");
        DetailedLineUsage item = getItem(i);
        dqc.b(item, "getItem(position)");
        aVar.a(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        dqc.d(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_transfer_unit, viewGroup, false);
        dqc.b(inflate, "from(parent.context)\n                .inflate(R.layout.item_transfer_unit, parent, false)");
        return new a(this, inflate);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deq(djb djbVar) {
        super(new dep());
        dqc.d(djbVar, "languageSwitcher");
        this.a = djbVar;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/managebundle/adapter/TransferUnitsBundlesAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ucare/we/presentation/family/groupinfo/managebundle/adapter/TransferUnitsBundlesAdapter;Landroid/view/View;)V", "btnTransfer", "Landroid/widget/TextView;", "circleProgressbar", "Lcom/ucare/we/view/CircularProgressView;", "tvExpiryDate", "tvQuotaPlan", "tvRemainingQuota", "bind", "", "item", "Lcom/ucare/we/model/remote/transferunits/DetailedLineUsage;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: deq$a */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.ViewHolder {
        final /* synthetic */ deq a;
        private final TextView b;
        private final TextView c;
        private final TextView d;
        private final TextView e;
        private final CircularProgressView f;

        public static /* synthetic */ void lambda$fYSMXFdmKCZL3QN0i8aB2HOHatA(deq deqVar, DetailedLineUsage detailedLineUsage, a aVar, View view) {
            a(deqVar, detailedLineUsage, aVar, view);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(deq deqVar, View view) {
            super(view);
            dqc.d(deqVar, "this$0");
            dqc.d(view, "itemView");
            this.a = deqVar;
            View findViewById = view.findViewById(R.id.tvQuotaPlan);
            dqc.b(findViewById, "itemView.findViewById(R.id.tvQuotaPlan)");
            this.b = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.btnTransfer);
            dqc.b(findViewById2, "itemView.findViewById(R.id.btnTransfer)");
            this.c = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tvRemainingQuota);
            dqc.b(findViewById3, "itemView.findViewById(R.id.tvRemainingQuota)");
            this.d = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.tvExpiryDate);
            dqc.b(findViewById4, "itemView.findViewById(R.id.tvExpiryDate)");
            this.e = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.pbQuotaProgress);
            dqc.b(findViewById5, "itemView.findViewById(R.id.pbQuotaProgress)");
            this.f = (CircularProgressView) findViewById5;
        }

        public final void a(final DetailedLineUsage detailedLineUsage) {
            double d;
            dqc.d(detailedLineUsage, "item");
            final deq deqVar = this.a;
            this.c.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$deq$a$fYSMXFdmKCZL3QN0i8aB2HOHatA
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    deq.a.lambda$fYSMXFdmKCZL3QN0i8aB2HOHatA(deq.this, detailedLineUsage, this, view);
                }
            });
            this.e.setText(detailedLineUsage.getExpireDate());
            TextView textView = this.d;
            String string = djq.a().getString(R.string.remainingWithUnits);
            dqc.b(string, "getContext().getString(R.string.remainingWithUnits)");
            Object[] objArr = new Object[2];
            objArr[0] = Double.valueOf(detailedLineUsage.getFreeAmount());
            objArr[1] = deqVar.a.f() ? detailedLineUsage.getMeasureUnitArName() : detailedLineUsage.getMeasureUnitEnName();
            String format = String.format(string, Arrays.copyOf(objArr, 2));
            dqc.b(format, "java.lang.String.format(this, *args)");
            textView.setText(format);
            if (deqVar.a.f()) {
                this.b.setText(detailedLineUsage.getFreeUnitArName());
            } else {
                this.b.setText(detailedLineUsage.getFreeUnitEnName());
            }
            try {
                d = (detailedLineUsage.getFreeAmount() * 100.0d) / detailedLineUsage.getInitialTotalAmount();
            } catch (Exception unused) {
                d = detailedLineUsage.getFreeAmount() * 100.0d;
            }
            detailedLineUsage.getRenewalDate();
            detailedLineUsage.getServiceId();
            this.f.a((float) d, false);
        }

        public static final void a(deq deqVar, DetailedLineUsage detailedLineUsage, a aVar, View view) {
            dqc.d(deqVar, "this$0");
            dqc.d(detailedLineUsage, "$item");
            dqc.d(aVar, "this$1");
            dqc.b(view, "it");
            int adapterPosition = aVar.getAdapterPosition();
            dqc.d(view, "view");
            dpl<? super View, ? super DetailedLineUsage, ? super Integer, dmg> dplVar = deqVar.b;
            if (dplVar != null) {
                dplVar.a(view, detailedLineUsage, Integer.valueOf(adapterPosition));
            }
        }
    }
}
