package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.MoreBundleModel.AvailableAddOnOfferingsList;
import java.util.ArrayList;

/* renamed from: dbc  reason: default package */
/* loaded from: classes2.dex */
public final class dbc extends RecyclerView.Adapter<b> {
    djb a = new djb();
    a b;
    private Context c;
    private ArrayList<AvailableAddOnOfferingsList> d;

    /* renamed from: dbc$a */
    /* loaded from: classes2.dex */
    public interface a {
        void onItemClick(int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(b bVar, int i) {
        String str;
        b bVar2 = bVar;
        if (this.a.f()) {
            str = this.d.get(i).getGroupArName();
        } else {
            str = this.d.get(i).getGroupEnName();
        }
        if (i % 2 != 0) {
            bVar2.c.setBackgroundColor(Color.rgb(250, 250, 250));
        } else {
            bVar2.c.setBackgroundColor(-1);
        }
        try {
        } catch (NullPointerException unused) {
            bo.b(this.c).a(Integer.valueOf((int) R.drawable.ic_icon_more_bundle_item)).a((int) R.drawable.ic_icon_more_bundle_item).a(bVar2.b);
        }
        if (this.d.get(i).getIconUrl() == null && this.d.get(i).getIconUrl().isEmpty()) {
            bo.b(this.c).a(Integer.valueOf((int) R.drawable.ic_icon_more_bundle_item)).a((int) R.drawable.ic_icon_more_bundle_item).a(bVar2.b);
            bVar2.a.setText(str);
        }
        bo.b(this.c).a(this.d.get(i).getIconUrl()).a((int) R.drawable.ic_icon_more_bundle_item).b(R.drawable.ic_icon_more_bundle_item).a(bVar2.b);
        bVar2.a.setText(str);
    }

    public dbc(Context context, ArrayList<AvailableAddOnOfferingsList> arrayList) {
        this.c = context;
        this.d = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.d.size();
    }

    /* renamed from: dbc$b */
    /* loaded from: classes2.dex */
    public class b extends RecyclerView.ViewHolder {
        TextView a;
        ImageView b;
        LinearLayout c;

        public b(View view, final a aVar) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.tvMoreBundleName);
            this.b = (ImageView) view.findViewById(R.id.imageView);
            if (dbc.this.a.g().equalsIgnoreCase("ar")) {
                this.a.setGravity(5);
            } else {
                this.a.setGravity(3);
            }
            this.c = (LinearLayout) view.findViewById(R.id.rlItemContainer);
            view.setOnClickListener(new View.OnClickListener() { // from class: dbc.b.1
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
        return new b(LayoutInflater.from(this.c).inflate(R.layout.item_more_bundle, viewGroup, false), this.b);
    }
}
