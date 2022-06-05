package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: bcu  reason: default package */
/* loaded from: classes2.dex */
final class bcu extends bfv<Long> implements bch<Long>, bdt, RandomAccess {
    private static final bcu b;
    private long[] c;
    private int d;

    bcu() {
        this(new long[10], 0);
    }

    private bcu(long[] jArr, int i) {
        this.c = jArr;
        this.d = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        d();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.c;
        System.arraycopy(jArr, i2, jArr, i, this.d - i2);
        this.d -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.bfv, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcu)) {
            return super.equals(obj);
        }
        bcu bcuVar = (bcu) obj;
        if (this.d != bcuVar.d) {
            return false;
        }
        long[] jArr = bcuVar.c;
        for (int i = 0; i < this.d; i++) {
            if (this.c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.bfv, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + bcd.a(this.c[i2]);
        }
        return i;
    }

    public final long b(int i) {
        c(i);
        return this.c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public final void a(long j) {
        a(this.d, j);
    }

    private final void a(int i, long j) {
        int i2;
        d();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(d(i));
        }
        long[] jArr = this.c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.c, i, jArr2, i + 1, this.d - i);
            this.c = jArr2;
        }
        this.c[i] = j;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.bfv, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        d();
        bcd.a(collection);
        if (!(collection instanceof bcu)) {
            return super.addAll(collection);
        }
        bcu bcuVar = (bcu) collection;
        int i = bcuVar.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.c;
        if (i3 > jArr.length) {
            this.c = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(bcuVar.c, 0, this.c, this.d, bcuVar.d);
        this.d = i3;
        this.modCount++;
        return true;
    }

    @Override // defpackage.bfv, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        d();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Long.valueOf(this.c[i]))) {
                long[] jArr = this.c;
                System.arraycopy(jArr, i + 1, jArr, i, (this.d - i) - 1);
                this.d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void c(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(d(i));
        }
    }

    private final String d(int i) {
        int i2 = this.d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // defpackage.bfv, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        d();
        c(i);
        long[] jArr = this.c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // defpackage.bfv, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        d();
        c(i);
        long[] jArr = this.c;
        long j = jArr[i];
        if (i < this.d - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    @Override // defpackage.bfv, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        a(i, ((Long) obj).longValue());
    }

    @Override // defpackage.bch
    public final /* synthetic */ bch<Long> a(int i) {
        if (i < this.d) {
            throw new IllegalArgumentException();
        }
        return new bcu(Arrays.copyOf(this.c, i), this.d);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(b(i));
    }

    static {
        bcu bcuVar = new bcu(new long[0], 0);
        b = bcuVar;
        bcuVar.a = false;
    }
}
