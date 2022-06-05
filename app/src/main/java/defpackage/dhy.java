package defpackage;

import android.content.Context;
import android.content.Intent;
import com.ucare.we.App;
import com.ucare.we.R;
import com.ucare.we.model.DefaultResponse;
import com.ucare.we.presentation.auth.signin.SignInActivity;
import java.io.IOException;
import javax.inject.Inject;

/* renamed from: dhy  reason: default package */
/* loaded from: classes2.dex */
public final class dhy extends czz {
    @Inject
    protected diq a;
    protected dhx b;
    @Inject
    djw c;
    @Inject
    Context d;
    protected efa<DefaultResponse> e = new efa<DefaultResponse>() { // from class: dhy.1
        @Override // defpackage.efa
        public final void a(eey<DefaultResponse> eeyVar, Throwable th) {
            dhy dhyVar = dhy.this;
            dhy.a();
            th.getMessage();
            try {
                if (!djm.a()) {
                    dhyVar.d.getString(R.string.check_network_connection);
                } else {
                    dhyVar.d.getString(R.string.error_contacting_server);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }

        @Override // defpackage.efa
        public final void a(eey<DefaultResponse> eeyVar, efn<DefaultResponse> efnVar) {
            dhy.a();
            dhy.a(dhy.this, efnVar);
            if (efnVar.a.d()) {
                new StringBuilder().append(efnVar.a.c);
            } else {
                new StringBuilder().append(efnVar.a.c);
            }
        }
    };

    static void a() {
        Intent intent = new Intent(App.a(), SignInActivity.class);
        intent.addFlags(268468224);
        App.a().startActivity(intent);
    }

    public final void b() {
        this.a.b("https://api-my.te.eg/api/user/logout", this.c.J()).a(this.e);
    }

    public final void a(dhx dhxVar) {
        this.b = dhxVar;
    }

    static /* synthetic */ void a(dhy dhyVar, efn efnVar) {
        if (efnVar.a.d()) {
            if (((DefaultResponse) efnVar.b).getHeader().getResponseCode().equalsIgnoreCase("0")) {
                dhx dhxVar = dhyVar.b;
                if (dhxVar == null) {
                    return;
                }
                dhxVar.l();
                return;
            }
            a();
        }
    }
}
