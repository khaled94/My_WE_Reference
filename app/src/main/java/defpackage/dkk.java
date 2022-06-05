package defpackage;

import dagger.Module;
import dagger.internal.plugins.reflect.ReflectiveAtInjectBinding;
import dagger.internal.plugins.reflect.ReflectiveModuleAdapter;
import dagger.internal.plugins.reflect.ReflectiveStaticInjection;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import javax.inject.Inject;

/* renamed from: dkk  reason: default package */
/* loaded from: classes2.dex */
public final class dkk implements dkd {
    @Override // defpackage.dkd
    public final djz<?> a(String str, String str2, boolean z) {
        try {
            Class<?> cls = Class.forName(str2);
            if (!cls.isInterface()) {
                return ReflectiveAtInjectBinding.a(cls, z);
            }
            return null;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.dkd
    public final <T> dkc<T> a(Class<? extends T> cls, T t) {
        Module module = (Module) cls.getAnnotation(Module.class);
        if (module == null) {
            throw new IllegalArgumentException("No @Module on " + cls.getName());
        } else if (cls.getSuperclass() != Object.class) {
            throw new IllegalArgumentException("Modules must not extend from other classes: " + cls.getName());
        } else {
            return new ReflectiveModuleAdapter(cls, module);
        }
    }

    @Override // defpackage.dkd
    public final dkg a(Class<?> cls) {
        Field[] declaredFields;
        ArrayList arrayList = new ArrayList();
        for (Field field : cls.getDeclaredFields()) {
            if (Modifier.isStatic(field.getModifiers()) && field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                arrayList.add(field);
            }
        }
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("No static injections: " + cls.getName());
        }
        return new ReflectiveStaticInjection((Field[]) arrayList.toArray(new Field[arrayList.size()]));
    }
}
