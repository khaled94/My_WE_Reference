package com.ucare.we;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.adapters.LineNameUsageAdapter;
import com.ucare.we.model.AssociatedNumberResponseBody;
import com.ucare.we.model.MainPlanResponseBody;
import com.ucare.we.model.extras.ExtrasList;
import com.ucare.we.model.special.SpecialList;
import com.ucare.we.model.usagedetails.SummarizedLineUsageItem;
import com.ucare.we.morebundle.SelectMoreBundlesActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class UsageDetailsScreenActivity extends czy implements dcx, dht {
    LinearLayoutManager a;
    cxi b;
    Intent c;
    View.OnClickListener d = new View.OnClickListener() { // from class: com.ucare.we.-$$Lambda$UsageDetailsScreenActivity$9W1szkhUUa35tHAtbaahdS8vBPs
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            UsageDetailsScreenActivity.lambda$9W1szkhUUa35tHAtbaahdS8vBPs(UsageDetailsScreenActivity.this, view);
        }
    };
    ImageView e;
    TextView f;
    RecyclerView g;
    Button h;
    RecyclerView i;
    List<cyr> j;
    @Inject
    dhu k;
    LineNameUsageAdapter l;
    String m;
    List<SummarizedLineUsageItem> n;
    HashMap<Long, List<cyr>> o;
    @Inject
    djw p;
    @Inject
    dhn q;
    @Inject
    dgc r;
    private ProgressDialog s;

    public static /* synthetic */ void lambda$9W1szkhUUa35tHAtbaahdS8vBPs(UsageDetailsScreenActivity usageDetailsScreenActivity, View view) {
        usageDetailsScreenActivity.c(view);
    }

    public static /* synthetic */ void lambda$VxDj_WgOKEL9wpN0G8TcQ9w24WU(UsageDetailsScreenActivity usageDetailsScreenActivity, View view) {
        usageDetailsScreenActivity.a(view);
    }

    public static /* synthetic */ void lambda$mztQjJRDMm7vjiBKwRflkf4mCOI(UsageDetailsScreenActivity usageDetailsScreenActivity, View view) {
        usageDetailsScreenActivity.b(view);
    }

    @Override // defpackage.dht
    public final void a(float f) {
    }

    @Override // defpackage.dht
    public final void a(int i, String str) {
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

    public /* synthetic */ void c(View view) {
        finish();
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.c = intent;
        Bundle extras = intent.getExtras();
        this.c = getIntent();
        this.n = new ArrayList();
        this.j = new ArrayList();
        if (extras != null) {
            String string = extras.getString("USAGE_DETAILS_ACIIVITY");
            this.m = string;
            if (string != null && string.equals("USAGE_DETAILS_SEARCH_VIEW")) {
                setContentView(R.layout.activity_layout_search_usage_details_screen);
                m();
                ProgressDialog progressDialog = this.s;
                if (progressDialog != null && progressDialog.isShowing()) {
                    q();
                }
                ProgressDialog progressDialog2 = new ProgressDialog(this);
                this.s = progressDialog2;
                progressDialog2.setMessage(getString(R.string.starting_bill_payment));
                this.s.setCancelable(false);
                this.s.show();
                this.k.d();
                this.h.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.-$$Lambda$UsageDetailsScreenActivity$mztQjJRDMm7vjiBKwRflkf4mCOI
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        UsageDetailsScreenActivity.lambda$mztQjJRDMm7vjiBKwRflkf4mCOI(UsageDetailsScreenActivity.this, view);
                    }
                });
                this.p.v().equalsIgnoreCase("prepaid");
                this.h.setText(getString(R.string.add_more_bundles1));
                if (this.r.c()) {
                    this.h.setVisibility(0);
                } else {
                    this.h.setVisibility(8);
                }
            } else {
                setContentView(R.layout.usage_details_activity);
                m();
                this.j = extras.getParcelableArrayList("TAB_USAGE_DETAILS_DTO");
                getBaseContext();
                String a = djv.a("LANGUAGE", "");
                String str = this.m;
                if (str != null && str.equals("USAGE_DETAILS_SEARCH_VIEW")) {
                    final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 0, false);
                    if (this.w.f()) {
                        linearLayoutManager.setReverseLayout(true);
                    }
                    this.g.setLayoutManager(linearLayoutManager);
                    LineNameUsageAdapter lineNameUsageAdapter = new LineNameUsageAdapter(this, this.n, this.p.b("en").equalsIgnoreCase("en") ? "en" : "ar");
                    this.l = lineNameUsageAdapter;
                    this.g.setAdapter(lineNameUsageAdapter);
                    this.g.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.ucare.we.UsageDetailsScreenActivity.1
                        {
                            UsageDetailsScreenActivity.this = this;
                        }

                        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                            super.onScrollStateChanged(recyclerView, i);
                            if (i != 0 || linearLayoutManager.findFirstCompletelyVisibleItemPosition() < 0) {
                                return;
                            }
                            UsageDetailsScreenActivity.a(UsageDetailsScreenActivity.this, linearLayoutManager.findFirstCompletelyVisibleItemPosition());
                        }
                    });
                    if (this.n.size() > 0) {
                        SummarizedLineUsageItem summarizedLineUsageItem = this.n.get(0);
                        if (this.o.get(summarizedLineUsageItem.getTabId()) != null) {
                            this.j.addAll(this.o.get(summarizedLineUsageItem.getTabId()));
                        }
                        this.g.scrollToPosition(0);
                    } else if (this.p.b("en").equalsIgnoreCase("en")) {
                        Toast.makeText(this, this.q.f.getNoUsageDetailsHintEN(), 0).show();
                    } else {
                        Toast.makeText(this, this.q.f.getNoUsageDetailsHintAR(), 0).show();
                    }
                }
                if (this.j.size() > 0 && this.m == null && this.j.get(0) != null) {
                    if (a.equals("ar")) {
                        this.f.setText(this.j.get(0).j);
                        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(this);
                        this.a = linearLayoutManager2;
                        this.i.setLayoutManager(linearLayoutManager2);
                        cxi cxiVar = new cxi(this);
                        this.b = cxiVar;
                        this.i.setAdapter(cxiVar);
                        getResources().getDrawable(R.drawable.gray_gradient_color);
                    } else {
                        this.f.setText(this.j.get(0).i);
                        LinearLayoutManager linearLayoutManager3 = new LinearLayoutManager(this);
                        this.a = linearLayoutManager3;
                        this.i.setLayoutManager(linearLayoutManager3);
                        cxi cxiVar2 = new cxi(this);
                        this.b = cxiVar2;
                        this.i.setAdapter(cxiVar2);
                        getResources().getDrawable(R.drawable.gray_gradient_color);
                    }
                }
                this.h.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.-$$Lambda$UsageDetailsScreenActivity$VxDj_WgOKEL9wpN0G8TcQ9w24WU
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        UsageDetailsScreenActivity.lambda$VxDj_WgOKEL9wpN0G8TcQ9w24WU(UsageDetailsScreenActivity.this, view);
                    }
                });
                this.p.v().equalsIgnoreCase("prepaid");
                this.h.setText(getString(R.string.add_more_bundles1));
                if (this.r.c()) {
                    this.h.setVisibility(0);
                } else {
                    this.h.setVisibility(8);
                }
            }
        }
        this.e.setOnClickListener(this.d);
    }

    public /* synthetic */ void b(View view) {
        startActivity(new Intent(getApplicationContext(), SelectMoreBundlesActivity.class));
    }

    public /* synthetic */ void a(View view) {
        startActivity(new Intent(getApplicationContext(), SelectMoreBundlesActivity.class));
    }

    private void m() {
        a(getString(R.string.usage_details), false, false);
        this.e = (ImageView) findViewById(R.id.imgBackButton);
        this.f = (TextView) findViewById(R.id.usage_title_tv);
        this.g = (RecyclerView) findViewById(R.id.lineItemsRecyclerView);
        this.h = (Button) findViewById(R.id.btnAddMoreExtra);
        this.i = (RecyclerView) findViewById(R.id.recyclerview_usage_details_id);
    }

    private void q() {
        ProgressDialog progressDialog = this.s;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.k.a(this);
    }

    @Override // defpackage.dcx
    public final List<cyr> k() {
        return this.j;
    }

    @Override // defpackage.dcx
    public final Context l() {
        return getBaseContext();
    }

    @Override // defpackage.dht
    public final void a(List<SummarizedLineUsageItem> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTabId() != null) {
                this.n.add(list.get(i));
            }
        }
    }

    @Override // defpackage.dht
    public final void a(cyq cyqVar) {
        q();
    }

    @Override // defpackage.dht
    public final void a_(int i) {
        q();
    }

    static /* synthetic */ void a(UsageDetailsScreenActivity usageDetailsScreenActivity, int i) {
        usageDetailsScreenActivity.j.clear();
        SummarizedLineUsageItem summarizedLineUsageItem = usageDetailsScreenActivity.n.get(i);
        if (usageDetailsScreenActivity.o.get(summarizedLineUsageItem.getTabId()) != null) {
            usageDetailsScreenActivity.j.addAll(usageDetailsScreenActivity.o.get(summarizedLineUsageItem.getTabId()));
        }
        usageDetailsScreenActivity.b.notifyDataSetChanged();
        LineNameUsageAdapter lineNameUsageAdapter = usageDetailsScreenActivity.l;
        lineNameUsageAdapter.b = i;
        lineNameUsageAdapter.notifyDataSetChanged();
        usageDetailsScreenActivity.g.scrollToPosition(i);
    }
}
