package defpackage;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: dke  reason: default package */
/* loaded from: classes2.dex */
public final class dke {
    public static void a(Collection<djz<?>> collection) {
        ArrayList arrayList = new ArrayList();
        for (djz<?> djzVar : collection) {
            if (!djzVar.f() && !djzVar.g()) {
                arrayList.add(djzVar);
            }
        }
        if (!arrayList.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("You have these unused @Provider methods:");
            int i = 0;
            while (i < arrayList.size()) {
                sb.append("\n    ");
                int i2 = i + 1;
                sb.append(i2);
                sb.append(". ");
                sb.append(((djz) arrayList.get(i)).d);
                i = i2;
            }
            sb.append("\n    Set library=true in your module to disable this check.");
            throw new IllegalStateException(sb.toString());
        }
    }

    public static void a(Collection<djz<?>> collection, List<djz<?>> list) {
        Iterator<djz<?>> it = collection.iterator();
        while (it.hasNext()) {
            djz<?> next = it.next();
            if (!next.e()) {
                if (next.d()) {
                    int indexOf = list.indexOf(next);
                    StringBuilder sb = new StringBuilder("Dependency cycle:");
                    for (int i = indexOf; i < list.size(); i++) {
                        sb.append("\n    ");
                        sb.append(i - indexOf);
                        sb.append(". ");
                        sb.append(list.get(i).b);
                        sb.append(" bound by ");
                        sb.append(list.get(i));
                    }
                    sb.append("\n    0. ");
                    sb.append(next.b);
                    throw new IllegalStateException(sb.toString());
                }
                next.a(true);
                list.add(next);
                try {
                    a aVar = new a();
                    next.a(aVar, aVar);
                    a(aVar, list);
                    next.b(true);
                } finally {
                    list.remove(list.size() - 1);
                    next.a(false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dke$a */
    /* loaded from: classes2.dex */
    public static class a<T> extends AbstractSet<T> {
        private final ArrayList<T> a = new ArrayList<>();

        a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(T t) {
            this.a.add(t);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<T> iterator() {
            return this.a.iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            throw new UnsupportedOperationException();
        }
    }
}
