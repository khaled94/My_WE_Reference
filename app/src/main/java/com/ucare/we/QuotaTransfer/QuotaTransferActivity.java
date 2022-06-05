package com.ucare.we.QuotaTransfer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.ucare.we.BalanceTransferActivity;
import com.ucare.we.R;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class QuotaTransferActivity extends czy {
    TextView a;
    @Inject
    djw b;
    View.OnClickListener c = new View.OnClickListener() { // from class: com.ucare.we.QuotaTransfer.QuotaTransferActivity.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            QuotaTransferActivity.this.finish();
        }
    };
    private FragmentTransaction d = getSupportFragmentManager().beginTransaction();
    private FragmentManager e = getSupportFragmentManager();
    private ImageView f;
    private Button g;
    private int h;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.base_activity);
        this.a = (TextView) findViewById(R.id.txtTitle);
        this.f = (ImageView) findViewById(R.id.imgBackButton);
        this.g = (Button) findViewById(R.id.btn_current_number);
        this.f.setOnClickListener(this.c);
        if (getIntent().getExtras() != null) {
            this.h = getIntent().getExtras().getInt("SCREEN_TYPE");
        }
        this.g.setText(this.b.m());
        int i = this.h;
        if (i == 0) {
            this.a.setText(R.string.quota_transfer);
        } else if (i == 1) {
            this.a.setText(R.string.balance_transfer);
        }
        a(this.h == 0 ? getString(R.string.quota_transfer) : getString(R.string.balance_transfer), false, false);
        getSupportFragmentManager().beginTransaction().replace(R.id.lnrLayoutContainer, cwl.a(this.h)).commit();
    }

    public final void a(Fragment fragment, String str) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        this.d = beginTransaction;
        beginTransaction.replace(R.id.lnrLayoutContainer, fragment, str);
        if (this.e.findFragmentByTag(str) == null && this.h == 0) {
            this.d.addToBackStack(str);
        }
        this.d.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        this.d.commit();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (Fragment fragment : getSupportFragmentManager().getFragments()) {
            fragment.onActivityResult(i, i2, intent);
        }
    }

    public final void a(String str) {
        int i = this.h;
        if (i == 0) {
            a(cwn.b(str), "QUOTA_TRANSFER_SECOND_FRAGMENT");
        } else if (i != 1) {
        } else {
            Intent intent = new Intent(this, BalanceTransferActivity.class);
            intent.putExtra("SELECTED_NUMBER", str);
            startActivity(intent);
        }
    }
}
