package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.AssociatedNumberResponseBody;
import java.util.ArrayList;

/* renamed from: cws  reason: default package */
/* loaded from: classes2.dex */
public final class cws extends RecyclerView.Adapter<b> {
    boolean a;
    public ArrayList<AssociatedNumberResponseBody> b;
    private final a c;

    /* renamed from: cws$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(AssociatedNumberResponseBody associatedNumberResponseBody);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(b bVar, int i) {
        b bVar2 = bVar;
        bVar2.a.setText(this.b.get(i).getMobileNumber());
        if (this.a) {
            bVar2.b.setVisibility(8);
        }
    }

    public cws(a aVar, boolean z) {
        this.c = aVar;
        this.a = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList<AssociatedNumberResponseBody> arrayList = this.b;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* renamed from: cws$b */
    /* loaded from: classes2.dex */
    public class b extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final TextView a;
        public final TextView b;

        public b(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.tv_number);
            this.b = (TextView) view.findViewById(R.id.tv_remove_number);
            view.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int adapterPosition = getAdapterPosition();
            cws.this.c.a((AssociatedNumberResponseBody) cws.this.b.get(adapterPosition));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_number, viewGroup, false));
    }
}
