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
import com.ucare.we.model.family.FamilyOffersAddonsList;
import defpackage.daw;
import java.util.ArrayList;
import javax.inject.Inject;

/* renamed from: daw */
/* loaded from: classes2.dex */
public final class daw extends RecyclerView.Adapter<b> {
    djb a;
    dcq b;
    @Inject
    djw c;
    @Inject
    dio d;
    a f;
    private Context g;
    int e = -1;
    private ArrayList<FamilyOffersAddonsList> h = new ArrayList<>();

    /* renamed from: daw$a */
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
            bVar2.c.setVisibility(0);
        } else {
            bVar2.c.setVisibility(8);
        }
        bVar2.a.setText(str2);
        bVar2.b.setText(str);
    }

    public daw(Context context, ArrayList<FamilyOffersAddonsList> arrayList, dcq dcqVar) {
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

    /* renamed from: daw$b */
    /* loaded from: classes2.dex */
    public class b extends RecyclerView.ViewHolder {
        TextView a;
        TextView b;
        TextView c;
        LinearLayout d;
        Button e;
        Button f;
        LinearLayout g;

        /* renamed from: lambda$ECke4CIcYfIy0E-aRoDL01n1m7c */
        public static /* synthetic */ void m85lambda$ECke4CIcYfIy0EaRoDL01n1m7c(b bVar, View view) {
            bVar.a(view);
        }

        public static /* synthetic */ void lambda$Jhjt_or8LwMEoKFCWveqJgGwnPE(b bVar, a aVar, View view) {
            bVar.a(aVar, view);
        }

        /* renamed from: lambda$NWPsS_KCk-pK9dw9vf6EgjWx7Mo */
        public static /* synthetic */ void m86lambda$NWPsS_KCkpK9dw9vf6EgjWx7Mo(b bVar, View view) {
            bVar.b(view);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view, final a aVar) {
            super(view);
            daw.this = r2;
            this.a = (TextView) view.findViewById(R.id.tvSubscribedMoreBundleName);
            this.c = (TextView) view.findViewById(R.id.tvRegionalOffer);
            this.b = (TextView) view.findViewById(R.id.tvSubscribedMoreBundlePrice);
            this.d = (LinearLayout) view.findViewById(R.id.rlItemContainer);
            this.f = (Button) view.findViewById(R.id.btnMonthly);
            this.e = (Button) view.findViewById(R.id.btnOnce);
            this.g = (LinearLayout) view.findViewById(R.id.Limonthlyoronce);
            this.e.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$daw$b$NWPsS_KCk-pK9dw9vf6EgjWx7Mo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    daw.b.m86lambda$NWPsS_KCkpK9dw9vf6EgjWx7Mo(daw.b.this, view2);
                }
            });
            this.f.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$daw$b$ECke4CIcYfIy0E-aRoDL01n1m7c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    daw.b.m85lambda$ECke4CIcYfIy0EaRoDL01n1m7c(daw.b.this, view2);
                }
            });
            view.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$daw$b$Jhjt_or8LwMEoKFCWveqJgGwnPE
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    daw.b.lambda$Jhjt_or8LwMEoKFCWveqJgGwnPE(daw.b.this, aVar, view2);
                }
            });
        }

        public /* synthetic */ void b(View view) {
            daw.this.b.a(getAdapterPosition());
        }

        public /* synthetic */ void a(View view) {
            daw.this.b.b(getAdapterPosition());
        }

        public /* synthetic */ void a(a aVar, View view) {
            int adapterPosition;
            if (aVar != null && (adapterPosition = getAdapterPosition()) != -1) {
                aVar.onItemClick(adapterPosition);
                if (daw.this.b.c(getAdapterPosition())) {
                    if (this.g.getVisibility() == 0) {
                        this.g.setVisibility(8);
                    } else {
                        daw.this.e = getAdapterPosition();
                        this.g.setVisibility(0);
                    }
                }
            }
            for (int i = 0; i < daw.this.h.size(); i++) {
                if (i == getAdapterPosition()) {
                    ((FamilyOffersAddonsList) daw.this.h.get(i)).setShow(this.g.getVisibility() == 0);
                } else {
                    ((FamilyOffersAddonsList) daw.this.h.get(i)).setShow(false);
                }
            }
            daw.this.notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(this.g).inflate(R.layout.item_subscribed_more_bundle, viewGroup, false), this.f);
    }
}
