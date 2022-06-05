package defpackage;

import android.os.IBinder;
import defpackage.afn;
import java.lang.reflect.Field;

/* renamed from: afp  reason: default package */
/* loaded from: classes.dex */
public final class afp<T> extends afn.a {
    private final T a;

    private afp(T t) {
        this.a = t;
    }

    public static <T> afn a(T t) {
        return new afp(t);
    }

    public static <T> T a(afn afnVar) {
        if (afnVar instanceof afp) {
            return ((afp) afnVar).a;
        }
        IBinder asBinder = afnVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            aat.a(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return (T) field.get(asBinder);
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                } catch (NullPointerException e2) {
                    throw new IllegalArgumentException("Binder object is null.", e2);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        int length = declaredFields.length;
        StringBuilder sb = new StringBuilder(64);
        sb.append("Unexpected number of IObjectWrapper declared fields: ");
        sb.append(length);
        throw new IllegalArgumentException(sb.toString());
    }
}
