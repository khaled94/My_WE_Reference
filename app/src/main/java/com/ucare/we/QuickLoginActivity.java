package com.ucare.we;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import com.google.gson.Gson;
import com.ucare.we.model.SignInModel.SignInResponse;
import com.ucare.we.newHome.features.AnonymousNewHomeActivity;
import com.ucare.we.newHome.features.HomeActivity;
import com.ucare.we.presentation.auth.signin.SignInActivity;
import com.ucare.we.presentation.auth.signup.SignUpActivity;
import com.ucare.we.presentation.prepaid.MainActivity;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class QuickLoginActivity extends czy implements View.OnClickListener, cwh, ddh, dhk, dip {
    @Inject
    djx a;
    @Inject
    dio b;
    @Inject
    dhn c;
    @Inject
    dgc d;
    @Inject
    djx e;
    @Inject
    djb f;
    @Inject
    djg g;
    @Inject
    djw h;
    NetworkReciever i;
    Button k;
    Button l;
    Button m;
    Button n;
    Button o;
    Button p;
    String j = "";
    View.OnClickListener q = new View.OnClickListener() { // from class: com.ucare.we.-$$Lambda$QuickLoginActivity$k44XuAfBmseL5KLzIcQ7fd8ljFs
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            QuickLoginActivity.lambda$k44XuAfBmseL5KLzIcQ7fd8ljFs(QuickLoginActivity.this, view);
        }
    };
    View.OnClickListener r = new View.OnClickListener() { // from class: com.ucare.we.QuickLoginActivity.1
        {
            QuickLoginActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            QuickLoginActivity.this.f.b();
            QuickLoginActivity.this.getApplication();
            djb.a(App.b, QuickLoginActivity.this.h.b("en"));
            QuickLoginActivity.this.finish();
            QuickLoginActivity.this.e.b(QuickLoginActivity.this, QuickLoginActivity.class);
        }
    };

    public static /* synthetic */ void lambda$k44XuAfBmseL5KLzIcQ7fd8ljFs(QuickLoginActivity quickLoginActivity, View view) {
        quickLoginActivity.a(view);
    }

    @Override // defpackage.ddh
    public final void a() {
    }

    @Override // defpackage.dhk
    public final void a(int i, int i2, String str) {
    }

    @Override // defpackage.dhk
    public final void a(boolean z) {
    }

    public /* synthetic */ void a(View view) {
        startActivity(new Intent(this, PayBillActivity.class));
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_welcome_screen);
        p();
        this.k = (Button) findViewById(R.id.btn_quick_login);
        this.l = (Button) findViewById(R.id.btn_sign_in);
        this.m = (Button) findViewById(R.id.btn_auto_login);
        this.o = (Button) findViewById(R.id.discover_we);
        this.p = (Button) findViewById(R.id.imgPayBill);
        this.n = (Button) findViewById(R.id.btn_change_language);
        this.k.setOnClickListener(this);
        this.l.setOnClickListener(this);
        this.m.setOnClickListener(this);
        this.o.setOnClickListener(this);
        this.p.setOnClickListener(this.q);
        this.n.setOnClickListener(this.r);
        this.i = new NetworkReciever(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_sign_in) {
            this.a.b(this, SignInActivity.class);
        } else if (id == R.id.btn_quick_login) {
            this.a.b(this, SignUpActivity.class);
        } else if (id == R.id.discover_we) {
            this.h.k(true);
            this.a.b(this, AnonymousNewHomeActivity.class);
            finish();
        } else if (id != R.id.btn_auto_login) {
        } else {
            try {
                String string = Settings.Secure.getString(getContentResolver(), "android_id");
                this.j = string;
                string.replaceAll("\n", "");
                String a = djh.a(this.j);
                if (TextUtils.isEmpty(this.b.p)) {
                    this.b.b();
                    return;
                }
                dio dioVar = this.b;
                String autologinInitUrl = this.c.f.getAutologinInitUrl();
                String str = this.j;
                dioVar.a = a;
                dioVar.b = str;
                dioVar.e.i("");
                dioVar.e.k("PREPAID");
                dioVar.e.d("");
                dioVar.e.l("PREPAID");
                dioVar.e.n("");
                dioVar.e.o("");
                dioVar.a(autologinInitUrl, "", a);
            } catch (UnsupportedEncodingException e) {
                e.getMessage();
                e.printStackTrace();
            } catch (InvalidKeyException e2) {
                e2.getMessage();
                e2.printStackTrace();
            } catch (NoSuchAlgorithmException e3) {
                e3.getMessage();
                e3.printStackTrace();
            } catch (BadPaddingException e4) {
                e4.getMessage();
                e4.printStackTrace();
            } catch (IllegalBlockSizeException e5) {
                e5.getMessage();
                e5.printStackTrace();
            } catch (NoSuchPaddingException e6) {
                e6.getMessage();
                e6.printStackTrace();
            }
        }
    }

    @Override // defpackage.czy, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.b.b(this);
        MainActivity.a = null;
        finish();
    }

    @Override // defpackage.ddh
    public final void b(boolean z) {
        if (z) {
            this.g.a(this, getString(R.string.loading));
        } else {
            this.g.a();
        }
    }

    @Override // defpackage.ddh
    public final void a(SignInResponse signInResponse) {
        b(true);
        if (this.h.k().equals("")) {
            this.h.c("en");
        }
        this.h.i(signInResponse.getHeader().getMsisdn());
        this.h.k("PREPAID");
        this.h.d(signInResponse.getHeader().getMsisdn());
        this.h.l("PREPAID");
        this.h.n(signInResponse.getHeader().getMsisdn());
        this.h.o(signInResponse.getHeader().getMsisdn());
        this.b.a(signInResponse);
        this.h.u(signInResponse.getBody().getJwt());
        this.h.w(signInResponse.getBody().getGroupFmc().getId());
        this.h.r(signInResponse.getBody().getUserProperties().getRegistered().booleanValue());
        this.h.o(signInResponse.getBody().getGroupFmc().isSubscribed());
        this.h.x(new Gson().a(signInResponse.getBody().getGroupFamily()));
        this.h.p(signInResponse.getBody().isIptv());
        this.h.b(signInResponse.getBody().getAssociatedLines());
        this.h.k(false);
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        NetworkReciever networkReciever = this.i;
        if (networkReciever != null) {
            unregisterReceiver(networkReciever);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.b.h = this;
        registerReceiver(this.i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // defpackage.cwh
    public final void a(boolean z, String str) {
        StringBuilder sb = new StringBuilder("Status: ");
        sb.append(z);
        sb.append(" ");
        sb.append(str);
        if (!z) {
            this.m.setVisibility(8);
        } else if ((this.c.f.getFeatureAutoLogin() == null || !this.c.f.getFeatureAutoLogin().equalsIgnoreCase("true")) && !this.c.f.getFeatureAutoLogin().isEmpty()) {
            this.m.setVisibility(8);
        } else if (str.equals("Wifi")) {
            this.m.setVisibility(0);
            this.m.setAlpha(0.5f);
            this.m.setEnabled(false);
        } else if (!str.equals("mobile data")) {
            this.m.setVisibility(8);
        } else {
            this.m.setVisibility(0);
            this.m.setAlpha(1.0f);
            this.m.setEnabled(true);
        }
    }

    @Override // defpackage.dip
    public final void a(String str) {
        ErrorHandlerActivity.a(this, str, 0);
    }

    @Override // defpackage.dhk
    public final void a(int i) {
        if (i != 1) {
            if (i != 10) {
                return;
            }
            this.b.c();
            return;
        }
        if (this.c.f == null) {
            this.c.a();
            this.d.b();
        }
        if (!this.b.l()) {
            if (this.b.d()) {
                if (!this.b.f() || !this.b.h()) {
                    if (!this.b.f() || this.b.h()) {
                        if (!this.b.g() || !this.b.h()) {
                            if (!this.b.g() || this.b.h()) {
                                return;
                            }
                            this.a.b(this, HomeActivity.class);
                            setResult(-1);
                            finish();
                            return;
                        }
                        this.a.b(this, HomeActivity.class);
                        setResult(-1);
                        finish();
                        return;
                    }
                    this.a.b(this, HomeActivity.class);
                    setResult(-1);
                    finish();
                    return;
                }
                this.a.b(this, HomeActivity.class);
                setResult(-1);
                finish();
                return;
            } else if (!this.b.e()) {
                return;
            } else {
                if (!this.b.f() || !this.b.h()) {
                    if (!this.b.f() || this.b.h()) {
                        if (!this.b.g() || !this.b.h()) {
                            if (!this.b.g() || this.b.h()) {
                                return;
                            }
                            this.a.b(this, HomeActivity.class);
                            setResult(-1);
                            finish();
                            return;
                        }
                        this.a.b(this, HomeActivity.class);
                        setResult(-1);
                        finish();
                        return;
                    }
                    this.a.b(this, HomeActivity.class);
                    setResult(-1);
                    finish();
                    return;
                }
                this.a.b(this, HomeActivity.class);
                setResult(-1);
                finish();
                return;
            }
        }
        this.a.b(this, HomeActivity.class);
        setResult(-1);
        finish();
    }
}
