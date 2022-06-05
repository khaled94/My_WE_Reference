package defpackage;

import java.util.Arrays;

/* renamed from: ees  reason: default package */
/* loaded from: classes2.dex */
public abstract class ees {
    private final int a;
    @Deprecated
    protected final byte b;
    protected final byte c;
    protected final int d;
    private final int e;
    private final int f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(byte[] bArr, int i, int i2, a aVar);

    protected abstract boolean a(byte b);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ees$a */
    /* loaded from: classes2.dex */
    public static class a {
        int a;
        long b;
        byte[] c;
        int d;
        int e;
        boolean f;
        int g;
        int h;

        public final String toString() {
            return String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", getClass().getSimpleName(), Arrays.toString(this.c), Integer.valueOf(this.g), Boolean.valueOf(this.f), Integer.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.h), Integer.valueOf(this.d), Integer.valueOf(this.e));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ees(int i) {
        this(0, i);
    }

    private ees(int i, int i2) {
        this.b = (byte) 61;
        this.a = 3;
        this.e = 4;
        this.d = 0;
        this.f = i2;
        this.c = (byte) 61;
    }

    private static byte[] a(a aVar) {
        if (aVar.c == null) {
            aVar.c = new byte[8192];
            aVar.d = 0;
            aVar.e = 0;
        } else {
            byte[] bArr = new byte[aVar.c.length * 2];
            System.arraycopy(aVar.c, 0, bArr, 0, aVar.c.length);
            aVar.c = bArr;
        }
        return aVar.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] a(int i, a aVar) {
        if (aVar.c == null || aVar.c.length < aVar.d + i) {
            return a(aVar);
        }
        return aVar.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean b(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b : bArr) {
            if (this.c == b || a(b)) {
                return true;
            }
        }
        return false;
    }

    public final long c(byte[] bArr) {
        int length = bArr.length;
        int i = this.a;
        long j = (((length + i) - 1) / i) * this.e;
        int i2 = this.d;
        return i2 > 0 ? j + ((((i2 + j) - 1) / i2) * this.f) : j;
    }
}
