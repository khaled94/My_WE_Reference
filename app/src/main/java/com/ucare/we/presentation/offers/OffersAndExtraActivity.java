package com.ucare.we.presentation.offers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.ucare.we.R;
import com.ucare.we.adapters.ExtrasRecyclerViewAdapter;
import com.ucare.we.adapters.OffersRecyclerViewAdapter;
import com.ucare.we.genericconfirmationscreen.GenericConfirmationActivity;
import com.ucare.we.model.AssociatedNumberResponseBody;
import com.ucare.we.model.MainPlanResponseBody;
import com.ucare.we.model.extras.ExtrasList;
import com.ucare.we.model.special.SpecialList;
import com.ucare.we.model.usagedetails.SummarizedLineUsageItem;
import com.ucare.we.paybillpostpaidvoucher.ResponseActivity;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class OffersAndExtraActivity extends czy implements dcp, dfz, dht {
    @Inject
    djw a;
    @Inject
    dhn b;
    @Inject
    dhu c;
    @Inject
    dga d;
    @Inject
    djg e;
    @BindView(R.id.extra_listTitle)
    TextView extraListTitle;
    @BindView(R.id.extraLoadingTextView)
    TextView extraLoadingTextView;
    @BindView(R.id.extraRadioButton)
    RadioButton extraRadioButton;
    @BindView(R.id.extra_recyclerView)
    RecyclerView extraRecyclerView;
    @BindView(R.id.extraRelativeLayout)
    RelativeLayout extraRelativeLayout;
    @BindView(R.id.extraSwipeRefreshLayout)
    SwipeRefreshLayout extraSwipeRefreshLayout;
    @BindView(R.id.extraTextView)
    TextView extraTextView;
    OffersRecyclerViewAdapter g;
    ExtrasRecyclerViewAdapter h;
    dco i;
    @BindView(R.id.imgBackButton)
    ImageView imgBackButton;
    String j;
    private String m;
    @BindView(R.id.offer_listTitle)
    TextView offerListTitle;
    @BindView(R.id.offer_loadingTextView)
    TextView offerLoadingTextView;
    @BindView(R.id.offer_recyclerView)
    RecyclerView offerRecyclerView;
    @BindView(R.id.offerRelativeLayout)
    RelativeLayout offerRelativeLayout;
    @BindView(R.id.offerSwipeRefreshLayout)
    SwipeRefreshLayout offerSwipeRefreshLayout;
    @BindView(R.id.offerTextView)
    TextView offerTextView;
    @BindView(R.id.offersRadioButton)
    RadioButton offersRadioButton;
    @BindView(R.id.txtTitle)
    TextView txtTitle;
    View.OnClickListener f = new View.OnClickListener() { // from class: com.ucare.we.presentation.offers.-$$Lambda$OffersAndExtraActivity$M5rH3FhjNtXyE3Pe35r8O8QC3iI
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            OffersAndExtraActivity.lambda$M5rH3FhjNtXyE3Pe35r8O8QC3iI(OffersAndExtraActivity.this, view);
        }
    };
    ArrayList<ExtrasList> k = new ArrayList<>();
    ArrayList<SpecialList> l = new ArrayList<>();

    public static /* synthetic */ void lambda$5UsccAncVHuVjxSqec6RKC9ecN8(OffersAndExtraActivity offersAndExtraActivity) {
        offersAndExtraActivity.s();
    }

    public static /* synthetic */ void lambda$M5rH3FhjNtXyE3Pe35r8O8QC3iI(OffersAndExtraActivity offersAndExtraActivity, View view) {
        offersAndExtraActivity.a(view);
    }

    /* renamed from: lambda$lxANF5Aj1NE5U-d6xqRGBuAJ-II */
    public static /* synthetic */ void m55lambda$lxANF5Aj1NE5Ud6xqRGBuAJII(OffersAndExtraActivity offersAndExtraActivity) {
        offersAndExtraActivity.r();
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z) {
    }

    public /* synthetic */ void a(View view) {
        finish();
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.offers_and_extra_activity);
        ButterKnife.bind(this);
        a(getString(R.string.offer_and_extras), false, false);
        this.imgBackButton.setOnClickListener(this.f);
        this.extraSwipeRefreshLayout.setEnabled(false);
        this.offerSwipeRefreshLayout.setEnabled(false);
        this.e.a(this, getString(R.string.loading));
        this.c.a(this);
        this.d.a(this);
        if (this.a.b("en").equalsIgnoreCase("en")) {
            this.j = "en";
            this.extraRadioButton.setScaleX(-1.0f);
        } else {
            this.j = "ar";
            this.offersRadioButton.setScaleX(-1.0f);
        }
        this.txtTitle.setText(getString(R.string.offer_and_extras));
        this.c.c();
        this.offersRadioButton.performClick();
        this.offerTextView.setTextColor(-1);
        this.extraTextView.setTextColor(getResources().getColor(R.color.secondary_txt_color));
        this.offerListTitle.setVisibility(8);
        this.offersRadioButton.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.offers.OffersAndExtraActivity.1
            {
                OffersAndExtraActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OffersAndExtraActivity.this.offerListTitle.setVisibility(8);
                OffersAndExtraActivity.this.offerSwipeRefreshLayout.setVisibility(0);
                OffersAndExtraActivity.this.extraSwipeRefreshLayout.setVisibility(8);
                OffersAndExtraActivity.this.offerRelativeLayout.setVisibility(0);
                OffersAndExtraActivity.this.extraRelativeLayout.setVisibility(8);
                OffersAndExtraActivity.this.offerTextView.setTextColor(-1);
                OffersAndExtraActivity.this.extraTextView.setTextColor(OffersAndExtraActivity.this.getResources().getColor(R.color.secondary_txt_color));
                OffersAndExtraActivity.this.c.c();
            }
        });
        this.extraRadioButton.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.offers.OffersAndExtraActivity.2
            {
                OffersAndExtraActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OffersAndExtraActivity.this.offerListTitle.setVisibility(0);
                OffersAndExtraActivity.this.offerSwipeRefreshLayout.setVisibility(8);
                OffersAndExtraActivity.this.extraSwipeRefreshLayout.setVisibility(0);
                OffersAndExtraActivity.this.extraRelativeLayout.setVisibility(0);
                OffersAndExtraActivity.this.offerRelativeLayout.setVisibility(8);
                OffersAndExtraActivity.this.extraTextView.setTextColor(-1);
                OffersAndExtraActivity.this.offerTextView.setTextColor(OffersAndExtraActivity.this.getResources().getColor(R.color.secondary_txt_color));
                OffersAndExtraActivity.this.c.b();
            }
        });
        this.offerSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: com.ucare.we.presentation.offers.-$$Lambda$OffersAndExtraActivity$5UsccAncVHuVjxSqec6RKC9ecN8
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                OffersAndExtraActivity.lambda$5UsccAncVHuVjxSqec6RKC9ecN8(OffersAndExtraActivity.this);
            }
        });
        this.extraSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: com.ucare.we.presentation.offers.-$$Lambda$OffersAndExtraActivity$lxANF5Aj1NE5U-d6xqRGBuAJ-II
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                OffersAndExtraActivity.m55lambda$lxANF5Aj1NE5Ud6xqRGBuAJII(OffersAndExtraActivity.this);
            }
        });
    }

    public /* synthetic */ void s() {
        this.c.c();
    }

    public /* synthetic */ void r() {
        this.c.b();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // defpackage.dht
    public final void a(float f) {
        this.e.a();
    }

    @Override // defpackage.dht
    public final void r_() {
        this.e.a();
    }

    @Override // defpackage.dht
    public final void a(String str, String str2) {
        this.e.a();
    }

    @Override // defpackage.dht
    public final void a(String str) {
        this.e.a();
    }

    @Override // defpackage.dht
    public final void b(String str) {
        this.e.a();
    }

    @Override // defpackage.dht
    public final void a(int i, String str) {
        this.e.a();
    }

    @Override // defpackage.dht
    public final void s_() {
        this.e.a();
    }

    @Override // defpackage.dht
    public final void b(int i, String str) {
        this.e.a();
    }

    @Override // defpackage.dht
    public final void a(List<SummarizedLineUsageItem> list) {
        this.e.a();
    }

    @Override // defpackage.dht
    public final void a(cyq cyqVar) {
        this.e.a();
    }

    @Override // defpackage.dht
    public final void c(String str) {
        this.e.a();
    }

    @Override // defpackage.dht
    public final void a_(int i) {
        this.e.a();
    }

    @Override // defpackage.dht
    public final void b(List<MainPlanResponseBody> list) {
        this.e.a();
    }

    @Override // defpackage.dht
    public final void p_() {
        this.e.a();
    }

    @Override // defpackage.dht
    public final void c(List<AssociatedNumberResponseBody> list) {
        this.e.a();
    }

    @Override // defpackage.dht
    public final void q_() {
        this.e.a();
    }

    @Override // defpackage.dht
    public final void a(ArrayList<ExtrasList> arrayList) {
        this.k = arrayList;
        this.extraSwipeRefreshLayout.setRefreshing(false);
        this.e.a();
        if (arrayList.size() > 0) {
            this.extraListTitle.setVisibility(0);
            this.extraSwipeRefreshLayout.setVisibility(0);
            this.extraLoadingTextView.setVisibility(8);
            this.extraRecyclerView.setVisibility(0);
            ExtrasRecyclerViewAdapter extrasRecyclerViewAdapter = new ExtrasRecyclerViewAdapter(arrayList, this);
            this.h = extrasRecyclerViewAdapter;
            this.extraRecyclerView.setAdapter(extrasRecyclerViewAdapter);
            return;
        }
        this.extraListTitle.setVisibility(8);
        this.extraLoadingTextView.setVisibility(0);
        this.extraRecyclerView.setVisibility(8);
        this.extraLoadingTextView.setText(R.string.subscribed_to_any_extras);
    }

    @Override // defpackage.dht
    public final void a_(String str) {
        this.e.a();
        this.extraSwipeRefreshLayout.setRefreshing(false);
        this.extraLoadingTextView.setVisibility(0);
        this.extraRecyclerView.setVisibility(8);
        this.extraLoadingTextView.setText(R.string.check_network_connection);
        UnNavigateResponseActivity.a(this, str, djm.a(this, new Locale(this.a.k())).getString(R.string.please_try_again), true);
        finish();
    }

    @Override // defpackage.dht
    public final void b(ArrayList<SpecialList> arrayList) {
        this.l = arrayList;
        this.offerSwipeRefreshLayout.setRefreshing(false);
        this.e.a();
        if (arrayList.size() > 0) {
            this.offerLoadingTextView.setVisibility(8);
            this.offerRecyclerView.setVisibility(0);
            OffersRecyclerViewAdapter offersRecyclerViewAdapter = new OffersRecyclerViewAdapter(arrayList, this);
            this.g = offersRecyclerViewAdapter;
            this.i = offersRecyclerViewAdapter;
            this.offerRecyclerView.setAdapter(offersRecyclerViewAdapter);
            return;
        }
        this.offerLoadingTextView.setVisibility(0);
        this.offerRecyclerView.setVisibility(8);
        this.offerLoadingTextView.setText(R.string.subscribed_to_any_offers);
    }

    @Override // defpackage.dht
    public final void e(String str) {
        this.offerSwipeRefreshLayout.setRefreshing(false);
        this.offerLoadingTextView.setVisibility(0);
        this.offerRecyclerView.setVisibility(8);
        this.offerLoadingTextView.setText(R.string.check_network_connection);
        UnNavigateResponseActivity.a(this, str, djm.a(this, new Locale(this.a.k())).getString(R.string.please_try_again), true);
        this.e.a();
        finish();
    }

    @Override // defpackage.dht
    public final void e() {
        this.e.a();
    }

    @Override // defpackage.dht
    public final void f() {
        this.e.a();
    }

    @Override // defpackage.dht
    public final void g() {
        this.e.a();
    }

    @Override // defpackage.dht
    public final void h() {
        this.e.a();
    }

    @Override // defpackage.dht
    public final void i() {
        this.e.a();
    }

    @Override // defpackage.dht
    public final void j() {
        this.e.a();
    }

    @Override // defpackage.dfz
    public final void k() {
        this.e.a();
    }

    @Override // defpackage.dfz
    public final void l() {
        this.e.a();
    }

    @Override // defpackage.dfz
    public final void g(String str) {
        this.e.a();
        ResponseActivity.a(this, djm.a(this, new Locale(this.a.k())).getString(R.string.successfully), str, false);
    }

    @Override // defpackage.dfz
    public final void h(String str) {
        this.e.a();
        UnNavigateResponseActivity.a(this, str, djm.a(this, new Locale(this.a.k())).getString(R.string.please_try_again), true);
    }

    @Override // defpackage.dfz
    public final void i(String str) {
        this.e.a();
        ResponseActivity.a(this, djm.a(this, new Locale(this.a.k())).getString(R.string.successfully), str, false);
    }

    @Override // defpackage.dfz
    public final void c(int i, String str) {
        this.e.a();
        UnNavigateResponseActivity.b(this, str, djm.a(this, new Locale(this.a.k())).getString(R.string.please_try_again), i == 9001 || i == 8001);
    }

    @Override // defpackage.dfz
    public final void j(String str) {
        this.e.a();
        ResponseActivity.a(this, djm.a(this, new Locale(this.a.k())).getString(R.string.successfully), str, false);
    }

    @Override // defpackage.dfz
    public final void d(int i, String str) {
        if (i == 8001 || i == 9001) {
            this.e.a();
            if (this.a.v().equalsIgnoreCase("postpaid")) {
                if (this.a.k().equals("ar")) {
                    str = this.b.f.getMaximumBillLimitAr();
                } else {
                    str = this.b.f.getMaximumBillLimitEn();
                }
            }
            UnNavigateResponseActivity.b(this, str, djm.a(this, new Locale(this.a.k())).getString(R.string.please_try_again), true);
            return;
        }
        this.e.a();
        UnNavigateResponseActivity.a(this, str, djm.a(this, new Locale(this.a.k())).getString(R.string.please_try_again), true);
    }

    @Override // defpackage.dfz
    public final void m() {
        this.e.a();
    }

    @Override // defpackage.dfz
    public final void q() {
        this.e.a();
    }

    @Override // defpackage.dcp
    public final void a(String str, String str2, String str3) {
        this.m = str;
        Intent intent = new Intent(this, GenericConfirmationActivity.class);
        intent.putExtra("confirmation_title", str2);
        intent.putExtra("confirmation_hint", getString(R.string.unsubscribe_bundle_text) + " " + str3 + getString(R.string.quest));
        startActivityForResult(intent, 3);
    }

    @Override // defpackage.dcp
    public final void b(String str, String str2, String str3) {
        this.m = str;
        Intent intent = new Intent(this, GenericConfirmationActivity.class);
        intent.putExtra("confirmation_title", str2);
        intent.putExtra("confirmation_hint", getString(R.string.subscribe_to) + str3 + getString(R.string.quest));
        startActivityForResult(intent, 4);
    }

    @Override // defpackage.dcp
    public final void b(String str, String str2) {
        this.m = str;
        Intent intent = new Intent(this, GenericConfirmationActivity.class);
        intent.putExtra("confirmation_title", getString(R.string.renew));
        intent.putExtra("confirmation_hint", getString(R.string.update_bundle) + str2 + getString(R.string.quest));
        startActivityForResult(intent, 5);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 3) {
            if (i2 != -1) {
                return;
            }
            this.e.a(this, getString(R.string.loading));
            this.d.b(this.m);
        } else if (i == 4) {
            if (i2 != -1) {
                return;
            }
            this.e.a(this, getString(R.string.loading));
            this.d.c(this.m);
        } else if (i != 5 || i2 != -1) {
        } else {
            this.e.a(this, getString(R.string.loading));
            this.d.a(this.m);
        }
    }
}
