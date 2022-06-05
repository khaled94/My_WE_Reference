package com.ucare.we.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ucare.we.R;
import com.ucare.we.model.usagedetails.SummarizedLineUsageItem;
import java.util.List;

/* loaded from: classes2.dex */
public class LineNameUsageAdapter extends RecyclerView.Adapter<ViewHolder> {
    private static final String c = LineNameUsageAdapter.class.getSimpleName();
    String a;
    public int b;
    private Context d;
    private List<SummarizedLineUsageItem> e;

    /* loaded from: classes2.dex */
    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder a;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.a = viewHolder;
            viewHolder.cardView = (CardView) Utils.findRequiredViewAsType(view, R.id.linearLayoutUnit, "field 'cardView'", CardView.class);
            viewHolder.tvName = (TextView) Utils.findRequiredViewAsType(view, R.id.textViewName, "field 'tvName'", TextView.class);
            viewHolder.itemImageView = (ImageView) Utils.findRequiredViewAsType(view, R.id.itemImage, "field 'itemImageView'", ImageView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ViewHolder viewHolder = this.a;
            if (viewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.a = null;
            viewHolder.cardView = null;
            viewHolder.tvName = null;
            viewHolder.itemImageView = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = viewHolder;
        SummarizedLineUsageItem summarizedLineUsageItem = this.e.get(i);
        if (this.a.equals("ar")) {
            viewHolder2.tvName.setText(summarizedLineUsageItem.getGroupArName());
        } else {
            viewHolder2.tvName.setText(summarizedLineUsageItem.getGroupEnName());
        }
        if (i == this.b) {
            viewHolder2.cardView.setForeground(ContextCompat.getDrawable(this.d, R.drawable.rounded_selected_primary));
        } else {
            viewHolder2.cardView.setForeground(null);
        }
        String mesaureUnitId = summarizedLineUsageItem.getMesaureUnitId();
        char c2 = 65535;
        switch (mesaureUnitId.hashCode()) {
            case 1507426:
                if (mesaureUnitId.equals("1003")) {
                    c2 = 0;
                    break;
                }
                break;
            case 1508385:
                if (mesaureUnitId.equals("1101")) {
                    c2 = 3;
                    break;
                }
                break;
            case 1508390:
                if (mesaureUnitId.equals("1106")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1508393:
                if (mesaureUnitId.equals("1109")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1508446:
                if (mesaureUnitId.equals("1120")) {
                    c2 = 4;
                    break;
                }
                break;
            case 46730161:
                if (mesaureUnitId.equals("10000")) {
                    c2 = 5;
                    break;
                }
                break;
        }
        if (c2 == 0) {
            viewHolder2.itemImageView.setImageResource(R.drawable.ico_tabbar_phone_active);
        } else if (c2 == 1) {
            viewHolder2.itemImageView.setImageResource(R.drawable.ico_tabbar_internet_active);
        } else if (c2 == 2) {
            viewHolder2.itemImageView.setImageResource(R.drawable.ico_tabbar_internet_active);
        } else if (c2 == 3) {
            viewHolder2.itemImageView.setImageResource(R.drawable.ico_tabbar_sms_dashboard_active);
        } else if (c2 == 4) {
            viewHolder2.itemImageView.setImageResource(R.drawable.ico_tabbar_worldcup_active);
        } else if (c2 != 5) {
        } else {
            viewHolder2.itemImageView.setImageResource(R.drawable.ico_tabbar_count_active);
        }
    }

    public LineNameUsageAdapter(Context context, List<SummarizedLineUsageItem> list, String str) {
        this.d = context;
        this.a = str;
        this.e = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.e.size();
    }

    /* loaded from: classes2.dex */
    class ViewHolder extends RecyclerView.ViewHolder {
        final View a;
        @BindView(R.id.linearLayoutUnit)
        CardView cardView;
        @BindView(R.id.itemImage)
        ImageView itemImageView;
        @BindView(R.id.textViewName)
        TextView tvName;

        ViewHolder(View view) {
            super(view);
            this.a = view;
            ButterKnife.bind(this, view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_line_usage, viewGroup, false));
    }
}
