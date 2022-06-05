package com.ucare.we.helpandsupport;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ucare.we.R;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class HelpAndSupportActivity extends czy {
    TextView a;
    @Inject
    djw b;
    View.OnClickListener c = new View.OnClickListener() { // from class: com.ucare.we.helpandsupport.HelpAndSupportActivity.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            HelpAndSupportActivity.this.finish();
        }
    };
    private ImageView d;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.base_activity_no_toolbar);
        this.a = (TextView) findViewById(R.id.txtTitle);
        ImageView imageView = (ImageView) findViewById(R.id.imgBackButton);
        this.d = imageView;
        imageView.setOnClickListener(this.c);
        this.a.setText(getString(R.string.help_support));
        getSupportFragmentManager().beginTransaction().replace(R.id.lnrLayoutContainer, czw.a()).commit();
    }
}
