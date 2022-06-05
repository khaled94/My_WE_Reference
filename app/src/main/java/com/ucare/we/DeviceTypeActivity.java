package com.ucare.we;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.ucare.we.adapters.DeviceTypeAdapter;
import com.ucare.we.model.DeviceTypes;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class DeviceTypeActivity extends czy implements dcj {
    DeviceTypeAdapter a;
    ArrayList<DeviceTypes> b;
    String c = "";
    String d = "";
    String e = "";
    @BindView(R.id.imgBackButton)
    ImageView imgBackButton;
    @BindView(R.id.rvDeviceType)
    RecyclerView rvDeviceType;
    @BindView(R.id.txtTitle)
    TextView txtTitle;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.device_type_activty);
        ButterKnife.bind(this);
        a(getString(R.string.device_type), false, false);
        Intent intent = getIntent();
        this.b = intent.getExtras().getParcelableArrayList("DEVICE_TYPE_LIST");
        this.c = intent.getStringExtra("DEVICE_TYPE_ID");
        this.a = new DeviceTypeAdapter(this);
        this.rvDeviceType.setLayoutManager(new LinearLayoutManager(this));
        this.rvDeviceType.setAdapter(this.a);
        this.txtTitle.setText(getString(R.string.device_type));
        if (!this.c.isEmpty()) {
            for (int i = 0; i < this.b.size(); i++) {
                if (this.c.equals(this.b.get(i).getOfferId())) {
                    this.b.get(i).setSelected(true);
                }
            }
        }
        this.imgBackButton.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.DeviceTypeActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceTypeActivity.this.b();
            }
        });
    }

    @Override // defpackage.dcj
    public final void a(String str, String str2) {
        this.d = str;
        this.e = str2;
        b();
    }

    @Override // defpackage.dcj
    public final ArrayList<DeviceTypes> a() {
        return this.b;
    }

    public final void b() {
        Intent intent = new Intent();
        intent.putExtra("DEVICE_TYPE", this.d);
        intent.putExtra("DEVICE_TYPE_ID", this.e);
        setResult(-1, intent);
        finish();
    }
}
