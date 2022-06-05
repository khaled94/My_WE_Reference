package com.ucare.we.bankcardpaymentpostpaid;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import com.android.volley.AuthFailureError;
import com.ucare.we.R;
import com.ucare.we.model.BankCardPaymentPostpaidModel.BankCardModelPaymentPostPaidRequest;
import com.ucare.we.model.BankCardPaymentPostpaidModel.BankCardModelPaymentPostPaidRequestBody;
import com.ucare.we.model.MainRequestsHeader;
import com.ucare.we.model.PaymentModels.PaymentBankResponseBody;
import defpackage.au;
import defpackage.djl;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PostpaidPaymentActivity extends czy implements cxv, dju {
    @Inject
    djw a;
    @Inject
    djx b;
    @Inject
    djg c;
    @Inject
    dhn d;
    private Button e;
    private int f;
    private String g;
    private final String h = "https://my.te.eg/";
    private WebView i;
    private String j;
    private String k;
    private Context l;
    private cxu m;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_payment_gateway);
        a(getString(R.string.pay_bill), false, false);
        if (getIntent().getExtras() != null) {
            this.f = getIntent().getExtras().getInt("amount");
            this.g = getIntent().getStringExtra("targetNumber");
        }
        this.l = this;
        Button button = (Button) findViewById(R.id.btn_current_number);
        this.e = button;
        button.setText(this.g);
        this.i = (WebView) findViewById(R.id.wvPayment);
        this.m = new cxu(this.l, this, this);
        this.i.getSettings().setJavaScriptEnabled(true);
        this.i.getSettings().setBuiltInZoomControls(true);
        this.i.getSettings().setDisplayZoomControls(false);
        this.i.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.i.getSettings().setAllowContentAccess(true);
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.i, true);
        } else {
            CookieManager.getInstance().setAcceptCookie(true);
        }
        try {
            this.m.a(this.f, this.g);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.cxv
    public final void a(PaymentBankResponseBody paymentBankResponseBody) {
        this.k = String.valueOf(paymentBankResponseBody.transactionID);
        this.j = paymentBankResponseBody.hashCode;
        this.i.setWebViewClient(new WebViewClient() { // from class: com.ucare.we.bankcardpaymentpostpaid.PostpaidPaymentActivity.1
            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (str.equalsIgnoreCase("https://my.te.eg/?transactionHashCode=" + PostpaidPaymentActivity.this.j + "&sourceTransactionId=" + PostpaidPaymentActivity.this.k) || str.contains("topgErrorPage")) {
                    PostpaidPaymentActivity.this.i.stopLoading();
                    try {
                        cxu cxuVar = PostpaidPaymentActivity.this.m;
                        String str2 = PostpaidPaymentActivity.this.j;
                        String str3 = PostpaidPaymentActivity.this.k;
                        String unused = PostpaidPaymentActivity.this.g;
                        cxuVar.b.a(true);
                        final djl a = djl.a(cxuVar.a);
                        au.b<JSONObject> bVar = cxuVar.i;
                        au.a aVar = cxuVar.d;
                        BankCardModelPaymentPostPaidRequest bankCardModelPaymentPostPaidRequest = new BankCardModelPaymentPostPaidRequest();
                        MainRequestsHeader mainRequestsHeader = new MainRequestsHeader();
                        mainRequestsHeader.setTimstamp((int) (System.currentTimeMillis() / 1000));
                        mainRequestsHeader.setMsisdn(Integer.valueOf(a.d.m()).intValue());
                        mainRequestsHeader.setLocale(a.c.c.k());
                        bankCardModelPaymentPostPaidRequest.setHeader(mainRequestsHeader);
                        BankCardModelPaymentPostPaidRequestBody bankCardModelPaymentPostPaidRequestBody = new BankCardModelPaymentPostPaidRequestBody();
                        bankCardModelPaymentPostPaidRequestBody.setHashCode(str2);
                        bankCardModelPaymentPostPaidRequestBody.setTransactionID(str3);
                        bankCardModelPaymentPostPaidRequestBody.setTargetMobileNumber(a.d.m());
                        bankCardModelPaymentPostPaidRequest.setBody(bankCardModelPaymentPostPaidRequestBody);
                        bj bjVar = new bj("https://api-my.te.eg/api/payment/pay/unregisteredcard/finalize", new JSONObject(a.a.a(bankCardModelPaymentPostPaidRequest)), bVar, aVar) { // from class: djl.8
                            @Override // defpackage.as
                            public final Map<String, String> c() throws AuthFailureError {
                                HashMap hashMap = new HashMap();
                                hashMap.put("Jwt", a.d.I());
                                return hashMap;
                            }
                        };
                        bjVar.l = djl.a.MAIN_PLAN;
                        bjVar.j = new am(60000, 0, 0.0f);
                        a.b.a((as) bjVar);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    return true;
                }
                return false;
            }
        });
        this.i.loadUrl(this.d.f.getTopG() + this.j);
    }

    @Override // defpackage.cxv
    public final void a(boolean z) {
        if (z) {
            this.c.a(this.l, getString(R.string.loading));
        } else {
            this.c.a();
        }
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this.l, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        try {
            this.m.a(this.f, this.g);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
