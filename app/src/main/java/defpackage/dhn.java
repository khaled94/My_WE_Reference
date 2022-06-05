package defpackage;

import com.ucare.we.model.ConfigurationResponseBody;
import com.ucare.we.model.ResponseHeader;
import com.ucare.we.model.ServerRequest;
import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.remote.UpdateConfiguration;
import javax.inject.Inject;

/* renamed from: dhn  reason: default package */
/* loaded from: classes2.dex */
public final class dhn extends czz {
    @Inject
    djw a;
    @Inject
    djb b;
    @Inject
    diq c;
    @Inject
    dir d;
    @Inject
    dio e;
    public ConfigurationResponseBody f;
    public UpdateConfiguration g;
    public dho h;
    public dik j;
    protected efa<ServerResponse<ConfigurationResponseBody>> i = new efa<ServerResponse<ConfigurationResponseBody>>() { // from class: dhn.1
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<ConfigurationResponseBody>> eeyVar, efn<ServerResponse<ConfigurationResponseBody>> efnVar) {
            dhn dhnVar = dhn.this;
            if (!efnVar.a.d()) {
                dhnVar.h.d();
                return;
            }
            ServerResponse<ConfigurationResponseBody> serverResponse = efnVar.b;
            ResponseHeader header = efnVar.b.getHeader();
            header.getResponseCode();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                if (dhnVar.h == null || serverResponse.getBody() == null) {
                    return;
                }
                dhnVar.f = serverResponse.getBody();
                dhnVar.h.a(dhnVar.f);
                return;
            }
            dho dhoVar = dhnVar.h;
            header.getResponseMessage();
            dhoVar.d();
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<ConfigurationResponseBody>> eeyVar, Throwable th) {
            dhn dhnVar = dhn.this;
            th.getMessage();
            dho dhoVar = dhnVar.h;
            th.getMessage();
            dhoVar.d();
        }
    };
    protected efa<ServerResponse<UpdateConfiguration>> k = new efa<ServerResponse<UpdateConfiguration>>() { // from class: dhn.2
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<UpdateConfiguration>> eeyVar, efn<ServerResponse<UpdateConfiguration>> efnVar) {
            dhn dhnVar = dhn.this;
            if (!efnVar.a.d()) {
                dhnVar.j.e();
                return;
            }
            ServerResponse<UpdateConfiguration> serverResponse = efnVar.b;
            ResponseHeader header = efnVar.b.getHeader();
            header.getResponseCode();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                if (dhnVar.h == null || serverResponse.getBody() == null) {
                    return;
                }
                dhnVar.g = serverResponse.getBody();
                dhnVar.j.a(dhnVar.g);
                return;
            }
            dik dikVar = dhnVar.j;
            header.getResponseMessage();
            dikVar.e();
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<UpdateConfiguration>> eeyVar, Throwable th) {
            dhn dhnVar = dhn.this;
            th.getMessage();
            dho dhoVar = dhnVar.h;
            th.getMessage();
            dhoVar.d();
        }
    };

    public final void a() {
        this.c.Y("https://api-my.te.eg/api/configurations/mobile", this.e.p, ServerRequest.createServerRequest(this.a.m(), "en", new ConfigurationResponseBody())).a(this.i);
    }

    public final void b() {
        this.d.a("https://api-my.te.eg/api/configurations/mobile/update").a(this.k);
    }
}
