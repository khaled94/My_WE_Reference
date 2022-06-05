package io.realm.internal;

import defpackage.dlh;
import io.realm.internal.ObservableCollection;

/* loaded from: classes2.dex */
public class OsList implements dlf, ObservableCollection {
    private static final long b = nativeGetFinalizerPtr();
    private final long a;
    private final dlh<ObservableCollection.b> c;

    private static native long nativeGetFinalizerPtr();

    @Override // defpackage.dlf
    public long getNativePtr() {
        return this.a;
    }

    @Override // defpackage.dlf
    public long getNativeFinalizerPtr() {
        return b;
    }

    @Override // io.realm.internal.ObservableCollection
    public void notifyChangeListeners(long j) {
        OsCollectionChangeSet osCollectionChangeSet = new OsCollectionChangeSet(j);
        if (osCollectionChangeSet.g()) {
            return;
        }
        this.c.a((dlh.a<ObservableCollection.b>) new ObservableCollection.a(osCollectionChangeSet));
    }
}
