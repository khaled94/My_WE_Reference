package com.ucare.we;

import android.graphics.Bitmap;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import java.io.PrintStream;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class PayBillActivity extends czy {
    @Inject
    djb a;
    @Inject
    djw b;
    @Inject
    dhn c;
    SslCertificate d = null;
    private boolean e;
    @BindView(R.id.imgBackButton)
    ImageView imgBackButton;
    @BindView(R.id.progressBar4)
    ProgressBar progressBar;
    @BindView(R.id.txtTitle)
    TextView txtTitle;
    @BindView(R.id.webView)
    WebView webView;

    public static /* synthetic */ void lambda$H01LngqESesHOlj06PDCwF40rjY(PayBillActivity payBillActivity, View view) {
        payBillActivity.a(view);
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.a.g().equalsIgnoreCase("ar")) {
            this.e = true;
        } else {
            this.e = false;
        }
        setContentView(R.layout.activity_web_browser);
        ButterKnife.bind(this);
        this.imgBackButton.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.-$$Lambda$PayBillActivity$H01LngqESesHOlj06PDCwF40rjY
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayBillActivity.lambda$H01LngqESesHOlj06PDCwF40rjY(PayBillActivity.this, view);
            }
        });
        this.txtTitle.setText(getString(R.string.recharge_Payment));
        if (this.e) {
            this.a.c();
        } else {
            this.a.d();
        }
        try {
            WebSettings settings = this.webView.getSettings();
            this.webView.getSettings().setJavaScriptEnabled(true);
            this.webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
            this.webView.getSettings().setSupportMultipleWindows(false);
            this.webView.getSettings().setSupportZoom(false);
            this.webView.getSettings().setCacheMode(1);
            this.webView.getSettings().setAppCacheEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            this.webView.setWebViewClient(new WebViewClient() { // from class: com.ucare.we.PayBillActivity.1
                {
                    PayBillActivity.this = this;
                }

                @Override // android.webkit.WebViewClient
                public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    PayBillActivity.this.a(sslErrorHandler, sslError);
                }

                @Override // android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    PayBillActivity.this.progressBar.setVisibility(8);
                }

                @Override // android.webkit.WebViewClient
                public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    PayBillActivity.this.progressBar.setVisibility(0);
                }

                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    webView.loadUrl(str);
                    return true;
                }
            });
            if (this.b.k().equalsIgnoreCase("en")) {
                this.webView.loadUrl(this.c.f.getRechargeAnonymous_en());
                this.c.f.getRechargeAnonymous_en();
            } else {
                this.webView.loadUrl(this.c.f.getRechargeAnonymous_ar());
                this.c.f.getRechargeAnonymous_ar();
            }
            this.d = new SslCertificate((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(getResources().openRawResource(R.raw.valid_cert)));
        } catch (Exception e) {
            a(e);
        }
    }

    public /* synthetic */ void a(View view) {
        finish();
    }

    private void a(Exception exc) {
        exc.printStackTrace();
        final List asList = Arrays.asList(exc.getStackTrace());
        final String message = exc.getMessage();
        super.runOnUiThread(new Runnable() { // from class: com.ucare.we.PayBillActivity.2
            {
                PayBillActivity.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sb = new StringBuilder();
                sb.append("Message: " + message + "\nStacktrace:\n");
                Iterator it = asList.iterator();
                while (it.hasNext()) {
                    sb.append(((StackTraceElement) it.next()) + "\n");
                }
            }
        });
    }

    public final void a(SslErrorHandler sslErrorHandler, SslError sslError) {
        try {
            PrintStream printStream = System.out;
            printStream.println("Did receive challenge for " + sslError.getUrl());
            String sslCertificate = sslError.getCertificate().toString();
            System.out.println("\nCertificate received: ".concat(String.valueOf(sslCertificate)));
            String sslCertificate2 = this.d.toString();
            System.out.println("\nCertificate bundled: ".concat(String.valueOf(sslCertificate2)));
            if (sslCertificate.equals(sslCertificate2)) {
                System.out.println("\nSuccessfully validated incoming certificate with bundled certificate! Allowing the connection to proceed ...\n\n");
                sslErrorHandler.proceed();
                return;
            }
            throw new Exception("Connection is not honoured as the bundled certificate does not match the certificate data in the incoming request.");
        } catch (Exception e) {
            a(e);
        }
    }
}
