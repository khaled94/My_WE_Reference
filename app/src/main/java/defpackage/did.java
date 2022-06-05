package defpackage;

import android.content.Context;
import com.ucare.we.R;
import com.ucare.we.model.Offer;
import com.ucare.we.model.PlansAndBundlesResponseBody;
import com.ucare.we.model.RenewMainPlanRequestBody;
import com.ucare.we.model.ResponseHeader;
import com.ucare.we.model.ServerRequest;
import com.ucare.we.model.ServerResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/* renamed from: did  reason: default package */
/* loaded from: classes2.dex */
public final class did extends czz {
    @Inject
    protected diq a;
    @Inject
    dio c;
    @Inject
    djb d;
    @Inject
    djw e;
    @Inject
    Context f;
    @Inject
    djg j;
    public eey<ServerResponse<List<PlansAndBundlesResponseBody>>> l;
    private List<PlansAndBundlesResponseBody> n;
    protected efa<ServerResponse<String>> g = new efa<ServerResponse<String>>() { // from class: did.1
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, efn<ServerResponse<String>> efnVar) {
            did.a(did.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, Throwable th) {
            did.a(did.this, th);
        }
    };
    protected efa<ServerResponse<String>> h = new efa<ServerResponse<String>>() { // from class: did.2
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, efn<ServerResponse<String>> efnVar) {
            did.b(did.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, Throwable th) {
            did.b(did.this, th);
        }
    };
    protected efa<ServerResponse<String>> i = new efa<ServerResponse<String>>() { // from class: did.3
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, efn<ServerResponse<String>> efnVar) {
            did.c(did.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, Throwable th) {
            did.c(did.this, th);
        }
    };
    protected efa<ServerResponse<String>> k = new efa<ServerResponse<String>>() { // from class: did.4
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, efn<ServerResponse<String>> efnVar) {
            did.d(did.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, Throwable th) {
            did.d(did.this, th);
        }
    };
    protected efa<ServerResponse<List<PlansAndBundlesResponseBody>>> m = new efa<ServerResponse<List<PlansAndBundlesResponseBody>>>() { // from class: did.5
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<List<PlansAndBundlesResponseBody>>> eeyVar, efn<ServerResponse<List<PlansAndBundlesResponseBody>>> efnVar) {
            did.e(did.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<List<PlansAndBundlesResponseBody>>> eeyVar, Throwable th) {
            did.e(did.this, th);
        }
    };
    protected List<dic> b = new ArrayList();

    public final void a(dic dicVar) {
        if (this.b.size() == 0) {
            this.b.add(dicVar);
        }
    }

    public final void b(dic dicVar) {
        this.b.remove(dicVar);
    }

    public final void a() {
        eey<ServerResponse<List<PlansAndBundlesResponseBody>>> V = this.a.V("https://api-my.te.eg/api/services/list/offers", this.e.I(), ServerRequest.createServerRequest(this.e.m(), this.d.c.k(), new PlansAndBundlesResponseBody()));
        V.a(this.m);
        this.l = V;
    }

    public final void a(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Offer(str, "delete"));
        arrayList.add(new Offer(str, "add"));
        RenewMainPlanRequestBody renewMainPlanRequestBody = new RenewMainPlanRequestBody();
        renewMainPlanRequestBody.setMsisdn(this.e.m());
        renewMainPlanRequestBody.setOffers(arrayList);
        this.a.W("https://api-my.te.eg/api/services/change/suppoffers", this.e.I(), ServerRequest.createServerRequest(this.e.m(), this.d.c.k(), renewMainPlanRequestBody)).a(this.g);
    }

    public final void b(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Offer(str, "delete"));
        RenewMainPlanRequestBody renewMainPlanRequestBody = new RenewMainPlanRequestBody();
        renewMainPlanRequestBody.setMsisdn(this.e.m());
        renewMainPlanRequestBody.setOffers(arrayList);
        this.a.W("https://api-my.te.eg/api/services/change/suppoffers", this.e.I(), ServerRequest.createServerRequest(this.e.m(), this.d.c.k(), renewMainPlanRequestBody)).a(this.h);
    }

    public final void c(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Offer(str, "delete"));
        arrayList.add(new Offer(str, "add"));
        RenewMainPlanRequestBody renewMainPlanRequestBody = new RenewMainPlanRequestBody();
        renewMainPlanRequestBody.setMsisdn(this.e.m());
        renewMainPlanRequestBody.setOffers(arrayList);
        this.a.X("https://api-my.te.eg/api/services/change/suppoffers", this.e.I(), ServerRequest.createServerRequest(this.e.m(), this.d.c.k(), renewMainPlanRequestBody)).a(this.k);
    }

    public final void a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Offer(str, "delete"));
        arrayList.add(new Offer(str2, "add"));
        RenewMainPlanRequestBody renewMainPlanRequestBody = new RenewMainPlanRequestBody();
        renewMainPlanRequestBody.setMsisdn(this.e.m());
        renewMainPlanRequestBody.setOffers(arrayList);
        this.a.W("https://api-my.te.eg/api/services/change/mainoffers", this.e.I(), ServerRequest.createServerRequest(this.e.m(), this.d.g(), renewMainPlanRequestBody)).a(this.i);
    }

    static /* synthetic */ void a(did didVar, efn efnVar) {
        if (efnVar.a.d()) {
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                for (dic dicVar : didVar.b) {
                    dicVar.b_(header.getResponseMessage());
                }
                return;
            }
            for (dic dicVar2 : didVar.b) {
                if (header.getResponseCode().equalsIgnoreCase("1200")) {
                    dicVar2.a_(1200, header.getResponseMessage());
                } else {
                    dicVar2.a_(0, header.getResponseMessage());
                }
            }
        }
    }

    static /* synthetic */ void a(did didVar, Throwable th) {
        th.getMessage();
        try {
            if (!djm.a()) {
                for (dic dicVar : didVar.b) {
                    dicVar.a_(0, didVar.f.getString(R.string.check_network_connection));
                }
                return;
            }
            for (dic dicVar2 : didVar.b) {
                dicVar2.a_(0, didVar.f.getString(R.string.error_contacting_server));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void b(did didVar, efn efnVar) {
        if (efnVar.a.d()) {
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                for (dic dicVar : didVar.b) {
                    dicVar.c_(header.getResponseMessage());
                }
                return;
            }
            for (dic dicVar2 : didVar.b) {
                if (header.getResponseCode().equalsIgnoreCase("1200")) {
                    dicVar2.b_(1200, header.getResponseMessage());
                } else {
                    dicVar2.b_(0, header.getResponseMessage());
                }
            }
        }
    }

    static /* synthetic */ void b(did didVar, Throwable th) {
        th.getMessage();
        try {
            if (!djm.a()) {
                for (dic dicVar : didVar.b) {
                    dicVar.b_(0, didVar.f.getString(R.string.check_network_connection));
                }
                return;
            }
            for (dic dicVar2 : didVar.b) {
                dicVar2.b_(0, didVar.f.getString(R.string.error_contacting_server));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void c(did didVar, efn efnVar) {
        if (efnVar.a.d()) {
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                for (dic dicVar : didVar.b) {
                    dicVar.d(header.getResponseMessage());
                }
                return;
            }
            for (dic dicVar2 : didVar.b) {
                if (header.getResponseCode().equalsIgnoreCase("1200")) {
                    dicVar2.d(1200, header.getResponseMessage());
                } else {
                    dicVar2.d(0, header.getResponseMessage());
                }
            }
        }
    }

    static /* synthetic */ void c(did didVar, Throwable th) {
        th.getMessage();
        try {
            if (!djm.a()) {
                for (dic dicVar : didVar.b) {
                    dicVar.d(0, didVar.f.getString(R.string.check_network_connection));
                }
                return;
            }
            for (dic dicVar2 : didVar.b) {
                dicVar2.d(0, didVar.f.getString(R.string.error_contacting_server));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void d(did didVar, efn efnVar) {
        if (efnVar.a.d()) {
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                for (dic dicVar : didVar.b) {
                    dicVar.d_(header.getResponseMessage());
                }
                return;
            }
            for (dic dicVar2 : didVar.b) {
                if (header.getResponseCode().equalsIgnoreCase("1200")) {
                    dicVar2.c(1200, header.getResponseMessage());
                } else {
                    dicVar2.c(Integer.parseInt(header.getResponseCode()), header.getResponseMessage());
                }
            }
        }
    }

    static /* synthetic */ void d(did didVar, Throwable th) {
        th.getMessage();
        didVar.j.a();
        try {
            if (!djm.a()) {
                for (dic dicVar : didVar.b) {
                    dicVar.c(0, didVar.f.getString(R.string.check_network_connection));
                }
                return;
            }
            for (dic dicVar2 : didVar.b) {
                dicVar2.c(0, didVar.f.getString(R.string.error_contacting_server));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void e(did didVar, efn efnVar) {
        if (efnVar.a.d()) {
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                didVar.n = (List) ((ServerResponse) efnVar.b).getBody();
                for (dic dicVar : didVar.b) {
                    dicVar.a_(didVar.n);
                }
                return;
            }
            for (dic dicVar2 : didVar.b) {
                if (header.getResponseCode().equalsIgnoreCase("1200")) {
                    header.getResponseMessage();
                    dicVar2.o_();
                } else {
                    header.getResponseMessage();
                    dicVar2.o_();
                }
            }
        }
    }

    static /* synthetic */ void e(did didVar, Throwable th) {
        th.getMessage();
        try {
            if (!djm.a()) {
                for (dic dicVar : didVar.b) {
                    didVar.f.getString(R.string.check_network_connection);
                    dicVar.o_();
                }
                return;
            }
            for (dic dicVar2 : didVar.b) {
                didVar.f.getString(R.string.error_contacting_server);
                dicVar2.o_();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }
}
