package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import java.util.ArrayList;

/* renamed from: dcy  reason: default package */
/* loaded from: classes2.dex */
public final class dcy extends RecyclerView.Adapter<b> {
    a a;
    private Context b;
    private ArrayList<String> c;

    /* renamed from: dcy$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(b bVar, int i) {
        bVar.a.setText(this.c.get(i));
    }

    public dcy(Context context, ArrayList<String> arrayList) {
        this.b = context;
        this.c = new ArrayList<>();
        this.c = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    /* renamed from: dcy$b */
    /* loaded from: classes2.dex */
    public class b extends RecyclerView.ViewHolder {
        TextView a;
        ImageView b;

        public b(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.tv_item_prefered_number);
            ImageView imageView = (ImageView) view.findViewById(R.id.imgview_remove_prefered_number);
            this.b = imageView;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: dcy.b.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int adapterPosition = b.this.getAdapterPosition();
                    if (adapterPosition != -1) {
                        dcy.this.a.a(adapterPosition);
                    }
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(this.b).inflate(R.layout.item_prefered_number, viewGroup, false));
    }
}
