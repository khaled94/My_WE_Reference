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
import com.ucare.we.adapters.SuspendAndResumeDurationAdapter;
import com.ucare.we.model.suspendandresume.SuspendAndResumeDuration;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class SuspendAndResumeDurationSelectActivity extends czy implements dcr {
    SuspendAndResumeDurationAdapter a;
    String b;
    String c = "";
    Intent d;
    ArrayList<SuspendAndResumeDuration> e;
    @BindView(R.id.imgBackButton)
    ImageView imgBackButton;
    @BindView(R.id.selectValueRecyclerView)
    RecyclerView selectValueRecyclerView;
    @BindView(R.id.txtTitle)
    TextView txtTitle;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(R.layout.select_reason_activity);
        ButterKnife.bind(this);
        a(getString(R.string.suspend_duration), false, false);
        this.d = getIntent();
        String a = djv.a("LANGUAGE", "");
        this.e = this.d.getParcelableArrayListExtra("DURATION");
        String stringExtra = this.d.getStringExtra("DURATION_VALUE");
        this.b = stringExtra;
        if (stringExtra == null || stringExtra.isEmpty()) {
            this.b = getString(R.string.not_set);
        } else {
            for (int i = 0; i < this.e.size(); i++) {
                if (a.equalsIgnoreCase("ar")) {
                    str = this.e.get(i).getAr();
                } else {
                    str = this.e.get(i).getEn();
                }
                if (this.b.equals(str)) {
                    this.e.get(i).setSelected(true);
                }
            }
        }
        this.a = new SuspendAndResumeDurationAdapter(this);
        this.selectValueRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.selectValueRecyclerView.setAdapter(this.a);
        this.txtTitle.setText(getString(R.string.suspend_duration));
        this.imgBackButton.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.SuspendAndResumeDurationSelectActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SuspendAndResumeDurationSelectActivity.this.b();
            }
        });
    }

    @Override // defpackage.dcr
    public final void a(String str, String str2) {
        this.b = str;
        this.c = str2;
        b();
    }

    @Override // defpackage.dcr
    public final ArrayList<SuspendAndResumeDuration> a() {
        return this.e;
    }

    public final void b() {
        Intent intent = new Intent();
        intent.putExtra("SUSPEND_AND_RESUME_DURATION_VALUE_IN_DAYS", this.b);
        intent.putExtra("SUSPEND_AND_RESUME_DURATION_VALUE_IN_MONTH", this.c);
        setResult(2, intent);
        finish();
        finish();
    }
}
