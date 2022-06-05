package com.ucare.we.dev;

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
public class RequestStatusResponseActivity extends dae {
    Button a;
    String b;
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

    public static void a(Context context, String str, String str2, String str3) {
        Intent intent = new Intent(context, RequestStatusResponseActivity.class);
        intent.putExtra("success_msg", str);
        intent.putExtra("success_msg_details", str2);
        intent.putExtra("ticket_number", str3);
        intent.putExtra("isError", false);
        context.startActivity(intent);
    }

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_voucher_success);
        this.a = (Button) findViewById(R.id.btn_done_transfer);
        this.e = (TextView) findViewById(R.id.txtMessage);
        this.f = (TextView) findViewById(R.id.txtMessageDetails);
        this.h = (ImageView) findViewById(R.id.imgStatus);
        this.b = getIntent().getExtras().getString("success_msg");
        this.c = getIntent().getExtras().getString("success_msg_details");
        this.d = getIntent().getExtras().getString("ticket_number");
        this.g = getIntent().getExtras().getBoolean("isError");
        this.e.setText(this.b);
        TextView textView = this.f;
        textView.setText(this.c + "\n" + getString(R.string.ticket_number) + this.d);
        if (this.g) {
            this.h.setImageResource(R.drawable.ic_error_vector);
            this.a.setText(getString(R.string.popup_cancel));
        } else {
            this.h.setImageResource(R.drawable.ic_success_vector);
            this.a.setText(getString(R.string.ok));
        }
        this.a.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.dev.RequestStatusResponseActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (RequestStatusResponseActivity.this.j.l()) {
                    Intent intent = new Intent(RequestStatusResponseActivity.this, HomeActivity.class);
                    intent.addFlags(603979776);
                    RequestStatusResponseActivity.this.startActivity(intent);
                } else if (RequestStatusResponseActivity.this.j.d()) {
                    if (RequestStatusResponseActivity.this.j.f() && RequestStatusResponseActivity.this.j.h()) {
                        Intent intent2 = new Intent(RequestStatusResponseActivity.this, HomeActivity.class);
                        intent2.addFlags(603979776);
                        RequestStatusResponseActivity.this.startActivity(intent2);
                    } else if (RequestStatusResponseActivity.this.j.f() && !RequestStatusResponseActivity.this.j.h()) {
                        Intent intent3 = new Intent(RequestStatusResponseActivity.this, HomeActivity.class);
                        intent3.addFlags(603979776);
                        RequestStatusResponseActivity.this.startActivity(intent3);
                    } else if (RequestStatusResponseActivity.this.j.g() && RequestStatusResponseActivity.this.j.h()) {
                        Intent intent4 = new Intent(RequestStatusResponseActivity.this, HomeActivity.class);
                        intent4.addFlags(603979776);
                        RequestStatusResponseActivity.this.startActivity(intent4);
                    } else if (!RequestStatusResponseActivity.this.j.g() || RequestStatusResponseActivity.this.j.h()) {
                    } else {
                        Intent intent5 = new Intent(RequestStatusResponseActivity.this, HomeActivity.class);
                        intent5.addFlags(603979776);
                        RequestStatusResponseActivity.this.startActivity(intent5);
                    }
                } else if (!RequestStatusResponseActivity.this.j.e()) {
                } else {
                    if (RequestStatusResponseActivity.this.j.f() && RequestStatusResponseActivity.this.j.h()) {
                        Intent intent6 = new Intent(RequestStatusResponseActivity.this, HomeActivity.class);
                        intent6.addFlags(603979776);
                        RequestStatusResponseActivity.this.startActivity(intent6);
                    } else if (RequestStatusResponseActivity.this.j.f() && !RequestStatusResponseActivity.this.j.h()) {
                        Intent intent7 = new Intent(RequestStatusResponseActivity.this, HomeActivity.class);
                        intent7.addFlags(603979776);
                        RequestStatusResponseActivity.this.startActivity(intent7);
                    } else if (RequestStatusResponseActivity.this.j.g() && RequestStatusResponseActivity.this.j.h()) {
                        Intent intent8 = new Intent(RequestStatusResponseActivity.this, HomeActivity.class);
                        intent8.addFlags(603979776);
                        RequestStatusResponseActivity.this.startActivity(intent8);
                    } else if (!RequestStatusResponseActivity.this.j.g() || RequestStatusResponseActivity.this.j.h()) {
                    } else {
                        Intent intent9 = new Intent(RequestStatusResponseActivity.this, HomeActivity.class);
                        intent9.addFlags(603979776);
                        RequestStatusResponseActivity.this.startActivity(intent9);
                    }
                }
            }
        });
    }
}
