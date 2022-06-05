package defpackage;

import android.content.Context;
import com.ucare.we.R;
import com.ucare.we.model.ResponseHeader;
import com.ucare.we.model.ServerRequest;
import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.remote.dueamount.DueAmount;
import java.io.IOException;
import javax.inject.Inject;

/* renamed from: dhs  reason: default package */
/* loaded from: classes2.dex */
public final class dhs extends czz {
    @Inject
    protected diq a;
    @Inject
    djw b;
    @Inject
    djb c;
    public dhr d;
    DueAmount e;
    @Inject
    Context f;
    protected efa<ServerResponse<DueAmount>> g = new efa<ServerResponse<DueAmount>>() { // from class: dhs.1
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<DueAmount>> eeyVar, efn<ServerResponse<DueAmount>> efnVar) {
            dhs dhsVar = dhs.this;
            if (efnVar.a.d()) {
                ServerResponse<DueAmount> serverResponse = efnVar.b;
                ResponseHeader header = efnVar.b.getHeader();
                if (header.getResponseCode().equalsIgnoreCase("0")) {
                    if (dhsVar.d == null || serverResponse.getBody() == null) {
                        return;
                    }
                    dhsVar.d.a(serverResponse.getBody());
                    dhsVar.e = serverResponse.getBody();
                } else if (header.getResponseCode().equalsIgnoreCase("1200")) {
                    dhr dhrVar = dhsVar.d;
                    header.getResponseMessage();
                    dhrVar.a();
                } else {
                    dhr dhrVar2 = dhsVar.d;
                    header.getResponseMessage();
                    dhrVar2.a();
                }
            }
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<DueAmount>> eeyVar, Throwable th) {
            dhs dhsVar = dhs.this;
            th.getMessage();
            try {
                if (!djm.a()) {
                    dhr dhrVar = dhsVar.d;
                    dhsVar.f.getString(R.string.check_network_connection);
                    dhrVar.a();
                    return;
                }
                dhr dhrVar2 = dhsVar.d;
                dhsVar.f.getString(R.string.error_contacting_server);
                dhrVar2.a();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    };

    public final void a(String str) {
        ServerRequest<String> createServerRequest = ServerRequest.createServerRequest(str, this.c.c.k(), Long.valueOf(System.currentTimeMillis() / 1000), "");
        this.b.I();
        this.a.a("https://api-my.te.eg/api/services/due", this.b.I(), createServerRequest).a(this.g);
    }
}
