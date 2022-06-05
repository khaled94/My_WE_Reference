package io.realm.internal;

import defpackage.dlh;

/* loaded from: classes2.dex */
interface ObservableCollection {
    void notifyChangeListeners(long j);

    /* loaded from: classes2.dex */
    public static class b<T> extends dlh.b<T, Object> {
        public final void a(OsCollectionChangeSet osCollectionChangeSet) {
            if (this.b instanceof dko) {
                new dlk(osCollectionChangeSet);
            } else if (this.b instanceof dkr) {
            } else {
                throw new RuntimeException("Unsupported listener type: " + this.b);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class c<T> implements dko<T> {
        private final dkr<T> a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(dkr<T> dkrVar) {
            this.a = dkrVar;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    /* loaded from: classes2.dex */
    public static class a implements dlh.a<b> {
        private final OsCollectionChangeSet a;

        @Override // defpackage.dlh.a
        public final /* bridge */ /* synthetic */ void a(b bVar) {
            bVar.a(this.a);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(OsCollectionChangeSet osCollectionChangeSet) {
            this.a = osCollectionChangeSet;
        }
    }
}
