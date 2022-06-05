package com.ucare.we.manageplanspostpaid;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.ucare.we.R;
import com.ucare.we.model.MigrateModel.MigrateOffers;
import kotlin.Metadata;
import org.json.JSONException;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010.\u001a\u00020/H\u0002J\u0006\u00100\u001a\u00020/J\b\u00101\u001a\u00020/H\u0002J\u0012\u00102\u001a\u00020/2\b\u00103\u001a\u0004\u0018\u000104H\u0014J\b\u00105\u001a\u00020/H\u0002J\b\u00106\u001a\u00020/H\u0002J\u0010\u00107\u001a\u00020/2\u0006\u00108\u001a\u000209H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\u001c\u0010%\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R\u001c\u0010(\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!R\u000e\u0010+\u001a\u00020,X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020,X\u0082.¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/ucare/we/manageplanspostpaid/MigrateToPlanConfirmationActivity;", "Lcom/ucare/we/injection/TransparentActivity;", "Lcom/ucare/we/manageplanspostpaid/MigrateToPlanConfirmationView;", "()V", "btnCancel", "Landroid/widget/Button;", "btnOK", "cancelClickListener", "Landroid/view/View$OnClickListener;", "getCancelClickListener", "()Landroid/view/View$OnClickListener;", "setCancelClickListener", "(Landroid/view/View$OnClickListener;)V", "migrateToPlanPresenter", "Lcom/ucare/we/manageplanspostpaid/MigrateToPlanConfirmationPresenter;", "getMigrateToPlanPresenter", "()Lcom/ucare/we/manageplanspostpaid/MigrateToPlanConfirmationPresenter;", "setMigrateToPlanPresenter", "(Lcom/ucare/we/manageplanspostpaid/MigrateToPlanConfirmationPresenter;)V", "okClickListener", "getOkClickListener", "setOkClickListener", "progressDialog", "Landroid/app/ProgressDialog;", "getProgressDialog", "()Landroid/app/ProgressDialog;", "setProgressDialog", "(Landroid/app/ProgressDialog;)V", "toBeSubscribedID", "", "getToBeSubscribedID", "()Ljava/lang/String;", "setToBeSubscribedID", "(Ljava/lang/String;)V", "toBeSubscribedName", "getToBeSubscribedName", "setToBeSubscribedName", "toBeSubscribedOfferParent", "getToBeSubscribedOfferParent", "setToBeSubscribedOfferParent", "toBeSubscribedPrice", "getToBeSubscribedPrice", "setToBeSubscribedPrice", "txtMessage", "Landroid/widget/TextView;", "txtMessageDetails", "getExtras", "", "hideProgress", "initViews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setData", "setListeners", "showProgress", "show", "", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class MigrateToPlanConfirmationActivity extends dae implements daq {
    private String a;
    private String b;
    private String c;
    private String d;
    private TextView e;
    private TextView f;
    private Button g;
    private Button h;
    private dap i;
    private ProgressDialog j;
    private View.OnClickListener k = new View.OnClickListener() { // from class: com.ucare.we.manageplanspostpaid.-$$Lambda$MigrateToPlanConfirmationActivity$qrcK-5OH3sI5_cmoD80qr_5leeQ
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MigrateToPlanConfirmationActivity.m22lambda$qrcK5OH3sI5_cmoD80qr_5leeQ(MigrateToPlanConfirmationActivity.this, view);
        }
    };
    private View.OnClickListener l = new View.OnClickListener() { // from class: com.ucare.we.manageplanspostpaid.-$$Lambda$MigrateToPlanConfirmationActivity$QZKeW6HYhJwLNcs_7sR2sCpUXjA
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MigrateToPlanConfirmationActivity.lambda$QZKeW6HYhJwLNcs_7sR2sCpUXjA(MigrateToPlanConfirmationActivity.this, view);
        }
    };

    public static /* synthetic */ void lambda$QZKeW6HYhJwLNcs_7sR2sCpUXjA(MigrateToPlanConfirmationActivity migrateToPlanConfirmationActivity, View view) {
        b(migrateToPlanConfirmationActivity, view);
    }

    /* renamed from: lambda$qrcK-5OH3sI5_cmoD80qr_5leeQ */
    public static /* synthetic */ void m22lambda$qrcK5OH3sI5_cmoD80qr_5leeQ(MigrateToPlanConfirmationActivity migrateToPlanConfirmationActivity, View view) {
        a(migrateToPlanConfirmationActivity, view);
    }

    public static final void a(MigrateToPlanConfirmationActivity migrateToPlanConfirmationActivity, View view) {
        dqc.d(migrateToPlanConfirmationActivity, "this$0");
        migrateToPlanConfirmationActivity.finish();
    }

    public static final void b(MigrateToPlanConfirmationActivity migrateToPlanConfirmationActivity, View view) {
        dqc.d(migrateToPlanConfirmationActivity, "this$0");
        MigrateOffers migrateOffers = new MigrateOffers();
        migrateOffers.offerId = migrateToPlanConfirmationActivity.a;
        migrateOffers.parentOfferId = migrateToPlanConfirmationActivity.d;
        try {
            migrateToPlanConfirmationActivity.b(true);
            dap dapVar = migrateToPlanConfirmationActivity.i;
            if (dapVar == null) {
                return;
            }
            dapVar.a(migrateOffers);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_migrate_to_plan_confirmation);
        if (getIntent().getExtras() != null) {
            Bundle extras = getIntent().getExtras();
            this.a = extras == null ? null : extras.getString("id_add");
            Bundle extras2 = getIntent().getExtras();
            this.b = String.valueOf(extras2 == null ? null : extras2.getString("price_add"));
            Bundle extras3 = getIntent().getExtras();
            this.c = extras3 == null ? null : extras3.getString("name_add");
            Bundle extras4 = getIntent().getExtras();
            this.d = extras4 == null ? null : extras4.getString("id_remove");
        }
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
        this.i = new dap(this, this);
        Button button = this.g;
        if (button == null) {
            dqc.a("btnOK");
            throw null;
        }
        button.setOnClickListener(this.l);
        Button button2 = this.h;
        if (button2 == null) {
            dqc.a("btnCancel");
            throw null;
        }
        button2.setOnClickListener(this.k);
        TextView textView = this.e;
        if (textView == null) {
            dqc.a("txtMessage");
            throw null;
        }
        textView.setText(getString(R.string.change_plan));
        TextView textView2 = this.f;
        if (textView2 == null) {
            dqc.a("txtMessageDetails");
            throw null;
        }
        textView2.setText(getString(R.string.confirmation_first) + " (" + ((Object) this.c) + ')');
    }

    @Override // defpackage.daq
    public final void b(boolean z) {
        if (z) {
            ProgressDialog progressDialog = this.j;
            if (progressDialog != null) {
                if (dqc.a(progressDialog == null ? null : Boolean.valueOf(progressDialog.isShowing()), Boolean.TRUE)) {
                    a();
                }
            }
            ProgressDialog progressDialog2 = new ProgressDialog(this);
            this.j = progressDialog2;
            if (progressDialog2 != null) {
                progressDialog2.setMessage(getString(R.string.loading));
            }
            ProgressDialog progressDialog3 = this.j;
            if (progressDialog3 != null) {
                progressDialog3.setCancelable(true);
            }
            ProgressDialog progressDialog4 = this.j;
            if (progressDialog4 != null) {
                progressDialog4.setCanceledOnTouchOutside(false);
            }
            ProgressDialog progressDialog5 = this.j;
            if (progressDialog5 == null) {
                return;
            }
            progressDialog5.show();
            return;
        }
        a();
    }

    private void a() {
        ProgressDialog progressDialog = this.j;
        if (progressDialog == null || progressDialog == null) {
            return;
        }
        progressDialog.dismiss();
    }
}
