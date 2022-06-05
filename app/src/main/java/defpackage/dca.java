package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.OpenInvoicesBody;
import java.util.List;

/* renamed from: dca  reason: default package */
/* loaded from: classes2.dex */
public final class dca extends RecyclerView.Adapter<a> {
    private Context a;
    private List<OpenInvoicesBody> b;
    private djb c = new djb();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(a aVar, int i) {
        a aVar2 = aVar;
        if (this.b.get(i).invoiceNo != null) {
            aVar2.a.setText(this.b.get(i).invoiceNo);
        }
        if (this.b.get(i).invoiceDate != null) {
            if (this.c.f()) {
                aVar2.b.setText(this.b.get(i).invoiceDate);
            } else {
                aVar2.b.setText(djm.a(this.b.get(i).invoiceDate));
            }
        }
        if (this.b.get(i).dueDate != null) {
            if (this.c.f()) {
                aVar2.c.setText(this.b.get(i).dueDate);
            } else {
                aVar2.c.setText(djm.a(this.b.get(i).dueDate));
            }
        }
        if (this.b.get(i).amount != 0.0f) {
            aVar2.d.setText(String.valueOf(this.b.get(i).amount));
        }
        aVar2.e.setText(String.valueOf(this.b.get(i).openAmount));
    }

    public dca(Context context, List<OpenInvoicesBody> list) {
        this.a = context;
        this.b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        if (this.b.size() > 3) {
            return 3;
        }
        return this.b.size();
    }

    /* renamed from: dca$a */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.ViewHolder {
        TextView a;
        TextView b;
        TextView c;
        TextView d;
        TextView e;
        LinearLayout f;

        public a(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.txtInvoiceNumber);
            this.b = (TextView) view.findViewById(R.id.txtInvoiceDate);
            this.c = (TextView) view.findViewById(R.id.txtInvoiceDueDate);
            this.d = (TextView) view.findViewById(R.id.txtInvoiceBill);
            this.e = (TextView) view.findViewById(R.id.txtInvoiceOutstanding);
            this.f = (LinearLayout) view.findViewById(R.id.lnrHeader);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_invoice, viewGroup, false));
    }
}
