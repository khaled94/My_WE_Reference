package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.ucare.we.R;
import com.ucare.we.model.ResponseHeader;
import com.ucare.we.model.ServerRequest;
import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.local.family.GetMemberRequestBody;
import com.ucare.we.model.local.family.ManageFamilyMemberRequestBody;
import com.ucare.we.model.local.family.PaginationModel;
import com.ucare.we.model.remote.familygroupmember.FamilyGroupMember;
import java.io.IOException;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001a2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020)H\u0007J\u001c\u0010+\u001a\u00020&2\b\u0010,\u001a\u0004\u0018\u00010\u001a2\b\u0010-\u001a\u0004\u0018\u00010\u001aH\u0007J\u0010\u0010.\u001a\u00020&2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010/\u001a\u00020&2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eR\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00110\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u00060"}, d2 = {"Lcom/ucare/we/presentation/family/groupinfo/managemembers/provider/ManageNumbersProvider;", "Lcom/ucare/we/injection/BaseComponent;", "()V", "apiInterface", "Lcom/ucare/we/rest/WebApiInterface;", "getApiInterface", "()Lcom/ucare/we/rest/WebApiInterface;", "setApiInterface", "(Lcom/ucare/we/rest/WebApiInterface;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getFamilyMemberCallback", "Lretrofit2/Callback;", "Lcom/ucare/we/model/ServerResponse;", "Lcom/ucare/we/model/remote/familygroupmember/FamilyGroupMember;", "languageSwitcher", "Lcom/ucare/we/util/LanguageSwitcher;", "getLanguageSwitcher", "()Lcom/ucare/we/util/LanguageSwitcher;", "setLanguageSwitcher", "(Lcom/ucare/we/util/LanguageSwitcher;)V", "manageFamilyMemberCallback", "", "manageNumbersListener", "Lcom/ucare/we/presentation/family/groupinfo/managemembers/provider/ManageNumbersListener;", "numbersActionsListener", "Lcom/ucare/we/presentation/family/groupinfo/managemembers/provider/NumbersActionsListener;", "repository", "Lcom/ucare/we/util/prefs/Repository;", "getRepository", "()Lcom/ucare/we/util/prefs/Repository;", "setRepository", "(Lcom/ucare/we/util/prefs/Repository;)V", "getFamilyMember", "", "groupId", "beginRecord", "", "recordsInPage", "manageFamilyMember", "actionType", "mssisdn", "registerGroupInfoListener", "registerNumbersActionsListener", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dfb  reason: default package */
/* loaded from: classes2.dex */
public final class dfb extends czz {
    public dfa a;
    @Inject
    public djw b;
    @Inject
    public djb c;
    @Inject
    public diq d;
    @Inject
    public Context e;
    public dfc f;
    private efa<ServerResponse<String>> g = new b();
    private efa<ServerResponse<FamilyGroupMember>> h = new a();

    private djw b() {
        djw djwVar = this.b;
        if (djwVar != null) {
            return djwVar;
        }
        dqc.a("repository");
        throw null;
    }

    private djb c() {
        djb djbVar = this.c;
        if (djbVar != null) {
            return djbVar;
        }
        dqc.a("languageSwitcher");
        throw null;
    }

    private diq d() {
        diq diqVar = this.d;
        if (diqVar != null) {
            return diqVar;
        }
        dqc.a("apiInterface");
        throw null;
    }

    public final Context a() {
        Context context = this.e;
        if (context != null) {
            return context;
        }
        dqc.a("context");
        throw null;
    }

    public final void a(String str, String str2) {
        d().g("https://api-my.te.eg/api/family/manage-family-member", b().I(), ServerRequest.createServerRequest(b().m(), c().c.k(), new ManageFamilyMemberRequestBody(str, str2, b().P().getId()))).a(this.g);
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J(\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J2\u0010\n\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00072\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/ucare/we/presentation/family/groupinfo/managemembers/provider/ManageNumbersProvider$manageFamilyMemberCallback$1", "Lretrofit2/Callback;", "Lcom/ucare/we/model/ServerResponse;", "", "onFailure", "", NotificationCompat.CATEGORY_CALL, "Lretrofit2/Call;", "t", "", "onResponse", "response", "Lretrofit2/Response;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dfb$b */
    /* loaded from: classes2.dex */
    public static final class b implements efa<ServerResponse<String>> {
        b() {
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, Throwable th) {
            dfc dfcVar = dfb.this.f;
            if (dfcVar != null) {
                dfcVar.b(0, dfb.this.a().getString(R.string.something_went_wrong));
            }
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<String>> eeyVar, efn<ServerResponse<String>> efnVar) {
            ResponseHeader header;
            dfc dfcVar;
            dqc.d(efnVar, "response");
            ServerResponse<String> serverResponse = efnVar.b;
            ServerResponse<String> serverResponse2 = efnVar.b;
            String str = null;
            ResponseHeader header2 = serverResponse2 == null ? null : serverResponse2.getHeader();
            int i = 0;
            if (!efnVar.a.d()) {
                dfc dfcVar2 = dfb.this.f;
                if (dfcVar2 == null) {
                    return;
                }
                dfcVar2.b(0, dfb.this.a().getString(R.string.something_went_wrong));
                return;
            }
            if (dsg.b(header2 == null ? null : header2.getResponseCode(), "0")) {
                if (dfb.this.f == null) {
                    return;
                }
                if (serverResponse != null) {
                    str = serverResponse.getBody();
                }
                if (str == null || (dfcVar = dfb.this.f) == null) {
                    return;
                }
                dfcVar.a(serverResponse);
                return;
            }
            if (dsg.b(header2 == null ? null : header2.getResponseCode(), "1200")) {
                dfc dfcVar3 = dfb.this.f;
                if (dfcVar3 == null) {
                    return;
                }
                if (header2 != null) {
                    str = header2.getResponseMessage();
                }
                dfcVar3.b(1200, str);
                return;
            }
            dfc dfcVar4 = dfb.this.f;
            if (dfcVar4 == null) {
                return;
            }
            String responseCode = header2 == null ? null : header2.getResponseCode();
            if (responseCode != null) {
                i = Integer.parseInt(responseCode);
            }
            if (serverResponse != null && (header = serverResponse.getHeader()) != null) {
                str = header.getResponseMessage();
            }
            dfcVar4.b(i, str);
        }
    }

    public final void a(String str) {
        dqc.d(str, "groupId");
        d().l("https://api-my.te.eg/api/family/groupmemebers", b().I(), ServerRequest.createServerRequest(b().m(), c().c.k(), new GetMemberRequestBody(str, new PaginationModel(0, 0)))).a(this.h);
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J(\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J4\u0010\n\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00072\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\fH\u0016¨\u0006\r"}, d2 = {"com/ucare/we/presentation/family/groupinfo/managemembers/provider/ManageNumbersProvider$getFamilyMemberCallback$1", "Lretrofit2/Callback;", "Lcom/ucare/we/model/ServerResponse;", "Lcom/ucare/we/model/remote/familygroupmember/FamilyGroupMember;", "onFailure", "", NotificationCompat.CATEGORY_CALL, "Lretrofit2/Call;", "t", "", "onResponse", "response", "Lretrofit2/Response;", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dfb$a */
    /* loaded from: classes2.dex */
    public static final class a implements efa<ServerResponse<FamilyGroupMember>> {
        a() {
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<FamilyGroupMember>> eeyVar, Throwable th) {
            try {
                if (!djm.a()) {
                    dfa dfaVar = dfb.this.a;
                    if (dfaVar == null) {
                        return;
                    }
                    dfaVar.b(dfb.this.a().getString(R.string.check_network_connection));
                    return;
                }
                dfa dfaVar2 = dfb.this.a;
                if (dfaVar2 == null) {
                    return;
                }
                dfaVar2.b(dfb.this.a().getString(R.string.error_contacting_server));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }

        @Override // defpackage.efa
        public final void a(eey<ServerResponse<FamilyGroupMember>> eeyVar, efn<ServerResponse<FamilyGroupMember>> efnVar) {
            dfa dfaVar;
            ServerResponse<FamilyGroupMember> serverResponse;
            String str = null;
            FamilyGroupMember familyGroupMember = null;
            String str2 = null;
            ServerResponse<FamilyGroupMember> serverResponse2 = efnVar == null ? null : efnVar.b;
            ResponseHeader header = (efnVar == null || (serverResponse = efnVar.b) == null) ? null : serverResponse.getHeader();
            if (efnVar != null) {
                dfb dfbVar = dfb.this;
                if (!efnVar.a.d()) {
                    dfa dfaVar2 = dfbVar.a;
                    if (dfaVar2 == null) {
                        return;
                    }
                    dfaVar2.b(dfbVar.a().getString(R.string.something_went_wrong));
                    return;
                }
                if (dsg.b(header == null ? null : header.getResponseCode(), "0")) {
                    if (dfbVar.a == null) {
                        return;
                    }
                    if ((serverResponse2 == null ? null : serverResponse2.getBody()) == null || (dfaVar = dfbVar.a) == null) {
                        return;
                    }
                    if (serverResponse2 != null) {
                        familyGroupMember = serverResponse2.getBody();
                    }
                    if (familyGroupMember == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.ucare.we.model.remote.familygroupmember.FamilyGroupMember");
                    }
                    dfaVar.a(familyGroupMember);
                    return;
                }
                if (dsg.b(header == null ? null : header.getResponseCode(), "1200")) {
                    dfa dfaVar3 = dfbVar.a;
                    if (dfaVar3 == null) {
                        return;
                    }
                    if (header != null) {
                        str2 = header.getResponseMessage();
                    }
                    dfaVar3.b(str2);
                    return;
                }
                dfa dfaVar4 = dfbVar.a;
                if (dfaVar4 == null) {
                    return;
                }
                if (header != null) {
                    str = header.getResponseMessage();
                }
                dfaVar4.b(str);
            }
        }
    }
}
