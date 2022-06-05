package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: art  reason: default package */
/* loaded from: classes.dex */
public abstract class art implements Serializable, Iterable<Byte> {
    public static final art a = new asd(atb.b);
    private static final arz c;
    private static final Comparator<art> d;
    int b = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int a(byte b) {
        return b & 255;
    }

    public abstract byte a(int i);

    public abstract int a();

    protected abstract int a(int i, int i2);

    protected abstract String a(Charset charset);

    public abstract void a(arq arqVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte b(int i);

    public abstract art c(int i);

    public abstract boolean c();

    public abstract boolean equals(Object obj);

    public static art a(byte[] bArr, int i, int i2) {
        a(i, i + i2, bArr.length);
        return new asd(c.a(bArr, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static art a(byte[] bArr) {
        return new asd(bArr);
    }

    public static art a(String str) {
        return new asd(str.getBytes(atb.a));
    }

    public final String b() {
        return a() == 0 ? "" : a(atb.a);
    }

    public final int hashCode() {
        int i = this.b;
        if (i == 0) {
            int a2 = a();
            i = a(a2, a2);
            if (i == 0) {
                i = 1;
            }
            this.b = i;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static asb d(int i) {
        return new asb(i, (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Beginning index: ");
                sb.append(i);
                sb.append(" < 0");
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (i2 < i) {
                StringBuilder sb2 = new StringBuilder(66);
                sb2.append("Beginning index larger than ending index: ");
                sb2.append(i);
                sb2.append(", ");
                sb2.append(i2);
                throw new IndexOutOfBoundsException(sb2.toString());
            } else {
                StringBuilder sb3 = new StringBuilder(37);
                sb3.append("End index: ");
                sb3.append(i2);
                sb3.append(" >= ");
                sb3.append(i3);
                throw new IndexOutOfBoundsException(sb3.toString());
            }
        }
        return i4;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(a()));
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new ars(this);
    }

    static {
        c = arm.a() ? new asc((byte) 0) : new arx((byte) 0);
        d = new arv();
    }
}
