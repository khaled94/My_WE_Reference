package com.ucare.we.chooserequest;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ucare.we.R;

/* loaded from: classes2.dex */
public class ChooseRequestActivity extends czy {
    TextView a;
    View.OnClickListener b = new View.OnClickListener() { // from class: com.ucare.we.chooserequest.ChooseRequestActivity.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ChooseRequestActivity.this.finish();
        }
    };
    private ImageView c;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.base_activity_small_toolbar);
        a(getString(R.string.submit_request), false, false);
        this.a = (TextView) findViewById(R.id.txtTitle);
        ImageView imageView = (ImageView) findViewById(R.id.imgBackButton);
        this.c = imageView;
        imageView.setOnClickListener(this.b);
        this.a.setText(getString(R.string.submit_request));
        getSupportFragmentManager().beginTransaction().replace(R.id.lnrLayoutContainer, cyi.a()).commit();
    }
}
