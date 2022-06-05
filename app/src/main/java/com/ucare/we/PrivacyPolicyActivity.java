package com.ucare.we;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes2.dex */
public class PrivacyPolicyActivity extends czy {
    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_privacy_policy);
        a(getString(R.string.privacy_policy), true, false);
    }

    @Override // defpackage.czy, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
