package com.ucare.we.chatwithus;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.ucare.we.R;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class ChatWithUsActivity extends czy {
    @Inject
    djb a;
    @Inject
    dio b;
    @Inject
    djw c;
    @Inject
    dhn d;
    private ValueCallback<Uri[]> e;
    private String f;
    private ValueCallback<Uri> g;
    private boolean h;
    @BindView(R.id.imgBackButton)
    ImageView imgBackButton;
    @BindView(R.id.progressBar4)
    ProgressBar progressBar;
    @BindView(R.id.txtTitle)
    TextView txtTitle;
    @BindView(R.id.webView)
    WebView webView;

    public static /* synthetic */ void lambda$3csx1U0rLHgdwmM1oeEmM47zCbg(ChatWithUsActivity chatWithUsActivity, View view) {
        chatWithUsActivity.a(view);
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(16777216, 16777216);
        this.h = this.a.g().equalsIgnoreCase("ar");
        setContentView(R.layout.activity_web_browser);
        if (this.h) {
            this.a.c();
        } else {
            this.a.d();
        }
        ButterKnife.bind(this);
        WebSettings settings = this.webView.getSettings();
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
        this.webView.getSettings().setSupportMultipleWindows(false);
        this.webView.getSettings().setSupportZoom(false);
        this.webView.setVerticalScrollBarEnabled(false);
        this.webView.setHorizontalScrollBarEnabled(false);
        this.webView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        this.webView.clearCache(true);
        this.webView.getSettings().setAppCacheEnabled(false);
        this.webView.getSettings().setCacheMode(2);
        this.webView.setScrollBarStyle(0);
        settings.setDomStorageEnabled(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        this.webView.addJavascriptInterface(new a(this), "Android");
        this.webView.setLayerType(2, null);
        this.webView.setWebViewClient(new WebViewClient() { // from class: com.ucare.we.chatwithus.ChatWithUsActivity.1
            {
                ChatWithUsActivity.this = this;
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (str.contains(ChatWithUsActivity.this.d.f.getChatBotServerUrl())) {
                    return false;
                }
                ChatWithUsActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return true;
            }

            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                ChatWithUsActivity.this.progressBar.setVisibility(8);
            }

            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                ChatWithUsActivity.this.progressBar.setVisibility(0);
                webView.loadUrl("javascript:window.teWatsonAssistantChatOptions = {identityToken: '" + ChatWithUsActivity.this.c.I() + "',serverURL:'" + ChatWithUsActivity.this.d.f.getChatBotServerUrl() + "',customerName:'" + ChatWithUsActivity.this.c.u() + "',channelId:'ecare_mobile',debug:false,lang:'" + ChatWithUsActivity.this.a.g() + "'};");
            }
        });
        this.webView.loadUrl(this.d.f.getChatBotAndroidUrl());
        this.webView.setWebChromeClient(new WebChromeClient() { // from class: com.ucare.we.chatwithus.ChatWithUsActivity.2
            {
                ChatWithUsActivity.this = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
            @Override // android.webkit.WebChromeClient
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final boolean onShowFileChooser(android.webkit.WebView r3, android.webkit.ValueCallback<android.net.Uri[]> r4, android.webkit.WebChromeClient.FileChooserParams r5) {
                /*
                    r2 = this;
                    com.ucare.we.chatwithus.ChatWithUsActivity r3 = com.ucare.we.chatwithus.ChatWithUsActivity.this
                    android.webkit.ValueCallback r3 = com.ucare.we.chatwithus.ChatWithUsActivity.a(r3)
                    r5 = 0
                    if (r3 == 0) goto L12
                    com.ucare.we.chatwithus.ChatWithUsActivity r3 = com.ucare.we.chatwithus.ChatWithUsActivity.this
                    android.webkit.ValueCallback r3 = com.ucare.we.chatwithus.ChatWithUsActivity.a(r3)
                    r3.onReceiveValue(r5)
                L12:
                    com.ucare.we.chatwithus.ChatWithUsActivity r3 = com.ucare.we.chatwithus.ChatWithUsActivity.this
                    com.ucare.we.chatwithus.ChatWithUsActivity.a(r3, r4)
                    android.content.Intent r3 = new android.content.Intent
                    java.lang.String r4 = "android.media.action.IMAGE_CAPTURE"
                    r3.<init>(r4)
                    com.ucare.we.chatwithus.ChatWithUsActivity r4 = com.ucare.we.chatwithus.ChatWithUsActivity.this
                    android.content.pm.PackageManager r4 = r4.getPackageManager()
                    android.content.ComponentName r4 = r3.resolveActivity(r4)
                    if (r4 == 0) goto L5f
                    java.io.File r4 = com.ucare.we.chatwithus.ChatWithUsActivity.a()     // Catch: java.io.IOException -> L3c
                    java.lang.String r0 = "PhotoPath"
                    com.ucare.we.chatwithus.ChatWithUsActivity r1 = com.ucare.we.chatwithus.ChatWithUsActivity.this     // Catch: java.io.IOException -> L3a
                    java.lang.String r1 = com.ucare.we.chatwithus.ChatWithUsActivity.b(r1)     // Catch: java.io.IOException -> L3a
                    r3.putExtra(r0, r1)     // Catch: java.io.IOException -> L3a
                    goto L3d
                L3a:
                    goto L3d
                L3c:
                    r4 = r5
                L3d:
                    if (r4 == 0) goto L60
                    com.ucare.we.chatwithus.ChatWithUsActivity r5 = com.ucare.we.chatwithus.ChatWithUsActivity.this
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r1 = "file:"
                    r0.<init>(r1)
                    java.lang.String r1 = r4.getAbsolutePath()
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    com.ucare.we.chatwithus.ChatWithUsActivity.a(r5, r0)
                    android.net.Uri r4 = android.net.Uri.fromFile(r4)
                    java.lang.String r5 = "output"
                    r3.putExtra(r5, r4)
                L5f:
                    r5 = r3
                L60:
                    android.content.Intent r3 = new android.content.Intent
                    java.lang.String r4 = "android.intent.action.GET_CONTENT"
                    r3.<init>(r4)
                    java.lang.String r4 = "android.intent.category.OPENABLE"
                    r3.addCategory(r4)
                    java.lang.String r4 = "image/*"
                    r3.setType(r4)
                    r4 = 0
                    r0 = 1
                    if (r5 == 0) goto L7a
                    android.content.Intent[] r1 = new android.content.Intent[r0]
                    r1[r4] = r5
                    goto L7c
                L7a:
                    android.content.Intent[] r1 = new android.content.Intent[r4]
                L7c:
                    android.content.Intent r4 = new android.content.Intent
                    java.lang.String r5 = "android.intent.action.CHOOSER"
                    r4.<init>(r5)
                    java.lang.String r5 = "android.intent.extra.INTENT"
                    r4.putExtra(r5, r3)
                    java.lang.String r3 = "android.intent.extra.TITLE"
                    java.lang.String r5 = "Image Chooser"
                    r4.putExtra(r3, r5)
                    java.lang.String r3 = "android.intent.extra.INITIAL_INTENTS"
                    r4.putExtra(r3, r1)
                    com.ucare.we.chatwithus.ChatWithUsActivity r3 = com.ucare.we.chatwithus.ChatWithUsActivity.this
                    r3.startActivityForResult(r4, r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ucare.we.chatwithus.ChatWithUsActivity.AnonymousClass2.onShowFileChooser(android.webkit.WebView, android.webkit.ValueCallback, android.webkit.WebChromeClient$FileChooserParams):boolean");
            }
        });
        this.imgBackButton.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.chatwithus.-$$Lambda$ChatWithUsActivity$3csx1U0rLHgdwmM1oeEmM47zCbg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatWithUsActivity.lambda$3csx1U0rLHgdwmM1oeEmM47zCbg(ChatWithUsActivity.this, view);
            }
        });
        this.txtTitle.setText(getString(R.string.chatWithUs));
    }

    public /* synthetic */ void a(View view) {
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Uri[] uriArr;
        super.onActivityResult(i, i2, intent);
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.g.onReceiveValue(intent != null ? intent.getData() : null);
            this.g = null;
            return;
        }
        if (i2 == -1) {
            if (intent == null) {
                String str = this.f;
                if (str != null) {
                    uriArr = new Uri[]{Uri.parse(str)};
                    this.e.onReceiveValue(uriArr);
                    this.e = null;
                }
            } else {
                String dataString = intent.getDataString();
                if (dataString != null) {
                    uriArr = new Uri[]{Uri.parse(dataString)};
                    this.e.onReceiveValue(uriArr);
                    this.e = null;
                }
            }
        }
        uriArr = null;
        this.e.onReceiveValue(uriArr);
        this.e = null;
    }

    /* loaded from: classes2.dex */
    public class a {
        Context a;

        @JavascriptInterface
        public final String getFromAndroid() {
            return "This is from android.";
        }

        a(Context context) {
            ChatWithUsActivity.this = r1;
            this.a = context;
        }
    }

    static /* synthetic */ File a() throws IOException {
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        return File.createTempFile("JPEG_" + format + "_", ".jpg", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES));
    }
}
