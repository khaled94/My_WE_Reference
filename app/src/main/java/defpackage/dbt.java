package defpackage;

import android.content.res.Resources;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fH\u0016RW\u0010\b\u001aK\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/ucare/we/newHome/features/home/HomeTablayoutAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ucare/we/newHome/features/home/HomeTablayoutAdapter$ViewHolder;", "list", "Ljava/util/ArrayList;", "Lcom/ucare/mywe/domain/entities/remote/movie/HomeTabItem;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "clickListener", "Lkotlin/Function3;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "clickedView", "item", "", "position", "", "getList", "()Ljava/util/ArrayList;", "getItemCount", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dbt  reason: default package */
/* loaded from: classes2.dex */
public final class dbt extends RecyclerView.Adapter<a> {
    private final ArrayList<cwa> a;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(a aVar, int i) {
        LinearLayout linearLayout;
        a aVar2 = aVar;
        dqc.d(aVar2, "holder");
        cwa cwaVar = this.a.get(i);
        dqc.b(cwaVar, "list[position]");
        cwa cwaVar2 = cwaVar;
        dqc.d(cwaVar2, "item");
        ViewGroup.LayoutParams layoutParams = aVar2.d;
        if (layoutParams != null) {
            layoutParams.width = aVar2.e / 3;
        }
        LinearLayout linearLayout2 = aVar2.c;
        if (linearLayout2 != null) {
            linearLayout2.setLayoutParams(aVar2.d);
        }
        if (aVar2.e / 2 == 0 && (linearLayout = aVar2.c) != null) {
            linearLayout.setBackgroundColor(Color.parseColor("#01ff90"));
        }
        String str = cwaVar2.a;
        int hashCode = str.hashCode();
        if (hashCode != -1565412161) {
            if (hashCode != -543010462) {
                if (hashCode == 610253413 && str.equals("Family Plan")) {
                    aVar2.a.setText(cwaVar2.a);
                    aVar2.b.setImageResource(R.drawable.ic_family_plan_icon);
                    return;
                }
            } else if (str.equals("Home Internet")) {
                aVar2.a.setText(cwaVar2.a);
                aVar2.b.setImageResource(R.drawable.ic_family_plan_icon);
                return;
            }
        } else if (str.equals("Minutes")) {
            aVar2.a.setText(cwaVar2.a);
            aVar2.b.setImageResource(R.drawable.ic_family_plan_icon);
            return;
        }
        aVar2.a.setText(cwaVar2.a);
        aVar2.b.setImageResource(R.drawable.ic_family_plan_icon);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i) {
        dqc.d(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tablayout_item, viewGroup, false);
        dqc.b(inflate, "inflater.inflate(R.layout.tablayout_item, parent, false)");
        return new a(inflate);
    }

    public dbt(ArrayList<cwa> arrayList) {
        dqc.d(arrayList, "list");
        this.a = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.size();
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020\u0006R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006&"}, d2 = {"Lcom/ucare/we/newHome/features/home/HomeTablayoutAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "homePagewidth", "", "getHomePagewidth", "()I", "setHomePagewidth", "(I)V", "item_icon", "Landroid/widget/ImageView;", "getItem_icon", "()Landroid/widget/ImageView;", "item_name", "Landroid/widget/TextView;", "getItem_name", "()Landroid/widget/TextView;", "layoutContent", "Landroid/widget/LinearLayout;", "getLayoutContent", "()Landroid/widget/LinearLayout;", "params", "Landroid/view/ViewGroup$LayoutParams;", "getParams", "()Landroid/view/ViewGroup$LayoutParams;", "tabSlider", "Lcom/ucare/mywe/features/home/SliderPosition;", "getTabSlider", "()Lcom/ucare/mywe/features/home/SliderPosition;", "setTabSlider", "(Lcom/ucare/mywe/features/home/SliderPosition;)V", "bind", "", "item", "Lcom/ucare/mywe/domain/entities/remote/movie/HomeTabItem;", "getScreenWidth", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dbt$a */
    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.ViewHolder {
        final TextView a;
        final ImageView b;
        final LinearLayout c;
        final ViewGroup.LayoutParams d;
        int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            dqc.d(view, "itemView");
            View findViewById = view.findViewById(R.id.home_tab_pkg_tv);
            if (findViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            this.a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.Home_tab_pkg_icon);
            if (findViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            this.b = (ImageView) findViewById2;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.content);
            this.c = linearLayout;
            this.d = linearLayout == null ? null : linearLayout.getLayoutParams();
            this.e = Resources.getSystem().getDisplayMetrics().widthPixels;
        }
    }
}
