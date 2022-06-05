package com.ucare.we;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class FAQActivity extends czy implements View.OnClickListener {
    View a;
    @Inject
    djb b;
    @Inject
    dhn c;
    private WebView d;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().requestFeature(2);
        setContentView(R.layout.activity_faq);
        this.b.a();
        findViewById(R.id.imgBackButton).setOnClickListener(this);
        ((TextView) findViewById(R.id.txtTitle)).setText(getString(R.string.faq));
        this.d = (WebView) findViewById(R.id.faq_view);
        this.a = findViewById(R.id.faq_progress);
        this.d.getSettings().setJavaScriptEnabled(true);
        this.d.getSettings().setBuiltInZoomControls(true);
        this.d.getSettings().setDisplayZoomControls(false);
        this.d.setWebChromeClient(new WebChromeClient() { // from class: com.ucare.we.FAQActivity.1
            @Override // android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView, int i) {
                FAQActivity.this.setProgress(i * 1000);
            }
        });
        if (this.b.f()) {
            if (this.c.f == null || TextUtils.isEmpty(this.c.f.getFaqAr())) {
                this.d.loadUrl("https://te.eg/wps/portal/te/Personal?1dmy&urile=wcm%3apath%3a%2Fte%2Fhelp%2Ffaq%2Ffaq");
            } else {
                this.d.loadUrl(this.c.f.getFaqAr());
            }
        } else if (this.c.f == null || TextUtils.isEmpty(this.c.f.getFaqEn())) {
            this.d.loadUrl("https://te.eg/wps/portal/te/Personal?1dmy&urile=wcm%3apath%3a%2Fte%2Fhelp%2Ffaq%2Ffaq");
        } else {
            this.d.loadUrl(this.c.f.getFaqEn());
        }
        a(true);
        this.d.setWebViewClient(new WebViewClient() { // from class: com.ucare.we.FAQActivity.2
            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView, int i, String str, String str2) {
                super.onReceivedError(webView, i, str, str2);
            }

            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str) {
                FAQActivity.this.a(false);
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.imgBackButton) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        this.a.setVisibility(z ? 0 : 8);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }
}
