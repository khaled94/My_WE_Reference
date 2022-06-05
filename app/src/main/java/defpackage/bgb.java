package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: bgb  reason: default package */
/* loaded from: classes2.dex */
public abstract class bgb implements Serializable, Iterable<Byte> {
    private static final bbe a;
    public static final bgb b = new bbi(bcd.b);
    private static final Comparator<bgb> d;
    int c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int a(byte b2) {
        return b2 & 255;
    }

    public abstract byte a(int i);

    public abstract int a();

    protected abstract int a(int i, int i2);

    protected abstract String a(Charset charset);

    public abstract void a(bfy bfyVar) throws IOException;

    protected abstract void a(byte[] bArr, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte b(int i);

    public abstract boolean b();

    public abstract bgb c(int i);

    public abstract boolean equals(Object obj);

    public static bgb a(byte[] bArr, int i, int i2) {
        a(i, i + i2, bArr.length);
        return new bbi(a.a(bArr, i, i2));
    }

    public static bgb a(String str) {
        return new bbi(str.getBytes(bcd.a));
    }

    public final byte[] d() {
        int a2 = a();
        if (a2 == 0) {
            return bcd.b;
        }
        byte[] bArr = new byte[a2];
        a(bArr, a2);
        return bArr;
    }

    public final String e() {
        return a() == 0 ? "" : a(bcd.a);
    }

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            int a2 = a();
            i = a(a2, a2);
            if (i == 0) {
                i = 1;
            }
            this.c = i;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bbg d(int i) {
        return new bbg(i, (byte) 0);
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
        return new bga(this);
    }

    static {
        a = bfu.a() ? new bbh((byte) 0) : new bbc((byte) 0);
        d = new bgd();
    }
}
