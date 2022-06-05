package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.PaymentHistoryResponseBody;
import java.util.ArrayList;

/* renamed from: cxb  reason: default package */
/* loaded from: classes2.dex */
public final class cxb extends RecyclerView.Adapter<a> {
    public ArrayList<PaymentHistoryResponseBody> a;
    private djb b = new djb();
    private Context c;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(a aVar, int i) {
        a aVar2 = aVar;
        PaymentHistoryResponseBody paymentHistoryResponseBody = this.a.get(i);
        if (this.b.f()) {
            aVar2.a.setText(paymentHistoryResponseBody.getRechargeLogDate());
        } else {
            aVar2.a.setText(djm.a(paymentHistoryResponseBody.getRechargeLogDate()));
        }
        TextView textView = aVar2.b;
        StringBuilder sb = new StringBuilder();
        sb.append(paymentHistoryResponseBody.getRechargeLogAmount());
        textView.setText(sb.toString());
        TextView textView2 = aVar2.c;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(paymentHistoryResponseBody.getNewBalanceAmount());
        textView2.setText(sb2.toString());
        if (paymentHistoryResponseBody.getRechargeType().equalsIgnoreCase("0")) {
            aVar2.d.setText(this.c.getString(R.string.voucher));
        } else {
            aVar2.d.setText(this.c.getString(R.string.cash));
        }
        aVar2.e.setText(paymentHistoryResponseBody.getRechargeChannel());
    }

    public cxb(Context context) {
        this.c = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList<PaymentHistoryResponseBody> arrayList = this.a;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* renamed from: cxb$a */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.ViewHolder {
        public final TextView a;
        public final TextView b;
        public final TextView c;
        public final TextView d;
        public final TextView e;

        public a(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.tv_payment_date);
            this.b = (TextView) view.findViewById(R.id.tv_payment_amount);
            this.c = (TextView) view.findViewById(R.id.tv_payment_credit);
            this.d = (TextView) view.findViewById(R.id.tv_transaction_type);
            this.e = (TextView) view.findViewById(R.id.tv_channel_type);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_history_item, viewGroup, false));
    }
}
