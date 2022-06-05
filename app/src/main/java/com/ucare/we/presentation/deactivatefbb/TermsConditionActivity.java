package com.ucare.we.presentation.deactivatefbb;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.ucare.we.R;

/* loaded from: classes2.dex */
public class TermsConditionActivity extends dae {
    ImageView a;

    public static /* synthetic */ void lambda$vzr5kQZhaKs_GuqiEBU2Hrc0Er8(TermsConditionActivity termsConditionActivity, View view) {
        termsConditionActivity.a(view);
    }

    @Override // defpackage.czy, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_terms_condition);
        ImageView imageView = (ImageView) findViewById(R.id.ivClose);
        this.a = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.deactivatefbb.-$$Lambda$TermsConditionActivity$vzr5kQZhaKs_GuqiEBU2Hrc0Er8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TermsConditionActivity.lambda$vzr5kQZhaKs_GuqiEBU2Hrc0Er8(TermsConditionActivity.this, view);
            }
        });
    }

    public /* synthetic */ void a(View view) {
        finish();
    }
}
