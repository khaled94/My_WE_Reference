package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.PaymentHistoryPostPaidModels.PaymentHistoryPostPaidResponseBody;
import java.util.List;

/* renamed from: dcg  reason: default package */
/* loaded from: classes2.dex */
public final class dcg extends RecyclerView.Adapter<a> {
    private Context a;
    private List<PaymentHistoryPostPaidResponseBody> b;
    private djb c = new djb();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(a aVar, int i) {
        a aVar2 = aVar;
        if (this.c.f()) {
            aVar2.b.setText(this.b.get(i).paymentLogDate);
        } else {
            aVar2.b.setText(djm.a(this.b.get(i).paymentLogDate));
        }
        aVar2.c.setText(String.valueOf(this.b.get(i).paymentLogAmount));
        aVar2.d.setText(this.b.get(i).paymentChannel);
    }

    public dcg(Context context, List<PaymentHistoryPostPaidResponseBody> list) {
        this.a = context;
        this.b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.b.size();
    }

    /* renamed from: dcg$a */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.ViewHolder {
        private TextView b;
        private TextView c;
        private TextView d;

        public a(View view) {
            super(view);
            this.b = (TextView) view.findViewById(R.id.txtPaymentDate);
            this.c = (TextView) view.findViewById(R.id.txtPaymentAmount);
            this.d = (TextView) view.findViewById(R.id.txtPaymentChannel);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.raw_payment_history, viewGroup, false));
    }
}
