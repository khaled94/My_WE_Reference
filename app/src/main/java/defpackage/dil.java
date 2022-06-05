package defpackage;

import android.content.Context;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.ProfileInfoResponseBody;
import com.ucare.we.model.ResponseHeader;
import com.ucare.we.model.ServerRequest;
import com.ucare.we.model.ServerResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/* renamed from: dil  reason: default package */
/* loaded from: classes2.dex */
public final class dil extends czz implements dju {
    @Inject
    protected diq a;
    @Inject
    dio c;
    @Inject
    djw d;
    @Inject
    Context e;
    @Inject
    djb f;
    ProfileInfoResponseBody g;
    private final int i = 1;
    protected efa<ServerResponse<ProfileInfoResponseBody>> h = new efa<ServerResponse<ProfileInfoResponseBody>>() { // from class: dil.1
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<ProfileInfoResponseBody>> eeyVar, efn<ServerResponse<ProfileInfoResponseBody>> efnVar) {
            dil.a(dil.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<ProfileInfoResponseBody>> eeyVar, Throwable th) {
            dil.a(dil.this, th);
        }
    };
    protected List<die> b = new ArrayList();

    public final void a(die dieVar) {
        if (!this.b.contains(dieVar)) {
            this.b.add(dieVar);
        }
    }

    public final void b(die dieVar) {
        this.b.remove(dieVar);
    }

    public final void a() {
        ServerRequest createServerRequest = ServerRequest.createServerRequest(this.d.m(), this.f.c.k(), new ProfileInfoResponseBody());
        new Gson().a(createServerRequest);
        this.a.A("https://api-my.te.eg/api/user/profile/prepaid", this.d.I(), createServerRequest).a(this.h);
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this.e, this, 1);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        if (i == 1) {
            a();
        }
    }

    static /* synthetic */ void a(dil dilVar, efn efnVar) {
        if (efnVar.a.d()) {
            ServerResponse serverResponse = (ServerResponse) efnVar.b;
            new Gson().a(serverResponse);
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            header.getResponseCode();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                if (serverResponse.getBody() != null && serverResponse.getBody() != null) {
                    ProfileInfoResponseBody profileInfoResponseBody = (ProfileInfoResponseBody) serverResponse.getBody();
                    dilVar.g = profileInfoResponseBody;
                    dilVar.d.e(profileInfoResponseBody.getCustomerName());
                    for (die dieVar : dilVar.b) {
                        dieVar.a(dilVar.g);
                    }
                    return;
                }
            } else if (header.getResponseCode().equalsIgnoreCase("1200")) {
                dilVar.b(1);
            }
            for (die dieVar2 : dilVar.b) {
                if (header.getResponseCode().equalsIgnoreCase("1200")) {
                    dieVar2.e(1200, header.getResponseMessage());
                } else {
                    dieVar2.e(1, header.getResponseMessage());
                }
            }
        }
    }

    static /* synthetic */ void a(dil dilVar, Throwable th) {
        th.getMessage();
        try {
            if (!djm.a()) {
                for (die dieVar : dilVar.b) {
                    dieVar.e(0, dilVar.e.getString(R.string.check_network_connection));
                }
                return;
            }
            for (die dieVar2 : dilVar.b) {
                dieVar2.e(0, dilVar.e.getString(R.string.error_contacting_server));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }
}
