package defpackage;

import defpackage.cdg;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cew  reason: default package */
/* loaded from: classes2.dex */
public class cew<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    boolean a;
    private final int b;
    private List<cew<K, V>.d> c;
    private Map<K, V> d;
    private volatile cew<K, V>.f e;
    private Map<K, V> f;
    private volatile cew<K, V>.b g;

    /* synthetic */ cew(int i, byte b2) {
        this(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return a((cew<K, V>) ((Comparable) obj), (Comparable) obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <FieldDescriptorType extends cdg.a<FieldDescriptorType>> cew<FieldDescriptorType, Object> a(int i) {
        return (cew<FieldDescriptorType, Object>) new cew<FieldDescriptorType, Object>(i) { // from class: cew.1
            @Override // defpackage.cew
            public final void a() {
                if (!this.a) {
                    for (int i2 = 0; i2 < b(); i2++) {
                        Map.Entry<FieldDescriptorType, Object> b2 = b(i2);
                        if (((cdg.a) b2.getKey()).d()) {
                            b2.setValue(Collections.unmodifiableList((List) b2.getValue()));
                        }
                    }
                    Iterator it = c().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (((cdg.a) entry.getKey()).d()) {
                            entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                        }
                    }
                }
                cew.super.a();
            }
        };
    }

    private cew(int i) {
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
            return c.a();
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
        return a((cew<K, V>) comparable) >= 0 || this.d.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a((cew<K, V>) comparable);
        if (a2 >= 0) {
            return this.c.get(a2).getValue();
        }
        return this.d.get(comparable);
    }

    public final V a(K k, V v) {
        e();
        int a2 = a((cew<K, V>) k);
        if (a2 >= 0) {
            return this.c.get(a2).setValue(v);
        }
        g();
        int i = -(a2 + 1);
        if (i >= this.b) {
            return f().put(k, v);
        }
        int size = this.c.size();
        int i2 = this.b;
        if (size == i2) {
            cew<K, V>.d remove = this.c.remove(i2 - 1);
            f().put(remove.a, remove.getValue());
        }
        this.c.add(i, new d(k, v));
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
        int a2 = a((cew<K, V>) comparable);
        if (a2 >= 0) {
            return (V) c(a2);
        }
        if (!this.d.isEmpty()) {
            return this.d.remove(comparable);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V c(int i) {
        e();
        V value = this.c.remove(i).getValue();
        if (!this.d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = f().entrySet().iterator();
            this.c.add(new d(this, it.next()));
            it.remove();
        }
        return value;
    }

    private int a(K k) {
        int size = this.c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.c.get(size).a);
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
            int compareTo2 = k.compareTo(this.c.get(i2).a);
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
            this.e = new f(this, (byte) 0);
        }
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> d() {
        if (this.g == null) {
            this.g = new b(this, (byte) 0);
        }
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (!this.a) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    private SortedMap<K, V> f() {
        e();
        if (this.d.isEmpty() && !(this.d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.d = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.d;
    }

    private void g() {
        e();
        if (!this.c.isEmpty() || (this.c instanceof ArrayList)) {
            return;
        }
        this.c = new ArrayList(this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cew$d */
    /* loaded from: classes2.dex */
    public class d implements Comparable<cew<K, V>.d>, Map.Entry<K, V> {
        final K a;
        private V c;

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return this.a.compareTo(((d) obj).a);
        }

        d(cew cewVar, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        d(K k, V v) {
            this.a = k;
            this.c = v;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.c;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            cew.this.e();
            V v2 = this.c;
            this.c = v;
            return v2;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a(this.a, entry.getKey()) && a(this.c, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.a;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.c;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public final String toString() {
            return this.a + "=" + this.c;
        }

        private static boolean a(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        public final /* bridge */ /* synthetic */ Object getKey() {
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cew$f */
    /* loaded from: classes2.dex */
    public class f extends AbstractSet<Map.Entry<K, V>> {
        private f() {
        }

        /* synthetic */ f(cew cewVar, byte b) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public /* synthetic */ boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                cew.this.a((cew) ((Comparable) entry.getKey()), (Comparable) entry.getValue());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new e(cew.this, (byte) 0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return cew.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = cew.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                cew.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            cew.this.clear();
        }
    }

    /* renamed from: cew$b */
    /* loaded from: classes2.dex */
    class b extends cew<K, V>.f {
        private b() {
            super(cew.this, (byte) 0);
        }

        /* synthetic */ b(cew cewVar, byte b) {
            this();
        }

        @Override // defpackage.cew.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a(cew.this, (byte) 0);
        }
    }

    /* renamed from: cew$e */
    /* loaded from: classes2.dex */
    class e implements Iterator<Map.Entry<K, V>> {
        private int b;
        private boolean c;
        private Iterator<Map.Entry<K, V>> d;

        private e() {
            this.b = -1;
        }

        /* synthetic */ e(cew cewVar, byte b) {
            this();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b + 1 < cew.this.c.size() || (!cew.this.d.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.c) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.c = false;
            cew.this.e();
            if (this.b < cew.this.c.size()) {
                cew cewVar = cew.this;
                int i = this.b;
                this.b = i - 1;
                cewVar.c(i);
                return;
            }
            a().remove();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.d == null) {
                this.d = cew.this.d.entrySet().iterator();
            }
            return this.d;
        }

        @Override // java.util.Iterator
        public final /* synthetic */ Object next() {
            this.c = true;
            int i = this.b + 1;
            this.b = i;
            if (i < cew.this.c.size()) {
                return (Map.Entry) cew.this.c.get(this.b);
            }
            return a().next();
        }
    }

    /* renamed from: cew$a */
    /* loaded from: classes2.dex */
    class a implements Iterator<Map.Entry<K, V>> {
        private int b;
        private Iterator<Map.Entry<K, V>> c;

        private a() {
            this.b = cew.this.c.size();
        }

        /* synthetic */ a(cew cewVar, byte b) {
            this();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.b;
            return (i > 0 && i <= cew.this.c.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.c == null) {
                this.c = cew.this.f.entrySet().iterator();
            }
            return this.c;
        }

        @Override // java.util.Iterator
        public final /* synthetic */ Object next() {
            if (!a().hasNext()) {
                List list = cew.this.c;
                int i = this.b - 1;
                this.b = i;
                return (Map.Entry) list.get(i);
            }
            return a().next();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cew$c */
    /* loaded from: classes2.dex */
    public static class c {
        private static final Iterator<Object> a = new Iterator<Object>() { // from class: cew.c.1
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        };
        private static final Iterable<Object> b = new Iterable<Object>() { // from class: cew.c.2
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return c.a;
            }
        };

        private c() {
        }

        static <T> Iterable<T> a() {
            return (Iterable<T>) b;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cew)) {
            return super.equals(obj);
        }
        cew cewVar = (cew) obj;
        int size = size();
        if (size != cewVar.size()) {
            return false;
        }
        int b2 = b();
        if (b2 != cewVar.b()) {
            return entrySet().equals(cewVar.entrySet());
        }
        for (int i = 0; i < b2; i++) {
            if (!b(i).equals(cewVar.b(i))) {
                return false;
            }
        }
        if (b2 == size) {
            return true;
        }
        return this.d.equals(cewVar.d);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int b2 = b();
        int i = 0;
        for (int i2 = 0; i2 < b2; i2++) {
            i += this.c.get(i2).hashCode();
        }
        return this.d.size() > 0 ? i + this.d.hashCode() : i;
    }
}
