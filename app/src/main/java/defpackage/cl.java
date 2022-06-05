package defpackage;

import java.security.MessageDigest;

/* renamed from: cl  reason: default package */
/* loaded from: classes2.dex */
public final class cl<T> {
    private static final a<Object> e = new a<Object>() { // from class: cl.1
        @Override // defpackage.cl.a
        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    };
    final T a;
    final a<T> b;
    final String c;
    volatile byte[] d;

    /* renamed from: cl$a */
    /* loaded from: classes2.dex */
    public interface a<T> {
        void a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    public static <T> cl<T> a(String str) {
        return new cl<>(str, null, e);
    }

    public static <T> cl<T> a(String str, T t) {
        return new cl<>(str, t, e);
    }

    public static <T> cl<T> a(String str, T t, a<T> aVar) {
        return new cl<>(str, t, aVar);
    }

    private cl(String str, T t, a<T> aVar) {
        this.c = lf.a(str);
        this.a = t;
        this.b = (a) lf.a(aVar, "Argument must not be null");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cl) {
            return this.c.equals(((cl) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "Option{key='" + this.c + "'}";
    }
}
