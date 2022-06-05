package com.ucare.we.presentation.switchaccount;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.gson.Gson;
import com.ucare.we.ErrorHandlerActivity;
import com.ucare.we.R;
import com.ucare.we.addaccount.AddAccountActivity;
import com.ucare.we.model.SignInModel.SignInResponse;
import com.ucare.we.model.UserCredentials;
import defpackage.dis;
import java.util.ArrayList;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class SwitchAccountPostPaidActivity extends czy implements ddh, dhk, dis.b {
    @Inject
    dio a;
    @Inject
    djw b;
    @Inject
    djg c;
    @Inject
    djx d;
    @Inject
    dil e;
    ddg f;
    ArrayList<UserCredentials> g;
    ArrayList<UserCredentials> h;
    TextView i;
    View.OnClickListener j = new View.OnClickListener() { // from class: com.ucare.we.presentation.switchaccount.SwitchAccountPostPaidActivity.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SwitchAccountPostPaidActivity.this.finish();
        }
    };
    View.OnClickListener k = new View.OnClickListener() { // from class: com.ucare.we.presentation.switchaccount.SwitchAccountPostPaidActivity.2
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("SwitchAccountBottomSheet", SwitchAccountPostPaidActivity.this.g);
            SwitchAccountPostPaidActivity.this.l.setArguments(bundle);
            if (SwitchAccountPostPaidActivity.this.l.isAdded() || SwitchAccountPostPaidActivity.this.l.isVisible()) {
                return;
            }
            SwitchAccountPostPaidActivity.this.l.show(SwitchAccountPostPaidActivity.this.getSupportFragmentManager(), "SwitchAccountBottomSheet");
        }
    };
    private dis l;
    private String m;
    private String n;
    private ImageView o;
    private TextView p;
    private TextView q;

    @Override // defpackage.ddh
    public final void a() {
    }

    @Override // defpackage.dhk
    public final void a(boolean z) {
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.my_numbers_activity);
        a(getString(R.string.manage_your_numbers), true, false);
        this.i = (TextView) findViewById(R.id.txtTitle);
        this.o = (ImageView) findViewById(R.id.imgBackButton);
        this.p = (TextView) findViewById(R.id.tv_number);
        this.q = (TextView) findViewById(R.id.tv_switch);
        this.o.setOnClickListener(this.j);
        this.q.setOnClickListener(this.k);
        this.p.setText(this.b.m());
        this.i.setText(getString(R.string.manage_your_numbers));
        getSupportFragmentManager().beginTransaction().replace(R.id.lnrLayoutContainer, dhe.a()).commit();
        this.l = new dis(this.b);
        if (this.b.A() == null) {
            ArrayList<UserCredentials> arrayList = new ArrayList<>();
            this.g = arrayList;
            a(arrayList);
        } else {
            this.g = new ArrayList<>(this.b.A());
        }
        this.h = new ArrayList<>(this.g);
        for (int i = 0; i < this.h.size(); i++) {
            if (this.b.m().equalsIgnoreCase(this.g.get(i).getMobileNumber())) {
                this.h.remove(i);
            }
        }
        if (this.h.size() != 0) {
            a(this.h);
        }
    }

    private void a(ArrayList<UserCredentials> arrayList) {
        this.g.clear();
        this.g.addAll(arrayList);
        this.g.add(0, new UserCredentials(this.b.m(), this.b.n(), this.b.u()));
        this.b.a(this.g);
    }

    private void b(ArrayList<UserCredentials> arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (!this.b.m().equalsIgnoreCase(arrayList.get(i2).getMobileNumber())) {
                i++;
            }
        }
        if (i == arrayList.size() && arrayList.size() < 5) {
            arrayList.add(0, new UserCredentials(this.b.m(), this.b.n(), this.b.u()));
        }
        this.b.a(arrayList);
    }

    @Override // defpackage.dis.b
    public final void b() {
        this.l.dismiss();
        if (this.b.A() == null) {
            startActivityForResult(new Intent(this, AddAccountActivity.class), 101);
        } else if (this.b.A().size() < 5) {
            startActivityForResult(new Intent(this, AddAccountActivity.class), 101);
        } else {
            Toast.makeText(this, getString(R.string.only_four_accounts), 1).show();
        }
    }

    @Override // defpackage.dis.b
    public final void b_(UserCredentials userCredentials) {
        this.l.dismiss();
        this.m = userCredentials.getMobileNumber();
        this.n = userCredentials.getPassWord();
        if (userCredentials.getMobileNumber().equalsIgnoreCase(this.b.m())) {
            Toast.makeText(this, getString(R.string.canot_switch_to_same_account), 1).show();
        } else if (TextUtils.isEmpty(this.n)) {
            this.b.f("");
            if (!TextUtils.isEmpty(this.b.E())) {
                this.f.a(this.b.E(), "FACEBOOK");
            } else if (TextUtils.isEmpty(this.b.G())) {
            } else {
                this.f.a(this.b.G(), "GOOGLE");
            }
        } else {
            this.a.a(userCredentials.getMobileNumber(), userCredentials.getPassWord(), false);
            this.c.a(this, getString(R.string.loading));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        this.a.a((dhk) this);
        super.onResume();
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        this.a.b(this);
        super.onPause();
    }

    @Override // defpackage.ddh
    public final void b(boolean z) {
        if (z) {
            this.c.a(this, getString(R.string.loading));
        } else {
            this.c.a();
        }
    }

    @Override // defpackage.ddh
    public final void a(SignInResponse signInResponse) {
        b(true);
        if (this.b.k().equals("")) {
            this.b.c("en");
        }
        this.b.i(signInResponse.getHeader().getMsisdn());
        this.b.k("PREPAID");
        this.b.d(signInResponse.getHeader().getMsisdn());
        this.b.l("PREPAID");
        this.b.n(signInResponse.getHeader().getMsisdn());
        this.b.o(signInResponse.getHeader().getMsisdn());
        this.a.a(signInResponse);
        djv.b("jwt", signInResponse.getBody().getJwt());
        this.b.u(signInResponse.getBody().getJwt());
        djv.b("customerId", signInResponse.getHeader().getCustomerId());
        this.b.w(signInResponse.getBody().getGroupFmc().getId());
        this.b.r(signInResponse.getBody().getUserProperties().getRegistered().booleanValue());
        this.b.o(signInResponse.getBody().getGroupFmc().isSubscribed());
        this.b.x(new Gson().a(signInResponse.getBody().getGroupFamily()));
        this.b.p(signInResponse.getBody().isIptv());
        this.b.b(signInResponse.getBody().getAssociatedLines());
        this.b.k(false);
    }

    @Override // defpackage.dhk
    public final void a(int i) {
        if (i != 1) {
            return;
        }
        this.c.a();
        this.e.a();
        finish();
    }

    @Override // defpackage.dhk
    public final void a(int i, int i2, String str) {
        this.c.a();
        this.d.a(this, str, i2, ErrorHandlerActivity.class);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 101 && i2 == -1) {
            ArrayList<UserCredentials> arrayList = new ArrayList<>(intent.getParcelableArrayListExtra("numberList"));
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (this.b.m().equalsIgnoreCase(arrayList.get(i3).getMobileNumber())) {
                    arrayList.remove(i3);
                }
            }
            if (arrayList.size() == 0) {
                return;
            }
            a(arrayList);
        }
    }

    @Override // defpackage.dis.b
    public final void b(UserCredentials userCredentials) {
        this.l.dismiss();
        this.g.remove(userCredentials);
        this.b.a(this.g);
        ArrayList<UserCredentials> arrayList = new ArrayList<>(this.b.A());
        this.g = arrayList;
        b(arrayList);
        ArrayList<UserCredentials> arrayList2 = new ArrayList<>(this.g);
        for (int i = 0; i < arrayList2.size(); i++) {
            if (this.b.m().equalsIgnoreCase(this.g.get(i).getMobileNumber())) {
                arrayList2.remove(i);
            }
        }
        if (arrayList2.size() != 0) {
            a(arrayList2);
        }
    }
}
