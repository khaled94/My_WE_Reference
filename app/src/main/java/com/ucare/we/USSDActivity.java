package com.ucare.we;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;

/* loaded from: classes2.dex */
public class USSDActivity extends czy {
    @BindView(R.id.imgBackButton)
    ImageView imgBackButton;
    @BindView(R.id.progressBar4)
    ProgressBar progressBar;
    @BindView(R.id.txtTitle)
    TextView txtTitle;
    @BindView(R.id.webView)
    WebView webView;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_web_browser);
        ButterKnife.bind(this);
        this.imgBackButton.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.USSDActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                USSDActivity.this.finish();
            }
        });
        this.txtTitle.setText(getString(R.string.recharge_Payment));
        this.webView.setWebViewClient(new WebViewClient() { // from class: com.ucare.we.USSDActivity.2
            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView, int i, String str, String str2) {
                super.onReceivedError(webView, i, str, str2);
            }

            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                USSDActivity.this.progressBar.setVisibility(0);
            }

            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                USSDActivity.this.progressBar.setVisibility(8);
            }
        });
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.loadUrl("https://test-my.te.eg/#/anonymous/select");
    }
}
