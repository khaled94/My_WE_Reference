package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.PlansAndBundlesResponseBody;
import java.util.ArrayList;

/* renamed from: cxd  reason: default package */
/* loaded from: classes2.dex */
public final class cxd extends RecyclerView.Adapter<a> {
    private final b a;
    private ArrayList<PlansAndBundlesResponseBody> b;

    /* renamed from: cxd$b */
    /* loaded from: classes2.dex */
    public interface b {
        void a(PlansAndBundlesResponseBody plansAndBundlesResponseBody);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(a aVar, int i) {
        aVar.a.setText(this.b.get(i).getOfferEnName());
    }

    public cxd(b bVar) {
        this.a = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList<PlansAndBundlesResponseBody> arrayList = this.b;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void a(ArrayList<PlansAndBundlesResponseBody> arrayList) {
        this.b = arrayList;
        notifyDataSetChanged();
    }

    /* renamed from: cxd$a */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final TextView a;

        public a(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.tv_plan_title);
            view.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int adapterPosition = getAdapterPosition();
            cxd.this.a.a((PlansAndBundlesResponseBody) cxd.this.b.get(adapterPosition));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.plan_item, viewGroup, false));
    }
}
