package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.ResponseHeader;
import com.ucare.we.model.ServerRequest;
import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.SignInModel.GroupID;
import com.ucare.we.model.usagedetails.HomePageResponseBody;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u00101\u001a\u000202J\u0006\u00103\u001a\u000202J$\u00104\u001a\u0002022\u0012\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f062\u0006\u00107\u001a\u000208H\u0002J0\u00109\u001a\u0002022\u0012\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f062\u0012\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0;H\u0002J\u000e\u0010<\u001a\u0002022\u0006\u0010=\u001a\u00020\u0011J\u000e\u0010>\u001a\u0002022\u0006\u0010=\u001a\u00020\u0011R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR&\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u0006?"}, d2 = {"Lcom/ucare/we/provider/BundlesProvider;", "Lcom/ucare/we/injection/BaseComponent;", "()V", "apiInterface", "Lcom/ucare/we/rest/WebApiInterface;", "getApiInterface", "()Lcom/ucare/we/rest/WebApiInterface;", "setApiInterface", "(Lcom/ucare/we/rest/WebApiInterface;)V", "authenticationProvider", "Lcom/ucare/we/provider/auth/AuthenticationProvider;", "getAuthenticationProvider", "()Lcom/ucare/we/provider/auth/AuthenticationProvider;", "setAuthenticationProvider", "(Lcom/ucare/we/provider/auth/AuthenticationProvider;)V", "bundleListener", "Ljava/util/ArrayList;", "Lcom/ucare/we/provider/BundleListener;", "Lkotlin/collections/ArrayList;", "getBundleListener", "()Ljava/util/ArrayList;", "setBundleListener", "(Ljava/util/ArrayList;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "freeUnitUsageCallback", "Lretrofit2/Callback;", "Lcom/ucare/we/model/ServerResponse;", "Lcom/ucare/we/model/usagedetails/HomePageResponseBody;", "getFreeUnitUsageCallback", "()Lretrofit2/Callback;", "setFreeUnitUsageCallback", "(Lretrofit2/Callback;)V", "languageSwitcher", "Lcom/ucare/we/util/LanguageSwitcher;", "getLanguageSwitcher", "()Lcom/ucare/we/util/LanguageSwitcher;", "setLanguageSwitcher", "(Lcom/ucare/we/util/LanguageSwitcher;)V", "repository", "Lcom/ucare/we/util/prefs/Repository;", "getRepository", "()Lcom/ucare/we/util/prefs/Repository;", "setRepository", "(Lcom/ucare/we/util/prefs/Repository;)V", "clear", "", "freeUnitUsageGroupLevel", "onFreeUnitUsageFailure", NotificationCompat.CATEGORY_CALL, "Lretrofit2/Call;", "t", "", "onFreeUnitUsageResponse", "response", "Lretrofit2/Response;", "registerBundleListener", "BundleListener", "unregisterBundleListener", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dhm  reason: default package */
/* loaded from: classes2.dex */
public final class dhm extends czz {
    @Inject
    public diq a;
    @Inject
    public dio c;
    @Inject
    public djw d;
    @Inject
    public djb e;
    @Inject
    public Context f;
    private efa<ServerResponse<HomePageResponseBody>> g = new a();
    ArrayList<dhl> b = new ArrayList<>();

    private diq c() {
        diq diqVar = this.a;
        if (diqVar != null) {
            return diqVar;
        }
        dqc.a("apiInterface");
        throw null;
    }

    private djw d() {
        djw djwVar = this.d;
        if (djwVar != null) {
            return djwVar;
        }
        dqc.a("repository");
        throw null;
    }

    private djb e() {
        djb djbVar = this.e;
        if (djbVar != null) {
            return djbVar;
        }
        dqc.a("languageSwitcher");
        throw null;
    }

    public final Context a() {
        Context context = this.f;
        if (context != null) {
            return context;
        }
        dqc.a("context");
        throw null;
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J$\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J0\u0010\n\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/ucare/we/provider/BundlesProvider$freeUnitUsageCallback$1", "Lretrofit2/Callback;", "Lcom/ucare/we/model/ServerResponse;", "Lcom/ucare/we/model/usagedetails/HomePageResponseBody;", "onFailure", "", NotificationCompat.CATEGORY_CALL, "Lretrofit2/Call;", "t", "", "onResponse", "response", "Lretrofit2/Response;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dhm$a */
    /* loaded from: classes2.dex */
    public static final class a implements efa<ServerResponse<HomePageResponseBody>> {
        a() {
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<HomePageResponseBody>> eeyVar, efn<ServerResponse<HomePageResponseBody>> efnVar) {
            dqc.d(eeyVar, NotificationCompat.CATEGORY_CALL);
            dqc.d(efnVar, "response");
            dhm dhmVar = dhm.this;
            ServerResponse<HomePageResponseBody> serverResponse = efnVar.b;
            ServerResponse<HomePageResponseBody> serverResponse2 = efnVar.b;
            HomePageResponseBody homePageResponseBody = null;
            ResponseHeader header = serverResponse2 == null ? null : serverResponse2.getHeader();
            if (efnVar.a.d()) {
                String.valueOf(header == null ? null : header.getResponseCode());
                if (dsg.b(header == null ? null : header.getResponseCode(), "0")) {
                    if ((serverResponse == null ? null : serverResponse.getBody()) != null && serverResponse.getBody() != null) {
                        ServerResponse<HomePageResponseBody> serverResponse3 = efnVar.b;
                        if (serverResponse3 != null) {
                            homePageResponseBody = serverResponse3.getBody();
                        }
                        cys.a(homePageResponseBody);
                        Iterator<dhl> it = dhmVar.b.iterator();
                        while (it.hasNext()) {
                            it.next().a(serverResponse.getBody());
                        }
                        return;
                    }
                }
                Iterator<dhl> it2 = dhmVar.b.iterator();
                while (it2.hasNext()) {
                    dhl next = it2.next();
                    if (dsg.b(header == null ? null : header.getResponseCode(), "1200")) {
                        next.a(1200, header == null ? null : header.getResponseMessage());
                    } else {
                        next.a(0, header == null ? null : header.getResponseMessage());
                    }
                }
                return;
            }
            dqc.a("LineProvide=>", (Object) efnVar.c);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<HomePageResponseBody>> eeyVar, Throwable th) {
            dqc.d(eeyVar, NotificationCompat.CATEGORY_CALL);
            dqc.d(th, "t");
            dhm dhmVar = dhm.this;
            String.valueOf(th.getMessage());
            try {
                if (!djm.a()) {
                    Iterator<dhl> it = dhmVar.b.iterator();
                    while (it.hasNext()) {
                        it.next().a(0, dhmVar.a().getString(R.string.check_network_connection));
                    }
                    return;
                }
                Iterator<dhl> it2 = dhmVar.b.iterator();
                while (it2.hasNext()) {
                    it2.next().a(0, dhmVar.a().getString(R.string.error_contacting_server));
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void b() {
        ServerRequest createServerRequest = ServerRequest.createServerRequest(d().m(), e().c.k(), new GroupID(d().P().getId()));
        new Gson().a(createServerRequest);
        c().M("https://api-my.te.eg/api/fmc/freeunitusage/grouplevel", d().I(), createServerRequest).a(this.g);
    }

    public final void a(dhl dhlVar) {
        dqc.d(dhlVar, "BundleListener");
        if (!this.b.contains(dhlVar)) {
            this.b.add(dhlVar);
        }
    }
}
