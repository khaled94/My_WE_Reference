package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: bbn  reason: default package */
/* loaded from: classes2.dex */
final class bbn extends bfv<Double> implements bch<Double>, bdt, RandomAccess {
    private static final bbn b;
    private double[] c;
    private int d;

    bbn() {
        this(new double[10], 0);
    }

    private bbn(double[] dArr, int i) {
        this.c = dArr;
        this.d = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        d();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.c;
        System.arraycopy(dArr, i2, dArr, i, this.d - i2);
        this.d -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.bfv, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbn)) {
            return super.equals(obj);
        }
        bbn bbnVar = (bbn) obj;
        if (this.d != bbnVar.d) {
            return false;
        }
        double[] dArr = bbnVar.c;
        for (int i = 0; i < this.d; i++) {
            if (Double.doubleToLongBits(this.c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.bfv, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + bcd.a(Double.doubleToLongBits(this.c[i2]));
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public final void a(double d) {
        a(this.d, d);
    }

    private final void a(int i, double d) {
        int i2;
        d();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(c(i));
        }
        double[] dArr = this.c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.c, i, dArr2, i + 1, this.d - i);
            this.c = dArr2;
        }
        this.c[i] = d;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.bfv, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        d();
        bcd.a(collection);
        if (!(collection instanceof bbn)) {
            return super.addAll(collection);
        }
        bbn bbnVar = (bbn) collection;
        int i = bbnVar.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.c;
        if (i3 > dArr.length) {
            this.c = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(bbnVar.c, 0, this.c, this.d, bbnVar.d);
        this.d = i3;
        this.modCount++;
        return true;
    }

    @Override // defpackage.bfv, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        d();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Double.valueOf(this.c[i]))) {
                double[] dArr = this.c;
                System.arraycopy(dArr, i + 1, dArr, i, (this.d - i) - 1);
                this.d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void b(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(c(i));
        }
    }

    private final String c(int i) {
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
        double doubleValue = ((Double) obj).doubleValue();
        d();
        b(i);
        double[] dArr = this.c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // defpackage.bfv, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        d();
        b(i);
        double[] dArr = this.c;
        double d = dArr[i];
        if (i < this.d - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return Double.valueOf(d);
    }

    @Override // defpackage.bfv, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        a(i, ((Double) obj).doubleValue());
    }

    @Override // defpackage.bch
    public final /* synthetic */ bch<Double> a(int i) {
        if (i < this.d) {
            throw new IllegalArgumentException();
        }
        return new bbn(Arrays.copyOf(this.c, i), this.d);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        b(i);
        return Double.valueOf(this.c[i]);
    }

    static {
        bbn bbnVar = new bbn(new double[0], 0);
        b = bbnVar;
        bbnVar.a = false;
    }
}
