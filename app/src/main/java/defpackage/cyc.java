package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.BillSummaryModel.ResponseBillSummaryBody;
import java.util.ArrayList;

/* renamed from: cyc  reason: default package */
/* loaded from: classes2.dex */
public final class cyc extends RecyclerView.Adapter<b> {
    a a;
    private Context b;
    private ArrayList<ResponseBillSummaryBody> c;

    /* renamed from: cyc$a */
    /* loaded from: classes2.dex */
    public interface a {
        void onItemClick(int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(b bVar, int i) {
        String str;
        b bVar2 = bVar;
        TextView textView = bVar2.a;
        Context context = this.b;
        ResponseBillSummaryBody responseBillSummaryBody = this.c.get(i);
        if (responseBillSummaryBody.getBillCycleId().substring(4, 6).equals("01")) {
            str = context.getString(R.string.jan) + responseBillSummaryBody.getBillCycleId().substring(0, 4);
        } else if (responseBillSummaryBody.getBillCycleId().substring(4, 6).equals("02")) {
            str = context.getString(R.string.feb) + responseBillSummaryBody.getBillCycleId().substring(0, 4);
        } else if (responseBillSummaryBody.getBillCycleId().substring(4, 6).equals("03")) {
            str = context.getString(R.string.mar) + responseBillSummaryBody.getBillCycleId().substring(0, 4);
        } else if (responseBillSummaryBody.getBillCycleId().substring(4, 6).equals("03")) {
            str = context.getString(R.string.mar) + responseBillSummaryBody.getBillCycleId().substring(0, 4);
        } else if (responseBillSummaryBody.getBillCycleId().substring(4, 6).equals("04")) {
            str = context.getString(R.string.apr) + responseBillSummaryBody.getBillCycleId().substring(0, 4);
        } else if (responseBillSummaryBody.getBillCycleId().substring(4, 6).equals("05")) {
            str = context.getString(R.string.may) + responseBillSummaryBody.getBillCycleId().substring(0, 4);
        } else if (responseBillSummaryBody.getBillCycleId().substring(4, 6).equals("06")) {
            str = context.getString(R.string.june) + responseBillSummaryBody.getBillCycleId().substring(0, 4);
        } else if (responseBillSummaryBody.getBillCycleId().substring(4, 6).equals("07")) {
            str = context.getString(R.string.july) + responseBillSummaryBody.getBillCycleId().substring(0, 4);
        } else if (responseBillSummaryBody.getBillCycleId().substring(4, 6).equals("08")) {
            str = context.getString(R.string.aug) + responseBillSummaryBody.getBillCycleId().substring(0, 4);
        } else if (responseBillSummaryBody.getBillCycleId().substring(4, 6).equals("09")) {
            str = context.getString(R.string.sep) + responseBillSummaryBody.getBillCycleId().substring(0, 4);
        } else if (responseBillSummaryBody.getBillCycleId().substring(4, 6).equals("10")) {
            str = context.getString(R.string.oct) + responseBillSummaryBody.getBillCycleId().substring(0, 4);
        } else if (responseBillSummaryBody.getBillCycleId().substring(4, 6).equals("11")) {
            str = context.getString(R.string.nov) + responseBillSummaryBody.getBillCycleId().substring(0, 4);
        } else if (responseBillSummaryBody.getBillCycleId().substring(4, 6).equals("12")) {
            str = context.getString(R.string.dec) + responseBillSummaryBody.getBillCycleId().substring(0, 4);
        } else {
            str = "";
        }
        textView.setText(str);
        bVar2.b.setText(this.b.getString(R.string.from) + " " + djm.a(this.b, this.c.get(i).getBillCycleBeginTime().substring(5, 7)) + " " + this.c.get(i).getBillCycleBeginTime().substring(8, 10) + " " + this.b.getString(R.string.to) + " " + djm.a(this.b, this.c.get(i).getBillCycleEndTime().substring(5, 7)) + " " + this.c.get(i).getBillCycleEndTime().substring(8, 10));
        if (i % 2 != 0) {
            bVar2.c.setBackgroundColor(Color.rgb(250, 250, 250));
        } else {
            bVar2.c.setBackgroundColor(-1);
        }
    }

    public cyc(Context context, ArrayList<ResponseBillSummaryBody> arrayList) {
        this.b = context;
        this.c = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    /* renamed from: cyc$b */
    /* loaded from: classes2.dex */
    public class b extends RecyclerView.ViewHolder {
        TextView a;
        TextView b;
        LinearLayout c;

        public b(View view, final a aVar) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.tvBillSummaryDate);
            this.b = (TextView) view.findViewById(R.id.tvBillSummaryPeriod);
            this.c = (LinearLayout) view.findViewById(R.id.rlItemContainer);
            view.setOnClickListener(new View.OnClickListener() { // from class: cyc.b.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int adapterPosition;
                    if (aVar == null || (adapterPosition = b.this.getAdapterPosition()) == -1) {
                        return;
                    }
                    aVar.onItemClick(adapterPosition);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(this.b).inflate(R.layout.item_bill_summary, viewGroup, false), this.a);
    }
}
