package com.ucare.we.switchaccount;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.ucare.we.ErrorHandlerActivity;
import com.ucare.we.R;
import com.ucare.we.addaccount.AddAccountActivity;
import com.ucare.we.model.AssociatedNumberResponseBody;
import com.ucare.we.model.MainPlanResponseBody;
import com.ucare.we.model.ProfileInfoResponseBody;
import com.ucare.we.model.SignInModel.SignInResponse;
import com.ucare.we.model.UserCredentials;
import com.ucare.we.model.extras.ExtrasList;
import com.ucare.we.model.special.SpecialList;
import com.ucare.we.model.usagedetails.SummarizedLineUsageItem;
import defpackage.cwz;
import defpackage.dis;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class ChooseAccountActivity extends czy implements View.OnClickListener, cwz.a, ddh, dhk, dht, die, dis.b, dju {
    ImageView a;
    Button b;
    FrameLayout c;
    Button d;
    @Inject
    djw e;
    RecyclerView f;
    @Inject
    djx g;
    @Inject
    dio h;
    @Inject
    dhu i;
    @Inject
    dil j;
    @Inject
    djg k;
    ArrayList<UserCredentials> l;
    ArrayList<UserCredentials> m;
    TextView n;
    TextView o;
    ddg p;
    private final String q = "IS_PICKING";
    private String r;
    private String s;
    private cwz t;
    private dis u;

    @Override // defpackage.ddh
    public final void a() {
    }

    @Override // defpackage.dht
    public final void a(float f) {
    }

    @Override // defpackage.dht
    public final void a(int i, String str) {
    }

    @Override // defpackage.die
    public final void a(ProfileInfoResponseBody profileInfoResponseBody) {
    }

    @Override // defpackage.dht
    public final void a(cyq cyqVar) {
    }

    @Override // defpackage.dht
    public final void a(String str) {
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
    }

    @Override // defpackage.dht
    public final void a(String str, String str2) {
    }

    @Override // defpackage.dht
    public final void a(ArrayList<ExtrasList> arrayList) {
    }

    @Override // defpackage.dht
    public final void a(List<SummarizedLineUsageItem> list) {
    }

    @Override // defpackage.dhk
    public final void a(boolean z) {
    }

    @Override // defpackage.dht
    public final void a_(int i) {
    }

    @Override // defpackage.dht
    public final void a_(String str) {
    }

    @Override // defpackage.dju
    public final void b(int i) {
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

    @Override // defpackage.die
    public final void e(int i, String str) {
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

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_choose_account);
        a(getString(R.string.choose_from_accounts), false, false);
        this.a = (ImageView) findViewById(R.id.iv_close);
        this.u = new dis(this.e);
        boolean booleanExtra = getIntent().getBooleanExtra("IS_PICKING", false);
        this.h.a((dhk) this);
        Button button = (Button) findViewById(R.id.btn_current_number);
        this.b = button;
        button.setText(this.e.m());
        this.n = (TextView) findViewById(R.id.tv_no_accounts);
        this.o = (TextView) findViewById(R.id.tv_here_is_numbers);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.fl_add_account);
        this.c = frameLayout;
        frameLayout.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.btn_add_account);
        this.d = button2;
        button2.setOnClickListener(this);
        this.p = new ddg(this, this);
        this.f = (RecyclerView) findViewById(R.id.rv_my_numbers);
        this.f.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.f.setHasFixedSize(true);
        cwz cwzVar = new cwz(this, booleanExtra);
        this.t = cwzVar;
        this.f.setAdapter(cwzVar);
        if (this.e.A() == null) {
            ArrayList<UserCredentials> arrayList = new ArrayList<>();
            this.l = arrayList;
            c(arrayList);
        } else {
            this.l = new ArrayList<>(this.e.A());
        }
        d(this.l);
        this.m = new ArrayList<>(this.l);
        for (int i = 0; i < this.m.size(); i++) {
            if (this.e.m().equalsIgnoreCase(this.l.get(i).getMobileNumber())) {
                this.m.remove(i);
            }
        }
        if (this.m.size() == 0) {
            this.n.setVisibility(0);
            this.f.setVisibility(8);
            this.o.setVisibility(8);
            return;
        }
        this.n.setVisibility(8);
        this.f.setVisibility(0);
        this.o.setVisibility(0);
        c(this.m);
        this.t.a(this.m);
    }

    private void c(ArrayList<UserCredentials> arrayList) {
        this.l.clear();
        this.l.addAll(arrayList);
        this.l.add(0, new UserCredentials(this.e.m(), this.e.n(), this.e.u()));
    }

    private void d(ArrayList<UserCredentials> arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (!this.e.m().equalsIgnoreCase(arrayList.get(i2).getMobileNumber())) {
                i++;
            }
        }
        if (i == arrayList.size() && arrayList.size() < 5) {
            arrayList.add(0, new UserCredentials(this.e.m(), this.e.n(), this.e.u()));
        }
        this.e.a(arrayList);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.iv_close) {
            finish();
        } else if (id != R.id.btn_add_account && id != R.id.fl_add_account) {
        } else {
            if (this.e.A().size() < 6) {
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("SwitchAccountBottomSheet", this.l);
                this.u.setArguments(bundle);
                if (this.u.isAdded() || this.u.isVisible()) {
                    return;
                }
                this.u.show(getSupportFragmentManager(), "SwitchAccountBottomSheet");
                return;
            }
            Toast.makeText(this, getString(R.string.only_four_accounts), 1).show();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 101 && i2 == -1) {
            ArrayList<UserCredentials> arrayList = new ArrayList<>(intent.getParcelableArrayListExtra("numberList"));
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (this.e.m().equalsIgnoreCase(arrayList.get(i3).getMobileNumber())) {
                    arrayList.remove(i3);
                }
            }
            if (arrayList.size() == 0) {
                this.n.setVisibility(0);
                this.f.setVisibility(8);
                this.o.setVisibility(8);
                return;
            }
            this.n.setVisibility(8);
            this.f.setVisibility(0);
            this.o.setVisibility(0);
            c(arrayList);
            this.t.a(arrayList);
        }
    }

    private void c(UserCredentials userCredentials) {
        this.r = userCredentials.getMobileNumber();
        this.s = userCredentials.getPassWord();
        if (userCredentials.getMobileNumber().equalsIgnoreCase(this.e.m())) {
            Toast.makeText(this, getString(R.string.canot_switch_to_same_account), 1).show();
        } else if (TextUtils.isEmpty(this.s)) {
            this.e.f("");
            if (!TextUtils.isEmpty(this.e.E())) {
                this.p.a(this.e.E(), "FACEBOOK");
            } else if (TextUtils.isEmpty(this.e.G())) {
            } else {
                this.p.a(this.e.G(), "GOOGLE");
            }
        } else {
            this.h.a(userCredentials.getMobileNumber(), userCredentials.getPassWord(), false);
            this.k.a(this, getString(R.string.loading));
        }
    }

    @Override // defpackage.cwz.a
    public final void a(UserCredentials userCredentials) {
        c(userCredentials);
    }

    @Override // defpackage.cwz.a
    public final void a_(UserCredentials userCredentials) {
        this.l.remove(userCredentials);
        this.e.a(this.l);
        ArrayList<UserCredentials> arrayList = new ArrayList<>(this.e.A());
        this.l = arrayList;
        d(arrayList);
        ArrayList<UserCredentials> arrayList2 = new ArrayList<>(this.l);
        for (int i = 0; i < arrayList2.size(); i++) {
            if (this.e.m().equalsIgnoreCase(this.l.get(i).getMobileNumber())) {
                arrayList2.remove(i);
            }
        }
        if (arrayList2.size() == 0) {
            this.n.setVisibility(0);
            this.f.setVisibility(8);
            this.o.setVisibility(8);
            return;
        }
        this.n.setVisibility(8);
        this.f.setVisibility(0);
        this.o.setVisibility(0);
        c(arrayList2);
        this.t.a(arrayList2);
    }

    @Override // defpackage.dhk
    public final void a(int i) {
        if (i != 1) {
            return;
        }
        this.k.a();
        this.j.a();
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        this.h.a((dhk) this);
        this.j.a(this);
        super.onResume();
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        this.h.b(this);
        this.j.b(this);
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.j.b(this);
        super.onDestroy();
    }

    @Override // defpackage.dhk
    public final void a(int i, int i2, String str) {
        this.k.a();
        this.g.a(this, str, i2, ErrorHandlerActivity.class);
    }

    @Override // defpackage.ddh
    public final void b(boolean z) {
        if (z) {
            this.k.a(this, getString(R.string.loading));
        } else {
            this.k.a();
        }
    }

    @Override // defpackage.ddh
    public final void a(SignInResponse signInResponse) {
        b(true);
        if (this.e.k().equals("")) {
            this.e.c("en");
        }
        this.e.i(signInResponse.getHeader().getMsisdn());
        this.e.k("PREPAID");
        this.e.d(signInResponse.getHeader().getMsisdn());
        this.e.l("PREPAID");
        this.e.n(signInResponse.getHeader().getMsisdn());
        this.e.o(signInResponse.getHeader().getMsisdn());
        this.h.a(signInResponse);
        djv.b("jwt", signInResponse.getBody().getJwt());
        this.e.u(signInResponse.getBody().getJwt());
        djv.b("customerId", signInResponse.getHeader().getCustomerId());
        this.e.w(signInResponse.getBody().getGroupFmc().getId());
        this.e.r(signInResponse.getBody().getUserProperties().getRegistered().booleanValue());
        this.e.o(signInResponse.getBody().getGroupFmc().isSubscribed());
        this.e.x(new Gson().a(signInResponse.getBody().getGroupFamily()));
        this.e.p(signInResponse.getBody().isIptv());
        this.e.b(signInResponse.getBody().getAssociatedLines());
        this.e.k(false);
    }

    @Override // defpackage.dis.b
    public final void b() {
        this.u.dismiss();
        if (this.e.A() == null) {
            startActivityForResult(new Intent(this, AddAccountActivity.class), 101);
        } else if (this.e.A().size() < 5) {
            startActivityForResult(new Intent(this, AddAccountActivity.class), 101);
        } else {
            Toast.makeText(this, getString(R.string.only_four_accounts), 1).show();
        }
    }

    @Override // defpackage.dis.b
    public final void b_(UserCredentials userCredentials) {
        this.u.dismiss();
        c(userCredentials);
    }

    @Override // defpackage.dis.b
    public final void b(UserCredentials userCredentials) {
        this.u.dismiss();
        this.l.remove(userCredentials);
        this.e.a(this.l);
        ArrayList<UserCredentials> arrayList = new ArrayList<>(this.e.A());
        this.l = arrayList;
        d(arrayList);
        ArrayList<UserCredentials> arrayList2 = new ArrayList<>(this.l);
        for (int i = 0; i < arrayList2.size(); i++) {
            if (this.e.m().equalsIgnoreCase(this.l.get(i).getMobileNumber())) {
                arrayList2.remove(i);
            }
        }
        if (arrayList2.size() == 0) {
            this.n.setVisibility(0);
            this.f.setVisibility(8);
            this.o.setVisibility(8);
            return;
        }
        this.n.setVisibility(8);
        this.f.setVisibility(0);
        this.o.setVisibility(0);
        c(arrayList2);
        this.t.a(arrayList2);
    }
}
