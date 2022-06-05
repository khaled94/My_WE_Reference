package com.ucare.we;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.ucare.we.model.PlansAndBundlesResponseBody;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010'\u001a\u00020(H\u0002J\u0012\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010+H\u0014J\b\u0010,\u001a\u00020(H\u0002J\b\u0010-\u001a\u00020(H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020%X\u0082.¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/ucare/we/SubscribeToBundleActivity;", "Lcom/ucare/we/injection/TransparentActivity;", "()V", "activityLauncher", "Lcom/ucare/we/view/ActivityLauncher;", "getActivityLauncher", "()Lcom/ucare/we/view/ActivityLauncher;", "setActivityLauncher", "(Lcom/ucare/we/view/ActivityLauncher;)V", "btnCancel", "Landroid/widget/Button;", "btnOK", "cancelClickListener", "Landroid/view/View$OnClickListener;", "getCancelClickListener", "()Landroid/view/View$OnClickListener;", "setCancelClickListener", "(Landroid/view/View$OnClickListener;)V", "launcher", "getLauncher", "setLauncher", "mainBundle", "Lcom/ucare/we/model/PlansAndBundlesResponseBody;", "getMainBundle", "()Lcom/ucare/we/model/PlansAndBundlesResponseBody;", "setMainBundle", "(Lcom/ucare/we/model/PlansAndBundlesResponseBody;)V", "okClickListener", "getOkClickListener", "setOkClickListener", "progressHandler", "Lcom/ucare/we/util/ProgressHandler;", "getProgressHandler", "()Lcom/ucare/we/util/ProgressHandler;", "setProgressHandler", "(Lcom/ucare/we/util/ProgressHandler;)V", "txtMessage", "Landroid/widget/TextView;", "txtMessageDetails", "initViews", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setListeners", "setViews", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SubscribeToBundleActivity extends dae {
    @Inject
    public djx a;
    @Inject
    public djx b;
    @Inject
    public djg c;
    private TextView d;
    private TextView e;
    private Button f;
    private Button g;
    private PlansAndBundlesResponseBody h;
    private View.OnClickListener i = new View.OnClickListener() { // from class: com.ucare.we.-$$Lambda$SubscribeToBundleActivity$_HcqqXI5FEdv33HoQtm2-xDY9t4
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SubscribeToBundleActivity.m9lambda$_HcqqXI5FEdv33HoQtm2xDY9t4(SubscribeToBundleActivity.this, view);
        }
    };
    private View.OnClickListener j = new View.OnClickListener() { // from class: com.ucare.we.-$$Lambda$SubscribeToBundleActivity$uwGhK8Uj32iK6FpkBDo8DDKGjHA
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SubscribeToBundleActivity.lambda$uwGhK8Uj32iK6FpkBDo8DDKGjHA(SubscribeToBundleActivity.this, view);
        }
    };

    /* renamed from: lambda$_HcqqXI5FEdv33HoQtm2-xDY9t4 */
    public static /* synthetic */ void m9lambda$_HcqqXI5FEdv33HoQtm2xDY9t4(SubscribeToBundleActivity subscribeToBundleActivity, View view) {
        a(subscribeToBundleActivity, view);
    }

    public static /* synthetic */ void lambda$uwGhK8Uj32iK6FpkBDo8DDKGjHA(SubscribeToBundleActivity subscribeToBundleActivity, View view) {
        b(subscribeToBundleActivity, view);
    }

    public static final void a(SubscribeToBundleActivity subscribeToBundleActivity, View view) {
        dqc.d(subscribeToBundleActivity, "this$0");
        subscribeToBundleActivity.finish();
    }

    public static final void b(SubscribeToBundleActivity subscribeToBundleActivity, View view) {
        dqc.d(subscribeToBundleActivity, "this$0");
        subscribeToBundleActivity.setResult(-1, new Intent(subscribeToBundleActivity, AddMoreBundlesActivity.class));
        subscribeToBundleActivity.finish();
    }

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_subscribe_to_bundle);
        this.h = (PlansAndBundlesResponseBody) getIntent().getParcelableExtra("bundleToBeSubscribed");
        View findViewById = findViewById(R.id.txtMessage);
        dqc.b(findViewById, "findViewById(R.id.txtMessage)");
        this.d = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.txtMessageDetails);
        dqc.b(findViewById2, "findViewById(R.id.txtMessageDetails)");
        this.e = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.btn_ok);
        dqc.b(findViewById3, "findViewById(R.id.btn_ok)");
        this.f = (Button) findViewById3;
        View findViewById4 = findViewById(R.id.btn_cancel);
        dqc.b(findViewById4, "findViewById(R.id.btn_cancel)");
        this.g = (Button) findViewById4;
        TextView textView = this.d;
        if (textView == null) {
            dqc.a("txtMessage");
            throw null;
        }
        textView.setText(getString(R.string.subscribe_to_bundle));
        PlansAndBundlesResponseBody plansAndBundlesResponseBody = this.h;
        if (plansAndBundlesResponseBody != null) {
            TextView textView2 = this.e;
            if (textView2 == null) {
                dqc.a("txtMessageDetails");
                throw null;
            }
            textView2.setText(dsg.a(getString(R.string.subscribe_bundle) + '(' + ((Object) plansAndBundlesResponseBody.getOfferEnName()) + ')'));
        }
        Button button = this.f;
        if (button == null) {
            dqc.a("btnOK");
            throw null;
        }
        button.setOnClickListener(this.j);
        Button button2 = this.g;
        if (button2 != null) {
            button2.setOnClickListener(this.i);
        } else {
            dqc.a("btnCancel");
            throw null;
        }
    }
}
