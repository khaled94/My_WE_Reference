package defpackage;

import com.google.android.gms.internal.places.zzaj;
import com.google.android.gms.internal.places.zzbk;
import defpackage.bcc;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: ben  reason: default package */
/* loaded from: classes2.dex */
public final class ben {
    private static final ben f = new ben(0, new int[0], new Object[0], false);
    int a;
    int[] b;
    Object[] c;
    int d;
    boolean e;

    public static ben a() {
        return f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ben b() {
        return new ben();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ben a(ben benVar, ben benVar2) {
        int i = benVar.a + benVar2.a;
        int[] copyOf = Arrays.copyOf(benVar.b, i);
        System.arraycopy(benVar2.b, 0, copyOf, benVar.a, benVar2.a);
        Object[] copyOf2 = Arrays.copyOf(benVar.c, i);
        System.arraycopy(benVar2.c, 0, copyOf2, benVar.a, benVar2.a);
        return new ben(i, copyOf, copyOf2, true);
    }

    private ben() {
        this(0, new int[8], new Object[8], true);
    }

    private ben(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public final void a(bfi bfiVar) throws IOException {
        if (this.a == 0) {
            return;
        }
        if (bfiVar.a() == bcc.d.j) {
            for (int i = 0; i < this.a; i++) {
                a(this.b[i], this.c[i], bfiVar);
            }
            return;
        }
        for (int i2 = this.a - 1; i2 >= 0; i2--) {
            a(this.b[i2], this.c[i2], bfiVar);
        }
    }

    private static void a(int i, Object obj, bfi bfiVar) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            bfiVar.a(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            bfiVar.d(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            bfiVar.a(i2, (bgb) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                bfiVar.d(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzbk.d());
        } else if (bfiVar.a() == bcc.d.j) {
            bfiVar.a(i2);
            ((ben) obj).a(bfiVar);
            bfiVar.b(i2);
        } else {
            bfiVar.b(i2);
            ((ben) obj).a(bfiVar);
            bfiVar.a(i2);
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
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = zzaj.e(i6, ((Long) this.c[i4]).longValue());
            } else if (i7 == 1) {
                ((Long) this.c[i4]).longValue();
                i = zzaj.g(i6);
            } else if (i7 == 2) {
                i = zzaj.c(i6, (bgb) this.c[i4]);
            } else if (i7 == 3) {
                i = (zzaj.l(i6) << 1) + ((ben) this.c[i4]).c();
            } else if (i7 == 5) {
                ((Integer) this.c[i4]).intValue();
                i = zzaj.e(i6);
            } else {
                throw new IllegalStateException(zzbk.d());
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
        if (obj == null || !(obj instanceof ben)) {
            return false;
        }
        ben benVar = (ben) obj;
        int i = this.a;
        if (i == benVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = benVar.b;
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
                Object[] objArr2 = benVar.c;
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
            bdi.a(sb, i, String.valueOf(this.b[i2] >>> 3), this.c[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.a;
        if (i2 == this.b.length) {
            int i3 = this.a + (i2 < 4 ? 8 : i2 >> 1);
            this.b = Arrays.copyOf(this.b, i3);
            this.c = Arrays.copyOf(this.c, i3);
        }
        int[] iArr = this.b;
        int i4 = this.a;
        iArr[i4] = i;
        this.c[i4] = obj;
        this.a = i4 + 1;
    }
}
