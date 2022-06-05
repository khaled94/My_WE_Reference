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
import com.ucare.we.model.suspendandresume.Suspend;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class SuspendAndResumeSelectReasonAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private static CheckBox f;
    private static int g;
    ArrayList<Suspend> a;
    String b = djv.a("LANGUAGE", "");
    dct c;
    String d;
    Context e;

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
        if (this.b.equals("ar")) {
            str = this.a.get(i).getAr();
        } else {
            str = this.b.equals("en") ? this.a.get(i).getEn() : "";
        }
        myViewHolder2.reason.setText(str);
        myViewHolder2.check.setChecked(this.a.get(i).isSelected());
        myViewHolder2.check.setTag(Integer.valueOf(i));
        if (this.a.get(i).isSelected()) {
            myViewHolder2.check.setChecked(true);
            f = myViewHolder2.check;
            g = i;
        }
        myViewHolder2.check.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.adapters.SuspendAndResumeSelectReasonAdapter.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckBox checkBox = (CheckBox) view;
                int intValue = ((Integer) checkBox.getTag()).intValue();
                if (checkBox.isChecked()) {
                    if (SuspendAndResumeSelectReasonAdapter.f != null) {
                        SuspendAndResumeSelectReasonAdapter.f.setChecked(false);
                        SuspendAndResumeSelectReasonAdapter.this.a.get(SuspendAndResumeSelectReasonAdapter.g).setSelected(false);
                    }
                    CheckBox unused = SuspendAndResumeSelectReasonAdapter.f = checkBox;
                    int unused2 = SuspendAndResumeSelectReasonAdapter.g = intValue;
                } else {
                    CheckBox unused3 = SuspendAndResumeSelectReasonAdapter.f = null;
                }
                SuspendAndResumeSelectReasonAdapter.this.a.get(intValue).setSelected(checkBox.isChecked());
                if (SuspendAndResumeSelectReasonAdapter.this.b.equals("ar")) {
                    SuspendAndResumeSelectReasonAdapter.this.c.a(SuspendAndResumeSelectReasonAdapter.this.a.get(i).getAr(), SuspendAndResumeSelectReasonAdapter.this.a.get(i).getId());
                } else if (!SuspendAndResumeSelectReasonAdapter.this.b.equals("en")) {
                } else {
                    SuspendAndResumeSelectReasonAdapter.this.c.a(SuspendAndResumeSelectReasonAdapter.this.a.get(i).getEn(), SuspendAndResumeSelectReasonAdapter.this.a.get(i).getId());
                }
            }
        });
        myViewHolder2.cardView.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.adapters.SuspendAndResumeSelectReasonAdapter.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                myViewHolder2.check.performClick();
            }
        });
    }

    public SuspendAndResumeSelectReasonAdapter(Context context) {
        this.e = context;
        dct dctVar = (dct) context;
        this.c = dctVar;
        this.a = dctVar.a();
        this.d = this.c.c();
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
