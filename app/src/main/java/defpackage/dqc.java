package defpackage;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* renamed from: dqc  reason: default package */
/* loaded from: classes2.dex */
public class dqc {
    public static int a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    private dqc() {
    }

    public static String a(String str, Object obj) {
        return str + obj;
    }

    public static void a() {
        throw ((KotlinNullPointerException) a(new KotlinNullPointerException()));
    }

    public static void a(String str) {
        throw ((UninitializedPropertyAccessException) a(new UninitializedPropertyAccessException("lateinit property " + str + " has not been initialized")));
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) a(new IllegalStateException(str + " must not be null")));
    }

    public static void b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) a(new NullPointerException(str + " must not be null")));
    }

    private static String b(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean a(Double d) {
        return d != null && d.doubleValue() == -1.0d;
    }

    public static boolean a(Float f, float f2) {
        return f != null && f.floatValue() == f2;
    }

    private static <T extends Throwable> T a(T t) {
        return (T) a((Throwable) t, dqc.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends Throwable> T a(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    public static void a(Object obj) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) a(new NullPointerException()));
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalArgumentException) a(new IllegalArgumentException(b(str))));
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) a(new NullPointerException(b(str))));
    }

    public static void b() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }
}
