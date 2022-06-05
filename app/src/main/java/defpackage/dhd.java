package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.ClickedItemObject;
import com.ucare.we.model.SwitchAccountModel.ManagedLine;
import java.util.List;

/* renamed from: dhd  reason: default package */
/* loaded from: classes2.dex */
public final class dhd extends RecyclerView.Adapter<a> {
    View.OnClickListener a = new View.OnClickListener() { // from class: dhd.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (view.getTag() != null) {
                dhd.this.g.c(((Integer) view.getTag()).intValue());
            }
        }
    };
    View.OnClickListener b = new View.OnClickListener() { // from class: dhd.2
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (view.getTag() != null) {
                dhd.this.g.a(((Integer) view.getTag()).intValue());
            }
        }
    };
    View.OnClickListener c = new View.OnClickListener() { // from class: dhd.3
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (view.getTag() != null) {
                ClickedItemObject clickedItemObject = (ClickedItemObject) view.getTag();
                dhd.this.g.a(clickedItemObject.position, clickedItemObject.dial);
            }
        }
    };
    private Context d;
    private List<ManagedLine> e;
    private List<ManagedLine> f;
    private dhc g;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(a aVar, int i) {
        a aVar2 = aVar;
        if (i < this.e.size()) {
            aVar2.c.setText(this.e.get(i).mobileNumber);
            ClickedItemObject clickedItemObject = new ClickedItemObject();
            clickedItemObject.position = i;
            clickedItemObject.dial = this.e.get(i).mobileNumber;
            aVar2.f.setImageDrawable(ContextCompat.getDrawable(this.d, R.drawable.ic_cancel_access));
            aVar2.c.setTag(clickedItemObject);
            aVar2.c.setOnClickListener(this.c);
            if (this.e.get(i).isMainNumber) {
                aVar2.e.setVisibility(8);
                aVar2.f.setVisibility(8);
            } else {
                aVar2.e.setVisibility(0);
                aVar2.e.setTag(Integer.valueOf(i));
                aVar2.f.setVisibility(0);
                aVar2.f.setImageDrawable(ContextCompat.getDrawable(this.d, R.drawable.ic_cancel_access));
                aVar2.e.setOnClickListener(this.a);
            }
            aVar2.d.setVisibility(8);
            aVar2.g.setVisibility(8);
            this.e.get(i).mobileNumber.length();
            aVar2.c.setCompoundDrawablesRelativeWithIntrinsicBounds(ResourcesCompat.getDrawable(this.d.getResources(), R.drawable.ic_icon_acount, this.d.getTheme()), (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (i - this.e.size() >= this.f.size()) {
        } else {
            aVar2.c.setText(this.f.get(i - this.e.size()).mobileNumber);
            aVar2.g.setVisibility(0);
            aVar2.g.setImageDrawable(ContextCompat.getDrawable(this.d, R.drawable.ic_ask_for_access));
            this.f.get(i - this.e.size()).mobileNumber.length();
            aVar2.c.setCompoundDrawablesRelativeWithIntrinsicBounds(this.d.getResources().getDrawable(R.drawable.ic_icon_acount), (Drawable) null, (Drawable) null, (Drawable) null);
            if (this.f.get(i - this.e.size()).isMainNumber) {
                aVar2.e.setVisibility(8);
                aVar2.f.setVisibility(8);
                ClickedItemObject clickedItemObject2 = new ClickedItemObject();
                clickedItemObject2.position = i;
                clickedItemObject2.dial = this.f.get(i - this.e.size()).mobileNumber;
                aVar2.b.setTag(clickedItemObject2);
                aVar2.b.setOnClickListener(this.c);
                aVar2.d.setVisibility(8);
                aVar2.g.setVisibility(8);
                return;
            }
            aVar2.d.setVisibility(0);
            aVar2.g.setVisibility(0);
            aVar2.d.setTag(Integer.valueOf(i - this.e.size()));
            aVar2.d.setOnClickListener(this.b);
            aVar2.e.setVisibility(8);
            aVar2.f.setVisibility(8);
        }
    }

    public dhd(Context context, List<ManagedLine> list, List<ManagedLine> list2, dhc dhcVar) {
        this.d = context;
        this.e = list;
        this.f = list2;
        this.g = dhcVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.e.size() + this.f.size();
    }

    /* renamed from: dhd$a */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.ViewHolder {
        private ConstraintLayout b;
        private TextView c;
        private TextView d;
        private TextView e;
        private ImageView f;
        private ImageView g;

        public a(View view) {
            super(view);
            this.b = (ConstraintLayout) view.findViewById(R.id.lnrNumber);
            this.c = (TextView) view.findViewById(R.id.txtNumber);
            this.d = (TextView) view.findViewById(R.id.txtAccessDenied);
            this.e = (TextView) view.findViewById(R.id.txtAccessGranted);
            this.f = (ImageView) view.findViewById(R.id.imgIconGranted);
            this.g = (ImageView) view.findViewById(R.id.imgIconDenied);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_associated_number, viewGroup, false));
    }
}
