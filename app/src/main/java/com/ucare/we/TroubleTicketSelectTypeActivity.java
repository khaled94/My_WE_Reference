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
import com.ucare.we.adapters.TroubleTypeAdapter;
import com.ucare.we.model.ticket.Category;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class TroubleTicketSelectTypeActivity extends czy implements dcw {
    TroubleTypeAdapter a;
    String b;
    Intent c;
    ArrayList<Category> d;
    String e;
    String f;
    String g;
    @BindView(R.id.imgBackButton)
    ImageView imgBackButton;
    @BindView(R.id.troubleValueRecyclerView)
    RecyclerView troubleValueRecyclerView;
    @BindView(R.id.txtTitle)
    TextView txtTitle;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(R.layout.select_trouble_ticket_activity);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        this.c = intent;
        this.d = intent.getParcelableArrayListExtra("TROUBLE_TYPES_LIST");
        this.b = this.c.getStringExtra("TROUBLE_TYPE");
        this.g = this.c.getStringExtra("TOOL_BAR_TITLE");
        this.a = new TroubleTypeAdapter(this);
        this.troubleValueRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.troubleValueRecyclerView.setAdapter(this.a);
        this.e = djv.a("LANGUAGE", "");
        this.txtTitle.setText(this.g);
        a(this.g, false, false);
        String str2 = this.b;
        if (str2 == null || str2.isEmpty()) {
            this.b = getString(R.string.not_set);
        } else if (this.d != null) {
            for (int i = 0; i < this.d.size(); i++) {
                if (this.e.equals("ar")) {
                    str = this.d.get(i).getNameAr();
                } else {
                    str = this.d.get(i).getNameEn();
                }
                if (this.b.equals(str)) {
                    this.d.get(i).setSelected(true);
                }
            }
        }
        this.imgBackButton.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.TroubleTicketSelectTypeActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TroubleTicketSelectTypeActivity.this.b();
            }
        });
    }

    @Override // defpackage.dcw
    public final ArrayList<Category> a() {
        return this.d;
    }

    @Override // defpackage.dcw
    public final void a(String str, String str2) {
        this.b = str;
        this.f = str2;
        b();
    }

    public final void b() {
        Intent intent = new Intent();
        intent.putExtra("TROUBLE_TYPE", this.b);
        intent.putExtra("TROUBLE_ID", this.f);
        setResult(1, intent);
        finish();
        finish();
    }
}
