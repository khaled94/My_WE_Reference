package com.ucare.we.paybillpostpaidvoucher;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.ucare.we.R;
import com.ucare.we.newHome.features.HomeActivity;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class ResponseActivity extends dae {
    Button a;
    Button b;
    String c;
    String d;
    TextView e;
    TextView f;
    boolean g = false;
    ImageView h;
    @Inject
    djw i;
    @Inject
    dio j;

    public static /* synthetic */ void lambda$fIHwC828vMw5zOTPbLfCC6zYEdY(ResponseActivity responseActivity, View view) {
        responseActivity.a(view);
    }

    public static void a(Context context, String str, String str2, boolean z) {
        Intent intent = new Intent(context, ResponseActivity.class);
        intent.putExtra("success_msg", str);
        intent.putExtra("success_msg_details", str2);
        intent.putExtra("isError", z);
        context.startActivity(intent);
    }

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_voucher_success);
        this.a = (Button) findViewById(R.id.btn_done_transfer);
        this.b = (Button) findViewById(R.id.btn_recharge_payment);
        this.e = (TextView) findViewById(R.id.txtMessage);
        this.f = (TextView) findViewById(R.id.txtMessageDetails);
        this.h = (ImageView) findViewById(R.id.imgStatus);
        this.c = getIntent().getExtras().getString("success_msg");
        this.d = getIntent().getExtras().getString("success_msg_details");
        this.g = getIntent().getExtras().getBoolean("isError");
        this.f.setVisibility(0);
        this.e.setText(this.c);
        this.f.setText(this.d);
        if (this.g) {
            this.h.setImageResource(R.drawable.ic_error_vector);
            this.a.setText(getString(R.string.popup_cancel));
        } else {
            this.h.setImageResource(R.drawable.ic_success_vector);
            this.a.setText(getString(R.string.ok));
        }
        this.a.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.paybillpostpaidvoucher.-$$Lambda$ResponseActivity$fIHwC828vMw5zOTPbLfCC6zYEdY
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResponseActivity.lambda$fIHwC828vMw5zOTPbLfCC6zYEdY(ResponseActivity.this, view);
            }
        });
    }

    public /* synthetic */ void a(View view) {
        if (this.j.l()) {
            Intent intent = new Intent(this, HomeActivity.class);
            if (!this.g) {
                intent.addFlags(67108864);
            }
            startActivity(intent);
        } else if (this.j.d()) {
            if (this.j.f() && this.j.h()) {
                Intent intent2 = new Intent(this, HomeActivity.class);
                if (!this.g) {
                    intent2.addFlags(67108864);
                }
                startActivity(intent2);
            } else if (this.j.f() && !this.j.h()) {
                Intent intent3 = new Intent(this, HomeActivity.class);
                if (!this.g) {
                    intent3.addFlags(67108864);
                }
                startActivity(intent3);
            } else if (this.j.g() && this.j.h()) {
                Intent intent4 = new Intent(this, HomeActivity.class);
                if (!this.g) {
                    intent4.addFlags(67108864);
                }
                startActivity(intent4);
            } else if (!this.j.g() || this.j.h()) {
            } else {
                Intent intent5 = new Intent(this, HomeActivity.class);
                if (!this.g) {
                    intent5.addFlags(67108864);
                }
                startActivity(intent5);
            }
        } else if (!this.j.e()) {
        } else {
            if (this.j.f() && this.j.h()) {
                Intent intent6 = new Intent(this, HomeActivity.class);
                if (!this.g) {
                    intent6.addFlags(67108864);
                }
                startActivity(intent6);
            } else if (this.j.f() && !this.j.h()) {
                Intent intent7 = new Intent(this, HomeActivity.class);
                if (!this.g) {
                    intent7.addFlags(67108864);
                }
                startActivity(intent7);
            } else if (this.j.g() && this.j.h()) {
                Intent intent8 = new Intent(this, HomeActivity.class);
                if (!this.g) {
                    intent8.addFlags(67108864);
                }
                startActivity(intent8);
            } else if (!this.j.g() || this.j.h()) {
            } else {
                Intent intent9 = new Intent(this, HomeActivity.class);
                if (!this.g) {
                    intent9.addFlags(67108864);
                }
                startActivity(intent9);
            }
        }
    }
}
