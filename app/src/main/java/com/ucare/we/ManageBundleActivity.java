package com.ucare.we;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.model.AssociatedNumberResponseBody;
import com.ucare.we.model.MainPlanResponseBody;
import com.ucare.we.model.PlansAndBundlesResponseBody;
import com.ucare.we.model.extras.ExtrasList;
import com.ucare.we.model.special.SpecialList;
import com.ucare.we.model.usagedetails.SummarizedLineUsageItem;
import defpackage.cwu;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class ManageBundleActivity extends czy implements View.OnClickListener, cwu.a, dht, dic {
    final Handler a = new Handler();
    ImageView b;
    @Inject
    dhu c;
    ArrayList<MainPlanResponseBody> d;
    @Inject
    djg e;
    @Inject
    did f;
    @Inject
    djx g;
    MainPlanResponseBody h;
    Button i;
    int j;
    TextView k;
    private RecyclerView l;
    private cwu m;

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
    public final void a(String str) {
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

    @Override // defpackage.dht
    public final void a_(int i) {
    }

    @Override // defpackage.dic
    public final void a_(int i, String str) {
    }

    @Override // defpackage.dht
    public final void a_(String str) {
    }

    @Override // defpackage.dic
    public final void a_(List<PlansAndBundlesResponseBody> list) {
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

    @Override // defpackage.dic
    public final void b_(String str) {
    }

    @Override // defpackage.dht
    public final void c(String str) {
    }

    @Override // defpackage.dht
    public final void c(List<AssociatedNumberResponseBody> list) {
    }

    @Override // defpackage.dic
    public final void d(int i, String str) {
    }

    @Override // defpackage.dic
    public final void d(String str) {
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

    @Override // defpackage.dic
    public final void o_() {
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
        setContentView(R.layout.activity_manage_bundle);
        a(getString(R.string.mangeBundle), false, false);
        ImageView imageView = (ImageView) findViewById(R.id.imgBackButton);
        this.b = imageView;
        imageView.setOnClickListener(this);
        Button button = (Button) findViewById(R.id.btn_add_more_bundles);
        this.i = button;
        button.setOnClickListener(this);
        this.l = (RecyclerView) findViewById(R.id.rv_bundles);
        this.k = (TextView) findViewById(R.id.tv_bundles_subscription);
        this.l.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.l.setHasFixedSize(true);
        cwu cwuVar = new cwu(this, this);
        this.m = cwuVar;
        this.l.setAdapter(cwuVar);
        this.c.a(this);
        this.f.a(this);
        this.c.e();
        this.e.a(this, getString(R.string.loading));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.c.b(this);
        this.f.b(this);
        super.onDestroy();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.imgBackButton) {
            finish();
        } else if (id == R.id.btn_renew || id != R.id.btn_add_more_bundles) {
        } else {
            startActivityForResult(new Intent(this, AddMoreBundlesActivity.class), 124);
        }
    }

    @Override // defpackage.cwu.a
    public final void a(MainPlanResponseBody mainPlanResponseBody) {
        Intent intent = new Intent(this, UnSubscribeFromBundleActivity.class);
        intent.putExtra("mainPlan", mainPlanResponseBody);
        startActivityForResult(intent, 125);
        this.j = this.d.indexOf(mainPlanResponseBody);
        this.h = mainPlanResponseBody;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 125) {
            if (i2 != -1) {
                return;
            }
            new StringBuilder().append(this.j);
            this.f.b(this.h.getServiceId());
            this.e.a(this, getString(R.string.loading));
        } else if (i == 124) {
            if (i2 != -1) {
                return;
            }
            this.f.c(intent.getStringExtra("offerId"));
            this.e.a(this, getString(R.string.loading));
        } else if (i != 122 || i2 != -1) {
        } else {
            this.e.a(this, getString(R.string.loading));
            this.c.e();
        }
    }

    @Override // defpackage.dht
    public final void b(List<MainPlanResponseBody> list) {
        ArrayList<MainPlanResponseBody> arrayList = this.d;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.d = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list.get(i).getServiceName();
            new StringBuilder().append(list.get(i).isAddOn());
            if (list.get(i).isAddOn()) {
                this.d.add(list.get(i));
            }
        }
        new StringBuilder().append(this.d.size());
        cwu cwuVar = this.m;
        cwuVar.a = this.d;
        cwuVar.notifyDataSetChanged();
        this.e.a();
        if (this.d.size() == 0) {
            this.k.setText(getString(R.string.not_subscribed_to_bundle));
        } else {
            this.k.setText(getString(R.string.your_subscribed_bundles));
        }
    }

    @Override // defpackage.dht
    public final void p_() {
        this.e.a();
    }

    @Override // defpackage.dic
    public final void c_(String str) {
        this.e.a();
        ArrayList<MainPlanResponseBody> arrayList = this.d;
        arrayList.remove(arrayList.get(this.j));
        this.m.notifyItemRemoved(this.j);
        this.m.notifyItemRangeChanged(this.j, this.d.size());
        djx.b(this, str, SuccessHandlerActivity.class, getString(R.string.unsbscribed_successfully));
    }

    @Override // defpackage.dic
    public final void b_(int i, String str) {
        this.e.a();
        this.g.a(this, str, i, ErrorHandlerActivity.class);
    }

    @Override // defpackage.dic
    public final void d_(String str) {
        this.e.a();
        Intent intent = new Intent(this, SuccessHandlerActivity.class);
        intent.putExtra("successMessageDetails", str);
        intent.putExtra("successMessage", getString(R.string.successful));
        intent.putExtra("bundle", true);
        startActivityForResult(intent, 122);
    }

    @Override // defpackage.dic
    public final void c(int i, String str) {
        this.e.a();
        this.g.a(this, str, i, ErrorHandlerActivity.class);
    }
}
