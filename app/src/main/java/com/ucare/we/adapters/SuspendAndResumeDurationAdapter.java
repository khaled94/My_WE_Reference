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
import com.ucare.we.model.suspendandresume.SuspendAndResumeDuration;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class SuspendAndResumeDurationAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private static CheckBox d;
    private static int e;
    ArrayList<SuspendAndResumeDuration> a;
    dcr b;
    String c = djv.a("LANGUAGE", "");
    private Context f;

    /* loaded from: classes2.dex */
    public class MyViewHolder_ViewBinding implements Unbinder {
        private MyViewHolder a;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.a = myViewHolder;
            myViewHolder.reason = (TextView) Utils.findRequiredViewAsType(view, R.id.reason, "field 'reason'", TextView.class);
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
            myViewHolder.reason = null;
            myViewHolder.check = null;
            myViewHolder.cardView = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(MyViewHolder myViewHolder, final int i) {
        String str;
        final MyViewHolder myViewHolder2 = myViewHolder;
        if (this.c.equals("ar")) {
            str = this.a.get(i).getAr();
        } else {
            str = this.c.equals("en") ? this.a.get(i).getEn() : "";
        }
        myViewHolder2.reason.setText(str);
        myViewHolder2.check.setChecked(this.a.get(i).isSelected());
        myViewHolder2.check.setTag(Integer.valueOf(i));
        if (this.a.get(i).isSelected()) {
            myViewHolder2.check.setChecked(true);
            d = myViewHolder2.check;
            e = i;
        }
        myViewHolder2.check.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.adapters.SuspendAndResumeDurationAdapter.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckBox checkBox = (CheckBox) view;
                int intValue = ((Integer) checkBox.getTag()).intValue();
                if (checkBox.isChecked()) {
                    if (SuspendAndResumeDurationAdapter.d != null) {
                        SuspendAndResumeDurationAdapter.d.setChecked(false);
                        SuspendAndResumeDurationAdapter.this.a.get(SuspendAndResumeDurationAdapter.e).setSelected(false);
                    }
                    CheckBox unused = SuspendAndResumeDurationAdapter.d = checkBox;
                    int unused2 = SuspendAndResumeDurationAdapter.e = intValue;
                } else {
                    CheckBox unused3 = SuspendAndResumeDurationAdapter.d = null;
                }
                SuspendAndResumeDurationAdapter.this.a.get(intValue).setSelected(checkBox.isChecked());
                if (SuspendAndResumeDurationAdapter.this.c.equalsIgnoreCase("ar")) {
                    dcr dcrVar = SuspendAndResumeDurationAdapter.this.b;
                    StringBuilder sb = new StringBuilder();
                    sb.append(SuspendAndResumeDurationAdapter.this.a.get(i).getDays());
                    dcrVar.a(sb.toString(), SuspendAndResumeDurationAdapter.this.a.get(i).getAr());
                } else if (!SuspendAndResumeDurationAdapter.this.c.equalsIgnoreCase("en")) {
                } else {
                    dcr dcrVar2 = SuspendAndResumeDurationAdapter.this.b;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(SuspendAndResumeDurationAdapter.this.a.get(i).getDays());
                    dcrVar2.a(sb2.toString(), SuspendAndResumeDurationAdapter.this.a.get(i).getEn());
                }
            }
        });
        myViewHolder2.cardView.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.adapters.SuspendAndResumeDurationAdapter.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                myViewHolder2.check.performClick();
            }
        });
    }

    public SuspendAndResumeDurationAdapter(Context context) {
        this.f = context;
        dcr dcrVar = (dcr) context;
        this.b = dcrVar;
        this.a = dcrVar.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.size();
    }

    /* loaded from: classes2.dex */
    class MyViewHolder extends RecyclerView.ViewHolder {
        final View a;
        @BindView(R.id.card_view)
        CardView cardView;
        @BindView(R.id.check)
        CheckBox check;
        @BindView(R.id.reason)
        TextView reason;

        MyViewHolder(View view) {
            super(view);
            this.a = view;
            ButterKnife.bind(this, view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.suspend_reason_duration_adapter_content, viewGroup, false));
    }
}
