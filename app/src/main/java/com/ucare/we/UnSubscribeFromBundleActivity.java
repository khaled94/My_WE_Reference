package com.ucare.we;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ucare.we.model.MainPlanResponseBody;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class UnSubscribeFromBundleActivity extends dae {
    TextView a;
    TextView b;
    TextView c;
    ImageView d;
    @Inject
    djx e;
    MainPlanResponseBody f;

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_unsubscribe_from_bundle);
        this.f = (MainPlanResponseBody) getIntent().getParcelableExtra("mainPlan");
        TextView textView = (TextView) findViewById(R.id.tv_unsubscribe_text);
        this.c = textView;
        if (this.f != null) {
            textView.setText(getString(R.string.unsubscribe_bundle_text) + "\n(" + this.f.getServiceName() + ")");
        }
        this.a = (TextView) findViewById(R.id.tv_ok);
        TextView textView2 = (TextView) findViewById(R.id.tv_cancel);
        this.b = textView2;
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.UnSubscribeFromBundleActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UnSubscribeFromBundleActivity.this.finish();
            }
        });
        this.a.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.UnSubscribeFromBundleActivity.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UnSubscribeFromBundleActivity.this.setResult(-1, new Intent(UnSubscribeFromBundleActivity.this, ManageBundleActivity.class));
                UnSubscribeFromBundleActivity.this.finish();
            }
        });
        ImageView imageView = (ImageView) findViewById(R.id.iv_close);
        this.d = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.UnSubscribeFromBundleActivity.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UnSubscribeFromBundleActivity.this.finish();
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
