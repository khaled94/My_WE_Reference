package com.ucare.we;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.ucare.we.presentation.prepaid.MainActivity;

/* loaded from: classes2.dex */
public class SuccessHandlerActivity extends dae {
    Button a;
    TextView b;
    TextView c;

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_success_handler);
        this.b = (TextView) findViewById(R.id.tv_success_message);
        this.c = (TextView) findViewById(R.id.tv_success_message_details);
        String stringExtra = getIntent().getStringExtra("successMessage");
        String stringExtra2 = getIntent().getStringExtra("successMessageDetails");
        this.b.setText(stringExtra);
        this.c.setText(stringExtra2);
        Button button = (Button) findViewById(R.id.btn_ok);
        this.a = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.SuccessHandlerActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (SuccessHandlerActivity.this.getIntent().getBooleanExtra("bundle", false)) {
                    SuccessHandlerActivity.this.setResult(-1, new Intent(SuccessHandlerActivity.this, ManageBundleActivity.class));
                } else if (SuccessHandlerActivity.this.getIntent().getBooleanExtra("refresh", false)) {
                    Intent intent = new Intent(SuccessHandlerActivity.this, MainActivity.class);
                    intent.addFlags(603979776);
                    SuccessHandlerActivity.this.startActivity(intent);
                }
                SuccessHandlerActivity.this.finish();
            }
        });
    }
}
