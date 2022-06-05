package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.ucare.we.R;
import com.ucare.we.model.ResponseHeader;
import com.ucare.we.model.ServerRequest;
import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.local.managepaymentlimit.ManageConsumptionLimitRequestBody;
import java.io.IOException;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0007J$\u0010(\u001a\u00020%2\u0012\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110*2\u0006\u0010+\u001a\u00020,H\u0003J0\u0010-\u001a\u00020%2\u0012\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110*2\u0012\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110/H\u0002J\u000e\u00100\u001a\u00020%2\u0006\u00101\u001a\u00020\u0018R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR&\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u00062"}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/managemembers/consumptionlimit/ManageMemberConsumptionLimitProvider;", "Lcom/ucare/we/injection/BaseComponent;", "()V", "apiInterface", "Lcom/ucare/we/rest/WebApiInterface;", "getApiInterface", "()Lcom/ucare/we/rest/WebApiInterface;", "setApiInterface", "(Lcom/ucare/we/rest/WebApiInterface;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "familyManageConsumptionLimit", "Lretrofit2/Callback;", "Lcom/ucare/we/model/ServerResponse;", "", "getFamilyManageConsumptionLimit", "()Lretrofit2/Callback;", "setFamilyManageConsumptionLimit", "(Lretrofit2/Callback;)V", "familyManageConsumptionLimitListener", "Lcom/ucare/we/presentation/family/groupinfo/managemembers/consumptionlimit/ManageConsumptionLimitListener;", "languageSwitcher", "Lcom/ucare/we/util/LanguageSwitcher;", "getLanguageSwitcher", "()Lcom/ucare/we/util/LanguageSwitcher;", "setLanguageSwitcher", "(Lcom/ucare/we/util/LanguageSwitcher;)V", "repository", "Lcom/ucare/we/util/prefs/Repository;", "getRepository", "()Lcom/ucare/we/util/prefs/Repository;", "setRepository", "(Lcom/ucare/we/util/prefs/Repository;)V", "", "manageConsumptionLimitRequestBody", "Lcom/ucare/we/model/local/managepaymentlimit/ManageConsumptionLimitRequestBody;", "onFamilyManageConsumptionLimitFailure", NotificationCompat.CATEGORY_CALL, "Lretrofit2/Call;", "t", "", "onFamilyManageConsumptionLimitSuccess", "response", "Lretrofit2/Response;", "setListener", "manageConsumptionLimitListener", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dev  reason: default package */
/* loaded from: classes2.dex */
public final class dev extends czz {
    @Inject
    public djw a;
    @Inject
    public djb b;
    @Inject
    public diq c;
    @Inject
    public Context d;
    deu e;
    private efa<ServerResponse<String>> f = new a();

    private djw b() {
        djw djwVar = this.a;
        if (djwVar != null) {
            return djwVar;
        }
        dqc.a("repository");
        throw null;
    }

    private djb c() {
        djb djbVar = this.b;
        if (djbVar != null) {
            return djbVar;
        }
        dqc.a("languageSwitcher");
        throw null;
    }

    private diq d() {
        diq diqVar = this.c;
        if (diqVar != null) {
            return diqVar;
        }
        dqc.a("apiInterface");
        throw null;
    }

    public final Context a() {
        Context context = this.d;
        if (context != null) {
            return context;
        }
        dqc.a("context");
        throw null;
    }

    public final void a(ManageConsumptionLimitRequestBody manageConsumptionLimitRequestBody) {
        dqc.d(manageConsumptionLimitRequestBody, "manageConsumptionLimitRequestBody");
        d().t("https://api-my.te.eg/api/family/manage-shared-limit", b().I(), ServerRequest.createServerRequest(b().m(), c().c.k(), manageConsumptionLimitRequestBody)).a(this.f);
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J$\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J0\u0010\n\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\fH\u0017¨\u0006\r"}, d2 = {"com/ucare/we/presentation/family/groupinfo/managemembers/consumptionlimit/ManageMemberConsumptionLimitProvider$familyManageConsumptionLimit$1", "Lretrofit2/Callback;", "Lcom/ucare/we/model/ServerResponse;", "", "onFailure", "", NotificationCompat.CATEGORY_CALL, "Lretrofit2/Call;", "t", "", "onResponse", "response", "Lretrofit2/Response;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dev$a */
    /* loaded from: classes2.dex */
    public static final class a implements efa<ServerResponse<String>> {
        a() {
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, efn<ServerResponse<String>> efnVar) {
            deu deuVar;
            dqc.d(eeyVar, NotificationCompat.CATEGORY_CALL);
            dqc.d(efnVar, "response");
            dev devVar = dev.this;
            ServerResponse<String> serverResponse = efnVar.b;
            ServerResponse<String> serverResponse2 = efnVar.b;
            String str = null;
            ResponseHeader header = serverResponse2 == null ? null : serverResponse2.getHeader();
            if (!efnVar.a.d()) {
                deu deuVar2 = devVar.e;
                if (deuVar2 == null) {
                    return;
                }
                deuVar2.a(0, djq.a().getString(R.string.something_went_wrong));
                return;
            }
            if (dsg.b(header == null ? null : header.getResponseCode(), "0")) {
                if (serverResponse == null || (deuVar = devVar.e) == null) {
                    return;
                }
                deuVar.a(serverResponse);
                return;
            }
            if (dsg.b(header == null ? null : header.getResponseCode(), "1200")) {
                deu deuVar3 = devVar.e;
                if (deuVar3 == null) {
                    return;
                }
                if (header != null) {
                    str = header.getResponseMessage();
                }
                deuVar3.a(1200, str);
                return;
            }
            deu deuVar4 = devVar.e;
            if (deuVar4 == null) {
                return;
            }
            if (header != null) {
                str = header.getResponseMessage();
            }
            deuVar4.a(0, str);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, Throwable th) {
            dqc.d(eeyVar, NotificationCompat.CATEGORY_CALL);
            dqc.d(th, "t");
            dev devVar = dev.this;
            try {
                if (!djm.a()) {
                    deu deuVar = devVar.e;
                    if (deuVar == null) {
                        return;
                    }
                    deuVar.a(0, devVar.a().getString(R.string.check_network_connection));
                    return;
                }
                deu deuVar2 = devVar.e;
                if (deuVar2 == null) {
                    return;
                }
                deuVar2.a(0, devVar.a().getString(R.string.error_contacting_server));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void a(deu deuVar) {
        dqc.d(deuVar, "manageConsumptionLimitListener");
        this.e = deuVar;
    }
}
