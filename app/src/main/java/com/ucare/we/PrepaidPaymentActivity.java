package com.ucare.we;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import androidx.exifinterface.media.ExifInterface;
import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import com.ucare.we.paybillpostpaidvoucher.ResponseActivity;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import defpackage.au;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PrepaidPaymentActivity extends czy implements View.OnClickListener {
    @Inject
    djw a;
    @Inject
    djb b;
    @Inject
    djx c;
    @Inject
    dhn d;
    Button e;
    private Double f;
    private String g;
    private final String h = "https://my.te.eg/";
    private WebView i;
    private ProgressDialog j;
    private String k;
    private String l;
    private Context m;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_payment_gateway);
        a(getString(R.string.payment), false, false);
        String stringExtra = getIntent().getStringExtra("amount");
        if (stringExtra != null) {
            stringExtra = stringExtra.replaceAll("١", "1").replaceAll("٢", ExifInterface.GPS_MEASUREMENT_2D).replaceAll("٣", ExifInterface.GPS_MEASUREMENT_3D).replaceAll("٤", "4").replaceAll("٥", "5").replaceAll("٦", "6").replaceAll("٧", "7").replaceAll("٨", "8").replaceAll("٩", "9").replaceAll("٠", "0").replaceAll("٫", ".");
        }
        this.f = Double.valueOf(Double.parseDouble(stringExtra));
        this.g = getIntent().getStringExtra("targetNumber");
        this.m = this;
        Button button = (Button) findViewById(R.id.btn_current_number);
        this.e = button;
        button.setText(this.g);
        WebView webView = (WebView) findViewById(R.id.wvPayment);
        this.i = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.i.getSettings().setBuiltInZoomControls(true);
        this.i.getSettings().setDisplayZoomControls(false);
        this.i.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.i.getSettings().setAllowContentAccess(true);
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.i, true);
        } else {
            CookieManager.getInstance().setAcceptCookie(true);
        }
        a((Context) this);
        at a = bm.a(this, null);
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("timestamp", System.currentTimeMillis() / 1000);
            jSONObject2.put("msisdn", this.a.m());
            jSONObject2.put("locale", this.b.c.k());
            jSONObject.put("header", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("redirectionURL", "https://my.te.eg/");
            jSONObject3.put("amount", this.f);
            jSONObject3.put("sourceMobileNumber", this.a.m());
            jSONObject3.put("targetMobileNumber", this.g);
            jSONObject.put("body", jSONObject3);
            a.a((as) new bj("https://api-my.te.eg/api/payment/pay/unregisteredcard/initiate", jSONObject, new au.b<JSONObject>() { // from class: com.ucare.we.PrepaidPaymentActivity.1
                @Override // defpackage.au.b
                public final /* synthetic */ void onResponse(JSONObject jSONObject4) {
                    String str;
                    JSONObject jSONObject5 = jSONObject4;
                    PrepaidPaymentActivity.this.a();
                    String str2 = "-1";
                    try {
                        JSONObject jSONObject6 = jSONObject5.getJSONObject("header");
                        str2 = jSONObject6.getString("responseCode");
                        str = jSONObject6.getString("responseMessage");
                    } catch (JSONException e) {
                        e.printStackTrace();
                        str = "";
                    }
                    if (!str2.equalsIgnoreCase("0")) {
                        UnNavigateResponseActivity.a(PrepaidPaymentActivity.this.m, str, PrepaidPaymentActivity.this.m.getString(R.string.please_try_again), true);
                        PrepaidPaymentActivity.this.finish();
                        return;
                    }
                    PrepaidPaymentActivity.a(PrepaidPaymentActivity.this, jSONObject5);
                }
            }, new au.a() { // from class: com.ucare.we.PrepaidPaymentActivity.2
                @Override // defpackage.au.a
                public final void onErrorResponse(VolleyError volleyError) {
                    PrepaidPaymentActivity prepaidPaymentActivity = PrepaidPaymentActivity.this;
                    prepaidPaymentActivity.a(prepaidPaymentActivity.m.getString(R.string.error_bill_charging_init));
                    PrepaidPaymentActivity.this.a();
                }
            }) { // from class: com.ucare.we.PrepaidPaymentActivity.3
                @Override // defpackage.as
                public final Map<String, String> c() throws AuthFailureError {
                    HashMap hashMap = new HashMap();
                    hashMap.put("Jwt", PrepaidPaymentActivity.this.a.I());
                    return hashMap;
                }
            });
        } catch (JSONException e) {
            e.printStackTrace();
            a(e.toString());
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        UnNavigateResponseActivity.a(this, str, getString(R.string.error_bill_charging_init), true);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        this.c.a(this, str, -1, ErrorHandlerActivity.class);
        setResult(0);
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        ProgressDialog progressDialog = this.j;
        if (progressDialog != null && progressDialog.isShowing()) {
            a();
        }
        ProgressDialog progressDialog2 = new ProgressDialog(context);
        this.j = progressDialog2;
        progressDialog2.setMessage(getString(R.string.starting_bill_payment));
        this.j.setCancelable(false);
        this.j.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ProgressDialog progressDialog = this.j;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.imgBackButton) {
            finish();
        }
    }

    static /* synthetic */ void a(PrepaidPaymentActivity prepaidPaymentActivity, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("body");
            prepaidPaymentActivity.k = jSONObject2.getString("hashCode");
            prepaidPaymentActivity.l = jSONObject2.getString("transactionID");
            prepaidPaymentActivity.i.setWebViewClient(new WebViewClient() { // from class: com.ucare.we.PrepaidPaymentActivity.4
                @Override // android.webkit.WebViewClient
                public final void onReceivedError(WebView webView, int i, String str, String str2) {
                    super.onReceivedError(webView, i, str, str2);
                }

                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (str.equalsIgnoreCase("https://my.te.eg/?transactionHashCode=" + PrepaidPaymentActivity.this.k + "&sourceTransactionId=" + PrepaidPaymentActivity.this.l) || str.contains("topgErrorPage")) {
                        PrepaidPaymentActivity.this.i.stopLoading();
                        PrepaidPaymentActivity prepaidPaymentActivity2 = PrepaidPaymentActivity.this;
                        prepaidPaymentActivity2.a((Context) prepaidPaymentActivity2);
                        PrepaidPaymentActivity.f(PrepaidPaymentActivity.this);
                        return true;
                    }
                    return false;
                }
            });
            prepaidPaymentActivity.i.loadUrl(prepaidPaymentActivity.d.f.getTopG() + prepaidPaymentActivity.k);
        } catch (JSONException e) {
            e.printStackTrace();
            prepaidPaymentActivity.a(e.toString());
        }
    }

    static /* synthetic */ void f(PrepaidPaymentActivity prepaidPaymentActivity) {
        at a = bm.a(prepaidPaymentActivity, null);
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("timestamp", System.currentTimeMillis() / 1000);
            jSONObject2.put("msisdn", prepaidPaymentActivity.a.m());
            jSONObject2.put("locale", prepaidPaymentActivity.b.c.k());
            jSONObject.put("header", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("hashCode", prepaidPaymentActivity.k);
            jSONObject3.put("transactionID", prepaidPaymentActivity.l);
            jSONObject3.put("targetMobileNumber", prepaidPaymentActivity.g);
            jSONObject.put("body", jSONObject3);
            a.a((as) new bj("https://api-my.te.eg/api/payment/pay/unregisteredcard/finalize", jSONObject, new au.b<JSONObject>() { // from class: com.ucare.we.PrepaidPaymentActivity.5
                @Override // defpackage.au.b
                public final /* synthetic */ void onResponse(JSONObject jSONObject4) {
                    PrepaidPaymentActivity.b(PrepaidPaymentActivity.this, jSONObject4);
                    PrepaidPaymentActivity.this.a();
                }
            }, new au.a() { // from class: com.ucare.we.PrepaidPaymentActivity.6
                @Override // defpackage.au.a
                public final void onErrorResponse(VolleyError volleyError) {
                    PrepaidPaymentActivity prepaidPaymentActivity2 = PrepaidPaymentActivity.this;
                    prepaidPaymentActivity2.b(prepaidPaymentActivity2.getString(R.string.bill_payment_Error_alert_message));
                    PrepaidPaymentActivity.this.a();
                }
            }) { // from class: com.ucare.we.PrepaidPaymentActivity.7
                @Override // defpackage.as
                public final Map<String, String> c() throws AuthFailureError {
                    HashMap hashMap = new HashMap();
                    hashMap.put("Jwt", PrepaidPaymentActivity.this.a.I());
                    return hashMap;
                }
            });
        } catch (JSONException e) {
            e.printStackTrace();
            prepaidPaymentActivity.b(e.toString());
            prepaidPaymentActivity.a();
        }
    }

    static /* synthetic */ void b(PrepaidPaymentActivity prepaidPaymentActivity, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("body");
            JSONObject jSONObject3 = jSONObject.getJSONObject("header");
            jSONObject3.getInt("responseCode");
            String string = jSONObject3.getString("responseMessage");
            if (jSONObject2.getString("paymentNarration") != null) {
                ResponseActivity.a(prepaidPaymentActivity, prepaidPaymentActivity.m.getString(R.string.successfully), string, false);
            } else {
                prepaidPaymentActivity.b(string);
            }
        } catch (JSONException e) {
            e.printStackTrace();
            prepaidPaymentActivity.b(prepaidPaymentActivity.getString(R.string.bill_payment_Error_alert_message));
        }
    }
}
