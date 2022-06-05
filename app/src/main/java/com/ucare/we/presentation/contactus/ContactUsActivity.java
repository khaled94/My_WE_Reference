package com.ucare.we.presentation.contactus;

import android.os.Bundle;
import com.ucare.we.R;

/* loaded from: classes2.dex */
public class ContactUsActivity extends czy {
    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.base_activity_no_toolbar);
        getSupportFragmentManager().beginTransaction().replace(R.id.lnrLayoutContainer, ddr.a()).commit();
    }
}
