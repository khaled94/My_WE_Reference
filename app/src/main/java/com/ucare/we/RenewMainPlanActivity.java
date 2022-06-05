package com.ucare.we;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ucare.we.model.MainPlanResponseBody;
import com.ucare.we.presentation.prepaid.MainActivity;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class RenewMainPlanActivity extends dae {
    TextView a;
    TextView b;
    TextView c;
    ImageView d;
    @Inject
    djx e;
    MainPlanResponseBody f;
    @Inject
    djx g;
    @Inject
    djg h;
    boolean i;

    /* renamed from: lambda$n2EfiNYpD9GiEJ_2s-EgWIST38c */
    public static /* synthetic */ void m4lambda$n2EfiNYpD9GiEJ_2sEgWIST38c(RenewMainPlanActivity renewMainPlanActivity, View view) {
        renewMainPlanActivity.a(view);
    }

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_renew_main_plan);
        dad.a().a.inject(this);
        this.f = (MainPlanResponseBody) getIntent().getParcelableExtra("mainPlan");
        this.i = getIntent().getBooleanExtra("mainActivity", false);
        TextView textView = (TextView) findViewById(R.id.tv_renew_plan_text);
        this.c = textView;
        if (this.f != null) {
            textView.setText(getString(R.string.renew_plan_text) + "\n(" + this.f.getServiceName() + ")");
        }
        this.a = (TextView) findViewById(R.id.tv_ok);
        TextView textView2 = (TextView) findViewById(R.id.tv_cancel);
        this.b = textView2;
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.RenewMainPlanActivity.1
            {
                RenewMainPlanActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RenewMainPlanActivity.this.finish();
            }
        });
        this.a.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.-$$Lambda$RenewMainPlanActivity$n2EfiNYpD9GiEJ_2s-EgWIST38c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RenewMainPlanActivity.m4lambda$n2EfiNYpD9GiEJ_2sEgWIST38c(RenewMainPlanActivity.this, view);
            }
        });
        this.d = (ImageView) findViewById(R.id.iv_close);
    }

    public /* synthetic */ void a(View view) {
        Intent intent;
        if (this.i) {
            intent = new Intent(this, MainActivity.class);
        } else {
            intent = new Intent(this, ManagePlansActivity.class);
        }
        setResult(-1, intent);
        finish();
    }
}
