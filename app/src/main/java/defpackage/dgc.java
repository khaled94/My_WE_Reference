package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.ucare.we.R;
import com.ucare.we.model.remote.PermissionResponseBody;
import java.io.IOException;
import javax.inject.Inject;

/* renamed from: dgc  reason: default package */
/* loaded from: classes2.dex */
public final class dgc extends czz {
    @Inject
    protected diq a;
    protected dgb b;
    @Inject
    public djw c;
    @Inject
    dio d;
    @Inject
    djb e;
    @Inject
    Context f;
    public PermissionResponseBody g;
    protected efa<PermissionResponseBody> h = new efa<PermissionResponseBody>() { // from class: dgc.1
        @Override // defpackage.efa
        public final void a(eey<PermissionResponseBody> eeyVar, efn<PermissionResponseBody> efnVar) {
            dgc dgcVar = dgc.this;
            if (efnVar.a.d()) {
                dgcVar.g = efnVar.b;
            } else {
                Toast.makeText(dgcVar.f, dgcVar.f.getString(R.string.generic_error), 0).show();
            }
        }

        @Override // defpackage.efa
        public final void a(eey<PermissionResponseBody> eeyVar, Throwable th) {
            dgc.a(dgc.this, th);
        }
    };

    public final PermissionResponseBody a() {
        PermissionResponseBody permissionResponseBody = this.g;
        return permissionResponseBody == null ? new PermissionResponseBody() : permissionResponseBody;
    }

    public final void b() {
        this.c.I();
        this.a.c("https://api-my.te.eg/api/files/read/?fileName=permissions.json", this.d.p).a(this.h);
    }

    public final void a(dgb dgbVar) {
        this.b = dgbVar;
    }

    public final boolean c() {
        return this.g.getMoreBundles() != null && this.g.getMoreBundles().contains(this.c.w());
    }

    static /* synthetic */ void a(dgc dgcVar, Throwable th) {
        th.getMessage();
        try {
            if (dgcVar.b == null) {
                return;
            }
            if (!djm.a()) {
                dgcVar.f.getString(R.string.check_network_connection);
            } else {
                dgcVar.f.getString(R.string.error_contacting_server);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }
}
