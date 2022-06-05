package com.ucare.we.presentation.deactivatefbb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.ucare.we.R;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ucare/we/presentation/deactivatefbb/DeactivationResponseActivity;", "Lcom/ucare/we/injection/TransparentActivity;", "()V", "btnOk", "Landroid/widget/Button;", "imgStatus", "Landroid/widget/ImageView;", "progressHandler", "Lcom/ucare/we/util/ProgressHandler;", "getProgressHandler", "()Lcom/ucare/we/util/ProgressHandler;", "setProgressHandler", "(Lcom/ucare/we/util/ProgressHandler;)V", "txtMessage", "Landroid/widget/TextView;", "txtMessageDetails", "initViews", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class DeactivationResponseActivity extends dae {
    @Inject
    public djg a;
    private ImageView b;
    private TextView c;
    private TextView d;
    private Button e;

    public static /* synthetic */ void lambda$frbpHxECr9pZiP3AclgLIkiBGL8(DeactivationResponseActivity deactivationResponseActivity, View view) {
        a(deactivationResponseActivity, view);
    }

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_deactivation_confirmation_response);
        View findViewById = findViewById(R.id.imgStatus);
        dqc.b(findViewById, "findViewById(R.id.imgStatus)");
        this.b = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.txtMessage);
        dqc.b(findViewById2, "findViewById(R.id.txtMessage)");
        this.c = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.txtMessageDetails);
        dqc.b(findViewById3, "findViewById(R.id.txtMessageDetails)");
        this.d = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.btn_done_transfer);
        dqc.b(findViewById4, "findViewById(R.id.btn_done_transfer)");
        this.e = (Button) findViewById4;
        Intent intent = getIntent();
        if (intent != null) {
            if (intent.getBooleanExtra("isError", false)) {
                ImageView imageView = this.b;
                if (imageView == null) {
                    dqc.a("imgStatus");
                    throw null;
                }
                imageView.setImageResource(R.drawable.ic_error_vector);
                TextView textView = this.d;
                if (textView == null) {
                    dqc.a("txtMessageDetails");
                    throw null;
                }
                textView.setVisibility(0);
                Button button = this.e;
                if (button == null) {
                    dqc.a("btnOk");
                    throw null;
                }
                button.setText(getString(R.string.popup_cancel));
            } else {
                ImageView imageView2 = this.b;
                if (imageView2 == null) {
                    dqc.a("imgStatus");
                    throw null;
                }
                imageView2.setImageResource(R.drawable.ic_success_vector);
                TextView textView2 = this.d;
                if (textView2 == null) {
                    dqc.a("txtMessageDetails");
                    throw null;
                }
                textView2.setVisibility(0);
                Button button2 = this.e;
                if (button2 == null) {
                    dqc.a("btnOk");
                    throw null;
                }
                button2.setText(getString(R.string.ok));
            }
            String stringExtra = intent.getStringExtra("responseMessage");
            if (stringExtra != null) {
                TextView textView3 = this.c;
                if (textView3 == null) {
                    dqc.a("txtMessage");
                    throw null;
                }
                textView3.setText(stringExtra);
            }
            String stringExtra2 = intent.getStringExtra("messageDetails");
            if (stringExtra2 != null) {
                TextView textView4 = this.d;
                if (textView4 == null) {
                    dqc.a("txtMessageDetails");
                    throw null;
                }
                textView4.setText(stringExtra2);
            }
        }
        Button button3 = this.e;
        if (button3 != null) {
            button3.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.deactivatefbb.-$$Lambda$DeactivationResponseActivity$frbpHxECr9pZiP3AclgLIkiBGL8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DeactivationResponseActivity.lambda$frbpHxECr9pZiP3AclgLIkiBGL8(DeactivationResponseActivity.this, view);
                }
            });
        } else {
            dqc.a("btnOk");
            throw null;
        }
    }

    public static final void a(DeactivationResponseActivity deactivationResponseActivity, View view) {
        dqc.d(deactivationResponseActivity, "this$0");
        deactivationResponseActivity.finish();
    }
}
