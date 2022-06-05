package com.ucare.we;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.ucare.we.newHome.features.AnonymousNewHomeActivity;
import com.ucare.we.newHome.features.HomeActivity;
import com.ucare.we.presentation.postpaid.PostPaidMainActivity;
import com.ucare.we.presentation.prepaid.MainActivity;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class SettingActivity extends czy {
    @Inject
    djb a;
    @Inject
    djx b;
    @Inject
    dio c;
    @Inject
    dhn d;
    @Inject
    djw e;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_settings);
        a(getString(R.string.app_settings), false, false);
        ((TextView) findViewById(R.id.app_version)).setText("2.6.1");
        ((Button) findViewById(R.id.btn_change_language)).setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.SettingActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.this.a.b();
                if (!SettingActivity.this.c.a()) {
                    SettingActivity.this.getApplication();
                    djb.a(App.b, SettingActivity.this.e.b("en"));
                    SettingActivity.this.b.b(SettingActivity.this, AnonymousNewHomeActivity.class);
                    SettingActivity.this.finish();
                    return;
                }
                if (MainActivity.a != null) {
                    MainActivity.a.finish();
                }
                if (PostPaidMainActivity.a != null) {
                    PostPaidMainActivity.a.finish();
                }
                SettingActivity.this.getApplication();
                djb.a(App.b, SettingActivity.this.e.b("en"));
                if (SettingActivity.this.c.l()) {
                    Intent intent = new Intent(SettingActivity.this, HomeActivity.class);
                    intent.addFlags(67108864);
                    SettingActivity.this.startActivity(intent);
                } else if (SettingActivity.this.c.d()) {
                    if (SettingActivity.this.c.f() && SettingActivity.this.c.h()) {
                        Intent intent2 = new Intent(SettingActivity.this, HomeActivity.class);
                        intent2.addFlags(67108864);
                        SettingActivity.this.startActivity(intent2);
                    } else if (SettingActivity.this.c.f() && !SettingActivity.this.c.h()) {
                        Intent intent3 = new Intent(SettingActivity.this, HomeActivity.class);
                        intent3.addFlags(67108864);
                        SettingActivity.this.startActivity(intent3);
                    } else if (SettingActivity.this.c.g() && SettingActivity.this.c.h()) {
                        Intent intent4 = new Intent(SettingActivity.this, HomeActivity.class);
                        intent4.addFlags(67108864);
                        SettingActivity.this.startActivity(intent4);
                    } else if (!SettingActivity.this.c.g() || SettingActivity.this.c.h()) {
                    } else {
                        Intent intent5 = new Intent(SettingActivity.this, HomeActivity.class);
                        intent5.addFlags(67108864);
                        SettingActivity.this.startActivity(intent5);
                    }
                } else if (SettingActivity.this.c.e()) {
                    if (SettingActivity.this.c.f() && SettingActivity.this.c.h()) {
                        Intent intent6 = new Intent(SettingActivity.this, HomeActivity.class);
                        intent6.addFlags(67108864);
                        SettingActivity.this.startActivity(intent6);
                    } else if (SettingActivity.this.c.f() && !SettingActivity.this.c.h()) {
                        Intent intent7 = new Intent(SettingActivity.this, HomeActivity.class);
                        intent7.addFlags(67108864);
                        SettingActivity.this.startActivity(intent7);
                    } else if (SettingActivity.this.c.g() && SettingActivity.this.c.h()) {
                        Intent intent8 = new Intent(SettingActivity.this, HomeActivity.class);
                        intent8.addFlags(67108864);
                        SettingActivity.this.startActivity(intent8);
                    } else if (!SettingActivity.this.c.g() || SettingActivity.this.c.h()) {
                    } else {
                        Intent intent9 = new Intent(SettingActivity.this, HomeActivity.class);
                        intent9.addFlags(67108864);
                        SettingActivity.this.startActivity(intent9);
                    }
                } else {
                    Intent intent10 = new Intent(SettingActivity.this, HomeActivity.class);
                    intent10.addFlags(67108864);
                    SettingActivity.this.startActivity(intent10);
                }
            }
        });
        ((TextView) findViewById(R.id.txtTitle)).setText(getString(R.string.app_settings));
        ((ImageView) findViewById(R.id.imgBackButton)).setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.SettingActivity.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.this.onBackPressed();
            }
        });
    }

    public void openPrivacyPolicy(View view) {
        startActivity(new Intent(this, PrivacyPolicyActivity.class));
    }
}
