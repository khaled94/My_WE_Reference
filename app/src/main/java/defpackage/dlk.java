package defpackage;

import defpackage.dkn;
import io.realm.internal.OsCollectionChangeSet;

/* renamed from: dlk  reason: default package */
/* loaded from: classes2.dex */
public final class dlk implements dkn {
    private final dkn a;
    private final Throwable b;
    private final int c;
    private final boolean d;

    public dlk(OsCollectionChangeSet osCollectionChangeSet) {
        int i;
        this.a = osCollectionChangeSet;
        boolean f = osCollectionChangeSet.f();
        this.d = osCollectionChangeSet.e();
        Throwable d = osCollectionChangeSet.d();
        this.b = d;
        if (d != null) {
            i = dkn.b.c;
        } else {
            i = f ? dkn.b.a : dkn.b.b;
        }
        this.c = i;
    }
}
