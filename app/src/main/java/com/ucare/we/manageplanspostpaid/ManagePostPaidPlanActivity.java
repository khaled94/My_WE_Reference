package com.ucare.we.manageplanspostpaid;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ucare.we.R;

/* loaded from: classes2.dex */
public class ManagePostPaidPlanActivity extends czy {
    View.OnClickListener a = new View.OnClickListener() { // from class: com.ucare.we.manageplanspostpaid.-$$Lambda$ManagePostPaidPlanActivity$rb9893B9fFWsoFldtW4GVPzYB9c
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ManagePostPaidPlanActivity.lambda$rb9893B9fFWsoFldtW4GVPzYB9c(ManagePostPaidPlanActivity.this, view);
        }
    };
    boolean b = false;
    private ImageView c;
    private TextView d;

    public static /* synthetic */ void lambda$rb9893B9fFWsoFldtW4GVPzYB9c(ManagePostPaidPlanActivity managePostPaidPlanActivity, View view) {
        managePostPaidPlanActivity.a(view);
    }

    public /* synthetic */ void a(View view) {
        finish();
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.base_activity_small_toolbar);
        a(getString(R.string.manage_plan), false, false);
        this.d = (TextView) findViewById(R.id.txtTitle);
        this.c = (ImageView) findViewById(R.id.imgBackButton);
        this.b = getIntent().getBooleanExtra("regional_popUp", false);
        this.c.setOnClickListener(this.a);
        getSupportFragmentManager().beginTransaction().replace(R.id.lnrLayoutContainer, dam.a(this.b)).commit();
        this.d.setText(R.string.manage_plan);
    }
}
