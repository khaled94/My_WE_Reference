package com.ucare.we.addaccount;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ucare.we.ErrorHandlerActivity;
import com.ucare.we.R;
import com.ucare.we.SuccessHandlerActivity;
import com.ucare.we.model.LoginInfo;
import com.ucare.we.model.UserCredentials;
import com.ucare.we.switchaccount.ChooseAccountActivity;
import java.util.ArrayList;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class AddAccountActivity extends dae implements dhv, dim {
    Button a;
    ImageView b;
    TextInputEditText c;
    TextInputEditText d;
    TextInputLayout e;
    TextInputLayout f;
    @Inject
    djx g;
    @Inject
    djw h;
    ArrayList<UserCredentials> i;
    UserCredentials j;
    @Inject
    dhw k;
    @Inject
    din l;
    @Inject
    djg m;
    @Inject
    djb n;
    @Inject
    djx o;
    diz p;
    String q = "";
    CollapsingToolbarLayout r;
    AppBarLayout s;

    /* renamed from: lambda$9YAnmoDw-WOOuUzBluQHz2S6BDk */
    public static /* synthetic */ void m12lambda$9YAnmoDwWOOuUzBluQHz2S6BDk(AddAccountActivity addAccountActivity, View view) {
        addAccountActivity.b(view);
    }

    public static /* synthetic */ void lambda$SSd2Pq1m78oxLRPZlX6NeszgZz0(AddAccountActivity addAccountActivity, View view) {
        addAccountActivity.a(view);
    }

    public static /* synthetic */ void lambda$TGvQIPGPHPV4FYEJ95t9X_61qco(AddAccountActivity addAccountActivity, View view, boolean z) {
        addAccountActivity.b(view, z);
    }

    /* renamed from: lambda$VPSVqBeZJ0S26AM4xLIMvC-Y_40 */
    public static /* synthetic */ void m13lambda$VPSVqBeZJ0S26AM4xLIMvCY_40(AddAccountActivity addAccountActivity, View view, boolean z) {
        addAccountActivity.a(view, z);
    }

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_add_account);
        this.r = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        this.s = (AppBarLayout) findViewById(R.id.app_bar);
        a(getString(R.string.add_new_account));
        this.a = (Button) findViewById(R.id.btn_add_account);
        this.c = (TextInputEditText) findViewById(R.id.et_mobile);
        this.e = (TextInputLayout) findViewById(R.id.mobile_number_input_layout);
        this.d = (TextInputEditText) findViewById(R.id.et_password);
        this.f = (TextInputLayout) findViewById(R.id.password_input_layout);
        this.k.a(this);
        this.p = new diz();
        this.l.a(this);
        this.c.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.ucare.we.addaccount.-$$Lambda$AddAccountActivity$TGvQIPGPHPV4FYEJ95t9X_61qco
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                AddAccountActivity.lambda$TGvQIPGPHPV4FYEJ95t9X_61qco(AddAccountActivity.this, view, z);
            }
        });
        this.d.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.ucare.we.addaccount.-$$Lambda$AddAccountActivity$VPSVqBeZJ0S26AM4xLIMvC-Y_40
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                AddAccountActivity.m13lambda$VPSVqBeZJ0S26AM4xLIMvCY_40(AddAccountActivity.this, view, z);
            }
        });
        this.a.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.addaccount.-$$Lambda$AddAccountActivity$9YAnmoDw-WOOuUzBluQHz2S6BDk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddAccountActivity.m12lambda$9YAnmoDwWOOuUzBluQHz2S6BDk(AddAccountActivity.this, view);
            }
        });
        ImageView imageView = (ImageView) findViewById(R.id.imgBackButton);
        this.b = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.addaccount.-$$Lambda$AddAccountActivity$SSd2Pq1m78oxLRPZlX6NeszgZz0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddAccountActivity.lambda$SSd2Pq1m78oxLRPZlX6NeszgZz0(AddAccountActivity.this, view);
            }
        });
        AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) this.r.getLayoutParams();
        layoutParams.setScrollFlags(0);
        this.r.setLayoutParams(layoutParams);
        CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) this.s.getLayoutParams();
        layoutParams2.setBehavior(null);
        this.s.setLayoutParams(layoutParams2);
    }

    public /* synthetic */ void b(View view, boolean z) {
        if (!z) {
            a();
            return;
        }
        this.e.setErrorEnabled(false);
        this.e.setError(null);
        b(this.c);
    }

    public /* synthetic */ void a(View view, boolean z) {
        if (!z) {
            b();
            return;
        }
        this.f.setErrorEnabled(false);
        this.f.setError(null);
        b(this.d);
    }

    public /* synthetic */ void a(View view) {
        finish();
    }

    private boolean a() {
        ArrayList arrayList;
        boolean z;
        if (TextUtils.isEmpty(this.c.getText().toString())) {
            this.e.setError(getResources().getString(R.string.no_mobile_number));
            a(this.c);
            return false;
        } else if (!this.c.getText().toString().startsWith("027") && this.c.getText().toString().length() < getResources().getInteger(R.integer.mobile_number)) {
            this.e.setError(getResources().getString(R.string.mobile_should_be_at_least));
            a(this.c);
            return false;
        } else if (!this.c.getText().toString().substring(0, 1).equalsIgnoreCase("0") && !this.c.getText().toString().substring(0, 1).equalsIgnoreCase("٠")) {
            this.e.setError(getResources().getString(R.string.add_account_number_validation));
            a(this.c);
            return false;
        } else {
            String obj = this.c.getText().toString();
            if (this.h.A() == null) {
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList(this.h.A());
            }
            int i = 0;
            while (true) {
                if (i >= arrayList.size()) {
                    z = false;
                    break;
                } else if (((UserCredentials) arrayList.get(i)).getMobileNumber().equalsIgnoreCase(obj)) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                this.e.setError(getString(R.string.account_already_exist));
                a(this.c);
                return false;
            }
            c(this.c);
            this.e.setError(null);
            this.e.setErrorEnabled(false);
            return true;
        }
    }

    private boolean b() {
        if (TextUtils.isEmpty(this.d.getText().toString())) {
            this.f.setError(getResources().getString(R.string.no_password));
            a(this.d);
            return false;
        } else if (this.d.getText().toString().length() < 8) {
            this.f.setError(getResources().getString(R.string.password_length));
            a(this.d);
            return false;
        } else {
            c(this.d);
            this.f.setError(null);
            this.f.setErrorEnabled(false);
            return true;
        }
    }

    @Override // defpackage.dhv
    public final void a(LoginInfo loginInfo) {
        this.m.a();
        if (this.h.A() == null) {
            this.i = new ArrayList<>();
        } else {
            this.i = new ArrayList<>(this.h.A());
        }
        UserCredentials userCredentials = new UserCredentials();
        this.j = userCredentials;
        userCredentials.setMobileNumber(this.c.getText().toString());
        this.j.setPassWord(this.q);
        this.j.setCustomerName(loginInfo.getCustomerName());
        this.i.add(this.j);
        this.h.a(this.i);
        Intent intent = new Intent(this, ChooseAccountActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("numberList", new ArrayList<>(this.h.A()));
        intent.putExtras(bundle);
        setResult(-1, intent);
        finish();
        djx.b(this, getString(R.string.account_added_successfully), SuccessHandlerActivity.class, getString(R.string.successful));
    }

    @Override // defpackage.dhv
    public final void a(int i, String str) {
        this.m.a();
        this.o.a(this, str, i, ErrorHandlerActivity.class);
    }

    @Override // defpackage.dim
    public final void a(String str, String str2) {
        this.m.a();
        if (str.equalsIgnoreCase("")) {
            this.o.a(this, getString(R.string.check_network_connection), 0, ErrorHandlerActivity.class);
        } else {
            this.o.a(this, str2, 0, ErrorHandlerActivity.class);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.k.b(this);
        this.l.b(this);
        super.onDestroy();
    }

    private void a(TextInputEditText textInputEditText) {
        textInputEditText.setBackgroundDrawable(getDrawable(R.drawable.text_input_white_background_error));
        textInputEditText.setHintTextColor(getResources().getColor(R.color.color_grey_new));
    }

    private void b(TextInputEditText textInputEditText) {
        textInputEditText.setBackgroundDrawable(getDrawable(R.drawable.text_input_white_background_focused));
        textInputEditText.setHintTextColor(getResources().getColor(R.color.color_grey_new));
    }

    private void c(TextInputEditText textInputEditText) {
        textInputEditText.setBackgroundDrawable(getDrawable(R.drawable.text_input_white_background_success));
        textInputEditText.setHintTextColor(getResources().getColor(R.color.color_grey_new));
    }

    @Override // defpackage.dim
    public final void c() {
        String obj = this.c.getText().toString();
        try {
            this.q = diz.a(this.d.getText().toString(), this);
        } catch (Exception unused) {
        }
        this.k.a(obj, this.q);
    }

    public /* synthetic */ void b(View view) {
        if (!(a() && b())) {
            return;
        }
        this.m.a(this, getString(R.string.checking_credentials));
        this.h.j();
        this.l.a(this.c.getText().toString());
    }
}
