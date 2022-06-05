package dagger.internal.plugins.reflect;

import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import dagger.internal.Linker;
import dagger.internal.SetBinding;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class ReflectiveModuleAdapter extends dkc<Object> {
    final Class<?> h;

    public ReflectiveModuleAdapter(Class<?> cls, Module module) {
        super(a(module.injects()), module.staticInjections(), module.overrides(), module.includes(), module.complete(), module.library());
        this.h = cls;
    }

    private static String[] a(Class<?>[] clsArr) {
        String[] strArr = new String[clsArr.length];
        for (int i = 0; i < clsArr.length; i++) {
            Class<?> cls = clsArr[i];
            strArr[i] = cls.isInterface() ? dka.a((Type) cls) : dka.a(cls);
        }
        return strArr;
    }

    @Override // defpackage.dkc
    public final void a(Map<String, djz<?>> map) {
        Method[] declaredMethods;
        for (Class<?> cls = this.h; cls != Object.class; cls = cls.getSuperclass()) {
            for (Method method : cls.getDeclaredMethods()) {
                Provides provides = (Provides) method.getAnnotation(Provides.class);
                if (provides != null) {
                    Type genericReturnType = method.getGenericReturnType();
                    Type rawType = genericReturnType instanceof ParameterizedType ? ((ParameterizedType) genericReturnType).getRawType() : genericReturnType;
                    if (Provider.class.equals(rawType)) {
                        throw new IllegalStateException("@Provides method must not return Provider directly: " + cls.getName() + "." + method.getName());
                    } else if (Lazy.class.equals(rawType)) {
                        throw new IllegalStateException("@Provides method must not return Lazy directly: " + cls.getName() + "." + method.getName());
                    } else {
                        String b = dka.b(genericReturnType, method.getAnnotations(), method);
                        int i = AnonymousClass1.a[provides.type().ordinal()];
                        if (i == 1) {
                            map.put(b, new ProviderMethodBinding(method, b, this.g, this.f));
                        } else if (i != 2) {
                            throw new AssertionError("Unknown @Provides type " + provides.type());
                        } else {
                            SetBinding.a(map, dka.a(method.getGenericReturnType(), method.getAnnotations(), method), new ProviderMethodBinding(method, b, this.g, this.f));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: dagger.internal.plugins.reflect.ReflectiveModuleAdapter$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Provides.Type.values().length];
            a = iArr;
            try {
                iArr[Provides.Type.UNIQUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Provides.Type.SET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // defpackage.dkc
    public final Object a() {
        try {
            Constructor<?> declaredConstructor = this.h.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(new Object[0]);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InstantiationException e) {
            throw new IllegalArgumentException("Failed to construct " + this.h.getName(), e);
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Could not construct " + this.h.getName() + " as it lacks an accessible no-args constructor. This module must be passed in as an instance, or an accessible no-args constructor must be added.", e2);
        } catch (InvocationTargetException e3) {
            throw new IllegalArgumentException(e3.getCause());
        }
    }

    /* loaded from: classes2.dex */
    final class ProviderMethodBinding<T> extends djz<T> {
        private djz<?>[] f;
        private final Method g;
        private final Object h;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public ProviderMethodBinding(java.lang.reflect.Method r4, java.lang.String r5, java.lang.Object r6, boolean r7) {
            /*
                r2 = this;
                dagger.internal.plugins.reflect.ReflectiveModuleAdapter.this = r3
                java.lang.Class<javax.inject.Singleton> r0 = javax.inject.Singleton.class
                boolean r0 = r4.isAnnotationPresent(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.Class<?> r3 = r3.h
                java.lang.String r3 = r3.getName()
                r1.append(r3)
                java.lang.String r3 = "."
                r1.append(r3)
                java.lang.String r3 = r4.getName()
                r1.append(r3)
                java.lang.String r3 = "()"
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r1 = 0
                r2.<init>(r5, r1, r0, r3)
                r2.g = r4
                r2.h = r6
                r3 = 1
                r4.setAccessible(r3)
                r2.c(r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: dagger.internal.plugins.reflect.ReflectiveModuleAdapter.ProviderMethodBinding.<init>(dagger.internal.plugins.reflect.ReflectiveModuleAdapter, java.lang.reflect.Method, java.lang.String, java.lang.Object, boolean):void");
        }

        @Override // defpackage.djz
        public final void a(Linker linker) {
            Type[] genericParameterTypes = this.g.getGenericParameterTypes();
            Annotation[][] parameterAnnotations = this.g.getParameterAnnotations();
            this.f = new djz[genericParameterTypes.length];
            for (int i = 0; i < this.f.length; i++) {
                Type type = genericParameterTypes[i];
                Annotation[] annotationArr = parameterAnnotations[i];
                this.f[i] = linker.a(dka.b(type, annotationArr, this.g + " parameter " + i), this.g);
            }
        }

        @Override // defpackage.djz, javax.inject.Provider
        public final T get() {
            Object[] objArr = new Object[this.f.length];
            int i = 0;
            while (true) {
                djz<?>[] djzVarArr = this.f;
                if (i < djzVarArr.length) {
                    objArr[i] = djzVarArr[i].get();
                    i++;
                } else {
                    try {
                        return (T) this.g.invoke(this.h, objArr);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e2) {
                        Throwable cause = e2.getCause();
                        if (!(cause instanceof RuntimeException)) {
                            throw new RuntimeException(cause);
                        }
                        throw ((RuntimeException) cause);
                    }
                }
            }
        }

        @Override // defpackage.djz
        public final void a(Set<djz<?>> set, Set<djz<?>> set2) {
            for (djz<?> djzVar : this.f) {
                set.add(djzVar);
            }
        }

        @Override // defpackage.djz, dagger.MembersInjector
        public final void injectMembers(T t) {
            throw new AssertionError("Provides method bindings are not MembersInjectors");
        }

        @Override // defpackage.djz
        public final String toString() {
            return this.g.toString();
        }
    }
}
