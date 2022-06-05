package com.ucare.we;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.model.MainPlanResponseBody;
import com.ucare.we.model.PlansAndBundlesResponseBody;
import defpackage.cxd;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class ManagePlansActivity extends czy implements View.OnClickListener, cxd.b, dic {
    Button a;
    ImageView b;
    TextView c;
    TextView d;
    TextView e;
    TextView f;
    TextView g;
    MainPlanResponseBody h;
    @Inject
    did i;
    @Inject
    djx j;
    @Inject
    djg k;
    @Inject
    djw l;
    boolean m;
    LinearLayout n;
    TextView o;
    PlansAndBundlesResponseBody p;
    private RecyclerView q;
    private cxd r;

    @Override // defpackage.dic
    public final void b_(int i, String str) {
    }

    @Override // defpackage.dic
    public final void c_(String str) {
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_manage_plan);
        this.a = (Button) findViewById(R.id.btn_renew);
        this.b = (ImageView) findViewById(R.id.imgBackButton);
        this.c = (TextView) findViewById(R.id.tv_main_plan);
        this.o = (TextView) findViewById(R.id.txtTitle);
        this.d = (TextView) findViewById(R.id.tv_renewal_date);
        this.e = (TextView) findViewById(R.id.tv_remaining_days);
        this.f = (TextView) findViewById(R.id.tv_cost);
        this.n = (LinearLayout) findViewById(R.id.ll_renew_plan);
        this.g = (TextView) findViewById(R.id.tv_choose_plan);
        boolean booleanExtra = getIntent().getBooleanExtra("subscribe", false);
        this.m = booleanExtra;
        if (booleanExtra) {
            this.n.setVisibility(8);
            this.o.setText(getString(R.string.subscribe_to_plan));
            this.g.setText(R.string.choose_plan_subscribe);
        } else {
            this.g.setText(R.string.choose_plan);
            this.h = (MainPlanResponseBody) getIntent().getParcelableExtra("mainPlan");
            this.o.setText(getString(R.string.manage_plan));
            MainPlanResponseBody mainPlanResponseBody = this.h;
            if (mainPlanResponseBody != null) {
                this.c.setText(mainPlanResponseBody.getServiceName());
                String renewalDate = this.h.getRenewalDate();
                if (renewalDate != null && !renewalDate.isEmpty() && !renewalDate.equals("")) {
                    this.d.setText(this.h.getRenewalDate());
                }
                TextView textView = this.e;
                textView.setText(this.h.getRemainingDaysForRenewal() + " " + getString(R.string.days));
                TextView textView2 = this.f;
                textView2.setText(this.h.getPrice() + " " + getString(R.string.egp));
            }
            this.a.setOnClickListener(this);
        }
        this.b.setOnClickListener(this);
        this.q = (RecyclerView) findViewById(R.id.rv_plans);
        this.q.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.q.setHasFixedSize(true);
        cxd cxdVar = new cxd(this);
        this.r = cxdVar;
        this.q.setAdapter(cxdVar);
        this.i.a(this);
        this.i.a();
        this.k.a(this, getString(R.string.loading));
    }

    @Override // defpackage.czy, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.i.l.a();
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.i.b(this);
        super.onDestroy();
    }

    @Override // defpackage.cxd.b
    public final void a(PlansAndBundlesResponseBody plansAndBundlesResponseBody) {
        this.p = plansAndBundlesResponseBody;
        if (plansAndBundlesResponseBody != null && this.l.z() < this.p.getPrice()) {
            this.j.a(this, getString(R.string.no_enough_balance_detials), 1, ErrorHandlerActivity.class);
        } else if (!this.m) {
            if (this.h == null) {
                return;
            }
            Intent intent = new Intent(this, ChangeMainPlanActivity.class);
            intent.putExtra("planToBeChanged", plansAndBundlesResponseBody);
            startActivityForResult(intent, 17);
        } else {
            Intent intent2 = new Intent(this, ChangeMainPlanActivity.class);
            intent2.putExtra("planToBeChanged", plansAndBundlesResponseBody);
            intent2.putExtra("subscribe", this.m);
            startActivityForResult(intent2, 18);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.imgBackButton) {
            finish();
        } else if (id != R.id.btn_renew) {
        } else {
            if (this.h != null && this.l.z() < this.h.getPrice()) {
                this.j.a(this, getString(R.string.no_enough_balance_detials), 1, ErrorHandlerActivity.class);
            } else if (this.h == null) {
            } else {
                Intent intent = new Intent(this, RenewMainPlanActivity.class);
                intent.putExtra("mainPlan", this.h);
                intent.putExtra("mainActivity", false);
                startActivityForResult(intent, 15);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        MainPlanResponseBody mainPlanResponseBody;
        MainPlanResponseBody mainPlanResponseBody2;
        super.onActivityResult(i, i2, intent);
        if (i == 15) {
            if (i2 != -1 || (mainPlanResponseBody2 = this.h) == null) {
                return;
            }
            this.i.a(mainPlanResponseBody2.getServiceId());
            this.k.a(this, getString(R.string.loading));
        } else if (i == 17) {
            if (i2 != -1 || (mainPlanResponseBody = this.h) == null) {
                return;
            }
            this.i.a(mainPlanResponseBody.getServiceId(), this.p.getOfferId());
            this.k.a(this, getString(R.string.loading));
        } else if (i != 18 || i2 != -1) {
        } else {
            this.i.c(this.p.getOfferId());
            this.k.a(this, getString(R.string.loading));
        }
    }

    @Override // defpackage.dic
    public final void a_(List<PlansAndBundlesResponseBody> list) {
        this.k.a();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            list.get(i).getOfferEnName();
            if (list.get(i).getType() != null && list.get(i).getType().equalsIgnoreCase("M") && !list.get(i).isAlreadySubscribed()) {
                arrayList.add(list.get(i));
            }
        }
        this.r.a(new ArrayList<>(arrayList));
    }

    @Override // defpackage.dic
    public final void o_() {
        this.k.a();
    }

    @Override // defpackage.dic
    public final void b_(String str) {
        this.k.a();
        djx.a(this, str, SuccessHandlerActivity.class, getString(R.string.plan_renewed));
    }

    @Override // defpackage.dic
    public final void a_(int i, String str) {
        this.k.a();
        this.j.a(this, str, i, ErrorHandlerActivity.class);
    }

    @Override // defpackage.dic
    public final void d_(String str) {
        this.k.a();
        djx.a(this, str, SuccessHandlerActivity.class, getString(R.string.plan_subscibed));
    }

    @Override // defpackage.dic
    public final void c(int i, String str) {
        this.k.a();
        this.j.a(this, str, i, ErrorHandlerActivity.class);
    }

    @Override // defpackage.dic
    public final void d(String str) {
        this.k.a();
        djx.a(this, str, SuccessHandlerActivity.class, getString(R.string.plan_changed));
    }

    @Override // defpackage.dic
    public final void d(int i, String str) {
        this.k.a();
        this.j.a(this, str, i, ErrorHandlerActivity.class);
    }
}
