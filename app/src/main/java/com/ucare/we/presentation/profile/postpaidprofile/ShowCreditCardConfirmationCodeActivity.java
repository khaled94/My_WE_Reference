package com.ucare.we.presentation.profile.postpaidprofile;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.AutoPaymentModel.AutoPaymentAddCreditCardFinalizeResponse;
import com.ucare.we.model.AutoPaymentModel.AutoPaymentAddCreditCardInitializeResponse;
import com.ucare.we.model.AutoPaymentModel.AutoPaymentAddCreditCardInitializeResponseBody;
import com.ucare.we.model.BillSummaryModel.ResponseInitiateBillSummary;
import com.ucare.we.paybillpostpaidvoucher.ResponseActivity;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import com.ucare.we.presentation.profile.postpaidprofile.EnableAutoPayTopG.EnableAutoPayTopGActivity;
import com.ucare.we.util.OTPView;
import defpackage.au;
import javax.inject.Inject;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 W2\u00020\u00012\u00020\u0002:\u0001WB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0018H\u0002J\u001c\u0010=\u001a\u00020;2\b\u0010>\u001a\u0004\u0018\u00010\u00182\b\u0010<\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010?\u001a\u00020;H\u0002J\b\u0010@\u001a\u00020;H\u0002J\b\u0010A\u001a\u00020;H\u0002J\b\u0010B\u001a\u00020;H\u0002J\u0016\u0010C\u001a\u00020;2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J\"\u0010D\u001a\u00020;2\u0006\u0010E\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\u00052\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J\u0012\u0010I\u001a\u00020;2\b\u0010J\u001a\u0004\u0018\u00010KH\u0014J\b\u0010L\u001a\u00020;H\u0014J\u0018\u0010M\u001a\u00020;2\u0006\u0010N\u001a\u00020\u00182\u0006\u0010O\u001a\u00020\u0005H\u0016J\b\u0010P\u001a\u00020;H\u0014J\u0012\u0010Q\u001a\u00020\u00182\b\u0010R\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010S\u001a\u00020;H\u0002J\b\u0010T\u001a\u00020;H\u0002J\u0010\u0010U\u001a\u00020;2\u0006\u0010O\u001a\u00020\u0005H\u0016J\u0012\u0010V\u001a\u00020;2\b\u0010$\u001a\u0004\u0018\u00010\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0014\"\u0004\b'\u0010\u0016R\u000e\u0010(\u001a\u00020)X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010*\u001a\u00020+8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u0010\u0016R\u0010\u00103\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000207X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u000207X\u0082.¢\u0006\u0002\n\u0000¨\u0006X"}, d2 = {"Lcom/ucare/we/presentation/profile/postpaidprofile/ShowCreditCardConfirmationCodeActivity;", "Lcom/ucare/we/injection/TransparentActivity;", "Lcom/ucare/we/util/onSessionExpired;", "()V", "SMS", "", "autoPaymentAddCreditCardInitializeResponse", "Lcom/ucare/we/model/AutoPaymentModel/AutoPaymentAddCreditCardInitializeResponse;", "getAutoPaymentAddCreditCardInitializeResponse", "()Lcom/ucare/we/model/AutoPaymentModel/AutoPaymentAddCreditCardInitializeResponse;", "setAutoPaymentAddCreditCardInitializeResponse", "(Lcom/ucare/we/model/AutoPaymentModel/AutoPaymentAddCreditCardInitializeResponse;)V", "autoRechargeAmount", "autoRechargeDay", "btnCancel", "Landroid/widget/Button;", "btnOK", "cancelClickListener", "Landroid/view/View$OnClickListener;", "getCancelClickListener", "()Landroid/view/View$OnClickListener;", "setCancelClickListener", "(Landroid/view/View$OnClickListener;)V", "confirmationCodeType", "", "context", "Landroid/content/Context;", "finalizeCreditCardAutoPaymentErrorListener", "Lcom/android/volley/Response$ErrorListener;", "finalizeCreditCardAutoPaymentSuccessListener", "Lcom/android/volley/Response$Listener;", "Lorg/json/JSONObject;", "getConfirmationCodeErrorListener", "getConfirmationCodeSuccessListener", "initializeCreditCardAutoPaymentErrorListener", "initializeCreditCardAutoPaymentSuccessListener", "maskedNumber", "okClickListener", "getOkClickListener", "setOkClickListener", "otpView", "Lcom/ucare/we/util/OTPView;", "progressHandler", "Lcom/ucare/we/util/ProgressHandler;", "getProgressHandler", "()Lcom/ucare/we/util/ProgressHandler;", "setProgressHandler", "(Lcom/ucare/we/util/ProgressHandler;)V", "resendSMSClickListener", "getResendSMSClickListener", "setResendSMSClickListener", "smsCode", "smsVerificationReceiver", "Landroid/content/BroadcastReceiver;", "txtMessage", "Landroid/widget/TextView;", "txtMessageDetails", "txtResendSMS", "autoFetchCode", "", "confirmationCode", "finalizeCreditCardAutoPayment", "transactionId", "getConfirmationCode", "getExtras", "initViews", "initializeAutoRecharge", "initializeCreditCardAutoPayment", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onLoginResponse", "jsonResponse", "which", "onStart", "parseOneTimeCode", "message", "setListeners", "smsListener", "startLogin", "updateCodeHint", "Companion", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ShowCreditCardConfirmationCodeActivity extends dae implements dju {
    public static final a a = new a((byte) 0);
    public static String c = "INIT_CREDIT_CARD_TRANSACTION_ID";
    public static String d = "INIT_CREDIT_CARD_HASH_ID";
    @Inject
    public djg b;
    private TextView e;
    private TextView f;
    private Button g;
    private Button h;
    private TextView i;
    private OTPView j;
    private String k;
    private String m;
    private String n;
    private int o;
    private int p;
    private Context q;
    private AutoPaymentAddCreditCardInitializeResponse r;
    private final int l = 2;
    private View.OnClickListener s = new View.OnClickListener() { // from class: com.ucare.we.presentation.profile.postpaidprofile.-$$Lambda$ShowCreditCardConfirmationCodeActivity$pN8fYjtt2foSGOCu2xA9tXFje0o
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ShowCreditCardConfirmationCodeActivity.lambda$pN8fYjtt2foSGOCu2xA9tXFje0o(ShowCreditCardConfirmationCodeActivity.this, view);
        }
    };
    private View.OnClickListener t = new View.OnClickListener() { // from class: com.ucare.we.presentation.profile.postpaidprofile.-$$Lambda$ShowCreditCardConfirmationCodeActivity$v_xewI_5SA6l3iQ8bVTlWak-Nws
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ShowCreditCardConfirmationCodeActivity.m67lambda$v_xewI_5SA6l3iQ8bVTlWakNws(ShowCreditCardConfirmationCodeActivity.this, view);
        }
    };
    private View.OnClickListener u = new View.OnClickListener() { // from class: com.ucare.we.presentation.profile.postpaidprofile.-$$Lambda$ShowCreditCardConfirmationCodeActivity$DHffAjjGMDrtrvyrOLNV9iftVdc
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ShowCreditCardConfirmationCodeActivity.lambda$DHffAjjGMDrtrvyrOLNV9iftVdc(ShowCreditCardConfirmationCodeActivity.this, view);
        }
    };
    private final au.b<JSONObject> x = new au.b() { // from class: com.ucare.we.presentation.profile.postpaidprofile.-$$Lambda$ShowCreditCardConfirmationCodeActivity$SYWZhOFhHQjIZORVJ2Zo0Qz77RI
        @Override // defpackage.au.b
        public final void onResponse(Object obj) {
            ShowCreditCardConfirmationCodeActivity.lambda$SYWZhOFhHQjIZORVJ2Zo0Qz77RI(ShowCreditCardConfirmationCodeActivity.this, (JSONObject) obj);
        }
    };
    private final au.a y = new au.a() { // from class: com.ucare.we.presentation.profile.postpaidprofile.-$$Lambda$ShowCreditCardConfirmationCodeActivity$qZ2UWIiq07iTVyUw0i2JeRfbbE4
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            ShowCreditCardConfirmationCodeActivity.lambda$qZ2UWIiq07iTVyUw0i2JeRfbbE4(ShowCreditCardConfirmationCodeActivity.this, volleyError);
        }
    };
    private final au.b<JSONObject> z = new au.b() { // from class: com.ucare.we.presentation.profile.postpaidprofile.-$$Lambda$ShowCreditCardConfirmationCodeActivity$yUT-1eu-3XquER9Bl8MxLOmdgPw
        @Override // defpackage.au.b
        public final void onResponse(Object obj) {
            ShowCreditCardConfirmationCodeActivity.m68lambda$yUT1eu3XquER9Bl8MxLOmdgPw(ShowCreditCardConfirmationCodeActivity.this, (JSONObject) obj);
        }
    };
    private final au.a A = new au.a() { // from class: com.ucare.we.presentation.profile.postpaidprofile.-$$Lambda$ShowCreditCardConfirmationCodeActivity$6iRBaTJKmv-3kL_5nN1dA8z2x-c
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            ShowCreditCardConfirmationCodeActivity.m63lambda$6iRBaTJKmv3kL_5nN1dA8z2xc(ShowCreditCardConfirmationCodeActivity.this, volleyError);
        }
    };
    private final BroadcastReceiver B = new d();
    private final au.b<JSONObject> C = new au.b() { // from class: com.ucare.we.presentation.profile.postpaidprofile.-$$Lambda$ShowCreditCardConfirmationCodeActivity$A993ZtgIUFgno9Z2tDLKtpWp5-I
        @Override // defpackage.au.b
        public final void onResponse(Object obj) {
            ShowCreditCardConfirmationCodeActivity.m64lambda$A993ZtgIUFgno9Z2tDLKtpWp5I(ShowCreditCardConfirmationCodeActivity.this, (JSONObject) obj);
        }
    };
    private final au.a D = new au.a() { // from class: com.ucare.we.presentation.profile.postpaidprofile.-$$Lambda$ShowCreditCardConfirmationCodeActivity$k4k2Ci6mmbg-7-pN26ENSkCbEYM
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            ShowCreditCardConfirmationCodeActivity.m66lambda$k4k2Ci6mmbg7pN26ENSkCbEYM(ShowCreditCardConfirmationCodeActivity.this, volleyError);
        }
    };

    /* renamed from: lambda$6iRBaTJKmv-3kL_5nN1dA8z2x-c */
    public static /* synthetic */ void m63lambda$6iRBaTJKmv3kL_5nN1dA8z2xc(ShowCreditCardConfirmationCodeActivity showCreditCardConfirmationCodeActivity, VolleyError volleyError) {
        b(showCreditCardConfirmationCodeActivity, volleyError);
    }

    /* renamed from: lambda$A993ZtgIUFgno9Z2tDLKtpWp5-I */
    public static /* synthetic */ void m64lambda$A993ZtgIUFgno9Z2tDLKtpWp5I(ShowCreditCardConfirmationCodeActivity showCreditCardConfirmationCodeActivity, JSONObject jSONObject) {
        c(showCreditCardConfirmationCodeActivity, jSONObject);
    }

    public static /* synthetic */ void lambda$DHffAjjGMDrtrvyrOLNV9iftVdc(ShowCreditCardConfirmationCodeActivity showCreditCardConfirmationCodeActivity, View view) {
        c(showCreditCardConfirmationCodeActivity, view);
    }

    public static /* synthetic */ void lambda$SYWZhOFhHQjIZORVJ2Zo0Qz77RI(ShowCreditCardConfirmationCodeActivity showCreditCardConfirmationCodeActivity, JSONObject jSONObject) {
        a(showCreditCardConfirmationCodeActivity, jSONObject);
    }

    /* renamed from: lambda$k4k2Ci6mmbg-7-pN26ENSkCbEYM */
    public static /* synthetic */ void m66lambda$k4k2Ci6mmbg7pN26ENSkCbEYM(ShowCreditCardConfirmationCodeActivity showCreditCardConfirmationCodeActivity, VolleyError volleyError) {
        c(showCreditCardConfirmationCodeActivity, volleyError);
    }

    public static /* synthetic */ void lambda$mtwu1mHYSQKUXGQl82b_fz1QifE(ShowCreditCardConfirmationCodeActivity showCreditCardConfirmationCodeActivity) {
        b(showCreditCardConfirmationCodeActivity);
    }

    public static /* synthetic */ void lambda$pN8fYjtt2foSGOCu2xA9tXFje0o(ShowCreditCardConfirmationCodeActivity showCreditCardConfirmationCodeActivity, View view) {
        a(showCreditCardConfirmationCodeActivity, view);
    }

    public static /* synthetic */ void lambda$qZ2UWIiq07iTVyUw0i2JeRfbbE4(ShowCreditCardConfirmationCodeActivity showCreditCardConfirmationCodeActivity, VolleyError volleyError) {
        a(showCreditCardConfirmationCodeActivity, volleyError);
    }

    /* renamed from: lambda$v_xewI_5SA6l3iQ8bVTlWak-Nws */
    public static /* synthetic */ void m67lambda$v_xewI_5SA6l3iQ8bVTlWakNws(ShowCreditCardConfirmationCodeActivity showCreditCardConfirmationCodeActivity, View view) {
        b(showCreditCardConfirmationCodeActivity, view);
    }

    /* renamed from: lambda$yUT-1eu-3XquER9Bl8MxLOmdgPw */
    public static /* synthetic */ void m68lambda$yUT1eu3XquER9Bl8MxLOmdgPw(ShowCreditCardConfirmationCodeActivity showCreditCardConfirmationCodeActivity, JSONObject jSONObject) {
        b(showCreditCardConfirmationCodeActivity, jSONObject);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        dqc.d(str, "jsonResponse");
    }

    private djg a() {
        djg djgVar = this.b;
        if (djgVar != null) {
            return djgVar;
        }
        dqc.a("progressHandler");
        throw null;
    }

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_show_credit_card_confirmation_code);
        this.q = this;
        View findViewById = findViewById(R.id.txtMessage);
        dqc.b(findViewById, "findViewById(R.id.txtMessage)");
        this.e = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.txtMessageDetails);
        dqc.b(findViewById2, "findViewById(R.id.txtMessageDetails)");
        this.f = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.btn_ok);
        dqc.b(findViewById3, "findViewById(R.id.btn_ok)");
        this.g = (Button) findViewById3;
        View findViewById4 = findViewById(R.id.btn_cancel);
        dqc.b(findViewById4, "findViewById(R.id.btn_cancel)");
        this.h = (Button) findViewById4;
        View findViewById5 = findViewById(R.id.otp_view);
        dqc.b(findViewById5, "findViewById(R.id.otp_view)");
        this.j = (OTPView) findViewById5;
        Button button = this.g;
        if (button == null) {
            dqc.a("btnOK");
            throw null;
        }
        button.setEnabled(false);
        Button button2 = this.g;
        if (button2 == null) {
            dqc.a("btnOK");
            throw null;
        }
        button2.setAlpha(0.15f);
        View findViewById6 = findViewById(R.id.txtResendSMS);
        dqc.b(findViewById6, "findViewById(R.id.txtResendSMS)");
        this.i = (TextView) findViewById6;
        TextView textView = this.e;
        if (textView == null) {
            dqc.a("txtMessage");
            throw null;
        }
        textView.setText(getString(R.string.confirmation_title));
        TextView textView2 = this.f;
        if (textView2 == null) {
            dqc.a("txtMessageDetails");
            throw null;
        }
        textView2.setText(getString(R.string.confirmation_credit_card_code));
        Button button3 = this.g;
        if (button3 == null) {
            dqc.a("btnOK");
            throw null;
        }
        button3.setOnClickListener(this.s);
        Button button4 = this.h;
        if (button4 == null) {
            dqc.a("btnCancel");
            throw null;
        }
        button4.setOnClickListener(this.t);
        TextView textView3 = this.i;
        if (textView3 == null) {
            dqc.a("txtResendSMS");
            throw null;
        }
        textView3.setOnClickListener(this.u);
        OTPView oTPView = this.j;
        if (oTPView == null) {
            dqc.a("otpView");
            throw null;
        }
        oTPView.setOnCharacterUpdatedListener(new b());
        OTPView oTPView2 = this.j;
        if (oTPView2 == null) {
            dqc.a("otpView");
            throw null;
        }
        oTPView2.setOnFinishListener(new c());
        Intent intent = getIntent();
        this.n = intent.getStringExtra("CONFIRMATION_CODE_TYPE");
        this.o = intent.getIntExtra(EnableAutoPayTopGActivity.b, 0);
        this.p = intent.getIntExtra(EnableAutoPayTopGActivity.a, 0);
        if (!TextUtils.isEmpty(this.n) && dsg.b(this.n, "1")) {
            b();
        } else {
            c();
        }
    }

    private final void b() {
        a(this.o, this.p);
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "isUpdated", ""}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    static final class b extends dqd implements dow<Boolean, dmg> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(1);
            ShowCreditCardConfirmationCodeActivity.this = r1;
        }

        @Override // defpackage.dow
        public final /* synthetic */ dmg invoke(Boolean bool) {
            Boolean bool2 = bool;
            dqc.a(bool2);
            if (!bool2.booleanValue()) {
                Button button = ShowCreditCardConfirmationCodeActivity.this.g;
                if (button != null) {
                    button.setEnabled(false);
                    Button button2 = ShowCreditCardConfirmationCodeActivity.this.g;
                    if (button2 == null) {
                        dqc.a("btnOK");
                        throw null;
                    }
                    button2.setAlpha(0.15f);
                } else {
                    dqc.a("btnOK");
                    throw null;
                }
            } else {
                Button button3 = ShowCreditCardConfirmationCodeActivity.this.g;
                if (button3 != null) {
                    button3.setEnabled(true);
                    Button button4 = ShowCreditCardConfirmationCodeActivity.this.g;
                    if (button4 == null) {
                        dqc.a("btnOK");
                        throw null;
                    }
                    button4.setAlpha(1.0f);
                } else {
                    dqc.a("btnOK");
                    throw null;
                }
            }
            return dmg.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "s", ""}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    static final class c extends dqd implements dow<String, dmg> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(1);
            ShowCreditCardConfirmationCodeActivity.this = r1;
        }

        @Override // defpackage.dow
        public final /* synthetic */ dmg invoke(String str) {
            String str2 = str;
            dqc.d(str2, "s");
            String str3 = str2;
            int length = str3.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = dqc.a(str3.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (!z2) {
                    z = true;
                } else {
                    i++;
                }
            }
            if (str3.subSequence(i, length + 1).toString().length() != 6) {
                Button button = ShowCreditCardConfirmationCodeActivity.this.g;
                if (button != null) {
                    button.setEnabled(false);
                    Button button2 = ShowCreditCardConfirmationCodeActivity.this.g;
                    if (button2 == null) {
                        dqc.a("btnOK");
                        throw null;
                    }
                    button2.setAlpha(0.15f);
                } else {
                    dqc.a("btnOK");
                    throw null;
                }
            } else {
                Button button3 = ShowCreditCardConfirmationCodeActivity.this.g;
                if (button3 != null) {
                    button3.setEnabled(true);
                    Button button4 = ShowCreditCardConfirmationCodeActivity.this.g;
                    if (button4 == null) {
                        dqc.a("btnOK");
                        throw null;
                    }
                    button4.setAlpha(1.0f);
                } else {
                    dqc.a("btnOK");
                    throw null;
                }
            }
            return dmg.a;
        }
    }

    public static final void a(ShowCreditCardConfirmationCodeActivity showCreditCardConfirmationCodeActivity, View view) {
        AutoPaymentAddCreditCardInitializeResponseBody body;
        dqc.d(showCreditCardConfirmationCodeActivity, "this$0");
        OTPView oTPView = showCreditCardConfirmationCodeActivity.j;
        String str = null;
        if (oTPView == null) {
            dqc.a("otpView");
            throw null;
        }
        String stringFromFields = oTPView.getStringFromFields();
        int length = stringFromFields.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = dqc.a(stringFromFields.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (!z2) {
                z = true;
            } else {
                i++;
            }
        }
        showCreditCardConfirmationCodeActivity.k = stringFromFields.subSequence(i, length + 1).toString();
        AutoPaymentAddCreditCardInitializeResponse autoPaymentAddCreditCardInitializeResponse = showCreditCardConfirmationCodeActivity.r;
        if (autoPaymentAddCreditCardInitializeResponse != null) {
            if (autoPaymentAddCreditCardInitializeResponse != null && (body = autoPaymentAddCreditCardInitializeResponse.getBody()) != null) {
                str = body.getTopgManageCCTransactionId();
            }
            String str2 = str;
            String str3 = showCreditCardConfirmationCodeActivity.k;
            try {
                showCreditCardConfirmationCodeActivity.a().a(showCreditCardConfirmationCodeActivity, showCreditCardConfirmationCodeActivity.getString(R.string.loading));
                djl.a(showCreditCardConfirmationCodeActivity.q).a(true, str2, str3, showCreditCardConfirmationCodeActivity.C, showCreditCardConfirmationCodeActivity.D);
                return;
            } catch (JSONException e) {
                e.printStackTrace();
                return;
            }
        }
        OTPView oTPView2 = showCreditCardConfirmationCodeActivity.j;
        if (oTPView2 == null) {
            dqc.a("otpView");
            throw null;
        }
        String stringFromFields2 = oTPView2.getStringFromFields();
        int length2 = stringFromFields2.length() - 1;
        int i2 = 0;
        boolean z3 = false;
        while (i2 <= length2) {
            boolean z4 = dqc.a(stringFromFields2.charAt(!z3 ? i2 : length2), 32) <= 0;
            if (z3) {
                if (!z4) {
                    break;
                }
                length2--;
            } else if (!z4) {
                z3 = true;
            } else {
                i2++;
            }
        }
        showCreditCardConfirmationCodeActivity.k = stringFromFields2.subSequence(i2, length2 + 1).toString();
        Intent intent = new Intent();
        intent.putExtra("smsCode", showCreditCardConfirmationCodeActivity.k);
        showCreditCardConfirmationCodeActivity.setResult(-1, intent);
        showCreditCardConfirmationCodeActivity.finish();
    }

    public static final void b(ShowCreditCardConfirmationCodeActivity showCreditCardConfirmationCodeActivity, View view) {
        dqc.d(showCreditCardConfirmationCodeActivity, "this$0");
        showCreditCardConfirmationCodeActivity.finish();
    }

    public static final void c(ShowCreditCardConfirmationCodeActivity showCreditCardConfirmationCodeActivity, View view) {
        dqc.d(showCreditCardConfirmationCodeActivity, "this$0");
        if (!TextUtils.isEmpty(showCreditCardConfirmationCodeActivity.n) && dsg.b(showCreditCardConfirmationCodeActivity.n, "1")) {
            showCreditCardConfirmationCodeActivity.b();
        } else {
            showCreditCardConfirmationCodeActivity.c();
        }
    }

    @Override // defpackage.dju
    public final void b(int i) {
        if (i == this.l) {
            c();
        }
    }

    private final void c() {
        try {
            djl.a(this).u(this.x, this.y);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static final void a(ShowCreditCardConfirmationCodeActivity showCreditCardConfirmationCodeActivity, JSONObject jSONObject) {
        dqc.d(showCreditCardConfirmationCodeActivity, "this$0");
        ResponseInitiateBillSummary responseInitiateBillSummary = (ResponseInitiateBillSummary) new Gson().a(jSONObject.toString(), (Class<Object>) ResponseInitiateBillSummary.class);
        if (dqc.a((Object) responseInitiateBillSummary.getHeader().getResponseCode(), (Object) "1200")) {
            showCreditCardConfirmationCodeActivity.b(showCreditCardConfirmationCodeActivity.l);
        } else if (!dqc.a((Object) responseInitiateBillSummary.getHeader().getResponseCode(), (Object) "0")) {
        } else {
            String maskedMsisdn = responseInitiateBillSummary.getBody().getMaskedMsisdn();
            showCreditCardConfirmationCodeActivity.m = maskedMsisdn;
            showCreditCardConfirmationCodeActivity.b(maskedMsisdn);
        }
    }

    public static final void a(ShowCreditCardConfirmationCodeActivity showCreditCardConfirmationCodeActivity, VolleyError volleyError) {
        dqc.d(showCreditCardConfirmationCodeActivity, "this$0");
        ResponseActivity.a(showCreditCardConfirmationCodeActivity, showCreditCardConfirmationCodeActivity.getString(R.string.error), showCreditCardConfirmationCodeActivity.getString(R.string.generic_error), true);
        showCreditCardConfirmationCodeActivity.finish();
    }

    private void a(int i, int i2) {
        try {
            a().a(this, getString(R.string.loading));
            djl.a(this.q).a(i, i2, this.z, this.A);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static final void b(ShowCreditCardConfirmationCodeActivity showCreditCardConfirmationCodeActivity, JSONObject jSONObject) {
        dqc.d(showCreditCardConfirmationCodeActivity, "this$0");
        showCreditCardConfirmationCodeActivity.a().a();
        AutoPaymentAddCreditCardInitializeResponse autoPaymentAddCreditCardInitializeResponse = (AutoPaymentAddCreditCardInitializeResponse) new Gson().a(jSONObject.toString(), (Class<Object>) AutoPaymentAddCreditCardInitializeResponse.class);
        if (autoPaymentAddCreditCardInitializeResponse.getHeader() == null || autoPaymentAddCreditCardInitializeResponse.getHeader().getResponseCode() == null || !dqc.a((Object) autoPaymentAddCreditCardInitializeResponse.getHeader().getResponseCode(), (Object) "0")) {
            UnNavigateResponseActivity.a aVar = UnNavigateResponseActivity.a;
            Context context = showCreditCardConfirmationCodeActivity.q;
            dqc.a(context);
            String responseMessage = autoPaymentAddCreditCardInitializeResponse.getHeader().getResponseMessage();
            Context context2 = showCreditCardConfirmationCodeActivity.q;
            UnNavigateResponseActivity.a.a(context, responseMessage, context2 == null ? null : context2.getString(R.string.please_try_again), true);
            return;
        }
        showCreditCardConfirmationCodeActivity.r = autoPaymentAddCreditCardInitializeResponse;
        String maskedMsisdn = autoPaymentAddCreditCardInitializeResponse.getBody().getMaskedMsisdn();
        showCreditCardConfirmationCodeActivity.m = maskedMsisdn;
        showCreditCardConfirmationCodeActivity.b(maskedMsisdn);
    }

    public static final void b(ShowCreditCardConfirmationCodeActivity showCreditCardConfirmationCodeActivity, VolleyError volleyError) {
        dqc.d(showCreditCardConfirmationCodeActivity, "this$0");
        showCreditCardConfirmationCodeActivity.a().a();
        UnNavigateResponseActivity.a aVar = UnNavigateResponseActivity.a;
        Context context = showCreditCardConfirmationCodeActivity.q;
        dqc.a(context);
        Context context2 = showCreditCardConfirmationCodeActivity.q;
        String str = null;
        String string = context2 == null ? null : context2.getString(R.string.check_network_connection);
        Context context3 = showCreditCardConfirmationCodeActivity.q;
        if (context3 != null) {
            str = context3.getString(R.string.please_try_again);
        }
        UnNavigateResponseActivity.a.a(context, string, str, true);
    }

    private final void b(String str) {
        if (str != null) {
            if (dsg.b(n().k(), "ar")) {
                TextView textView = this.f;
                if (textView == null) {
                    dqc.a("txtMessageDetails");
                    throw null;
                }
                textView.setText(getString(R.string.credit_card_code_hint_p1) + ((Object) djm.d(str)) + getString(R.string.credit_card_code_hint_p2));
                return;
            }
            TextView textView2 = this.f;
            if (textView2 == null) {
                dqc.a("txtMessageDetails");
                throw null;
            }
            textView2.setText(getString(R.string.credit_card_code_hint_p1) + ((Object) str) + getString(R.string.credit_card_code_hint_p2));
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ucare/we/presentation/profile/postpaidprofile/ShowCreditCardConfirmationCodeActivity$smsVerificationReceiver$1", "Landroid/content/BroadcastReceiver;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d extends BroadcastReceiver {
        d() {
            ShowCreditCardConfirmationCodeActivity.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            dqc.d(context, "context");
            dqc.d(intent, "intent");
            if (dqc.a((Object) "com.google.android.gms.auth.api.phone.SMS_RETRIEVED", (Object) intent.getAction())) {
                Bundle extras = intent.getExtras();
                Intent intent2 = null;
                Status status = (Status) (extras == null ? null : extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS"));
                Integer valueOf = status == null ? null : Integer.valueOf(status.i);
                if (valueOf == null || valueOf.intValue() != 0) {
                    if (valueOf == null) {
                        return;
                    }
                    valueOf.intValue();
                    return;
                }
                if (ShowCreditCardConfirmationCodeActivity.this.getCallingActivity() != null) {
                    ComponentName callingActivity = ShowCreditCardConfirmationCodeActivity.this.getCallingActivity();
                    if (!dqc.a((Object) (callingActivity == null ? null : callingActivity.getPackageName()), (Object) "com.ucare.we")) {
                        return;
                    }
                }
                if (extras != null) {
                    intent2 = (Intent) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT");
                }
                try {
                    ShowCreditCardConfirmationCodeActivity.this.startActivityForResult(intent2, 499);
                } catch (ActivityNotFoundException unused) {
                }
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 499 && i2 == -1) {
            String stringExtra = intent == null ? null : intent.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
            String str = "";
            if (stringExtra != null) {
                String a2 = new dsf("[^0-9]").a(stringExtra, str);
                if (a2 != null) {
                    str = a2;
                }
            }
            OTPView oTPView = this.j;
            if (oTPView == null) {
                dqc.a("otpView");
                throw null;
            }
            oTPView.setText(str);
            Button button = this.g;
            if (button == null) {
                dqc.a("btnOK");
                throw null;
            }
            button.setEnabled(true);
            Button button2 = this.g;
            if (button2 == null) {
                dqc.a("btnOK");
                throw null;
            }
            button2.setAlpha(1.0f);
            Button button3 = this.g;
            if (button3 != null) {
                button3.post(new Runnable() { // from class: com.ucare.we.presentation.profile.postpaidprofile.-$$Lambda$ShowCreditCardConfirmationCodeActivity$mtwu1mHYSQKUXGQl82b_fz1QifE
                    @Override // java.lang.Runnable
                    public final void run() {
                        ShowCreditCardConfirmationCodeActivity.lambda$mtwu1mHYSQKUXGQl82b_fz1QifE(ShowCreditCardConfirmationCodeActivity.this);
                    }
                });
            } else {
                dqc.a("btnOK");
                throw null;
            }
        }
    }

    public static final void a(bwl bwlVar) {
        Exception a2;
        dqc.d(bwlVar, "listener");
        if (bwlVar.e() || (a2 = bwlVar.a()) == null) {
            return;
        }
        a2.printStackTrace();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        registerReceiver(this.B, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"));
        bwl<Void> a2 = tf.a((Activity) this).a();
        dqc.b(a2, "getClient(this).startSmsUserConsent(null)");
        a2.a($$Lambda$ShowCreditCardConfirmationCodeActivity$VFW0OaWxqAPcJdaVGi6X5LgXtk.INSTANCE);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.B);
    }

    public static final void b(ShowCreditCardConfirmationCodeActivity showCreditCardConfirmationCodeActivity) {
        dqc.d(showCreditCardConfirmationCodeActivity, "this$0");
        Button button = showCreditCardConfirmationCodeActivity.g;
        if (button != null) {
            button.performClick();
        } else {
            dqc.a("btnOK");
            throw null;
        }
    }

    public static final void c(ShowCreditCardConfirmationCodeActivity showCreditCardConfirmationCodeActivity, JSONObject jSONObject) {
        AutoPaymentAddCreditCardInitializeResponseBody body;
        AutoPaymentAddCreditCardInitializeResponseBody body2;
        dqc.d(showCreditCardConfirmationCodeActivity, "this$0");
        showCreditCardConfirmationCodeActivity.a().a();
        AutoPaymentAddCreditCardFinalizeResponse autoPaymentAddCreditCardFinalizeResponse = (AutoPaymentAddCreditCardFinalizeResponse) new Gson().a(jSONObject.toString(), (Class<Object>) AutoPaymentAddCreditCardFinalizeResponse.class);
        String str = null;
        if (autoPaymentAddCreditCardFinalizeResponse.getHeader() == null || autoPaymentAddCreditCardFinalizeResponse.getHeader().getResponseCode() == null || !dqc.a((Object) autoPaymentAddCreditCardFinalizeResponse.getHeader().getResponseCode(), (Object) "0")) {
            UnNavigateResponseActivity.a aVar = UnNavigateResponseActivity.a;
            Context context = showCreditCardConfirmationCodeActivity.q;
            dqc.a(context);
            String responseMessage = autoPaymentAddCreditCardFinalizeResponse.getHeader().getResponseMessage();
            Context context2 = showCreditCardConfirmationCodeActivity.q;
            if (context2 != null) {
                str = context2.getString(R.string.please_try_again);
            }
            UnNavigateResponseActivity.a.a(context, responseMessage, str, true);
            return;
        }
        OTPView oTPView = showCreditCardConfirmationCodeActivity.j;
        if (oTPView == null) {
            dqc.a("otpView");
            throw null;
        }
        String stringFromFields = oTPView.getStringFromFields();
        int length = stringFromFields.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = dqc.a(stringFromFields.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (!z2) {
                z = true;
            } else {
                i++;
            }
        }
        showCreditCardConfirmationCodeActivity.k = stringFromFields.subSequence(i, length + 1).toString();
        Intent intent = new Intent();
        intent.putExtra("smsCode", showCreditCardConfirmationCodeActivity.k);
        AutoPaymentAddCreditCardInitializeResponse autoPaymentAddCreditCardInitializeResponse = showCreditCardConfirmationCodeActivity.r;
        if (autoPaymentAddCreditCardInitializeResponse != null) {
            intent.putExtra(c, (autoPaymentAddCreditCardInitializeResponse == null || (body2 = autoPaymentAddCreditCardInitializeResponse.getBody()) == null) ? null : body2.getTopgManageCCTransactionId());
            String str2 = d;
            AutoPaymentAddCreditCardInitializeResponse autoPaymentAddCreditCardInitializeResponse2 = showCreditCardConfirmationCodeActivity.r;
            if (autoPaymentAddCreditCardInitializeResponse2 != null && (body = autoPaymentAddCreditCardInitializeResponse2.getBody()) != null) {
                str = body.getHashcode();
            }
            intent.putExtra(str2, str);
        }
        showCreditCardConfirmationCodeActivity.setResult(-1, intent);
        showCreditCardConfirmationCodeActivity.finish();
    }

    public static final void c(ShowCreditCardConfirmationCodeActivity showCreditCardConfirmationCodeActivity, VolleyError volleyError) {
        dqc.d(showCreditCardConfirmationCodeActivity, "this$0");
        showCreditCardConfirmationCodeActivity.a().a();
        UnNavigateResponseActivity.a aVar = UnNavigateResponseActivity.a;
        Context context = showCreditCardConfirmationCodeActivity.q;
        dqc.a(context);
        Context context2 = showCreditCardConfirmationCodeActivity.q;
        String str = null;
        String string = context2 == null ? null : context2.getString(R.string.check_network_connection);
        Context context3 = showCreditCardConfirmationCodeActivity.q;
        if (context3 != null) {
            str = context3.getString(R.string.please_try_again);
        }
        UnNavigateResponseActivity.a.a(context, string, str, true);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ucare/we/presentation/profile/postpaidprofile/ShowCreditCardConfirmationCodeActivity$Companion;", "", "()V", "INIT_CREDIT_CARD_HASH_ID", "", "INIT_CREDIT_CARD_TRANSACTION_ID", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(byte b) {
            this();
        }

        private a() {
        }
    }
}
