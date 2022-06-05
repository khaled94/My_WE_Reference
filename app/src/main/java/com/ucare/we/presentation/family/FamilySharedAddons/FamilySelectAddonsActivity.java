package com.ucare.we.presentation.family.FamilySharedAddons;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentTransaction;
import com.ucare.we.R;
import com.ucare.we.model.MoreBundleModel.AvailableAddOnOfferingsList;
import java.io.Serializable;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class FamilySelectAddonsActivity extends czy implements Serializable {
    @Inject
    djw a;
    String b;
    AvailableAddOnOfferingsList c;
    TextView f;
    private ImageView h;
    int d = -1;
    boolean e = false;
    View.OnClickListener g = new View.OnClickListener() { // from class: com.ucare.we.presentation.family.FamilySharedAddons.FamilySelectAddonsActivity.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FamilySelectAddonsActivity.this.finish();
        }
    };

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.base_activity_small_toolbar);
        this.f = (TextView) findViewById(R.id.txtTitle);
        ImageView imageView = (ImageView) findViewById(R.id.imgBackButton);
        this.h = imageView;
        imageView.setOnClickListener(this.g);
        Intent intent = getIntent();
        this.b = intent.getStringExtra(dat.a);
        this.e = intent.getBooleanExtra("regional_popUp", false);
        this.c = (AvailableAddOnOfferingsList) intent.getParcelableExtra("SUB_BUNDLES");
        if (intent.hasExtra("position")) {
            this.d = intent.getIntExtra("position", -1);
        }
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        if (this.c != null) {
            if (this.a.k().equalsIgnoreCase("ar")) {
                this.f.setText(this.c.getGroupArName());
            } else {
                this.f.setText(this.c.getGroupEnName());
            }
            beginTransaction.replace(R.id.lnrLayoutContainer, deb.a(this.b, this.c, Boolean.FALSE, this.e)).commit();
        } else {
            this.a.v().equalsIgnoreCase("prepaid");
            this.f.setText(getString(R.string.familyAddSharedAddon));
            beginTransaction.replace(R.id.lnrLayoutContainer, deb.a(this.b, Boolean.TRUE, this.e)).commit();
        }
        a(this.f.getText().toString(), false, false);
    }
}
