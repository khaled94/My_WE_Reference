package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.MoreBundleModel.PurchasedAddOnOfferingsList;
import defpackage.day;
import java.util.ArrayList;
import javax.inject.Inject;

/* renamed from: day */
/* loaded from: classes2.dex */
public final class day extends RecyclerView.Adapter<b> {
    dhp b;
    a d;
    private Context f;
    private ArrayList<PurchasedAddOnOfferingsList> g;
    private dbb h;
    View.OnClickListener e = new View.OnClickListener() { // from class: day.1
        {
            day.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (view.getTag() != null) {
                int intValue = ((Integer) view.getTag()).intValue();
                if (((PurchasedAddOnOfferingsList) day.this.g.get(intValue)).getOfferId() == null) {
                    return;
                }
                if (day.this.i.f()) {
                    day.this.h.a(((PurchasedAddOnOfferingsList) day.this.g.get(intValue)).getOfferArName(), ((PurchasedAddOnOfferingsList) day.this.g.get(intValue)).getOfferId());
                } else {
                    day.this.h.a(((PurchasedAddOnOfferingsList) day.this.g.get(intValue)).getOfferEnName(), ((PurchasedAddOnOfferingsList) day.this.g.get(intValue)).getOfferId());
                }
            }
        }
    };
    private djb i = new djb();
    djw c = new djw();
    @Inject
    dio a = new dio();

    /* renamed from: day$a */
    /* loaded from: classes2.dex */
    public interface a {
        void onDeleteClick(int i);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fb A[Catch: Exception -> 0x0212, TryCatch #0 {Exception -> 0x0212, blocks: (B:63:0x01f5, B:65:0x01fb, B:67:0x020c), top: B:71:0x01f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x020c A[Catch: Exception -> 0x0212, TRY_LEAVE, TryCatch #0 {Exception -> 0x0212, blocks: (B:63:0x01f5, B:65:0x01fb, B:67:0x020c), top: B:71:0x01f5 }] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void onBindViewHolder(defpackage.day.b r11, int r12) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.day.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    public day(Context context, ArrayList<PurchasedAddOnOfferingsList> arrayList, dbb dbbVar, dhp dhpVar) {
        this.f = context;
        this.g = arrayList;
        this.h = dbbVar;
        this.b = dhpVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.g.size();
    }

    private static boolean a(String str) {
        return str != null && !str.isEmpty() && !str.equals("");
    }

    /* renamed from: day$b */
    /* loaded from: classes2.dex */
    public class b extends RecyclerView.ViewHolder {
        TextView a;
        TextView b;
        TextView c;
        TextView d;
        TextView e;
        TextView f;
        Button g;

        public static /* synthetic */ void lambda$YQgswbpZMfnHnzAglRMjzJJCdtA(b bVar, View view) {
            bVar.a(view);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            day.this = r2;
            this.a = (TextView) view.findViewById(R.id.tv_renewal_date);
            this.b = (TextView) view.findViewById(R.id.tvDate);
            this.c = (TextView) view.findViewById(R.id.tv_remaining_days);
            this.d = (TextView) view.findViewById(R.id.tv_cost);
            this.e = (TextView) view.findViewById(R.id.tv_offer_name);
            this.f = (TextView) view.findViewById(R.id.btn_unsubscribe);
            this.g = (Button) view.findViewById(R.id.btnRenew);
            if (r2.a.e()) {
                if (r2.a.h() && r2.b.g.getUnsubscribeBundleButton() != null && !r2.b.g.getUnsubscribeBundleButton().contains(r2.c.w())) {
                    this.f.setVisibility(8);
                    this.g.setVisibility(8);
                } else {
                    this.f.setVisibility(0);
                    this.g.setVisibility(0);
                }
            }
            this.f.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$day$b$YQgswbpZMfnHnzAglRMjzJJCdtA
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    day.b.lambda$YQgswbpZMfnHnzAglRMjzJJCdtA(day.b.this, view2);
                }
            });
        }

        public /* synthetic */ void a(View view) {
            int adapterPosition = getAdapterPosition();
            if (adapterPosition != -1) {
                day.this.d.onDeleteClick(adapterPosition);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(this.f).inflate(R.layout.item_subscribed_bundle, viewGroup, false));
    }
}
