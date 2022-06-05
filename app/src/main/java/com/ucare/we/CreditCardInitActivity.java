package com.ucare.we;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import com.ucare.we.model.CreditCardInitResponseBody;
import com.ucare.we.model.PaymentHistoryResponseBody;
import com.ucare.we.presentation.prepaid.MainActivity;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class CreditCardInitActivity extends czy implements View.OnClickListener, dhz, dim {
    String a;
    String b;
    @Inject
    dia c;
    @Inject
    din d;
    @Inject
    djw e;
    @Inject
    dja f;
    @Inject
    djg g;
    @Inject
    djb h;
    ArrayList<String> i;
    @Inject
    djx j;
    @Inject
    dhn k;
    boolean l;
    TextView m;
    ImageView n;
    private WebView o;
    private String p;
    private String q;
    private int r;

    @Override // defpackage.dhz
    public final void a() {
    }

    @Override // defpackage.dhz
    public final void a(int i, String str) {
    }

    @Override // defpackage.dhz
    public final void a(List<PaymentHistoryResponseBody> list) {
    }

    @Override // defpackage.dhz
    public final void b(int i, String str) {
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.h.g().equalsIgnoreCase("ar")) {
            this.l = true;
        } else {
            this.l = false;
        }
        setContentView(R.layout.activity_credit_card_init);
        if (this.l) {
            this.h.c();
        } else {
            this.h.d();
        }
        this.n = (ImageView) findViewById(R.id.imgBackButton);
        TextView textView = (TextView) findViewById(R.id.txtTitle);
        this.m = textView;
        textView.setText(getString(R.string.credit_card));
        this.i = new ArrayList<>();
        this.b = getIntent().getStringExtra("targetNumber");
        this.a = getIntent().getStringExtra("amount");
        WebView webView = (WebView) findViewById(R.id.wvPayment);
        this.o = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.o.getSettings().setBuiltInZoomControls(true);
        this.o.getSettings().setDisplayZoomControls(false);
        this.o.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.o.getSettings().setAllowContentAccess(true);
        this.o.setWebViewClient(new WebViewClient() { // from class: com.ucare.we.CreditCardInitActivity.1
        });
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.o, true);
        } else {
            CookieManager.getInstance().setAcceptCookie(true);
        }
        this.d.a(this);
        this.c.a(this);
        TextUtils.isEmpty(this.b);
        this.g.a(this, getString(R.string.loading));
        c();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.imgBackButton) {
            finish();
        } else if (id != R.id.iv_close) {
        } else {
            Intent intent = new Intent(this, MainActivity.class);
            intent.addFlags(603979776);
            startActivity(intent);
            finish();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.c.b(this);
        this.d.b(this);
        this.i.clear();
        super.onDestroy();
    }

    @Override // defpackage.dhz
    public final void a(CreditCardInitResponseBody creditCardInitResponseBody) {
        this.g.a();
        this.p = creditCardInitResponseBody.getHashCode();
        this.r = creditCardInitResponseBody.getTransactionID();
        this.q = creditCardInitResponseBody.getMobileNumber();
        WebView webView = this.o;
        webView.loadUrl(this.k.f.getTopG() + this.p);
        new StringBuilder().append(this.r);
        this.o.setWebViewClient(new WebViewClient() { // from class: com.ucare.we.CreditCardInitActivity.2
            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView2, int i, String str, String str2) {
                super.onReceivedError(webView2, i, str, str2);
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                if (str.equalsIgnoreCase("https://my.te.eg/?transactionHashCode=" + CreditCardInitActivity.this.p + "&sourceTransactionId=" + CreditCardInitActivity.this.r)) {
                    CreditCardInitActivity.this.c.a(CreditCardInitActivity.this.p, String.valueOf(CreditCardInitActivity.this.r), CreditCardInitActivity.this.q);
                }
                if (CreditCardInitActivity.this.i.contains(str)) {
                    return true;
                }
                String replace = str.replace("192.168.129.30", CreditCardInitActivity.this.k.f.getTopG());
                webView2.loadUrl(replace);
                CreditCardInitActivity.this.i.add(replace);
                return true;
            }
        });
    }

    @Override // defpackage.dhz
    public final void c(int i, String str) {
        finish();
        this.j.a(this, str, i, ErrorHandlerActivity.class);
        this.g.a();
    }

    @Override // defpackage.dhz
    public final void b() {
        this.g.a();
        this.j.b(this, BalanceRechargeSuccessfullyActivity.class);
        finish();
    }

    @Override // defpackage.dhz
    public final void d(int i, String str) {
        this.g.a();
        this.j.a(this, str, i, ErrorHandlerActivity.class);
        finish();
    }

    @Override // defpackage.dim
    public final void c() {
        this.g.a();
        Intent intent = new Intent(this, PrepaidPaymentActivity.class);
        intent.putExtra("amount", this.a);
        intent.putExtra("targetNumber", this.b);
        startActivityForResult(intent, 1000);
        finish();
    }

    @Override // defpackage.dim
    public final void a(String str, String str2) {
        this.g.a();
        this.j.a(this, str2, 0, ErrorHandlerActivity.class);
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1000 && i2 == -1) {
            intent.getStringExtra("result");
        }
    }
}
