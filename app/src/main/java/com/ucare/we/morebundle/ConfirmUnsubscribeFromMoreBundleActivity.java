package com.ucare.we.morebundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.ucare.we.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\u0012\u0010\u0019\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0017H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ucare/we/morebundle/ConfirmUnsubscribeFromMoreBundleActivity;", "Lcom/ucare/we/injection/TransparentActivity;", "()V", "btnCancel", "Landroid/widget/Button;", "btnOK", "cancelClickListener", "Landroid/view/View$OnClickListener;", "getCancelClickListener", "()Landroid/view/View$OnClickListener;", "setCancelClickListener", "(Landroid/view/View$OnClickListener;)V", "moreBundleID", "", "moreBundleName", "okClickListener", "getOkClickListener", "setOkClickListener", "position", "txtMessage", "Landroid/widget/TextView;", "txtMessageDetails", "getExtras", "", "initViews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setListeners", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ConfirmUnsubscribeFromMoreBundleActivity extends dae {
    private TextView a;
    private TextView b;
    private Button c;
    private Button d;
    private String e;
    private String f;
    private View.OnClickListener g = new View.OnClickListener() { // from class: com.ucare.we.morebundle.-$$Lambda$ConfirmUnsubscribeFromMoreBundleActivity$34Q8fv144A_X6XBIj2B_GxgmQxg
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ConfirmUnsubscribeFromMoreBundleActivity.lambda$34Q8fv144A_X6XBIj2B_GxgmQxg(ConfirmUnsubscribeFromMoreBundleActivity.this, view);
        }
    };
    private View.OnClickListener h = new View.OnClickListener() { // from class: com.ucare.we.morebundle.-$$Lambda$ConfirmUnsubscribeFromMoreBundleActivity$YfszbzHydovDr_kuVu7JdiXfWIg
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ConfirmUnsubscribeFromMoreBundleActivity.lambda$YfszbzHydovDr_kuVu7JdiXfWIg(ConfirmUnsubscribeFromMoreBundleActivity.this, view);
        }
    };
    private String i;

    public static /* synthetic */ void lambda$34Q8fv144A_X6XBIj2B_GxgmQxg(ConfirmUnsubscribeFromMoreBundleActivity confirmUnsubscribeFromMoreBundleActivity, View view) {
        a(confirmUnsubscribeFromMoreBundleActivity, view);
    }

    public static /* synthetic */ void lambda$YfszbzHydovDr_kuVu7JdiXfWIg(ConfirmUnsubscribeFromMoreBundleActivity confirmUnsubscribeFromMoreBundleActivity, View view) {
        b(confirmUnsubscribeFromMoreBundleActivity, view);
    }

    public static final void a(ConfirmUnsubscribeFromMoreBundleActivity confirmUnsubscribeFromMoreBundleActivity, View view) {
        dqc.d(confirmUnsubscribeFromMoreBundleActivity, "this$0");
        confirmUnsubscribeFromMoreBundleActivity.finish();
    }

    public static final void b(ConfirmUnsubscribeFromMoreBundleActivity confirmUnsubscribeFromMoreBundleActivity, View view) {
        dqc.d(confirmUnsubscribeFromMoreBundleActivity, "this$0");
        Intent intent = new Intent();
        intent.putExtra("position", String.valueOf(confirmUnsubscribeFromMoreBundleActivity.e));
        intent.putExtra("bundle_name", confirmUnsubscribeFromMoreBundleActivity.f);
        confirmUnsubscribeFromMoreBundleActivity.setResult(-1, intent);
        confirmUnsubscribeFromMoreBundleActivity.finish();
    }

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_confirm_unsubscribe_from_more_bundle);
        Intent intent = getIntent();
        this.e = intent.getStringExtra("position");
        this.f = intent.getStringExtra("bundle_name");
        this.i = intent.getStringExtra("bundle_id");
        View findViewById = findViewById(R.id.txtMessage);
        dqc.b(findViewById, "findViewById(R.id.txtMessage)");
        this.a = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.txtMessageDetails);
        dqc.b(findViewById2, "findViewById(R.id.txtMessageDetails)");
        this.b = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.btn_ok);
        dqc.b(findViewById3, "findViewById(R.id.btn_ok)");
        this.c = (Button) findViewById3;
        View findViewById4 = findViewById(R.id.btn_cancel);
        dqc.b(findViewById4, "findViewById(R.id.btn_cancel)");
        this.d = (Button) findViewById4;
        TextView textView = this.a;
        if (textView == null) {
            dqc.a("txtMessage");
            throw null;
        }
        textView.setText(getString(R.string.un_subscribe));
        TextView textView2 = this.b;
        if (textView2 == null) {
            dqc.a("txtMessageDetails");
            throw null;
        }
        textView2.setText(getString(R.string.unsubscribe_from) + ((Object) this.f) + getString(R.string.quest));
        Button button = this.c;
        if (button == null) {
            dqc.a("btnOK");
            throw null;
        }
        button.setOnClickListener(this.h);
        Button button2 = this.d;
        if (button2 != null) {
            button2.setOnClickListener(this.g);
        } else {
            dqc.a("btnCancel");
            throw null;
        }
    }
}
