package com.ucare.we.loginwithanotheraccount;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.ucare.we.R;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class LoginWithAnotherAccountActivity extends AppCompatActivity {
    @Inject
    djw a;
    View.OnClickListener b = new View.OnClickListener() { // from class: com.ucare.we.loginwithanotheraccount.LoginWithAnotherAccountActivity.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            LoginWithAnotherAccountActivity.this.finish();
        }
    };
    private ImageView c;
    private TextView d;
    private Button e;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.base_activity);
        this.d = (TextView) findViewById(R.id.txtTitle);
        this.c = (ImageView) findViewById(R.id.imgBackButton);
        this.e = (Button) findViewById(R.id.btn_current_number);
        this.c.setOnClickListener(this.b);
        this.e.setText(this.a.m());
        getSupportFragmentManager().beginTransaction().replace(R.id.lnrLayoutContainer, dai.a()).commit();
    }
}
