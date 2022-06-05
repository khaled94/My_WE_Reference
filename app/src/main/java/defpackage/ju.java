package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ju  reason: default package */
/* loaded from: classes2.dex */
public final class ju {
    private final List<String> a = new ArrayList();
    private final Map<String, List<a<?, ?>>> b = new HashMap();

    public final synchronized void a(List<String> list) {
        ArrayList<String> arrayList = new ArrayList(this.a);
        this.a.clear();
        for (String str : list) {
            this.a.add(str);
        }
        for (String str2 : arrayList) {
            if (!list.contains(str2)) {
                this.a.add(str2);
            }
        }
    }

    public final synchronized <T, R> List<co<T, R>> a(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.a) {
            List<a<?, ?>> list = this.b.get(str);
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.b);
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized <T, R> List<Class<R>> b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.a) {
            List<a<?, ?>> list = this.b.get(str);
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.a)) {
                        arrayList.add(aVar.a);
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized <T, R> void a(String str, co<T, R> coVar, Class<T> cls, Class<R> cls2) {
        a(str).add(new a<>(cls, cls2, coVar));
    }

    private synchronized List<a<?, ?>> a(String str) {
        List<a<?, ?>> list;
        if (!this.a.contains(str)) {
            this.a.add(str);
        }
        list = this.b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.b.put(str, list);
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ju$a */
    /* loaded from: classes2.dex */
    public static class a<T, R> {
        final Class<R> a;
        final co<T, R> b;
        private final Class<T> c;

        public a(Class<T> cls, Class<R> cls2, co<T, R> coVar) {
            this.c = cls;
            this.a = cls2;
            this.b = coVar;
        }

        public final boolean a(Class<?> cls, Class<?> cls2) {
            return this.c.isAssignableFrom(cls) && cls2.isAssignableFrom(this.a);
        }
    }
}
