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
import com.ucare.we.adapters.NeedInstallationAdapter;
import com.ucare.we.model.NeedInstllation;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class NeedInstallationActivity extends czy implements dcn {
    NeedInstallationAdapter a;
    ArrayList<NeedInstllation> c;
    @BindView(R.id.imgBackButton)
    ImageView imgBackButton;
    @BindView(R.id.selectValueRecyclerView)
    RecyclerView needInstallationRecyclerView;
    @BindView(R.id.txtTitle)
    TextView txtTitle;
    String b = "";
    String d = "";
    String e = "";

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.select_reason_activity);
        ButterKnife.bind(this);
        a(getString(R.string.need_installation), false, false);
        this.d = getIntent().getExtras().getString("NEED_INSTLATION_VALUE");
        this.c = new ArrayList<>();
        NeedInstllation needInstllation = new NeedInstllation();
        needInstllation.setOfferName(getString(R.string.yes));
        needInstllation.setDefaultNAme("Yes");
        NeedInstllation needInstllation2 = new NeedInstllation();
        needInstllation2.setOfferName(getString(R.string.no));
        needInstllation2.setDefaultNAme("No");
        this.c.add(needInstllation);
        this.c.add(needInstllation2);
        if (!this.d.isEmpty()) {
            for (int i = 0; i < this.c.size(); i++) {
                if (this.c.get(i).getOfferName().equals(this.d)) {
                    this.c.get(i).setSelected(true);
                }
            }
        }
        this.a = new NeedInstallationAdapter(this);
        this.needInstallationRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.needInstallationRecyclerView.setAdapter(this.a);
        this.txtTitle.setText(getString(R.string.need_installation));
        this.imgBackButton.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.NeedInstallationActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NeedInstallationActivity.this.a();
            }
        });
    }

    @Override // defpackage.dcn
    public final void a(String str, String str2) {
        this.b = str;
        this.e = str2;
        a();
    }

    public final void a() {
        Intent intent = new Intent();
        intent.putExtra("NEED_INSTLATION_VALUE", this.b);
        intent.putExtra("NEED_INSTLATION_DEFAULT_VALUE", this.e);
        setResult(-1, intent);
        finish();
        finish();
    }

    @Override // defpackage.dcn
    public final ArrayList<NeedInstllation> b() {
        return this.c;
    }
}
