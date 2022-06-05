package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.PlansAndBundlesResponseBody;
import defpackage.dal;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;

/* renamed from: dal */
/* loaded from: classes2.dex */
public final class dal extends RecyclerView.Adapter<a> {
    dhp a;
    dar d;
    Boolean e;
    private final Context f;
    private final List<PlansAndBundlesResponseBody> g;
    private int h = -1;
    djw c = new djw();
    @Inject
    dio b = new dio();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(a aVar, int i) {
        final a aVar2 = aVar;
        if (this.c.k().equalsIgnoreCase("en")) {
            aVar2.a.setText(this.g.get(i).getOfferEnName());
        } else {
            aVar2.a.setText(this.g.get(i).getOfferArName());
        }
        Locale locale = Locale.ENGLISH;
        String string = this.f.getString(R.string.managePlanFragment_planPrice);
        StringBuilder sb = new StringBuilder();
        sb.append(this.g.get(i).getPrice());
        String format = String.format(locale, string, sb.toString());
        int i2 = R.drawable.ic_mobile_number;
        try {
            bo.b(this.f).a(this.g.get(i).getOfferDetails().getIconUrl()).a(this.b.f() ? R.drawable.ic_mobile_number : R.drawable.ic_fbb_number).b(this.b.f() ? R.drawable.ic_mobile_number : R.drawable.ic_fbb_number).a(aVar2.g);
        } catch (Exception unused) {
            bu<Drawable> a2 = bo.b(this.f).a(Integer.valueOf(this.b.f() ? R.drawable.ic_mobile_number : R.drawable.ic_fbb_number));
            if (!this.b.f()) {
                i2 = R.drawable.ic_fbb_number;
            }
            a2.a(i2).a(aVar2.g);
        }
        aVar2.b.setText(format);
        aVar2.c.setTag(Integer.valueOf(i));
        aVar2.e.setVisibility(8);
        aVar2.f.setRotation(0.0f);
        aVar2.f.setOnClickListener(new View.OnClickListener() { // from class: dal.1
            {
                dal.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (aVar2.e.getVisibility() != 0) {
                    aVar2.e.setVisibility(0);
                    aVar2.f.setRotation(180.0f);
                    return;
                }
                aVar2.e.setVisibility(8);
                aVar2.f.setRotation(0.0f);
            }
        });
        if (this.b.f() && this.b.e() && (!this.b.h() || !this.a.b().booleanValue())) {
            aVar2.i.setVisibility(8);
        }
        if (this.b.h()) {
            if (this.a.b().booleanValue()) {
                aVar2.i.setVisibility(0);
            } else {
                aVar2.i.setVisibility(8);
            }
        }
        if (this.g.get(i).getRegional() != null) {
            if (this.g.get(i).getRegional().booleanValue() && !this.e.booleanValue() && this.b.g() && !this.b.l()) {
                aVar2.d.setVisibility(0);
            } else {
                aVar2.d.setVisibility(8);
            }
        }
    }

    public dal(Context context, List<PlansAndBundlesResponseBody> list, Boolean bool, dhp dhpVar, dar darVar) {
        this.f = context;
        this.g = list;
        this.e = bool;
        this.d = darVar;
        this.a = dhpVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.g.size();
    }

    /* renamed from: dal$a */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.ViewHolder {
        TextView a;
        TextView b;
        CardView c;
        AppCompatTextView d;
        LinearLayoutCompat e;
        ImageView f;
        ImageView g;
        Button h;
        Button i;

        /* renamed from: lambda$H-PwdkJa6rvxJb6HyGZ02OZxpAs */
        public static /* synthetic */ void m84lambda$HPwdkJa6rvxJb6HyGZ02OZxpAs(a aVar, View view) {
            aVar.a(view);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            dal.this = r2;
            this.a = (TextView) view.findViewById(R.id.txtMainPlan);
            this.c = (CardView) view.findViewById(R.id.lnrMigrate);
            this.d = (AppCompatTextView) view.findViewById(R.id.tvSpecialOffer);
            this.e = (LinearLayoutCompat) view.findViewById(R.id.ll_sub_moreDetails);
            this.f = (ImageView) view.findViewById(R.id.ic_drop_down);
            this.g = (ImageView) view.findViewById(R.id.im_mainPlan);
            this.h = (Button) view.findViewById(R.id.btn_moreDetail);
            this.i = (Button) view.findViewById(R.id.btnMig);
            this.b = (TextView) view.findViewById(R.id.tvPrice);
            this.h.setOnClickListener(new View.OnClickListener() { // from class: dal.a.1
                {
                    a.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int adapterPosition = a.this.getAdapterPosition();
                    if (((PlansAndBundlesResponseBody) dal.this.g.get(adapterPosition)).getOfferDetails() != null) {
                        dal.this.d.a(((PlansAndBundlesResponseBody) dal.this.g.get(adapterPosition)).getOfferDetails().getUrlEn(), ((PlansAndBundlesResponseBody) dal.this.g.get(adapterPosition)).getOfferDetails().getUrlAr());
                    }
                }
            });
            this.i.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$dal$a$H-PwdkJa6rvxJb6HyGZ02OZxpAs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    dal.a.m84lambda$HPwdkJa6rvxJb6HyGZ02OZxpAs(dal.a.this, view2);
                }
            });
        }

        public /* synthetic */ void a(View view) {
            dal.this.d.a((PlansAndBundlesResponseBody) dal.this.g.get(getAdapterPosition()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_available_plans_new, viewGroup, false));
    }
}
