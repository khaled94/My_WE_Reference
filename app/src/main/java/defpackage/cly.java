package defpackage;

import java.util.Set;

/* renamed from: cly  reason: default package */
/* loaded from: classes2.dex */
abstract class cly implements cmc {
    @Override // defpackage.cmc
    public <T> T a(Class<T> cls) {
        cow<T> c = c(cls);
        if (c == null) {
            return null;
        }
        return c.a();
    }

    @Override // defpackage.cmc
    public <T> Set<T> b(Class<T> cls) {
        return d(cls).a();
    }
}
