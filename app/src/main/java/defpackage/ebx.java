package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: ebx  reason: default package */
/* loaded from: classes2.dex */
final class ebx {
    private final Set<ebe> a = new LinkedHashSet();

    public final synchronized void a(ebe ebeVar) {
        this.a.add(ebeVar);
    }

    public final synchronized void b(ebe ebeVar) {
        this.a.remove(ebeVar);
    }

    public final synchronized boolean c(ebe ebeVar) {
        return this.a.contains(ebeVar);
    }
}
