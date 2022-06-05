package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: cdm  reason: default package */
/* loaded from: classes2.dex */
public final class cdm {
    public static final Charset a = Charset.forName("UTF-8");
    static final Charset b = Charset.forName("ISO-8859-1");
    public static final byte[] c;
    public static final ByteBuffer d;
    public static final ccv e;

    /* renamed from: cdm$a */
    /* loaded from: classes2.dex */
    public interface a extends i {
    }

    /* renamed from: cdm$b */
    /* loaded from: classes2.dex */
    public interface b extends i {
    }

    /* renamed from: cdm$c */
    /* loaded from: classes2.dex */
    public interface c {
        int getNumber();
    }

    /* renamed from: cdm$d */
    /* loaded from: classes2.dex */
    public interface d<T extends c> {
        T a(int i);
    }

    /* renamed from: cdm$e */
    /* loaded from: classes2.dex */
    public interface e {
        boolean a(int i);
    }

    /* renamed from: cdm$f */
    /* loaded from: classes2.dex */
    public interface f extends i {
    }

    /* renamed from: cdm$g */
    /* loaded from: classes2.dex */
    public interface g extends i {
    }

    /* renamed from: cdm$h */
    /* loaded from: classes2.dex */
    public interface h extends i {
    }

    /* renamed from: cdm$i */
    /* loaded from: classes2.dex */
    public interface i<E> extends List<E>, RandomAccess {
        i<E> a(int i);

        boolean a();

        void b();
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    private cdm() {
    }

    static {
        byte[] bArr = new byte[0];
        c = bArr;
        d = ByteBuffer.wrap(bArr);
        byte[] bArr2 = c;
        e = ccv.a(bArr2, 0, bArr2.length, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static boolean a(byte[] bArr) {
        return cfe.a(bArr);
    }

    public static String b(byte[] bArr) {
        return new String(bArr, a);
    }

    public static int c(byte[] bArr) {
        int length = bArr.length;
        int a2 = a(length, bArr, 0, length);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object a(Object obj, Object obj2) {
        return ((cec) obj).q().a((cec) obj2).f();
    }
}
