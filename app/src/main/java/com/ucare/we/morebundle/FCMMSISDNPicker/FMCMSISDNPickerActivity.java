package com.ucare.we.morebundle.FCMMSISDNPicker;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ucare.we.R;

/* loaded from: classes2.dex */
public class FMCMSISDNPickerActivity extends czy {
    TextView a;
    View.OnClickListener b = new View.OnClickListener() { // from class: com.ucare.we.morebundle.FCMMSISDNPicker.FMCMSISDNPickerActivity.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FMCMSISDNPickerActivity.this.finish();
        }
    };
    private ImageView c;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.base_activity_small_toolbar);
        a(getString(R.string.choose_service_number), false, false);
        this.a = (TextView) findViewById(R.id.txtTitle);
        ImageView imageView = (ImageView) findViewById(R.id.imgBackButton);
        this.c = imageView;
        imageView.setOnClickListener(this.b);
        this.a.setText(R.string.choose_service_number);
        getSupportFragmentManager().beginTransaction().replace(R.id.lnrLayoutContainer, dat.a()).commit();
    }
}
