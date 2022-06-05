package com.ucare.we;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ucare.we.fragment.ResumeFragment;
import com.ucare.we.model.suspendandresume.SuspendAndResumeReasonAndDurationResponse;
import com.ucare.we.model.suspendandresume.SuspendAndResumeResponse;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class SuspendAndResumeActivity extends czy implements dcs {
    ImageView a;
    TextView b;
    TextView c;
    View.OnClickListener d = new View.OnClickListener() { // from class: com.ucare.we.-$$Lambda$SuspendAndResumeActivity$qUVQmGd6Wkjp0UJKWQhQjKysPQ8
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SuspendAndResumeActivity.lambda$qUVQmGd6Wkjp0UJKWQhQjKysPQ8(SuspendAndResumeActivity.this, view);
        }
    };
    @Inject
    djw e;
    @Inject
    dii f;
    @Inject
    djg g;
    SuspendAndResumeResponse h;
    CollapsingToolbarLayout i;
    AppBarLayout j;

    public static /* synthetic */ void lambda$qUVQmGd6Wkjp0UJKWQhQjKysPQ8(SuspendAndResumeActivity suspendAndResumeActivity, View view) {
        suspendAndResumeActivity.a(view);
    }

    @Override // defpackage.dcs
    public final void b(String str) {
    }

    @Override // defpackage.dcs
    public final void c(String str) {
    }

    @Override // defpackage.dcs
    public final void d(String str) {
    }

    public /* synthetic */ void a(View view) {
        finish();
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.suspend_resume_activity);
        this.i = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        this.j = (AppBarLayout) findViewById(R.id.app_bar);
        this.a = (ImageView) findViewById(R.id.imgBackButton);
        this.b = (TextView) findViewById(R.id.txtTitle);
        this.c = (TextView) findViewById(R.id.suspendAndResumeHint);
        a(getString(R.string.suspend_reactivate_service_title), false, true);
        this.a.setOnClickListener(this.d);
        this.g.a(this, getString(R.string.loading));
        this.f.a();
        this.f.f = this;
        AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) this.i.getLayoutParams();
        layoutParams.setScrollFlags(0);
        this.i.setLayoutParams(layoutParams);
        CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) this.j.getLayoutParams();
        layoutParams2.setBehavior(null);
        this.j.setLayoutParams(layoutParams2);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // defpackage.dcs
    public final void a(SuspendAndResumeResponse suspendAndResumeResponse) {
        this.h = suspendAndResumeResponse;
        if (suspendAndResumeResponse.getId().equals(ExifInterface.GPS_MEASUREMENT_2D) || suspendAndResumeResponse.getId().equals(ExifInterface.GPS_MEASUREMENT_3D)) {
            this.f.b();
            this.c.setText(R.string.suspend_service_request);
        } else {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.replace(R.id.frameLayout, ResumeFragment.b());
            beginTransaction.commit();
            this.c.setText(R.string.your_service_currently_suspended);
        }
        this.g.a();
    }

    @Override // defpackage.dcs
    public final void a() {
        finish();
    }

    @Override // defpackage.dcs
    public final void a(String str) {
        this.g.a();
        UnNavigateResponseActivity.a(this, str, getString(R.string.please_try_again), true);
        finish();
    }

    @Override // defpackage.dcs
    public final void a(SuspendAndResumeReasonAndDurationResponse suspendAndResumeReasonAndDurationResponse) {
        this.g.a();
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.frameLayout, czj.b(suspendAndResumeReasonAndDurationResponse));
        beginTransaction.commit();
    }
}
