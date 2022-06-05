package com.ucare.we.presentation.ussdddetails;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import com.ucare.we.R;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class USSDDetails extends czy {
    @Inject
    djw a;
    @Inject
    dhn b;
    View.OnClickListener c = new View.OnClickListener() { // from class: com.ucare.we.presentation.ussdddetails.USSDDetails.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            USSDDetails.this.finish();
        }
    };
    private ImageView d;
    private TextView e;
    private String f;
    private WebView g;
    private View h;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_web_browser);
        this.e = (TextView) findViewById(R.id.txtTitle);
        this.d = (ImageView) findViewById(R.id.imgBackButton);
        this.g = (WebView) findViewById(R.id.webView);
        this.h = findViewById(R.id.progressBar4);
        this.a = new djw();
        this.b.f.getUSSD_AR();
        this.f = "https://te.eg/wps/portal/te/Personal/Mobile/Services/";
        if (this.a.k().equalsIgnoreCase("ar")) {
            this.f = this.b.f.getUSSD_AR();
        } else {
            this.f = this.b.f.getUSSD_EN();
        }
        this.d.setOnClickListener(this.c);
        this.e.setText(R.string.useful_codes);
        this.g.getSettings().setJavaScriptEnabled(true);
        this.g.getSettings().setBuiltInZoomControls(true);
        this.g.getSettings().setDisplayZoomControls(false);
        this.g.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.g.getSettings().setAllowContentAccess(true);
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.g, true);
        } else {
            CookieManager.getInstance().setAcceptCookie(true);
        }
        this.g.loadUrl(this.f);
        a(true);
        this.g.setWebViewClient(new WebViewClient() { // from class: com.ucare.we.presentation.ussdddetails.USSDDetails.2
            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str) {
                USSDDetails.this.a(false);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        this.h.setVisibility(z ? 0 : 8);
    }
}
