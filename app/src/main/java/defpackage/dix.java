package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.ucare.we.R;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ucare/we/util/CustomDropDownAdapter;", "Landroid/widget/BaseAdapter;", "context", "Landroid/content/Context;", "dataSource", "", "", "(Landroid/content/Context;Ljava/util/List;)V", "getContext", "()Landroid/content/Context;", "getDataSource", "()Ljava/util/List;", "setDataSource", "(Ljava/util/List;)V", "inflater", "Landroid/view/LayoutInflater;", "getCount", "", "getItem", "", "position", "getItemId", "", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "ItemHolder", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dix  reason: default package */
/* loaded from: classes2.dex */
public final class dix extends BaseAdapter {
    private final Context a;
    private List<String> b;
    private final LayoutInflater c;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public dix(Context context, List<String> list) {
        dqc.d(context, "context");
        dqc.d(list, "dataSource");
        this.a = context;
        this.b = list;
        Object systemService = context.getSystemService("layout_inflater");
        if (systemService != null) {
            this.c = (LayoutInflater) systemService;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            view = this.c.inflate(R.layout.custom_spinner_item, viewGroup, false);
            dqc.b(view, "this.inflater.inflate(R.layout.custom_spinner_item, parent, false)");
            aVar = new a(view);
            view.setTag(aVar);
        } else {
            Object tag = view.getTag();
            if (tag == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.ucare.we.util.CustomDropDownAdapter.ItemHolder");
            }
            aVar = (a) tag;
        }
        aVar.a.setText(this.b.get(i));
        if (i == 0) {
            aVar.b.setVisibility(0);
        } else {
            aVar.b.setVisibility(8);
        }
        return view;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.b.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.b.size();
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ucare/we/util/CustomDropDownAdapter$ItemHolder;", "", "row", "Landroid/view/View;", "(Landroid/view/View;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "label", "Landroid/widget/TextView;", "getLabel", "()Landroid/widget/TextView;", "viewDivider", "getViewDivider", "()Landroid/view/View;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dix$a */
    /* loaded from: classes2.dex */
    public static final class a {
        final TextView a;
        final View b;
        private final Context c;

        public a(View view) {
            View view2 = null;
            Context context = view == null ? null : view.getContext();
            if (context == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
            }
            this.c = context;
            TextView textView = view == null ? null : (TextView) view.findViewById(R.id.text);
            if (textView == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            this.a = textView;
            view2 = view != null ? view.findViewById(R.id.viewDivider) : view2;
            if (view2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            this.b = view2;
        }
    }
}
