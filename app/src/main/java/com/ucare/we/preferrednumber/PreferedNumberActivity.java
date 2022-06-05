package com.ucare.we.preferrednumber;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ucare.we.R;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class PreferedNumberActivity extends czy {
    TextView a;
    @Inject
    djw b;
    View.OnClickListener c = new View.OnClickListener() { // from class: com.ucare.we.preferrednumber.PreferedNumberActivity.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PreferedNumberActivity.this.finish();
        }
    };
    CollapsingToolbarLayout d;
    AppBarLayout e;
    private ImageView f;
    private Button g;
    private String h;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_prefered_number);
        a(getString(R.string.prefered_numbers_string), false, false);
        this.d = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        this.e = (AppBarLayout) findViewById(R.id.app_bar);
        this.a = (TextView) findViewById(R.id.txtTitle);
        this.f = (ImageView) findViewById(R.id.imgBackButton);
        this.g = (Button) findViewById(R.id.btn_current_number);
        this.f.setOnClickListener(this.c);
        Intent intent = getIntent();
        if (intent.hasExtra("FMC_SELECTED_MSISDN")) {
            this.h = intent.getExtras().getString("FMC_SELECTED_MSISDN");
        }
        this.g.setText(this.b.m());
        this.a.setText(getString(R.string.prefered_numbers_string));
        getSupportFragmentManager().beginTransaction().replace(R.id.lnrLayoutContainer, dcz.a(this.h)).commit();
        AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams.setScrollFlags(0);
        this.d.setLayoutParams(layoutParams);
        CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) this.e.getLayoutParams();
        layoutParams2.setBehavior(null);
        this.e.setLayoutParams(layoutParams2);
    }
}
