package com.ucare.we.livechat;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.ucare.we.R;
import com.ucare.we.model.ConfigurationResponseBody;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u0017H\u0014J\b\u0010\u001e\u001a\u00020\u0017H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ucare/we/livechat/LiveChatActivity;", "Lcom/ucare/we/injection/BaseActivity;", "Landroid/view/View$OnClickListener;", "()V", "configurationProvider", "Lcom/ucare/we/provider/ConfigurationProvider;", "getConfigurationProvider", "()Lcom/ucare/we/provider/ConfigurationProvider;", "setConfigurationProvider", "(Lcom/ucare/we/provider/ConfigurationProvider;)V", "progressHandler", "Lcom/ucare/we/util/ProgressHandler;", "getProgressHandler", "()Lcom/ucare/we/util/ProgressHandler;", "setProgressHandler", "(Lcom/ucare/we/util/ProgressHandler;)V", "swipeRefreshLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "txtTitle", "Landroid/widget/TextView;", "webView", "Landroid/webkit/WebView;", "onClick", "", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onStop", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class LiveChatActivity extends czy implements View.OnClickListener {
    @Inject
    public djg a;
    @Inject
    public dhn b;
    private WebView c;
    private SwipeRefreshLayout d;
    private TextView e;

    public static /* synthetic */ void lambda$eqRes3KfXKpsAjwM8TTz3_HF21M(LiveChatActivity liveChatActivity) {
        a(liveChatActivity);
    }

    public final djg a() {
        djg djgVar = this.a;
        if (djgVar != null) {
            return djgVar;
        }
        dqc.a("progressHandler");
        throw null;
    }

    private dhn b() {
        dhn dhnVar = this.b;
        if (dhnVar != null) {
            return dhnVar;
        }
        dqc.a("configurationProvider");
        throw null;
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        WebSettings settings;
        WebSettings settings2;
        super.onCreate(bundle);
        getWindow().requestFeature(2);
        setContentView(R.layout.webview_livechat_layout);
        a(getString(R.string.chatWithUs), false, false);
        findViewById(R.id.imgBackButton).setOnClickListener(this);
        TextView textView = (TextView) findViewById(R.id.txtTitle);
        this.e = textView;
        if (textView != null) {
            textView.setText(getString(R.string.chatWithUs));
        }
        View findViewById = findViewById(R.id.live_chat_view);
        if (findViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.webkit.WebView");
        }
        this.c = (WebView) findViewById;
        View findViewById2 = findViewById(R.id.swipeContainer);
        if (findViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        }
        this.d = (SwipeRefreshLayout) findViewById2;
        WebView webView = this.c;
        if (webView != null) {
            webView.setVerticalScrollBarEnabled(false);
        }
        WebView webView2 = this.c;
        if (webView2 != null) {
            webView2.setHorizontalScrollBarEnabled(false);
        }
        WebView webView3 = this.c;
        if (webView3 != null) {
            webView3.setInitialScale(1);
        }
        WebView webView4 = this.c;
        if (webView4 != null && (settings2 = webView4.getSettings()) != null) {
            settings2.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        }
        WebView webView5 = this.c;
        if (webView5 != null && (settings = webView5.getSettings()) != null) {
            settings.setUseWideViewPort(true);
        }
        WebView webView6 = this.c;
        ConfigurationResponseBody configurationResponseBody = null;
        WebSettings settings3 = webView6 == null ? null : webView6.getSettings();
        if (settings3 != null) {
            settings3.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        }
        WebView webView7 = this.c;
        WebSettings settings4 = webView7 == null ? null : webView7.getSettings();
        if (settings4 != null) {
            settings4.setJavaScriptEnabled(true);
        }
        WebView webView8 = this.c;
        WebSettings settings5 = webView8 == null ? null : webView8.getSettings();
        if (settings5 != null) {
            settings5.setBuiltInZoomControls(true);
        }
        WebView webView9 = this.c;
        WebSettings settings6 = webView9 == null ? null : webView9.getSettings();
        if (settings6 != null) {
            settings6.setDisplayZoomControls(false);
        }
        WebView webView10 = this.c;
        WebSettings settings7 = webView10 == null ? null : webView10.getSettings();
        if (settings7 != null) {
            settings7.setDefaultFontSize(15);
        }
        WebView webView11 = this.c;
        WebSettings settings8 = webView11 == null ? null : webView11.getSettings();
        if (settings8 != null) {
            settings8.setTextSize(WebSettings.TextSize.NORMAL);
        }
        Object systemService = djq.a().getSystemService("window");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        dhn b2 = b();
        if ((b2 == null ? null : b2.f) == null) {
            WebView webView12 = this.c;
            if (webView12 != null) {
                webView12.loadUrl("https://www.livehelpnow.net/lhn/lcv.aspx?d=0&ms=&zzwindow=0&lhnid=20584&custom1=&custom2=&custom3=javascript:var scale = " + displayMetrics.widthPixels + " / document.body.scrollWidth; document.body.style.zoom = scale;");
            }
        } else {
            WebView webView13 = this.c;
            if (webView13 != null) {
                StringBuilder sb = new StringBuilder();
                dhn b3 = b();
                if (b3 != null) {
                    configurationResponseBody = b3.f;
                }
                sb.append(configurationResponseBody.getLiveChat());
                sb.append("javascript:var scale = ");
                sb.append(displayMetrics.widthPixels);
                sb.append(" / document.body.scrollWidth; document.body.style.zoom = scale;");
                webView13.loadUrl(sb.toString());
            }
        }
        a().a(this, getString(R.string.loading));
        WebView webView14 = this.c;
        if (webView14 != null) {
            webView14.setWebChromeClient(new a());
        }
        WebView webView15 = this.c;
        if (webView15 != null) {
            webView15.setWebViewClient(new b());
        }
        WebView webView16 = this.c;
        if (webView16 != null) {
            webView16.loadUrl("https://www.livehelpnow.net/lhn/lcv.aspx?d=0&ms=&zzwindow=0&lhnid=20584&custom1=&custom2=&custom3=javascript:var scale = " + displayMetrics.widthPixels + " / document.body.scrollWidth; document.body.style.zoom = scale;");
        }
        SwipeRefreshLayout swipeRefreshLayout = this.d;
        if (swipeRefreshLayout == null) {
            return;
        }
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: com.ucare.we.livechat.-$$Lambda$LiveChatActivity$eqRes3KfXKpsAjwM8TTz3_HF21M
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                LiveChatActivity.lambda$eqRes3KfXKpsAjwM8TTz3_HF21M(LiveChatActivity.this);
            }
        });
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ucare/we/livechat/LiveChatActivity$onCreate$1", "Landroid/webkit/WebChromeClient;", "onProgressChanged", "", "view", "Landroid/webkit/WebView;", "progress", "", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a extends WebChromeClient {
        a() {
            LiveChatActivity.this = r1;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            dqc.d(webView, "view");
            LiveChatActivity.this.setProgress(i * 1000);
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J(\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0016¨\u0006\r"}, d2 = {"com/ucare/we/livechat/LiveChatActivity$onCreate$2", "Landroid/webkit/WebViewClient;", "onPageFinished", "", "view", "Landroid/webkit/WebView;", "url", "", "onReceivedError", "errorCode", "", "description", "failingUrl", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b extends WebViewClient {
        b() {
            LiveChatActivity.this = r1;
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            dqc.d(webView, "view");
            dqc.d(str, "description");
            dqc.d(str2, "failingUrl");
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            dqc.d(webView, "view");
            dqc.d(str, "url");
            LiveChatActivity.this.a().a();
        }
    }

    public static final void a(LiveChatActivity liveChatActivity) {
        dqc.d(liveChatActivity, "this$0");
        SwipeRefreshLayout swipeRefreshLayout = liveChatActivity.d;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dqc.d(view, "view");
        if (view.getId() == R.id.imgBackButton) {
            finish();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        o().a();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
    }
}
