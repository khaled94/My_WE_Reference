package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\b\u0010\r\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/NodeList;", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "Lkotlinx/coroutines/Incomplete;", "()V", "isActive", "", "()Z", "list", "getList", "()Lkotlinx/coroutines/NodeList;", "getString", "", "state", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dvs  reason: default package */
/* loaded from: classes2.dex */
public final class dvs extends dyl implements dvd {
    @Override // defpackage.dvd
    public final dvs b() {
        return this;
    }

    @Override // defpackage.dvd
    public final boolean w_() {
        return true;
    }

    public final String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        dvs dvsVar = this;
        boolean z = true;
        for (dyn dynVar = (dyn) dvsVar.g(); !dqc.a(dynVar, dvsVar); dynVar = dynVar.h()) {
            if (dynVar instanceof dvn) {
                dvn dvnVar = (dvn) dynVar;
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(dvnVar);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        dqc.b(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @Override // defpackage.dyn
    public final String toString() {
        return dug.b() ? a("Active") : super.toString();
    }
}
