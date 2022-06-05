package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookServiceException;
import defpackage.rs;
import defpackage.rx;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: se  reason: default package */
/* loaded from: classes2.dex */
public abstract class se extends rx {
    private String a;

    abstract lo b_();

    protected String d() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String c() {
        return "fb" + ly.m() + "://authorize/";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public se(rs rsVar) {
        super(rsVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public se(Parcel parcel) {
        super(parcel);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Bundle b(rs.c cVar) {
        Bundle bundle = new Bundle();
        if (!qi.a(cVar.b)) {
            String join = TextUtils.join(",", cVar.b);
            bundle.putString("scope", join);
            a("scope", join);
        }
        bundle.putString("default_audience", cVar.c.getNativeProtocolAudience());
        bundle.putString("state", a(cVar.e));
        lk c = lk.c();
        String str = c != null ? c.e : null;
        String str2 = "1";
        if (str != null && str.equals(e().c.getActivity().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", ""))) {
            bundle.putString("access_token", str);
            a("access_token", str2);
        } else {
            qi.b(e().c.getActivity());
            a("access_token", "0");
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        if (!ly.p()) {
            str2 = "0";
        }
        bundle.putString("ies", str2);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Bundle a(Bundle bundle, rs.c cVar) {
        bundle.putString("redirect_uri", c());
        if (cVar.l()) {
            bundle.putString("app_id", cVar.d);
        } else {
            bundle.putString("client_id", cVar.d);
        }
        e();
        bundle.putString("e2e", rs.i());
        if (cVar.l()) {
            bundle.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        } else if (cVar.b.contains("openid")) {
            bundle.putString("response_type", "id_token,token,signed_request,graph_domain");
            bundle.putString("nonce", cVar.o);
        } else {
            bundle.putString("response_type", "token,signed_request,graph_domain");
        }
        bundle.putString("return_scopes", "true");
        bundle.putString("auth_type", cVar.h);
        bundle.putString("login_behavior", cVar.a.name());
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", ly.l()));
        if (d() != null) {
            bundle.putString("sso", d());
        }
        String str = "1";
        bundle.putString("cct_prefetching", ly.a ? str : "0");
        if (cVar.m) {
            bundle.putString("fx_app", cVar.l.toString());
        }
        if (cVar.n) {
            bundle.putString("skip_dedupe", "true");
        }
        if (cVar.j != null) {
            bundle.putString("messenger_page_id", cVar.j);
            if (!cVar.k) {
                str = "0";
            }
            bundle.putString("reset_messenger_state", str);
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(rs.c cVar, Bundle bundle, FacebookException facebookException) {
        rs.d dVar;
        String str;
        rs e = e();
        this.a = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.a = bundle.getString("e2e");
            }
            try {
                lk a = a(cVar.b, bundle, b_(), cVar.d);
                dVar = rs.d.a(e.g, a, rx.a.b(bundle, cVar.o));
                CookieSyncManager.createInstance(e.c.getActivity()).sync();
                if (a != null) {
                    e().c.getActivity().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", a.e).apply();
                }
            } catch (FacebookException e2) {
                dVar = rs.d.a(e.g, (String) null, e2.getMessage());
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            dVar = rs.d.a(e.g, "User canceled log in.");
        } else {
            this.a = null;
            String message = facebookException.getMessage();
            if (facebookException instanceof FacebookServiceException) {
                lx lxVar = ((FacebookServiceException) facebookException).a;
                str = String.format(Locale.ROOT, "%d", Integer.valueOf(lxVar.c));
                message = lxVar.toString();
            } else {
                str = null;
            }
            dVar = rs.d.a(e.g, null, message, str);
        }
        if (!qi.a(this.a)) {
            b(this.a);
        }
        e.a(dVar);
    }
}
