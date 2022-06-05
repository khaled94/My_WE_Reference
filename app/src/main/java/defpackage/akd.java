package defpackage;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: akd  reason: default package */
/* loaded from: classes.dex */
final class akd<K, V> extends ajx<K, V> {
    private static final ajx<Object, Object> a = new akd(null, new Object[0], 0);
    private final transient Object b;
    private final transient Object[] c;
    private final transient int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        r2[r7] = (byte) r4;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
        r2[r7] = (short) r4;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cb, code lost:
        r2[r8] = r4;
        r3 = r3 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [int[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <K, V> defpackage.akd<K, V> a(java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akd.a(java.lang.Object[]):akd");
    }

    private static IllegalArgumentException a(Object obj, Object obj2, Object[] objArr, int i) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i]);
        String valueOf4 = String.valueOf(objArr[i ^ 1]);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append("=");
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    private akd(Object obj, Object[] objArr, int i) {
        this.b = obj;
        this.c = objArr;
        this.d = i;
    }

    @Override // java.util.Map
    public final int size() {
        return this.d;
    }

    @Override // defpackage.ajx, java.util.Map
    @NullableDecl
    public final V get(@NullableDecl Object obj) {
        Object obj2 = this.b;
        Object[] objArr = this.c;
        int i = this.d;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (!objArr[0].equals(obj)) {
                return null;
            }
            return (V) objArr[1];
        } else if (obj2 == null) {
            return null;
        } else {
            if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                int length = bArr.length - 1;
                int a2 = aju.a(obj.hashCode());
                while (true) {
                    int i2 = a2 & length;
                    int i3 = bArr[i2] & 255;
                    if (i3 == 255) {
                        return null;
                    }
                    if (objArr[i3].equals(obj)) {
                        return (V) objArr[i3 ^ 1];
                    }
                    a2 = i2 + 1;
                }
            } else if (obj2 instanceof short[]) {
                short[] sArr = (short[]) obj2;
                int length2 = sArr.length - 1;
                int a3 = aju.a(obj.hashCode());
                while (true) {
                    int i4 = a3 & length2;
                    int i5 = sArr[i4] & 65535;
                    if (i5 == 65535) {
                        return null;
                    }
                    if (objArr[i5].equals(obj)) {
                        return (V) objArr[i5 ^ 1];
                    }
                    a3 = i4 + 1;
                }
            } else {
                int[] iArr = (int[]) obj2;
                int length3 = iArr.length - 1;
                int a4 = aju.a(obj.hashCode());
                while (true) {
                    int i6 = a4 & length3;
                    int i7 = iArr[i6];
                    if (i7 == -1) {
                        return null;
                    }
                    if (objArr[i7].equals(obj)) {
                        return (V) objArr[i7 ^ 1];
                    }
                    a4 = i6 + 1;
                }
            }
        }
    }

    @Override // defpackage.ajx
    final akb<Map.Entry<K, V>> a() {
        return new akc(this, this.c, this.d);
    }

    @Override // defpackage.ajx
    final akb<K> b() {
        return new ake(this, new akh(this.c, 0, this.d));
    }

    @Override // defpackage.ajx
    final ajt<V> c() {
        return new akh(this.c, 1, this.d);
    }
}
