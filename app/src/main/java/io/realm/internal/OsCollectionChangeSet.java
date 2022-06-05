package io.realm.internal;

import defpackage.dkn;
import io.realm.internal.sync.OsSubscription;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class OsCollectionChangeSet implements dkn, dlf {
    private static long c = nativeGetFinalizerPtr();
    protected final OsSubscription a;
    protected final boolean b;
    private final long d;
    private final boolean e;

    private static native long nativeGetFinalizerPtr();

    private static native int[] nativeGetRanges(long j, int i);

    public OsCollectionChangeSet(long j) {
        this(j, false, false);
    }

    public OsCollectionChangeSet(long j, boolean z, boolean z2) {
        this.d = j;
        this.e = z;
        this.a = null;
        this.b = z2;
        dle.a.a(this);
    }

    public dkn.a[] a() {
        return a(nativeGetRanges(this.d, 0));
    }

    public dkn.a[] b() {
        return a(nativeGetRanges(this.d, 1));
    }

    public dkn.a[] c() {
        return a(nativeGetRanges(this.d, 2));
    }

    public Throwable d() {
        OsSubscription osSubscription = this.a;
        if (osSubscription == null || osSubscription.a() != OsSubscription.b.ERROR) {
            return null;
        }
        return this.a.b();
    }

    public boolean e() {
        if (!this.b) {
            return true;
        }
        OsSubscription osSubscription = this.a;
        return osSubscription != null && osSubscription.a() == OsSubscription.b.COMPLETE;
    }

    public boolean f() {
        return this.e;
    }

    public boolean g() {
        return this.d == 0;
    }

    private static dkn.a[] a(int[] iArr) {
        if (iArr == null) {
            return new dkn.a[0];
        }
        int length = iArr.length / 2;
        dkn.a[] aVarArr = new dkn.a[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            aVarArr[i] = new dkn.a(iArr[i2], iArr[i2 + 1]);
        }
        return aVarArr;
    }

    public String toString() {
        if (this.d == 0) {
            return "Change set is empty.";
        }
        return "Deletion Ranges: " + Arrays.toString(a()) + "\nInsertion Ranges: " + Arrays.toString(b()) + "\nChange Ranges: " + Arrays.toString(c());
    }

    public long getNativePtr() {
        return this.d;
    }

    public long getNativeFinalizerPtr() {
        return c;
    }
}
