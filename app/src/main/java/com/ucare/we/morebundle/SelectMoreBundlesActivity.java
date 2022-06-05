package com.ucare.we.morebundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentTransaction;
import com.ucare.we.R;
import com.ucare.we.model.MoreBundleModel.AvailableAddOnOfferingsList;
import com.ucare.we.model.MoreBundleModel.ResponseRetrieveMoreBundle;
import java.io.Serializable;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class SelectMoreBundlesActivity extends czy implements Serializable {
    @Inject
    djw a;
    String b;
    ResponseRetrieveMoreBundle c;
    AvailableAddOnOfferingsList d;
    TextView g;
    private ImageView i;
    int e = -1;
    boolean f = false;
    View.OnClickListener h = new View.OnClickListener() { // from class: com.ucare.we.morebundle.SelectMoreBundlesActivity.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SelectMoreBundlesActivity.this.finish();
        }
    };

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.base_activity_small_toolbar_new);
        this.g = (TextView) findViewById(R.id.txtTitle);
        ImageView imageView = (ImageView) findViewById(R.id.imgBackButton);
        this.i = imageView;
        imageView.setOnClickListener(this.h);
        Intent intent = getIntent();
        this.b = intent.getStringExtra(dat.a);
        this.f = intent.getBooleanExtra("regional_popUp", false);
        this.c = (ResponseRetrieveMoreBundle) intent.getParcelableExtra("bundle");
        this.d = (AvailableAddOnOfferingsList) intent.getParcelableExtra("SUB_BUNDLES");
        if (intent.hasExtra("position")) {
            this.e = intent.getIntExtra("position", -1);
        }
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        if (this.d != null) {
            if (this.a.k().equalsIgnoreCase("ar")) {
                this.g.setText(this.d.getGroupArName());
            } else {
                this.g.setText(this.d.getGroupEnName());
            }
            beginTransaction.replace(R.id.lnrLayoutContainer, dbd.a(this.b, this.d, this.c, Boolean.FALSE, this.f)).commit();
        } else {
            this.a.v().equalsIgnoreCase("prepaid");
            this.g.setText(getString(R.string.more_data_addons));
            beginTransaction.replace(R.id.lnrLayoutContainer, dbd.a(this.b, this.c, Boolean.TRUE, this.f)).commit();
        }
        f(this.g.getText().toString());
    }
}
