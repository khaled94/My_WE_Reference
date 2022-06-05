package defpackage;

import defpackage.cdm;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: cep  reason: default package */
/* loaded from: classes2.dex */
public final class cep<E> extends cco<E> implements RandomAccess {
    private static final cep<Object> b;
    private E[] c;
    private int d;

    static {
        cep<Object> cepVar = new cep<>(new Object[0], 0);
        b = cepVar;
        cepVar.a = false;
    }

    public static <E> cep<E> d() {
        return (cep<E>) b;
    }

    cep() {
        this(new Object[10], 0);
    }

    private cep(E[] eArr, int i) {
        this.c = eArr;
        this.d = i;
    }

    @Override // defpackage.cco, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        c();
        int i = this.d;
        E[] eArr = this.c;
        if (i == eArr.length) {
            this.c = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    @Override // defpackage.cco, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        c();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(c(i));
        }
        E[] eArr = this.c;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.c, i, eArr2, i + 1, this.d - i);
            this.c = eArr2;
        }
        this.c[i] = e;
        this.d++;
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        b(i);
        return this.c[i];
    }

    @Override // defpackage.cco, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        int i2;
        c();
        b(i);
        E[] eArr = this.c;
        E e = eArr[i];
        if (i < this.d - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return e;
    }

    @Override // defpackage.cco, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        c();
        b(i);
        E[] eArr = this.c;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    private void b(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(c(i));
        }
    }

    private String c(int i) {
        return "Index:" + i + ", Size:" + this.d;
    }

    @Override // defpackage.cdm.i
    public final /* synthetic */ cdm.i a(int i) {
        if (i < this.d) {
            throw new IllegalArgumentException();
        }
        return new cep(Arrays.copyOf(this.c, i), this.d);
    }
}
