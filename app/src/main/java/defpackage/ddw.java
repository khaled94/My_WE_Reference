package defpackage;

import android.content.Context;
import com.ucare.we.R;
import com.ucare.we.model.ResponseHeader;
import com.ucare.we.model.ServerRequest;
import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.local.DeactivationFbbRequestBody;
import java.io.IOException;
import javax.inject.Inject;

/* renamed from: ddw  reason: default package */
/* loaded from: classes2.dex */
public final class ddw extends czz {
    @Inject
    protected diq a;
    protected ddx b;
    @Inject
    djw c;
    @Inject
    djb d;
    @Inject
    Context e;
    protected efa<ServerResponse<String>> f = new efa<ServerResponse<String>>() { // from class: ddw.1
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, efn<ServerResponse<String>> efnVar) {
            ddw.a(ddw.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, Throwable th) {
            ddw.a(ddw.this, th);
        }
    };

    public final void a() {
        this.a.E("https://api-my.te.eg/api/line/subscribtion/manage", this.c.I(), ServerRequest.createServerRequest(this.c.m(), this.d.c.k(), new DeactivationFbbRequestBody("cancel"))).a(this.f);
    }

    public final void a(ddx ddxVar) {
        this.b = ddxVar;
    }

    static /* synthetic */ void a(ddw ddwVar, efn efnVar) {
        if (efnVar.a.d()) {
            ServerResponse<String> serverResponse = (ServerResponse) efnVar.b;
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                if (ddwVar.b == null || serverResponse.getBody() == null) {
                    return;
                }
                ddwVar.b.a(serverResponse);
                return;
            }
            header.getResponseCode().equalsIgnoreCase("1200");
            ddwVar.b.e_(header.getResponseMessage());
        }
    }

    static /* synthetic */ void a(ddw ddwVar, Throwable th) {
        th.getMessage();
        try {
            if (!djm.a()) {
                ddwVar.b.e_(ddwVar.e.getString(R.string.check_network_connection));
            } else {
                ddwVar.b.e_(ddwVar.e.getString(R.string.error_contacting_server));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }
}
