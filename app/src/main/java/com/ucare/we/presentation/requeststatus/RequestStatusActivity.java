package com.ucare.we.presentation.requeststatus;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ucare.we.R;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class RequestStatusActivity extends czy {
    TextView a;
    @Inject
    djw b;
    View.OnClickListener c = new View.OnClickListener() { // from class: com.ucare.we.presentation.requeststatus.RequestStatusActivity.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            RequestStatusActivity.this.finish();
        }
    };
    private ImageView d;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.base_activity_small_toolbar);
        a(getString(R.string.request_status), false, false);
        this.a = (TextView) findViewById(R.id.txtTitle);
        ImageView imageView = (ImageView) findViewById(R.id.imgBackButton);
        this.d = imageView;
        imageView.setOnClickListener(this.c);
        this.a.setText(getString(R.string.request_status));
        getSupportFragmentManager().beginTransaction().replace(R.id.lnrLayoutContainer, dgv.a()).commit();
    }
}
