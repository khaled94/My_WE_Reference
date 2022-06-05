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
import com.ucare.we.model.usagedetails.SummarizedLineUsageItem;
import java.io.PrintStream;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class WebViewActivity extends czy {
    ImageView a;
    TextView b;
    ProgressBar c;
    WebView d;
    @Inject
    djb e;
    @Inject
    djw f;
    @Inject
    dhn g;
    SslCertificate h = null;
    private boolean i;

    /* renamed from: lambda$VsuK-he8zum540MPumSOJN7FhHI */
    public static /* synthetic */ void m11lambda$VsuKhe8zum540MPumSOJN7FhHI(WebViewActivity webViewActivity, View view) {
        webViewActivity.a(view);
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        getWindow().setFlags(1024, 1024);
        super.onCreate(bundle);
        if (this.e.g().equalsIgnoreCase("ar")) {
            this.i = true;
        } else {
            this.i = false;
        }
        setContentView(R.layout.activity_web_browser);
        SummarizedLineUsageItem summarizedLineUsageItem = (SummarizedLineUsageItem) getIntent().getParcelableExtra("token");
        this.a = (ImageView) findViewById(R.id.imgBackButton);
        this.b = (TextView) findViewById(R.id.txtTitle);
        this.c = (ProgressBar) findViewById(R.id.progressBar4);
        this.d = (WebView) findViewById(R.id.webView);
        this.a.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.-$$Lambda$WebViewActivity$VsuK-he8zum540MPumSOJN7FhHI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WebViewActivity.m11lambda$VsuKhe8zum540MPumSOJN7FhHI(WebViewActivity.this, view);
            }
        });
        this.b.setText(getString(R.string.points));
        if (summarizedLineUsageItem != null) {
            if (this.i) {
                this.b.setText(summarizedLineUsageItem.getArabicDisplayName());
            } else {
                this.b.setText(summarizedLineUsageItem.getEnglishDisplayName());
            }
        }
        try {
            WebSettings settings = this.d.getSettings();
            this.d.getSettings().setJavaScriptEnabled(true);
            this.d.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
            this.d.getSettings().setSupportMultipleWindows(false);
            this.d.getSettings().setSupportZoom(false);
            this.d.getSettings().setCacheMode(1);
            this.d.getSettings().setAppCacheEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            this.d.setWebViewClient(new WebViewClient() { // from class: com.ucare.we.WebViewActivity.1
                {
                    WebViewActivity.this = this;
                }

                @Override // android.webkit.WebViewClient
                public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    WebViewActivity.this.a(sslErrorHandler, sslError);
                }

                @Override // android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    WebViewActivity.this.c.setVisibility(8);
                }

                @Override // android.webkit.WebViewClient
                public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    WebViewActivity.this.c.setVisibility(0);
                }

                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    webView.loadUrl(str);
                    return true;
                }
            });
            this.d.loadUrl(this.g.f.getLoyaltyUrl() + this.f.k() + "/" + summarizedLineUsageItem.getToken());
            this.h = new SslCertificate((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(getResources().openRawResource(R.raw.valid_cert)));
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
        super.runOnUiThread(new Runnable() { // from class: com.ucare.we.WebViewActivity.2
            {
                WebViewActivity.this = this;
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
            String sslCertificate2 = this.h.toString();
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
