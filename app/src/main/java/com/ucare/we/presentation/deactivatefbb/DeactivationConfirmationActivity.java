package com.ucare.we.presentation.deactivatefbb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.ServerResponse;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0001>B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010+\u001a\u00020,H\u0002J\u0012\u0010-\u001a\u00020,2\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\u0018\u00100\u001a\u00020,2\u0006\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u001eH\u0016J\u0016\u00103\u001a\u00020,2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u001e05H\u0016J\b\u00106\u001a\u00020,H\u0002J\b\u00107\u001a\u00020,H\u0002J \u00108\u001a\u00020,2\u0006\u00102\u001a\u00020\u001e2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u001eH\u0002J\u000e\u0010<\u001a\u00020,2\u0006\u0010=\u001a\u00020:R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020(X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020(X\u0082.¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/ucare/we/presentation/deactivatefbb/DeactivationConfirmationActivity;", "Lcom/ucare/we/injection/TransparentActivity;", "Lcom/ucare/we/presentation/deactivatefbb/DeactivateListener;", "()V", "RENEW", "", "btnCancel", "Landroid/widget/Button;", "btnOK", "cancelCLickListener", "Landroid/view/View$OnClickListener;", "getCancelCLickListener", "()Landroid/view/View$OnClickListener;", "setCancelCLickListener", "(Landroid/view/View$OnClickListener;)V", "chkTerms", "Landroid/widget/CheckBox;", "configurationProvider", "Lcom/ucare/we/provider/ConfigurationProvider;", "getConfigurationProvider", "()Lcom/ucare/we/provider/ConfigurationProvider;", "setConfigurationProvider", "(Lcom/ucare/we/provider/ConfigurationProvider;)V", "deactivateFBBProvider", "Lcom/ucare/we/presentation/deactivatefbb/DeactivateFBBProvider;", "getDeactivateFBBProvider", "()Lcom/ucare/we/presentation/deactivatefbb/DeactivateFBBProvider;", "setDeactivateFBBProvider", "(Lcom/ucare/we/presentation/deactivatefbb/DeactivateFBBProvider;)V", "offerID", "", "offerName", "progressHandler", "Lcom/ucare/we/util/ProgressHandler;", "getProgressHandler", "()Lcom/ucare/we/util/ProgressHandler;", "setProgressHandler", "(Lcom/ucare/we/util/ProgressHandler;)V", "renewClickListener", "tvTerms", "Landroid/widget/TextView;", "txtMessage", "txtMessageDetails", "initViews", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDeactivateFBBFailure", "failureReason", "failureMessage", "onDeactivateFBBSuccess", "serverResponse", "Lcom/ucare/we/model/ServerResponse;", "setData", "setListeners", "showDeactivationResponse", "isError", "", "messageDetails", "showProgress", "show", "Companion", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class DeactivationConfirmationActivity extends dae implements ddx {
    public static final a a = new a((byte) 0);
    @Inject
    public djg b;
    @Inject
    public ddw c;
    @Inject
    public dhn d;
    private TextView e;
    private TextView f;
    private TextView g;
    private Button h;
    private Button i;
    private CheckBox j;
    private final int k = 1;
    private View.OnClickListener l = new View.OnClickListener() { // from class: com.ucare.we.presentation.deactivatefbb.-$$Lambda$DeactivationConfirmationActivity$4oz8W4XbqDqkTXRQZe1lHS7x37E
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            DeactivationConfirmationActivity.lambda$4oz8W4XbqDqkTXRQZe1lHS7x37E(DeactivationConfirmationActivity.this, view);
        }
    };
    private View.OnClickListener m = new View.OnClickListener() { // from class: com.ucare.we.presentation.deactivatefbb.-$$Lambda$DeactivationConfirmationActivity$Ckad8uWZoaHBlX8xHEGPB277WfE
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            DeactivationConfirmationActivity.lambda$Ckad8uWZoaHBlX8xHEGPB277WfE(DeactivationConfirmationActivity.this, view);
        }
    };

    public static final void a(Context context) {
        a.a(context);
    }

    /* renamed from: lambda$3PcDB-nfCuwKQ1aN_sGzkEQQxGo */
    public static /* synthetic */ void m41lambda$3PcDBnfCuwKQ1aN_sGzkEQQxGo(DeactivationConfirmationActivity deactivationConfirmationActivity, View view) {
        c(deactivationConfirmationActivity, view);
    }

    public static /* synthetic */ void lambda$4oz8W4XbqDqkTXRQZe1lHS7x37E(DeactivationConfirmationActivity deactivationConfirmationActivity, View view) {
        a(deactivationConfirmationActivity, view);
    }

    public static /* synthetic */ void lambda$Ckad8uWZoaHBlX8xHEGPB277WfE(DeactivationConfirmationActivity deactivationConfirmationActivity, View view) {
        b(deactivationConfirmationActivity, view);
    }

    public static /* synthetic */ void lambda$WZrlv7aMsWdCWLm2Ubpm8hEAnd8(DeactivationConfirmationActivity deactivationConfirmationActivity, CompoundButton compoundButton, boolean z) {
        a(deactivationConfirmationActivity, compoundButton, z);
    }

    private ddw a() {
        ddw ddwVar = this.c;
        if (ddwVar != null) {
            return ddwVar;
        }
        dqc.a("deactivateFBBProvider");
        throw null;
    }

    public static final void a(DeactivationConfirmationActivity deactivationConfirmationActivity, View view) {
        dqc.d(deactivationConfirmationActivity, "this$0");
        deactivationConfirmationActivity.finish();
    }

    public static final void b(DeactivationConfirmationActivity deactivationConfirmationActivity, View view) {
        dqc.d(deactivationConfirmationActivity, "this$0");
        Button button = deactivationConfirmationActivity.h;
        if (button == null) {
            dqc.a("btnOK");
            throw null;
        }
        button.setClickable(false);
        deactivationConfirmationActivity.a().a();
        deactivationConfirmationActivity.finish();
    }

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_deactivation_confirmation);
        View findViewById = findViewById(R.id.btn_ok);
        dqc.b(findViewById, "findViewById(R.id.btn_ok)");
        this.h = (Button) findViewById;
        View findViewById2 = findViewById(R.id.btn_cancel);
        dqc.b(findViewById2, "findViewById(R.id.btn_cancel)");
        this.i = (Button) findViewById2;
        View findViewById3 = findViewById(R.id.tvTerms);
        dqc.b(findViewById3, "findViewById(R.id.tvTerms)");
        this.g = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.chkTerms);
        dqc.b(findViewById4, "findViewById(R.id.chkTerms)");
        this.j = (CheckBox) findViewById4;
        View findViewById5 = findViewById(R.id.txtMessageDetails);
        dqc.b(findViewById5, "findViewById(R.id.txtMessageDetails)");
        this.f = (TextView) findViewById5;
        View findViewById6 = findViewById(R.id.txtMessage);
        dqc.b(findViewById6, "findViewById(R.id.txtMessage)");
        TextView textView = (TextView) findViewById6;
        this.e = textView;
        if (textView != null) {
            textView.setVisibility(8);
            Button button = this.i;
            if (button == null) {
                dqc.a("btnCancel");
                throw null;
            }
            button.setOnClickListener(this.l);
            CheckBox checkBox = this.j;
            if (checkBox == null) {
                dqc.a("chkTerms");
                throw null;
            }
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.ucare.we.presentation.deactivatefbb.-$$Lambda$DeactivationConfirmationActivity$WZrlv7aMsWdCWLm2Ubpm8hEAnd8
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    DeactivationConfirmationActivity.lambda$WZrlv7aMsWdCWLm2Ubpm8hEAnd8(DeactivationConfirmationActivity.this, compoundButton, z);
                }
            });
            TextView textView2 = this.g;
            if (textView2 == null) {
                dqc.a("tvTerms");
                throw null;
            }
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.deactivatefbb.-$$Lambda$DeactivationConfirmationActivity$3PcDB-nfCuwKQ1aN_sGzkEQQxGo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DeactivationConfirmationActivity.m41lambda$3PcDBnfCuwKQ1aN_sGzkEQQxGo(DeactivationConfirmationActivity.this, view);
                }
            });
            TextView textView3 = this.f;
            if (textView3 != null) {
                textView3.setText(getString(R.string.deactivateFBBTitle));
                a().a(this);
                Button button2 = this.h;
                if (button2 == null) {
                    dqc.a("btnOK");
                    throw null;
                }
                button2.setOnClickListener(null);
                Button button3 = this.h;
                if (button3 != null) {
                    button3.setAlpha(0.4f);
                    return;
                } else {
                    dqc.a("btnOK");
                    throw null;
                }
            }
            dqc.a("txtMessageDetails");
            throw null;
        }
        dqc.a("txtMessage");
        throw null;
    }

    public static final void a(DeactivationConfirmationActivity deactivationConfirmationActivity, CompoundButton compoundButton, boolean z) {
        dqc.d(deactivationConfirmationActivity, "this$0");
        if (z) {
            Button button = deactivationConfirmationActivity.h;
            if (button == null) {
                dqc.a("btnOK");
                throw null;
            }
            button.setAlpha(1.0f);
            Button button2 = deactivationConfirmationActivity.h;
            if (button2 != null) {
                button2.setOnClickListener(deactivationConfirmationActivity.m);
                return;
            } else {
                dqc.a("btnOK");
                throw null;
            }
        }
        Button button3 = deactivationConfirmationActivity.h;
        if (button3 == null) {
            dqc.a("btnOK");
            throw null;
        }
        button3.setOnClickListener(null);
        Button button4 = deactivationConfirmationActivity.h;
        if (button4 != null) {
            button4.setAlpha(0.4f);
        } else {
            dqc.a("btnOK");
            throw null;
        }
    }

    public static final void c(DeactivationConfirmationActivity deactivationConfirmationActivity, View view) {
        dqc.d(deactivationConfirmationActivity, "this$0");
        deactivationConfirmationActivity.startActivity(new Intent(deactivationConfirmationActivity, TermsConditionActivity.class));
    }

    @Override // defpackage.ddx
    public final void a(ServerResponse<String> serverResponse) {
        dqc.d(serverResponse, "serverResponse");
        if (dqc.a((Object) serverResponse.getHeader().getResponseCode(), (Object) "0")) {
            String responseMessage = serverResponse.getHeader().getResponseMessage();
            dqc.b(responseMessage, "serverResponse.header.responseMessage");
            a(responseMessage, false, dqc.a(getString(R.string.orderNumber), (Object) serverResponse.getBody()));
        } else {
            String responseMessage2 = serverResponse.getHeader().getResponseMessage();
            dqc.b(responseMessage2, "serverResponse.header.responseMessage");
            String string = getString(R.string.please_try_again);
            dqc.b(string, "getString(R.string.please_try_again)");
            a(responseMessage2, true, string);
        }
        new Gson().a(serverResponse);
    }

    @Override // defpackage.ddx
    public final void e_(String str) {
        dqc.d(str, "failureMessage");
        String string = getString(R.string.please_try_again);
        dqc.b(string, "getString(R.string.please_try_again)");
        a(str, true, string);
        new Gson().a(str);
    }

    private final void a(String str, boolean z, String str2) {
        Intent intent = new Intent(this, DeactivationResponseActivity.class);
        intent.putExtra("responseMessage", str);
        intent.putExtra("messageDetails", str2);
        intent.putExtra("isError", z);
        startActivity(intent);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ucare/we/presentation/deactivatefbb/DeactivationConfirmationActivity$Companion;", "", "()V", "navigateToConfirmRenewal", "", "context", "Landroid/content/Context;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(byte b) {
            this();
        }

        private a() {
        }

        public static void a(Context context) {
            Intent intent = new Intent(context, DeactivationConfirmationActivity.class);
            if (context != null) {
                context.startActivity(intent);
            }
        }
    }
}
