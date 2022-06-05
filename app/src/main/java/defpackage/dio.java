package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.gson.Gson;
import com.ucare.we.App;
import com.ucare.we.R;
import com.ucare.we.model.AutoLoginRequestBody;
import com.ucare.we.model.LoginInfo;
import com.ucare.we.model.LoginRequestBody;
import com.ucare.we.model.ModifyPasswordRequestBody;
import com.ucare.we.model.ResponseHeader;
import com.ucare.we.model.SendConfirmationResponseBody;
import com.ucare.we.model.ServerRequest;
import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.SignInModel.SignInResponse;
import com.ucare.we.model.SignUpRequestBody;
import com.ucare.we.model.SignUpResponsBody;
import defpackage.au;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/* renamed from: dio  reason: default package */
/* loaded from: classes2.dex */
public final class dio extends czz implements dju {
    @Inject
    protected diq c;
    @Inject
    public djw e;
    @Inject
    dhy f;
    public dhk g;
    public dip h;
    @Inject
    Context i;
    cyx j;
    public String p;
    public String r;
    public String s;
    public String t;
    public efn<ServerResponse<SignUpResponsBody>> w;
    private GoogleSignInOptions x;
    private tl y;
    public String a = "";
    public String b = "";
    protected efa<ServerResponse<SignUpResponsBody>> k = new efa<ServerResponse<SignUpResponsBody>>() { // from class: dio.1
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<SignUpResponsBody>> eeyVar, efn<ServerResponse<SignUpResponsBody>> efnVar) {
            new Gson().a(efnVar.b);
            dio.a(dio.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<SignUpResponsBody>> eeyVar, Throwable th) {
            th.getMessage();
            dio.a(dio.this);
        }
    };
    protected efa<ServerResponse> l = new efa<ServerResponse>() { // from class: dio.2
        @Override // defpackage.efa
        public final void a(eey<ServerResponse> eeyVar, efn<ServerResponse> efnVar) {
            dio.b(dio.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse> eeyVar, Throwable th) {
            dio.b(dio.this);
        }
    };
    protected efa<ServerResponse<SendConfirmationResponseBody>> m = new efa<ServerResponse<SendConfirmationResponseBody>>() { // from class: dio.3
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<SendConfirmationResponseBody>> eeyVar, efn<ServerResponse<SendConfirmationResponseBody>> efnVar) {
            dio.c(dio.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<SendConfirmationResponseBody>> eeyVar, Throwable th) {
            dio.c(dio.this);
        }
    };
    protected efa<ServerResponse> n = new efa<ServerResponse>() { // from class: dio.4
        @Override // defpackage.efa
        public final void a(eey<ServerResponse> eeyVar, efn<ServerResponse> efnVar) {
            dio.d(dio.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse> eeyVar, Throwable th) {
            dio.d(dio.this);
        }
    };
    au.a o = new au.a() { // from class: dio.5
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
        }
    };
    protected final efa<ServerResponse<LoginInfo>> q = new efa<ServerResponse<LoginInfo>>() { // from class: dio.6
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<LoginInfo>> eeyVar, efn<ServerResponse<LoginInfo>> efnVar) {
            dio.e(dio.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<LoginInfo>> eeyVar, Throwable th) {
            dio.e(dio.this);
        }
    };
    protected efa<ServerResponse<LoginInfo>> u = new efa<ServerResponse<LoginInfo>>() { // from class: dio.7
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<LoginInfo>> eeyVar, efn<ServerResponse<LoginInfo>> efnVar) {
            dio.f(dio.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<LoginInfo>> eeyVar, Throwable th) {
            dio.f(dio.this);
        }
    };
    protected efa<ServerResponse<String>> v = new efa<ServerResponse<String>>() { // from class: dio.8
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, efn<ServerResponse<String>> efnVar) {
            dio.g(dio.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, Throwable th) {
            dio dioVar = dio.this;
            dioVar.h.a(dioVar.i.getString(R.string.check_network_connection));
        }
    };
    protected List<dhk> d = new ArrayList();

    public final void a(dhk dhkVar) {
        if (!this.d.contains(dhkVar)) {
            this.d.add(dhkVar);
        }
    }

    public final void b(dhk dhkVar) {
        this.d.remove(dhkVar);
    }

    public final boolean a() {
        return !TextUtils.isEmpty(this.r);
    }

    public final void a(Context context) {
        if (diw.b(App.a())) {
            this.f.b();
        } else {
            cyx cyxVar = new cyx(context, this);
            this.j = cyxVar;
            cyxVar.a(this.e.I(), this.e.H(), "delete");
        }
        this.r = "";
        this.s = "";
        this.e.u("");
        this.e.v("");
        this.e.k(false);
        this.e.p();
        this.e.q();
        this.e.l("");
        this.e.p("");
        this.e.x();
        this.e.y();
        this.e.q("");
        this.e.s("");
        this.e.t("");
        this.e.w("");
        this.e.r(false);
        this.e.o(false);
        this.e.x("");
        this.e.p(false);
        this.e.A("");
        this.e.y("");
        this.e.z("");
        rw.a().b();
        GoogleSignInOptions c = new GoogleSignInOptions.a(GoogleSignInOptions.a).a(context.getString(R.string.we_google_app_id)).b(context.getString(R.string.we_google_app_id)).a().c();
        this.x = c;
        tl a = tj.a(context, c);
        this.y = a;
        a.b();
    }

    public final void b() {
        this.c.a("https://api-my.te.eg/api/user/generatetoken?channelId=ANDROID_NATIVE_APP").a(this.q);
    }

    public final void c() {
        this.e.i("");
        this.e.k("PREPAID");
        this.e.d("");
        this.e.l("PREPAID");
        this.e.n("");
        this.e.o("");
        d("", this.b, this.a);
    }

    public final void a(String str, String str2) {
        this.e.c(true);
        this.e.i(str);
        this.e.j(str2);
        this.e.k("PREPAID");
        this.e.d(str);
        this.e.f(str2);
        this.e.l("PREPAID");
        this.e.n(str);
        this.e.o(str);
        b(str, str2, false);
    }

    public final void a(String str, String str2, boolean z) {
        this.e.d(str);
        this.e.f(str2);
        this.e.l("PREPAID");
        this.e.o(str);
        b(str, str2, z);
    }

    private void b(String str, String str2, boolean z) {
        this.e.l(!z);
        this.e.n(true);
        this.e.p("");
        ServerRequest<LoginRequestBody> createServerRequest = ServerRequest.createServerRequest(str, this.e.k(), Long.valueOf(System.currentTimeMillis() / 1000), new LoginRequestBody(str2));
        new Gson().a(createServerRequest);
        this.c.c("https://api-my.te.eg/api/user/login", this.p, createServerRequest).a(this.u);
    }

    public final void a(String str, String str2, String str3) {
        this.e.l(true);
        this.e.n(true);
        this.e.p("");
        if (this.e.k().equals("")) {
            this.e.c("en");
        }
        ServerRequest.createServerRequest(str2, this.e.k(), Long.valueOf(System.currentTimeMillis() / 1000), null);
        this.c.a(str + "/api/user/autologin/initiate", this.p, str2, str3).a(this.v);
    }

    private void d(String str, String str2, String str3) {
        this.e.l(true);
        this.e.n(true);
        this.e.p("");
        if (this.e.k().equals("")) {
            this.e.c("en");
        }
        this.c.aa("http://autologin-api-my.te.eg/api/user/autologin/finalize", this.p, ServerRequest.createServerRequest(str, this.e.k(), Long.valueOf(System.currentTimeMillis() / 1000), new AutoLoginRequestBody(str3, str2))).a(this.u);
    }

    public final void a(SignInResponse signInResponse) {
        if (signInResponse.getHeader().getResponseCode().equalsIgnoreCase("0")) {
            ResponseHeader header = signInResponse.getHeader();
            if (signInResponse.getBody() != null) {
                djv.b("jwt", signInResponse.getBody().getJwt());
                this.e.u(signInResponse.getBody().getJwt());
                djv.b("customerId", header.getCustomerId());
                this.e.l(signInResponse.getBody().getType());
                this.e.m(signInResponse.getBody().getRole());
                this.e.e(signInResponse.getBody().getCustomerName());
                this.r = signInResponse.getBody().getJwt();
                this.s = signInResponse.getBody().getCustomerName();
                this.e.k(false);
                for (dhk dhkVar : this.d) {
                    dhkVar.a(1);
                }
            }
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                if (signInResponse.getBody() == null || signInResponse.getBody().getJwt() == null) {
                    return;
                }
                this.e.b(signInResponse.getBody().getAssociatedLines());
                bm.a(this.i, new djk());
            } else if (header.getResponseCode().equalsIgnoreCase("1200")) {
                Toast.makeText(this.i, "Expired", 0).show();
            } else {
                for (dhk dhkVar2 : this.d) {
                    if (header.getResponseCode().equalsIgnoreCase("1200")) {
                        dhkVar2.a(1, 1200, header.getResponseMessage());
                    } else {
                        dhkVar2.a(1, 1, header.getResponseMessage());
                    }
                }
            }
        }
    }

    public final void b(String str, String str2, String str3) {
        SignUpRequestBody signUpRequestBody = new SignUpRequestBody();
        signUpRequestBody.setPassword(str2);
        signUpRequestBody.setConfirmationCode(str3);
        this.c.d("https://api-my.te.eg/api/user/mobile/signup/finalize", this.p, ServerRequest.createServerRequest(str, this.e.k(), Long.valueOf(System.currentTimeMillis() / 1000), signUpRequestBody)).a(this.k);
    }

    public final void c(String str, String str2, String str3) {
        SignUpRequestBody signUpRequestBody = new SignUpRequestBody();
        signUpRequestBody.setPassword(str2);
        signUpRequestBody.setConfirmationCode(str3);
        this.c.B("https://api-my.te.eg/api/user/resetpassword/finalize", this.p, ServerRequest.createServerRequest(str, this.e.k(), Long.valueOf(System.currentTimeMillis() / 1000), signUpRequestBody)).a(this.l);
    }

    public final void b(String str, int i) {
        String str2 = i == 0 ? "https://api-my.te.eg/api/user/signup/initiate" : "https://api-my.te.eg/api/user/resetpassword/initiate";
        if (this.e.k().isEmpty()) {
            this.e.c("en");
        }
        this.c.e(str2, this.p, ServerRequest.createServerRequest(str, this.e.k(), new SendConfirmationResponseBody())).a(this.m);
    }

    public final void b(String str, String str2) {
        ModifyPasswordRequestBody modifyPasswordRequestBody = new ModifyPasswordRequestBody();
        modifyPasswordRequestBody.setPassword(str);
        modifyPasswordRequestBody.setNewPassword(str2);
        this.c.U("https://api-my.te.eg/api/user/modifypassword", this.r, ServerRequest.createServerRequest(this.e.m(), this.e.k(), Long.valueOf(System.currentTimeMillis() / 1000), modifyPasswordRequestBody)).a(this.n);
    }

    public final boolean d() {
        return !TextUtils.isEmpty(this.e.v()) && this.e.v().equalsIgnoreCase("prepaid");
    }

    public final boolean e() {
        return !TextUtils.isEmpty(this.e.v()) && this.e.v().equalsIgnoreCase("postpaid");
    }

    public final boolean f() {
        return !TextUtils.isEmpty(this.e.v()) && !this.e.w().contains("_FD_");
    }

    public final boolean g() {
        this.e.w();
        return !TextUtils.isEmpty(this.e.w()) && this.e.w().contains("_FD_");
    }

    public final boolean h() {
        return !TextUtils.isEmpty(this.e.w()) && this.e.w().contains("_CORPORATE_");
    }

    public final boolean i() {
        return !TextUtils.isEmpty(this.e.w()) && this.e.w().contains("_FL_");
    }

    public final boolean j() {
        return !TextUtils.isEmpty(this.e.w()) && this.e.w().contains("_FU_");
    }

    public final boolean k() {
        return !TextUtils.isEmpty(this.e.w()) && this.e.w().contains("_OS_");
    }

    public final boolean l() {
        return !TextUtils.isEmpty(this.e.N()) && this.e.O();
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this.i, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        if (i != 101) {
            return;
        }
        this.j.a(this.e.H(), "delete");
    }

    static /* synthetic */ void a(dio dioVar, efn efnVar) {
        dioVar.w = efnVar;
        if (efnVar.a.d()) {
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                for (dhk dhkVar : dioVar.d) {
                    dhkVar.a(((SignUpResponsBody) ((ServerResponse) efnVar.b).getBody()).isBundelOfferSubscription());
                }
                return;
            }
            for (dhk dhkVar2 : dioVar.d) {
                if (header.getResponseCode().equalsIgnoreCase("1200")) {
                    dhkVar2.a(2, 1200, header.getResponseMessage());
                } else {
                    dhkVar2.a(2, 0, header.getResponseMessage());
                }
            }
        }
    }

    static /* synthetic */ void a(dio dioVar) {
        for (dhk dhkVar : dioVar.d) {
            dhkVar.a(2, 0, dioVar.i.getString(R.string.check_network_connection));
        }
    }

    static /* synthetic */ void b(dio dioVar, efn efnVar) {
        if (efnVar.a.d()) {
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                for (dhk dhkVar : dioVar.d) {
                    dhkVar.a(4);
                }
                return;
            }
            for (dhk dhkVar2 : dioVar.d) {
                if (header.getResponseCode().equalsIgnoreCase("1200")) {
                    dhkVar2.a(4, 1200, header.getResponseMessage());
                } else {
                    dhkVar2.a(4, 0, header.getResponseMessage());
                }
            }
        }
    }

    static /* synthetic */ void b(dio dioVar) {
        for (dhk dhkVar : dioVar.d) {
            dhkVar.a(4, 0, dioVar.i.getString(R.string.check_network_connection));
        }
    }

    static /* synthetic */ void c(dio dioVar, efn efnVar) {
        if (efnVar.a.d()) {
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                for (dhk dhkVar : dioVar.d) {
                    dhkVar.a(3);
                }
                return;
            }
            for (dhk dhkVar2 : dioVar.d) {
                if (header.getResponseCode().equalsIgnoreCase("1200")) {
                    dhkVar2.a(3, 1200, header.getResponseMessage());
                } else {
                    dhkVar2.a(3, 1, header.getResponseMessage());
                }
            }
        }
    }

    static /* synthetic */ void c(dio dioVar) {
        for (dhk dhkVar : dioVar.d) {
            dhkVar.a(3, 0, dioVar.i.getString(R.string.check_network_connection));
        }
    }

    static /* synthetic */ void d(dio dioVar, efn efnVar) {
        if (efnVar.a.d()) {
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                for (dhk dhkVar : dioVar.d) {
                    dhkVar.a(5);
                }
                return;
            }
            for (dhk dhkVar2 : dioVar.d) {
                if (header.getResponseCode().equalsIgnoreCase("1200")) {
                    dhkVar2.a(5, 1200, header.getResponseMessage());
                } else {
                    dhkVar2.a(5, 0, header.getResponseMessage());
                }
            }
        }
    }

    static /* synthetic */ void d(dio dioVar) {
        for (dhk dhkVar : dioVar.d) {
            dhkVar.a(5, 0, dioVar.i.getString(R.string.check_network_connection));
        }
    }

    static /* synthetic */ void e(dio dioVar, efn efnVar) {
        if (efnVar.a.d()) {
            ServerResponse serverResponse = (ServerResponse) efnVar.b;
            if (((ServerResponse) efnVar.b).getHeader().getResponseCode().equalsIgnoreCase("0")) {
                String jwt = ((LoginInfo) serverResponse.getBody()).getJwt();
                dioVar.p = jwt;
                dioVar.e.a(jwt);
                for (dhk dhkVar : dioVar.d) {
                    dhkVar.a(0);
                }
                return;
            }
            for (dhk dhkVar2 : dioVar.d) {
                dhkVar2.a(0, 0, dioVar.i.getString(R.string.check_network_connection));
            }
        }
    }

    static /* synthetic */ void e(dio dioVar) {
        for (dhk dhkVar : dioVar.d) {
            dhkVar.a(0, 0, dioVar.i.getString(R.string.check_network_connection));
        }
    }

    static /* synthetic */ void f(dio dioVar, efn efnVar) {
        if (efnVar.a.d()) {
            ServerResponse serverResponse = (ServerResponse) efnVar.b;
            new Gson().a(serverResponse);
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            if (serverResponse.getBody() != null && header.getResponseCode().equalsIgnoreCase("0")) {
                djv.b("jwt", ((LoginInfo) serverResponse.getBody()).getJwt());
                dioVar.e.u(((LoginInfo) serverResponse.getBody()).getJwt());
                dioVar.e.w(((LoginInfo) serverResponse.getBody()).getGroupFmc().getId());
                dioVar.e.r(((LoginInfo) serverResponse.getBody()).getUserProperties().getRegistered().booleanValue());
                dioVar.e.o(((LoginInfo) serverResponse.getBody()).getGroupFmc().isSubscribed());
                dioVar.e.x(new Gson().a(((LoginInfo) serverResponse.getBody()).getGroupFamily()));
                dioVar.e.p(((LoginInfo) serverResponse.getBody()).isIptv());
                djv.b("customerId", header.getCustomerId());
                dioVar.e.l(((LoginInfo) serverResponse.getBody()).getType());
                dioVar.e.m(((LoginInfo) serverResponse.getBody()).getRole());
                dioVar.e.e(((LoginInfo) serverResponse.getBody()).getCustomerName());
                dioVar.r = ((LoginInfo) serverResponse.getBody()).getJwt();
                dioVar.s = ((LoginInfo) serverResponse.getBody()).getCustomerName();
                dioVar.t = serverResponse.getHeader().getMsisdn();
                dioVar.e.k(false);
                for (dhk dhkVar : dioVar.d) {
                    dhkVar.a(1);
                }
            }
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                if (serverResponse.getBody() == null || ((LoginInfo) serverResponse.getBody()).getJwt() == null) {
                    return;
                }
                dioVar.e.b(((LoginInfo) serverResponse.getBody()).getAssociatedLines());
                bm.a(dioVar.i, new djk());
                return;
            } else if (header.getResponseCode().equalsIgnoreCase("1200")) {
                Toast.makeText(dioVar.i, "Expired", 0).show();
                return;
            } else if (dioVar.g != null) {
                if (header.getResponseCode().equalsIgnoreCase("1200")) {
                    dioVar.g.a(1, 1200, header.getResponseMessage());
                    return;
                } else {
                    dioVar.g.a(1, 1, header.getResponseMessage());
                    return;
                }
            } else {
                for (dhk dhkVar2 : dioVar.d) {
                    if (header.getResponseCode().equalsIgnoreCase("1200")) {
                        dhkVar2.a(1, 1200, header.getResponseMessage());
                    } else {
                        dhkVar2.a(1, 1, header.getResponseMessage());
                    }
                }
                return;
            }
        }
        for (dhk dhkVar3 : dioVar.d) {
            dhkVar3.a(1, 1, dioVar.i.getString(R.string.check_network_connection));
        }
    }

    static /* synthetic */ void f(dio dioVar) {
        for (dhk dhkVar : dioVar.d) {
            dhkVar.a(1, 1, dioVar.i.getString(R.string.check_network_connection));
        }
    }

    static /* synthetic */ void g(dio dioVar, efn efnVar) {
        if (efnVar.a.d()) {
            ServerResponse serverResponse = (ServerResponse) efnVar.b;
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            if (header.getResponseMessage().equalsIgnoreCase("Success")) {
                dioVar.e.k(false);
                dioVar.c();
            }
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                if (serverResponse.getBody() == null) {
                    return;
                }
                bm.a(dioVar.i, new djk());
                return;
            } else if (header.getResponseCode().equalsIgnoreCase("1200")) {
                Toast.makeText(dioVar.i, "Expired", 0).show();
                return;
            } else {
                for (dhk dhkVar : dioVar.d) {
                    if (header.getResponseCode().equalsIgnoreCase("1200")) {
                        dhkVar.a(10, 1200, header.getResponseMessage());
                    } else {
                        dhkVar.a(10, 1, header.getResponseMessage());
                    }
                }
                return;
            }
        }
        for (dhk dhkVar2 : dioVar.d) {
            dhkVar2.a(1, 1, dioVar.i.getString(R.string.check_network_connection));
        }
    }
}
