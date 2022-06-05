package defpackage;

import defpackage.dmb;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/ResumeOnCompletion;", "Lkotlinx/coroutines/JobNode;", "continuation", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/coroutines/Continuation;)V", "invoke", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dvw  reason: default package */
/* loaded from: classes2.dex */
final class dvw extends dvn {
    private final dnu<dmg> a;

    @Override // defpackage.dow
    public final /* synthetic */ dmg invoke(Throwable th) {
        a(th);
        return dmg.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dvw(dnu<? super dmg> dnuVar) {
        this.a = dnuVar;
    }

    @Override // defpackage.dtt
    public final void a(Throwable th) {
        dnu<dmg> dnuVar = this.a;
        dmg dmgVar = dmg.a;
        dmb.a aVar = dmb.a;
        dnuVar.resumeWith(dmb.d(dmgVar));
    }
}
