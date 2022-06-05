package defpackage;

import java.util.Set;

/* renamed from: dlj  reason: default package */
/* loaded from: classes2.dex */
public abstract class dlj {
    public abstract Set<Class<? extends dku>> a();

    public boolean b() {
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof dlj)) {
            return false;
        }
        return a().equals(((dlj) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }
}
