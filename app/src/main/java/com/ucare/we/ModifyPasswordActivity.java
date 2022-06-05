package com.ucare.we;

import android.graphics.Typeface;
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
import com.ucare.we.model.UserCredentials;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class ModifyPasswordActivity extends dae implements dhk {
    CollapsingToolbarLayout a;
    AppBarLayout b;
    ImageView c;
    Button d;
    TextInputEditText e;
    TextInputEditText f;
    TextInputEditText g;
    TextInputLayout h;
    TextInputLayout i;
    TextInputLayout j;
    @Inject
    dio k;
    @Inject
    djg l;
    @Inject
    djx m;
    @Inject
    djw n;
    @Inject
    djb o;
    boolean p = false;
    diz q;
    ArrayList<UserCredentials> r;
    String s;
    String t;

    public static /* synthetic */ void lambda$FXnJpMMF1LhhKtrKVDORgpQ5P_A(ModifyPasswordActivity modifyPasswordActivity, View view, boolean z) {
        modifyPasswordActivity.b(view, z);
    }

    /* renamed from: lambda$_1zQK06g8-cK6KrEfP8q6OWIEzU */
    public static /* synthetic */ void m2lambda$_1zQK06g8cK6KrEfP8q6OWIEzU(ModifyPasswordActivity modifyPasswordActivity, View view, boolean z) {
        modifyPasswordActivity.c(view, z);
    }

    public static /* synthetic */ void lambda$cri5A5uxvSG_rLkcE8xgPbL0I_I(ModifyPasswordActivity modifyPasswordActivity, View view, boolean z) {
        modifyPasswordActivity.a(view, z);
    }

    @Override // defpackage.dhk
    public final void a(boolean z) {
    }

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_change_password);
        this.a = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        this.b = (AppBarLayout) findViewById(R.id.app_bar);
        a(getString(R.string.change_password));
        Typeface.createFromAsset(getAssets(), "quicksand_regular.ttf");
        this.q = new diz();
        this.k.a((dhk) this);
        this.e = (TextInputEditText) findViewById(R.id.et_old_password);
        this.f = (TextInputEditText) findViewById(R.id.et_new_password);
        this.g = (TextInputEditText) findViewById(R.id.et_new_password_confirmation);
        this.e.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.ucare.we.-$$Lambda$ModifyPasswordActivity$_1zQK06g8-cK6KrEfP8q6OWIEzU
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                ModifyPasswordActivity.m2lambda$_1zQK06g8cK6KrEfP8q6OWIEzU(ModifyPasswordActivity.this, view, z);
            }
        });
        this.f.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.ucare.we.-$$Lambda$ModifyPasswordActivity$FXnJpMMF1LhhKtrKVDORgpQ5P_A
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                ModifyPasswordActivity.lambda$FXnJpMMF1LhhKtrKVDORgpQ5P_A(ModifyPasswordActivity.this, view, z);
            }
        });
        this.g.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.ucare.we.-$$Lambda$ModifyPasswordActivity$cri5A5uxvSG_rLkcE8xgPbL0I_I
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                ModifyPasswordActivity.lambda$cri5A5uxvSG_rLkcE8xgPbL0I_I(ModifyPasswordActivity.this, view, z);
            }
        });
        this.h = (TextInputLayout) findViewById(R.id.old_password_input_layout);
        this.i = (TextInputLayout) findViewById(R.id.new_password_input_layout);
        this.d = (Button) findViewById(R.id.btn_update_password);
        this.j = (TextInputLayout) findViewById(R.id.confirm_new_password_input_layout);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.ModifyPasswordActivity.1
            {
                ModifyPasswordActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ModifyPasswordActivity.this.p = true;
                if (!ModifyPasswordActivity.a(ModifyPasswordActivity.this)) {
                    return;
                }
                try {
                    ModifyPasswordActivity.this.s = diz.a(ModifyPasswordActivity.this.e.getText().toString(), ModifyPasswordActivity.this);
                    ModifyPasswordActivity.this.t = diz.a(ModifyPasswordActivity.this.f.getText().toString(), ModifyPasswordActivity.this);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                ModifyPasswordActivity.this.k.b(ModifyPasswordActivity.this.s, ModifyPasswordActivity.this.t);
                djg djgVar = ModifyPasswordActivity.this.l;
                ModifyPasswordActivity modifyPasswordActivity = ModifyPasswordActivity.this;
                djgVar.a(modifyPasswordActivity, modifyPasswordActivity.getString(R.string.loading));
            }
        });
        this.c = (ImageView) findViewById(R.id.iv_close);
        AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) this.a.getLayoutParams();
        layoutParams.setScrollFlags(0);
        this.a.setLayoutParams(layoutParams);
        CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) this.b.getLayoutParams();
        layoutParams2.setBehavior(null);
        this.b.setLayoutParams(layoutParams2);
    }

    public /* synthetic */ void c(View view, boolean z) {
        if (!z) {
            a();
            return;
        }
        this.h.setError(null);
        c(this.e);
    }

    public /* synthetic */ void b(View view, boolean z) {
        if (!z) {
            b();
            return;
        }
        this.i.setError(null);
        c(this.f);
    }

    public /* synthetic */ void a(View view, boolean z) {
        if (!z) {
            c();
            return;
        }
        this.j.setError(null);
        c(this.g);
    }

    private boolean a() {
        if (TextUtils.isEmpty(this.e.getText().toString())) {
            this.h.setError(getResources().getString(R.string.no_password_old));
            a(this.e);
            return false;
        }
        b(this.e);
        this.h.setError(null);
        this.h.setErrorEnabled(false);
        return true;
    }

    private boolean b() {
        if (TextUtils.isEmpty(this.f.getText().toString())) {
            this.i.setError(getResources().getString(R.string.password_at_least_on_character));
            a(this.f);
            return false;
        }
        b(this.f);
        this.i.setError(null);
        this.i.setErrorEnabled(false);
        if (this.f.getText().toString().length() < 8) {
            this.i.setError(getResources().getString(R.string.password_at_least_on_character));
            a(this.f);
            return false;
        }
        b(this.f);
        this.i.setError(null);
        this.i.setErrorEnabled(false);
        if (!b(this.f.getText().toString().trim())) {
            this.i.setError(getResources().getString(R.string.password_at_least_on_character));
            a(this.f);
            return false;
        }
        b(this.f);
        this.i.setError(null);
        this.i.setErrorEnabled(false);
        if (this.f.getText().toString().length() < 8) {
            this.i.setError(getResources().getString(R.string.password_at_least_on_character));
            a(this.f);
            return false;
        }
        b(this.f);
        this.i.setError(null);
        this.i.setErrorEnabled(false);
        return true;
    }

    private boolean c() {
        if (TextUtils.isEmpty(this.g.getText().toString())) {
            this.j.setError(getResources().getString(R.string.new_should_equale_old));
            a(this.g);
            return false;
        }
        b(this.g);
        this.j.setError(null);
        this.j.setErrorEnabled(false);
        if (!this.f.getText().toString().equals(this.g.getText().toString())) {
            this.j.setError(getResources().getString(R.string.new_should_equale_old));
            a(this.g);
            return false;
        }
        if (this.f.getText().toString().equals(this.g.getText().toString())) {
            b(this.g);
            this.j.setError(null);
            this.j.setErrorEnabled(false);
        }
        if (this.g.getText().toString().length() < 8) {
            this.j.setError(getResources().getString(R.string.password_at_least_on_character));
            a(this.g);
            return false;
        }
        b(this.g);
        this.j.setError(null);
        this.j.setErrorEnabled(false);
        if (!b(this.g.getText().toString().trim())) {
            this.j.setError(getResources().getString(R.string.password_at_least_on_character));
            a(this.g);
            return false;
        }
        b(this.g);
        this.j.setError(null);
        this.j.setErrorEnabled(false);
        return true;
    }

    private static boolean b(String str) {
        return Pattern.compile("((?=.*\\d)(?=.*[\\u0621-\\u064A\\u0660-\\u0669 ]+$).{8,20})").matcher(str).matches() || Pattern.compile("((?=.*\\d)(?=.*[a-zA-Z]).{8,20})").matcher(str).matches();
    }

    @Override // defpackage.dhk
    public final void a(int i) {
        this.l.a();
        if (i != 5) {
            return;
        }
        if (this.n.A() == null) {
            this.r = new ArrayList<>();
        } else {
            this.r = new ArrayList<>(this.n.A());
        }
        for (int i2 = 0; i2 < this.r.size(); i2++) {
            if (this.n.m().equalsIgnoreCase(this.r.get(i2).getMobileNumber())) {
                this.r.get(i2).setPassWord(this.t);
            }
        }
        if (this.n.m().equalsIgnoreCase(this.n.r())) {
            this.n.j(this.t);
        }
        this.n.f(this.t);
        this.n.a(this.r);
        djx.b(this, getString(R.string.password_changed_successfully), SuccessHandlerActivity.class, "");
        finish();
    }

    @Override // defpackage.dhk
    public final void a(int i, int i2, String str) {
        this.l.a();
        this.m.a(this, str, i2, ErrorHandlerActivity.class);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.k.b(this);
        super.onDestroy();
    }

    private void a(TextInputEditText textInputEditText) {
        textInputEditText.setBackgroundDrawable(getResources().getDrawable(R.drawable.text_input_white_background_error));
        textInputEditText.setHintTextColor(getResources().getColor(R.color.color_grey_new));
    }

    private void b(TextInputEditText textInputEditText) {
        textInputEditText.setBackgroundDrawable(getResources().getDrawable(R.drawable.text_input_white_background_success));
        textInputEditText.setHintTextColor(getResources().getColor(R.color.color_grey_new));
    }

    private void c(TextInputEditText textInputEditText) {
        textInputEditText.setBackgroundDrawable(getResources().getDrawable(R.drawable.text_input_white_background_focused));
        textInputEditText.setHintTextColor(getResources().getColor(R.color.color_grey_new));
    }

    static /* synthetic */ boolean a(ModifyPasswordActivity modifyPasswordActivity) {
        return modifyPasswordActivity.a() && modifyPasswordActivity.b() && modifyPasswordActivity.c();
    }
}
