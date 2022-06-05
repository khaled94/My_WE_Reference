package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: bya  reason: default package */
/* loaded from: classes2.dex */
public final class bya<P> {
    final ConcurrentMap<b, List<a<P>>> a = new ConcurrentHashMap();
    public a<P> b;
    final Class<P> c;

    /* renamed from: bya$a */
    /* loaded from: classes2.dex */
    public static final class a<P> {
        public final P a;
        final cbo b;
        public final ccf c;
        private final byte[] d;
        private final int e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(P p, byte[] bArr, cbo cboVar, ccf ccfVar, int i) {
            this.a = p;
            this.d = Arrays.copyOf(bArr, bArr.length);
            this.b = cboVar;
            this.c = ccfVar;
            this.e = i;
        }

        public final byte[] a() {
            byte[] bArr = this.d;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }
    }

    public final List<a<P>> a(byte[] bArr) {
        List<a<P>> list = this.a.get(new b(bArr, (byte) 0));
        return list != null ? list : Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bya(Class<P> cls) {
        this.c = cls;
    }

    /* renamed from: bya$b */
    /* loaded from: classes2.dex */
    static class b implements Comparable<b> {
        private final byte[] a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public /* synthetic */ b(byte[] bArr, byte b) {
            this(bArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(b bVar) {
            int i;
            int i2;
            b bVar2 = bVar;
            byte[] bArr = this.a;
            int length = bArr.length;
            byte[] bArr2 = bVar2.a;
            if (length != bArr2.length) {
                i = bArr.length;
                i2 = bArr2.length;
            } else {
                int i3 = 0;
                while (true) {
                    byte[] bArr3 = this.a;
                    if (i3 >= bArr3.length) {
                        return 0;
                    }
                    char c = bArr3[i3];
                    byte[] bArr4 = bVar2.a;
                    if (c != bArr4[i3]) {
                        i = bArr3[i3];
                        i2 = bArr4[i3];
                        break;
                    }
                    i3++;
                }
            }
            return i - i2;
        }

        private b(byte[] bArr) {
            this.a = Arrays.copyOf(bArr, bArr.length);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.a);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            return Arrays.equals(this.a, ((b) obj).a);
        }

        public final String toString() {
            return cge.a(this.a);
        }
    }
}
