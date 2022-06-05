package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.MoreBundleModel.AvailableAddOnOfferingList;
import com.ucare.we.view.AppCompatTextView;
import defpackage.ded;
import java.util.ArrayList;

/* renamed from: ded */
/* loaded from: classes2.dex */
public final class ded extends RecyclerView.Adapter<b> {
    djb a;
    dcq b;
    djw c;
    dio d;
    a f;
    private Context g;
    int e = -1;
    private ArrayList<AvailableAddOnOfferingList> h = new ArrayList<>();

    /* renamed from: ded$a */
    /* loaded from: classes2.dex */
    public interface a {
        void onItemClick(int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(b bVar, int i) {
        String str;
        String str2;
        b bVar2 = bVar;
        if (this.a.f()) {
            str2 = this.h.get(i).getOfferArName();
            str = String.valueOf(this.h.get(i).getPrice());
        } else {
            str2 = this.h.get(i).getOfferEnName();
            str = String.valueOf(this.h.get(i).getPrice());
        }
        if (i % 2 != 0) {
            bVar2.d.setBackgroundColor(Color.rgb(250, 250, 250));
        } else {
            bVar2.d.setBackgroundColor(-1);
        }
        if (this.h.get(i).isShow()) {
            bVar2.g.setVisibility(0);
        } else {
            bVar2.g.setVisibility(8);
        }
        if ((!this.c.O() || !this.d.g()) && this.h.get(i).getRegional().booleanValue()) {
            bVar2.h.setVisibility(0);
        } else {
            bVar2.h.setVisibility(4);
        }
        if ((!this.c.O() || !this.d.g()) && this.h.get(i).getRegional().booleanValue()) {
            bVar2.c.setVisibility(0);
        } else {
            bVar2.c.setVisibility(8);
        }
        bVar2.a.setText(str2);
        bVar2.b.setText(str);
    }

    public ded(Context context, ArrayList<AvailableAddOnOfferingList> arrayList, dcq dcqVar) {
        this.b = dcqVar;
        this.g = context;
        for (int i = 0; i < arrayList.size(); i++) {
            if (!arrayList.get(i).isAlreadySubscribed()) {
                this.h.add(arrayList.get(i));
            }
        }
        this.a = new djb();
        this.c = new djw();
        this.d = new dio();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.h.size();
    }

    /* renamed from: ded$b */
    /* loaded from: classes2.dex */
    public class b extends RecyclerView.ViewHolder {
        TextView a;
        TextView b;
        TextView c;
        LinearLayout d;
        Button e;
        Button f;
        LinearLayout g;
        AppCompatTextView h;

        /* renamed from: lambda$ZqdizadG-IvSnpgQypRghGtsyzM */
        public static /* synthetic */ void m106lambda$ZqdizadGIvSnpgQypRghGtsyzM(b bVar, a aVar, View view) {
            bVar.a(aVar, view);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view, final a aVar) {
            super(view);
            ded.this = r1;
            this.a = (TextView) view.findViewById(R.id.tvSubscribedMoreBundleName);
            this.c = (TextView) view.findViewById(R.id.tvRegionalOffer);
            this.b = (TextView) view.findViewById(R.id.tvSubscribedMoreBundlePrice);
            this.d = (LinearLayout) view.findViewById(R.id.rlItemContainer);
            this.f = (Button) view.findViewById(R.id.btnMonthly);
            this.e = (Button) view.findViewById(R.id.btnOnce);
            this.g = (LinearLayout) view.findViewById(R.id.Limonthlyoronce);
            this.h = (AppCompatTextView) view.findViewById(R.id.llSubscribeSpecialTag);
            view.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$ded$b$ZqdizadG-IvSnpgQypRghGtsyzM
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ded.b.m106lambda$ZqdizadGIvSnpgQypRghGtsyzM(ded.b.this, aVar, view2);
                }
            });
        }

        public /* synthetic */ void a(a aVar, View view) {
            int adapterPosition;
            if (aVar != null && (adapterPosition = getAdapterPosition()) != -1) {
                aVar.onItemClick(adapterPosition);
                ded.this.b.c(getAdapterPosition());
            }
            for (int i = 0; i < ded.this.h.size(); i++) {
                if (i == getAdapterPosition()) {
                    ((AvailableAddOnOfferingList) ded.this.h.get(i)).setShow(this.g.getVisibility() == 0);
                } else {
                    ((AvailableAddOnOfferingList) ded.this.h.get(i)).setShow(false);
                }
            }
            ded.this.notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(this.g).inflate(R.layout.item_subscribed_more_bundle, viewGroup, false), this.f);
    }
}
