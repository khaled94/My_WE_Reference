package defpackage;

import androidx.lifecycle.ViewModel;
import defpackage.cvs;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0006J\u0014\u0010\f\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\bJ\u0012\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0014\u0010\u0012\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\bJ\u0006\u0010\u0015\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0006J\u0006\u0010\u0017\u001a\u00020\u0006J\u0006\u0010\u0018\u001a\u00020\u0006J\u0006\u0010\u0019\u001a\u00020\u0006J\u0006\u0010\u001a\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ucare/we/newHome/features/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "appUseCase", "Lcom/ucare/we/newHome/domain/use_case/HomeUseCase;", "(Lcom/ucare/we/newHome/domain/use_case/HomeUseCase;)V", "getBalance", "", "balanceRequest", "Lcom/ucare/mywe/domain/entities/local/baserequest/BaseRequest;", "Lcom/ucare/mywe/domain/entities/local/balance/BalanceBody;", "getCPermissionRequest", "getConfigRequest", "getFmcMembers", "fmcMembersRequest", "Lcom/ucare/mywe/domain/entities/local/fmcGroupMembers/FmcGroupMembersRequest;", "getFreeUnitUsage", "unitUsageGroupId", "Lcom/ucare/mywe/domain/entities/local/unitusage/UnitUsageBody;", "getMoreBundleRequest", "baseRequest", "", "getMoviesRequest", "getPermissionRequest", "getPostPaidBalance", "getPromiseToPayStatus", "getPromiseToPayURL", "getUpdateConfigRequest", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dbp  reason: default package */
/* loaded from: classes2.dex */
public final class dbp extends ViewModel {
    private final dbn a;

    @Inject
    public dbp(dbn dbnVar) {
        dqc.d(dbnVar, "appUseCase");
        this.a = dbnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "result", "Lcom/ucare/mywe/core/common/Resource;", "Lcom/ucare/mywe/domain/entities/remote/baseresponse/BaseResponse;", "Lcom/ucare/mywe/domain/entities/remote/unitusage/UnitUsageResponse;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    @dog(b = "HomeViewModel.kt", c = {}, d = "invokeSuspend", e = "com.ucare.we.newHome.features.HomeViewModel$getFreeUnitUsage$1")
    /* renamed from: dbp$a */
    /* loaded from: classes2.dex */
    public static final class a extends dol implements dph<cvs<cvx<Object>>, dnu<? super dmg>, Object> {
        int a;
        /* synthetic */ Object b;

        a(dnu<? super a> dnuVar) {
            super(2, dnuVar);
        }

        @Override // defpackage.doc
        public final dnu<dmg> create(Object obj, dnu<?> dnuVar) {
            a aVar = new a(dnuVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // defpackage.doc
        public final Object invokeSuspend(Object obj) {
            dny dnyVar = dny.COROUTINE_SUSPENDED;
            if (this.a == 0) {
                cvs cvsVar = (cvs) this.b;
                if (cvsVar instanceof cvs.c) {
                    egv.a.a("getFreeUnitUsage success", new Object[0]);
                } else if (cvsVar instanceof cvs.a) {
                    egv.a.a("getFreeUnitUsage error", new Object[0]);
                } else if (cvsVar instanceof cvs.b) {
                    egv.a.a("getFreeUnitUsage loading", new Object[0]);
                }
                return dmg.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // defpackage.dph
        public final /* synthetic */ Object invoke(cvs<cvx<Object>> cvsVar, dnu<? super dmg> dnuVar) {
            return ((a) create(cvsVar, dnuVar)).invokeSuspend(dmg.a);
        }
    }
}
