package com.ucare.we;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class ErrorHandlerActivity extends dae implements dhk {
    Button a;
    TextView b;
    @Inject
    dio c;
    @Inject
    djb d;

    @Override // defpackage.dhk
    public final void a(int i) {
    }

    @Override // defpackage.dhk
    public final void a(int i, int i2, String str) {
    }

    @Override // defpackage.dhk
    public final void a(boolean z) {
    }

    public static void a(Context context, String str, int i) {
        Intent intent = new Intent(context, ErrorHandlerActivity.class);
        intent.putExtra("errorMessage", str);
        intent.putExtra("tokenExpired", i);
        context.startActivity(intent);
    }

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(R.layout.activity_error);
        this.b = (TextView) findViewById(R.id.tv_error_message);
        if (getIntent().getIntExtra("tokenExpired", 0) == 1200) {
            str = getString(R.string.something_went_wrong);
        } else {
            str = getIntent().getStringExtra("errorMessage");
        }
        this.b.setText(str);
        this.a = (Button) findViewById(R.id.btn_ok);
        this.c.a((dhk) this);
        this.a.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.ErrorHandlerActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ErrorHandlerActivity.this.finish();
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.c.b(this);
        super.onDestroy();
    }
}
