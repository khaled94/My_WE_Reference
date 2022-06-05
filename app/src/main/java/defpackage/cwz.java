package defpackage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.UserCredentials;
import java.util.ArrayList;
import javax.inject.Inject;

/* renamed from: cwz  reason: default package */
/* loaded from: classes2.dex */
public final class cwz extends RecyclerView.Adapter<b> {
    @Inject
    djw a = new djw();
    private final a b;
    private ArrayList<UserCredentials> c;
    private boolean d;

    /* renamed from: cwz$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(UserCredentials userCredentials);

        void a_(UserCredentials userCredentials);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(b bVar, int i) {
        b bVar2 = bVar;
        bVar2.a.setText(this.c.get(i).getMobileNumber());
        if (!TextUtils.isEmpty(this.a.r()) && this.c.get(i).getMobileNumber().equalsIgnoreCase(this.a.r())) {
            bVar2.b.setVisibility(8);
        }
        if (this.d) {
            bVar2.b.setVisibility(8);
        }
    }

    public cwz(a aVar, boolean z) {
        this.b = aVar;
        this.d = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList<UserCredentials> arrayList = this.c;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void a(ArrayList<UserCredentials> arrayList) {
        this.c = arrayList;
        notifyDataSetChanged();
    }

    /* renamed from: cwz$b */
    /* loaded from: classes2.dex */
    public class b extends RecyclerView.ViewHolder {
        public final TextView a;
        public final TextView b;

        public b(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.tv_number);
            this.b = (TextView) view.findViewById(R.id.tv_remove_number);
            this.a.setOnClickListener(new View.OnClickListener() { // from class: cwz.b.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    cwz.this.b.a((UserCredentials) cwz.this.c.get(b.this.getAdapterPosition()));
                }
            });
            this.b.setOnClickListener(new View.OnClickListener() { // from class: cwz.b.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    cwz.this.b.a_((UserCredentials) cwz.this.c.get(b.this.getAdapterPosition()));
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_number, viewGroup, false));
    }
}
