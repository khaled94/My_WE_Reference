package defpackage;

import android.content.Context;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.ResponseHeader;
import com.ucare.we.model.ServerRequest;
import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.UserStatusResponseBody;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/* renamed from: din  reason: default package */
/* loaded from: classes2.dex */
public final class din extends czz implements dju {
    @Inject
    protected diq a;
    @Inject
    djb c;
    @Inject
    dio d;
    @Inject
    Context e;
    @Inject
    djw f;
    private final int i = 1;
    dim g = null;
    protected efa<ServerResponse<UserStatusResponseBody>> h = new efa<ServerResponse<UserStatusResponseBody>>() { // from class: din.1
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<UserStatusResponseBody>> eeyVar, efn<ServerResponse<UserStatusResponseBody>> efnVar) {
            din.a(din.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<UserStatusResponseBody>> eeyVar, Throwable th) {
            din.a(din.this, th);
        }
    };
    private String j = "";
    protected List<dim> b = new ArrayList();

    public final void a(dim dimVar) {
        if (!this.b.contains(dimVar)) {
            this.b.add(dimVar);
        }
        this.g = dimVar;
    }

    public final void b(dim dimVar) {
        this.b.remove(dimVar);
    }

    public final void a(String str) {
        this.j = str;
        ServerRequest<String> createServerRequest = ServerRequest.createServerRequest(str, this.c.c.k(), Long.valueOf(System.currentTimeMillis() / 1000), "");
        new Gson().a(createServerRequest);
        this.a.b("https://api-my.te.eg/api/user/status", this.f.I(), createServerRequest).a(this.h);
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this.e, this, 1);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        a(this.j);
    }

    static /* synthetic */ void a(din dinVar, efn efnVar) {
        if (efnVar.a.d()) {
            ServerResponse serverResponse = (ServerResponse) efnVar.b;
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            header.getResponseCode();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                if (serverResponse.getBody() == null || ((UserStatusResponseBody) serverResponse.getBody()).type == null) {
                    return;
                }
                for (dim dimVar : dinVar.b) {
                    serverResponse.getBody();
                    dimVar.c();
                }
                return;
            } else if (header.getResponseCode().equalsIgnoreCase("1200")) {
                dinVar.b(1);
                return;
            } else {
                for (dim dimVar2 : dinVar.b) {
                    dimVar2.a(header.getResponseCode(), header.getResponseMessage());
                }
                return;
            }
        }
        dim dimVar3 = dinVar.g;
        if (dimVar3 == null) {
            return;
        }
        dimVar3.a("0", dinVar.e.getString(R.string.something_went_wrong));
    }

    static /* synthetic */ void a(din dinVar, Throwable th) {
        th.getMessage();
        for (dim dimVar : dinVar.b) {
            dimVar.a("", th.getMessage());
        }
    }
}
