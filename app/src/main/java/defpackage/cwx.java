package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import java.util.List;

/* renamed from: cwx */
/* loaded from: classes2.dex */
public final class cwx extends RecyclerView.Adapter<cwy> {
    Context a;
    djb b;
    dio c;
    dhn d;
    djw e;
    int f;
    int g;
    int h;
    int i;
    boolean j;
    dcu k;
    private List<cxg> l;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(cwy cwyVar, int i) {
        ImageView imageView;
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        ImageView imageView2;
        TextView textView5;
        TextView textView6;
        TextView textView7;
        TextView textView8;
        TextView textView9;
        LinearLayout linearLayout5;
        LinearLayout linearLayout6;
        cwy cwyVar2 = cwyVar;
        List<cxg> list = this.l;
        if (list != null) {
            cxg cxgVar = list.get(i);
            if (cxgVar.a) {
                imageView2 = cwyVar2.e;
                imageView2.setImageResource(cxgVar.b);
                textView5 = cwyVar2.d;
                textView5.setText(cxgVar.d);
                textView6 = cwyVar2.b;
                textView6.setText(cxgVar.f);
                textView7 = cwyVar2.d;
                textView7.setVisibility(0);
                textView8 = cwyVar2.b;
                textView8.setVisibility(0);
                textView9 = cwyVar2.c;
                textView9.setVisibility(8);
                linearLayout5 = cwyVar2.f;
                linearLayout5.setPadding(0, 0, 0, 0);
                linearLayout6 = cwyVar2.f;
                linearLayout6.setAlpha(1.0f);
                if (this.f == i && (i == this.l.size() - 2 || i == 1)) {
                    return;
                }
                this.f = i;
                View view = cwyVar2.itemView;
                Animation loadAnimation = AnimationUtils.loadAnimation(this.a, 17432576);
                loadAnimation.setDuration(1500L);
                view.startAnimation(loadAnimation);
                return;
            }
            imageView = cwyVar2.e;
            imageView.setImageResource(cxgVar.c);
            textView = cwyVar2.c;
            textView.setText(cxgVar.e);
            textView2 = cwyVar2.c;
            textView2.setVisibility(0);
            textView3 = cwyVar2.d;
            textView3.setVisibility(8);
            textView4 = cwyVar2.b;
            textView4.setVisibility(8);
            if ((i != 0 && i != this.l.size() - 1) || !this.c.a()) {
                linearLayout4 = cwyVar2.f;
                linearLayout4.setAlpha(1.0f);
            }
            int dimension = (int) this.a.getResources().getDimension(R.dimen.slider_height);
            this.g = dimension;
            this.h = (this.i / 3) - ((this.i - dimension) / 2);
            if (this.b.f()) {
                if (i == 0 || !this.l.get(i - 1).a) {
                    linearLayout3 = cwyVar2.f;
                    linearLayout3.setPadding(this.h, 0, 0, 0);
                    return;
                }
            } else if (i != 0 && this.l.get(i - 1).a) {
                linearLayout2 = cwyVar2.f;
                linearLayout2.setPadding(this.h, 0, 0, 0);
                return;
            }
            linearLayout = cwyVar2.f;
            linearLayout.setPadding(0, 0, this.h, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List<cxg> list = this.l;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ cwy onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new cwy(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_screen_slide_page, viewGroup, false), (byte) 0);
    }
}
