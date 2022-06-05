package com.ucare.we.presentation.offers;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.BalanceRechargeActivity;
import com.ucare.we.R;
import com.ucare.we.presentation.family.groupinfo.managemembers.ManageMembersActivity;
import com.ucare.we.presentation.paybillnumbertype.PayBillNumberTypeActivity;
import java.util.ArrayList;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class UnNavigateResponseActivity extends dae {
    @Inject
    djx a;
    @Inject
    dhn b;
    @Inject
    dgc c;
    Button e;
    Button f;
    Button g;
    String h;
    String i;
    TextView j;
    TextView k;
    Button l;
    RecyclerView t;
    ImageView u;
    @Inject
    djw x;
    @Inject
    dio y;
    String d = "";
    boolean m = false;
    boolean n = false;
    boolean o = false;
    boolean p = false;
    int q = 0;
    ArrayList<String> r = new ArrayList<>();
    boolean s = false;

    /* renamed from: lambda$053ij-TIzcD8uWvNXGoDIG-esQ0 */
    public static /* synthetic */ void m56lambda$053ijTIzcD8uWvNXGoDIGesQ0(UnNavigateResponseActivity unNavigateResponseActivity, View view) {
        unNavigateResponseActivity.b(view);
    }

    public static /* synthetic */ void lambda$2Ukhsu5FbYwetJAtfOMbikM0veQ(UnNavigateResponseActivity unNavigateResponseActivity, View view) {
        unNavigateResponseActivity.c(view);
    }

    public static /* synthetic */ void lambda$H_azNdh5CEgy3OF3kkrWFijCLYk(UnNavigateResponseActivity unNavigateResponseActivity, View view) {
        unNavigateResponseActivity.a(view);
    }

    public static /* synthetic */ void lambda$_gujP2RhJWgwBhhCqw2nDejmQG4(UnNavigateResponseActivity unNavigateResponseActivity, View view) {
        unNavigateResponseActivity.d(view);
    }

    public static void a(Context context, String str, String str2) {
        Intent intent = new Intent(context, UnNavigateResponseActivity.class);
        intent.putExtra("success_msg", str);
        intent.putExtra("success_msg_details", str2);
        intent.putExtra("isError", true);
        context.startActivity(intent);
    }

    public static void b(Context context, String str, String str2) {
        Intent intent = new Intent(context, UnNavigateResponseActivity.class);
        intent.putExtra("success_msg", str);
        intent.putExtra("success_msg_details", str2);
        intent.putExtra("isError", false);
        intent.putExtra("isShowingAddMember", false);
        context.startActivity(intent);
    }

    public static void a(AppCompatActivity appCompatActivity, int i, String str, String str2, boolean z, boolean z2, boolean z3, int i2, boolean z4) {
        Intent intent = new Intent(appCompatActivity, UnNavigateResponseActivity.class);
        intent.putExtra("success_msg", str);
        intent.putExtra("isShowingAddMember", z2);
        intent.putExtra("responseCode", i);
        intent.putExtra("success_msg_details", str2);
        intent.putExtra("isError", z3);
        intent.putExtra("removegroup", z4);
        intent.putExtra("showRecharge_family", z);
        appCompatActivity.startActivityForResult(intent, i2);
    }

    public static void a(Context context, String str, String str2, boolean z, int i) {
        Intent intent = new Intent(context, UnNavigateResponseActivity.class);
        intent.putExtra("success_msg", str);
        intent.putExtra("success_msg_details", str2);
        intent.putExtra("isError", true);
        intent.putExtra("showRecharge", z);
        intent.putExtra("responseCode", i);
        context.startActivity(intent);
    }

    public static void a(Context context, String str, String str2, ArrayList<String> arrayList, int i) {
        Intent intent = new Intent(context, UnNavigateResponseActivity.class);
        intent.putExtra("success_msg", str);
        intent.putExtra("success_msg_details", str2);
        intent.putExtra("isError", true);
        intent.putExtra("ineligibleNumberlist", arrayList);
        intent.putExtra("responseCode", i);
        context.startActivity(intent);
    }

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_voucher_success);
        this.e = (Button) findViewById(R.id.btn_done_transfer);
        this.g = (Button) findViewById(R.id.btn_recharge_payment);
        this.f = (Button) findViewById(R.id.btnAddMemeber);
        this.j = (TextView) findViewById(R.id.txtMessage);
        this.k = (TextView) findViewById(R.id.txtMessageDetails);
        this.l = (Button) findViewById(R.id.btnManageMember);
        this.t = (RecyclerView) findViewById(R.id.rv_mig_numList);
        this.u = (ImageView) findViewById(R.id.imgStatus);
        this.k.setVisibility(8);
        this.h = getIntent().getExtras().getString("success_msg");
        this.q = getIntent().getExtras().getInt("responseCode");
        this.p = getIntent().getExtras().getBoolean("showRecharge");
        this.s = getIntent().getExtras().getBoolean("showRecharge_family");
        this.i = getIntent().getExtras().getString("success_msg_details");
        this.m = getIntent().getExtras().getBoolean("isError");
        this.n = getIntent().getExtras().getBoolean("isShowingAddMember");
        this.o = getIntent().getExtras().getBoolean("removegroup");
        this.r = (ArrayList) getIntent().getSerializableExtra("ineligibleNumberlist");
        int i = this.q;
        boolean z = true;
        if (((i == 3259 || i == 3239 || i == 9001 || i == 8001) && this.x.v().equalsIgnoreCase("postpaid")) && this.b.f != null) {
            this.d = this.x.k().equals("ar") ? this.b.f.getMaximumBillLimitAr() : this.b.f.getMaximumBillLimitEn();
        } else {
            this.d = this.h;
        }
        this.j.setText(this.d);
        if (this.q == 3258) {
            this.t.setVisibility(0);
            deg degVar = new deg(this, this.r);
            this.t.setLayoutManager(new LinearLayoutManager(this, 1, false));
            this.t.setHasFixedSize(true);
            this.t.setAdapter(degVar);
        }
        if (this.n) {
            this.f.setVisibility(0);
        } else {
            this.f.setVisibility(8);
        }
        if (this.o && this.m) {
            this.l.setVisibility(0);
        } else {
            this.l.setVisibility(8);
        }
        if (!this.p) {
            this.k.setText(this.i);
            this.k.setVisibility(0);
        }
        if (this.m) {
            this.u.setImageResource(R.drawable.ic_error_vector);
            this.e.setText(getString(R.string.popup_cancel));
            this.g.setVisibility(0);
        } else {
            this.u.setImageResource(R.drawable.ic_success_vector);
            this.e.setText(getString(R.string.ok));
        }
        if (this.y.g() && this.y.h() && this.y.d()) {
            if (this.p) {
                dgc dgcVar = this.c;
                if (dgcVar.g.getErrorViewRechargeButton() == null || !dgcVar.g.getErrorViewRechargeButton().contains(dgcVar.c.w())) {
                    z = false;
                }
                if (z) {
                    this.g.setVisibility(0);
                }
            }
            this.g.setVisibility(8);
        } else if (this.p || this.s) {
            this.g.setVisibility(0);
        } else {
            this.g.setVisibility(8);
        }
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.offers.-$$Lambda$UnNavigateResponseActivity$_gujP2RhJWgwBhhCqw2nDejmQG4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UnNavigateResponseActivity.lambda$_gujP2RhJWgwBhhCqw2nDejmQG4(UnNavigateResponseActivity.this, view);
            }
        });
        this.l.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.offers.-$$Lambda$UnNavigateResponseActivity$2Ukhsu5FbYwetJAtfOMbikM0veQ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UnNavigateResponseActivity.lambda$2Ukhsu5FbYwetJAtfOMbikM0veQ(UnNavigateResponseActivity.this, view);
            }
        });
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.offers.-$$Lambda$UnNavigateResponseActivity$053ij-TIzcD8uWvNXGoDIG-esQ0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UnNavigateResponseActivity.m56lambda$053ijTIzcD8uWvNXGoDIGesQ0(UnNavigateResponseActivity.this, view);
            }
        });
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.offers.-$$Lambda$UnNavigateResponseActivity$H_azNdh5CEgy3OF3kkrWFijCLYk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UnNavigateResponseActivity.lambda$H_azNdh5CEgy3OF3kkrWFijCLYk(UnNavigateResponseActivity.this, view);
            }
        });
        if (this.x.v().equalsIgnoreCase("postpaid")) {
            this.g.setVisibility(8);
            this.g.setText(getString(R.string.pay_bill));
            return;
        }
        this.g.setText(getString(R.string.recharge));
    }

    public /* synthetic */ void d(View view) {
        Intent intent = new Intent();
        intent.putExtra("fromAddMemberClick", false);
        setResult(-1, intent);
        finish();
    }

    public /* synthetic */ void c(View view) {
        Intent intent = new Intent(this, ManageMembersActivity.class);
        intent.setFlags(536870912);
        startActivity(intent);
        finish();
    }

    public /* synthetic */ void b(View view) {
        Intent intent = new Intent();
        intent.putExtra("fromAddMemberClick", true);
        setResult(-1, intent);
        finish();
    }

    public /* synthetic */ void a(View view) {
        if (this.x.v().equalsIgnoreCase("postpaid")) {
            startActivity(new Intent(this, PayBillNumberTypeActivity.class));
        } else {
            startActivity(new Intent(this, BalanceRechargeActivity.class));
        }
        finish();
    }
}
