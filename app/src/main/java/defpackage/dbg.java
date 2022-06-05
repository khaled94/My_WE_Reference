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
import com.ucare.we.model.family.FamilyAvailableOffersAddonsList;
import java.util.ArrayList;

/* renamed from: dbg  reason: default package */
/* loaded from: classes2.dex */
public final class dbg extends RecyclerView.Adapter<b> {
    djb a = new djb();
    public a b;
    private Context c;
    private ArrayList<FamilyAvailableOffersAddonsList> d;

    /* renamed from: dbg$a */
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
            bVar2.b.setBackgroundColor(Color.rgb(250, 250, 250));
        } else {
            bVar2.b.setBackgroundColor(-1);
        }
        bVar2.a.setText(str);
    }

    public dbg(Context context, ArrayList<FamilyAvailableOffersAddonsList> arrayList) {
        this.c = context;
        this.d = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList<FamilyAvailableOffersAddonsList> arrayList = this.d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* renamed from: dbg$b */
    /* loaded from: classes2.dex */
    public class b extends RecyclerView.ViewHolder {
        TextView a;
        LinearLayout b;

        public b(View view, final a aVar) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.tvMoreBundleName);
            if (dbg.this.a.g().equalsIgnoreCase("ar")) {
                this.a.setGravity(5);
            } else {
                this.a.setGravity(3);
            }
            this.b = (LinearLayout) view.findViewById(R.id.rlItemContainer);
            view.setOnClickListener(new View.OnClickListener() { // from class: dbg.b.1
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
