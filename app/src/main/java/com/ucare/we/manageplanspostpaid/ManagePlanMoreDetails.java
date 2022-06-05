package com.ucare.we.manageplanspostpaid;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import com.ucare.we.R;

/* loaded from: classes2.dex */
public class ManagePlanMoreDetails extends czy {
    public static String a = "MORE_DETAILS_URL";
    View.OnClickListener b = new View.OnClickListener() { // from class: com.ucare.we.manageplanspostpaid.ManagePlanMoreDetails.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ManagePlanMoreDetails.this.finish();
        }
    };
    private ImageView c;
    private TextView d;
    private String e;
    private View f;
    private WebView g;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_web_browser);
        this.d = (TextView) findViewById(R.id.txtTitle);
        this.c = (ImageView) findViewById(R.id.imgBackButton);
        this.g = (WebView) findViewById(R.id.webView);
        this.f = findViewById(R.id.progressBar4);
        this.c.setOnClickListener(this.b);
        this.d.setText(R.string.manage_plan);
        if (getIntent().getExtras() != null) {
            this.e = getIntent().getExtras().getString(a);
        }
        this.g.setWebViewClient(new WebViewClient());
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
        a(true);
        this.g.loadUrl(this.e);
        this.g.setWebViewClient(new WebViewClient() { // from class: com.ucare.we.manageplanspostpaid.ManagePlanMoreDetails.2
            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str) {
                ManagePlanMoreDetails.this.a(false);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        this.f.setVisibility(z ? 0 : 8);
    }
}
