package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;

/* renamed from: dbv  reason: default package */
/* loaded from: classes2.dex */
public final class dbv extends RecyclerView.Adapter<a> {
    View.OnClickListener a = new View.OnClickListener() { // from class: dbv.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (view.getTag() != null) {
                dbv.this.e.a(((Integer) view.getTag()).intValue());
            }
        }
    };
    private Context b;
    private int[] c;
    private String[] d;
    private dbz e;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(a aVar, int i) {
        a aVar2 = aVar;
        aVar2.b.setImageResource(this.c[i]);
        aVar2.c.setText(this.d[i]);
        aVar2.d.setTag(Integer.valueOf(i));
        aVar2.d.setOnClickListener(this.a);
    }

    public dbv(Context context, int[] iArr, String[] strArr, dbz dbzVar) {
        this.b = context;
        this.c = iArr;
        this.d = strArr;
        this.e = dbzVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.d.length;
    }

    /* renamed from: dbv$a */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.ViewHolder {
        private ImageView b;
        private TextView c;
        private LinearLayout d;

        public a(View view) {
            super(view);
            this.b = (ImageView) view.findViewById(R.id.imgIcon);
            this.c = (TextView) view.findViewById(R.id.txtPaymentMethodTitle);
            this.d = (LinearLayout) view.findViewById(R.id.lnrMethod);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_payment_method, viewGroup, false));
    }
}
