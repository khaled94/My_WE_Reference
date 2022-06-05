package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import com.ucare.we.R;
import com.ucare.we.model.remote.faqlist.FaqListResponseBody;
import java.util.List;

/* renamed from: dhh  reason: default package */
/* loaded from: classes2.dex */
public final class dhh extends BaseExpandableListAdapter {
    private Context a;
    private List<FaqListResponseBody> b;

    @Override // android.widget.ExpandableListAdapter
    public final long getChildId(int i, int i2) {
        return i2;
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getChildrenCount(int i) {
        return 1;
    }

    @Override // android.widget.ExpandableListAdapter
    public final long getGroupId(int i) {
        return i;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.ExpandableListAdapter
    public final boolean isChildSelectable(int i, int i2) {
        return true;
    }

    public dhh(Context context, List<FaqListResponseBody> list) {
        this.a = context;
        this.b = list;
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getChild(int i, int i2) {
        return this.b.get(i).getLocalizedContent();
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" ");
        sb.append(i2);
        String str = (String) getChild(i, i2);
        if (view == null) {
            view = ((LayoutInflater) this.a.getSystemService("layout_inflater")).inflate(R.layout.item_faq_child, (ViewGroup) null);
        }
        ((TextView) view.findViewById(R.id.tvContent)).setText(str);
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public final Object getGroup(int i) {
        return this.b.get(i).getLocalizedTitle();
    }

    @Override // android.widget.ExpandableListAdapter
    public final int getGroupCount() {
        return this.b.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public final View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        String str = (String) getGroup(i);
        if (view == null) {
            view = ((LayoutInflater) this.a.getSystemService("layout_inflater")).inflate(R.layout.item_faq, (ViewGroup) null);
        }
        ((TextView) view.findViewById(R.id.tvQuestion)).setText(str);
        return view;
    }
}
