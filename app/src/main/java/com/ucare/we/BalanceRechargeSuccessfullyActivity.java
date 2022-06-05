package com.ucare.we;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.ucare.we.newHome.features.HomeActivity;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class BalanceRechargeSuccessfullyActivity extends dae {
    @Inject
    dio a;
    Button b;

    public static /* synthetic */ void lambda$sO3bMK9RK9betV7nJ8eHZqcqgi8(BalanceRechargeSuccessfullyActivity balanceRechargeSuccessfullyActivity, View view) {
        balanceRechargeSuccessfullyActivity.a(view);
    }

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_balance_recharge_successfully);
        this.a = new dio();
        Button button = (Button) findViewById(R.id.btn_done_transfer);
        this.b = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.-$$Lambda$BalanceRechargeSuccessfullyActivity$sO3bMK9RK9betV7nJ8eHZqcqgi8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BalanceRechargeSuccessfullyActivity.lambda$sO3bMK9RK9betV7nJ8eHZqcqgi8(BalanceRechargeSuccessfullyActivity.this, view);
            }
        });
    }

    public /* synthetic */ void a(View view) {
        if (this.a.l()) {
            Intent intent = new Intent(this, HomeActivity.class);
            intent.addFlags(67108864);
            startActivity(intent);
        } else if (this.a.d()) {
            if (this.a.f() && this.a.h()) {
                Intent intent2 = new Intent(this, HomeActivity.class);
                intent2.addFlags(67108864);
                startActivity(intent2);
            } else if (this.a.f() && !this.a.h()) {
                Intent intent3 = new Intent(this, HomeActivity.class);
                intent3.addFlags(67108864);
                startActivity(intent3);
            } else if (this.a.g() && this.a.h()) {
                Intent intent4 = new Intent(this, HomeActivity.class);
                intent4.addFlags(67108864);
                startActivity(intent4);
            } else if (!this.a.g() || this.a.h()) {
            } else {
                Intent intent5 = new Intent(this, HomeActivity.class);
                intent5.addFlags(67108864);
                startActivity(intent5);
            }
        } else if (!this.a.e()) {
        } else {
            if (this.a.f() && this.a.h()) {
                Intent intent6 = new Intent(this, HomeActivity.class);
                intent6.addFlags(67108864);
                startActivity(intent6);
            } else if (this.a.f() && !this.a.h()) {
                Intent intent7 = new Intent(this, HomeActivity.class);
                intent7.addFlags(67108864);
                startActivity(intent7);
            } else if (this.a.g() && this.a.h()) {
                Intent intent8 = new Intent(this, HomeActivity.class);
                intent8.addFlags(67108864);
                startActivity(intent8);
            } else if (!this.a.g() || this.a.h()) {
            } else {
                Intent intent9 = new Intent(this, HomeActivity.class);
                intent9.addFlags(67108864);
                startActivity(intent9);
            }
        }
    }
}
