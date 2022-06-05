package com.ucare.we.presentation.search;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.nex3z.flowlayout.FlowLayout;
import com.ucare.we.BalanceRechargeActivity;
import com.ucare.we.PayBillActivity;
import com.ucare.we.QueryTicketActivity;
import com.ucare.we.QuotaTransfer.QuotaTransferActivity;
import com.ucare.we.R;
import com.ucare.we.RequestDeviceActivity;
import com.ucare.we.RequestRouterUserNamePasswordActivity;
import com.ucare.we.SuspendAndResumeActivity;
import com.ucare.we.TroubleOrServicesRequestTicketActivity;
import com.ucare.we.UsageDetailsScreenActivity;
import com.ucare.we.autopayment.AutoPayment_RechargeBill_Activity;
import com.ucare.we.balancetransferhistory.BalanceTransferHistoryActivity;
import com.ucare.we.billlimit.BillLimitActivity;
import com.ucare.we.billservices.BillServicesActivity;
import com.ucare.we.billsummary.BillSummaryActivity;
import com.ucare.we.manageplanspostpaid.ManagePostPaidPlanActivity;
import com.ucare.we.model.SearchModel.SearchItem;
import com.ucare.we.paybillpaymentmethod.PaymentMethodActivity;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import com.ucare.we.paymenthistory.PaymentHistoryPostPaidActivity;
import com.ucare.we.preferrednumber.PreferedNumberActivity;
import com.ucare.we.presentation.fmcuser.FMCMSISDNSelector.FMCMSISDNSelector;
import com.ucare.we.presentation.offers.OffersAndExtraActivity;
import com.ucare.we.presentation.paymenthistory.PaymentHistoryActivity;
import com.ucare.we.presentation.profile.myaccount.MyAccountActivity;
import com.ucare.we.presentation.switchaccount.SwitchAccountPostPaidActivity;
import java.util.ArrayList;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class SearchActivity extends czy {
    @Inject
    djw a;
    @Inject
    dhp b;
    ImageView c;
    @Inject
    dio d;
    @Inject
    dhp e;
    @Inject
    dhn f;
    ArrayList g = new ArrayList();
    ArrayList<SearchItem> h = new ArrayList<>();
    FlowLayout i;

    /* renamed from: lambda$74ekpbJxAwQhlg0DPgu1W-TNYDk */
    public static /* synthetic */ void m69lambda$74ekpbJxAwQhlg0DPgu1WTNYDk(SearchActivity searchActivity, View view) {
        searchActivity.a(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x025e A[LOOP:0: B:83:0x0256->B:85:0x025e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02a5 A[LOOP:1: B:87:0x029f->B:89:0x02a5, LOOP_END] */
    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ucare.we.presentation.search.SearchActivity.onCreate(android.os.Bundle):void");
    }

    public /* synthetic */ void a(View view) {
        finish();
    }

    final TextView a(final String str) {
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextSize(2, 13.0f);
        textView.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/montserrat_medium.ttf"));
        textView.setPadding(a(16), a(8), a(16), a(8));
        textView.setBackgroundResource(R.drawable.label_bg);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.search.SearchActivity.2
            {
                SearchActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Intent intent = new Intent();
                if (str.equals(SearchActivity.this.getString(R.string.anonymous_adsl_payment)) || str.equals(SearchActivity.this.getString(R.string.anonymous_recharge))) {
                    intent.setClass(SearchActivity.this, PayBillActivity.class);
                } else if (str.equals(SearchActivity.this.getString(R.string.Suspend_resume_service))) {
                    intent.setClass(SearchActivity.this, SuspendAndResumeActivity.class);
                } else if (str.equals(SearchActivity.this.getString(R.string.request_device))) {
                    intent.setClass(SearchActivity.this, RequestDeviceActivity.class);
                } else if (str.equals(SearchActivity.this.getString(R.string.request_adsl_username_password))) {
                    if (SearchActivity.this.d.l()) {
                        Intent intent2 = new Intent(SearchActivity.this, FMCMSISDNSelector.class);
                        intent2.putExtra("FMC_NUMBER_TYPE", 2);
                        SearchActivity.this.startActivityForResult(intent2, 92);
                        return;
                    }
                    intent.setClass(SearchActivity.this, RequestRouterUserNamePasswordActivity.class);
                } else if (str.equals(SearchActivity.this.getString(R.string.query_request))) {
                    intent.setClass(SearchActivity.this, QueryTicketActivity.class);
                } else if (str.equals(SearchActivity.this.getString(R.string.submit_trouble_ticket))) {
                    intent.setClass(SearchActivity.this, TroubleOrServicesRequestTicketActivity.class);
                    intent.putExtra("TROUBLE_TICKET_ACTIVITY_KEY", "TROUBLE_TICKET");
                } else if (str.equals(SearchActivity.this.getString(R.string.submit_service_ticket))) {
                    intent.setClass(SearchActivity.this, TroubleOrServicesRequestTicketActivity.class);
                    intent.putExtra("TROUBLE_TICKET_ACTIVITY_KEY", "SERVICE_TICKET");
                } else if (str.equals(SearchActivity.this.getString(R.string.quota_transfer))) {
                    intent.setClass(SearchActivity.this, QuotaTransferActivity.class);
                    intent.putExtra("SCREEN_TYPE", 0);
                } else if (str.equals(SearchActivity.this.getString(R.string.balance_transfer_history))) {
                    intent.setClass(SearchActivity.this, BalanceTransferHistoryActivity.class);
                } else if (str.equals(SearchActivity.this.getString(R.string.auto_recharge)) || str.equals(SearchActivity.this.getString(R.string.auto_pay))) {
                    intent = new Intent(SearchActivity.this, AutoPayment_RechargeBill_Activity.class);
                    if (SearchActivity.this.d.d()) {
                        intent.putExtra("AutomaticType", "prepaid");
                    } else {
                        intent.putExtra("AutomaticType", "postpaid");
                    }
                } else if (str.equals(SearchActivity.this.getString(R.string.profile))) {
                    intent.setClass(SearchActivity.this, MyAccountActivity.class);
                    if (SearchActivity.this.d.d()) {
                        if (SearchActivity.this.a.w().equalsIgnoreCase("PREPAID_CORPORATE_PS_DEFAULT_USER")) {
                            intent.putExtra("GENERIC_ACTIVITY", "PRE_PAID_MY_ACCOUNT_FRAGMENT");
                        } else if (SearchActivity.this.a.w().equalsIgnoreCase("PREPAID_CORPORATE_PS_FD_USER")) {
                            intent.putExtra("GENERIC_ACTIVITY", "PRE_PAID_MY_ACCOUNT_FRAGMENT");
                        } else if (SearchActivity.this.a.w().equalsIgnoreCase("PREPAID_INDIVIDUAL_FD_DEFAULT_USER")) {
                            intent.putExtra("GENERIC_ACTIVITY", "PRE_PAID_MY_ACCOUNT_FRAGMENT");
                        } else {
                            intent.putExtra("GENERIC_ACTIVITY", "PRE_PAID_MY_ACCOUNT_FRAGMENT");
                        }
                    } else if (SearchActivity.this.d.e()) {
                        if (SearchActivity.this.a.w().equalsIgnoreCase("POSTPAID_CORPORATE_PS_DEFAULT_USER")) {
                            intent.putExtra("GENERIC_ACTIVITY", "POST_PAID_MY_ACCOUNT_FRAGMENT");
                        } else if (SearchActivity.this.a.w().equalsIgnoreCase("POSTPAID_CORPORATE_PS_FD_USER")) {
                            intent.putExtra("GENERIC_ACTIVITY", "POST_PAID_MY_ACCOUNT_FRAGMENT");
                        } else if (SearchActivity.this.a.w().equalsIgnoreCase("POSTPAID_INDIVIDUAL_FD_DEFAULT_USER")) {
                            intent.putExtra("GENERIC_ACTIVITY", "POST_PAID_MY_ACCOUNT_FRAGMENT");
                        } else {
                            intent.putExtra("GENERIC_ACTIVITY", "POST_PAID_MY_ACCOUNT_FRAGMENT");
                        }
                    }
                } else if (str.equals(SearchActivity.this.getString(R.string.offering_usage))) {
                    intent.setClass(SearchActivity.this, UsageDetailsScreenActivity.class);
                    intent.putExtra("USAGE_DETAILS_ACIIVITY", "USAGE_DETAILS_SEARCH_VIEW");
                } else if (str.equals(SearchActivity.this.getString(R.string.recharge_Payment))) {
                    intent.setClass(SearchActivity.this, BalanceRechargeActivity.class);
                } else if (str.equals(SearchActivity.this.getString(R.string.bill_summary))) {
                    intent.setClass(SearchActivity.this, BillSummaryActivity.class);
                } else if (str.equals(SearchActivity.this.getString(R.string.bill_payment))) {
                    intent.setClass(SearchActivity.this, BillServicesActivity.class);
                } else if (str.equals(SearchActivity.this.getString(R.string.auto_pay_search_keyword))) {
                    intent.setClass(SearchActivity.this, MyAccountActivity.class);
                    if (SearchActivity.this.d.d()) {
                        if (SearchActivity.this.a.w().equalsIgnoreCase("PREPAID_CORPORATE_PS_DEFAULT_USER")) {
                            intent.putExtra("GENERIC_ACTIVITY", "PRE_PAID_MY_ACCOUNT_FRAGMENT");
                        } else if (SearchActivity.this.a.w().equalsIgnoreCase("PREPAID_CORPORATE_PS_FD_USER")) {
                            intent.putExtra("GENERIC_ACTIVITY", "PRE_PAID_MY_ACCOUNT_FRAGMENT");
                        } else if (SearchActivity.this.a.w().equalsIgnoreCase("PREPAID_INDIVIDUAL_FD_DEFAULT_USER")) {
                            intent.putExtra("GENERIC_ACTIVITY", "PRE_PAID_MY_ACCOUNT_FRAGMENT");
                        } else {
                            intent.putExtra("GENERIC_ACTIVITY", "PRE_PAID_MY_ACCOUNT_FRAGMENT");
                        }
                    } else if (SearchActivity.this.d.e()) {
                        if (SearchActivity.this.a.w().equalsIgnoreCase("POSTPAID_CORPORATE_PS_DEFAULT_USER")) {
                            intent.putExtra("GENERIC_ACTIVITY", "POST_PAID_MY_ACCOUNT_FRAGMENT");
                        } else if (SearchActivity.this.a.w().equalsIgnoreCase("POSTPAID_CORPORATE_PS_FD_USER")) {
                            intent.putExtra("GENERIC_ACTIVITY", "POST_PAID_MY_ACCOUNT_FRAGMENT");
                        } else if (SearchActivity.this.a.w().equalsIgnoreCase("POSTPAID_INDIVIDUAL_FD_DEFAULT_USER")) {
                            intent.putExtra("GENERIC_ACTIVITY", "POST_PAID_MY_ACCOUNT_FRAGMENT");
                        } else {
                            intent.putExtra("GENERIC_ACTIVITY", "POST_PAID_MY_ACCOUNT_FRAGMENT");
                        }
                    }
                } else if (str.equals(SearchActivity.this.getString(R.string.balance_details))) {
                    if (SearchActivity.this.d.d()) {
                        intent.setClass(SearchActivity.this, PaymentHistoryActivity.class);
                    } else if (SearchActivity.this.d.e()) {
                        intent.setClass(SearchActivity.this, PaymentHistoryPostPaidActivity.class);
                    }
                } else if (str.equals(SearchActivity.this.getString(R.string.payment_history))) {
                    intent.setClass(SearchActivity.this, PaymentHistoryPostPaidActivity.class);
                } else if (str.equals(SearchActivity.this.getString(R.string.payment))) {
                    if (SearchActivity.this.d.e()) {
                        intent.setClass(SearchActivity.this, PaymentMethodActivity.class);
                    } else {
                        intent.setClass(SearchActivity.this, BalanceRechargeActivity.class);
                    }
                } else if (str.equals(SearchActivity.this.getString(R.string.bill_limit))) {
                    intent.setClass(SearchActivity.this, BillLimitActivity.class);
                } else if (str.equals(SearchActivity.this.getString(R.string.plans_and_services))) {
                    if (SearchActivity.this.a.R()) {
                        if (SearchActivity.this.d.d()) {
                            intent.setClass(SearchActivity.this, ManagePostPaidPlanActivity.class);
                        } else if (SearchActivity.this.d.e()) {
                            intent.setClass(SearchActivity.this, ManagePostPaidPlanActivity.class);
                        }
                    } else if (SearchActivity.this.a.b("en").equalsIgnoreCase("en")) {
                        SearchActivity searchActivity = SearchActivity.this;
                        UnNavigateResponseActivity.a(searchActivity, searchActivity.f.f.getMobile_app_main_invalid_en(), SearchActivity.this.f.f.getMobile_app_main_invalid_desc_en(), true);
                        return;
                    } else {
                        SearchActivity searchActivity2 = SearchActivity.this;
                        UnNavigateResponseActivity.a(searchActivity2, searchActivity2.f.f.getMobile_app_main_invalid_ar(), SearchActivity.this.f.f.getMobile_app_main_invalid_desc_ar(), true);
                        return;
                    }
                } else if (str.equals(SearchActivity.this.getString(R.string.change_plan))) {
                    if (SearchActivity.this.a.R()) {
                        if (SearchActivity.this.d.d()) {
                            intent.setClass(SearchActivity.this, ManagePostPaidPlanActivity.class);
                        } else if (SearchActivity.this.d.e()) {
                            intent.setClass(SearchActivity.this, ManagePostPaidPlanActivity.class);
                        }
                    } else if (SearchActivity.this.a.b("en").equalsIgnoreCase("en")) {
                        SearchActivity searchActivity3 = SearchActivity.this;
                        UnNavigateResponseActivity.a(searchActivity3, searchActivity3.f.f.getMobile_app_main_invalid_en(), SearchActivity.this.f.f.getMobile_app_main_invalid_desc_en(), true);
                        return;
                    } else {
                        SearchActivity searchActivity4 = SearchActivity.this;
                        UnNavigateResponseActivity.a(searchActivity4, searchActivity4.f.f.getMobile_app_main_invalid_ar(), SearchActivity.this.f.f.getMobile_app_main_invalid_desc_ar(), true);
                        return;
                    }
                } else if (str.equals(SearchActivity.this.getString(R.string.favorite_numbers))) {
                    if (SearchActivity.this.d.l()) {
                        Intent intent3 = new Intent(SearchActivity.this, FMCMSISDNSelector.class);
                        intent3.putExtra("FMC_NUMBER_TYPE", 1);
                        SearchActivity.this.startActivityForResult(intent3, 90);
                        return;
                    }
                    intent.setClass(SearchActivity.this, PreferedNumberActivity.class);
                } else if (str.equals(SearchActivity.this.getString(R.string.balance_transfer))) {
                    intent.setClass(SearchActivity.this, QuotaTransferActivity.class);
                    intent.putExtra("SCREEN_TYPE", 1);
                } else if (str.equals(SearchActivity.this.getString(R.string.offers_and_extras))) {
                    intent.setClass(SearchActivity.this, OffersAndExtraActivity.class);
                } else if (str.equals(SearchActivity.this.getString(R.string.account_managment))) {
                    intent.setClass(SearchActivity.this, SwitchAccountPostPaidActivity.class);
                }
                SearchActivity.this.startActivity(intent);
            }
        });
        return textView;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 90) {
            if (intent == null) {
                return;
            }
            String stringExtra = intent.getStringExtra("FMC_SELECTED_MSISDN");
            Intent intent2 = new Intent(this, PreferedNumberActivity.class);
            intent2.putExtra("FMC_SELECTED_MSISDN", stringExtra);
            startActivity(intent2);
        } else if (i != 92 || intent == null) {
        } else {
            String stringExtra2 = intent.getStringExtra("FMC_SELECTED_MSISDN");
            Intent intent3 = new Intent(this, RequestRouterUserNamePasswordActivity.class);
            intent3.putExtra("FMC_SELECTED_MSISDN", stringExtra2);
            startActivity(intent3);
        }
    }

    private int a(int i) {
        Resources resources = getResources();
        dqc.a((Object) resources, "resources");
        return (int) TypedValue.applyDimension(1, i, resources.getDisplayMetrics());
    }

    private void a() {
        if (this.d.h()) {
            if (!this.d.i()) {
                this.g.add(getString(R.string.plans_and_services));
            }
        } else {
            this.g.add(getString(R.string.plans_and_services));
        }
        if (this.e.s().booleanValue()) {
            this.g.add(getString(R.string.change_plan));
        }
        if (this.e.t().booleanValue()) {
            this.g.add(getString(R.string.offers_and_extras));
        }
        if (this.e.n().booleanValue()) {
            this.g.add(getString(R.string.anonymous_recharge));
        }
        if (this.e.n().booleanValue()) {
            this.g.add(getString(R.string.anonymous_adsl_payment));
        }
        this.g.add(getString(R.string.account_managment));
        this.g.add(getString(R.string.profile));
        if (this.e.u().booleanValue()) {
            this.g.add(getString(R.string.offering_usage));
        }
        h();
    }

    private void b() {
        if (this.b.g == null || this.b.g.getSearchableItemsSuspendReactivate() == null || !this.b.g.getSearchableItemsSuspendReactivate().contains(this.a.w())) {
            return;
        }
        this.g.add(getString(R.string.Suspend_resume_service));
    }

    private void c() {
        if (this.b.r().booleanValue()) {
            this.g.add(getString(R.string.bill_limit));
        }
    }

    private void d() {
        if (this.b.v().booleanValue()) {
            this.g.add(getString(R.string.favorite_numbers));
        }
    }

    private void e() {
        if (this.b.z().booleanValue()) {
            this.g.add(getString(R.string.request_adsl_username_password));
        }
    }

    private void f() {
        if (this.f.f.isFeatureAutorecharge() && !this.d.h()) {
            this.g.add(getString(R.string.auto_recharge));
        }
    }

    private void g() {
        if (this.f.f.isAutopaymentEnabled() && !this.d.h()) {
            this.g.add(getString(R.string.auto_pay));
        }
    }

    private void h() {
        if (this.b.g == null || this.b.g.getBalanceTransferButton() == null || !this.b.g.getBalanceTransferButton().contains(this.a.w())) {
            return;
        }
        this.g.add(getString(R.string.balance_transfer));
    }

    private void i() {
        if (this.b.g == null || this.b.g.getBalanceTransferHistorySearchItem() == null || !this.b.g.getBalanceTransferHistorySearchItem().contains(this.a.w())) {
            return;
        }
        this.g.add(getString(R.string.balance_transfer_history));
    }

    private void j() {
        if (this.e.p().booleanValue()) {
            this.g.add(getString(R.string.payment));
        }
    }
}
