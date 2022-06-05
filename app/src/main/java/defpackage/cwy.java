package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import java.util.List;

/* renamed from: cwy */
/* loaded from: classes2.dex */
public final class cwy extends RecyclerView.ViewHolder {
    final /* synthetic */ cwx a;
    private final TextView b;
    private final TextView c;
    private final TextView d;
    private final ImageView e;
    private final LinearLayout f;

    public static /* synthetic */ void lambda$eQ_a7MmNae8oEI993833GzNrR3Q(cwy cwyVar, View view) {
        cwyVar.a(view);
    }

    public /* synthetic */ cwy(cwx cwxVar, View view, byte b) {
        this(cwxVar, view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private cwy(cwx cwxVar, View view) {
        super(view);
        this.a = cwxVar;
        this.b = (TextView) view.findViewById(R.id.slider_text_small);
        this.c = (TextView) view.findViewById(R.id.slider_text_medium);
        this.d = (TextView) view.findViewById(R.id.slider_text_large);
        this.e = (ImageView) view.findViewById(R.id.slider_icon);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.content);
        this.f = linearLayout;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        cwxVar.i = Resources.getSystem().getDisplayMetrics().widthPixels;
        layoutParams.width = cwxVar.i / 3;
        this.f.setLayoutParams(layoutParams);
        view.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$cwy$eQ_a7MmNae8oEI993833GzNrR3Q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                cwy.lambda$eQ_a7MmNae8oEI993833GzNrR3Q(cwy.this, view2);
            }
        });
    }

    public /* synthetic */ void a(View view) {
        List list;
        List list2;
        if (this.a.k.a() == getAdapterPosition()) {
            list = this.a.l;
            if (((cxg) list.get(getAdapterPosition())).h != null) {
                list2 = this.a.l;
                list2.get(getAdapterPosition());
            } else if (!this.a.j) {
            } else {
                if (this.a.e.b("en").equalsIgnoreCase("en")) {
                    Toast.makeText(this.a.a, this.a.d.f.getNoUsageDetailsHintEN(), 0).show();
                } else {
                    Toast.makeText(this.a.a, this.a.d.f.getNoUsageDetailsHintAR(), 0).show();
                }
            }
        }
    }
}
