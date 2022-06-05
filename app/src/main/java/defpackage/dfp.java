package defpackage;

import android.content.Context;
import com.ucare.we.R;
import com.ucare.we.model.MoreBundleModel.ResponseRetrieveMoreBundleHeader;
import com.ucare.we.model.ResponseHeader;
import com.ucare.we.model.ServerRequest;
import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.family.FamilyCreateGroupRequestBody;
import com.ucare.we.model.family.FamilyCreateGroupResponseBody;
import com.ucare.we.model.family.FamilyOffersAddonsResponseBody;
import com.ucare.we.model.family.FamilyPlansResponseBody;
import com.ucare.we.model.family.ManageConsumptionLimitMembersResponseBody;
import com.ucare.we.model.family.QueryConsumptionLimitResponseBody;
import com.ucare.we.model.local.family.FamilyPrimaryOffersRequestBody;
import com.ucare.we.model.local.family.FamilySuppOffersRequestBody;
import com.ucare.we.model.local.family.OffersRequestArray;
import com.ucare.we.model.local.family.QueryConsumptionLimitRequestBody;
import com.ucare.we.model.remote.subscribedoffers.FamilySubscribedOffer;
import java.io.IOException;
import java.util.ArrayList;
import javax.inject.Inject;

/* renamed from: dfp  reason: default package */
/* loaded from: classes2.dex */
public final class dfp extends czz {
    @Inject
    protected diq a;
    protected dfr b;
    protected dfo c;
    protected dfn d;
    protected dec e;
    protected dfl f;
    protected dfq g;
    protected dei h;
    protected dfm i;
    @Inject
    djw j;
    @Inject
    djb k;
    @Inject
    Context l;
    protected efa<ServerResponse<ArrayList<FamilySubscribedOffer>>> m = new efa<ServerResponse<ArrayList<FamilySubscribedOffer>>>() { // from class: dfp.1
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<ArrayList<FamilySubscribedOffer>>> eeyVar, efn<ServerResponse<ArrayList<FamilySubscribedOffer>>> efnVar) {
            dfp.a(dfp.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<ArrayList<FamilySubscribedOffer>>> eeyVar, Throwable th) {
            dfp dfpVar = dfp.this;
            try {
                if (!djm.a()) {
                    dfpVar.l.getString(R.string.check_network_connection);
                } else {
                    dfpVar.l.getString(R.string.error_contacting_server);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    };
    protected efa<ServerResponse<FamilyCreateGroupResponseBody>> n = new efa<ServerResponse<FamilyCreateGroupResponseBody>>() { // from class: dfp.2
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<FamilyCreateGroupResponseBody>> eeyVar, efn<ServerResponse<FamilyCreateGroupResponseBody>> efnVar) {
            dfp.b(dfp.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<FamilyCreateGroupResponseBody>> eeyVar, Throwable th) {
            dfp.a(dfp.this);
        }
    };
    protected efa<ServerResponse<ArrayList<FamilyPlansResponseBody>>> o = new efa<ServerResponse<ArrayList<FamilyPlansResponseBody>>>() { // from class: dfp.3
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<ArrayList<FamilyPlansResponseBody>>> eeyVar, efn<ServerResponse<ArrayList<FamilyPlansResponseBody>>> efnVar) {
            dfp.c(dfp.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<ArrayList<FamilyPlansResponseBody>>> eeyVar, Throwable th) {
            dfp.b(dfp.this);
        }
    };
    protected efa<ddz> p = new efa<ddz>() { // from class: dfp.4
        @Override // defpackage.efa
        public final void a(eey<ddz> eeyVar, efn<ddz> efnVar) {
            dfp.d(dfp.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ddz> eeyVar, Throwable th) {
            dfp.c(dfp.this);
        }
    };
    protected efa<ServerResponse<FamilyOffersAddonsResponseBody>> q = new efa<ServerResponse<FamilyOffersAddonsResponseBody>>() { // from class: dfp.5
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<FamilyOffersAddonsResponseBody>> eeyVar, efn<ServerResponse<FamilyOffersAddonsResponseBody>> efnVar) {
            dfp.e(dfp.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<FamilyOffersAddonsResponseBody>> eeyVar, Throwable th) {
            dfp.d(dfp.this);
        }
    };
    protected efa<ServerResponse<String>> r = new efa<ServerResponse<String>>() { // from class: dfp.6
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, efn<ServerResponse<String>> efnVar) {
            dfp.f(dfp.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, Throwable th) {
            dfp.e(dfp.this);
        }
    };
    protected efa<ServerResponse<QueryConsumptionLimitResponseBody>> s = new efa<ServerResponse<QueryConsumptionLimitResponseBody>>() { // from class: dfp.7
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<QueryConsumptionLimitResponseBody>> eeyVar, efn<ServerResponse<QueryConsumptionLimitResponseBody>> efnVar) {
            dfp.g(dfp.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<QueryConsumptionLimitResponseBody>> eeyVar, Throwable th) {
            dfp.f(dfp.this);
        }
    };
    protected efa<ServerResponse<ManageConsumptionLimitMembersResponseBody>> t = new efa<ServerResponse<ManageConsumptionLimitMembersResponseBody>>() { // from class: dfp.8
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<ManageConsumptionLimitMembersResponseBody>> eeyVar, efn<ServerResponse<ManageConsumptionLimitMembersResponseBody>> efnVar) {
            dfp.h(dfp.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<ManageConsumptionLimitMembersResponseBody>> eeyVar, Throwable th) {
            dfp.g(dfp.this);
        }
    };

    public final void a(dfo dfoVar) {
        this.c = dfoVar;
    }

    public final void a(dfm dfmVar) {
        this.i = dfmVar;
    }

    public final void a(dfn dfnVar) {
        this.d = dfnVar;
    }

    public final void a(dec decVar) {
        this.e = decVar;
    }

    public final void a(dfl dflVar) {
        this.f = dflVar;
    }

    public final void a(dfq dfqVar) {
        this.g = dfqVar;
    }

    public final void a(dei deiVar) {
        this.h = deiVar;
    }

    public final void a(String str) {
        this.a.m("https://api-my.te.eg/api/family/create-family-group", this.j.I(), ServerRequest.createServerRequest(this.j.m(), this.k.c.k(), new FamilyCreateGroupRequestBody(str))).a(this.n);
    }

    public final void a() {
        this.a.n("https://api-my.te.eg/api/services/list/family-primary-offers", this.j.I(), ServerRequest.createServerRequest(this.j.m(), this.k.c.k(), new FamilyPrimaryOffersRequestBody(this.j.P().getId()))).a(this.o);
    }

    public final void b() {
        this.a.p("https://api-my.te.eg/api/services/list/family-offers/addon", this.j.I(), ServerRequest.createServerRequest(this.j.m(), this.k.c.k(), new FamilyPrimaryOffersRequestBody(this.j.P().getId()))).a(this.p);
    }

    public final void c() {
        this.a.o("https://api-my.te.eg/api/services/list/family-offers/addon", this.j.I(), ServerRequest.createServerRequest(this.j.m(), this.k.c.k(), new FamilyPrimaryOffersRequestBody(this.j.P().getId()))).a(this.q);
    }

    public final void a(ArrayList<OffersRequestArray> arrayList) {
        this.a.q("https://api-my.te.eg/api/services/change/family/suppoffers", this.j.I(), ServerRequest.createServerRequest(this.j.m(), this.k.c.k(), new FamilySuppOffersRequestBody(this.j.P().getId(), arrayList))).a(this.r);
    }

    public final void b(String str) {
        this.a.r("https://api-my.te.eg/api/family/query-shared-limit", this.j.I(), ServerRequest.createServerRequest(this.j.m(), this.k.c.k(), new QueryConsumptionLimitRequestBody(this.j.P().getId(), str))).a(this.s);
    }

    public final void d() {
        this.a.s("https://api-my.te.eg/api/family/query-shared-limit-member", this.j.I(), ServerRequest.createServerRequest(this.j.m(), this.k.c.k(), new FamilyPrimaryOffersRequestBody(this.j.P().getId()))).a(this.t);
    }

    static /* synthetic */ void a(dfp dfpVar, efn efnVar) {
        if (efnVar.a.d()) {
            ServerResponse serverResponse = (ServerResponse) efnVar.b;
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                if (dfpVar.b == null || serverResponse.getBody() == null) {
                    return;
                }
                serverResponse.getBody();
            } else if (header.getResponseCode().equalsIgnoreCase("1200")) {
                header.getResponseMessage();
            } else {
                header.getResponseMessage();
            }
        }
    }

    static /* synthetic */ void b(dfp dfpVar, efn efnVar) {
        if (efnVar.a.d()) {
            ServerResponse<FamilyCreateGroupResponseBody> serverResponse = (ServerResponse) efnVar.b;
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            int parseInt = Integer.parseInt(header.getResponseCode());
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                if (dfpVar.i == null || serverResponse.getBody() == null) {
                    return;
                }
                dfpVar.i.a(serverResponse);
            } else if (parseInt == 3239 || parseInt == 9001 || parseInt == 8001) {
                dfpVar.i.a(parseInt, header.getResponseMessage());
            } else if (header.getResponseCode().equalsIgnoreCase("1200")) {
                dfpVar.i.a(1200, header.getResponseMessage());
            } else {
                dfpVar.i.a(0, header.getResponseMessage());
            }
        }
    }

    static /* synthetic */ void a(dfp dfpVar) {
        try {
            if (!djm.a()) {
                dfpVar.i.a(0, dfpVar.l.getString(R.string.check_network_connection));
            } else {
                dfpVar.i.a(0, dfpVar.l.getString(R.string.error_contacting_server));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void c(dfp dfpVar, efn efnVar) {
        if (efnVar.a.d()) {
            ServerResponse serverResponse = (ServerResponse) efnVar.b;
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                if (serverResponse.getBody() == null) {
                    return;
                }
                dfpVar.c.a((ArrayList) serverResponse.getBody());
                return;
            }
            header.getResponseCode().equalsIgnoreCase("1200");
            dfpVar.c.g(header.getResponseMessage());
        }
    }

    static /* synthetic */ void b(dfp dfpVar) {
        try {
            if (!djm.a()) {
                dfpVar.c.g(dfpVar.l.getString(R.string.check_network_connection));
            } else {
                dfpVar.c.g(dfpVar.l.getString(R.string.error_contacting_server));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void d(dfp dfpVar, efn efnVar) {
        if (efnVar.a.d()) {
            ddz ddzVar = (ddz) efnVar.b;
            ResponseRetrieveMoreBundleHeader responseRetrieveMoreBundleHeader = ((ddz) efnVar.b).a;
            if (!responseRetrieveMoreBundleHeader.getResponseCode().equalsIgnoreCase("0")) {
                if (responseRetrieveMoreBundleHeader.getResponseCode().equalsIgnoreCase("1200")) {
                    dfpVar.e.a(1200, responseRetrieveMoreBundleHeader.getResponseMessage());
                } else {
                    dfpVar.e.a(0, responseRetrieveMoreBundleHeader.getResponseMessage());
                }
            } else if (ddzVar.b == null) {
            } else {
                dfpVar.e.a(ddzVar);
            }
        }
    }

    static /* synthetic */ void c(dfp dfpVar) {
        try {
            if (!djm.a()) {
                dfpVar.e.a(0, dfpVar.l.getString(R.string.check_network_connection));
            } else {
                dfpVar.e.a(0, dfpVar.l.getString(R.string.error_contacting_server));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void e(dfp dfpVar, efn efnVar) {
        if (efnVar.a.d()) {
            ServerResponse serverResponse = (ServerResponse) efnVar.b;
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                if (serverResponse.getBody() == null) {
                    return;
                }
                dfpVar.d.a(((FamilyOffersAddonsResponseBody) serverResponse.getBody()).getAvailableAddOnOfferingsList());
                return;
            }
            header.getResponseCode().equalsIgnoreCase("1200");
            dfpVar.d.a(header.getResponseMessage());
        }
    }

    static /* synthetic */ void d(dfp dfpVar) {
        try {
            if (!djm.a()) {
                dfpVar.d.a(dfpVar.l.getString(R.string.check_network_connection));
            } else {
                dfpVar.d.a(dfpVar.l.getString(R.string.error_contacting_server));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void f(dfp dfpVar, efn efnVar) {
        if (efnVar.b != 0 && efnVar.a.d()) {
            ServerResponse serverResponse = (ServerResponse) efnVar.b;
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                if (serverResponse == null) {
                    return;
                }
                dfpVar.f.a(serverResponse);
                return;
            } else if (header.getResponseCode().equalsIgnoreCase("1200")) {
                dfpVar.f.a(1200, header.getResponseMessage());
                return;
            } else {
                dfpVar.f.a(Integer.parseInt(header.getResponseCode()), header.getResponseMessage());
                return;
            }
        }
        dfpVar.f.a(0, dfpVar.l.getString(R.string.please_try_again));
    }

    static /* synthetic */ void e(dfp dfpVar) {
        try {
            if (!djm.a()) {
                dfpVar.f.a(0, dfpVar.l.getString(R.string.check_network_connection));
            } else {
                dfpVar.f.a(0, dfpVar.l.getString(R.string.error_contacting_server));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void g(dfp dfpVar, efn efnVar) {
        if (efnVar.a.d()) {
            ServerResponse serverResponse = (ServerResponse) efnVar.b;
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                if (serverResponse == null) {
                    return;
                }
                dfpVar.g.a(((QueryConsumptionLimitResponseBody) serverResponse.getBody()).getSharedLimitDetails());
            } else if (header.getResponseCode().equalsIgnoreCase("1200")) {
                dfq dfqVar = dfpVar.g;
                header.getResponseMessage();
                dfqVar.b();
            } else {
                dfq dfqVar2 = dfpVar.g;
                header.getResponseMessage();
                dfqVar2.b();
            }
        }
    }

    static /* synthetic */ void f(dfp dfpVar) {
        try {
            if (!djm.a()) {
                dfq dfqVar = dfpVar.g;
                dfpVar.l.getString(R.string.check_network_connection);
                dfqVar.b();
                return;
            }
            dfq dfqVar2 = dfpVar.g;
            dfpVar.l.getString(R.string.error_contacting_server);
            dfqVar2.b();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void h(dfp dfpVar, efn efnVar) {
        if (efnVar.a.d()) {
            ServerResponse serverResponse = (ServerResponse) efnVar.b;
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                if (serverResponse == null) {
                    return;
                }
                dfpVar.h.a(((ManageConsumptionLimitMembersResponseBody) serverResponse.getBody()).getDetailedLineUsageList());
                return;
            }
            header.getResponseCode().equalsIgnoreCase("1200");
            dei deiVar = dfpVar.h;
            header.getResponseMessage();
            deiVar.a();
        }
    }

    static /* synthetic */ void g(dfp dfpVar) {
        try {
            if (!djm.a()) {
                dei deiVar = dfpVar.h;
                dfpVar.l.getString(R.string.check_network_connection);
                deiVar.a();
                return;
            }
            dei deiVar2 = dfpVar.h;
            dfpVar.l.getString(R.string.error_contacting_server);
            deiVar2.a();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }
}
