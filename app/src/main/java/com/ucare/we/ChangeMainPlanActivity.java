package com.ucare.we;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ucare.we.model.PlansAndBundlesResponseBody;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class ChangeMainPlanActivity extends dae {
    TextView a;
    TextView b;
    TextView c;
    ImageView d;
    @Inject
    djx e;
    @Inject
    djw f;
    PlansAndBundlesResponseBody g;
    @Inject
    djb h;
    @Inject
    dio i;
    String j = "";
    TextView k;
    boolean l;

    /* renamed from: lambda$B93GLXn3CnB-WoSRTKmsHAzXd30 */
    public static /* synthetic */ void m0lambda$B93GLXn3CnBWoSRTKmsHAzXd30(ChangeMainPlanActivity changeMainPlanActivity, View view) {
        changeMainPlanActivity.a(view);
    }

    /* renamed from: lambda$Np2CLlVhzL5a_l4x7-ZNdOwOsQ4 */
    public static /* synthetic */ void m1lambda$Np2CLlVhzL5a_l4x7ZNdOwOsQ4(ChangeMainPlanActivity changeMainPlanActivity, View view) {
        changeMainPlanActivity.b(view);
    }

    public static /* synthetic */ void lambda$XvI43SYJLobyXf3d0aW2sGccLwM(ChangeMainPlanActivity changeMainPlanActivity, View view) {
        changeMainPlanActivity.c(view);
    }

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_change_main_plan);
        this.l = getIntent().getBooleanExtra("subscribe", false);
        this.g = (PlansAndBundlesResponseBody) getIntent().getParcelableExtra("planToBeChanged");
        this.j = getIntent().getStringExtra("price");
        this.k = (TextView) findViewById(R.id.tv_main_plan_title);
        this.c = (TextView) findViewById(R.id.tv_change_plan_text);
        if (this.l) {
            if (this.g != null) {
                this.k.setText(getString(R.string.renew_plan));
                if (this.i.g()) {
                    if (this.h.f()) {
                        TextView textView = this.c;
                        textView.setText(getString(R.string.renew_plan_p1) + this.g.getOfferArName() + getString(R.string.renew_plan_p1_1) + this.f.m() + " \n" + getString(R.string.renew_plan_p2) + this.j + getString(R.string.renew_plan_p3) + " \n" + getString(R.string.renew_plan_p4));
                    } else {
                        TextView textView2 = this.c;
                        textView2.setText(getString(R.string.renew_plan_p1) + this.g.getOfferEnName() + getString(R.string.renew_plan_p1_1) + this.f.m() + " \n" + getString(R.string.renew_plan_p2) + this.j + getString(R.string.renew_plan_p3) + " \n" + getString(R.string.renew_plan_p4));
                    }
                } else if (this.h.f()) {
                    TextView textView3 = this.c;
                    textView3.setText(getString(R.string.renew_plan_text) + "(" + this.g.getOfferArName() + ")؟");
                } else {
                    TextView textView4 = this.c;
                    textView4.setText(getString(R.string.renew_plan_text) + "(" + this.g.getOfferEnName() + ")?");
                }
            }
        } else if (this.g != null) {
            this.k.setText(getString(R.string.chaneg_plan));
            if (this.h.f()) {
                TextView textView5 = this.c;
                textView5.setText(getString(R.string.changr_main_plan_text) + "\n" + getString(R.string.to) + "(" + this.g.getOfferArName() + ")");
            } else {
                TextView textView6 = this.c;
                textView6.setText(getString(R.string.changr_main_plan_text) + "\n" + getString(R.string.to) + "(" + this.g.getOfferEnName() + ")");
            }
        }
        this.a = (TextView) findViewById(R.id.tv_ok);
        TextView textView7 = (TextView) findViewById(R.id.tv_cancel);
        this.b = textView7;
        textView7.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.-$$Lambda$ChangeMainPlanActivity$XvI43SYJLobyXf3d0aW2sGccLwM
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeMainPlanActivity.lambda$XvI43SYJLobyXf3d0aW2sGccLwM(ChangeMainPlanActivity.this, view);
            }
        });
        this.a.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.-$$Lambda$ChangeMainPlanActivity$Np2CLlVhzL5a_l4x7-ZNdOwOsQ4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeMainPlanActivity.m1lambda$Np2CLlVhzL5a_l4x7ZNdOwOsQ4(ChangeMainPlanActivity.this, view);
            }
        });
        ImageView imageView = (ImageView) findViewById(R.id.iv_close);
        this.d = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.-$$Lambda$ChangeMainPlanActivity$B93GLXn3CnB-WoSRTKmsHAzXd30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeMainPlanActivity.m0lambda$B93GLXn3CnBWoSRTKmsHAzXd30(ChangeMainPlanActivity.this, view);
            }
        });
    }

    public /* synthetic */ void c(View view) {
        finish();
    }

    public /* synthetic */ void b(View view) {
        setResult(-1, new Intent(this, ManagePlansActivity.class));
        finish();
    }

    public /* synthetic */ void a(View view) {
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
