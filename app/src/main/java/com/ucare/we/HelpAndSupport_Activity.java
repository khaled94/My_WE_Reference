package com.ucare.we;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ucare.we.newHome.features.AnonymousNewHomeActivity;
import com.ucare.we.newHome.features.HomeActivity;
import com.ucare.we.presentation.contactus.ContactUsActivity;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class HelpAndSupport_Activity extends czy implements View.OnClickListener {
    @Inject
    protected djb a;
    @Inject
    protected dhn b;
    @Inject
    protected dio c;
    @Inject
    djx d;
    @Inject
    djw e;
    int f;
    ImageView g;
    TextView h;
    TextView i;
    TextView j;
    View.OnClickListener k = new View.OnClickListener() { // from class: com.ucare.we.HelpAndSupport_Activity.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            HelpAndSupport_Activity.this.finish();
        }
    };

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_help_and_support);
        p();
        this.i = (TextView) findViewById(R.id.layout_faq);
        this.h = (TextView) findViewById(R.id.layout_contact_us);
        this.j = (TextView) findViewById(R.id.layout_tutorial);
        this.g = (ImageView) findViewById(R.id.imgBackButton);
        this.f = getIntent().getIntExtra("mode", 1);
        int i = 8;
        if (this.c.h()) {
            this.h.setVisibility(8);
        }
        TextView textView = this.j;
        if (this.c.a()) {
            i = 0;
        }
        textView.setVisibility(i);
        this.i.setOnClickListener(this);
        this.h.setOnClickListener(this);
        this.j.setOnClickListener(this);
        this.g.setOnClickListener(this.k);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.layout_contact_us /* 2131362422 */:
                this.d.b(this, ContactUsActivity.class);
                return;
            case R.id.layout_faq /* 2131362423 */:
                this.d.b(this, FAQActivity.class);
                return;
            case R.id.layout_mobile_reset_password /* 2131362424 */:
            case R.id.layout_mobile_sign_up /* 2131362425 */:
            default:
                return;
            case R.id.layout_tutorial /* 2131362426 */:
                this.e.c(true);
                if (this.c.a()) {
                    this.d.b(this, HomeActivity.class);
                    return;
                } else {
                    this.d.b(this, AnonymousNewHomeActivity.class);
                    return;
                }
        }
    }
}
