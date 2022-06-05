package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.AssociatedNumberResponseBody;
import com.ucare.we.model.BalanceResponseBody;
import com.ucare.we.model.BalanceTransferFinalizeRequestBody;
import com.ucare.we.model.BalanceTransferFinalizeResponseBody;
import com.ucare.we.model.BalanceTransferInitRequestBody;
import com.ucare.we.model.BalanceTransferInitResponseBody;
import com.ucare.we.model.MainPlanResponseBody;
import com.ucare.we.model.ResponseHeader;
import com.ucare.we.model.ServerRequest;
import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.SignInModel.GroupID;
import com.ucare.we.model.checkavailability.CheckAvailabilityRequest;
import com.ucare.we.model.checkavailability.CheckAvailabilityResponse;
import com.ucare.we.model.extras.ExtrasList;
import com.ucare.we.model.routerusernameandpassword.RouterUserNameAndPasswordResponseBody;
import com.ucare.we.model.special.SpecialList;
import com.ucare.we.model.suspendandresume.SuspendAndResumeReasonAndDurationResponse;
import com.ucare.we.model.suspendandresume.SuspendAndResumeResponse;
import com.ucare.we.model.usagedetails.HomePageResponseBody;
import com.ucare.we.model.usagedetails.SummarizedLineUsageItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;

/* renamed from: dhu  reason: default package */
/* loaded from: classes2.dex */
public class dhu extends czz implements dju {
    @Inject
    protected diq a;
    public cwk c;
    public dck d;
    @Inject
    dio e;
    @Inject
    djw f;
    @Inject
    djb g;
    @Inject
    Context h;
    dcm p;
    int r;
    String s;
    String t;
    List<SummarizedLineUsageItem> u;
    float w;
    private final int C = 1;
    private final int D = 2;
    private final int E = 3;
    protected efa<ServerResponse<BalanceTransferFinalizeResponseBody>> i = new efa<ServerResponse<BalanceTransferFinalizeResponseBody>>() { // from class: dhu.1
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<BalanceTransferFinalizeResponseBody>> eeyVar, efn<ServerResponse<BalanceTransferFinalizeResponseBody>> efnVar) {
            dhu.a(dhu.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<BalanceTransferFinalizeResponseBody>> eeyVar, Throwable th) {
            dhu.a(dhu.this, th);
        }
    };
    protected efa<ServerResponse<List<MainPlanResponseBody>>> j = new efa<ServerResponse<List<MainPlanResponseBody>>>() { // from class: dhu.7
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<List<MainPlanResponseBody>>> eeyVar, efn<ServerResponse<List<MainPlanResponseBody>>> efnVar) {
            dhu.b(dhu.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<List<MainPlanResponseBody>>> eeyVar, Throwable th) {
            dhu.b(dhu.this, th);
        }
    };
    protected efa<ServerResponse<List<AssociatedNumberResponseBody>>> k = new efa<ServerResponse<List<AssociatedNumberResponseBody>>>() { // from class: dhu.8
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<List<AssociatedNumberResponseBody>>> eeyVar, efn<ServerResponse<List<AssociatedNumberResponseBody>>> efnVar) {
            dhu.c(dhu.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<List<AssociatedNumberResponseBody>>> eeyVar, Throwable th) {
            dhu.c(dhu.this, th);
        }
    };
    protected efa<ServerResponse<BalanceTransferInitResponseBody>> l = new efa<ServerResponse<BalanceTransferInitResponseBody>>() { // from class: dhu.9
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<BalanceTransferInitResponseBody>> eeyVar, efn<ServerResponse<BalanceTransferInitResponseBody>> efnVar) {
            dhu.d(dhu.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<BalanceTransferInitResponseBody>> eeyVar, Throwable th) {
            dhu.d(dhu.this, th);
        }
    };
    protected efa<ServerResponse<ArrayList<ExtrasList>>> m = new efa<ServerResponse<ArrayList<ExtrasList>>>() { // from class: dhu.10
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<ArrayList<ExtrasList>>> eeyVar, efn<ServerResponse<ArrayList<ExtrasList>>> efnVar) {
            dhu.e(dhu.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<ArrayList<ExtrasList>>> eeyVar, Throwable th) {
            dhu.a(dhu.this);
        }
    };
    protected efa<ServerResponse<CheckAvailabilityResponse>> n = new efa<ServerResponse<CheckAvailabilityResponse>>() { // from class: dhu.11
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<CheckAvailabilityResponse>> eeyVar, efn<ServerResponse<CheckAvailabilityResponse>> efnVar) {
            dhu.f(dhu.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<CheckAvailabilityResponse>> eeyVar, Throwable th) {
            dhu.b(dhu.this);
        }
    };
    protected efa<SuspendAndResumeReasonAndDurationResponse> o = new efa<SuspendAndResumeReasonAndDurationResponse>() { // from class: dhu.12
        @Override // defpackage.efa
        public final void a(eey<SuspendAndResumeReasonAndDurationResponse> eeyVar, efn<SuspendAndResumeReasonAndDurationResponse> efnVar) {
            dhu.g(dhu.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<SuspendAndResumeReasonAndDurationResponse> eeyVar, Throwable th) {
            dhu.c(dhu.this);
        }
    };
    protected efa<ServerResponse<Boolean>> q = new efa<ServerResponse<Boolean>>() { // from class: dhu.13
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<Boolean>> eeyVar, efn<ServerResponse<Boolean>> efnVar) {
            dhu.h(dhu.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<Boolean>> eeyVar, Throwable th) {
            dhu.e(dhu.this, th);
        }
    };
    protected efa<ServerResponse<HomePageResponseBody>> v = new efa<ServerResponse<HomePageResponseBody>>() { // from class: dhu.14
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<HomePageResponseBody>> eeyVar, efn<ServerResponse<HomePageResponseBody>> efnVar) {
            dhu.i(dhu.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<HomePageResponseBody>> eeyVar, Throwable th) {
            dhu.f(dhu.this, th);
        }
    };
    protected efa<ServerResponse<BalanceResponseBody>> x = new efa<ServerResponse<BalanceResponseBody>>() { // from class: dhu.2
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<BalanceResponseBody>> eeyVar, efn<ServerResponse<BalanceResponseBody>> efnVar) {
            dhu.j(dhu.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<BalanceResponseBody>> eeyVar, Throwable th) {
            dhu.g(dhu.this, th);
        }
    };
    protected efa<ServerResponse<RouterUserNameAndPasswordResponseBody>> y = new efa<ServerResponse<RouterUserNameAndPasswordResponseBody>>() { // from class: dhu.3
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<RouterUserNameAndPasswordResponseBody>> eeyVar, efn<ServerResponse<RouterUserNameAndPasswordResponseBody>> efnVar) {
            dhu.k(dhu.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<RouterUserNameAndPasswordResponseBody>> eeyVar, Throwable th) {
            dhu.h(dhu.this, th);
        }
    };
    private String F = dhu.class.getSimpleName();
    protected efa<ServerResponse<ArrayList<SpecialList>>> z = new efa<ServerResponse<ArrayList<SpecialList>>>() { // from class: dhu.4
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<ArrayList<SpecialList>>> eeyVar, efn<ServerResponse<ArrayList<SpecialList>>> efnVar) {
            dhu.l(dhu.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<ArrayList<SpecialList>>> eeyVar, Throwable th) {
            dhu.d(dhu.this);
        }
    };
    protected efa<ServerResponse<SuspendAndResumeResponse>> A = new efa<ServerResponse<SuspendAndResumeResponse>>() { // from class: dhu.5
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<SuspendAndResumeResponse>> eeyVar, efn<ServerResponse<SuspendAndResumeResponse>> efnVar) {
            dhu.m(dhu.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<SuspendAndResumeResponse>> eeyVar, Throwable th) {
            dhu.e(dhu.this);
        }
    };
    protected efa<ServerResponse<String>> B = new efa<ServerResponse<String>>() { // from class: dhu.6
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, efn<ServerResponse<String>> efnVar) {
            dhu.n(dhu.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, Throwable th) {
            dhu.f(dhu.this);
        }
    };
    protected List<dht> b = new ArrayList();

    public final void a(dht dhtVar) {
        if (!this.b.contains(dhtVar)) {
            this.b.add(dhtVar);
        }
    }

    public final void b(dht dhtVar) {
        this.b.remove(dhtVar);
    }

    public final void a() {
        ServerRequest createServerRequest = ServerRequest.createServerRequest(this.f.m(), this.g.c.k(), new BalanceResponseBody());
        new Gson().a(createServerRequest);
        this.a.f("https://api-my.te.eg/api/line/balance", this.f.I(), createServerRequest).a(this.x);
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = this.f.m();
        }
        this.a.z("https://api-my.te.eg/api/router/details", this.f.I(), ServerRequest.createServerRequest(str, this.g.c.k(), new RouterUserNameAndPasswordResponseBody())).a(this.y);
    }

    public final void a(float f, String str) {
        this.s = str;
        this.a.K("https://api-my.te.eg/api/line/transferbalance/init", this.f.I(), ServerRequest.createServerRequest(this.f.m(), this.g.c.k(), new BalanceTransferInitRequestBody(f, this.f.m(), str))).a(this.l);
    }

    public final void a(float f, String str, String str2) {
        this.s = str;
        this.t = str2;
        this.a.L("https://api-my.te.eg/api/line/transferbalance/finalize", this.f.I(), ServerRequest.createServerRequest(this.f.m(), this.g.c.k(), new BalanceTransferFinalizeRequestBody(f, this.f.m(), str, str2))).a(this.i);
    }

    public final void b() {
        String m = this.f.m();
        if (this.e.l()) {
            this.a.N("https://api-my.te.eg/api/services/list/extras", this.f.I(), ServerRequest.createServerRequest(m, this.g.c.k(), new GroupID(this.f.N()))).a(this.m);
            return;
        }
        this.a.N("https://api-my.te.eg/api/services/list/extras", this.f.I(), ServerRequest.createServerRequest(m, this.g.c.k(), null)).a(this.m);
    }

    public final void a(CheckAvailabilityRequest checkAvailabilityRequest) {
        this.a.O("https://api-my.te.eg/api/services/check/availability", this.f.I(), ServerRequest.createServerRequest(this.f.m(), this.g.c.k(), checkAvailabilityRequest)).a(this.n);
    }

    public final void c() {
        String m = this.f.m();
        if (this.f.O()) {
            this.a.P("https://api-my.te.eg/api/services/list/offers/addon/special", this.f.I(), ServerRequest.createServerRequest(m, this.g.c.k(), new GroupID(this.f.N()))).a(this.z);
            return;
        }
        this.a.P("https://api-my.te.eg/api/services/list/offers/addon/special", this.f.I(), ServerRequest.createServerRequest(m, this.g.c.k(), new ArrayList())).a(this.z);
    }

    public final void d() {
        String str;
        if (this.f.O()) {
            str = this.f.N().equals("1") ? "https://api-my.te.eg/api/fmc/freeunitusage/grouplevel" : "https://api-my.te.eg/api/fmc/freeunitusage/groupaggregated";
        } else {
            str = "https://api-my.te.eg/api/line/freeunitusage";
        }
        ServerRequest createServerRequest = ServerRequest.createServerRequest(this.f.m(), this.g.c.k(), new GroupID(this.f.N()));
        new Gson().a(createServerRequest);
        this.a.M(str, this.f.I(), createServerRequest).a(this.v);
    }

    public final void e() {
        this.a.Q("https://api-my.te.eg/api/line/servicesandfeatures", this.f.I(), ServerRequest.createServerRequest(this.f.m(), this.g.c.k(), null)).a(this.j);
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this.h, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        if (i == 1) {
            a();
        } else if (i == 2) {
            a(this.r, this.s);
        } else if (i != 3) {
        } else {
            a(this.r, this.s, this.t);
        }
    }

    static /* synthetic */ void a(dhu dhuVar, efn efnVar) {
        if (efnVar.a.d()) {
            ServerResponse serverResponse = (ServerResponse) efnVar.b;
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            header.getResponseCode();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                if (serverResponse.getBody() != null && serverResponse.getBody() != null) {
                    for (dht dhtVar : dhuVar.b) {
                        dhtVar.s_();
                    }
                    return;
                }
            } else if (header.getResponseCode().equalsIgnoreCase("1200")) {
                dhuVar.b(3);
            }
            for (dht dhtVar2 : dhuVar.b) {
                if (header.getResponseCode().equalsIgnoreCase("1200")) {
                    dhtVar2.b(1200, header.getResponseMessage());
                } else {
                    dhtVar2.b(0, header.getResponseMessage());
                }
            }
            return;
        }
        for (dht dhtVar3 : dhuVar.b) {
            dhtVar3.b(0, dhuVar.h.getString(R.string.something_went_wrong));
        }
    }

    static /* synthetic */ void a(dhu dhuVar, Throwable th) {
        th.getMessage();
        try {
            if (!djm.a()) {
                for (dht dhtVar : dhuVar.b) {
                    dhtVar.b(0, dhuVar.h.getString(R.string.check_network_connection));
                }
                return;
            }
            for (dht dhtVar2 : dhuVar.b) {
                dhtVar2.b(0, dhuVar.h.getString(R.string.error_contacting_server));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void b(dhu dhuVar, efn efnVar) {
        if (efnVar.a.d()) {
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                ServerResponse serverResponse = (ServerResponse) efnVar.b;
                for (dht dhtVar : dhuVar.b) {
                    dhtVar.b((List) serverResponse.getBody());
                    dhtVar.c(header.getMsisdn());
                }
                return;
            }
            ResponseHeader header2 = ((ServerResponse) efnVar.b).getHeader();
            for (dht dhtVar2 : dhuVar.b) {
                if (header2.getResponseCode().equalsIgnoreCase("1200")) {
                    header2.getResponseMessage();
                    dhtVar2.p_();
                } else {
                    header2.getResponseMessage();
                    dhtVar2.p_();
                }
            }
        }
    }

    static /* synthetic */ void b(dhu dhuVar, Throwable th) {
        th.getMessage();
        try {
            if (!djm.a()) {
                for (dht dhtVar : dhuVar.b) {
                    dhuVar.h.getString(R.string.check_network_connection);
                    dhtVar.p_();
                }
                return;
            }
            for (dht dhtVar2 : dhuVar.b) {
                dhuVar.h.getString(R.string.error_contacting_server);
                dhtVar2.p_();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void c(dhu dhuVar, efn efnVar) {
        if (efnVar.a.d()) {
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                ServerResponse serverResponse = (ServerResponse) efnVar.b;
                for (dht dhtVar : dhuVar.b) {
                    dhtVar.c((List) serverResponse.getBody());
                }
                return;
            }
            for (dht dhtVar2 : dhuVar.b) {
                if (header.getResponseCode().equalsIgnoreCase("1200")) {
                    header.getResponseMessage();
                    dhtVar2.q_();
                } else {
                    header.getResponseMessage();
                    dhtVar2.q_();
                }
            }
        }
    }

    static /* synthetic */ void c(dhu dhuVar, Throwable th) {
        th.getMessage();
        try {
            if (!djm.a()) {
                for (dht dhtVar : dhuVar.b) {
                    dhuVar.h.getString(R.string.check_network_connection);
                    dhtVar.q_();
                }
                return;
            }
            for (dht dhtVar2 : dhuVar.b) {
                dhuVar.h.getString(R.string.error_contacting_server);
                dhtVar2.q_();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void d(dhu dhuVar, efn efnVar) {
        if (efnVar.a.d()) {
            ServerResponse serverResponse = (ServerResponse) efnVar.b;
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            header.getResponseCode();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                if (serverResponse.getBody() == null) {
                    return;
                }
                for (dht dhtVar : dhuVar.b) {
                    dhtVar.b(((BalanceTransferInitResponseBody) ((ServerResponse) efnVar.b).getBody()).getMaskedMsisdn());
                }
            } else if (header.getResponseCode().equalsIgnoreCase("1200")) {
                dhuVar.b(2);
            } else {
                for (dht dhtVar2 : dhuVar.b) {
                    if (header.getResponseCode().equalsIgnoreCase("1200")) {
                        dhtVar2.a(1200, header.getResponseMessage());
                    } else {
                        dhtVar2.a(0, header.getResponseMessage());
                    }
                }
            }
        }
    }

    static /* synthetic */ void d(dhu dhuVar, Throwable th) {
        th.getMessage();
        try {
            if (!djm.a()) {
                for (dht dhtVar : dhuVar.b) {
                    dhtVar.a(0, dhuVar.h.getString(R.string.check_network_connection));
                }
                return;
            }
            for (dht dhtVar2 : dhuVar.b) {
                dhtVar2.a(0, dhuVar.h.getString(R.string.error_contacting_server));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void e(dhu dhuVar, efn efnVar) {
        if (efnVar.a.d()) {
            ServerResponse serverResponse = (ServerResponse) efnVar.b;
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            header.getResponseCode();
            if (header.getResponseCode().equalsIgnoreCase("0") && serverResponse.getBody() != null && serverResponse.getBody() != null) {
                for (dht dhtVar : dhuVar.b) {
                    dhtVar.a((ArrayList) ((ServerResponse) efnVar.b).getBody());
                }
                return;
            }
            for (dht dhtVar2 : dhuVar.b) {
                header.getResponseCode().equalsIgnoreCase("1200");
                dhtVar2.a_(header.getResponseMessage());
            }
        }
    }

    static /* synthetic */ void a(dhu dhuVar) {
        try {
            if (!djm.a()) {
                for (dht dhtVar : dhuVar.b) {
                    dhtVar.a_(dhuVar.h.getString(R.string.check_network_connection));
                }
                return;
            }
            for (dht dhtVar2 : dhuVar.b) {
                dhtVar2.a_(dhuVar.h.getString(R.string.error_contacting_server));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void f(dhu dhuVar, efn efnVar) {
        if (efnVar.a.d()) {
            ServerResponse serverResponse = (ServerResponse) efnVar.b;
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            header.getResponseCode();
            if (header.getResponseCode().equalsIgnoreCase("0") && serverResponse.getBody() != null && serverResponse.getBody() != null) {
                dhuVar.d.a((CheckAvailabilityResponse) ((ServerResponse) efnVar.b).getBody());
                return;
            }
            header.getResponseCode().equalsIgnoreCase("1200");
            dhuVar.d.f(header.getResponseMessage());
        }
    }

    static /* synthetic */ void b(dhu dhuVar) {
        try {
            if (!djm.a()) {
                Iterator<dht> it = dhuVar.b.iterator();
                while (it.hasNext()) {
                    it.next();
                    dhuVar.d.f(dhuVar.h.getString(R.string.check_network_connection));
                }
                return;
            }
            Iterator<dht> it2 = dhuVar.b.iterator();
            while (it2.hasNext()) {
                it2.next();
                dhuVar.d.f(dhuVar.h.getString(R.string.error_contacting_server));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void g(dhu dhuVar, efn efnVar) {
        if (efnVar.a.d()) {
            for (dht dhtVar : dhuVar.b) {
                dhtVar.g();
            }
            return;
        }
        for (dht dhtVar2 : dhuVar.b) {
            dhuVar.h.getString(R.string.check_network_connection);
            dhtVar2.h();
        }
    }

    static /* synthetic */ void c(dhu dhuVar) {
        try {
            if (!djm.a()) {
                for (dht dhtVar : dhuVar.b) {
                    dhuVar.h.getString(R.string.check_network_connection);
                    dhtVar.h();
                }
                return;
            }
            for (dht dhtVar2 : dhuVar.b) {
                dhuVar.h.getString(R.string.error_contacting_server);
                dhtVar2.h();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void h(dhu dhuVar, efn efnVar) {
        ((ServerResponse) efnVar.b).getHeader();
        String responseMessage = ((ServerResponse) efnVar.b).getHeader().getResponseMessage();
        boolean booleanValue = ((ServerResponse) efnVar.b).getBody() != null ? ((Boolean) ((ServerResponse) efnVar.b).getBody()).booleanValue() : false;
        if (responseMessage.equals("Success")) {
            dhuVar.p.b(booleanValue);
        } else {
            dhuVar.p.a();
        }
    }

    static /* synthetic */ void e(dhu dhuVar, Throwable th) {
        th.getMessage();
        try {
            if (!djm.a()) {
                for (dht dhtVar : dhuVar.b) {
                    dhuVar.h.getString(R.string.check_network_connection);
                    dhtVar.r_();
                }
                return;
            }
            for (dht dhtVar2 : dhuVar.b) {
                dhuVar.h.getString(R.string.error_contacting_server);
                dhtVar2.r_();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void i(dhu dhuVar, efn efnVar) {
        if (efnVar.a.d()) {
            ServerResponse serverResponse = (ServerResponse) efnVar.b;
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            header.getResponseCode();
            if (header.getResponseCode().equalsIgnoreCase("0") && serverResponse.getBody() != null && serverResponse.getBody() != null) {
                cyq a = cys.a((HomePageResponseBody) ((ServerResponse) efnVar.b).getBody());
                dhuVar.u = ((HomePageResponseBody) serverResponse.getBody()).getSummarizedLineUsageList();
                for (int i = 0; i < dhuVar.u.size(); i++) {
                    if (dhuVar.u.get(i).getTabId().longValue() == 100) {
                        dhuVar.c.pointsCallback(dhuVar.u.get(i));
                        dhuVar.u.remove(i);
                    }
                }
                if (dhuVar.f.P().isSubscribed()) {
                    dhuVar.u.add(new SummarizedLineUsageItem("110022", "Family Plan", "خطة العائلة", 0.0f, 0.0f, 0.0f, 0.0f, "Family Plan", "", "Family Plan", "خطة العائلة", Long.valueOf(Long.parseLong("110022")), "Family Plan", ""));
                }
                String msisdn = header.getMsisdn();
                for (dht dhtVar : dhuVar.b) {
                    dhtVar.a(dhuVar.u);
                    dhtVar.a(a);
                    dhtVar.c(msisdn);
                }
                return;
            }
            for (dht dhtVar2 : dhuVar.b) {
                if (header.getResponseCode().equalsIgnoreCase("1200")) {
                    header.getResponseMessage();
                    dhtVar2.a_(1200);
                } else {
                    header.getResponseMessage();
                    dhtVar2.a_(0);
                }
            }
            return;
        }
        new StringBuilder("LineProvide=>").append(efnVar.c.toString());
    }

    static /* synthetic */ void f(dhu dhuVar, Throwable th) {
        th.getMessage();
        try {
            if (!djm.a()) {
                for (dht dhtVar : dhuVar.b) {
                    dhuVar.h.getString(R.string.check_network_connection);
                    dhtVar.a_(0);
                }
                return;
            }
            for (dht dhtVar2 : dhuVar.b) {
                dhuVar.h.getString(R.string.error_contacting_server);
                dhtVar2.a_(0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void j(dhu dhuVar, efn efnVar) {
        if (efnVar.a.d()) {
            ServerResponse serverResponse = (ServerResponse) efnVar.b;
            new Gson().a(serverResponse);
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            header.getResponseCode();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                if (serverResponse.getBody() != null) {
                    dhuVar.w = ((BalanceResponseBody) serverResponse.getBody()).getBalance();
                    new StringBuilder().append(dhuVar.w);
                    for (dht dhtVar : dhuVar.b) {
                        dhtVar.a(dhuVar.w);
                    }
                    return;
                }
            } else if (header.getResponseCode().equalsIgnoreCase("1200")) {
                dhuVar.b(1);
            }
            for (dht dhtVar2 : dhuVar.b) {
                if (header.getResponseCode().equalsIgnoreCase("1200")) {
                    header.getResponseMessage();
                    dhtVar2.r_();
                } else {
                    header.getResponseMessage();
                    dhtVar2.r_();
                }
            }
        }
    }

    static /* synthetic */ void g(dhu dhuVar, Throwable th) {
        th.getMessage();
        try {
            if (!djm.a()) {
                for (dht dhtVar : dhuVar.b) {
                    dhuVar.h.getString(R.string.check_network_connection);
                    dhtVar.r_();
                }
                return;
            }
            for (dht dhtVar2 : dhuVar.b) {
                dhuVar.h.getString(R.string.error_contacting_server);
                dhtVar2.r_();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void k(dhu dhuVar, efn efnVar) {
        if (efnVar.a.d()) {
            ServerResponse serverResponse = (ServerResponse) efnVar.b;
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            header.getResponseCode();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                if (serverResponse.getBody() != null) {
                    String routerUserName = ((RouterUserNameAndPasswordResponseBody) serverResponse.getBody()).getRouterUserName();
                    String routerPassword = ((RouterUserNameAndPasswordResponseBody) serverResponse.getBody()).getRouterPassword();
                    new StringBuilder().append(dhuVar.w);
                    for (dht dhtVar : dhuVar.b) {
                        dhtVar.a(routerUserName, routerPassword);
                    }
                    return;
                }
            } else if (header.getResponseCode().equalsIgnoreCase("1200")) {
                dhuVar.b(1);
            }
            for (dht dhtVar2 : dhuVar.b) {
                header.getResponseCode().equalsIgnoreCase("1200");
                dhtVar2.a(header.getResponseMessage());
            }
        }
    }

    static /* synthetic */ void h(dhu dhuVar, Throwable th) {
        th.getMessage();
        try {
            if (!djm.a()) {
                for (dht dhtVar : dhuVar.b) {
                    dhtVar.a(dhuVar.h.getString(R.string.check_network_connection));
                }
                return;
            }
            for (dht dhtVar2 : dhuVar.b) {
                dhtVar2.a(dhuVar.h.getString(R.string.error_contacting_server));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void l(dhu dhuVar, efn efnVar) {
        if (efnVar.a.d()) {
            ServerResponse serverResponse = (ServerResponse) efnVar.b;
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            header.getResponseCode();
            if (header.getResponseCode().equalsIgnoreCase("0") && serverResponse.getBody() != null && serverResponse.getBody() != null) {
                for (dht dhtVar : dhuVar.b) {
                    dhtVar.b((ArrayList) ((ServerResponse) efnVar.b).getBody());
                }
                return;
            }
            for (dht dhtVar2 : dhuVar.b) {
                if (header.getResponseCode().equalsIgnoreCase("1200")) {
                    header.getResponseMessage();
                    dhtVar2.a_(1200);
                } else {
                    header.getResponseMessage();
                    dhtVar2.a_(0);
                }
            }
        }
    }

    static /* synthetic */ void d(dhu dhuVar) {
        try {
            if (!djm.a()) {
                for (dht dhtVar : dhuVar.b) {
                    dhtVar.e(dhuVar.h.getString(R.string.check_network_connection));
                }
                return;
            }
            for (dht dhtVar2 : dhuVar.b) {
                dhtVar2.e(dhuVar.h.getString(R.string.error_contacting_server));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void m(dhu dhuVar, efn efnVar) {
        if (efnVar.a.d()) {
            ServerResponse serverResponse = (ServerResponse) efnVar.b;
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            header.getResponseCode();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                new StringBuilder().append(dhuVar.w);
                for (dht dhtVar : dhuVar.b) {
                    serverResponse.getBody();
                    dhtVar.e();
                }
                return;
            }
            if (header.getResponseCode().equalsIgnoreCase("1200")) {
                dhuVar.b(1);
            }
            for (dht dhtVar2 : dhuVar.b) {
                if (header.getResponseCode().equalsIgnoreCase("1200")) {
                    header.getResponseMessage();
                    dhtVar2.f();
                } else {
                    header.getResponseMessage();
                    dhtVar2.f();
                }
            }
        }
    }

    static /* synthetic */ void e(dhu dhuVar) {
        try {
            if (!djm.a()) {
                for (dht dhtVar : dhuVar.b) {
                    dhuVar.h.getString(R.string.check_network_connection);
                    dhtVar.f();
                }
                return;
            }
            for (dht dhtVar2 : dhuVar.b) {
                dhuVar.h.getString(R.string.error_contacting_server);
                dhtVar2.f();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void n(dhu dhuVar, efn efnVar) {
        if (efnVar.a.d()) {
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            header.getResponseCode();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                new StringBuilder().append(dhuVar.w);
                for (dht dhtVar : dhuVar.b) {
                    header.getResponseMessage();
                    dhtVar.i();
                }
                return;
            }
            if (header.getResponseCode().equalsIgnoreCase("1200")) {
                dhuVar.b(1);
            }
            for (dht dhtVar2 : dhuVar.b) {
                if (header.getResponseCode().equalsIgnoreCase("1200")) {
                    header.getResponseMessage();
                    dhtVar2.j();
                } else {
                    header.getResponseMessage();
                    dhtVar2.j();
                }
            }
        }
    }

    static /* synthetic */ void f(dhu dhuVar) {
        try {
            if (!djm.a()) {
                for (dht dhtVar : dhuVar.b) {
                    dhuVar.h.getString(R.string.check_network_connection);
                    dhtVar.j();
                }
                return;
            }
            for (dht dhtVar2 : dhuVar.b) {
                dhuVar.h.getString(R.string.error_contacting_server);
                dhtVar2.j();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }
}
