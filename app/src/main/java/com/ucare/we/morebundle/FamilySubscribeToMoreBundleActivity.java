package com.ucare.we.morebundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentTransaction;
import com.ucare.we.R;
import com.ucare.we.model.family.FamilyOffersAddonsList;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class FamilySubscribeToMoreBundleActivity extends czy {
    TextView a;
    View.OnClickListener b = new View.OnClickListener() { // from class: com.ucare.we.morebundle.FamilySubscribeToMoreBundleActivity.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FamilySubscribeToMoreBundleActivity.this.finish();
        }
    };
    private ImageView c;
    private ArrayList<FamilyOffersAddonsList> d;

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
        dax daxVar = new dax();
        daxVar.setArguments(bundle2);
        beginTransaction.replace(R.id.lnrLayoutContainer, daxVar).commit();
    }
}
