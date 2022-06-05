package com.ucare.we.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ucare.we.R;
import com.ucare.we.model.ticket.Category;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class TroubleTypeAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private static CheckBox e;
    private static int f;
    ArrayList<Category> a;
    String b = djv.a("LANGUAGE", "");
    dcw c;
    Context d;

    /* loaded from: classes2.dex */
    public class MyViewHolder_ViewBinding implements Unbinder {
        private MyViewHolder a;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.a = myViewHolder;
            myViewHolder.type = (TextView) Utils.findRequiredViewAsType(view, R.id.type, "field 'type'", TextView.class);
            myViewHolder.check = (CheckBox) Utils.findRequiredViewAsType(view, R.id.check, "field 'check'", CheckBox.class);
            myViewHolder.cardView = (CardView) Utils.findRequiredViewAsType(view, R.id.card_view, "field 'cardView'", CardView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            MyViewHolder myViewHolder = this.a;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.a = null;
            myViewHolder.type = null;
            myViewHolder.check = null;
            myViewHolder.cardView = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(MyViewHolder myViewHolder, final int i) {
        String str;
        final MyViewHolder myViewHolder2 = myViewHolder;
        if (this.b.equals("ar")) {
            str = this.a.get(i).getNameAr();
        } else {
            str = this.b.equals("en") ? this.a.get(i).getNameEn() : "";
        }
        myViewHolder2.type.setText(str);
        myViewHolder2.check.setChecked(this.a.get(i).isSelected());
        myViewHolder2.check.setTag(Integer.valueOf(i));
        if (this.a.get(i).isSelected()) {
            myViewHolder2.check.setChecked(true);
            e = myViewHolder2.check;
            f = i;
        }
        myViewHolder2.check.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.adapters.TroubleTypeAdapter.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckBox checkBox = (CheckBox) view;
                int intValue = ((Integer) checkBox.getTag()).intValue();
                if (checkBox.isChecked()) {
                    if (TroubleTypeAdapter.e != null && TroubleTypeAdapter.this.a.size() > TroubleTypeAdapter.f) {
                        TroubleTypeAdapter.e.setChecked(false);
                        TroubleTypeAdapter.this.a.get(TroubleTypeAdapter.f).setSelected(false);
                    }
                    CheckBox unused = TroubleTypeAdapter.e = checkBox;
                    int unused2 = TroubleTypeAdapter.f = intValue;
                } else {
                    CheckBox unused3 = TroubleTypeAdapter.e = null;
                }
                TroubleTypeAdapter.this.a.get(intValue).setSelected(checkBox.isChecked());
                if (TroubleTypeAdapter.this.b.equals("ar")) {
                    TroubleTypeAdapter.this.c.a(TroubleTypeAdapter.this.a.get(i).getNameAr(), TroubleTypeAdapter.this.a.get(intValue).getId());
                } else if (!TroubleTypeAdapter.this.b.equals("en")) {
                } else {
                    TroubleTypeAdapter.this.c.a(TroubleTypeAdapter.this.a.get(i).getNameEn(), TroubleTypeAdapter.this.a.get(intValue).getId());
                }
            }
        });
        myViewHolder2.cardView.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.adapters.TroubleTypeAdapter.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                myViewHolder2.check.performClick();
            }
        });
    }

    public TroubleTypeAdapter(Context context) {
        this.d = context;
        dcw dcwVar = (dcw) context;
        this.c = dcwVar;
        this.a = dcwVar.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList<Category> arrayList = this.a;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* loaded from: classes2.dex */
    class MyViewHolder extends RecyclerView.ViewHolder {
        final View a;
        @BindView(R.id.card_view)
        CardView cardView;
        @BindView(R.id.check)
        CheckBox check;
        @BindView(R.id.type)
        TextView type;

        MyViewHolder(View view) {
            super(view);
            this.a = view;
            ButterKnife.bind(this, view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.trouble_type_adapter_content, viewGroup, false));
    }
}
