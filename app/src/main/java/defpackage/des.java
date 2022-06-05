package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.ucare.we.R;
import com.ucare.we.model.ResponseHeader;
import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.remote.transferunits.TransferUnitResponse;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\"H\u0007J\u0010\u0010#\u001a\u00020\"2\b\u0010\u001f\u001a\u0004\u0018\u00010 R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/managebundle/providers/TransferUnitsProvider;", "Lcom/ucare/we/injection/BaseComponent;", "()V", "apiInterface", "Lcom/ucare/we/rest/WebApiInterface;", "getApiInterface", "()Lcom/ucare/we/rest/WebApiInterface;", "setApiInterface", "(Lcom/ucare/we/rest/WebApiInterface;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "languageSwitcher", "Lcom/ucare/we/util/LanguageSwitcher;", "getLanguageSwitcher", "()Lcom/ucare/we/util/LanguageSwitcher;", "setLanguageSwitcher", "(Lcom/ucare/we/util/LanguageSwitcher;)V", "manageFamilyMemberCallback", "Lretrofit2/Callback;", "Lcom/ucare/we/model/ServerResponse;", "Lcom/ucare/we/model/remote/transferunits/TransferUnitResponse;", "repository", "Lcom/ucare/we/util/prefs/Repository;", "getRepository", "()Lcom/ucare/we/util/prefs/Repository;", "setRepository", "(Lcom/ucare/we/util/prefs/Repository;)V", "transferUnitsListener", "Lcom/ucare/we/presentation/family/groupinfo/managebundle/providers/TransferUnitsListener;", "getTransferUnits", "", "registerTransferUnitsListener", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: des  reason: default package */
/* loaded from: classes2.dex */
public final class des extends czz {
    @Inject
    public djw a;
    @Inject
    public djb b;
    @Inject
    public diq c;
    @Inject
    public Context d;
    public der e;
    public efa<ServerResponse<TransferUnitResponse>> f = new a();

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

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J(\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J4\u0010\n\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00072\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\fH\u0016¨\u0006\r"}, d2 = {"com/ucare/we/presentation/family/groupinfo/managebundle/providers/TransferUnitsProvider$manageFamilyMemberCallback$1", "Lretrofit2/Callback;", "Lcom/ucare/we/model/ServerResponse;", "Lcom/ucare/we/model/remote/transferunits/TransferUnitResponse;", "onFailure", "", NotificationCompat.CATEGORY_CALL, "Lretrofit2/Call;", "t", "", "onResponse", "response", "Lretrofit2/Response;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: des$a */
    /* loaded from: classes2.dex */
    public static final class a implements efa<ServerResponse<TransferUnitResponse>> {
        a() {
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<TransferUnitResponse>> eeyVar, Throwable th) {
            der derVar = des.this.e;
            if (derVar != null) {
                des.this.b().getString(R.string.something_went_wrong);
                derVar.a();
            }
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<TransferUnitResponse>> eeyVar, efn<ServerResponse<TransferUnitResponse>> efnVar) {
            ResponseHeader header;
            der derVar;
            ServerResponse<TransferUnitResponse> serverResponse;
            String str = null;
            TransferUnitResponse transferUnitResponse = null;
            ServerResponse<TransferUnitResponse> serverResponse2 = efnVar == null ? null : efnVar.b;
            ResponseHeader header2 = (efnVar == null || (serverResponse = efnVar.b) == null) ? null : serverResponse.getHeader();
            if (efnVar != null) {
                des desVar = des.this;
                if (!efnVar.a.d()) {
                    der derVar2 = desVar.e;
                    if (derVar2 == null) {
                        return;
                    }
                    desVar.b().getString(R.string.something_went_wrong);
                    derVar2.a();
                    return;
                }
                if (dsg.b(header2 == null ? null : header2.getResponseCode(), "0")) {
                    if (desVar.e == null) {
                        return;
                    }
                    if (serverResponse2 != null) {
                        transferUnitResponse = serverResponse2.getBody();
                    }
                    if (transferUnitResponse == null || (derVar = desVar.e) == null) {
                        return;
                    }
                    derVar.a(serverResponse2);
                    return;
                }
                if (header2 != null) {
                    str = header2.getResponseCode();
                }
                if (dsg.b(str, "1200")) {
                    der derVar3 = desVar.e;
                    if (derVar3 == null) {
                        return;
                    }
                    if (header2 != null) {
                        header2.getResponseMessage();
                    }
                    derVar3.a();
                    return;
                }
                der derVar4 = desVar.e;
                if (derVar4 == null) {
                    return;
                }
                if (serverResponse2 != null && (header = serverResponse2.getHeader()) != null) {
                    header.getResponseMessage();
                }
                derVar4.a();
            }
        }
    }
}
