package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.ucare.we.R;
import com.ucare.we.model.ResponseHeader;
import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.remote.grouppaymentrelation.FamilyPaymentRelationResponse;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0007J\u0010\u0010'\u001a\u00020$2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cR\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u0015\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001a0\u00170\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006("}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/managemembers/managegrouppaymentrelation/ManageGroupPaymentRelationProvider;", "Lcom/ucare/we/injection/BaseComponent;", "()V", "apiInterface", "Lcom/ucare/we/rest/WebApiInterface;", "getApiInterface", "()Lcom/ucare/we/rest/WebApiInterface;", "setApiInterface", "(Lcom/ucare/we/rest/WebApiInterface;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "languageSwitcher", "Lcom/ucare/we/util/LanguageSwitcher;", "getLanguageSwitcher", "()Lcom/ucare/we/util/LanguageSwitcher;", "setLanguageSwitcher", "(Lcom/ucare/we/util/LanguageSwitcher;)V", "manageFamilyMemberCallback", "Lretrofit2/Callback;", "Lcom/ucare/we/model/ServerResponse;", "Ljava/util/ArrayList;", "Lcom/ucare/we/model/remote/grouppaymentrelation/FamilyPaymentRelationResponse;", "Lkotlin/collections/ArrayList;", "managePaymentRelationListener", "Lcom/ucare/we/presentation/family/groupinfo/managemembers/managegrouppaymentrelation/ManagePaymentRelationListener;", "repository", "Lcom/ucare/we/util/prefs/Repository;", "getRepository", "()Lcom/ucare/we/util/prefs/Repository;", "setRepository", "(Lcom/ucare/we/util/prefs/Repository;)V", "managePaymentRelation", "", "mssisdn", "", "registerManagePaymentRelationListener", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dew  reason: default package */
/* loaded from: classes2.dex */
public final class dew extends czz {
    @Inject
    public djw a;
    @Inject
    public djb b;
    @Inject
    public diq c;
    @Inject
    public Context d;
    public dex e;
    public efa<ServerResponse<ArrayList<FamilyPaymentRelationResponse>>> f = new a();

    public final djw a() {
        djw djwVar = this.a;
        if (djwVar != null) {
            return djwVar;
        }
        dqc.a("repository");
        throw null;
    }

    public final Context b() {
        Context context = this.d;
        if (context != null) {
            return context;
        }
        dqc.a("context");
        throw null;
    }

    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00050\u00020\u0001J8\u0010\u0006\u001a\u00020\u00072$\u0010\b\u001a \u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00050\u0002\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016JT\u0010\f\u001a\u00020\u00072$\u0010\b\u001a \u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00050\u0002\u0018\u00010\t2$\u0010\r\u001a \u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00050\u0002\u0018\u00010\u000eH\u0016¨\u0006\u000f"}, d2 = {"com/ucare/we/presentation/family/groupinfo/managemembers/managegrouppaymentrelation/ManageGroupPaymentRelationProvider$manageFamilyMemberCallback$1", "Lretrofit2/Callback;", "Lcom/ucare/we/model/ServerResponse;", "Ljava/util/ArrayList;", "Lcom/ucare/we/model/remote/grouppaymentrelation/FamilyPaymentRelationResponse;", "Lkotlin/collections/ArrayList;", "onFailure", "", NotificationCompat.CATEGORY_CALL, "Lretrofit2/Call;", "t", "", "onResponse", "response", "Lretrofit2/Response;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dew$a */
    /* loaded from: classes2.dex */
    public static final class a implements efa<ServerResponse<ArrayList<FamilyPaymentRelationResponse>>> {
        a() {
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<ArrayList<FamilyPaymentRelationResponse>>> eeyVar, Throwable th) {
            if (th != null) {
                th.getMessage();
            }
            dex dexVar = dew.this.e;
            if (dexVar != null) {
                dew.this.b().getString(R.string.something_went_wrong);
                dexVar.a();
            }
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<ArrayList<FamilyPaymentRelationResponse>>> eeyVar, efn<ServerResponse<ArrayList<FamilyPaymentRelationResponse>>> efnVar) {
            dex dexVar;
            ServerResponse<ArrayList<FamilyPaymentRelationResponse>> serverResponse;
            String str = null;
            ServerResponse<ArrayList<FamilyPaymentRelationResponse>> serverResponse2 = efnVar == null ? null : efnVar.b;
            ResponseHeader header = (efnVar == null || (serverResponse = efnVar.b) == null) ? null : serverResponse.getHeader();
            if (efnVar != null) {
                dew dewVar = dew.this;
                if (!efnVar.a.d()) {
                    dex dexVar2 = dewVar.e;
                    if (dexVar2 == null) {
                        return;
                    }
                    dewVar.b().getString(R.string.something_went_wrong);
                    dexVar2.a();
                    return;
                }
                if (dsg.b(header == null ? null : header.getResponseCode(), "0") && serverResponse2 != null) {
                    if (dewVar.e == null || (dexVar = dewVar.e) == null) {
                        return;
                    }
                    dexVar.a(serverResponse2);
                    return;
                }
                if (header != null) {
                    str = header.getResponseCode();
                }
                if (dsg.b(str, "1200")) {
                    dex dexVar3 = dewVar.e;
                    if (dexVar3 == null) {
                        return;
                    }
                    if (header != null) {
                        header.getResponseMessage();
                    }
                    dexVar3.a();
                    return;
                }
                dex dexVar4 = dewVar.e;
                if (dexVar4 == null) {
                    return;
                }
                dewVar.b().getString(R.string.something_went_wrong);
                dexVar4.a();
            }
        }
    }
}
