package com.ucare.we;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;

/* loaded from: classes2.dex */
public class ServiceTicketActivity extends czy {
    View.OnClickListener a = new View.OnClickListener() { // from class: com.ucare.we.-$$Lambda$ServiceTicketActivity$GgfBwcAmGOrTSC3Zhn4DhSxw928
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ServiceTicketActivity.lambda$GgfBwcAmGOrTSC3Zhn4DhSxw928(ServiceTicketActivity.this, view);
        }
    };
    @BindView(R.id.imgBackButton)
    ImageView imgBackButton;
    @BindView(R.id.newRequestButton)
    Button newRequestButton;
    @BindView(R.id.newRequestLinearLayout)
    LinearLayout newRequestLinearLayout;
    @BindView(R.id.txtTitle)
    TextView txtTitle;

    public static /* synthetic */ void lambda$GgfBwcAmGOrTSC3Zhn4DhSxw928(ServiceTicketActivity serviceTicketActivity, View view) {
        serviceTicketActivity.a(view);
    }

    public /* synthetic */ void a(View view) {
        finish();
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.service_ticket_activity);
        ButterKnife.bind(this);
        a(getString(R.string.service_ticket), false, false);
        this.imgBackButton.setOnClickListener(this.a);
        this.txtTitle.setText(R.string.service_ticket);
        this.newRequestButton.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.ServiceTicketActivity.1
            {
                ServiceTicketActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ServiceTicketActivity.this.newRequestLinearLayout.performClick();
            }
        });
        this.newRequestLinearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.ServiceTicketActivity.2
            {
                ServiceTicketActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ServiceTicketActivity.this.startActivity(new Intent(ServiceTicketActivity.this, RequestDeviceActivity.class));
            }
        });
    }
}
