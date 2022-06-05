package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import com.ucare.we.R;
import javax.inject.Inject;

/* renamed from: czf  reason: default package */
/* loaded from: classes2.dex */
public class czf extends dab {
    public static final String a = czf.class.getSimpleName();
    WebView b;
    View c;
    @Inject
    dhn d;
    @Inject
    djb e;
    @Inject
    dio f;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_promotion, viewGroup, false);
        this.e.a();
        WebView webView = (WebView) inflate.findViewById(R.id.promotion_web_view);
        this.b = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.b.getSettings().setBuiltInZoomControls(true);
        this.b.getSettings().setDisplayZoomControls(false);
        this.c = inflate.findViewById(R.id.promo_progress);
        if (this.f.e()) {
            if (this.e.f()) {
                if (this.d.f == null) {
                    this.b.loadUrl("https://www.te.eg/wps/portal/te/Personal/Promotion/!ut/p/z1/04_iUlDgAgP9CCATyEEmKOboR-UllmWmJ5Zk5ucl5uhH6EdGmcV7B7oYGfq7G3gbBFiaGzj6mpmEBrpYGBoEGOp76UfhVxCcmqdfkB2oCAAfVr8T/?1dmy&urile=wcm%3apath%3a%2FTE%2FResidential%2FPromotions%2FMobile%2F");
                } else {
                    this.b.loadUrl(this.d.f.getPostPaidPromotionsAr());
                }
            } else if (this.d.f == null) {
                this.b.loadUrl("https://www.te.eg/wps/portal/te/Personal/Promotion/!ut/p/z1/04_iUlDgAgP9CCATyEEmKOboR-UllmWmJ5Zk5ucl5uhH6EdGmcV7B7oYGfq7G3gbBFiaGzj6mpmEBrpYGBoEGOp76UfhVxCcmqdfkB2oCAAfVr8T/?1dmy&urile=wcm%3apath%3a%2FTE%2FResidential%2FPromotions%2FMobile%2F");
            } else {
                this.b.loadUrl(this.d.f.getPostPaidPromotionsEn());
            }
        } else if (this.f.d()) {
            if (this.e.f()) {
                if (this.d.f == null) {
                    this.b.loadUrl("https://www.te.eg/wps/portal/te/Personal/Promotion/!ut/p/z1/04_iUlDgAgP9CCATyEEmKOboR-UllmWmJ5Zk5ucl5uhH6EdGmcV7B7oYGfq7G3gbBFiaGzj6mpmEBrpYGBoEGOp76UfhVxCcmqdfkB2oCAAfVr8T/?1dmy&urile=wcm%3apath%3a%2FTE%2FResidential%2FPromotions%2FMobile%2F");
                } else {
                    this.b.loadUrl(this.d.f.getPrePaidPromotionsAr());
                }
            } else if (this.d.f == null) {
                this.b.loadUrl("https://www.te.eg/wps/portal/te/Personal/Promotion/!ut/p/z1/04_iUlDgAgP9CCATyEEmKOboR-UllmWmJ5Zk5ucl5uhH6EdGmcV7B7oYGfq7G3gbBFiaGzj6mpmEBrpYGBoEGOp76UfhVxCcmqdfkB2oCAAfVr8T/?1dmy&urile=wcm%3apath%3a%2FTE%2FResidential%2FPromotions%2FMobile%2F");
            } else {
                this.b.loadUrl(this.d.f.getPrePaidPromotionsEn());
            }
        }
        a(true);
        this.b.setWebViewClient(new WebViewClient() { // from class: czf.2
            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView2, String str) {
                czf.this.a(false);
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView2, int i, String str, String str2) {
                super.onReceivedError(webView2, i, str, str2);
            }
        });
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        requireActivity().findViewById(R.id.fab_bottom_bar);
        requireActivity().findViewById(R.id.fab);
        ((TextView) view.findViewById(R.id.txtTitle)).setText(R.string.title_promotions);
        ((ImageView) view.findViewById(R.id.imgBackButton)).setOnClickListener(new View.OnClickListener() { // from class: czf.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                czf.this.startActivity(new Intent(czf.this.requireActivity(), czf.this.requireActivity().getClass()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }
}
