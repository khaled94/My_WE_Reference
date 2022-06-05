package com.ucare.we.presentation.auth.signup;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import com.ucare.we.ErrorHandlerActivity;
import com.ucare.we.GiftActivity;
import com.ucare.we.R;
import com.ucare.we.newHome.features.HomeActivity;
import com.ucare.we.presentation.success.SuccessRegisterActivity;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class SignUpActivity extends czy implements cwi, dhk {
    private String B;
    private String C;
    private String D;
    private String E;
    ImageView b;
    TextView c;
    TextView d;
    ddi e;
    TextView f;
    TextView g;
    TextView h;
    TextView i;
    TextView j;
    ImageView k;
    ImageView l;
    ImageView m;
    ImageView n;
    ProgressBar o;
    RegistrationViewPager p;
    @Inject
    dio q;
    @Inject
    djw r;
    @Inject
    dja s;
    @Inject
    dhn t;
    @Inject
    djg u;
    @Inject
    djx y;
    diz z;
    public boolean a = false;
    boolean x = false;
    private int A = 0;

    public static /* synthetic */ void lambda$lpGsmvoOfia9UGpxl3gyvxzVH2Y(SignUpActivity signUpActivity, View view) {
        signUpActivity.a(view);
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_sign_up_new);
        p();
        this.b = (ImageView) findViewById(R.id.imgBackButton);
        this.j = (TextView) findViewById(R.id.signup_txt);
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.auth.signup.-$$Lambda$SignUpActivity$lpGsmvoOfia9UGpxl3gyvxzVH2Y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignUpActivity.lambda$lpGsmvoOfia9UGpxl3gyvxzVH2Y(SignUpActivity.this, view);
            }
        });
        this.z = new diz();
        RegistrationViewPager registrationViewPager = (RegistrationViewPager) findViewById(R.id.pager);
        this.p = registrationViewPager;
        registrationViewPager.setPagingEnabled(false);
        if (getIntent().getExtras() != null) {
            this.E = getIntent().getExtras().getString("mobile");
        }
        this.A = getIntent().getIntExtra("mode", 0);
        ddi ddiVar = new ddi(getSupportFragmentManager(), this, this.E, this.A);
        this.e = ddiVar;
        this.p.setAdapter(ddiVar);
        this.p.setCurrentItem(0);
        this.d = (TextView) findViewById(R.id.tvWelcome);
        this.f = (TextView) findViewById(R.id.tv_step1);
        this.g = (TextView) findViewById(R.id.tv_step2);
        this.h = (TextView) findViewById(R.id.tv_step3);
        this.i = (TextView) findViewById(R.id.tv_step4);
        this.c = (TextView) findViewById(R.id.llb_serviceNumber);
        this.o = (ProgressBar) findViewById(R.id.progress_bar);
        this.k = (ImageView) findViewById(R.id.back_indicator);
        this.l = (ImageView) findViewById(R.id.back_indicator2);
        this.m = (ImageView) findViewById(R.id.back_indicator3);
        this.n = (ImageView) findViewById(R.id.back_indicator4);
        if (this.A == 1) {
            this.j.setText(getString(R.string.forget_password_word));
            this.c.setText(getString(R.string.enter_mobile_number));
            this.d.setText(R.string.loginWelcomeMessage);
        }
        this.q.a((dhk) this);
        if (TextUtils.isEmpty(this.q.p)) {
            this.q.b();
        }
    }

    public /* synthetic */ void a(View view) {
        a();
    }

    @Override // defpackage.cwi
    public final void b(int i, int i2, String str) {
        if (i == 0) {
            if (TextUtils.isEmpty(this.q.p)) {
                this.a = true;
                this.q.b();
                return;
            }
            this.B = str;
            if (this.p.getCurrentItem() != 0) {
                return;
            }
            this.k.setVisibility(4);
            this.l.setVisibility(0);
            this.m.setVisibility(4);
            this.c.setVisibility(4);
            this.n.setVisibility(4);
            this.f.setBackgroundResource(R.drawable.circle_checked_step);
            this.g.setBackgroundResource(R.drawable.circle_last_checked_step);
            this.g.setTextColor(getResources().getColor(R.color.white));
            this.p.setCurrentItem(1);
            this.o.setProgress(38);
        } else if (i == 1) {
            this.D = str;
            this.k.setVisibility(4);
            this.l.setVisibility(4);
            this.m.setVisibility(0);
            this.c.setVisibility(4);
            this.n.setVisibility(4);
            this.g.setBackgroundResource(R.drawable.circle_checked_step);
            this.h.setBackgroundResource(R.drawable.circle_last_checked_step);
            this.h.setTextColor(getResources().getColor(R.color.white));
            this.p.setCurrentItem(2);
            this.o.setProgress(62);
        } else {
            String str2 = "";
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    this.p.setCurrentItem(4);
                    return;
                }
                this.u.a(this, getString(R.string.loading));
                try {
                    str2 = diz.a(this.D, this);
                } catch (Exception unused) {
                }
                int i3 = this.A;
                if (i3 == 0) {
                    this.q.a(this.B, str2);
                    return;
                } else if (i3 != 1) {
                    return;
                } else {
                    this.q.a(this.B, str2);
                    this.u.a(this, getString(R.string.sign_in));
                    return;
                }
            }
            this.C = str;
            if (i2 == 1) {
                this.q.b(this.B, this.A);
                this.u.a(this, getString(R.string.sending_confirmation));
                return;
            }
            try {
                str2 = diz.a(this.D, this);
            } catch (Exception unused2) {
            }
            this.r.d(this.B);
            this.r.f(str2);
            int i4 = this.A;
            if (i4 == 0) {
                this.q.b(this.B, str2, this.C);
                this.u.a(this, getString(R.string.signing_up));
            } else if (i4 != 1) {
            } else {
                this.q.c(this.B, str2, this.C);
                this.u.a(this, getString(R.string.reseting_password));
            }
        }
    }

    @Override // defpackage.czy, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        a();
    }

    private void a() {
        int currentItem = this.p.getCurrentItem();
        if (currentItem == 0) {
            finish();
        } else if (currentItem == 1) {
            this.p.setCurrentItem(0);
            this.o.setProgress(13);
            this.c.setVisibility(0);
            this.k.setVisibility(0);
            this.l.setVisibility(4);
            this.m.setVisibility(4);
            this.n.setVisibility(4);
            this.g.setBackgroundResource(R.drawable.circle_un_checked_step);
            this.f.setBackgroundResource(R.drawable.circle_last_checked_step);
            this.f.setTextColor(getResources().getColor(R.color.white));
            this.g.setTextColor(getResources().getColor(R.color.colorPrimary));
        } else if (currentItem == 2) {
            this.p.setCurrentItem(1);
            this.o.setProgress(38);
            this.k.setVisibility(4);
            this.c.setVisibility(4);
            this.l.setVisibility(0);
            this.m.setVisibility(4);
            this.n.setVisibility(4);
            this.h.setBackgroundResource(R.drawable.circle_un_checked_step);
            this.g.setBackgroundResource(R.drawable.circle_last_checked_step);
            this.g.setTextColor(getResources().getColor(R.color.white));
            this.h.setTextColor(getResources().getColor(R.color.colorPrimary));
        } else if (currentItem != 3) {
        } else {
            this.p.setCurrentItem(2);
            this.o.setProgress(62);
            this.k.setVisibility(4);
            this.l.setVisibility(4);
            this.c.setVisibility(4);
            this.m.setVisibility(0);
            this.n.setVisibility(4);
            this.i.setBackgroundResource(R.drawable.ic_last_step_unactive);
            this.h.setBackgroundResource(R.drawable.circle_last_checked_step);
            this.h.setTextColor(getResources().getColor(R.color.white));
            this.i.setTextColor(getResources().getColor(R.color.colorPrimary));
        }
    }

    @Override // defpackage.dhk
    public final void a(int i) {
        if (i == 0) {
            this.u.a();
            return;
        }
        boolean z = false;
        if (i != 1) {
            if (i == 3) {
                this.u.a();
                return;
            } else if (i != 4) {
                return;
            } else {
                this.h.setBackgroundResource(R.drawable.circle_checked_step);
                this.c.setVisibility(4);
                this.i.setBackgroundResource(R.drawable.circle_last_step);
                this.k.setVisibility(4);
                this.l.setVisibility(4);
                this.m.setVisibility(4);
                this.n.setVisibility(0);
                this.p.setCurrentItem(3);
                this.o.setProgress(100);
                this.u.a();
                return;
            }
        }
        this.u.a();
        if (this.A == 1) {
            if (!this.q.l()) {
                if (this.q.d()) {
                    if (!this.q.f() || !this.q.h()) {
                        if (!this.q.f() || this.q.h()) {
                            if (!this.q.g() || !this.q.h()) {
                                if (this.q.g() && !this.q.h()) {
                                    this.y.b(this, HomeActivity.class);
                                }
                            } else {
                                this.y.b(this, HomeActivity.class);
                            }
                        } else {
                            this.y.b(this, HomeActivity.class);
                        }
                    } else {
                        this.y.b(this, HomeActivity.class);
                    }
                } else if (this.q.e()) {
                    if (!this.q.f() || !this.q.h()) {
                        if (!this.q.f() || this.q.h()) {
                            if (!this.q.g() || !this.q.h()) {
                                if (this.q.g() && !this.q.h()) {
                                    this.y.b(this, HomeActivity.class);
                                }
                            } else {
                                this.y.b(this, HomeActivity.class);
                            }
                        } else {
                            this.y.b(this, HomeActivity.class);
                        }
                    } else {
                        this.y.b(this, HomeActivity.class);
                    }
                }
            } else {
                this.y.b(this, HomeActivity.class);
            }
        } else {
            if (this.t.f.isBonus_offers_enabled()) {
                this.y.b(this, GiftActivity.class);
            }
            dio dioVar = this.q;
            if (dioVar.w.b.getHeader().getMsisdn().startsWith("01") && dioVar.w.b.getBody().isBundelOfferSubscription()) {
                z = true;
            }
            if (!z) {
                if (!this.q.l()) {
                    if (this.q.d()) {
                        if (!this.q.f() || !this.q.h()) {
                            if (!this.q.f() || this.q.h()) {
                                if (!this.q.g() || !this.q.h()) {
                                    if (this.q.g() && !this.q.h()) {
                                        this.y.b(this, HomeActivity.class);
                                    }
                                } else {
                                    this.y.b(this, HomeActivity.class);
                                }
                            } else {
                                this.y.b(this, HomeActivity.class);
                            }
                        } else {
                            this.y.b(this, HomeActivity.class);
                        }
                    } else if (this.q.e()) {
                        if (!this.q.f() || !this.q.h()) {
                            if (!this.q.f() || this.q.h()) {
                                if (!this.q.g() || !this.q.h()) {
                                    if (this.q.g() && !this.q.h()) {
                                        this.y.b(this, HomeActivity.class);
                                    }
                                } else {
                                    this.y.b(this, HomeActivity.class);
                                }
                            } else {
                                this.y.b(this, HomeActivity.class);
                            }
                        } else {
                            this.y.b(this, HomeActivity.class);
                        }
                    }
                } else {
                    this.y.b(this, HomeActivity.class);
                }
            } else {
                this.y.b(this, SuccessRegisterActivity.class);
            }
        }
        finish();
    }

    @Override // defpackage.dhk
    public final void a(boolean z) {
        this.x = z;
        this.h.setBackgroundResource(R.drawable.circle_checked_step);
        this.c.setVisibility(4);
        this.i.setBackgroundResource(R.drawable.circle_last_step);
        this.k.setVisibility(4);
        this.l.setVisibility(4);
        this.m.setVisibility(4);
        this.n.setVisibility(0);
        this.p.setCurrentItem(3);
        this.o.setProgress(100);
        this.u.a();
    }

    @Override // defpackage.dhk
    public final void a(int i, int i2, String str) {
        if (i == 0) {
            this.u.a();
            if (!this.a) {
                return;
            }
            final dja djaVar = this.s;
            AlertDialog create = new AlertDialog.Builder(this).create();
            create.setTitle(R.string.error);
            create.setMessage(str);
            create.setButton(-1, getString(R.string.ok), new DialogInterface.OnClickListener() { // from class: dja.1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    dialogInterface.dismiss();
                }
            });
            create.show();
            this.a = false;
        } else if (i == 1) {
            this.u.a();
            this.y.a(this, str, i2, ErrorHandlerActivity.class);
        } else if (i == 2) {
            this.u.a();
            this.y.a(this, str, i2, ErrorHandlerActivity.class);
        } else if (i == 3) {
            this.u.a();
            this.y.a(this, str, i2, ErrorHandlerActivity.class);
        } else if (i != 4) {
        } else {
            this.u.a();
            this.y.a(this, str, i2, ErrorHandlerActivity.class);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.q.b(this);
        this.u.a();
        super.onDestroy();
    }
}
