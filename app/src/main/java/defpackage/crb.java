package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: crb  reason: default package */
/* loaded from: classes2.dex */
public class crb<T> {
    public final Class<? super T> a;
    public final Type b;
    final int c;

    /* JADX INFO: Access modifiers changed from: protected */
    public crb() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        Type a = cql.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        this.b = a;
        this.a = (Class<? super T>) cql.b(a);
        this.c = this.b.hashCode();
    }

    private crb(Type type) {
        Type a = cql.a((Type) cqk.a(type));
        this.b = a;
        this.a = (Class<? super T>) cql.b(a);
        this.c = this.b.hashCode();
    }

    public final int hashCode() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof crb) && cql.a(this.b, ((crb) obj).b);
    }

    public final String toString() {
        return cql.c(this.b);
    }

    public static crb<?> a(Type type) {
        return new crb<>(type);
    }

    public static <T> crb<T> a(Class<T> cls) {
        return new crb<>(cls);
    }
}
