package com.ucare.we;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class FamilyMoreDetailActivity extends czy {
    public static String a = "MORE_DETAILS_URL";
    public static String b = "SCREEN_TITLE";
    @Inject
    djw c;
    View.OnClickListener d = new View.OnClickListener() { // from class: com.ucare.we.FamilyMoreDetailActivity.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FamilyMoreDetailActivity.this.finish();
        }
    };
    private ImageView e;
    private TextView f;
    private String g;
    private String h;
    private WebView i;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_more_details);
        this.f = (TextView) findViewById(R.id.txtTitle);
        this.e = (ImageView) findViewById(R.id.imgBackButton);
        this.i = (WebView) findViewById(R.id.webView);
        this.c = new djw();
        this.e.setOnClickListener(this.d);
        if (getIntent().getExtras() != null) {
            this.g = getIntent().getExtras().getString(a);
            this.h = getIntent().getExtras().getString(b);
        }
        this.f.setText(this.h);
        this.i.setWebViewClient(new WebViewClient());
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
        this.i.loadUrl(this.g);
    }
}
