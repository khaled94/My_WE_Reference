package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.ucare.we.R;
import com.ucare.we.model.ResponseHeader;
import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.remote.transferpackage.TransferablePackages;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0007J\u0018\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020.H\u0007J\u0010\u0010/\u001a\u00020(2\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u00100\u001a\u00020(2\b\u0010!\u001a\u0004\u0018\u00010\"R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010#\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020%0$j\b\u0012\u0004\u0012\u00020%`&0\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/transferablepackages/providers/TransferablePackagesProvider;", "Lcom/ucare/we/injection/BaseComponent;", "()V", "adjustBalanceCallback", "Lretrofit2/Callback;", "Lcom/ucare/we/model/ServerResponse;", "", "adjustBalanceListener", "Lcom/ucare/we/presentation/family/groupinfo/transferablepackages/providers/AdjustBalanceListener;", "apiInterface", "Lcom/ucare/we/rest/WebApiInterface;", "getApiInterface", "()Lcom/ucare/we/rest/WebApiInterface;", "setApiInterface", "(Lcom/ucare/we/rest/WebApiInterface;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "languageSwitcher", "Lcom/ucare/we/util/LanguageSwitcher;", "getLanguageSwitcher", "()Lcom/ucare/we/util/LanguageSwitcher;", "setLanguageSwitcher", "(Lcom/ucare/we/util/LanguageSwitcher;)V", "repository", "Lcom/ucare/we/util/prefs/Repository;", "getRepository", "()Lcom/ucare/we/util/prefs/Repository;", "setRepository", "(Lcom/ucare/we/util/prefs/Repository;)V", "transferUnitsTransferablePackagesListener", "Lcom/ucare/we/presentation/family/groupinfo/transferablepackages/providers/TransferUnitsTransferablePackagesListener;", "transferablePackagesCallback", "Ljava/util/ArrayList;", "Lcom/ucare/we/model/remote/transferpackage/TransferablePackages;", "Lkotlin/collections/ArrayList;", "adjustBalance", "", "mappingCode", "", "getTransferablePackages", "resourceType", "freeAmount", "", "registerAdjustBalanceListener", "registerTransferablePackagesListener", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dfk  reason: default package */
/* loaded from: classes2.dex */
public final class dfk extends czz {
    @Inject
    public djw a;
    @Inject
    public djb b;
    @Inject
    public diq c;
    @Inject
    public Context d;
    public dfj e;
    public dfi f;
    public efa<ServerResponse<ArrayList<TransferablePackages>>> g = new b();
    public efa<ServerResponse<Object>> h = new a();

    public final djw a() {
        djw djwVar = this.a;
        if (djwVar != null) {
            return djwVar;
        }
        dqc.a("repository");
        throw null;
    }

    public final djb b() {
        djb djbVar = this.b;
        if (djbVar != null) {
            return djbVar;
        }
        dqc.a("languageSwitcher");
        throw null;
    }

    public final diq c() {
        diq diqVar = this.c;
        if (diqVar != null) {
            return diqVar;
        }
        dqc.a("apiInterface");
        throw null;
    }

    public final Context d() {
        Context context = this.d;
        if (context != null) {
            return context;
        }
        dqc.a("context");
        throw null;
    }

    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00050\u00020\u0001J8\u0010\u0006\u001a\u00020\u00072$\u0010\b\u001a \u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00050\u0002\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016JT\u0010\f\u001a\u00020\u00072$\u0010\b\u001a \u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00050\u0002\u0018\u00010\t2$\u0010\r\u001a \u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00050\u0002\u0018\u00010\u000eH\u0016¨\u0006\u000f"}, d2 = {"com/ucare/we/presentation/family/groupinfo/transferablepackages/providers/TransferablePackagesProvider$transferablePackagesCallback$1", "Lretrofit2/Callback;", "Lcom/ucare/we/model/ServerResponse;", "Ljava/util/ArrayList;", "Lcom/ucare/we/model/remote/transferpackage/TransferablePackages;", "Lkotlin/collections/ArrayList;", "onFailure", "", NotificationCompat.CATEGORY_CALL, "Lretrofit2/Call;", "t", "", "onResponse", "response", "Lretrofit2/Response;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dfk$b */
    /* loaded from: classes2.dex */
    public static final class b implements efa<ServerResponse<ArrayList<TransferablePackages>>> {
        b() {
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<ArrayList<TransferablePackages>>> eeyVar, Throwable th) {
            dfj dfjVar = dfk.this.e;
            if (dfjVar != null) {
                dfk.this.d().getString(R.string.something_went_wrong);
                dfjVar.a();
            }
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<ArrayList<TransferablePackages>>> eeyVar, efn<ServerResponse<ArrayList<TransferablePackages>>> efnVar) {
            ResponseHeader header;
            dfj dfjVar;
            ServerResponse<ArrayList<TransferablePackages>> serverResponse;
            String str = null;
            ServerResponse<ArrayList<TransferablePackages>> serverResponse2 = efnVar == null ? null : efnVar.b;
            ResponseHeader header2 = (efnVar == null || (serverResponse = efnVar.b) == null) ? null : serverResponse.getHeader();
            if (efnVar != null) {
                dfk dfkVar = dfk.this;
                if (!efnVar.a.d()) {
                    dfj dfjVar2 = dfkVar.e;
                    if (dfjVar2 == null) {
                        return;
                    }
                    dfkVar.d().getString(R.string.something_went_wrong);
                    dfjVar2.a();
                    return;
                }
                if (dsg.b(header2 == null ? null : header2.getResponseCode(), "0") && serverResponse2 != null) {
                    if (dfkVar.e == null || serverResponse2.getBody() == null || (dfjVar = dfkVar.e) == null) {
                        return;
                    }
                    dfjVar.a(serverResponse2);
                    return;
                }
                if (header2 != null) {
                    str = header2.getResponseCode();
                }
                if (dsg.b(str, "1200")) {
                    dfj dfjVar3 = dfkVar.e;
                    if (dfjVar3 == null) {
                        return;
                    }
                    if (header2 != null) {
                        header2.getResponseMessage();
                    }
                    dfjVar3.a();
                    return;
                }
                dfj dfjVar4 = dfkVar.e;
                if (dfjVar4 == null) {
                    return;
                }
                if (serverResponse2 != null && (header = serverResponse2.getHeader()) != null) {
                    header.getResponseMessage();
                }
                dfjVar4.a();
            }
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J(\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J4\u0010\n\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00072\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\fH\u0016¨\u0006\r"}, d2 = {"com/ucare/we/presentation/family/groupinfo/transferablepackages/providers/TransferablePackagesProvider$adjustBalanceCallback$1", "Lretrofit2/Callback;", "Lcom/ucare/we/model/ServerResponse;", "", "onFailure", "", NotificationCompat.CATEGORY_CALL, "Lretrofit2/Call;", "t", "", "onResponse", "response", "Lretrofit2/Response;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dfk$a */
    /* loaded from: classes2.dex */
    public static final class a implements efa<ServerResponse<Object>> {
        a() {
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<Object>> eeyVar, Throwable th) {
            dfi dfiVar = dfk.this.f;
            if (dfiVar != null) {
                dfiVar.a(dfk.this.d().getString(R.string.something_went_wrong));
            }
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<Object>> eeyVar, efn<ServerResponse<Object>> efnVar) {
            ResponseHeader header;
            ResponseHeader header2;
            dfi dfiVar;
            ServerResponse<Object> serverResponse;
            String str = null;
            ServerResponse<Object> serverResponse2 = efnVar == null ? null : efnVar.b;
            ResponseHeader header3 = (efnVar == null || (serverResponse = efnVar.b) == null) ? null : serverResponse.getHeader();
            if (efnVar != null) {
                dfk dfkVar = dfk.this;
                if (!efnVar.a.d()) {
                    dfi dfiVar2 = dfkVar.f;
                    if (dfiVar2 == null) {
                        return;
                    }
                    if (serverResponse2 != null && (header = serverResponse2.getHeader()) != null) {
                        str = header.getResponseMessage();
                    }
                    dfiVar2.a(str);
                    return;
                }
                if (dsg.b(header3 == null ? null : header3.getResponseCode(), "0") && serverResponse2 != null) {
                    if (dfkVar.e == null || (dfiVar = dfkVar.f) == null) {
                        return;
                    }
                    dfiVar.b(serverResponse2);
                    return;
                }
                if (dsg.b(header3 == null ? null : header3.getResponseCode(), "1200")) {
                    dfi dfiVar3 = dfkVar.f;
                    if (dfiVar3 == null) {
                        return;
                    }
                    if (header3 != null) {
                        str = header3.getResponseMessage();
                    }
                    dfiVar3.a(str);
                    return;
                }
                dfi dfiVar4 = dfkVar.f;
                if (dfiVar4 == null) {
                    return;
                }
                if (serverResponse2 != null && (header2 = serverResponse2.getHeader()) != null) {
                    str = header2.getResponseMessage();
                }
                dfiVar4.a(str);
            }
        }
    }
}
