package defpackage;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: bet  reason: default package */
/* loaded from: classes2.dex */
final class bet implements PrivilegedExceptionAction<Unsafe> {
    @Override // java.security.PrivilegedExceptionAction
    public final /* synthetic */ Unsafe run() throws Exception {
        Field[] declaredFields;
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        return null;
    }
}
