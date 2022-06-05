package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: eb  reason: default package */
/* loaded from: classes2.dex */
final class eb {
    private final Map<ck, dv<?>> a = new HashMap();
    private final Map<ck, dv<?>> b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<ck, dv<?>> a(boolean z) {
        return z ? this.b : this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ck ckVar, dv<?> dvVar) {
        Map<ck, dv<?>> a = a(dvVar.b);
        if (dvVar.equals(a.get(ckVar))) {
            a.remove(ckVar);
        }
    }
}
