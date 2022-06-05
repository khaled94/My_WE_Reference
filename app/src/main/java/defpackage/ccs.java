package defpackage;

import defpackage.cdm;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ccs  reason: default package */
/* loaded from: classes2.dex */
public final class ccs extends cco<Boolean> implements cdm.a, cem, RandomAccess {
    private static final ccs b;
    private boolean[] c;
    private int d;

    @Override // defpackage.cco, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(c(i));
        }
        boolean[] zArr = this.c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.c, i, zArr2, i + 1, this.d - i);
            this.c = zArr2;
        }
        this.c[i] = booleanValue;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.cco, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        a(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // defpackage.cco, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c();
        b(i);
        boolean[] zArr = this.c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    static {
        ccs ccsVar = new ccs(new boolean[0], 0);
        b = ccsVar;
        ccsVar.a = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ccs() {
        this(new boolean[10], 0);
    }

    private ccs(boolean[] zArr, int i) {
        this.c = zArr;
        this.d = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        c();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.c;
        System.arraycopy(zArr, i2, zArr, i, this.d - i2);
        this.d -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.cco, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccs)) {
            return super.equals(obj);
        }
        ccs ccsVar = (ccs) obj;
        if (this.d != ccsVar.d) {
            return false;
        }
        boolean[] zArr = ccsVar.c;
        for (int i = 0; i < this.d; i++) {
            if (this.c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.cco, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + cdm.a(this.c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public final void a(boolean z) {
        c();
        int i = this.d;
        boolean[] zArr = this.c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.c = zArr2;
        }
        boolean[] zArr3 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // defpackage.cco, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        c();
        cdm.a(collection);
        if (!(collection instanceof ccs)) {
            return super.addAll(collection);
        }
        ccs ccsVar = (ccs) collection;
        int i = ccsVar.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.c;
        if (i3 > zArr.length) {
            this.c = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(ccsVar.c, 0, this.c, this.d, ccsVar.d);
        this.d = i3;
        this.modCount++;
        return true;
    }

    @Override // defpackage.cco, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Boolean.valueOf(this.c[i]))) {
                boolean[] zArr = this.c;
                System.arraycopy(zArr, i + 1, zArr, i, (this.d - i) - 1);
                this.d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private void b(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(c(i));
        }
    }

    private String c(int i) {
        return "Index:" + i + ", Size:" + this.d;
    }

    @Override // defpackage.cco, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        c();
        b(i);
        boolean[] zArr = this.c;
        boolean z = zArr[i];
        if (i < this.d - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cdm.i
    public final /* synthetic */ cdm.i a(int i) {
        if (i < this.d) {
            throw new IllegalArgumentException();
        }
        return new ccs(Arrays.copyOf(this.c, i), this.d);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        b(i);
        return Boolean.valueOf(this.c[i]);
    }
}
