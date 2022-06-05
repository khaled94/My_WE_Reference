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

/* renamed from: dga  reason: default package */
/* loaded from: classes2.dex */
public final class dga extends czz {
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
    private List<PlansAndBundlesResponseBody> m;
    protected efa<ServerResponse<String>> g = new efa<ServerResponse<String>>() { // from class: dga.1
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, efn<ServerResponse<String>> efnVar) {
            dga.a(dga.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, Throwable th) {
            dga.a(dga.this, th);
        }
    };
    protected efa<ServerResponse<String>> h = new efa<ServerResponse<String>>() { // from class: dga.2
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, efn<ServerResponse<String>> efnVar) {
            dga.b(dga.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, Throwable th) {
            dga.b(dga.this, th);
        }
    };
    protected efa<ServerResponse<String>> i = new efa<ServerResponse<String>>() { // from class: dga.3
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, efn<ServerResponse<String>> efnVar) {
            dga.c(dga.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, Throwable th) {
            dga.c(dga.this, th);
        }
    };
    protected efa<ServerResponse<String>> k = new efa<ServerResponse<String>>() { // from class: dga.4
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, efn<ServerResponse<String>> efnVar) {
            dga.d(dga.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, Throwable th) {
            dga.d(dga.this, th);
        }
    };
    protected efa<ServerResponse<List<PlansAndBundlesResponseBody>>> l = new efa<ServerResponse<List<PlansAndBundlesResponseBody>>>() { // from class: dga.5
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<List<PlansAndBundlesResponseBody>>> eeyVar, efn<ServerResponse<List<PlansAndBundlesResponseBody>>> efnVar) {
            dga.e(dga.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<List<PlansAndBundlesResponseBody>>> eeyVar, Throwable th) {
            dga.e(dga.this, th);
        }
    };
    protected List<dfz> b = new ArrayList();

    public final void a(dfz dfzVar) {
        if (this.b.size() == 0) {
            this.b.add(dfzVar);
        }
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
        arrayList.add(new Offer(str, "add"));
        RenewMainPlanRequestBody renewMainPlanRequestBody = new RenewMainPlanRequestBody();
        renewMainPlanRequestBody.setMsisdn(this.e.m());
        renewMainPlanRequestBody.setOffers(arrayList);
        this.a.X("https://api-my.te.eg/api/services/change/suppoffers", this.e.I(), ServerRequest.createServerRequest(this.e.m(), this.d.c.k(), renewMainPlanRequestBody)).a(this.k);
    }

    static /* synthetic */ void a(dga dgaVar, efn efnVar) {
        if (efnVar.a.d()) {
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                for (dfz dfzVar : dgaVar.b) {
                    dfzVar.g(header.getResponseMessage());
                }
                return;
            }
            for (dfz dfzVar2 : dgaVar.b) {
                header.getResponseCode().equalsIgnoreCase("1200");
                dfzVar2.h(header.getResponseMessage());
            }
        }
    }

    static /* synthetic */ void a(dga dgaVar, Throwable th) {
        th.getMessage();
        try {
            if (!djm.a()) {
                for (dfz dfzVar : dgaVar.b) {
                    dfzVar.h(dgaVar.f.getString(R.string.check_network_connection));
                }
                return;
            }
            for (dfz dfzVar2 : dgaVar.b) {
                dfzVar2.h(dgaVar.f.getString(R.string.error_contacting_server));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void b(dga dgaVar, efn efnVar) {
        if (efnVar.a.d()) {
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                for (dfz dfzVar : dgaVar.b) {
                    dfzVar.i(header.getResponseMessage());
                }
                return;
            }
            for (dfz dfzVar2 : dgaVar.b) {
                if (header.getResponseCode().equalsIgnoreCase("1200")) {
                    dfzVar2.c(1200, header.getResponseMessage());
                } else {
                    dfzVar2.c(0, header.getResponseMessage());
                }
            }
        }
    }

    static /* synthetic */ void b(dga dgaVar, Throwable th) {
        th.getMessage();
        try {
            if (!djm.a()) {
                for (dfz dfzVar : dgaVar.b) {
                    dfzVar.c(0, dgaVar.f.getString(R.string.check_network_connection));
                }
                return;
            }
            for (dfz dfzVar2 : dgaVar.b) {
                dfzVar2.c(0, dgaVar.f.getString(R.string.error_contacting_server));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void c(dga dgaVar, efn efnVar) {
        if (efnVar.a.d()) {
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                for (dfz dfzVar : dgaVar.b) {
                    header.getResponseMessage();
                    dfzVar.m();
                }
                return;
            }
            for (dfz dfzVar2 : dgaVar.b) {
                if (header.getResponseCode().equalsIgnoreCase("1200")) {
                    header.getResponseMessage();
                    dfzVar2.q();
                } else {
                    header.getResponseMessage();
                    dfzVar2.q();
                }
            }
        }
    }

    static /* synthetic */ void c(dga dgaVar, Throwable th) {
        th.getMessage();
        try {
            if (!djm.a()) {
                for (dfz dfzVar : dgaVar.b) {
                    dgaVar.f.getString(R.string.check_network_connection);
                    dfzVar.q();
                }
                return;
            }
            for (dfz dfzVar2 : dgaVar.b) {
                dgaVar.f.getString(R.string.error_contacting_server);
                dfzVar2.q();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void d(dga dgaVar, efn efnVar) {
        if (efnVar.a.d()) {
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                for (dfz dfzVar : dgaVar.b) {
                    dfzVar.j(header.getResponseMessage());
                }
                return;
            }
            for (dfz dfzVar2 : dgaVar.b) {
                if (header.getResponseCode().equalsIgnoreCase("1200")) {
                    dfzVar2.d(1200, header.getResponseMessage());
                } else {
                    dfzVar2.d(Integer.parseInt(header.getResponseCode()), header.getResponseMessage());
                }
            }
        }
    }

    static /* synthetic */ void d(dga dgaVar, Throwable th) {
        th.getMessage();
        dgaVar.j.a();
        try {
            if (!djm.a()) {
                for (dfz dfzVar : dgaVar.b) {
                    dfzVar.d(0, dgaVar.f.getString(R.string.check_network_connection));
                }
                return;
            }
            for (dfz dfzVar2 : dgaVar.b) {
                dfzVar2.d(0, dgaVar.f.getString(R.string.error_contacting_server));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void e(dga dgaVar, efn efnVar) {
        if (efnVar.a.d()) {
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                dgaVar.m = (List) ((ServerResponse) efnVar.b).getBody();
                for (dfz dfzVar : dgaVar.b) {
                    dfzVar.k();
                }
                return;
            }
            for (dfz dfzVar2 : dgaVar.b) {
                if (header.getResponseCode().equalsIgnoreCase("1200")) {
                    header.getResponseMessage();
                    dfzVar2.l();
                } else {
                    header.getResponseMessage();
                    dfzVar2.l();
                }
            }
        }
    }

    static /* synthetic */ void e(dga dgaVar, Throwable th) {
        th.getMessage();
        try {
            if (!djm.a()) {
                for (dfz dfzVar : dgaVar.b) {
                    dgaVar.f.getString(R.string.check_network_connection);
                    dfzVar.l();
                }
                return;
            }
            for (dfz dfzVar2 : dgaVar.b) {
                dgaVar.f.getString(R.string.error_contacting_server);
                dfzVar2.l();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }
}
