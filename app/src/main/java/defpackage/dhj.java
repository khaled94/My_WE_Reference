package defpackage;

import android.content.Context;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.ResponseHeader;
import com.ucare.we.model.ServerRequest;
import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.remote.faqlist.FaqListResponseBody;
import java.io.IOException;
import java.util.ArrayList;
import javax.inject.Inject;

/* renamed from: dhj  reason: default package */
/* loaded from: classes2.dex */
public final class dhj extends czz {
    @Inject
    protected diq a;
    protected dhi b;
    @Inject
    djw c;
    @Inject
    djb d;
    @Inject
    Context e;
    protected efa<ServerResponse<ArrayList<FaqListResponseBody>>> f = new efa<ServerResponse<ArrayList<FaqListResponseBody>>>() { // from class: dhj.1
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<ArrayList<FaqListResponseBody>>> eeyVar, efn<ServerResponse<ArrayList<FaqListResponseBody>>> efnVar) {
            dhj.a(dhj.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<ArrayList<FaqListResponseBody>>> eeyVar, Throwable th) {
            dhj dhjVar = dhj.this;
            th.getMessage();
            try {
                if (!djm.a()) {
                    dhjVar.e.getString(R.string.check_network_connection);
                } else {
                    dhjVar.e.getString(R.string.error_contacting_server);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    };

    public final void a() {
        this.a.F("https://api-my.te.eg/api/faq/list", this.c.I(), ServerRequest.createServerRequest(this.c.m(), this.d.c.k(), null)).a(this.f);
    }

    public final void a(dhi dhiVar) {
        this.b = dhiVar;
    }

    static /* synthetic */ void a(dhj dhjVar, efn efnVar) {
        if (efnVar.a.d()) {
            ServerResponse serverResponse = (ServerResponse) efnVar.b;
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                if (dhjVar.b == null || serverResponse.getBody() == null) {
                    return;
                }
                new Gson().a(serverResponse.getBody());
                dhjVar.b.a((ArrayList) serverResponse.getBody());
            } else if (header.getResponseCode().equalsIgnoreCase("1200")) {
                header.getResponseMessage();
            } else {
                header.getResponseMessage();
            }
        }
    }
}
