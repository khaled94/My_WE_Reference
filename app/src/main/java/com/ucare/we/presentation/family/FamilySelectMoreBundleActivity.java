package com.ucare.we.presentation.family;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentTransaction;
import com.ucare.we.R;
import com.ucare.we.model.family.FamilyAvailableOffersAddonsList;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class FamilySelectMoreBundleActivity extends czy {
    TextView a;
    View.OnClickListener b = new View.OnClickListener() { // from class: com.ucare.we.presentation.family.FamilySelectMoreBundleActivity.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FamilySelectMoreBundleActivity.this.finish();
        }
    };
    private ImageView c;
    private ArrayList<FamilyAvailableOffersAddonsList> d;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.base_activity_small_toolbar);
        this.a = (TextView) findViewById(R.id.txtTitle);
        this.c = (ImageView) findViewById(R.id.imgBackButton);
        Intent intent = getIntent();
        ArrayList<FamilyAvailableOffersAddonsList> arrayList = (ArrayList) getIntent().getSerializableExtra("ExtrasList");
        this.d = arrayList;
        if (arrayList == null) {
            this.d = ((FamilyAvailableOffersAddonsList) getIntent().getSerializableExtra("SUB_BUNDLES")).getChildGroups();
        }
        String stringExtra = intent.getStringExtra("title");
        this.a.setText(stringExtra);
        a(stringExtra, false, false);
        this.c.setOnClickListener(this.b);
        int intExtra = getIntent().getIntExtra("position", 0);
        Bundle bundle2 = new Bundle();
        bundle2.putSerializable("ExtrasList", this.d);
        bundle2.putSerializable("position", Integer.valueOf(intExtra));
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        ddy ddyVar = new ddy();
        ddyVar.setArguments(bundle2);
        beginTransaction.replace(R.id.lnrLayoutContainer, ddyVar).commit();
    }
}
