package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.BalanceTransferHistoryModel.BalanceTransferHistoryItem;
import java.util.List;

/* renamed from: cxq  reason: default package */
/* loaded from: classes2.dex */
public final class cxq extends RecyclerView.Adapter<a> {
    private Context a;
    private List<BalanceTransferHistoryItem> b;
    private djb c = new djb();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(a aVar, int i) {
        a aVar2 = aVar;
        aVar2.b.setText(this.b.get(i).getDate());
        aVar2.c.setText(String.valueOf(this.b.get(i).getAmount()));
        aVar2.d.setText(this.b.get(i).getMsisnd());
    }

    public cxq(Context context, List<BalanceTransferHistoryItem> list) {
        this.a = context;
        this.b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.b.size();
    }

    /* renamed from: cxq$a */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.ViewHolder {
        private TextView b;
        private TextView c;
        private TextView d;

        public a(View view) {
            super(view);
            this.b = (TextView) view.findViewById(R.id.txtTransferDate);
            this.c = (TextView) view.findViewById(R.id.txtTransferAmount);
            this.d = (TextView) view.findViewById(R.id.txtTransferTo);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.balance_transfer_history_item, viewGroup, false));
    }
}
