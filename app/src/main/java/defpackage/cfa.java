package defpackage;

import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.cfg;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: cfa  reason: default package */
/* loaded from: classes2.dex */
public final class cfa {
    private static final cfa f = new cfa(0, new int[0], new Object[0], false);
    int a;
    int[] b;
    Object[] c;
    int d;
    boolean e;

    public static cfa a() {
        return f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cfa b() {
        return new cfa();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cfa a(cfa cfaVar, cfa cfaVar2) {
        int i = cfaVar.a + cfaVar2.a;
        int[] copyOf = Arrays.copyOf(cfaVar.b, i);
        System.arraycopy(cfaVar2.b, 0, copyOf, cfaVar.a, cfaVar2.a);
        Object[] copyOf2 = Arrays.copyOf(cfaVar.c, i);
        System.arraycopy(cfaVar2.c, 0, copyOf2, cfaVar.a, cfaVar2.a);
        return new cfa(i, copyOf, copyOf2, true);
    }

    private cfa() {
        this(0, new int[8], new Object[8], true);
    }

    private cfa(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    private void d() {
        if (this.e) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void a(cfg cfgVar) throws IOException {
        if (this.a == 0) {
            return;
        }
        if (cfgVar.a() == cfg.a.a) {
            for (int i = 0; i < this.a; i++) {
                a(this.b[i], this.c[i], cfgVar);
            }
            return;
        }
        for (int i2 = this.a - 1; i2 >= 0; i2--) {
            a(this.b[i2], this.c[i2], cfgVar);
        }
    }

    private static void a(int i, Object obj, cfg cfgVar) throws IOException {
        int b = cff.b(i);
        int a = cff.a(i);
        if (a == 0) {
            cfgVar.a(b, ((Long) obj).longValue());
        } else if (a == 1) {
            cfgVar.d(b, ((Long) obj).longValue());
        } else if (a == 2) {
            cfgVar.a(b, (ccu) obj);
        } else if (a != 3) {
            if (a == 5) {
                cfgVar.d(b, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(InvalidProtocolBufferException.f());
        } else if (cfgVar.a() == cfg.a.a) {
            cfgVar.a(b);
            ((cfa) obj).a(cfgVar);
            cfgVar.b(b);
        } else {
            cfgVar.b(b);
            ((cfa) obj).a(cfgVar);
            cfgVar.a(b);
        }
    }

    public final int c() {
        int i;
        int i2 = this.d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.a; i4++) {
            int i5 = this.b[i4];
            int b = cff.b(i5);
            int a = cff.a(i5);
            if (a == 0) {
                i = CodedOutputStream.e(b, ((Long) this.c[i4]).longValue());
            } else if (a == 1) {
                ((Long) this.c[i4]).longValue();
                i = CodedOutputStream.g(b);
            } else if (a == 2) {
                i = CodedOutputStream.c(b, (ccu) this.c[i4]);
            } else if (a == 3) {
                i = (CodedOutputStream.l(b) * 2) + ((cfa) this.c[i4]).c();
            } else if (a == 5) {
                ((Integer) this.c[i4]).intValue();
                i = CodedOutputStream.e(b);
            } else {
                throw new IllegalStateException(InvalidProtocolBufferException.f());
            }
            i3 += i;
        }
        this.d = i3;
        return i3;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof cfa)) {
            return false;
        }
        cfa cfaVar = (cfa) obj;
        int i = this.a;
        if (i == cfaVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = cfaVar.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.c;
                Object[] objArr2 = cfaVar.c;
                int i3 = this.a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            cee.a(sb, i, String.valueOf(cff.b(this.b[i2])), this.c[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, Object obj) {
        d();
        e();
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    private void e() {
        int i = this.a;
        if (i == this.b.length) {
            int i2 = this.a + (i < 4 ? 8 : i >> 1);
            this.b = Arrays.copyOf(this.b, i2);
            this.c = Arrays.copyOf(this.c, i2);
        }
    }
}
