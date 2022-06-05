package defpackage;

import android.content.Context;
import com.ucare.we.R;
import com.ucare.we.model.DeviceTypes;
import com.ucare.we.model.ResponseHeader;
import com.ucare.we.model.ServerRequest;
import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.ticket.QueryTicketResponse;
import com.ucare.we.model.ticket.QueyTicketRequest;
import com.ucare.we.model.ticket.SubmitTicketRequest;
import com.ucare.we.model.ticket.TroubleTicketsResponseTypes;
import defpackage.eav;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.inject.Inject;

/* renamed from: dij  reason: default package */
/* loaded from: classes2.dex */
public class dij extends czz implements dju {
    public dhq a;
    public dif b;
    @Inject
    djw c;
    @Inject
    djb d;
    @Inject
    diq e;
    @Inject
    dio f;
    @Inject
    Context g;
    SubmitTicketRequest l;
    QueyTicketRequest m;
    protected efa<TroubleTicketsResponseTypes> h = new efa<TroubleTicketsResponseTypes>() { // from class: dij.1
        @Override // defpackage.efa
        public final void a(eey<TroubleTicketsResponseTypes> eeyVar, efn<TroubleTicketsResponseTypes> efnVar) {
            dij.a(dij.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<TroubleTicketsResponseTypes> eeyVar, Throwable th) {
            dij.a(dij.this);
        }
    };
    protected efa<ServerResponse<ArrayList<QueryTicketResponse>>> i = new efa<ServerResponse<ArrayList<QueryTicketResponse>>>() { // from class: dij.2
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<ArrayList<QueryTicketResponse>>> eeyVar, efn<ServerResponse<ArrayList<QueryTicketResponse>>> efnVar) {
            dij.b(dij.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<ArrayList<QueryTicketResponse>>> eeyVar, Throwable th) {
            dij.a(dij.this, th);
        }
    };
    protected efa<ServerResponse<String>> j = new efa<ServerResponse<String>>() { // from class: dij.3
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, efn<ServerResponse<String>> efnVar) {
            dij.c(dij.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, Throwable th) {
            dij.b(dij.this, th);
        }
    };
    protected efa<ServerResponse<ArrayList<DeviceTypes>>> k = new efa<ServerResponse<ArrayList<DeviceTypes>>>() { // from class: dij.4
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<ArrayList<DeviceTypes>>> eeyVar, efn<ServerResponse<ArrayList<DeviceTypes>>> efnVar) {
            dij.d(dij.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<ArrayList<DeviceTypes>>> eeyVar, Throwable th) {
            dij.c(dij.this, th);
        }
    };
    private String n = dij.class.getSimpleName();

    public final void a(SubmitTicketRequest submitTicketRequest) {
        submitTicketRequest.setFirstName(null);
        submitTicketRequest.setMiddleName(null);
        submitTicketRequest.setLastName(null);
        this.l = submitTicketRequest;
        this.e.x("https://api-my.te.eg/api/customerservice/ticket/submit", this.c.I(), ServerRequest.createServerRequest(this.c.m(), this.c.k(), submitTicketRequest)).a(this.j);
    }

    public final void a(ArrayList<String> arrayList, final String str) {
        String m = this.c.m();
        eav.a aVar = new eav.a();
        aVar.a(eav.e);
        aVar.a("msisdn", m);
        aVar.a("ticketId", str);
        aVar.a("locale", this.c.k());
        for (int i = 0; i < arrayList.size(); i++) {
            File file = new File(arrayList.get(i));
            aVar.a("file".concat(String.valueOf(i)), file.getName(), ebb.a(eau.b("image/*"), file));
        }
        this.e.a("https://api-my.te.eg/api/customerservice/ticket/attach", aVar.a(), this.c.I()).a(new efa<ServerResponse<String>>() { // from class: dij.5
            @Override // defpackage.efa
            public final void a(eey<ServerResponse<String>> eeyVar, Throwable th) {
                dij.this.a.b();
                String unused = dij.this.n;
            }

            @Override // defpackage.efa
            public final void a(eey<ServerResponse<String>> eeyVar, efn<ServerResponse<String>> efnVar) {
                if (efnVar.a.d()) {
                    String unused = dij.this.n;
                    dij.this.a.a(efnVar.b.getHeader().getResponseMessage(), str);
                }
            }
        });
    }

    public final void a() {
        this.e.e("https://api-my.te.eg/api/files/read/?fileName=tt-ticket-types.json", this.c.I()).a(this.h);
    }

    public final void b() {
        this.e.T("https://api-my.te.eg/api/services/getdevices", this.c.I(), ServerRequest.createServerRequest(this.c.m(), "en", "")).a(this.k);
    }

    public final void a(QueyTicketRequest queyTicketRequest) {
        this.m = queyTicketRequest;
        this.e.y("https://api-my.te.eg/api/customerservice/search", this.c.I(), ServerRequest.createServerRequest(this.c.m(), "en", queyTicketRequest)).a(this.i);
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this.g, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        if (i == 1) {
            a(this.l);
        } else if (i != 2) {
        } else {
            a(this.m);
        }
    }

    static /* synthetic */ void a(dij dijVar, efn efnVar) {
        if (efnVar.a.d()) {
            TroubleTicketsResponseTypes troubleTicketsResponseTypes = (TroubleTicketsResponseTypes) efnVar.b;
            if (troubleTicketsResponseTypes != null) {
                dijVar.a.a(troubleTicketsResponseTypes);
                return;
            } else {
                dijVar.a.c(dijVar.g.getString(R.string.error_contacting_server));
                return;
            }
        }
        dijVar.a.c(dijVar.g.getString(R.string.check_network_connection));
    }

    static /* synthetic */ void a(dij dijVar) {
        try {
            if (!djm.a()) {
                dijVar.a.c(dijVar.g.getString(R.string.check_network_connection));
            } else {
                dijVar.a.c(dijVar.g.getString(R.string.error_contacting_server));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void b(dij dijVar, efn efnVar) {
        if (efnVar.a.d()) {
            ServerResponse serverResponse = (ServerResponse) efnVar.b;
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            header.getResponseCode();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                dijVar.b.a((ArrayList) serverResponse.getBody());
                return;
            }
            if (header.getResponseCode().equalsIgnoreCase("1200")) {
                dijVar.b(2);
            }
            header.getResponseCode().equalsIgnoreCase("1200");
            dijVar.b.c(header.getResponseMessage());
        }
    }

    static /* synthetic */ void a(dij dijVar, Throwable th) {
        th.getMessage();
        try {
            if (!djm.a()) {
                dijVar.b.c(dijVar.g.getString(R.string.check_network_connection));
            } else {
                dijVar.b.c(dijVar.g.getString(R.string.error_contacting_server));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void c(dij dijVar, efn efnVar) {
        if (efnVar.a.d()) {
            ServerResponse serverResponse = (ServerResponse) efnVar.b;
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            header.getResponseCode();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                dijVar.a.a((String) serverResponse.getBody());
                return;
            }
            if (header.getResponseCode().equalsIgnoreCase("1200")) {
                dijVar.b(1);
            }
            header.getResponseCode().equalsIgnoreCase("1200");
            dijVar.a.b(header.getResponseMessage());
        }
    }

    static /* synthetic */ void b(dij dijVar, Throwable th) {
        th.getMessage();
        try {
            if (!djm.a()) {
                dijVar.a.b(dijVar.g.getString(R.string.check_network_connection));
            } else {
                dijVar.a.b(dijVar.g.getString(R.string.error_contacting_server));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    static /* synthetic */ void d(dij dijVar, efn efnVar) {
        if (efnVar.a.d()) {
            ServerResponse serverResponse = (ServerResponse) efnVar.b;
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            header.getResponseCode();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                dijVar.a.a((ArrayList) serverResponse.getBody());
                return;
            }
            if (header.getResponseCode().equalsIgnoreCase("1200")) {
                dijVar.b(2);
            }
            header.getResponseCode().equalsIgnoreCase("1200");
            dijVar.a.d(header.getResponseMessage());
        }
    }

    static /* synthetic */ void c(dij dijVar, Throwable th) {
        th.getMessage();
        try {
            if (!djm.a()) {
                dijVar.a.d(dijVar.g.getString(R.string.check_network_connection));
            } else {
                dijVar.a.d(dijVar.g.getString(R.string.error_contacting_server));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }
}
