package defpackage;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: avd  reason: default package */
/* loaded from: classes.dex */
public class avd<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    boolean a;
    private final int b;
    private List<avi> c;
    private Map<K, V> d;
    private volatile avk e;
    private Map<K, V> f;
    private volatile ave g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <FieldDescriptorType extends ass<FieldDescriptorType>> avd<FieldDescriptorType, Object> a(int i) {
        return new avc(i);
    }

    private avd(int i) {
        this.b = i;
        this.c = Collections.emptyList();
        this.d = Collections.emptyMap();
        this.f = Collections.emptyMap();
    }

    public void a() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.a) {
            if (this.d.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.d);
            }
            this.d = map;
            if (this.f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f);
            }
            this.f = map2;
            this.a = true;
        }
    }

    public final int b() {
        return this.c.size();
    }

    public final Map.Entry<K, V> b(int i) {
        return this.c.get(i);
    }

    public final Iterable<Map.Entry<K, V>> c() {
        if (this.d.isEmpty()) {
            return avh.a();
        }
        return this.d.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.c.size() + this.d.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a((avd<K, V>) comparable) >= 0 || this.d.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a((avd<K, V>) comparable);
        if (a >= 0) {
            return (V) this.c.get(a).getValue();
        }
        return this.d.get(comparable);
    }

    public final V a(K k, V v) {
        e();
        int a = a((avd<K, V>) k);
        if (a >= 0) {
            return (V) this.c.get(a).setValue(v);
        }
        e();
        if (this.c.isEmpty() && !(this.c instanceof ArrayList)) {
            this.c = new ArrayList(this.b);
        }
        int i = -(a + 1);
        if (i >= this.b) {
            return f().put(k, v);
        }
        int size = this.c.size();
        int i2 = this.b;
        if (size == i2) {
            avi remove = this.c.remove(i2 - 1);
            f().put((K) remove.getKey(), (V) remove.getValue());
        }
        this.c.add(i, new avi(this, k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        e();
        if (!this.c.isEmpty()) {
            this.c.clear();
        }
        if (!this.d.isEmpty()) {
            this.d.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e();
        Comparable comparable = (Comparable) obj;
        int a = a((avd<K, V>) comparable);
        if (a >= 0) {
            return (V) c(a);
        }
        if (!this.d.isEmpty()) {
            return this.d.remove(comparable);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V c(int i) {
        e();
        V v = (V) this.c.remove(i).getValue();
        if (!this.d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = f().entrySet().iterator();
            this.c.add(new avi(this, it.next()));
            it.remove();
        }
        return v;
    }

    private final int a(K k) {
        int size = this.c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.c.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) this.c.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.e == null) {
            this.e = new avk(this, (byte) 0);
        }
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> d() {
        if (this.g == null) {
            this.g = new ave(this, (byte) 0);
        }
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        if (!this.a) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    private final SortedMap<K, V> f() {
        e();
        if (this.d.isEmpty() && !(this.d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.d = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avd)) {
            return super.equals(obj);
        }
        avd avdVar = (avd) obj;
        int size = size();
        if (size != avdVar.size()) {
            return false;
        }
        int b = b();
        if (b != avdVar.b()) {
            return entrySet().equals(avdVar.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!b(i).equals(avdVar.b(i))) {
                return false;
            }
        }
        if (b == size) {
            return true;
        }
        return this.d.equals(avdVar.d);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int b = b();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            i += this.c.get(i2).hashCode();
        }
        return this.d.size() > 0 ? i + this.d.hashCode() : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return a((avd<K, V>) ((Comparable) obj), (Comparable) obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ avd(int i, byte b) {
        this(i);
    }
}
