package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.MoreBundleModel.AvailableAddOnOfferingList;
import defpackage.dbh;
import java.util.ArrayList;

/* renamed from: dbh */
/* loaded from: classes2.dex */
public final class dbh extends RecyclerView.Adapter<b> {
    djb a;
    a b;
    dcq c;
    djw d;
    dio e;
    private Context g;
    int f = -1;
    private ArrayList<AvailableAddOnOfferingList> h = new ArrayList<>();

    /* renamed from: dbh$a */
    /* loaded from: classes2.dex */
    public interface a {
        void onItemClick(int i);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0100  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void onBindViewHolder(defpackage.dbh.b r6, int r7) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbh.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    public dbh(Context context, ArrayList<AvailableAddOnOfferingList> arrayList, dcq dcqVar) {
        this.c = dcqVar;
        this.g = context;
        for (int i = 0; i < arrayList.size(); i++) {
            if (!arrayList.get(i).isAlreadySubscribed()) {
                this.h.add(arrayList.get(i));
            }
        }
        this.a = new djb();
        this.d = new djw();
        this.e = new dio();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.h.size();
    }

    /* renamed from: dbh$b */
    /* loaded from: classes2.dex */
    public class b extends RecyclerView.ViewHolder {
        TextView a;
        TextView b;
        TextView c;
        TextView d;
        LinearLayout e;
        Button f;
        Button g;
        Button h;
        LinearLayout i;
        ImageView j;

        public static /* synthetic */ void lambda$BphjwNQ0icebO2eeqrQSPY86BFU(b bVar, a aVar, View view) {
            bVar.a(aVar, view);
        }

        public static /* synthetic */ void lambda$f8Dl1svbLXOUnFN4O48dQSPf0Co(b bVar, View view) {
            bVar.a(view);
        }

        /* renamed from: lambda$jK-u0eOxWjIs7ZtgxlMy5qUoqOA */
        public static /* synthetic */ void m89lambda$jKu0eOxWjIs7ZtgxlMy5qUoqOA(b bVar, View view) {
            bVar.b(view);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view, final a aVar) {
            super(view);
            dbh.this = r2;
            this.a = (TextView) view.findViewById(R.id.tvSubscribedMoreBundleName);
            this.c = (TextView) view.findViewById(R.id.tvRegionalOffer);
            this.b = (TextView) view.findViewById(R.id.tvSubscribedMoreBundlePrice);
            this.e = (LinearLayout) view.findViewById(R.id.rlItemContainer);
            this.g = (Button) view.findViewById(R.id.btnMonthly);
            this.f = (Button) view.findViewById(R.id.btnOnce);
            this.h = (Button) view.findViewById(R.id.btn_ok);
            this.i = (LinearLayout) view.findViewById(R.id.Limonthlyoronce);
            this.d = (TextView) view.findViewById(R.id.llSubscribeSpecialTag);
            this.j = (ImageView) view.findViewById(R.id.im_mainPlan);
            this.f.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$dbh$b$jK-u0eOxWjIs7ZtgxlMy5qUoqOA
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    dbh.b.m89lambda$jKu0eOxWjIs7ZtgxlMy5qUoqOA(dbh.b.this, view2);
                }
            });
            this.g.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$dbh$b$f8Dl1svbLXOUnFN4O48dQSPf0Co
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    dbh.b.lambda$f8Dl1svbLXOUnFN4O48dQSPf0Co(dbh.b.this, view2);
                }
            });
            view.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$dbh$b$BphjwNQ0icebO2eeqrQSPY86BFU
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    dbh.b.lambda$BphjwNQ0icebO2eeqrQSPY86BFU(dbh.b.this, aVar, view2);
                }
            });
        }

        public /* synthetic */ void b(View view) {
            dbh.this.c.a(getAdapterPosition());
        }

        public /* synthetic */ void a(View view) {
            dbh.this.c.b(getAdapterPosition());
        }

        public /* synthetic */ void a(a aVar, View view) {
            int adapterPosition;
            if (aVar != null && (adapterPosition = getAdapterPosition()) != -1) {
                aVar.onItemClick(adapterPosition);
                if (dbh.this.c.c(getAdapterPosition())) {
                    if (this.i.getVisibility() == 0) {
                        this.i.setVisibility(8);
                        this.h.setVisibility(0);
                    } else {
                        dbh.this.f = getAdapterPosition();
                        this.i.setVisibility(0);
                        this.h.setVisibility(8);
                    }
                }
            }
            for (int i = 0; i < dbh.this.h.size(); i++) {
                if (i == getAdapterPosition()) {
                    ((AvailableAddOnOfferingList) dbh.this.h.get(i)).setShow(this.i.getVisibility() == 0);
                } else {
                    ((AvailableAddOnOfferingList) dbh.this.h.get(i)).setShow(false);
                }
            }
            dbh.this.notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(this.g).inflate(R.layout.item_subscribed_more_bundle, viewGroup, false), this.b);
    }
}
