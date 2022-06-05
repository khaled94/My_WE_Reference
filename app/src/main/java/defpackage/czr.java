package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.AreasModel.Area;
import com.ucare.we.model.CitiesModel.City;
import java.util.ArrayList;
import javax.inject.Inject;

/* renamed from: czr  reason: default package */
/* loaded from: classes2.dex */
public final class czr extends RecyclerView.Adapter<b> {
    @Inject
    djb a = new djb();
    public a b;
    private ArrayList<City> c;
    private Context d;
    private City e;

    /* renamed from: czr$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(b bVar, int i) {
        b bVar2 = bVar;
        if (this.a.c.k().equalsIgnoreCase("en")) {
            bVar2.a.setText(this.c.get(i).cityEnglish);
        } else {
            bVar2.a.setText(this.c.get(i).cityArabic);
        }
        if (this.e != null && this.c.get(i).getCityId() == this.e.getCityId()) {
            bVar2.b.setVisibility(0);
        }
        if (i % 2 != 0) {
            bVar2.c.setBackgroundColor(Color.rgb(250, 250, 250));
        } else {
            bVar2.c.setBackgroundColor(-1);
        }
    }

    public czr(Context context, ArrayList<City> arrayList, City city) {
        this.d = context;
        this.c = arrayList;
        this.e = city;
    }

    public czr(Context context, ArrayList<City> arrayList, Area area) {
        this.d = context;
        this.c = arrayList;
        City city = new City();
        if (area != null) {
            city.setCityEnglish(area.getAreaEnglish());
            city.setCityArabic(area.getAreaArabic());
            city.setCityId(area.getAreaID());
            this.e = city;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    /* renamed from: czr$b */
    /* loaded from: classes2.dex */
    public class b extends RecyclerView.ViewHolder {
        TextView a;
        ImageView b;
        RelativeLayout c;

        public b(View view, final a aVar) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.tvCityName);
            this.b = (ImageView) view.findViewById(R.id.ivCitySelected);
            this.c = (RelativeLayout) view.findViewById(R.id.rlCityAndAreaItem);
            view.setOnClickListener(new View.OnClickListener() { // from class: czr.b.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int adapterPosition;
                    if (aVar == null || (adapterPosition = b.this.getAdapterPosition()) == -1) {
                        return;
                    }
                    aVar.a(adapterPosition);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(this.d).inflate(R.layout.city_and_area_item, viewGroup, false), this.b);
    }
}
