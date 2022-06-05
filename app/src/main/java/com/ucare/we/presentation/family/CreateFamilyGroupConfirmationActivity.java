package com.ucare.we.presentation.family;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.ucare.we.R;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class CreateFamilyGroupConfirmationActivity extends czy implements dju {
    String a;
    @Inject
    djg b;
    View.OnClickListener c = new View.OnClickListener() { // from class: com.ucare.we.presentation.family.CreateFamilyGroupConfirmationActivity.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CreateFamilyGroupConfirmationActivity.this.finish();
        }
    };
    View.OnClickListener d = new View.OnClickListener() { // from class: com.ucare.we.presentation.family.CreateFamilyGroupConfirmationActivity.2
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("OfferId", CreateFamilyGroupConfirmationActivity.this.a);
            CreateFamilyGroupConfirmationActivity.this.setResult(-1, intent);
            CreateFamilyGroupConfirmationActivity.this.finish();
        }
    };
    private TextView e;
    private TextView f;
    private Button g;
    private Button h;

    @Override // defpackage.dju
    public final void a(String str, int i) {
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_create_family_group_confirmation);
        this.e = (TextView) findViewById(R.id.txtMessage);
        this.f = (TextView) findViewById(R.id.txtMessageDetails);
        this.g = (Button) findViewById(R.id.btn_ok);
        this.h = (Button) findViewById(R.id.btn_cancel);
        this.e.setText(getString(R.string.create_group_ttl));
        this.f.setText(getString(R.string.are_you_sure_you_want_to_subscribe_to, new Object[]{"Family 1"}));
        this.g.setOnClickListener(this.d);
        this.h.setOnClickListener(this.c);
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this, this, i);
    }
}
