package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import java.util.ArrayList;

/* renamed from: das  reason: default package */
/* loaded from: classes2.dex */
public final class das extends RecyclerView.Adapter<b> {
    public a a;
    private Context b;
    private ArrayList<String> c;

    /* renamed from: das$a */
    /* loaded from: classes2.dex */
    public interface a {
        void onItemClick(int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(b bVar, int i) {
        b bVar2 = bVar;
        bVar2.a.setText(this.c.get(i));
        if (i % 2 != 0) {
            bVar2.b.setBackgroundColor(Color.rgb(250, 250, 250));
        } else {
            bVar2.b.setBackgroundColor(-1);
        }
    }

    public das(Context context, ArrayList<String> arrayList) {
        this.b = context;
        this.c = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    /* renamed from: das$b */
    /* loaded from: classes2.dex */
    public class b extends RecyclerView.ViewHolder {
        TextView a;
        RelativeLayout b;

        public b(View view, final a aVar) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.tvMSISDN);
            this.b = (RelativeLayout) view.findViewById(R.id.rlMSISDNItem);
            view.setOnClickListener(new View.OnClickListener() { // from class: das.b.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.onItemClick(b.this.getAbsoluteAdapterPosition());
                    }
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(this.b).inflate(R.layout.fmc_msisdn_picker_item, viewGroup, false), this.a);
    }
}
