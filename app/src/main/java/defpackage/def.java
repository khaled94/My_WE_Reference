package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.family.FamilyPlansResponseBody;
import defpackage.def;
import java.util.List;
import javax.inject.Inject;

/* renamed from: def */
/* loaded from: classes2.dex */
public final class def extends RecyclerView.Adapter<a> {
    @Inject
    dio a;
    djw b = new djw();
    deh c;
    Boolean d;
    private Context e;
    private List<FamilyPlansResponseBody> f;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(a aVar, int i) {
        a aVar2 = aVar;
        if (this.b.k().equalsIgnoreCase("en")) {
            aVar2.a.setText(this.f.get(i).getOfferEnName());
            aVar2.f.setText(String.valueOf(this.f.get(i).getPrice()));
        } else {
            aVar2.a.setText(this.f.get(i).getOfferArName());
            aVar2.f.setText(String.valueOf(this.f.get(i).getPrice()));
        }
        aVar2.g.setTag(Integer.valueOf(i));
    }

    public def(Context context, Boolean bool, List<FamilyPlansResponseBody> list, deh dehVar) {
        this.e = context;
        this.f = list;
        this.c = dehVar;
        this.d = bool;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f.size();
    }

    /* renamed from: def$a */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.ViewHolder {
        TextView a;
        TextView b;
        TextView c;
        TextView d;
        TextView e;
        TextView f;
        LinearLayout g;

        /* renamed from: lambda$n_7I9BiXoSqm_QRp8-niclcdJ0k */
        public static /* synthetic */ void m107lambda$n_7I9BiXoSqm_QRp8niclcdJ0k(a aVar, View view) {
            aVar.a(view);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            def.this = r2;
            this.a = (TextView) view.findViewById(R.id.txtMainPlan);
            this.g = (LinearLayout) view.findViewById(R.id.lnrMigrate);
            this.b = (TextView) view.findViewById(R.id.mig);
            this.e = (TextView) view.findViewById(R.id.tvALlUsersSplitter);
            this.d = (TextView) view.findViewById(R.id.tvMobilePostPaidSplitter);
            this.c = (TextView) view.findViewById(R.id.tvMoreDetails);
            this.f = (TextView) view.findViewById(R.id.tvPrice);
            this.c.setOnClickListener(new View.OnClickListener() { // from class: def.a.1
                {
                    a.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int adapterPosition = a.this.getAdapterPosition();
                    if (((FamilyPlansResponseBody) def.this.f.get(adapterPosition)).getOfferDetails() != null) {
                        def.this.c.a(((FamilyPlansResponseBody) def.this.f.get(adapterPosition)).getOfferDetails().getUrlEn(), ((FamilyPlansResponseBody) def.this.f.get(adapterPosition)).getOfferDetails().getUrlAr());
                    } else {
                        def.this.c.a("", "");
                    }
                }
            });
            this.b.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$def$a$n_7I9BiXoSqm_QRp8-niclcdJ0k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    def.a.m107lambda$n_7I9BiXoSqm_QRp8niclcdJ0k(def.a.this, view2);
                }
            });
        }

        public /* synthetic */ void a(View view) {
            int adapterPosition = getAdapterPosition();
            def.this.c.a(adapterPosition, (FamilyPlansResponseBody) def.this.f.get(adapterPosition));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(this.d.booleanValue() ? R.layout.row_createfamilygroup_plans : R.layout.row_available_plans, viewGroup, false));
    }
}
