package com.ucare.we.genericconfirmationscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.ucare.we.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u0012\u0010\u0018\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000bR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ucare/we/genericconfirmationscreen/GenericConfirmationActivity;", "Lcom/ucare/we/injection/TransparentActivity;", "()V", "btnCancel", "Landroid/widget/Button;", "btnOK", "cancelClickListener", "Landroid/view/View$OnClickListener;", "getCancelClickListener", "()Landroid/view/View$OnClickListener;", "setCancelClickListener", "(Landroid/view/View$OnClickListener;)V", "hint", "", "okClickListener", "getOkClickListener", "setOkClickListener", "title", "txtMessage", "Landroid/widget/TextView;", "txtMessageDetails", "getExtras", "", "initViews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setListeners", "Companion", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class GenericConfirmationActivity extends dae {
    public static final a a = new a((byte) 0);
    private TextView b;
    private TextView c;
    private Button d;
    private Button e;
    private String f;
    private String g;
    private View.OnClickListener h = new View.OnClickListener() { // from class: com.ucare.we.genericconfirmationscreen.-$$Lambda$GenericConfirmationActivity$NGDidQZq0Zhr9cO-SZJcweag1WE
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            GenericConfirmationActivity.m21lambda$NGDidQZq0Zhr9cOSZJcweag1WE(GenericConfirmationActivity.this, view);
        }
    };
    private View.OnClickListener i = new View.OnClickListener() { // from class: com.ucare.we.genericconfirmationscreen.-$$Lambda$GenericConfirmationActivity$UKg8tAI8QyxSXAIzptAjnHExl1o
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            GenericConfirmationActivity.lambda$UKg8tAI8QyxSXAIzptAjnHExl1o(GenericConfirmationActivity.this, view);
        }
    };

    /* renamed from: lambda$NGDidQZq0Zhr9cO-SZJcweag1WE */
    public static /* synthetic */ void m21lambda$NGDidQZq0Zhr9cOSZJcweag1WE(GenericConfirmationActivity genericConfirmationActivity, View view) {
        a(genericConfirmationActivity, view);
    }

    public static /* synthetic */ void lambda$UKg8tAI8QyxSXAIzptAjnHExl1o(GenericConfirmationActivity genericConfirmationActivity, View view) {
        b(genericConfirmationActivity, view);
    }

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_generic_confirmation);
        if (getIntent().getExtras() != null) {
            Bundle extras = getIntent().getExtras();
            this.f = extras == null ? null : extras.getString("confirmation_title");
            Bundle extras2 = getIntent().getExtras();
            this.g = extras2 == null ? null : extras2.getString("confirmation_hint");
        }
        View findViewById = findViewById(R.id.txtMessage);
        dqc.b(findViewById, "findViewById(R.id.txtMessage)");
        this.b = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.txtMessageDetails);
        dqc.b(findViewById2, "findViewById(R.id.txtMessageDetails)");
        this.c = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.btn_ok);
        dqc.b(findViewById3, "findViewById(R.id.btn_ok)");
        this.d = (Button) findViewById3;
        View findViewById4 = findViewById(R.id.btn_cancel);
        dqc.b(findViewById4, "findViewById(R.id.btn_cancel)");
        this.e = (Button) findViewById4;
        TextView textView = this.b;
        if (textView == null) {
            dqc.a("txtMessage");
            throw null;
        }
        textView.setText(this.f);
        TextView textView2 = this.c;
        if (textView2 == null) {
            dqc.a("txtMessageDetails");
            throw null;
        }
        textView2.setText(this.g);
        Button button = this.d;
        if (button == null) {
            dqc.a("btnOK");
            throw null;
        }
        button.setOnClickListener(this.i);
        Button button2 = this.e;
        if (button2 != null) {
            button2.setOnClickListener(this.h);
        } else {
            dqc.a("btnCancel");
            throw null;
        }
    }

    public static final void a(GenericConfirmationActivity genericConfirmationActivity, View view) {
        dqc.d(genericConfirmationActivity, "this$0");
        genericConfirmationActivity.finish();
    }

    public static final void b(GenericConfirmationActivity genericConfirmationActivity, View view) {
        dqc.d(genericConfirmationActivity, "this$0");
        genericConfirmationActivity.setResult(-1, new Intent());
        genericConfirmationActivity.finish();
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/ucare/we/genericconfirmationscreen/GenericConfirmationActivity$Companion;", "", "()V", "showConfirmationScreen", "", "context", "Landroidx/appcompat/app/AppCompatActivity;", "title", "", "hint", "requestCode", "", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(byte b) {
            this();
        }

        private a() {
        }
    }
}
