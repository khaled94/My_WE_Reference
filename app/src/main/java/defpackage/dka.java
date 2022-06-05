package defpackage;

import dagger.Lazy;
import dagger.MembersInjector;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Set;
import javax.inject.Provider;
import javax.inject.Qualifier;

/* renamed from: dka  reason: default package */
/* loaded from: classes2.dex */
public final class dka {
    private static final String a = Provider.class.getCanonicalName() + "<";
    private static final String b = MembersInjector.class.getCanonicalName() + "<";
    private static final String c = Lazy.class.getCanonicalName() + "<";
    private static final String d = Set.class.getCanonicalName() + "<";
    private static final dkb<Class<? extends Annotation>, Boolean> e = new dkb<Class<? extends Annotation>, Boolean>() { // from class: dka.1
        @Override // defpackage.dkb
        protected final /* synthetic */ Boolean a(Class<? extends Annotation> cls) {
            return Boolean.valueOf(cls.isAnnotationPresent(Qualifier.class));
        }
    };

    dka() {
    }

    public static String a(Type type) {
        return a(type, (Annotation) null);
    }

    public static String a(Class<?> cls) {
        return "members/" + a(cls, (Annotation) null);
    }

    private static String a(Type type, Annotation annotation) {
        Type b2 = b(type);
        if (annotation == null && (b2 instanceof Class)) {
            Class cls = (Class) b2;
            if (!cls.isArray()) {
                return cls.getName();
            }
        }
        StringBuilder sb = new StringBuilder();
        if (annotation != null) {
            sb.append(annotation);
            sb.append("/");
        }
        a(b2, sb, true);
        return sb.toString();
    }

    public static String a(Type type, Annotation[] annotationArr, Object obj) {
        Annotation a2 = a(annotationArr, obj);
        Type b2 = b(type);
        StringBuilder sb = new StringBuilder();
        if (a2 != null) {
            sb.append(a2);
            sb.append("/");
        }
        sb.append(d);
        a(b2, sb, true);
        sb.append(">");
        return sb.toString();
    }

    public static String b(Type type, Annotation[] annotationArr, Object obj) {
        return a(type, a(annotationArr, obj));
    }

    private static Annotation a(Annotation[] annotationArr, Object obj) {
        Annotation annotation = null;
        for (Annotation annotation2 : annotationArr) {
            if (e.b(annotation2.annotationType()).booleanValue()) {
                if (annotation != null) {
                    throw new IllegalArgumentException("Too many qualifier annotations on ".concat(String.valueOf(obj)));
                }
                annotation = annotation2;
            }
        }
        return annotation;
    }

    private static void a(Type type, StringBuilder sb, boolean z) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                a((Type) cls.getComponentType(), sb, false);
                sb.append("[]");
            } else if (!cls.isPrimitive()) {
                sb.append(cls.getName());
            } else if (z) {
                throw new UnsupportedOperationException("Uninjectable type ".concat(String.valueOf(type)));
            } else {
                sb.append(cls.getName());
            }
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            a(parameterizedType.getRawType(), sb, true);
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            sb.append("<");
            for (int i = 0; i < actualTypeArguments.length; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                a(actualTypeArguments[i], sb, true);
            }
            sb.append(">");
        } else if (type instanceof GenericArrayType) {
            a(((GenericArrayType) type).getGenericComponentType(), sb, false);
            sb.append("[]");
        } else {
            throw new UnsupportedOperationException("Uninjectable type ".concat(String.valueOf(type)));
        }
    }

    public static String a(String str) {
        int f = f(str);
        if (a(str, f, a)) {
            return a(str, f, str.substring(0, f), a);
        }
        if (!a(str, f, b)) {
            return null;
        }
        return a(str, f, "members/", b);
    }

    public static String b(String str) {
        int f = f(str);
        if (a(str, f, c)) {
            return a(str, f, str.substring(0, f), c);
        }
        return null;
    }

    private static int f(String str) {
        if (str.startsWith("@")) {
            return str.lastIndexOf(47) + 1;
        }
        return 0;
    }

    private static String a(String str, int i, String str2, String str3) {
        return str2 + str.substring(i + str3.length(), str.length() - 1);
    }

    private static boolean a(String str, int i, String str2) {
        return str.regionMatches(i, str2, 0, str2.length());
    }

    public static boolean c(String str) {
        return str.startsWith("@");
    }

    public static String d(String str) {
        int lastIndexOf = (str.startsWith("@") || str.startsWith("members/")) ? str.lastIndexOf(47) + 1 : 0;
        if (str.indexOf(60, lastIndexOf) == -1 && str.indexOf(91, lastIndexOf) == -1) {
            return str.substring(lastIndexOf);
        }
        return null;
    }

    public static boolean e(String str) {
        return str.startsWith("java.") || str.startsWith("javax.") || str.startsWith("android.");
    }

    private static Type b(Type type) {
        return type == Byte.TYPE ? Byte.class : type == Short.TYPE ? Short.class : type == Integer.TYPE ? Integer.class : type == Long.TYPE ? Long.class : type == Character.TYPE ? Character.class : type == Boolean.TYPE ? Boolean.class : type == Float.TYPE ? Float.class : type == Double.TYPE ? Double.class : type == Void.TYPE ? Void.class : type;
    }
}
