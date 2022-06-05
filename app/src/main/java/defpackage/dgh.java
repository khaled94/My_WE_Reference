package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.FragmentActivity;
import com.ucare.we.R;
import com.ucare.we.presentation.profile.postpaidprofile.EnableAutoPayTopG.EnableAutoPayTopGActivity;
import javax.inject.Inject;
import org.json.JSONException;

/* renamed from: dgh  reason: default package */
/* loaded from: classes2.dex */
public class dgh extends dab implements dgj {
    public String a;
    public String b;
    public String c;
    public int d;
    public int e;
    @Inject
    djb f;
    @Inject
    djg g;
    @Inject
    dhn h;
    Context i;
    dgi j;
    private boolean k;
    private WebView l;

    public static dgh a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("hashcode", str);
        bundle.putString("topgManageCCTransactionId", str2);
        dgh dghVar = new dgh();
        dghVar.setArguments(bundle);
        return dghVar;
    }

    public static dgh a(String str, String str2, String str3, String str4, String str5) {
        Bundle bundle = new Bundle();
        bundle.putString("hashcode", str);
        bundle.putString("topgManageCCTransactionId", str2);
        bundle.putString("confirmationCode", str5);
        bundle.putString(EnableAutoPayTopGActivity.a, str4);
        bundle.putString(EnableAutoPayTopGActivity.b, str3);
        dgh dghVar = new dgh();
        dghVar.setArguments(bundle);
        return dghVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f.g().equalsIgnoreCase("ar")) {
            this.k = true;
        } else {
            this.k = false;
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_enable_auto_pay_top_g, viewGroup, false);
        if (this.k) {
            this.f.c();
        } else {
            this.f.d();
        }
        this.l = (WebView) inflate.findViewById(R.id.wvPayment);
        if (getArguments() != null) {
            this.a = getArguments().getString("hashcode");
            this.b = getArguments().getString("topgManageCCTransactionId");
            this.d = getArguments().getInt(EnableAutoPayTopGActivity.b);
            this.e = getArguments().getInt(EnableAutoPayTopGActivity.a);
            this.c = getArguments().getString("confirmationCode");
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        this.i = activity;
        this.j = new dgi(activity, this);
        this.l.getSettings().setJavaScriptEnabled(true);
        this.l.getSettings().setBuiltInZoomControls(true);
        this.l.getSettings().setDisplayZoomControls(false);
        this.l.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.l.getSettings().setAllowContentAccess(true);
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.l, true);
        } else {
            CookieManager.getInstance().setAcceptCookie(true);
        }
        this.l.setWebViewClient(new WebViewClient() { // from class: dgh.1
            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (str.equalsIgnoreCase("https://my.te.eg/#/payment/autopayment?transactionHashCode=" + dgh.this.a + "&sourceTransactionId=" + dgh.this.b) || str.contains("topgErrorPage")) {
                    dgh.this.l.stopLoading();
                    dgi dgiVar = dgh.this.j;
                    String str2 = dgh.this.b;
                    String str3 = dgh.this.c;
                    try {
                        dgiVar.b.a(true);
                        djl.a(dgiVar.a).a(false, str2, str3, dgiVar.c, dgiVar.d);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    return true;
                }
                return false;
            }
        });
        this.l.loadUrl(this.h.f.getTopG() + this.a);
    }

    @Override // defpackage.dgj
    public final void a(boolean z) {
        if (z) {
            this.g.a(this.i, getString(R.string.loading));
        } else {
            this.g.a();
        }
    }

    @Override // defpackage.dgj
    public final void a() {
        getActivity().finish();
    }
}
