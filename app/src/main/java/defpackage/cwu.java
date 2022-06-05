package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.MainPlanResponseBody;
import java.util.ArrayList;

/* renamed from: cwu  reason: default package */
/* loaded from: classes2.dex */
public final class cwu extends RecyclerView.Adapter<b> {
    public ArrayList<MainPlanResponseBody> a;
    private final a b;
    private Context c;

    /* renamed from: cwu$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(MainPlanResponseBody mainPlanResponseBody);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(b bVar, int i) {
        b bVar2 = bVar;
        MainPlanResponseBody mainPlanResponseBody = this.a.get(i);
        bVar2.a.setText(mainPlanResponseBody.getServiceName());
        bVar2.b.setText(mainPlanResponseBody.getRenewalDate());
        TextView textView = bVar2.c;
        textView.setText(mainPlanResponseBody.getRemainingDaysForRenewal() + " " + this.c.getString(R.string.days));
        TextView textView2 = bVar2.d;
        textView2.setText(mainPlanResponseBody.getPrice() + " " + this.c.getString(R.string.egp));
    }

    public cwu(a aVar, Context context) {
        this.b = aVar;
        this.c = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList<MainPlanResponseBody> arrayList = this.a;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* renamed from: cwu$b */
    /* loaded from: classes2.dex */
    public class b extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final TextView a;
        public final TextView b;
        public final TextView c;
        public final TextView d;
        public final TextView e;

        public b(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.tv_bundle_name);
            this.b = (TextView) view.findViewById(R.id.tv_renewal_date);
            this.c = (TextView) view.findViewById(R.id.tv_remaining_days);
            this.d = (TextView) view.findViewById(R.id.tv_cost);
            TextView textView = (TextView) view.findViewById(R.id.tv_unsubscribe_bundle);
            this.e = textView;
            textView.setOnClickListener(new View.OnClickListener() { // from class: cwu.b.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int adapterPosition = b.this.getAdapterPosition();
                    cwu.this.b.a((MainPlanResponseBody) cwu.this.a.get(adapterPosition));
                }
            });
            view.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cwu.this.a.get(getAdapterPosition());
            a unused = cwu.this.b;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bundle_item, viewGroup, false));
    }
}
