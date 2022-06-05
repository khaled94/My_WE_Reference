package com.ucare.we.presentation.profile.postpaidprofile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.ucare.we.R;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020%H\u0002J\u0012\u0010'\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\b\u0010*\u001a\u00020%H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u001cX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 ¨\u0006+"}, d2 = {"Lcom/ucare/we/presentation/profile/postpaidprofile/DisableAutoPayConfirmationActivity;", "Lcom/ucare/we/injection/TransparentActivity;", "()V", "authenticationProvider", "Lcom/ucare/we/provider/auth/AuthenticationProvider;", "getAuthenticationProvider", "()Lcom/ucare/we/provider/auth/AuthenticationProvider;", "setAuthenticationProvider", "(Lcom/ucare/we/provider/auth/AuthenticationProvider;)V", "btnCancel", "Landroid/widget/Button;", "getBtnCancel", "()Landroid/widget/Button;", "setBtnCancel", "(Landroid/widget/Button;)V", "btnOK", "getBtnOK", "setBtnOK", "cancelClickListener", "Landroid/view/View$OnClickListener;", "getCancelClickListener", "()Landroid/view/View$OnClickListener;", "setCancelClickListener", "(Landroid/view/View$OnClickListener;)V", "okClickListener", "getOkClickListener", "setOkClickListener", "txtMessage", "Landroid/widget/TextView;", "getTxtMessage", "()Landroid/widget/TextView;", "setTxtMessage", "(Landroid/widget/TextView;)V", "txtMessageDetails", "getTxtMessageDetails", "setTxtMessageDetails", "bindViews", "", "initViews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setListeners", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class DisableAutoPayConfirmationActivity extends dae {
    @Inject
    public dio a;
    public TextView b;
    public TextView c;
    public Button d;
    public Button e;
    private View.OnClickListener f = new View.OnClickListener() { // from class: com.ucare.we.presentation.profile.postpaidprofile.-$$Lambda$DisableAutoPayConfirmationActivity$vHHBAeS6I0AuDu3W32-sGEeuFik
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            DisableAutoPayConfirmationActivity.m62lambda$vHHBAeS6I0AuDu3W32sGEeuFik(DisableAutoPayConfirmationActivity.this, view);
        }
    };
    private View.OnClickListener g = new View.OnClickListener() { // from class: com.ucare.we.presentation.profile.postpaidprofile.-$$Lambda$DisableAutoPayConfirmationActivity$VpUIzBS_-5w0_MBPWR7jpWEoI3o
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            DisableAutoPayConfirmationActivity.m61lambda$VpUIzBS_5w0_MBPWR7jpWEoI3o(DisableAutoPayConfirmationActivity.this, view);
        }
    };

    /* renamed from: lambda$VpUIzBS_-5w0_MBPWR7jpWEoI3o */
    public static /* synthetic */ void m61lambda$VpUIzBS_5w0_MBPWR7jpWEoI3o(DisableAutoPayConfirmationActivity disableAutoPayConfirmationActivity, View view) {
        b(disableAutoPayConfirmationActivity, view);
    }

    /* renamed from: lambda$vHHBAeS6I0AuDu3W32-sGEeuFik */
    public static /* synthetic */ void m62lambda$vHHBAeS6I0AuDu3W32sGEeuFik(DisableAutoPayConfirmationActivity disableAutoPayConfirmationActivity, View view) {
        a(disableAutoPayConfirmationActivity, view);
    }

    private TextView a() {
        TextView textView = this.b;
        if (textView != null) {
            return textView;
        }
        dqc.a("txtMessage");
        throw null;
    }

    private TextView b() {
        TextView textView = this.c;
        if (textView != null) {
            return textView;
        }
        dqc.a("txtMessageDetails");
        throw null;
    }

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_disable_auto_pay_confirmation);
        View findViewById = findViewById(R.id.btn_ok);
        dqc.b(findViewById, "findViewById(R.id.btn_ok)");
        Button button = (Button) findViewById;
        dqc.d(button, "<set-?>");
        this.d = button;
        View findViewById2 = findViewById(R.id.btn_cancel);
        dqc.b(findViewById2, "findViewById(R.id.btn_cancel)");
        Button button2 = (Button) findViewById2;
        dqc.d(button2, "<set-?>");
        this.e = button2;
        View findViewById3 = findViewById(R.id.txtMessage);
        dqc.b(findViewById3, "findViewById(R.id.txtMessage)");
        TextView textView = (TextView) findViewById3;
        dqc.d(textView, "<set-?>");
        this.b = textView;
        View findViewById4 = findViewById(R.id.txtMessageDetails);
        dqc.b(findViewById4, "findViewById(R.id.txtMessageDetails)");
        TextView textView2 = (TextView) findViewById4;
        dqc.d(textView2, "<set-?>");
        this.c = textView2;
        dio dioVar = new dio();
        dqc.d(dioVar, "<set-?>");
        this.a = dioVar;
        if (dioVar != null) {
            if (dioVar.e()) {
                a().setText(getString(R.string.auto_pay));
                b().setText(getString(R.string.disable_auto_pay_hint));
            } else {
                a().setText(getString(R.string.auto_recharge));
                b().setText(getString(R.string.disable_auto_recharge_hint));
            }
            Button button3 = this.d;
            if (button3 != null) {
                button3.setOnClickListener(this.g);
                Button button4 = this.e;
                if (button4 != null) {
                    button4.setOnClickListener(this.f);
                    return;
                } else {
                    dqc.a("btnCancel");
                    throw null;
                }
            }
            dqc.a("btnOK");
            throw null;
        }
        dqc.a("authenticationProvider");
        throw null;
    }

    public static final void a(DisableAutoPayConfirmationActivity disableAutoPayConfirmationActivity, View view) {
        dqc.d(disableAutoPayConfirmationActivity, "this$0");
        disableAutoPayConfirmationActivity.finish();
    }

    public static final void b(DisableAutoPayConfirmationActivity disableAutoPayConfirmationActivity, View view) {
        dqc.d(disableAutoPayConfirmationActivity, "this$0");
        disableAutoPayConfirmationActivity.setResult(-1, new Intent());
        disableAutoPayConfirmationActivity.finish();
    }
}
