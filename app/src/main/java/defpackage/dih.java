package defpackage;

import android.content.Context;
import com.ucare.we.R;
import com.ucare.we.model.ResponseHeader;
import com.ucare.we.model.ServerRequest;
import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.StoreRequestBody;
import com.ucare.we.model.StoreResponseBody;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/* renamed from: dih  reason: default package */
/* loaded from: classes2.dex */
public final class dih extends czz implements dju {
    @Inject
    protected diq a;
    @Inject
    dio c;
    @Inject
    djw d;
    @Inject
    djb e;
    @Inject
    Context f;
    private double i;
    private double j;
    private int k;
    private final int h = 1;
    protected efa<ServerResponse<List<StoreResponseBody>>> g = new efa<ServerResponse<List<StoreResponseBody>>>() { // from class: dih.1
        @Override // defpackage.efa
        public final void a(eey<ServerResponse<List<StoreResponseBody>>> eeyVar, efn<ServerResponse<List<StoreResponseBody>>> efnVar) {
            dih.a(dih.this, efnVar);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<List<StoreResponseBody>>> eeyVar, Throwable th) {
            dih.a(dih.this, th);
        }
    };
    protected List<dig> b = new ArrayList();

    public final void a(dig digVar) {
        if (!this.b.contains(digVar)) {
            this.b.add(digVar);
        }
    }

    public final void b(dig digVar) {
        this.b.remove(digVar);
    }

    public final void a(double d, double d2, int i) {
        this.i = d;
        this.j = d2;
        this.k = i;
        StoreRequestBody storeRequestBody = new StoreRequestBody();
        storeRequestBody.setLatitude(d);
        storeRequestBody.setLongitude(d2);
        storeRequestBody.setNumberOfStores(i);
        this.a.Z("https://api-my.te.eg/api/stores/nearest", this.c.p, ServerRequest.createServerRequest("", this.e.c.k(), storeRequestBody)).a(this.g);
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this.f, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        a(this.i, this.j, this.k);
    }

    static /* synthetic */ void a(dih dihVar, efn efnVar) {
        if (efnVar.a.d()) {
            ResponseHeader header = ((ServerResponse) efnVar.b).getHeader();
            if (header.getResponseCode().equalsIgnoreCase("0")) {
                for (dig digVar : dihVar.b) {
                    digVar.a((List) ((ServerResponse) efnVar.b).getBody());
                }
            } else if (header.getResponseCode().equalsIgnoreCase("1200")) {
                dihVar.b(1);
            } else {
                for (dig digVar2 : dihVar.b) {
                    header.getResponseCode().equalsIgnoreCase("1200");
                    digVar2.a(header.getResponseMessage());
                }
            }
        }
    }

    static /* synthetic */ void a(dih dihVar, Throwable th) {
        th.getMessage();
        try {
            if (!djm.a()) {
                for (dig digVar : dihVar.b) {
                    digVar.a(dihVar.f.getString(R.string.check_network_connection));
                }
                return;
            }
            for (dig digVar2 : dihVar.b) {
                digVar2.a(dihVar.f.getString(R.string.error_contacting_server));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }
}
