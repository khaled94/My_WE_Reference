package dagger.internal.plugins.reflect;

import dagger.internal.Linker;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ReflectiveAtInjectBinding<T> extends djz<T> {
    private final Field[] e;
    private final Constructor<T> f;
    private final Class<?> g;
    private final String[] h;
    private final djz<?>[] i;
    private final djz<?>[] j;
    private djz<? super T> k;

    private ReflectiveAtInjectBinding(String str, String str2, boolean z, Class<?> cls, Field[] fieldArr, Constructor<T> constructor, int i, Class<?> cls2, String[] strArr) {
        super(str, str2, z, cls);
        this.f = constructor;
        this.e = fieldArr;
        this.g = cls2;
        this.h = strArr;
        this.j = new djz[i];
        this.i = new djz[fieldArr.length];
    }

    @Override // defpackage.djz
    public final void a(Linker linker) {
        int i = 0;
        int i2 = 0;
        while (true) {
            Field[] fieldArr = this.e;
            if (i >= fieldArr.length) {
                break;
            }
            djz<?>[] djzVarArr = this.i;
            if (djzVarArr[i] == null) {
                djzVarArr[i] = linker.a(this.h[i2], (Object) fieldArr[i], true);
            }
            i2++;
            i++;
        }
        if (this.f != null) {
            int i3 = 0;
            while (true) {
                djz<?>[] djzVarArr2 = this.j;
                if (i3 >= djzVarArr2.length) {
                    break;
                }
                if (djzVarArr2[i3] == null) {
                    djzVarArr2[i3] = linker.a(this.h[i2], (Object) this.f, true);
                }
                i2++;
                i3++;
            }
        }
        if (this.g == null || this.k != null) {
            return;
        }
        this.k = (djz<? super T>) linker.a(this.h[i2], (Object) this.c, false);
    }

    @Override // defpackage.djz, javax.inject.Provider
    public final T get() {
        if (this.f == null) {
            throw new UnsupportedOperationException();
        }
        Object[] objArr = new Object[this.j.length];
        int i = 0;
        while (true) {
            djz<?>[] djzVarArr = this.j;
            if (i < djzVarArr.length) {
                objArr[i] = djzVarArr[i].get();
                i++;
            } else {
                try {
                    T newInstance = this.f.newInstance(objArr);
                    injectMembers(newInstance);
                    return newInstance;
                } catch (IllegalAccessException e) {
                    throw new AssertionError(e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException(e2);
                } catch (InvocationTargetException e3) {
                    Throwable cause = e3.getCause();
                    if (!(cause instanceof RuntimeException)) {
                        throw new RuntimeException(cause);
                    }
                    throw ((RuntimeException) cause);
                }
            }
        }
    }

    @Override // defpackage.djz, dagger.MembersInjector
    public final void injectMembers(T t) {
        for (int i = 0; i < this.e.length; i++) {
            try {
                this.e[i].set(t, this.i[i].get());
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
        if (this.k != null) {
            this.k.injectMembers(t);
        }
    }

    @Override // defpackage.djz
    public final void a(Set<djz<?>> set, Set<djz<?>> set2) {
        djz<?>[] djzVarArr = this.j;
        if (djzVarArr != null) {
            Collections.addAll(set, djzVarArr);
        }
        Collections.addAll(set2, this.i);
        djz<? super T> djzVar = this.k;
        if (djzVar != null) {
            set2.add(djzVar);
        }
    }

    @Override // defpackage.djz
    public final String toString() {
        return this.b != null ? this.b : this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> defpackage.djz<T> a(java.lang.Class<T> r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dagger.internal.plugins.reflect.ReflectiveAtInjectBinding.a(java.lang.Class, boolean):djz");
    }
}
