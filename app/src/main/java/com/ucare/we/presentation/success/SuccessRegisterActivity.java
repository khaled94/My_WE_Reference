package com.ucare.we.presentation.success;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.ucare.we.R;
import com.ucare.we.newHome.features.HomeActivity;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class SuccessRegisterActivity extends dae {
    Button a;
    @Inject
    djx b;
    @Inject
    dio c;
    @Inject
    dhn d;
    @Inject
    djw e;
    @Inject
    djb f;
    TextView g;

    public static /* synthetic */ void lambda$U0XhTGnBhevxBwWKoRrF9nmcEH0(SuccessRegisterActivity successRegisterActivity, View view) {
        successRegisterActivity.a(view);
    }

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_success_register);
        this.g = (TextView) findViewById(R.id.tvGiftAmount);
        Button button = (Button) findViewById(R.id.btn_thanks);
        this.a = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.success.-$$Lambda$SuccessRegisterActivity$U0XhTGnBhevxBwWKoRrF9nmcEH0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SuccessRegisterActivity.lambda$U0XhTGnBhevxBwWKoRrF9nmcEH0(SuccessRegisterActivity.this, view);
            }
        });
    }

    public /* synthetic */ void a(View view) {
        if (this.c.l()) {
            Intent intent = new Intent(this, HomeActivity.class);
            intent.addFlags(67108864);
            startActivity(intent);
        } else if (this.c.d()) {
            if (this.c.f() && this.c.h()) {
                Intent intent2 = new Intent(this, HomeActivity.class);
                intent2.addFlags(67108864);
                startActivity(intent2);
            } else if (this.c.f() && !this.c.h()) {
                Intent intent3 = new Intent(this, HomeActivity.class);
                intent3.addFlags(67108864);
                startActivity(intent3);
            } else if (this.c.g() && this.c.h()) {
                Intent intent4 = new Intent(this, HomeActivity.class);
                intent4.addFlags(67108864);
                startActivity(intent4);
            } else if (this.c.g() && !this.c.h()) {
                Intent intent5 = new Intent(this, HomeActivity.class);
                intent5.addFlags(67108864);
                startActivity(intent5);
            }
        } else if (this.c.e()) {
            if (this.c.f() && this.c.h()) {
                Intent intent6 = new Intent(this, HomeActivity.class);
                intent6.addFlags(67108864);
                startActivity(intent6);
            } else if (this.c.f() && !this.c.h()) {
                Intent intent7 = new Intent(this, HomeActivity.class);
                intent7.addFlags(67108864);
                startActivity(intent7);
            } else if (this.c.g() && this.c.h()) {
                Intent intent8 = new Intent(this, HomeActivity.class);
                intent8.addFlags(67108864);
                startActivity(intent8);
            } else if (this.c.g() && !this.c.h()) {
                Intent intent9 = new Intent(this, HomeActivity.class);
                intent9.addFlags(67108864);
                startActivity(intent9);
            }
        }
        finish();
    }
}
