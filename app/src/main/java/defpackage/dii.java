package defpackage;

import android.content.Context;
import com.ucare.we.R;
import com.ucare.we.model.ResponseHeader;
import com.ucare.we.model.ServerRequest;
import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.suspendandresume.SubmitSuspendAndResume;
import com.ucare.we.model.suspendandresume.SuspendAndResumeReasonAndDurationResponse;
import com.ucare.we.model.suspendandresume.SuspendAndResumeResponse;
import java.io.IOException;
import javax.inject.Inject;

/* renamed from: dii  reason: default package */
/* loaded from: classes2.dex */
public final class dii extends czz implements dju {
    @Inject
    djw a;
    @Inject
    djb b;
    @Inject
    diq c;
    @Inject
    dio d;
    @Inject
    Context e;
    public dcs f;
    SubmitSuspendAndResume j;
    private final int k = 1;
    private final int l = 2;
    private final int m = 3;
    protected efa<ServerResponse<SuspendAndResumeResponse>> g = new efa<ServerResponse<SuspendAndResumeResponse>>() { // from class: dii.1
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<SuspendAndResumeResponse>> eeyVar, efn<ServerResponse<SuspendAndResumeResponse>> efnVar) {
            dii diiVar = dii.this;
            if (efnVar.a.d()) {
                ServerResponse<SuspendAndResumeResponse> serverResponse = efnVar.b;
                ResponseHeader header = efnVar.b.getHeader();
                header.getResponseCode();
                if (header.getResponseCode().equalsIgnoreCase("0")) {
                    diiVar.f.a(serverResponse.getBody());
                    return;
                }
                if (header.getResponseCode().equalsIgnoreCase("1200")) {
                    diiVar.b(2);
                }
                header.getResponseCode().equalsIgnoreCase("1200");
                diiVar.f.a(header.getResponseMessage());
            }
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<SuspendAndResumeResponse>> eeyVar, Throwable th) {
            dii diiVar = dii.this;
            try {
                if (!djm.a()) {
                    diiVar.f.a(diiVar.e.getString(R.string.check_network_connection));
                } else {
                    diiVar.f.a(diiVar.e.getString(R.string.error_contacting_server));
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    };
    protected efa<ServerResponse<String>> h = new efa<ServerResponse<String>>() { // from class: dii.2
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, efn<ServerResponse<String>> efnVar) {
            dii diiVar = dii.this;
            if (efnVar.a.d()) {
                ResponseHeader header = efnVar.b.getHeader();
                header.getResponseCode();
                if (header.getResponseCode().equalsIgnoreCase("0")) {
                    diiVar.f.c(header.getResponseMessage());
                    return;
                }
                if (header.getResponseCode().equalsIgnoreCase("1200")) {
                    diiVar.b(1);
                }
                header.getResponseCode().equalsIgnoreCase("1200");
                diiVar.f.d(header.getResponseMessage());
            }
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, Throwable th) {
            dii diiVar = dii.this;
            try {
                if (!djm.a()) {
                    diiVar.f.d(diiVar.e.getString(R.string.check_network_connection));
                } else {
                    diiVar.f.d(diiVar.e.getString(R.string.error_contacting_server));
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    };
    protected efa<SuspendAndResumeReasonAndDurationResponse> i = new efa<SuspendAndResumeReasonAndDurationResponse>() { // from class: dii.3
        @Override // defpackage.efa
        public final void a(eey<SuspendAndResumeReasonAndDurationResponse> eeyVar, efn<SuspendAndResumeReasonAndDurationResponse> efnVar) {
            dii diiVar = dii.this;
            if (efnVar.a.d()) {
                diiVar.f.a(efnVar.b);
                return;
            }
            diiVar.f.b(diiVar.e.getString(R.string.check_network_connection));
        }

        @Override // defpackage.efa
        public final void a(eey<SuspendAndResumeReasonAndDurationResponse> eeyVar, Throwable th) {
            dii diiVar = dii.this;
            try {
                if (!djm.a()) {
                    diiVar.f.b(diiVar.e.getString(R.string.check_network_connection));
                } else {
                    diiVar.f.b(diiVar.e.getString(R.string.error_contacting_server));
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    };

    public final void a() {
        this.c.I("https://api-my.te.eg/api/line/subscribtion/status", this.a.I(), ServerRequest.createServerRequest(this.a.m(), this.b.c.k(), "")).a(this.g);
    }

    public final void a(SubmitSuspendAndResume submitSuspendAndResume) {
        this.j = submitSuspendAndResume;
        this.c.J("https://api-my.te.eg/api/line/subscribtion/manage", this.a.I(), ServerRequest.createServerRequest(this.a.m(), this.b.c.k(), submitSuspendAndResume)).a(this.h);
    }

    public final void b() {
        this.c.d("https://api-my.te.eg/api/files/read/?fileName=suspend_resume.json", this.a.I()).a(this.i);
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this.e, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        if (i == 1) {
            a(this.j);
        } else if (i != 2) {
        } else {
            a();
        }
    }
}
