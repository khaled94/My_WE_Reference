package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import java.util.List;
import javax.inject.Inject;

/* renamed from: cxe  reason: default package */
/* loaded from: classes2.dex */
public final class cxe extends RecyclerView.Adapter<b> {
    @Inject
    Context a;
    public List<String> b;
    private final a c;

    /* renamed from: cxe$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(String str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(b bVar, int i) {
        bVar.a.setText(this.b.get(i) + this.a.getString(R.string.blance_egp));
    }

    public cxe(a aVar) {
        this.c = aVar;
        dad.a().a.inject(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List<String> list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: cxe$b */
    /* loaded from: classes2.dex */
    public class b extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final Button a;

        public b(View view) {
            super(view);
            this.a = (Button) view.findViewById(R.id.btn_amount);
            view.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int adapterPosition = getAdapterPosition();
            cxe.this.c.a((String) cxe.this.b.get(adapterPosition));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_amount, viewGroup, false));
    }
}
