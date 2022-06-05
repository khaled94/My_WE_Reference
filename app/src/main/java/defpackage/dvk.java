package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0000\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0003R\u0014\u0010\u0006\u001a\u00020\u0007X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/JobImpl;", "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/CompletableJob;", "parent", "Lkotlinx/coroutines/Job;", "(Lkotlinx/coroutines/Job;)V", "handlesException", "", "getHandlesException$kotlinx_coroutines_core", "()Z", "onCancelComplete", "getOnCancelComplete$kotlinx_coroutines_core", "complete", "completeExceptionally", "exception", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dvk  reason: default package */
/* loaded from: classes2.dex */
public class dvk extends dvo implements dtp {
    private final boolean a;

    @Override // defpackage.dvo
    public final boolean b() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvk(dvi dviVar) {
        super(true);
        boolean z = true;
        a(dviVar);
        dtl dtlVar = (dtl) this._parentHandle;
        dtm dtmVar = dtlVar instanceof dtm ? (dtm) dtlVar : null;
        if (dtmVar != null) {
            dvo c = dtmVar.c();
            while (!c.f()) {
                dtl dtlVar2 = (dtl) c._parentHandle;
                dtm dtmVar2 = dtlVar2 instanceof dtm ? (dtm) dtlVar2 : null;
                if (dtmVar2 != null) {
                    c = dtmVar2.c();
                }
            }
            this.a = z;
        }
        z = false;
        this.a = z;
    }

    @Override // defpackage.dvo
    public final boolean f() {
        return this.a;
    }
}
