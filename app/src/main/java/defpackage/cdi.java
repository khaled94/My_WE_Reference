package defpackage;

import defpackage.cdm;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cdi  reason: default package */
/* loaded from: classes2.dex */
public final class cdi extends cco<Float> implements cdm.f, cem, RandomAccess {
    private static final cdi b;
    private float[] c;
    private int d;

    @Override // defpackage.cco, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        c();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(c(i));
        }
        float[] fArr = this.c;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.c, i, fArr2, i + 1, this.d - i);
            this.c = fArr2;
        }
        this.c[i] = floatValue;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.cco, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        a(((Float) obj).floatValue());
        return true;
    }

    @Override // defpackage.cco, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        c();
        b(i);
        float[] fArr = this.c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    static {
        cdi cdiVar = new cdi(new float[0], 0);
        b = cdiVar;
        cdiVar.a = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public cdi() {
        this(new float[10], 0);
    }

    private cdi(float[] fArr, int i) {
        this.c = fArr;
        this.d = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        c();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.c;
        System.arraycopy(fArr, i2, fArr, i, this.d - i2);
        this.d -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.cco, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdi)) {
            return super.equals(obj);
        }
        cdi cdiVar = (cdi) obj;
        if (this.d != cdiVar.d) {
            return false;
        }
        float[] fArr = cdiVar.c;
        for (int i = 0; i < this.d; i++) {
            if (Float.floatToIntBits(this.c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.cco, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public final void a(float f) {
        c();
        int i = this.d;
        float[] fArr = this.c;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.c = fArr2;
        }
        float[] fArr3 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // defpackage.cco, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        c();
        cdm.a(collection);
        if (!(collection instanceof cdi)) {
            return super.addAll(collection);
        }
        cdi cdiVar = (cdi) collection;
        int i = cdiVar.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.c;
        if (i3 > fArr.length) {
            this.c = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(cdiVar.c, 0, this.c, this.d, cdiVar.d);
        this.d = i3;
        this.modCount++;
        return true;
    }

    @Override // defpackage.cco, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Float.valueOf(this.c[i]))) {
                float[] fArr = this.c;
                System.arraycopy(fArr, i + 1, fArr, i, (this.d - i) - 1);
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
        float[] fArr = this.c;
        float f = fArr[i];
        if (i < this.d - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return Float.valueOf(f);
    }

    @Override // defpackage.cdm.i
    public final /* synthetic */ cdm.i a(int i) {
        if (i < this.d) {
            throw new IllegalArgumentException();
        }
        return new cdi(Arrays.copyOf(this.c, i), this.d);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        b(i);
        return Float.valueOf(this.c[i]);
    }
}
