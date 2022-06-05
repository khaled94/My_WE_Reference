package defpackage;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: cmk  reason: default package */
/* loaded from: classes2.dex */
final class cmk {

    /* renamed from: cmk$b */
    /* loaded from: classes2.dex */
    static class b {
        final boolean a;
        private final Class<?> b;

        /* synthetic */ b(Class cls, boolean z, byte b) {
            this(cls, z);
        }

        private b(Class<?> cls, boolean z) {
            this.b = cls;
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (bVar.b.equals(this.b) && bVar.a == this.a) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((this.b.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.a).hashCode();
        }
    }

    cmk() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cmk$a */
    /* loaded from: classes2.dex */
    public static class a {
        final clz<?> a;
        final Set<a> b = new HashSet();
        final Set<a> c = new HashSet();

        a(clz<?> clzVar) {
            this.a = clzVar;
        }

        final boolean a() {
            return this.c.isEmpty();
        }
    }

    private static Set<a> a(Set<a> set) {
        HashSet hashSet = new HashSet();
        for (a aVar : set) {
            if (aVar.a()) {
                hashSet.add(aVar);
            }
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(List<clz<?>> list) {
        Set<a> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator<clz<?>> it = list.iterator();
        while (true) {
            int i = 0;
            if (it.hasNext()) {
                clz<?> next = it.next();
                a aVar = new a(next);
                for (Class<? super Object> cls : next.a) {
                    b bVar = new b(cls, !next.c(), (byte) 0);
                    if (!hashMap.containsKey(bVar)) {
                        hashMap.put(bVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(bVar);
                    if (!set2.isEmpty() && !bVar.a) {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                    }
                    set2.add(aVar);
                }
            } else {
                for (Set<a> set3 : hashMap.values()) {
                    for (a aVar2 : set3) {
                        for (cml cmlVar : aVar2.a.b) {
                            if (cmlVar.b() && (set = (Set) hashMap.get(new b(cmlVar.a, cmlVar.a(), (byte) 0))) != null) {
                                for (a aVar3 : set) {
                                    aVar2.b.add(aVar3);
                                    aVar3.c.add(aVar2);
                                }
                            }
                        }
                    }
                }
                HashSet<a> hashSet = new HashSet();
                for (Set set4 : hashMap.values()) {
                    hashSet.addAll(set4);
                }
                Set<a> a2 = a(hashSet);
                while (!a2.isEmpty()) {
                    a next2 = a2.iterator().next();
                    a2.remove(next2);
                    i++;
                    for (a aVar4 : next2.b) {
                        aVar4.c.remove(next2);
                        if (aVar4.a()) {
                            a2.add(aVar4);
                        }
                    }
                }
                if (i == list.size()) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (a aVar5 : hashSet) {
                    if (!aVar5.a() && !aVar5.b.isEmpty()) {
                        arrayList.add(aVar5.a);
                    }
                }
                throw new DependencyCycleException(arrayList);
            }
        }
    }
}
