package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.remote.dueamount.Offer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;

/* renamed from: dgy  reason: default package */
/* loaded from: classes2.dex */
public final class dgy extends RecyclerView.Adapter<a> {
    public List<Offer> b = new ArrayList();
    @Inject
    public djw a = new djw();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(a aVar, int i) {
        a aVar2 = aVar;
        Offer offer = this.b.get(i);
        if (this.a.k().equals("ar")) {
            aVar2.a.setText(offer.getOfferArName());
        } else {
            aVar2.a.setText(offer.getOfferEnName());
        }
        if (offer.getRenewalDate() != null) {
            aVar2.b.setText(a(offer.getRenewalDate()));
        }
        aVar2.c.setText(offer.getPrice().toString());
    }

    private String a(String str) {
        try {
            return new SimpleDateFormat(this.a.k().equals("en") ? "dd-MM-yyyy" : "yyyy-MM-dd", new Locale("en")).format(new SimpleDateFormat("yyyy-MM-dd", new Locale("en")).parse(str));
        } catch (ParseException e) {
            e.getLocalizedMessage();
            e.printStackTrace();
            return null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.b.size();
    }

    /* renamed from: dgy$a */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.ViewHolder {
        private final TextView a;
        private final TextView b;
        private final TextView c;
        private final View d;

        public a(View view) {
            super(view);
            this.d = view;
            this.a = (TextView) view.findViewById(R.id.tvService);
            this.b = (TextView) view.findViewById(R.id.tvDueDate);
            this.c = (TextView) view.findViewById(R.id.tvRental);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_required_balance, viewGroup, false));
    }
}
