package defpackage;

import com.google.gson.JsonIOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* renamed from: cqm  reason: default package */
/* loaded from: classes2.dex */
public final class cqm {
    private final Map<Type, cps<?>> a;
    private final cqy b = cqy.a();

    public cqm(Map<Type, cps<?>> map) {
        this.a = map;
    }

    private <T> cqr<T> a(Class<? super T> cls) {
        try {
            final Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.b.a(declaredConstructor);
            }
            return new cqr<T>() { // from class: cqm.8
                /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
                @Override // defpackage.cqr
                public final T a() {
                    try {
                        return declaredConstructor.newInstance(null);
                    } catch (IllegalAccessException e) {
                        throw new AssertionError(e);
                    } catch (InstantiationException e2) {
                        throw new RuntimeException("Failed to invoke " + declaredConstructor + " with no args", e2);
                    } catch (InvocationTargetException e3) {
                        throw new RuntimeException("Failed to invoke " + declaredConstructor + " with no args", e3.getTargetException());
                    }
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final String toString() {
        return this.a.toString();
    }

    public final <T> cqr<T> a(crb<T> crbVar) {
        cqr<T> cqrVar;
        final Type type = crbVar.b;
        final Class<? super T> cls = crbVar.a;
        final cps<?> cpsVar = this.a.get(type);
        if (cpsVar != null) {
            return new cqr<T>() { // from class: cqm.1
                /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
                @Override // defpackage.cqr
                public final T a() {
                    return cpsVar.a();
                }
            };
        }
        final cps<?> cpsVar2 = this.a.get(cls);
        if (cpsVar2 != null) {
            return new cqr<T>() { // from class: cqm.7
                /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
                @Override // defpackage.cqr
                public final T a() {
                    return cpsVar2.a();
                }
            };
        }
        cqr<T> a = a(cls);
        if (a != null) {
            return a;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                cqrVar = new cqr<T>() { // from class: cqm.9
                    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.TreeSet] */
                    @Override // defpackage.cqr
                    public final T a() {
                        return new TreeSet();
                    }
                };
            } else if (EnumSet.class.isAssignableFrom(cls)) {
                cqrVar = new cqr<T>() { // from class: cqm.10
                    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.util.EnumSet] */
                    @Override // defpackage.cqr
                    public final T a() {
                        Type type2 = type;
                        if (type2 instanceof ParameterizedType) {
                            Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (type3 instanceof Class) {
                                return EnumSet.noneOf((Class) type3);
                            }
                            throw new JsonIOException("Invalid EnumSet type: " + type.toString());
                        }
                        throw new JsonIOException("Invalid EnumSet type: " + type.toString());
                    }
                };
            } else if (Set.class.isAssignableFrom(cls)) {
                cqrVar = new cqr<T>() { // from class: cqm.11
                    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.LinkedHashSet] */
                    @Override // defpackage.cqr
                    public final T a() {
                        return new LinkedHashSet();
                    }
                };
            } else if (Queue.class.isAssignableFrom(cls)) {
                cqrVar = new cqr<T>() { // from class: cqm.12
                    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayDeque] */
                    @Override // defpackage.cqr
                    public final T a() {
                        return new ArrayDeque();
                    }
                };
            } else {
                cqrVar = new cqr<T>() { // from class: cqm.13
                    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayList] */
                    @Override // defpackage.cqr
                    public final T a() {
                        return new ArrayList();
                    }
                };
            }
        } else if (!Map.class.isAssignableFrom(cls)) {
            cqrVar = null;
        } else if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
            cqrVar = new cqr<T>() { // from class: cqm.14
                /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.ConcurrentSkipListMap, T] */
                @Override // defpackage.cqr
                public final T a() {
                    return new ConcurrentSkipListMap();
                }
            };
        } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
            cqrVar = new cqr<T>() { // from class: cqm.2
                /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.concurrent.ConcurrentHashMap] */
                @Override // defpackage.cqr
                public final T a() {
                    return new ConcurrentHashMap();
                }
            };
        } else if (SortedMap.class.isAssignableFrom(cls)) {
            cqrVar = new cqr<T>() { // from class: cqm.3
                /* JADX WARN: Type inference failed for: r0v0, types: [java.util.TreeMap, T] */
                @Override // defpackage.cqr
                public final T a() {
                    return new TreeMap();
                }
            };
        } else if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(crb.a(((ParameterizedType) type).getActualTypeArguments()[0]).a)) {
            cqrVar = new cqr<T>() { // from class: cqm.4
                /* JADX WARN: Type inference failed for: r0v0, types: [java.util.LinkedHashMap, T] */
                @Override // defpackage.cqr
                public final T a() {
                    return new LinkedHashMap();
                }
            };
        } else {
            cqrVar = new cqr<T>() { // from class: cqm.5
                /* JADX WARN: Type inference failed for: r0v0, types: [cqq, T] */
                @Override // defpackage.cqr
                public final T a() {
                    return new cqq();
                }
            };
        }
        return cqrVar != null ? cqrVar : new cqr<T>() { // from class: cqm.6
            private final cqt d = cqt.a();

            /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
            @Override // defpackage.cqr
            public final T a() {
                try {
                    return this.d.a(cls);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to invoke no-args constructor for " + type + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e);
                }
            }
        };
    }
}
