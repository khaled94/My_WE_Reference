package defpackage;

import android.content.Context;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.ResponseHeader;
import com.ucare.we.model.ServerRequest;
import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.local.EmptyModel;
import com.ucare.we.model.local.NotificationInboxRequestBody;
import com.ucare.we.model.remote.NotificationInboxResponseBody;
import com.ucare.we.model.remote.pushnotification.NotificationCount;
import java.io.IOException;
import javax.inject.Inject;

/* renamed from: dfw  reason: default package */
/* loaded from: classes2.dex */
public final class dfw extends czz {
    @Inject
    protected diq a;
    protected dfv b;
    protected dfx d;
    @Inject
    djw e;
    @Inject
    djb f;
    @Inject
    Context g;
    protected efa<ServerResponse> c = new efa<ServerResponse>() { // from class: dfw.1
        @Override // defpackage.efa
        public final void a(eey<ServerResponse> eeyVar, efn<ServerResponse> efnVar) {
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse> eeyVar, Throwable th) {
        }
    };
    protected efa<ServerResponse<NotificationInboxResponseBody>> h = new efa<ServerResponse<NotificationInboxResponseBody>>() { // from class: dfw.2
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<NotificationInboxResponseBody>> eeyVar, efn<ServerResponse<NotificationInboxResponseBody>> efnVar) {
            dfw.a(dfw.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<NotificationInboxResponseBody>> eeyVar, Throwable th) {
            dfw.a(dfw.this, th);
        }
    };
    protected efa<ServerResponse<NotificationCount>> i = new efa<ServerResponse<NotificationCount>>() { // from class: dfw.3
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<NotificationCount>> eeyVar, Throwable th) {
            th.getMessage();
            try {
                if (!djm.a()) {
                    dfx dfxVar = dfw.this.d;
                    dfw.this.g.getString(R.string.check_network_connection);
                    dfxVar.m();
                    return;
                }
                dfx dfxVar2 = dfw.this.d;
                dfw.this.g.getString(R.string.error_contacting_server);
                dfxVar2.m();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<NotificationCount>> eeyVar, efn<ServerResponse<NotificationCount>> efnVar) {
            if (efnVar.a.d()) {
                ServerResponse<NotificationCount> serverResponse = efnVar.b;
                ResponseHeader header = efnVar.b.getHeader();
                if (header.getResponseCode().equalsIgnoreCase("0")) {
                    if (dfw.this.d == null || serverResponse.getBody() == null) {
                        return;
                    }
                    dfw.this.d.a(serverResponse.getBody());
                } else if (header.getResponseCode().equalsIgnoreCase("1200")) {
                    dfx dfxVar = dfw.this.d;
                    header.getResponseMessage();
                    dfxVar.m();
                } else {
                    dfx dfxVar2 = dfw.this.d;
                    header.getResponseMessage();
                    dfxVar2.m();
                }
            }
        }
    };

    public final void a(String str) {
        this.a.D("https://api-my.te.eg/api/pushnotification/inbox", this.e.I(), ServerRequest.createServerRequest(this.e.m(), this.f.c.k(), new NotificationInboxRequestBody(str))).a(this.h);
    }

    public final void a(int i) {
        this.a.H("https://api-my.te.eg/api/pushnotification/inbox/read", this.e.I(), ServerRequest.createServerRequest(this.e.m(), this.f.c.k(), Integer.valueOf(i))).a(this.c);
    }

    public final void a() {
        ServerRequest createServerRequest = ServerRequest.createServerRequest(this.e.m(), this.f.c.k(), new EmptyModel());
        new Gson().a(createServerRequest);
        this.a.G("https://api-my.te.eg/api/pushnotification/inbox", this.e.I(), createServerRequest).a(this.i);
    }

    public final void a(dfv dfvVar) {
        this.b = dfvVar;
    }

    public final void a(dfx dfxVar) {
        this.d = dfxVar;
    }

    static /* synthetic */ void a(dfw dfwVar, efn efnVar) {
        if (efnVar.a.d()) {
            ServerResponse serverResponse = (ServerResponse) efnVar.b;
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                if (dfwVar.b == null || serverResponse.getBody() == null) {
                    return;
                }
                dfwVar.b.a((NotificationInboxResponseBody) serverResponse.getBody());
                return;
            }
            header.getResponseCode().equalsIgnoreCase("1200");
            dfwVar.b.a(header.getResponseMessage());
        }
    }

    static /* synthetic */ void a(dfw dfwVar, Throwable th) {
        th.getMessage();
        try {
            if (!djm.a()) {
                dfwVar.b.a(dfwVar.g.getString(R.string.check_network_connection));
            } else {
                dfwVar.b.a(dfwVar.g.getString(R.string.error_contacting_server));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }
}
