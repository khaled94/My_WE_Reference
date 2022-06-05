package com.ucare.we.presentation.family.FamilySharedAddons;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentTransaction;
import com.ucare.we.R;
import com.ucare.we.model.MoreBundleModel.AvailableAddOnOfferingList;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class FamilySubscribeAddonsActivity extends czy {
    TextView a;
    View.OnClickListener b = new View.OnClickListener() { // from class: com.ucare.we.presentation.family.FamilySharedAddons.FamilySubscribeAddonsActivity.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FamilySubscribeAddonsActivity.this.finish();
        }
    };
    private ImageView c;
    private ArrayList<AvailableAddOnOfferingList> d;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.base_activity_small_toolbar);
        this.a = (TextView) findViewById(R.id.txtTitle);
        this.c = (ImageView) findViewById(R.id.imgBackButton);
        Intent intent = getIntent();
        this.d = (ArrayList) getIntent().getSerializableExtra("ExtrasList");
        String stringExtra = intent.getStringExtra("title");
        this.a.setText(stringExtra);
        a(stringExtra, false, false);
        this.c.setOnClickListener(this.b);
        int intExtra = getIntent().getIntExtra("position", 0);
        Bundle bundle2 = new Bundle();
        bundle2.putSerializable("ExtrasList", this.d);
        bundle2.putSerializable("position", Integer.valueOf(intExtra));
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        dee deeVar = new dee();
        deeVar.setArguments(bundle2);
        beginTransaction.replace(R.id.lnrLayoutContainer, deeVar).commit();
    }
}
