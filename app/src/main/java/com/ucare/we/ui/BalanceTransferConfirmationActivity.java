package com.ucare.we.ui;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import com.ucare.we.BalanceTransferSuccessfullyActivity;
import com.ucare.we.ErrorHandlerActivity;
import com.ucare.we.R;
import com.ucare.we.model.AssociatedNumberResponseBody;
import com.ucare.we.model.MainPlanResponseBody;
import com.ucare.we.model.extras.ExtrasList;
import com.ucare.we.model.special.SpecialList;
import com.ucare.we.model.usagedetails.SummarizedLineUsageItem;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import com.ucare.we.util.OTPView;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class BalanceTransferConfirmationActivity extends czy implements View.OnClickListener, dht {
    ImageView a;
    OTPView b;
    TextView c;
    Button d;
    TextView e;
    TextView f;
    TextView g;
    String h;
    String i;
    String j;
    @Inject
    dhu k;
    @Inject
    djw l;
    Button m;
    @Inject
    djx n;
    @Inject
    dja o;
    @Inject
    djg p;
    @Inject
    djx q;
    private final BroadcastReceiver r = new BroadcastReceiver() { // from class: com.ucare.we.ui.BalanceTransferConfirmationActivity.1
        {
            BalanceTransferConfirmationActivity.this = this;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
                Bundle extras = intent.getExtras();
                if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).i != 0) {
                    return;
                }
                try {
                    BalanceTransferConfirmationActivity.this.startActivityForResult((Intent) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT"), 499);
                } catch (ActivityNotFoundException unused) {
                }
            }
        }
    };

    public static /* synthetic */ dmg lambda$hEs6OHj4t6DgTtxJUSPCxxG9eY0(BalanceTransferConfirmationActivity balanceTransferConfirmationActivity, Boolean bool) {
        return balanceTransferConfirmationActivity.a(bool);
    }

    /* renamed from: lambda$wVe-zs4XYzJ9Fk4sm0T973ZVLKQ */
    public static /* synthetic */ dmg m73lambda$wVezs4XYzJ9Fk4sm0T973ZVLKQ(BalanceTransferConfirmationActivity balanceTransferConfirmationActivity, String str) {
        return balanceTransferConfirmationActivity.g(str);
    }

    @Override // defpackage.dht
    public final void a(float f) {
    }

    @Override // defpackage.dht
    public final void a(cyq cyqVar) {
    }

    @Override // defpackage.dht
    public final void a(String str) {
    }

    @Override // defpackage.dht
    public final void a(String str, String str2) {
    }

    @Override // defpackage.dht
    public final void a(ArrayList<ExtrasList> arrayList) {
    }

    @Override // defpackage.dht
    public final void a(List<SummarizedLineUsageItem> list) {
    }

    @Override // defpackage.dht
    public final void a_(int i) {
    }

    @Override // defpackage.dht
    public final void a_(String str) {
    }

    @Override // defpackage.dht
    public final void b(ArrayList<SpecialList> arrayList) {
    }

    @Override // defpackage.dht
    public final void b(List<MainPlanResponseBody> list) {
    }

    @Override // defpackage.dht
    public final void c(String str) {
    }

    @Override // defpackage.dht
    public final void c(List<AssociatedNumberResponseBody> list) {
    }

    @Override // defpackage.dht
    public final void e() {
    }

    @Override // defpackage.dht
    public final void e(String str) {
    }

    @Override // defpackage.dht
    public final void f() {
    }

    @Override // defpackage.dht
    public final void g() {
    }

    @Override // defpackage.dht
    public final void h() {
    }

    @Override // defpackage.dht
    public final void i() {
    }

    @Override // defpackage.dht
    public final void j() {
    }

    @Override // defpackage.dht
    public final void p_() {
    }

    @Override // defpackage.dht
    public final void q_() {
    }

    @Override // defpackage.dht
    public final void r_() {
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_balance_transfer_confirmation);
        a(getString(R.string.balance_transfer), false, false);
        this.a = (ImageView) findViewById(R.id.imgBackButton);
        this.b = (OTPView) findViewById(R.id.otp_view);
        this.g = (TextView) findViewById(R.id.tvBalanceTransferHint);
        this.c = (TextView) findViewById(R.id.tv_resend_code);
        Button button = (Button) findViewById(R.id.btn_transfer);
        this.d = button;
        button.setEnabled(false);
        this.d.setAlpha(0.15f);
        this.f = (TextView) findViewById(R.id.tv_transfer_amount);
        this.e = (TextView) findViewById(R.id.tv_transfer_to);
        this.m = (Button) findViewById(R.id.btn_current_number);
        this.a.setOnClickListener(this);
        this.c.setOnClickListener(this);
        this.d.setOnClickListener(this);
        this.b.setOnCharacterUpdatedListener(new dow() { // from class: com.ucare.we.ui.-$$Lambda$BalanceTransferConfirmationActivity$hEs6OHj4t6DgTtxJUSPCxxG9eY0
            @Override // defpackage.dow
            public final Object invoke(Object obj) {
                return BalanceTransferConfirmationActivity.lambda$hEs6OHj4t6DgTtxJUSPCxxG9eY0(BalanceTransferConfirmationActivity.this, (Boolean) obj);
            }
        });
        this.b.setOnFinishListener(new dow() { // from class: com.ucare.we.ui.-$$Lambda$BalanceTransferConfirmationActivity$wVe-zs4XYzJ9Fk4sm0T973ZVLKQ
            @Override // defpackage.dow
            public final Object invoke(Object obj) {
                return BalanceTransferConfirmationActivity.m73lambda$wVezs4XYzJ9Fk4sm0T973ZVLKQ(BalanceTransferConfirmationActivity.this, (String) obj);
            }
        });
        this.h = getIntent().getStringExtra("amount");
        TextView textView = this.f;
        textView.setText(this.h + " " + getString(R.string.egp));
        String stringExtra = getIntent().getStringExtra("targetNumber");
        this.i = stringExtra;
        this.e.setText(stringExtra);
        this.m.setText(this.l.m());
        this.k.a(this);
        String stringExtra2 = getIntent().getStringExtra("maskedNumber");
        this.j = stringExtra2;
        if (stringExtra2 != null) {
            if (this.l.k().equalsIgnoreCase("ar")) {
                TextView textView2 = this.g;
                textView2.setText(getString(R.string.balance_transfer_confirmation_code_p1) + djm.d(this.j) + getString(R.string.balance_transfer_confirmation_code_p2));
                return;
            }
            TextView textView3 = this.g;
            textView3.setText(getString(R.string.balance_transfer_confirmation_code_p1) + this.j + getString(R.string.balance_transfer_confirmation_code_p2));
        }
    }

    public /* synthetic */ dmg a(Boolean bool) {
        if (!bool.booleanValue()) {
            this.d.setEnabled(false);
            this.d.setAlpha(0.15f);
            return null;
        }
        this.d.setEnabled(true);
        this.d.setAlpha(1.0f);
        return null;
    }

    public /* synthetic */ dmg g(String str) {
        if (str.trim().length() != 6) {
            this.d.setEnabled(false);
            this.d.setAlpha(0.15f);
            return null;
        }
        this.d.setEnabled(true);
        this.d.setAlpha(1.0f);
        return null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.imgBackButton) {
            finish();
        } else if (id == R.id.btn_transfer) {
            if (TextUtils.isEmpty(this.b.getStringFromFields())) {
                return;
            }
            this.k.a(Float.parseFloat(this.h), this.i, this.b.getStringFromFields());
            this.p.a(this, getString(R.string.loading));
        } else if (id != R.id.tv_resend_code) {
        } else {
            this.k.a(Float.parseFloat(this.h), this.i);
            k();
            this.p.a(this, getString(R.string.loading));
        }
    }

    @Override // defpackage.dht
    public final void b(String str) {
        this.p.a();
    }

    @Override // defpackage.dht
    public final void a(int i, String str) {
        this.p.a();
        finish();
        UnNavigateResponseActivity.a(this, str, getString(R.string.please_try_again), true);
    }

    @Override // defpackage.dht
    public final void s_() {
        this.n.b(this, BalanceTransferSuccessfullyActivity.class);
        this.p.a();
    }

    @Override // defpackage.dht
    public final void b(int i, String str) {
        this.p.a();
        this.q.a(this, str, i, ErrorHandlerActivity.class);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 499 && i2 == -1) {
            this.b.setText(intent.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE").replaceAll("[^0-9]", ""));
            this.d.setEnabled(true);
            this.d.post(new Runnable() { // from class: com.ucare.we.ui.BalanceTransferConfirmationActivity.2
                {
                    BalanceTransferConfirmationActivity.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BalanceTransferConfirmationActivity.this.d.performClick();
                }
            });
        }
    }

    private void k() {
        tf.a((Activity) this).a().a($$Lambda$BalanceTransferConfirmationActivity$d5XMIhkdB9lFQ8ZGXMXaSUXcM.INSTANCE);
    }

    public static /* synthetic */ void a(bwl bwlVar) {
        if (!bwlVar.e()) {
            bwlVar.a().printStackTrace();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        registerReceiver(this.r, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"));
        k();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.k.b(this);
        unregisterReceiver(this.r);
    }
}
