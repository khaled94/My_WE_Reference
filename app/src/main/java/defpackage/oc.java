package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007JC\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\n\u001a\u00020\u00062\u001e\u0010\u000b\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00040\f\"\b\u0012\u0002\b\u0003\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010\rJE\u0010\u000e\u001a\u0004\u0018\u00010\u00012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u000f\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseUtils;", "", "()V", "getClass", "Ljava/lang/Class;", "className", "", "getMethod", "Ljava/lang/reflect/Method;", "clazz", "methodName", "args", "", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "invokeMethod", "method", "obj", "(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: oc  reason: default package */
/* loaded from: classes2.dex */
public final class oc {
    public static final oc a = new oc();

    private oc() {
    }

    public static final Class<?> a(String str) {
        if (qx.a(oc.class)) {
            return null;
        }
        try {
            dqc.d(str, "className");
            try {
                return Class.forName(str);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th) {
            qx.a(th, oc.class);
            return null;
        }
    }

    public static final Method a(Class<?> cls, String str, Class<?>... clsArr) {
        if (qx.a(oc.class)) {
            return null;
        }
        try {
            dqc.d(cls, "clazz");
            dqc.d(str, "methodName");
            dqc.d(clsArr, "args");
            try {
                return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th) {
            qx.a(th, oc.class);
            return null;
        }
    }

    public static final Object a(Class<?> cls, Method method, Object obj, Object... objArr) {
        if (qx.a(oc.class)) {
            return null;
        }
        try {
            dqc.d(cls, "clazz");
            dqc.d(method, "method");
            dqc.d(objArr, "args");
            if (obj != null) {
                obj = cls.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th) {
            qx.a(th, oc.class);
            return null;
        }
    }
}
