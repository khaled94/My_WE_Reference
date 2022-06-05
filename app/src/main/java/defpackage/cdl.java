package defpackage;

import defpackage.cdm;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cdl  reason: default package */
/* loaded from: classes2.dex */
public final class cdl extends cco<Integer> implements cdm.g, cem, RandomAccess {
    private static final cdl b;
    private int[] c;
    private int d;

    @Override // defpackage.cco, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        c();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(e(i));
        }
        int[] iArr = this.c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.c, i, iArr2, i + 1, this.d - i);
            this.c = iArr2;
        }
        this.c[i] = intValue;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.cco, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        c(((Integer) obj).intValue());
        return true;
    }

    @Override // defpackage.cco, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        c();
        d(i);
        int[] iArr = this.c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    static {
        cdl cdlVar = new cdl(new int[0], 0);
        b = cdlVar;
        cdlVar.a = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public cdl() {
        this(new int[10], 0);
    }

    private cdl(int[] iArr, int i) {
        this.c = iArr;
        this.d = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        c();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.c;
        System.arraycopy(iArr, i2, iArr, i, this.d - i2);
        this.d -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.cco, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdl)) {
            return super.equals(obj);
        }
        cdl cdlVar = (cdl) obj;
        if (this.d != cdlVar.d) {
            return false;
        }
        int[] iArr = cdlVar.c;
        for (int i = 0; i < this.d; i++) {
            if (this.c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.cco, java.util.AbstractList, java.util.Collection, java.util.List
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
        c();
        int i2 = this.d;
        int[] iArr = this.c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.c = iArr2;
        }
        int[] iArr3 = this.c;
        int i3 = this.d;
        this.d = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // defpackage.cco, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        c();
        cdm.a(collection);
        if (!(collection instanceof cdl)) {
            return super.addAll(collection);
        }
        cdl cdlVar = (cdl) collection;
        int i = cdlVar.d;
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
        System.arraycopy(cdlVar.c, 0, this.c, this.d, cdlVar.d);
        this.d = i3;
        this.modCount++;
        return true;
    }

    @Override // defpackage.cco, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
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

    private void d(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(e(i));
        }
    }

    private String e(int i) {
        return "Index:" + i + ", Size:" + this.d;
    }

    @Override // defpackage.cco, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        c();
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

    @Override // defpackage.cdm.i
    public final /* synthetic */ cdm.i a(int i) {
        if (i < this.d) {
            throw new IllegalArgumentException();
        }
        return new cdl(Arrays.copyOf(this.c, i), this.d);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(b(i));
    }
}
