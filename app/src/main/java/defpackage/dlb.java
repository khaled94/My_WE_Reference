package defpackage;

import defpackage.dkn;
import io.realm.internal.OsCollectionChangeSet;
import io.realm.internal.sync.OsSubscription;

/* renamed from: dlb  reason: default package */
/* loaded from: classes2.dex */
public final class dlb extends OsCollectionChangeSet {
    private static final int[] c = new int[0];
    private static final dkn.a[] d = new dkn.a[0];

    public dlb(boolean z) {
        super(0L, true, z);
    }

    @Override // io.realm.internal.OsCollectionChangeSet
    public final dkn.a[] a() {
        return d;
    }

    @Override // io.realm.internal.OsCollectionChangeSet
    public final dkn.a[] b() {
        return d;
    }

    @Override // io.realm.internal.OsCollectionChangeSet
    public final dkn.a[] c() {
        return d;
    }

    @Override // io.realm.internal.OsCollectionChangeSet
    public final Throwable d() {
        if (this.a == null || this.a.a() != OsSubscription.b.ERROR) {
            return null;
        }
        return this.a.b();
    }

    @Override // io.realm.internal.OsCollectionChangeSet
    public final boolean e() {
        return super.e();
    }

    @Override // io.realm.internal.OsCollectionChangeSet
    public final boolean f() {
        return super.f();
    }

    @Override // io.realm.internal.OsCollectionChangeSet
    public final boolean g() {
        return this.a == null;
    }

    @Override // io.realm.internal.OsCollectionChangeSet
    public final String toString() {
        return super.toString();
    }

    @Override // io.realm.internal.OsCollectionChangeSet, defpackage.dlf
    public final long getNativePtr() {
        return super.getNativePtr();
    }

    @Override // io.realm.internal.OsCollectionChangeSet, defpackage.dlf
    public final long getNativeFinalizerPtr() {
        return super.getNativeFinalizerPtr();
    }
}
