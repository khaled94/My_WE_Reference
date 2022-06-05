package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: arr  reason: default package */
/* loaded from: classes.dex */
final class arr extends arn<Boolean> implements ati<Boolean>, auu, RandomAccess {
    private static final arr b;
    private boolean[] c;
    private int d;

    arr() {
        this(new boolean[10], 0);
    }

    private arr(boolean[] zArr, int i) {
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

    @Override // defpackage.arn, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arr)) {
            return super.equals(obj);
        }
        arr arrVar = (arr) obj;
        if (this.d != arrVar.d) {
            return false;
        }
        boolean[] zArr = arrVar.c;
        for (int i = 0; i < this.d; i++) {
            if (this.c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.arn, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + atb.a(this.c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public final void a(boolean z) {
        a(this.d, z);
    }

    private final void a(int i, boolean z) {
        int i2;
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
        this.c[i] = z;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.arn, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        c();
        atb.a(collection);
        if (!(collection instanceof arr)) {
            return super.addAll(collection);
        }
        arr arrVar = (arr) collection;
        int i = arrVar.d;
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
        System.arraycopy(arrVar.c, 0, this.c, this.d, arrVar.d);
        this.d = i3;
        this.modCount++;
        return true;
    }

    @Override // defpackage.arn, java.util.AbstractCollection, java.util.Collection, java.util.List
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

    @Override // defpackage.arn, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c();
        b(i);
        boolean[] zArr = this.c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // defpackage.arn, java.util.AbstractList, java.util.List
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

    @Override // defpackage.arn, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        a(i, ((Boolean) obj).booleanValue());
    }

    @Override // defpackage.ati
    public final /* synthetic */ ati<Boolean> a(int i) {
        if (i < this.d) {
            throw new IllegalArgumentException();
        }
        return new arr(Arrays.copyOf(this.c, i), this.d);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        b(i);
        return Boolean.valueOf(this.c[i]);
    }

    static {
        arr arrVar = new arr(new boolean[0], 0);
        b = arrVar;
        arrVar.a = false;
    }
}
