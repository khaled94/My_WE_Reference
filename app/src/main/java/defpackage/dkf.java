package defpackage;

import dagger.ObjectGraph;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: dkf  reason: default package */
/* loaded from: classes2.dex */
public final class dkf implements dkd {
    private static final Logger a = Logger.getLogger(ObjectGraph.class.getName());
    private final dkd[] b;

    public dkf(dkd... dkdVarArr) {
        this.b = dkdVarArr;
    }

    public static Map<Class<?>, dkc<?>> a(dkd dkdVar, Object[] objArr) {
        int i;
        int length = objArr.length;
        dkc[] dkcVarArr = new dkc[length];
        int i2 = 0;
        for (Object obj : objArr) {
            if (obj instanceof Class) {
                i = i2 + 1;
                dkcVarArr[i2] = dkdVar.a((Class) obj, null);
            } else {
                i = i2 + 1;
                dkcVarArr[i2] = dkdVar.a(obj.getClass(), obj);
            }
            i2 = i;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i3 = 0; i3 < length; i3++) {
            dkc dkcVar = dkcVarArr[i3];
            linkedHashMap.put(dkcVar.b().getClass(), dkcVar);
        }
        for (int i4 = 0; i4 < length; i4++) {
            a(dkdVar, dkcVarArr[i4], linkedHashMap);
        }
        return linkedHashMap;
    }

    private static void a(dkd dkdVar, dkc<?> dkcVar, Map<Class<?>, dkc<?>> map) {
        Class<?>[] clsArr;
        for (Class<?> cls : dkcVar.d) {
            if (!map.containsKey(cls)) {
                dkc<?> a2 = dkdVar.a(cls, null);
                map.put(cls, a2);
                a(dkdVar, a2, map);
            }
        }
    }

    @Override // defpackage.dkd
    public final <T> dkc<T> a(Class<? extends T> cls, T t) {
        int i = 0;
        while (true) {
            dkd[] dkdVarArr = this.b;
            if (i < dkdVarArr.length) {
                try {
                    dkc<T> a2 = dkdVarArr[i].a(cls, t);
                    a2.g = t != null ? t : a2.a();
                    return a2;
                } catch (RuntimeException e) {
                    if (i == this.b.length - 1) {
                        throw e;
                    }
                    a("Module adapter", cls.getName(), e);
                    i++;
                }
            } else {
                throw new AssertionError();
            }
        }
    }

    @Override // defpackage.dkd
    public final djz<?> a(String str, String str2, boolean z) {
        int i = 0;
        while (true) {
            dkd[] dkdVarArr = this.b;
            if (i < dkdVarArr.length) {
                try {
                    return dkdVarArr[i].a(str, str2, z);
                } catch (RuntimeException e) {
                    if (i == this.b.length - 1) {
                        throw e;
                    }
                    a("Binding", str2, e);
                    i++;
                }
            } else {
                throw new AssertionError();
            }
        }
    }

    @Override // defpackage.dkd
    public final dkg a(Class<?> cls) {
        int i = 0;
        while (true) {
            dkd[] dkdVarArr = this.b;
            if (i < dkdVarArr.length) {
                try {
                    return dkdVarArr[i].a(cls);
                } catch (RuntimeException e) {
                    if (i == this.b.length - 1) {
                        throw e;
                    }
                    a("Static injection", cls.getName(), e);
                    i++;
                }
            } else {
                throw new AssertionError();
            }
        }
    }

    private static void a(String str, String str2, RuntimeException runtimeException) {
        if (a.isLoggable(Level.FINE)) {
            a.log(Level.FINE, String.format("%s for %s not found.", str, str2), (Throwable) runtimeException);
        }
    }
}
