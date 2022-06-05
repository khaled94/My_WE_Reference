package com.ucare.we;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.ucare.we.model.AssociatedNumberResponseBody;
import com.ucare.we.model.MainPlanResponseBody;
import com.ucare.we.model.extras.ExtrasList;
import com.ucare.we.model.special.SpecialList;
import com.ucare.we.model.usagedetails.SummarizedLineUsageItem;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class RequestRouterUserNamePasswordActivity extends czy implements dht {
    private static final String e = RequestRouterUserNamePasswordActivity.class.getSimpleName();
    View.OnClickListener a = new View.OnClickListener() { // from class: com.ucare.we.-$$Lambda$RequestRouterUserNamePasswordActivity$IRnVD9aUiaNS2dVi9I3BSm8G540
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            RequestRouterUserNamePasswordActivity.lambda$IRnVD9aUiaNS2dVi9I3BSm8G540(RequestRouterUserNamePasswordActivity.this, view);
        }
    };
    @Inject
    dhu b;
    @Inject
    djg c;
    String d;
    private String f;
    @BindView(R.id.imgBackButton)
    ImageView imgBackButton;
    @BindView(R.id.password)
    EditText passwordEditText;
    @BindView(R.id.txtTitle)
    TextView txtTitle;
    @BindView(R.id.userName)
    EditText userNameEditText;

    public static /* synthetic */ void lambda$IRnVD9aUiaNS2dVi9I3BSm8G540(RequestRouterUserNamePasswordActivity requestRouterUserNamePasswordActivity, View view) {
        requestRouterUserNamePasswordActivity.a(view);
    }

    @Override // defpackage.dht
    public final void a(float f) {
    }

    @Override // defpackage.dht
    public final void a(int i, String str) {
    }

    @Override // defpackage.dht
    public final void a(cyq cyqVar) {
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
    public final void b(int i, String str) {
    }

    @Override // defpackage.dht
    public final void b(String str) {
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

    @Override // defpackage.dht
    public final void s_() {
    }

    public /* synthetic */ void a(View view) {
        finish();
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.request_router_user_name_password);
        ButterKnife.bind(this);
        a(getString(R.string.request_adsl_username_password), false, true);
        this.f = getIntent().getStringExtra("FMC_SELECTED_MSISDN");
        this.imgBackButton.setOnClickListener(this.a);
        this.b.a(this.f);
        this.c.a(this, getString(R.string.loading));
        this.b.a(this);
        this.d = djv.a("LANGUAGE", "");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.b.b(this);
        super.onDestroy();
    }

    @Override // defpackage.dht
    public final void a(String str, String str2) {
        this.c.a();
        this.userNameEditText.setText(str);
        this.userNameEditText.setSelected(true);
        this.userNameEditText.setEnabled(false);
        this.passwordEditText.setSelected(true);
        this.passwordEditText.setText(str2);
        this.passwordEditText.setEnabled(false);
    }

    @Override // defpackage.dht
    public final void a(String str) {
        this.c.a();
        UnNavigateResponseActivity.a(this, str, getString(R.string.please_try_again), true);
        finish();
    }
}
