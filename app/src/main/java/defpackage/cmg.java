package defpackage;

import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: cmg */
/* loaded from: classes2.dex */
public final class cmg extends cly {
    private static final cow<Set<Object>> a = cmj.b();
    private final Map<clz<?>, cmo<?>> b = new HashMap();
    private final Map<Class<?>, cmo<?>> c = new HashMap();
    private final Map<Class<?>, cmo<Set<?>>> d = new HashMap();
    private final cmm e;

    @Override // defpackage.cly, defpackage.cmc
    public final /* bridge */ /* synthetic */ Object a(Class cls) {
        return super.a(cls);
    }

    @Override // defpackage.cly, defpackage.cmc
    public final /* bridge */ /* synthetic */ Set b(Class cls) {
        return super.b(cls);
    }

    public cmg(Executor executor, Iterable<cmf> iterable, clz<?>... clzVarArr) {
        this.e = new cmm(executor);
        ArrayList<clz<?>> arrayList = new ArrayList();
        arrayList.add(clz.a(this.e, cmm.class, cmt.class, cms.class));
        for (cmf cmfVar : iterable) {
            arrayList.addAll(cmfVar.getComponents());
        }
        Collections.addAll(arrayList, clzVarArr);
        cmk.a(arrayList);
        for (clz<?> clzVar : arrayList) {
            this.b.put(clzVar, new cmo<>(new cow(this, clzVar) { // from class: cmh
                private final cmg a;
                private final clz b;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.a = this;
                    this.b = clzVar;
                }

                @Override // defpackage.cow
                public final Object a() {
                    return cmg.a(this.a, this.b);
                }
            }));
        }
        a();
        b();
    }

    private void a() {
        for (Map.Entry<clz<?>, cmo<?>> entry : this.b.entrySet()) {
            clz<?> key = entry.getKey();
            if (key.c()) {
                cmo<?> value = entry.getValue();
                for (Class<? super Object> cls : key.a) {
                    this.c.put(cls, value);
                }
            }
        }
        for (clz<?> clzVar : this.b.keySet()) {
            for (cml cmlVar : clzVar.b) {
                if ((cmlVar.b == 1) && !this.c.containsKey(cmlVar.a)) {
                    throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", clzVar, cmlVar.a));
                }
            }
        }
    }

    private void b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<clz<?>, cmo<?>> entry : this.b.entrySet()) {
            clz<?> key = entry.getKey();
            if (!key.c()) {
                cmo<?> value = entry.getValue();
                for (Class<? super Object> cls : key.a) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            this.d.put((Class) entry2.getKey(), new cmo<>(new cow((Set) entry2.getValue()) { // from class: cmi
                private final Set a;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.a = r1;
                }

                @Override // defpackage.cow
                public final Object a() {
                    return cmg.a(this.a);
                }
            }));
        }
    }

    public static /* synthetic */ Set a(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((cmo) it.next()).a());
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // defpackage.cmc
    public final <T> cow<T> c(Class<T> cls) {
        aat.a(cls, "Null interface requested.");
        return this.c.get(cls);
    }

    @Override // defpackage.cmc
    public final <T> cow<Set<T>> d(Class<T> cls) {
        cmo<Set<?>> cmoVar = this.d.get(cls);
        return cmoVar != null ? cmoVar : (cow<Set<T>>) a;
    }

    public final void a(boolean z) {
        for (Map.Entry<clz<?>, cmo<?>> entry : this.b.entrySet()) {
            clz<?> key = entry.getKey();
            cmo<?> value = entry.getValue();
            if (key.a() || (key.b() && z)) {
                value.a();
            }
        }
        this.e.a();
    }

    public static /* synthetic */ Object a(cmg cmgVar, clz clzVar) {
        return clzVar.c.a(new cmp(clzVar, cmgVar));
    }
}
