package com.ucare.we;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.ucare.we.newHome.features.HomeActivity;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class GiftActivity extends dae {
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

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_gift);
        this.g = (TextView) findViewById(R.id.tvGiftAmount);
        if (this.d.f.isBonus_offers_enabled()) {
            if (this.f.g().equalsIgnoreCase("ar")) {
                TextView textView = this.g;
                textView.setText(getString(R.string.megabytes_free) + this.d.f.getBonus_offers_amount_ar());
            } else {
                TextView textView2 = this.g;
                textView2.setText(getString(R.string.megabytes_free) + this.d.f.getBonus_offers_amount_en());
            }
            this.g.setText(getString(R.string.megabytes_free));
        }
        Button button = (Button) findViewById(R.id.btn_thanks);
        this.a = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.GiftActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (GiftActivity.this.c.l()) {
                    Intent intent = new Intent(GiftActivity.this, HomeActivity.class);
                    intent.addFlags(67108864);
                    GiftActivity.this.startActivity(intent);
                } else if (GiftActivity.this.c.d()) {
                    if (GiftActivity.this.c.f() && GiftActivity.this.c.h()) {
                        Intent intent2 = new Intent(GiftActivity.this, HomeActivity.class);
                        intent2.addFlags(67108864);
                        GiftActivity.this.startActivity(intent2);
                    } else if (GiftActivity.this.c.f() && !GiftActivity.this.c.h()) {
                        Intent intent3 = new Intent(GiftActivity.this, HomeActivity.class);
                        intent3.addFlags(67108864);
                        GiftActivity.this.startActivity(intent3);
                    } else if (GiftActivity.this.c.g() && GiftActivity.this.c.h()) {
                        Intent intent4 = new Intent(GiftActivity.this, HomeActivity.class);
                        intent4.addFlags(67108864);
                        GiftActivity.this.startActivity(intent4);
                    } else if (GiftActivity.this.c.g() && !GiftActivity.this.c.h()) {
                        Intent intent5 = new Intent(GiftActivity.this, HomeActivity.class);
                        intent5.addFlags(67108864);
                        GiftActivity.this.startActivity(intent5);
                    }
                } else if (GiftActivity.this.c.e()) {
                    if (GiftActivity.this.c.f() && GiftActivity.this.c.h()) {
                        Intent intent6 = new Intent(GiftActivity.this, HomeActivity.class);
                        intent6.addFlags(67108864);
                        GiftActivity.this.startActivity(intent6);
                    } else if (GiftActivity.this.c.f() && !GiftActivity.this.c.h()) {
                        Intent intent7 = new Intent(GiftActivity.this, HomeActivity.class);
                        intent7.addFlags(67108864);
                        GiftActivity.this.startActivity(intent7);
                    } else if (GiftActivity.this.c.g() && GiftActivity.this.c.h()) {
                        Intent intent8 = new Intent(GiftActivity.this, HomeActivity.class);
                        intent8.addFlags(67108864);
                        GiftActivity.this.startActivity(intent8);
                    } else if (GiftActivity.this.c.g() && !GiftActivity.this.c.h()) {
                        Intent intent9 = new Intent(GiftActivity.this, HomeActivity.class);
                        intent9.addFlags(67108864);
                        GiftActivity.this.startActivity(intent9);
                    }
                }
                GiftActivity.this.finish();
            }
        });
    }
}
