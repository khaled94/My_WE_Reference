package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.ucare.we.R;
import com.ucare.we.model.ConfigurationResponseBody;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J&\u0010!\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020\u001dH\u0016J\b\u0010)\u001a\u00020\u001dH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ucare/we/livechat/LiveChatFragment;", "Lcom/ucare/we/injection/BaseFragment;", "Landroid/view/View$OnClickListener;", "()V", "configurationProvider", "Lcom/ucare/we/provider/ConfigurationProvider;", "getConfigurationProvider", "()Lcom/ucare/we/provider/ConfigurationProvider;", "setConfigurationProvider", "(Lcom/ucare/we/provider/ConfigurationProvider;)V", "languageSwitcher", "Lcom/ucare/we/util/LanguageSwitcher;", "getLanguageSwitcher", "()Lcom/ucare/we/util/LanguageSwitcher;", "setLanguageSwitcher", "(Lcom/ucare/we/util/LanguageSwitcher;)V", "progressHandler", "Lcom/ucare/we/util/ProgressHandler;", "getProgressHandler", "()Lcom/ucare/we/util/ProgressHandler;", "setProgressHandler", "(Lcom/ucare/we/util/ProgressHandler;)V", "swipeRefreshLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "txtTitle", "Landroid/widget/TextView;", "webView", "Landroid/webkit/WebView;", "initViews", "", "view", "Landroid/view/View;", "onClick", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onStop", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dah */
/* loaded from: classes2.dex */
public final class dah extends dab implements View.OnClickListener {
    @Inject
    public djg a;
    @Inject
    public djb b;
    @Inject
    public dhn c;
    private WebView d;
    private SwipeRefreshLayout e;
    private TextView f;

    public static /* synthetic */ void lambda$h6edlBOkxkPlcZB7qWW47kmAsU8(dah dahVar) {
        b(dahVar);
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
        dhn dhnVar = this.c;
        if (dhnVar != null) {
            return dhnVar;
        }
        dqc.a("configurationProvider");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View findViewById;
        dqc.d(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.webview_livechat_layout, viewGroup, false);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.ucare.we.injection.BaseActivity");
        }
        ((czy) activity).a(getString(R.string.faq), false, false);
        if (inflate != null && (findViewById = inflate.findViewById(R.id.imgBackButton)) != null) {
            findViewById.setOnClickListener(this);
        }
        ConfigurationResponseBody configurationResponseBody = null;
        TextView textView = inflate == null ? null : (TextView) inflate.findViewById(R.id.txtTitle);
        this.f = textView;
        if (textView != null) {
            textView.setText(getString(R.string.faq));
        }
        View findViewById2 = inflate == null ? null : inflate.findViewById(R.id.live_chat_view);
        if (findViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.webkit.WebView");
        }
        this.d = (WebView) findViewById2;
        View findViewById3 = inflate == null ? null : inflate.findViewById(R.id.swipeContainer);
        if (findViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        }
        this.e = (SwipeRefreshLayout) findViewById3;
        WebView webView = this.d;
        if (webView != null) {
            webView.setVerticalScrollBarEnabled(false);
        }
        WebView webView2 = this.d;
        if (webView2 != null) {
            webView2.setHorizontalScrollBarEnabled(true);
        }
        WebView webView3 = this.d;
        WebSettings settings = webView3 == null ? null : webView3.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        WebView webView4 = this.d;
        WebSettings settings2 = webView4 == null ? null : webView4.getSettings();
        if (settings2 != null) {
            settings2.setBuiltInZoomControls(true);
        }
        WebView webView5 = this.d;
        WebSettings settings3 = webView5 == null ? null : webView5.getSettings();
        if (settings3 != null) {
            settings3.setDisplayZoomControls(false);
        }
        dhn b2 = b();
        if ((b2 == null ? null : b2.f) == null) {
            WebView webView6 = this.d;
            if (webView6 != null) {
                webView6.loadUrl("https://www.livehelpnow.net/lhn/lcv.aspx?d=0&ms=&zzwindow=0&lhnid=20584&custom1=&custom2=&custom3=");
            }
        } else {
            WebView webView7 = this.d;
            if (webView7 != null) {
                dhn b3 = b();
                if (b3 != null) {
                    configurationResponseBody = b3.f;
                }
                webView7.loadUrl(configurationResponseBody.getLiveChat());
            }
        }
        a().a(getContext(), getString(R.string.loading));
        WebView webView8 = this.d;
        if (webView8 != null) {
            webView8.setWebChromeClient(new a());
        }
        WebView webView9 = this.d;
        if (webView9 != null) {
            webView9.setWebViewClient(new b());
        }
        WebView webView10 = this.d;
        if (webView10 != null) {
            webView10.loadUrl("https://www.livehelpnow.net/lhn/lcv.aspx?d=0&ms=&zzwindow=0&lhnid=20584&custom1=&custom2=&custom3=");
        }
        SwipeRefreshLayout swipeRefreshLayout = this.e;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: -$$Lambda$dah$h6edlBOkxkPlcZB7qWW47kmAsU8
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
                public final void onRefresh() {
                    dah.lambda$h6edlBOkxkPlcZB7qWW47kmAsU8(dah.this);
                }
            });
        }
        return inflate;
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ucare/we/livechat/LiveChatFragment$initViews$1", "Landroid/webkit/WebChromeClient;", "onProgressChanged", "", "view", "Landroid/webkit/WebView;", "progress", "", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dah$a */
    /* loaded from: classes2.dex */
    public static final class a extends WebChromeClient {
        a() {
            dah.this = r1;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            dqc.d(webView, "view");
            FragmentActivity activity = dah.this.getActivity();
            if (activity != null) {
                activity.setProgress(i * 1000);
            }
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J(\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0016¨\u0006\r"}, d2 = {"com/ucare/we/livechat/LiveChatFragment$initViews$2", "Landroid/webkit/WebViewClient;", "onPageFinished", "", "view", "Landroid/webkit/WebView;", "url", "", "onReceivedError", "errorCode", "", "description", "failingUrl", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dah$b */
    /* loaded from: classes2.dex */
    public static final class b extends WebViewClient {
        b() {
            dah.this = r1;
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
            WebView webView2 = dah.this.d;
            if (webView2 != null) {
                webView2.loadUrl("javascript:document.body.style.marginRight=\"8%\"; void 0");
            }
            webView.loadUrl("javascript:(function(){ document.body.style.paddingRight= '55px'})();");
            dah.this.a().a();
        }
    }

    public static final void b(dah dahVar) {
        dqc.d(dahVar, "this$0");
        SwipeRefreshLayout swipeRefreshLayout = dahVar.e;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FragmentActivity activity;
        dqc.d(view, "view");
        if (view.getId() != R.id.imgBackButton || (activity = getActivity()) == null) {
            return;
        }
        activity.finish();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        djb djbVar = this.b;
        if (djbVar != null) {
            djbVar.a();
        } else {
            dqc.a("languageSwitcher");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }
}
