package com.ucare.we.morebundle;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ucare.we.R;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class MoreBundleActivity extends czy {
    TextView a;
    @Inject
    djw b;
    String c;
    View.OnClickListener d = new View.OnClickListener() { // from class: com.ucare.we.morebundle.-$$Lambda$MoreBundleActivity$_FTZbnKXGutJyYRQ5MzKrTLntv0
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MoreBundleActivity.lambda$_FTZbnKXGutJyYRQ5MzKrTLntv0(MoreBundleActivity.this, view);
        }
    };
    private ImageView e;

    public static /* synthetic */ void lambda$_FTZbnKXGutJyYRQ5MzKrTLntv0(MoreBundleActivity moreBundleActivity, View view) {
        moreBundleActivity.a(view);
    }

    public /* synthetic */ void a(View view) {
        finish();
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.base_activity_small_toolbar);
        a(getString(R.string.extra_bundles), false, false);
        this.a = (TextView) findViewById(R.id.txtTitle);
        ImageView imageView = (ImageView) findViewById(R.id.imgBackButton);
        this.e = imageView;
        imageView.setOnClickListener(this.d);
        this.c = getIntent().getStringExtra(dat.a);
        this.b.v().equalsIgnoreCase("prepaid");
        this.a.setText(getString(R.string.extra_bundles));
        getSupportFragmentManager().beginTransaction().replace(R.id.lnrLayoutContainer, daz.a(this.c)).commit();
    }
}
