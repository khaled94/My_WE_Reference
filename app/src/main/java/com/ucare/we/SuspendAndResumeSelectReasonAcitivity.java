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
import com.ucare.we.adapters.SuspendAndResumeSelectReasonAdapter;
import com.ucare.we.model.suspendandresume.Suspend;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class SuspendAndResumeSelectReasonAcitivity extends czy implements dct {
    SuspendAndResumeSelectReasonAdapter a;
    String b;
    String c;
    Intent d;
    ArrayList<Suspend> e;
    @BindView(R.id.imgBackButton)
    ImageView imgBackButton;
    @BindView(R.id.selectValueRecyclerView)
    RecyclerView selectValueRecyclerView;
    @BindView(R.id.txtTitle)
    TextView txtTitle;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.select_reason_activity);
        ButterKnife.bind(this);
        a(getString(R.string.suspend_reason), false, false);
        Intent intent = getIntent();
        this.d = intent;
        this.e = intent.getParcelableArrayListExtra("SUSPEND_RESUME_LIST");
        this.c = this.d.getStringExtra("SUSPEND_VALUE_ID");
        this.b = this.d.getStringExtra("SUSPEND_AND_RESUME_DURATION_VALUE");
        this.a = new SuspendAndResumeSelectReasonAdapter(this);
        this.selectValueRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.selectValueRecyclerView.setAdapter(this.a);
        this.txtTitle.setText(getString(R.string.suspend_reason));
        if (!this.c.isEmpty()) {
            for (int i = 0; i < this.e.size(); i++) {
                if (this.c.equals(this.e.get(i).getId())) {
                    this.e.get(i).setSelected(true);
                }
            }
        }
        this.imgBackButton.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.SuspendAndResumeSelectReasonAcitivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SuspendAndResumeSelectReasonAcitivity.this.b();
            }
        });
    }

    @Override // defpackage.dct
    public final void a(String str, String str2) {
        if (str2.isEmpty()) {
            this.b = getString(R.string.not_set);
        } else {
            this.b = str;
        }
        this.c = str2;
        b();
    }

    @Override // defpackage.dct
    public final ArrayList<Suspend> a() {
        return this.e;
    }

    public final void b() {
        Intent intent = new Intent();
        intent.putExtra("SUSPEND_AND_RESUME_DURATION_VALUE", this.b);
        intent.putExtra("SUSPEND_VALUE_ID", this.c);
        setResult(1, intent);
        finish();
        finish();
    }

    @Override // defpackage.dct
    public final String c() {
        return this.c;
    }
}
