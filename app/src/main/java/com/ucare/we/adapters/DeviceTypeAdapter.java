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
import com.ucare.we.model.DeviceTypes;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class DeviceTypeAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private static CheckBox d;
    private static int e;
    dcj a;
    ArrayList<DeviceTypes> b;
    String c = djv.a("LANGUAGE", "");
    private Context f;

    /* loaded from: classes2.dex */
    public class MyViewHolder_ViewBinding implements Unbinder {
        private MyViewHolder a;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.a = myViewHolder;
            myViewHolder.tvDeviceType = (TextView) Utils.findRequiredViewAsType(view, R.id.tvDeviceType, "field 'tvDeviceType'", TextView.class);
            myViewHolder.deviceTypeCheckBox = (CheckBox) Utils.findRequiredViewAsType(view, R.id.deviceTypeCheck, "field 'deviceTypeCheckBox'", CheckBox.class);
            myViewHolder.cardView = (CardView) Utils.findRequiredViewAsType(view, R.id.card_view, "field 'cardView'", CardView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            MyViewHolder myViewHolder = this.a;
            if (myViewHolder == null) {
                throw new IllegalStateException("Bindings already cleared.");
            }
            this.a = null;
            myViewHolder.tvDeviceType = null;
            myViewHolder.deviceTypeCheckBox = null;
            myViewHolder.cardView = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(MyViewHolder myViewHolder, final int i) {
        String str;
        final MyViewHolder myViewHolder2 = myViewHolder;
        if (this.c.equals("ar")) {
            str = this.b.get(i).getOfferArName();
        } else {
            str = this.c.equals("en") ? this.b.get(i).getOfferEnName() : "";
        }
        myViewHolder2.tvDeviceType.setText(str);
        myViewHolder2.deviceTypeCheckBox.setChecked(this.b.get(i).isSelected());
        myViewHolder2.deviceTypeCheckBox.setTag(Integer.valueOf(i));
        if (this.b.get(i).isSelected()) {
            myViewHolder2.deviceTypeCheckBox.setChecked(true);
            d = myViewHolder2.deviceTypeCheckBox;
            e = i;
        }
        myViewHolder2.deviceTypeCheckBox.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.adapters.DeviceTypeAdapter.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckBox checkBox = (CheckBox) view;
                int intValue = ((Integer) checkBox.getTag()).intValue();
                if (checkBox.isChecked()) {
                    if (DeviceTypeAdapter.d != null) {
                        DeviceTypeAdapter.d.setChecked(false);
                        DeviceTypeAdapter.this.b.get(DeviceTypeAdapter.e).setSelected(false);
                    }
                    CheckBox unused = DeviceTypeAdapter.d = checkBox;
                    int unused2 = DeviceTypeAdapter.e = intValue;
                } else {
                    CheckBox unused3 = DeviceTypeAdapter.d = null;
                }
                DeviceTypeAdapter.this.b.get(intValue).setSelected(checkBox.isChecked());
                if (DeviceTypeAdapter.this.c.equals("ar")) {
                    DeviceTypeAdapter.this.a.a(DeviceTypeAdapter.this.b.get(i).getOfferArName(), DeviceTypeAdapter.this.b.get(i).getOfferId());
                } else if (!DeviceTypeAdapter.this.c.equals("en")) {
                } else {
                    DeviceTypeAdapter.this.a.a(DeviceTypeAdapter.this.b.get(i).getOfferEnName(), DeviceTypeAdapter.this.b.get(i).getOfferId());
                }
            }
        });
        myViewHolder2.cardView.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.adapters.DeviceTypeAdapter.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                myViewHolder2.deviceTypeCheckBox.performClick();
            }
        });
    }

    public DeviceTypeAdapter(Context context) {
        this.f = context;
        dcj dcjVar = (dcj) context;
        this.a = dcjVar;
        this.b = dcjVar.a();
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
        @BindView(R.id.deviceTypeCheck)
        CheckBox deviceTypeCheckBox;
        @BindView(R.id.tvDeviceType)
        TextView tvDeviceType;

        MyViewHolder(View view) {
            super(view);
            this.a = view;
            ButterKnife.bind(this, view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.device_type_adapter_content, viewGroup, false));
    }
}
