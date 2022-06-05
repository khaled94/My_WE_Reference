package defpackage;

import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* renamed from: ccu  reason: default package */
/* loaded from: classes2.dex */
public abstract class ccu implements Serializable, Iterable<Byte> {
    public static final ccu a = new h(cdm.c);
    private static final d c;
    private static final Comparator<ccu> d;
    int b = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ccu$d */
    /* loaded from: classes2.dex */
    public interface d {
        byte[] a(byte[] bArr, int i, int i2);
    }

    /* renamed from: ccu$e */
    /* loaded from: classes2.dex */
    public interface e extends Iterator<Byte> {
        byte a();
    }

    static /* synthetic */ int a(byte b2) {
        return b2 & 255;
    }

    public abstract byte a(int i2);

    protected abstract int a(int i2, int i3);

    protected abstract String a(Charset charset);

    public abstract void a(cct cctVar) throws IOException;

    protected abstract void a(byte[] bArr, int i2);

    abstract byte b(int i2);

    public abstract int b();

    public abstract ccu c(int i2);

    public abstract boolean e();

    public abstract boolean equals(Object obj);

    public abstract ccv f();

    static {
        c = ccp.a() ? new i((byte) 0) : new b((byte) 0);
        d = new Comparator<ccu>() { // from class: ccu.2
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(ccu ccuVar, ccu ccuVar2) {
                ccu ccuVar3 = ccuVar;
                ccu ccuVar4 = ccuVar2;
                e it = ccuVar3.iterator();
                e it2 = ccuVar4.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    int compare = Integer.compare(ccu.a(it.a()), ccu.a(it2.a()));
                    if (compare != 0) {
                        return compare;
                    }
                }
                return Integer.compare(ccuVar3.b(), ccuVar4.b());
            }
        };
    }

    /* renamed from: ccu$i */
    /* loaded from: classes2.dex */
    static final class i implements d {
        private i() {
        }

        /* synthetic */ i(byte b) {
            this();
        }

        @Override // defpackage.ccu.d
        public final byte[] a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    /* renamed from: ccu$b */
    /* loaded from: classes2.dex */
    static final class b implements d {
        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        @Override // defpackage.ccu.d
        public final byte[] a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    ccu() {
    }

    /* renamed from: a */
    public final e iterator() {
        return new a() { // from class: ccu.1
            private int b = 0;
            private final int c;

            {
                this.c = ccu.this.b();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.b < this.c;
            }

            @Override // defpackage.ccu.e
            public final byte a() {
                int i2 = this.b;
                if (i2 >= this.c) {
                    throw new NoSuchElementException();
                }
                this.b = i2 + 1;
                return ccu.this.b(i2);
            }
        };
    }

    /* renamed from: ccu$a */
    /* loaded from: classes2.dex */
    static abstract class a implements e {
        a() {
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public /* synthetic */ Byte next() {
            return Byte.valueOf(a());
        }
    }

    public static ccu a(byte[] bArr, int i2, int i3) {
        a(i2, i2 + i3, bArr.length);
        return new h(c.a(bArr, i2, i3));
    }

    public static ccu a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ccu b(byte[] bArr) {
        return new h(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ccu b(byte[] bArr, int i2, int i3) {
        return new c(bArr, i2, i3);
    }

    public static ccu a(String str) {
        return new h(str.getBytes(cdm.a));
    }

    public final byte[] c() {
        int b2 = b();
        if (b2 == 0) {
            return cdm.c;
        }
        byte[] bArr = new byte[b2];
        a(bArr, b2);
        return bArr;
    }

    public final String d() {
        return b() == 0 ? "" : a(cdm.a);
    }

    /* renamed from: ccu$g */
    /* loaded from: classes2.dex */
    static abstract class g extends ccu {
        g() {
        }
    }

    public final int hashCode() {
        int i2 = this.b;
        if (i2 == 0) {
            int b2 = b();
            i2 = a(b2, b2);
            if (i2 == 0) {
                i2 = 1;
            }
            this.b = i2;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f d(int i2) {
        return new f(i2, (byte) 0);
    }

    /* renamed from: ccu$f */
    /* loaded from: classes2.dex */
    static final class f {
        final CodedOutputStream a;
        private final byte[] b;

        /* synthetic */ f(int i, byte b) {
            this(i);
        }

        private f(int i) {
            byte[] bArr = new byte[i];
            this.b = bArr;
            this.a = CodedOutputStream.a(bArr);
        }

        public final ccu a() {
            this.a.i();
            return new h(this.b);
        }
    }

    static int a(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) < 0) {
            if (i2 < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + i2 + " < 0");
            } else if (i3 < i2) {
                throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i2 + ", " + i3);
            } else {
                throw new IndexOutOfBoundsException("End index: " + i3 + " >= " + i4);
            }
        }
        return i5;
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(b());
        if (b() <= 50) {
            str = cey.a(this);
        } else {
            str = cey.a(c(47)) + "...";
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ccu$h */
    /* loaded from: classes2.dex */
    public static class h extends g {
        protected final byte[] c;

        protected int g() {
            return 0;
        }

        h(byte[] bArr) {
            if (bArr == null) {
                throw null;
            }
            this.c = bArr;
        }

        @Override // defpackage.ccu
        public byte a(int i) {
            return this.c[i];
        }

        @Override // defpackage.ccu
        byte b(int i) {
            return this.c[i];
        }

        @Override // defpackage.ccu
        public int b() {
            return this.c.length;
        }

        @Override // defpackage.ccu
        public final ccu c(int i) {
            int a = a(0, i, b());
            if (a == 0) {
                return ccu.a;
            }
            return new c(this.c, g() + 0, a);
        }

        @Override // defpackage.ccu
        protected void a(byte[] bArr, int i) {
            System.arraycopy(this.c, 0, bArr, 0, i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.ccu
        public final void a(cct cctVar) throws IOException {
            cctVar.a(this.c, g(), b());
        }

        @Override // defpackage.ccu
        protected final String a(Charset charset) {
            return new String(this.c, g(), b(), charset);
        }

        @Override // defpackage.ccu
        public final boolean e() {
            int g = g();
            return cfe.a(this.c, g, b() + g);
        }

        @Override // defpackage.ccu
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ccu) || b() != ((ccu) obj).b()) {
                return false;
            }
            if (b() == 0) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                int i = this.b;
                int i2 = hVar.b;
                if (i != 0 && i2 != 0 && i != i2) {
                    return false;
                }
                int b = b();
                if (b > hVar.b()) {
                    throw new IllegalArgumentException("Length too large: " + b + b());
                }
                int i3 = b + 0;
                if (i3 > hVar.b()) {
                    throw new IllegalArgumentException("Ran off end of other: 0, " + b + ", " + hVar.b());
                } else if (hVar instanceof h) {
                    h hVar2 = hVar;
                    byte[] bArr = this.c;
                    byte[] bArr2 = hVar2.c;
                    int g = g() + b;
                    int g2 = g();
                    int g3 = hVar2.g() + 0;
                    while (g2 < g) {
                        if (bArr[g2] != bArr2[g3]) {
                            return false;
                        }
                        g2++;
                        g3++;
                    }
                    return true;
                } else {
                    return hVar.c(i3).equals(c(b));
                }
            }
            return obj.equals(this);
        }

        @Override // defpackage.ccu
        protected final int a(int i, int i2) {
            return cdm.a(i, this.c, g() + 0, i2);
        }

        @Override // defpackage.ccu
        public final ccv f() {
            return ccv.a(this.c, g(), b(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ccu$c */
    /* loaded from: classes2.dex */
    public static final class c extends h {
        private final int d;
        private final int e;

        c(byte[] bArr, int i, int i2) {
            super(bArr);
            a(i, i + i2, bArr.length);
            this.d = i;
            this.e = i2;
        }

        @Override // defpackage.ccu.h, defpackage.ccu
        final byte b(int i) {
            return this.c[this.d + i];
        }

        @Override // defpackage.ccu.h, defpackage.ccu
        public final int b() {
            return this.e;
        }

        @Override // defpackage.ccu.h
        protected final int g() {
            return this.d;
        }

        @Override // defpackage.ccu.h, defpackage.ccu
        protected final void a(byte[] bArr, int i) {
            System.arraycopy(this.c, this.d + 0, bArr, 0, i);
        }

        final Object writeReplace() {
            return ccu.b(c());
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // defpackage.ccu.h, defpackage.ccu
        public final byte a(int i) {
            int i2 = this.e;
            if (((i2 - (i + 1)) | i) < 0) {
                if (i < 0) {
                    throw new ArrayIndexOutOfBoundsException("Index < 0: ".concat(String.valueOf(i)));
                }
                throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
            }
            return this.c[this.d + i];
        }
    }
}
