package com.ucare.we;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentTransaction;
import butterknife.BindView;
import butterknife.ButterKnife;

/* loaded from: classes2.dex */
public class GenericActivity extends czy {
    Intent a;
    @BindView(R.id.frameLayout)
    FrameLayout frameLayout;
    @BindView(R.id.imgBackButton)
    ImageView imgBackButton;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.txtTitle)
    TextView txtTitle;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.generic_activity);
        ButterKnife.bind(this);
        a(getString(R.string.my_account), false, false);
        Intent intent = getIntent();
        this.a = intent;
        String string = intent.getExtras().getString("GENERIC_ACTIVITY");
        setSupportActionBar(this.toolbar);
        this.imgBackButton.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.GenericActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GenericActivity.this.finish();
            }
        });
        if (string.equals("My_ACCOUNT_FRAGMENT")) {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.replace(R.id.frameLayout, dgg.a());
            beginTransaction.commit();
            this.txtTitle.setText(R.string.my_account);
        } else if (string.equals("POST_PAID_MY_ACCOUNT_FRAGMENT")) {
            FragmentTransaction beginTransaction2 = getSupportFragmentManager().beginTransaction();
            beginTransaction2.replace(R.id.frameLayout, dgm.a());
            beginTransaction2.commit();
            this.txtTitle.setText(R.string.my_account);
        } else if (!string.equals("PRE_PAID_MY_ACCOUNT_FRAGMENT")) {
        } else {
            FragmentTransaction beginTransaction3 = getSupportFragmentManager().beginTransaction();
            beginTransaction3.replace(R.id.frameLayout, dgq.a());
            beginTransaction3.commit();
            this.txtTitle.setText(R.string.my_account);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
