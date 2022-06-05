package com.ucare.we;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.ucare.we.newHome.features.HomeActivity;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class BalanceTransferSuccessfullyActivity extends dae {
    @Inject
    djw a;
    @Inject
    dio b;
    Button c;

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_balance_transfer_successfully);
        Button button = (Button) findViewById(R.id.btn_done_transfer);
        this.c = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.BalanceTransferSuccessfullyActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (BalanceTransferSuccessfullyActivity.this.b.l()) {
                    Intent intent = new Intent(BalanceTransferSuccessfullyActivity.this, HomeActivity.class);
                    intent.addFlags(67108864);
                    BalanceTransferSuccessfullyActivity.this.startActivity(intent);
                } else if (BalanceTransferSuccessfullyActivity.this.b.d()) {
                    if (BalanceTransferSuccessfullyActivity.this.b.f() && BalanceTransferSuccessfullyActivity.this.b.h()) {
                        Intent intent2 = new Intent(BalanceTransferSuccessfullyActivity.this, HomeActivity.class);
                        intent2.addFlags(603979776);
                        BalanceTransferSuccessfullyActivity.this.startActivity(intent2);
                    } else if (BalanceTransferSuccessfullyActivity.this.b.f() && !BalanceTransferSuccessfullyActivity.this.b.h()) {
                        Intent intent3 = new Intent(BalanceTransferSuccessfullyActivity.this, HomeActivity.class);
                        intent3.addFlags(603979776);
                        BalanceTransferSuccessfullyActivity.this.startActivity(intent3);
                    } else if (BalanceTransferSuccessfullyActivity.this.b.g() && BalanceTransferSuccessfullyActivity.this.b.h()) {
                        Intent intent4 = new Intent(BalanceTransferSuccessfullyActivity.this, HomeActivity.class);
                        intent4.addFlags(603979776);
                        BalanceTransferSuccessfullyActivity.this.startActivity(intent4);
                    } else if (!BalanceTransferSuccessfullyActivity.this.b.g() || BalanceTransferSuccessfullyActivity.this.b.h()) {
                    } else {
                        Intent intent5 = new Intent(BalanceTransferSuccessfullyActivity.this, HomeActivity.class);
                        intent5.addFlags(603979776);
                        BalanceTransferSuccessfullyActivity.this.startActivity(intent5);
                    }
                } else if (!BalanceTransferSuccessfullyActivity.this.b.e()) {
                } else {
                    if (BalanceTransferSuccessfullyActivity.this.b.f() && BalanceTransferSuccessfullyActivity.this.b.h()) {
                        Intent intent6 = new Intent(BalanceTransferSuccessfullyActivity.this, HomeActivity.class);
                        intent6.addFlags(603979776);
                        BalanceTransferSuccessfullyActivity.this.startActivity(intent6);
                    } else if (BalanceTransferSuccessfullyActivity.this.b.f() && !BalanceTransferSuccessfullyActivity.this.b.h()) {
                        Intent intent7 = new Intent(BalanceTransferSuccessfullyActivity.this, HomeActivity.class);
                        intent7.addFlags(603979776);
                        BalanceTransferSuccessfullyActivity.this.startActivity(intent7);
                    } else if (BalanceTransferSuccessfullyActivity.this.b.g() && BalanceTransferSuccessfullyActivity.this.b.h()) {
                        Intent intent8 = new Intent(BalanceTransferSuccessfullyActivity.this, HomeActivity.class);
                        intent8.addFlags(603979776);
                        BalanceTransferSuccessfullyActivity.this.startActivity(intent8);
                    } else if (!BalanceTransferSuccessfullyActivity.this.b.g() || BalanceTransferSuccessfullyActivity.this.b.h()) {
                    } else {
                        Intent intent9 = new Intent(BalanceTransferSuccessfullyActivity.this, HomeActivity.class);
                        intent9.addFlags(603979776);
                        BalanceTransferSuccessfullyActivity.this.startActivity(intent9);
                    }
                }
            }
        });
    }
}
