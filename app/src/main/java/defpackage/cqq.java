package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: cqq  reason: default package */
/* loaded from: classes2.dex */
public final class cqq<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean f = !cqq.class.desiredAssertionStatus();
    private static final Comparator<Comparable> g = new Comparator<Comparable>() { // from class: cqq.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };
    Comparator<? super K> a;
    d<K, V> b;
    int c;
    int d;
    final d<K, V> e;
    private cqq<K, V>.a h;
    private cqq<K, V>.b i;

    public cqq() {
        this(g);
    }

    private cqq(Comparator<? super K> comparator) {
        this.c = 0;
        this.d = 0;
        this.e = new d<>();
        this.a = comparator == null ? g : comparator;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        d<K, V> b2 = b(obj);
        if (b2 != null) {
            return b2.g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return b(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        d<K, V> a2 = a((cqq<K, V>) k, true);
        V v2 = a2.g;
        a2.g = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.b = null;
        this.c = 0;
        this.d++;
        d<K, V> dVar = this.e;
        dVar.e = dVar;
        dVar.d = dVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        d<K, V> a2 = a(obj);
        if (a2 != null) {
            return a2.g;
        }
        return null;
    }

    private d<K, V> a(K k, boolean z) {
        int i;
        d<K, V> dVar;
        Comparator<? super K> comparator = this.a;
        d<K, V> dVar2 = this.b;
        if (dVar2 != null) {
            Comparable comparable = comparator == g ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(dVar2.f);
                } else {
                    i = comparator.compare(k, (K) dVar2.f);
                }
                if (i != 0) {
                    d<K, V> dVar3 = i < 0 ? dVar2.b : dVar2.c;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar2 = dVar3;
                } else {
                    return dVar2;
                }
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        d<K, V> dVar4 = this.e;
        if (dVar2 == null) {
            if (comparator == g && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName() + " is not Comparable");
            }
            dVar = new d<>(dVar2, k, dVar4, dVar4.e);
            this.b = dVar;
        } else {
            dVar = new d<>(dVar2, k, dVar4, dVar4.e);
            if (i < 0) {
                dVar2.b = dVar;
            } else {
                dVar2.c = dVar;
            }
            b(dVar2, true);
        }
        this.c++;
        this.d++;
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d<K, V> b(Object obj) {
        if (obj != 0) {
            try {
                return a((cqq<K, V>) obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
        if ((r3 == r5 || (r3 != null && r3.equals(r5))) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final defpackage.cqq.d<K, V> a(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            cqq$d r0 = r4.b(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L23
            V r3 = r0.g
            java.lang.Object r5 = r5.getValue()
            if (r3 == r5) goto L1f
            if (r3 == 0) goto L1d
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L1d
            goto L1f
        L1d:
            r5 = 0
            goto L20
        L1f:
            r5 = 1
        L20:
            if (r5 == 0) goto L23
            goto L24
        L23:
            r1 = 0
        L24:
            if (r1 == 0) goto L27
            return r0
        L27:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqq.a(java.util.Map$Entry):cqq$d");
    }

    final void a(d<K, V> dVar, boolean z) {
        int i;
        if (z) {
            dVar.e.d = dVar.d;
            dVar.d.e = dVar.e;
        }
        d<K, V> dVar2 = dVar.b;
        d<K, V> dVar3 = dVar.c;
        d<K, V> dVar4 = dVar.a;
        int i2 = 0;
        if (dVar2 != null && dVar3 != null) {
            if (dVar2.h > dVar3.h) {
                d<K, V> dVar5 = dVar2.c;
                while (true) {
                    d<K, V> dVar6 = dVar5;
                    dVar3 = dVar2;
                    dVar2 = dVar6;
                    if (dVar2 == null) {
                        break;
                    }
                    dVar5 = dVar2.c;
                }
            } else {
                while (true) {
                    d<K, V> dVar7 = dVar3.b;
                    if (dVar7 == null) {
                        break;
                    }
                    dVar3 = dVar7;
                }
            }
            a((d) dVar3, false);
            d<K, V> dVar8 = dVar.b;
            if (dVar8 != null) {
                i = dVar8.h;
                dVar3.b = dVar8;
                dVar8.a = dVar3;
                dVar.b = null;
            } else {
                i = 0;
            }
            d<K, V> dVar9 = dVar.c;
            if (dVar9 != null) {
                i2 = dVar9.h;
                dVar3.c = dVar9;
                dVar9.a = dVar3;
                dVar.c = null;
            }
            dVar3.h = Math.max(i, i2) + 1;
            a(dVar, dVar3);
            return;
        }
        if (dVar2 != null) {
            a(dVar, dVar2);
            dVar.b = null;
        } else if (dVar3 != null) {
            a(dVar, dVar3);
            dVar.c = null;
        } else {
            a(dVar, (d) null);
        }
        b(dVar4, false);
        this.c--;
        this.d++;
    }

    final d<K, V> a(Object obj) {
        d<K, V> b2 = b(obj);
        if (b2 != null) {
            a((d) b2, true);
        }
        return b2;
    }

    private void a(d<K, V> dVar, d<K, V> dVar2) {
        d<K, V> dVar3 = dVar.a;
        dVar.a = null;
        if (dVar2 != null) {
            dVar2.a = dVar3;
        }
        if (dVar3 != null) {
            if (dVar3.b == dVar) {
                dVar3.b = dVar2;
                return;
            } else if (!f && dVar3.c != dVar) {
                throw new AssertionError();
            } else {
                dVar3.c = dVar2;
                return;
            }
        }
        this.b = dVar2;
    }

    private void b(d<K, V> dVar, boolean z) {
        while (dVar != null) {
            d<K, V> dVar2 = dVar.b;
            d<K, V> dVar3 = dVar.c;
            int i = 0;
            int i2 = dVar2 != null ? dVar2.h : 0;
            int i3 = dVar3 != null ? dVar3.h : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                d<K, V> dVar4 = dVar3.b;
                d<K, V> dVar5 = dVar3.c;
                int i5 = dVar5 != null ? dVar5.h : 0;
                if (dVar4 != null) {
                    i = dVar4.h;
                }
                int i6 = i - i5;
                if (i6 == -1 || (i6 == 0 && !z)) {
                    a((d) dVar);
                } else if (!f && i6 != 1) {
                    throw new AssertionError();
                } else {
                    b((d) dVar3);
                    a((d) dVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                d<K, V> dVar6 = dVar2.b;
                d<K, V> dVar7 = dVar2.c;
                int i7 = dVar7 != null ? dVar7.h : 0;
                if (dVar6 != null) {
                    i = dVar6.h;
                }
                int i8 = i - i7;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    b((d) dVar);
                } else if (!f && i8 != -1) {
                    throw new AssertionError();
                } else {
                    a((d) dVar2);
                    b((d) dVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                dVar.h = i2 + 1;
                if (z) {
                    return;
                }
            } else if (!f && i4 != -1 && i4 != 1) {
                throw new AssertionError();
            } else {
                dVar.h = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            dVar = dVar.a;
        }
    }

    private void a(d<K, V> dVar) {
        d<K, V> dVar2 = dVar.b;
        d<K, V> dVar3 = dVar.c;
        d<K, V> dVar4 = dVar3.b;
        d<K, V> dVar5 = dVar3.c;
        dVar.c = dVar4;
        if (dVar4 != null) {
            dVar4.a = dVar;
        }
        a(dVar, dVar3);
        dVar3.b = dVar;
        dVar.a = dVar3;
        int i = 0;
        dVar.h = Math.max(dVar2 != null ? dVar2.h : 0, dVar4 != null ? dVar4.h : 0) + 1;
        int i2 = dVar.h;
        if (dVar5 != null) {
            i = dVar5.h;
        }
        dVar3.h = Math.max(i2, i) + 1;
    }

    private void b(d<K, V> dVar) {
        d<K, V> dVar2 = dVar.b;
        d<K, V> dVar3 = dVar.c;
        d<K, V> dVar4 = dVar2.b;
        d<K, V> dVar5 = dVar2.c;
        dVar.b = dVar5;
        if (dVar5 != null) {
            dVar5.a = dVar;
        }
        a(dVar, dVar2);
        dVar2.c = dVar;
        dVar.a = dVar2;
        int i = 0;
        dVar.h = Math.max(dVar3 != null ? dVar3.h : 0, dVar5 != null ? dVar5.h : 0) + 1;
        int i2 = dVar.h;
        if (dVar4 != null) {
            i = dVar4.h;
        }
        dVar2.h = Math.max(i2, i) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        cqq<K, V>.a aVar = this.h;
        if (aVar != null) {
            return aVar;
        }
        cqq<K, V>.a aVar2 = new a();
        this.h = aVar2;
        return aVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        cqq<K, V>.b bVar = this.i;
        if (bVar != null) {
            return bVar;
        }
        cqq<K, V>.b bVar2 = new b();
        this.i = bVar2;
        return bVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cqq$d */
    /* loaded from: classes2.dex */
    public static final class d<K, V> implements Map.Entry<K, V> {
        d<K, V> a;
        d<K, V> b;
        d<K, V> c;
        d<K, V> d;
        d<K, V> e;
        final K f;
        V g;
        int h;

        d() {
            this.f = null;
            this.e = this;
            this.d = this;
        }

        d(d<K, V> dVar, K k, d<K, V> dVar2, d<K, V> dVar3) {
            this.a = dVar;
            this.f = k;
            this.h = 1;
            this.d = dVar2;
            this.e = dVar3;
            dVar3.d = this;
            dVar2.e = this;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.g;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            V v2 = this.g;
            this.g = v;
            return v2;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k = this.f;
                if (k != null ? k.equals(entry.getKey()) : entry.getKey() == null) {
                    V v = this.g;
                    if (v == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.f;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.g;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public final String toString() {
            return this.f + "=" + this.g;
        }
    }

    /* renamed from: cqq$c */
    /* loaded from: classes2.dex */
    abstract class c<T> implements Iterator<T> {
        d<K, V> b;
        d<K, V> c = null;
        int d;

        c() {
            this.b = cqq.this.e.d;
            this.d = cqq.this.d;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b != cqq.this.e;
        }

        final d<K, V> a() {
            d<K, V> dVar = this.b;
            if (dVar == cqq.this.e) {
                throw new NoSuchElementException();
            }
            if (cqq.this.d != this.d) {
                throw new ConcurrentModificationException();
            }
            this.b = dVar.d;
            this.c = dVar;
            return dVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            d<K, V> dVar = this.c;
            if (dVar == null) {
                throw new IllegalStateException();
            }
            cqq.this.a((d) dVar, true);
            this.c = null;
            this.d = cqq.this.d;
        }
    }

    /* renamed from: cqq$a */
    /* loaded from: classes2.dex */
    class a extends AbstractSet<Map.Entry<K, V>> {
        a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return cqq.this.c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new cqq<K, V>.c<Map.Entry<K, V>>() { // from class: cqq.a.1
                {
                    cqq cqqVar = cqq.this;
                }

                @Override // java.util.Iterator
                public final /* synthetic */ Object next() {
                    return a();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && cqq.this.a((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            d<K, V> a;
            if ((obj instanceof Map.Entry) && (a = cqq.this.a((Map.Entry) obj)) != null) {
                cqq.this.a((d) a, true);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            cqq.this.clear();
        }
    }

    /* renamed from: cqq$b */
    /* loaded from: classes2.dex */
    final class b extends AbstractSet<K> {
        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return cqq.this.c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new cqq<K, V>.c<K>() { // from class: cqq.b.1
                {
                    cqq cqqVar = cqq.this;
                }

                @Override // java.util.Iterator
                public final K next() {
                    return a().f;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return cqq.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return cqq.this.a(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            cqq.this.clear();
        }
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }
}
