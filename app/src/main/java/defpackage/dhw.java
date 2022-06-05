package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.ucare.we.R;
import com.ucare.we.model.LoginInfo;
import com.ucare.we.model.LoginRequestBody;
import com.ucare.we.model.ResponseHeader;
import com.ucare.we.model.ServerRequest;
import com.ucare.we.model.ServerResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/* renamed from: dhw  reason: default package */
/* loaded from: classes2.dex */
public final class dhw extends czz {
    @Inject
    protected diq a;
    @Inject
    djb c;
    @Inject
    dio d;
    @Inject
    Context e;
    private String g;
    protected efa<ServerResponse<LoginInfo>> f = new efa<ServerResponse<LoginInfo>>() { // from class: dhw.1
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<LoginInfo>> eeyVar, efn<ServerResponse<LoginInfo>> efnVar) {
            dhw.a(dhw.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<LoginInfo>> eeyVar, Throwable th) {
            dhw.a(dhw.this, th);
        }
    };
    protected List<dhv> b = new ArrayList();

    public final void a(dhv dhvVar) {
        if (!this.b.contains(dhvVar)) {
            this.b.add(dhvVar);
        }
    }

    public final void b(dhv dhvVar) {
        this.b.remove(dhvVar);
    }

    public final void a(String str, String str2) {
        this.a.c("https://api-my.te.eg/api/user/login", this.d.p, ServerRequest.createServerRequest(str, this.c.c.k(), Long.valueOf(System.currentTimeMillis() / 1000), new LoginRequestBody(str2))).a(this.f);
    }

    static /* synthetic */ void a(dhw dhwVar, efn efnVar) {
        if (efnVar.a.d()) {
            ServerResponse serverResponse = (ServerResponse) efnVar.b;
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            if (header.getResponseCode().equalsIgnoreCase("0") && serverResponse.getBody() != null && ((LoginInfo) serverResponse.getBody()).getJwt() != null) {
                dhwVar.g = ((LoginInfo) serverResponse.getBody()).getJwt();
                for (dhv dhvVar : dhwVar.b) {
                    dhvVar.a((LoginInfo) serverResponse.getBody());
                }
                return;
            }
            for (dhv dhvVar2 : dhwVar.b) {
                if (header.getResponseCode().equalsIgnoreCase("1200")) {
                    dhvVar2.a(1200, header.getResponseMessage());
                } else {
                    dhvVar2.a(1, header.getResponseMessage());
                }
            }
        }
    }

    static /* synthetic */ void a(dhw dhwVar, Throwable th) {
        Toast.makeText(dhwVar.e, th.getMessage(), 0).show();
        try {
            if (!djm.a()) {
                for (dhv dhvVar : dhwVar.b) {
                    dhvVar.a(1, dhwVar.e.getString(R.string.check_network_connection));
                }
                return;
            }
            for (dhv dhvVar2 : dhwVar.b) {
                dhvVar2.a(1, dhwVar.e.getString(R.string.error_contacting_server));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }
}
