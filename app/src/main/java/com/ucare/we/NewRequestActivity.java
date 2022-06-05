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
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class NewRequestActivity extends czy {
    @Inject
    protected dhp a;
    @Inject
    dio b;
    View.OnClickListener c = new View.OnClickListener() { // from class: com.ucare.we.-$$Lambda$NewRequestActivity$mQaMO6q9Bmz7DCtwWUPFqA4SWo0
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            NewRequestActivity.lambda$mQaMO6q9Bmz7DCtwWUPFqA4SWo0(NewRequestActivity.this, view);
        }
    };
    @Inject
    djw d;
    @BindView(R.id.imgBackButton)
    ImageView imgBackButton;
    @BindView(R.id.queryTicketButton)
    Button queryTicketButton;
    @BindView(R.id.queryTicketLinearLayout)
    LinearLayout queryTicketLinearLayout;
    @BindView(R.id.newRequestLinearLayout)
    LinearLayout serviceRequest;
    @BindView(R.id.serviceTicketButton)
    Button serviceTicketButton;
    @BindView(R.id.troubleTicketButton)
    Button troubleTicketButton;
    @BindView(R.id.troubleTicketLinearLayout)
    LinearLayout troubleTicketLinearLayout;
    @BindView(R.id.txtTitle)
    TextView txtTitle;
    @BindView(R.id.usage_title_tv)
    TextView usageTitleTv;

    /* renamed from: lambda$-M5aGhBfwG2ByowiRH--P3R2VFo */
    public static /* synthetic */ void m3lambda$M5aGhBfwG2ByowiRHP3R2VFo(NewRequestActivity newRequestActivity, View view) {
        newRequestActivity.b(view);
    }

    public static /* synthetic */ void lambda$HMEbuFuFpEkobgpYyGmXFqeSfng(NewRequestActivity newRequestActivity, View view) {
        newRequestActivity.c(view);
    }

    public static /* synthetic */ void lambda$LE5MUgnPm_9f2C1Meok0xPP6JdY(NewRequestActivity newRequestActivity, View view) {
        newRequestActivity.f(view);
    }

    public static /* synthetic */ void lambda$WTUXl2DdV5iP_e3O0VG24z3Wb40(NewRequestActivity newRequestActivity, View view) {
        newRequestActivity.e(view);
    }

    public static /* synthetic */ void lambda$f9etSJN00y5DQFxfpwK8YnI4xFI(NewRequestActivity newRequestActivity, View view) {
        newRequestActivity.d(view);
    }

    public static /* synthetic */ void lambda$lA00PlN5Ec6p_TiysU78RFW8b8k(NewRequestActivity newRequestActivity, View view) {
        newRequestActivity.a(view);
    }

    public static /* synthetic */ void lambda$mQaMO6q9Bmz7DCtwWUPFqA4SWo0(NewRequestActivity newRequestActivity, View view) {
        newRequestActivity.g(view);
    }

    public /* synthetic */ void g(View view) {
        finish();
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.send_request_activity);
        ButterKnife.bind(this);
        a(getString(R.string.new_request), false, false);
        this.imgBackButton.setOnClickListener(this.c);
        dhp dhpVar = this.a;
        if ((dhpVar.g == null || dhpVar.g.getQueryTicketSideMenuItem() == null || !dhpVar.g.getQueryTicketSideMenuItem().contains(dhpVar.c.w())) ? false : true) {
            this.queryTicketButton.setVisibility(0);
        } else {
            this.queryTicketButton.setVisibility(8);
        }
        if (this.b.h()) {
            this.serviceTicketButton.setVisibility(8);
        }
        this.txtTitle.setText(R.string.new_request);
        this.serviceTicketButton.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.-$$Lambda$NewRequestActivity$LE5MUgnPm_9f2C1Meok0xPP6JdY
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewRequestActivity.lambda$LE5MUgnPm_9f2C1Meok0xPP6JdY(NewRequestActivity.this, view);
            }
        });
        this.troubleTicketButton.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.-$$Lambda$NewRequestActivity$WTUXl2DdV5iP_e3O0VG24z3Wb40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewRequestActivity.lambda$WTUXl2DdV5iP_e3O0VG24z3Wb40(NewRequestActivity.this, view);
            }
        });
        this.serviceRequest.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.-$$Lambda$NewRequestActivity$f9etSJN00y5DQFxfpwK8YnI4xFI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewRequestActivity.lambda$f9etSJN00y5DQFxfpwK8YnI4xFI(NewRequestActivity.this, view);
            }
        });
        this.troubleTicketLinearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.-$$Lambda$NewRequestActivity$HMEbuFuFpEkobgpYyGmXFqeSfng
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewRequestActivity.lambda$HMEbuFuFpEkobgpYyGmXFqeSfng(NewRequestActivity.this, view);
            }
        });
        this.queryTicketButton.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.-$$Lambda$NewRequestActivity$-M5aGhBfwG2ByowiRH--P3R2VFo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewRequestActivity.m3lambda$M5aGhBfwG2ByowiRHP3R2VFo(NewRequestActivity.this, view);
            }
        });
        this.queryTicketLinearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.-$$Lambda$NewRequestActivity$lA00PlN5Ec6p_TiysU78RFW8b8k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewRequestActivity.lambda$lA00PlN5Ec6p_TiysU78RFW8b8k(NewRequestActivity.this, view);
            }
        });
    }

    public /* synthetic */ void f(View view) {
        this.serviceRequest.performClick();
    }

    public /* synthetic */ void e(View view) {
        this.troubleTicketLinearLayout.performClick();
    }

    public /* synthetic */ void d(View view) {
        Intent intent = new Intent(this, TroubleOrServicesRequestTicketActivity.class);
        intent.putExtra("TROUBLE_TICKET_ACTIVITY_KEY", "SERVICE_TICKET");
        startActivity(intent);
    }

    public /* synthetic */ void c(View view) {
        Intent intent = new Intent(this, TroubleOrServicesRequestTicketActivity.class);
        intent.putExtra("TROUBLE_TICKET_ACTIVITY_KEY", "TROUBLE_TICKET");
        startActivity(intent);
    }

    public /* synthetic */ void b(View view) {
        this.queryTicketLinearLayout.performClick();
    }

    public /* synthetic */ void a(View view) {
        startActivity(new Intent(this, QueryTicketActivity.class));
    }
}
