package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.ucare.we.R;
import com.ucare.we.model.ResponseHeader;
import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.remote.subscribedoffers.FamilySubscribedOffer;
import java.io.IOException;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0007J\u0012\u0010+\u001a\u00020(2\b\u0010,\u001a\u0004\u0018\u00010-H\u0007J2\u0010.\u001a\u00020(2\u0014\u0010/\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0018\u0001002\u0012\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001302H\u0002J8\u00103\u001a\u00020(2$\u0010/\u001a \u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00180\u0013\u0018\u0001002\b\u00104\u001a\u0004\u0018\u000105H\u0002JT\u00106\u001a\u00020(2$\u0010/\u001a \u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00180\u0013\u0018\u0001002$\u00101\u001a \u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00180\u0013\u0018\u000102H\u0002J\u0010\u00107\u001a\u00020(2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u00108\u001a\u00020(2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aR\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0015\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00180\u00130\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u00069"}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/provider/GroupInfoProvider;", "Lcom/ucare/we/injection/BaseComponent;", "()V", "apiInterface", "Lcom/ucare/we/rest/WebApiInterface;", "getApiInterface", "()Lcom/ucare/we/rest/WebApiInterface;", "setApiInterface", "(Lcom/ucare/we/rest/WebApiInterface;)V", "changePlanListener", "Lcom/ucare/we/presentation/family/groupinfo/provider/ChangePlanListener;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "familyChangeMainPlanCallback", "Lretrofit2/Callback;", "Lcom/ucare/we/model/ServerResponse;", "", "familySubscribedOfferCallback", "Ljava/util/ArrayList;", "Lcom/ucare/we/model/remote/subscribedoffers/FamilySubscribedOffer;", "Lkotlin/collections/ArrayList;", "groupInfoListener", "Lcom/ucare/we/presentation/family/groupinfo/provider/GroupInfoListener;", "languageSwitcher", "Lcom/ucare/we/util/LanguageSwitcher;", "getLanguageSwitcher", "()Lcom/ucare/we/util/LanguageSwitcher;", "setLanguageSwitcher", "(Lcom/ucare/we/util/LanguageSwitcher;)V", "repository", "Lcom/ucare/we/util/prefs/Repository;", "getRepository", "()Lcom/ucare/we/util/prefs/Repository;", "setRepository", "(Lcom/ucare/we/util/prefs/Repository;)V", "familyChangeMainPlan", "", "familyChangeMainPlanBody", "Lcom/ucare/we/model/family/FamilyChangeMainPlanBody;", "familySubscribedOffer", "groupId", "", "onFamilyChangeMainPlanSuccess", NotificationCompat.CATEGORY_CALL, "Lretrofit2/Call;", "response", "Lretrofit2/Response;", "onFamilySubscribedOfferFailure", "t", "", "onFamilySubscribedOfferSuccess", "registerFamilyChangePlanListener", "registerGroupInfoListener", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dff  reason: default package */
/* loaded from: classes2.dex */
public final class dff extends czz {
    public dfe a;
    public dfd b;
    @Inject
    public djw c;
    @Inject
    public djb d;
    @Inject
    public diq e;
    @Inject
    public Context f;
    public efa<ServerResponse<ArrayList<FamilySubscribedOffer>>> g = new b();
    public efa<ServerResponse<Object>> h = new a();

    public final djw a() {
        djw djwVar = this.c;
        if (djwVar != null) {
            return djwVar;
        }
        dqc.a("repository");
        throw null;
    }

    public final djb b() {
        djb djbVar = this.d;
        if (djbVar != null) {
            return djbVar;
        }
        dqc.a("languageSwitcher");
        throw null;
    }

    public final diq c() {
        diq diqVar = this.e;
        if (diqVar != null) {
            return diqVar;
        }
        dqc.a("apiInterface");
        throw null;
    }

    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00050\u00020\u0001J8\u0010\u0006\u001a\u00020\u00072$\u0010\b\u001a \u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00050\u0002\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016JT\u0010\f\u001a\u00020\u00072$\u0010\b\u001a \u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00050\u0002\u0018\u00010\t2$\u0010\r\u001a \u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00050\u0002\u0018\u00010\u000eH\u0017¨\u0006\u000f"}, d2 = {"com/ucare/we/presentation/family/groupinfo/provider/GroupInfoProvider$familySubscribedOfferCallback$1", "Lretrofit2/Callback;", "Lcom/ucare/we/model/ServerResponse;", "Ljava/util/ArrayList;", "Lcom/ucare/we/model/remote/subscribedoffers/FamilySubscribedOffer;", "Lkotlin/collections/ArrayList;", "onFailure", "", NotificationCompat.CATEGORY_CALL, "Lretrofit2/Call;", "t", "", "onResponse", "response", "Lretrofit2/Response;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dff$b */
    /* loaded from: classes2.dex */
    public static final class b implements efa<ServerResponse<ArrayList<FamilySubscribedOffer>>> {
        b() {
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<ArrayList<FamilySubscribedOffer>>> eeyVar, efn<ServerResponse<ArrayList<FamilySubscribedOffer>>> efnVar) {
            dfe dfeVar;
            ServerResponse<ArrayList<FamilySubscribedOffer>> serverResponse;
            dff dffVar = dff.this;
            String str = null;
            ArrayList<FamilySubscribedOffer> arrayList = null;
            String str2 = null;
            ServerResponse<ArrayList<FamilySubscribedOffer>> serverResponse2 = efnVar == null ? null : efnVar.b;
            ResponseHeader header = (efnVar == null || (serverResponse = efnVar.b) == null) ? null : serverResponse.getHeader();
            if (efnVar != null) {
                if (!efnVar.a.d()) {
                    dfe dfeVar2 = dffVar.a;
                    if (dfeVar2 == null) {
                        return;
                    }
                    Context context = dffVar.f;
                    if (context != null) {
                        dfeVar2.a(context.getString(R.string.something_went_wrong));
                        return;
                    } else {
                        dqc.a("context");
                        throw null;
                    }
                }
                if (dsg.b(header == null ? null : header.getResponseCode(), "0")) {
                    if (dffVar.a == null) {
                        return;
                    }
                    if ((serverResponse2 == null ? null : serverResponse2.getBody()) == null || (dfeVar = dffVar.a) == null) {
                        return;
                    }
                    if (serverResponse2 != null) {
                        arrayList = serverResponse2.getBody();
                    }
                    if (arrayList == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<com.ucare.we.model.remote.subscribedoffers.FamilySubscribedOffer>{ kotlin.collections.TypeAliasesKt.ArrayList<com.ucare.we.model.remote.subscribedoffers.FamilySubscribedOffer> }");
                    }
                    dfeVar.a(arrayList);
                    return;
                }
                if (dsg.b(header == null ? null : header.getResponseCode(), "1200")) {
                    dfe dfeVar3 = dffVar.a;
                    if (dfeVar3 == null) {
                        return;
                    }
                    if (header != null) {
                        str2 = header.getResponseMessage();
                    }
                    dfeVar3.a(str2);
                    return;
                }
                dfe dfeVar4 = dffVar.a;
                if (dfeVar4 == null) {
                    return;
                }
                if (header != null) {
                    str = header.getResponseMessage();
                }
                dfeVar4.a(str);
            }
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<ArrayList<FamilySubscribedOffer>>> eeyVar, Throwable th) {
            try {
                if (djm.a()) {
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J(\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J2\u0010\n\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00072\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\fH\u0017¨\u0006\r"}, d2 = {"com/ucare/we/presentation/family/groupinfo/provider/GroupInfoProvider$familyChangeMainPlanCallback$1", "Lretrofit2/Callback;", "Lcom/ucare/we/model/ServerResponse;", "", "onFailure", "", NotificationCompat.CATEGORY_CALL, "Lretrofit2/Call;", "t", "", "onResponse", "response", "Lretrofit2/Response;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dff$a */
    /* loaded from: classes2.dex */
    public static final class a implements efa<ServerResponse<Object>> {
        a() {
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<Object>> eeyVar, efn<ServerResponse<Object>> efnVar) {
            dfd dfdVar;
            dfd dfdVar2;
            String responseCode;
            dqc.d(efnVar, "response");
            dff dffVar = dff.this;
            ServerResponse<Object> serverResponse = efnVar.b;
            ServerResponse<Object> serverResponse2 = efnVar.b;
            String str = null;
            Object obj = null;
            String str2 = null;
            String str3 = null;
            ResponseHeader header = serverResponse2 == null ? null : serverResponse2.getHeader();
            int i = 0;
            if (efnVar.a.d()) {
                Integer valueOf = (header == null || (responseCode = header.getResponseCode()) == null) ? null : Integer.valueOf(Integer.parseInt(responseCode));
                if (dsg.b(header == null ? null : header.getResponseCode(), "0")) {
                    if (dffVar.b == null) {
                        return;
                    }
                    if (serverResponse != null) {
                        obj = serverResponse.getBody();
                    }
                    if (obj == null || (dfdVar2 = dffVar.b) == null) {
                        return;
                    }
                    dfdVar2.a(valueOf, serverResponse);
                    return;
                } else if ((valueOf != null && valueOf.intValue() == 3259) || ((valueOf != null && valueOf.intValue() == 3239) || ((valueOf != null && valueOf.intValue() == 9001) || (valueOf != null && valueOf.intValue() == 8001)))) {
                    dfdVar = dffVar.b;
                    if (dfdVar == null) {
                        return;
                    }
                    i = valueOf.intValue();
                    str = header.getResponseMessage();
                } else if (valueOf != null && valueOf.intValue() == 3258) {
                    dfd dfdVar3 = dffVar.b;
                    if (dfdVar3 == null) {
                        return;
                    }
                    dfdVar3.a(valueOf, serverResponse);
                    return;
                } else {
                    if (dsg.b(header == null ? null : header.getResponseCode(), "1200")) {
                        dfd dfdVar4 = dffVar.b;
                        if (dfdVar4 == null) {
                            return;
                        }
                        if (header != null) {
                            str2 = header.getResponseMessage();
                        }
                        dfdVar4.b(1200, str2);
                        return;
                    }
                    dfd dfdVar5 = dffVar.b;
                    if (dfdVar5 == null) {
                        return;
                    }
                    if (header != null) {
                        str3 = header.getResponseMessage();
                    }
                    dfdVar5.b(0, str3);
                    return;
                }
            } else {
                dfdVar = dffVar.b;
                if (dfdVar == null) {
                    return;
                }
                if (header != null) {
                    str = header.getResponseMessage();
                }
            }
            dfdVar.b(i, str);
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<Object>> eeyVar, Throwable th) {
            try {
                if (djm.a()) {
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    }
}
