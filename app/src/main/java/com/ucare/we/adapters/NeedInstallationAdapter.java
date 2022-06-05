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
import com.ucare.we.model.NeedInstllation;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class NeedInstallationAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private static CheckBox c;
    private static int d;
    dcn a;
    ArrayList<NeedInstllation> b;
    private Context e;

    /* loaded from: classes2.dex */
    public class MyViewHolder_ViewBinding implements Unbinder {
        private MyViewHolder a;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.a = myViewHolder;
            myViewHolder.installationTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.installation, "field 'installationTextView'", TextView.class);
            myViewHolder.installationCheck = (CheckBox) Utils.findRequiredViewAsType(view, R.id.installationCheck, "field 'installationCheck'", CheckBox.class);
            myViewHolder.cardView = (CardView) Utils.findRequiredViewAsType(view, R.id.card_view, "field 'cardView'", CardView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            MyViewHolder myViewHolder = this.a;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.a = null;
            myViewHolder.installationTextView = null;
            myViewHolder.installationCheck = null;
            myViewHolder.cardView = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(MyViewHolder myViewHolder, final int i) {
        final MyViewHolder myViewHolder2 = myViewHolder;
        final NeedInstllation needInstllation = this.b.get(i);
        myViewHolder2.installationTextView.setText(needInstllation.getOfferName());
        myViewHolder2.installationCheck.setChecked(this.b.get(i).isSelected());
        myViewHolder2.installationCheck.setTag(Integer.valueOf(i));
        if (this.b.get(i).isSelected()) {
            myViewHolder2.installationCheck.setChecked(true);
            c = myViewHolder2.installationCheck;
            d = i;
        }
        myViewHolder2.installationCheck.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.adapters.NeedInstallationAdapter.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckBox checkBox = (CheckBox) view;
                int intValue = ((Integer) checkBox.getTag()).intValue();
                if (checkBox.isChecked()) {
                    if (NeedInstallationAdapter.c != null) {
                        NeedInstallationAdapter.c.setChecked(false);
                        NeedInstallationAdapter.this.b.get(NeedInstallationAdapter.d).setSelected(false);
                    }
                    CheckBox unused = NeedInstallationAdapter.c = checkBox;
                    int unused2 = NeedInstallationAdapter.d = intValue;
                } else {
                    CheckBox unused3 = NeedInstallationAdapter.c = null;
                }
                NeedInstallationAdapter.this.b.get(intValue).setSelected(checkBox.isChecked());
                NeedInstallationAdapter.this.a.a(NeedInstallationAdapter.this.b.get(i).getOfferName(), needInstllation.getDefaultNAme());
            }
        });
        myViewHolder2.cardView.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.adapters.NeedInstallationAdapter.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                myViewHolder2.installationCheck.performClick();
            }
        });
    }

    public NeedInstallationAdapter(Context context) {
        this.e = context;
        dcn dcnVar = (dcn) context;
        this.a = dcnVar;
        this.b = dcnVar.b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.b.size();
    }

    /* loaded from: classes2.dex */
    class MyViewHolder extends RecyclerView.ViewHolder {
        final View a;
        @BindView(R.id.card_view)
        CardView cardView;
        @BindView(R.id.installationCheck)
        CheckBox installationCheck;
        @BindView(R.id.installation)
        TextView installationTextView;

        MyViewHolder(View view) {
            super(view);
            this.a = view;
            ButterKnife.bind(this, view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.need_installation_adapter_content, viewGroup, false));
    }
}
