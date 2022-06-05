package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: bce  reason: default package */
/* loaded from: classes2.dex */
final class bce extends bfv<Integer> implements bci, bdt, RandomAccess {
    private static final bce b;
    private int[] c;
    private int d;

    public static bce a() {
        return b;
    }

    bce() {
        this(new int[10], 0);
    }

    private bce(int[] iArr, int i) {
        this.c = iArr;
        this.d = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        d();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.c;
        System.arraycopy(iArr, i2, iArr, i, this.d - i2);
        this.d -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.bfv, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bce)) {
            return super.equals(obj);
        }
        bce bceVar = (bce) obj;
        if (this.d != bceVar.d) {
            return false;
        }
        int[] iArr = bceVar.c;
        for (int i = 0; i < this.d; i++) {
            if (this.c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.bfv, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + this.c[i2];
        }
        return i;
    }

    public final int b(int i) {
        d(i);
        return this.c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public final void c(int i) {
        a(this.d, i);
    }

    private final void a(int i, int i2) {
        int i3;
        d();
        if (i < 0 || i > (i3 = this.d)) {
            throw new IndexOutOfBoundsException(e(i));
        }
        int[] iArr = this.c;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.c, i, iArr2, i + 1, this.d - i);
            this.c = iArr2;
        }
        this.c[i] = i2;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.bfv, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        d();
        bcd.a(collection);
        if (!(collection instanceof bce)) {
            return super.addAll(collection);
        }
        bce bceVar = (bce) collection;
        int i = bceVar.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.c;
        if (i3 > iArr.length) {
            this.c = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(bceVar.c, 0, this.c, this.d, bceVar.d);
        this.d = i3;
        this.modCount++;
        return true;
    }

    @Override // defpackage.bfv, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        d();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Integer.valueOf(this.c[i]))) {
                int[] iArr = this.c;
                System.arraycopy(iArr, i + 1, iArr, i, (this.d - i) - 1);
                this.d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void d(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(e(i));
        }
    }

    private final String e(int i) {
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
        int intValue = ((Integer) obj).intValue();
        d();
        d(i);
        int[] iArr = this.c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // defpackage.bfv, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        d();
        d(i);
        int[] iArr = this.c;
        int i3 = iArr[i];
        if (i < this.d - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return Integer.valueOf(i3);
    }

    @Override // defpackage.bfv, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        a(i, ((Integer) obj).intValue());
    }

    @Override // defpackage.bch
    public final /* synthetic */ bch<Integer> a(int i) {
        if (i < this.d) {
            throw new IllegalArgumentException();
        }
        return new bce(Arrays.copyOf(this.c, i), this.d);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(b(i));
    }

    static {
        bce bceVar = new bce(new int[0], 0);
        b = bceVar;
        bceVar.a = false;
    }
}
