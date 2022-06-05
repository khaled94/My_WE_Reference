package defpackage;

import defpackage.dmb;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\bH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"classSimpleName", "", "", "getClassSimpleName", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", "getHexAddress", "toDebugString", "Lkotlin/coroutines/Continuation;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* renamed from: duh  reason: default package */
/* loaded from: classes2.dex */
public final class duh {
    public static final String a(dnu<?> dnuVar) {
        Object obj;
        if (dnuVar instanceof dyf) {
            return dnuVar.toString();
        }
        try {
            dmb.a aVar = dmb.a;
            obj = dmb.d(dnuVar + '@' + Integer.toHexString(System.identityHashCode(dnuVar)));
        } catch (Throwable th) {
            dmb.a aVar2 = dmb.a;
            obj = dmb.d(dmc.a(th));
        }
        if (dmb.c(obj) != null) {
            obj = ((Object) dnuVar.getClass().getName()) + '@' + Integer.toHexString(System.identityHashCode(dnuVar));
        }
        return (String) obj;
    }
}
