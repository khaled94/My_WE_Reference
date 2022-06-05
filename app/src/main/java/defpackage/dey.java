package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.ucare.we.R;
import com.ucare.we.model.ResponseHeader;
import com.ucare.we.model.ServerRequest;
import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.local.managepaymentlimit.ManagePaymentLimitRequestBody;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0007J\u000e\u0010%\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u001aR\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006&"}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/managemembers/paymentlimit/ManageMemberPaymentLimitProvider;", "Lcom/ucare/we/injection/BaseComponent;", "()V", "apiInterface", "Lcom/ucare/we/rest/WebApiInterface;", "getApiInterface", "()Lcom/ucare/we/rest/WebApiInterface;", "setApiInterface", "(Lcom/ucare/we/rest/WebApiInterface;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "languageSwitcher", "Lcom/ucare/we/util/LanguageSwitcher;", "getLanguageSwitcher", "()Lcom/ucare/we/util/LanguageSwitcher;", "setLanguageSwitcher", "(Lcom/ucare/we/util/LanguageSwitcher;)V", "manageFamilyMemberCallback", "Lretrofit2/Callback;", "Lcom/ucare/we/model/ServerResponse;", "", "managePaymentLimitListener", "Lcom/ucare/we/presentation/family/groupinfo/managemembers/paymentlimit/ManagePaymentLimitListener;", "repository", "Lcom/ucare/we/util/prefs/Repository;", "getRepository", "()Lcom/ucare/we/util/prefs/Repository;", "setRepository", "(Lcom/ucare/we/util/prefs/Repository;)V", "manageMemberPaymentLimit", "", "managePaymentLimitRequestBody", "Lcom/ucare/we/model/local/managepaymentlimit/ManagePaymentLimitRequestBody;", "setListener", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dey  reason: default package */
/* loaded from: classes2.dex */
public final class dey extends czz {
    @Inject
    public djw a;
    @Inject
    public djb b;
    @Inject
    public diq c;
    @Inject
    public Context d;
    dez e;
    private efa<ServerResponse<String>> f = new a();

    private djw b() {
        djw djwVar = this.a;
        if (djwVar != null) {
            return djwVar;
        }
        dqc.a("repository");
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

    public final void a(ManagePaymentLimitRequestBody managePaymentLimitRequestBody) {
        dqc.d(managePaymentLimitRequestBody, "managePaymentLimitRequestBody");
        String m = b().m();
        djb djbVar = this.b;
        if (djbVar != null) {
            ServerRequest<ManagePaymentLimitRequestBody> createServerRequest = ServerRequest.createServerRequest(m, djbVar.c.k(), managePaymentLimitRequestBody);
            diq diqVar = this.c;
            if (diqVar != null) {
                diqVar.u("https://api-my.te.eg/api/family/manage-payment-relation", b().I(), createServerRequest).a(this.f);
                return;
            } else {
                dqc.a("apiInterface");
                throw null;
            }
        }
        dqc.a("languageSwitcher");
        throw null;
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J(\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J0\u0010\n\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/ucare/we/presentation/family/groupinfo/managemembers/paymentlimit/ManageMemberPaymentLimitProvider$manageFamilyMemberCallback$1", "Lretrofit2/Callback;", "Lcom/ucare/we/model/ServerResponse;", "", "onFailure", "", NotificationCompat.CATEGORY_CALL, "Lretrofit2/Call;", "t", "", "onResponse", "response", "Lretrofit2/Response;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dey$a */
    /* loaded from: classes2.dex */
    public static final class a implements efa<ServerResponse<String>> {
        a() {
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, Throwable th) {
            dez dezVar = dey.this.e;
            if (dezVar != null) {
                dezVar.a(0, dey.this.a().getString(R.string.something_went_wrong));
            }
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, efn<ServerResponse<String>> efnVar) {
            dez dezVar;
            dqc.d(eeyVar, NotificationCompat.CATEGORY_CALL);
            dqc.d(efnVar, "response");
            ServerResponse<String> serverResponse = efnVar.b;
            ServerResponse<String> serverResponse2 = efnVar.b;
            String str = null;
            ResponseHeader header = serverResponse2 == null ? null : serverResponse2.getHeader();
            if (!efnVar.a.d()) {
                dez dezVar2 = dey.this.e;
                if (dezVar2 == null) {
                    return;
                }
                dezVar2.a(0, dey.this.a().getString(R.string.something_went_wrong));
                return;
            }
            if (dsg.b(header == null ? null : header.getResponseCode(), "0")) {
                if (dey.this.e == null) {
                    return;
                }
                if (serverResponse != null) {
                    str = serverResponse.getBody();
                }
                if (str == null || (dezVar = dey.this.e) == null) {
                    return;
                }
                dezVar.a(serverResponse);
                return;
            }
            if (dsg.b(header == null ? null : header.getResponseCode(), "1200")) {
                dez dezVar3 = dey.this.e;
                if (dezVar3 == null) {
                    return;
                }
                if (header != null) {
                    str = header.getResponseMessage();
                }
                dezVar3.a(1200, str);
                return;
            }
            dez dezVar4 = dey.this.e;
            if (dezVar4 == null) {
                return;
            }
            dezVar4.a(0, dey.this.a().getString(R.string.something_went_wrong));
        }
    }

    public final void a(dez dezVar) {
        dqc.d(dezVar, "managePaymentLimitListener");
        this.e = dezVar;
    }
}
