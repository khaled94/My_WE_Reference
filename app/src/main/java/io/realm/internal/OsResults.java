package io.realm.internal;

import defpackage.dlh;
import io.realm.internal.ObservableCollection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class OsResults implements dlf, ObservableCollection {
    private static final long g = nativeGetFinalizerPtr();
    final long a;
    final OsSharedRealm b;
    final Table c;
    protected boolean d;
    boolean e = false;
    protected final dlh<ObservableCollection.b> f = new dlh<>();
    private final dle h;

    /* loaded from: classes2.dex */
    public static abstract class a<T> implements Iterator<T> {
        OsResults a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long nativeCreateSnapshot(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long nativeFirstRow(long j);

    private static native long nativeGetFinalizerPtr();

    private static native byte nativeGetMode(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native boolean nativeIsValid(long j);

    private native void nativeStopListening(long j);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: classes2.dex */
    public static final class b extends Enum<b> {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        public static final int e = 5;
        private static final /* synthetic */ int[] f = {1, 2, 3, 4, 5};

        static int a(byte b2) {
            if (b2 != 0) {
                if (b2 == 1) {
                    return b;
                }
                if (b2 == 2) {
                    return c;
                }
                if (b2 == 3) {
                    return d;
                }
                if (b2 == 4) {
                    return e;
                }
                throw new IllegalArgumentException("Invalid value: ".concat(String.valueOf((int) b2)));
            }
            return a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OsResults(OsSharedRealm osSharedRealm, Table table, long j) {
        boolean z = false;
        this.b = osSharedRealm;
        dle dleVar = osSharedRealm.context;
        this.h = dleVar;
        this.c = table;
        this.a = j;
        dleVar.a(this);
        this.d = b.a(nativeGetMode(this.a)) != b.c ? true : z;
    }

    @Override // defpackage.dlf
    public long getNativePtr() {
        return this.a;
    }

    @Override // defpackage.dlf
    public long getNativeFinalizerPtr() {
        return g;
    }

    public final <T> void a(T t, dkr<T> dkrVar) {
        this.f.a(t, new ObservableCollection.c(dkrVar));
        if (this.f.a()) {
            nativeStopListening(this.a);
        }
    }

    @Override // io.realm.internal.ObservableCollection
    public void notifyChangeListeners(long j) {
        OsCollectionChangeSet osCollectionChangeSet;
        if (j == 0) {
            osCollectionChangeSet = new dlb(this.b.isPartial());
        } else {
            osCollectionChangeSet = new OsCollectionChangeSet(j, !this.d, this.b.isPartial());
        }
        if (!osCollectionChangeSet.g() || !this.d) {
            this.d = true;
            this.f.a((dlh.a<ObservableCollection.b>) new ObservableCollection.a(osCollectionChangeSet));
        }
    }
}
