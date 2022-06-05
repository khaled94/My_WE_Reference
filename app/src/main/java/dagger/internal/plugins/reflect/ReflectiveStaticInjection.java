package dagger.internal.plugins.reflect;

import dagger.internal.Linker;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public final class ReflectiveStaticInjection extends dkg {
    private final Field[] a;
    private djz<?>[] b;

    public ReflectiveStaticInjection(Field[] fieldArr) {
        this.a = fieldArr;
    }

    @Override // defpackage.dkg
    public final void a(Linker linker) {
        this.b = new djz[this.a.length];
        int i = 0;
        while (true) {
            Field[] fieldArr = this.a;
            if (i < fieldArr.length) {
                Field field = fieldArr[i];
                this.b[i] = linker.a(dka.b(field.getGenericType(), field.getAnnotations(), field), (Object) field, true);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.dkg
    public final void a() {
        for (int i = 0; i < this.a.length; i++) {
            try {
                this.a[i].set(null, this.b[i].get());
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }
}
