package defpackage;

import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.internal.measurement.zzfi;
import defpackage.ata;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: avr  reason: default package */
/* loaded from: classes.dex */
public final class avr {
    private static final avr f = new avr(0, new int[0], new Object[0], false);
    int a;
    int[] b;
    Object[] c;
    int d;
    boolean e;

    public static avr a() {
        return f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static avr b() {
        return new avr();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static avr a(avr avrVar, avr avrVar2) {
        int i = avrVar.a + avrVar2.a;
        int[] copyOf = Arrays.copyOf(avrVar.b, i);
        System.arraycopy(avrVar2.b, 0, copyOf, avrVar.a, avrVar2.a);
        Object[] copyOf2 = Arrays.copyOf(avrVar.c, i);
        System.arraycopy(avrVar2.c, 0, copyOf2, avrVar.a, avrVar2.a);
        return new avr(i, copyOf, copyOf2, true);
    }

    private avr() {
        this(0, new int[8], new Object[8], true);
    }

    private avr(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public final void a(awm awmVar) throws IOException {
        if (this.a == 0) {
            return;
        }
        if (awmVar.a() == ata.d.j) {
            for (int i = 0; i < this.a; i++) {
                a(this.b[i], this.c[i], awmVar);
            }
            return;
        }
        for (int i2 = this.a - 1; i2 >= 0; i2--) {
            a(this.b[i2], this.c[i2], awmVar);
        }
    }

    private static void a(int i, Object obj, awm awmVar) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            awmVar.a(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            awmVar.d(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            awmVar.a(i2, (art) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                awmVar.d(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzfi.f());
        } else if (awmVar.a() == ata.d.j) {
            awmVar.a(i2);
            ((avr) obj).a(awmVar);
            awmVar.b(i2);
        } else {
            awmVar.b(i2);
            ((avr) obj).a(awmVar);
            awmVar.a(i2);
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
                i = zzee.e(i6, ((Long) this.c[i4]).longValue());
            } else if (i7 == 1) {
                ((Long) this.c[i4]).longValue();
                i = zzee.g(i6);
            } else if (i7 == 2) {
                i = zzee.c(i6, (art) this.c[i4]);
            } else if (i7 == 3) {
                i = (zzee.l(i6) << 1) + ((avr) this.c[i4]).c();
            } else if (i7 == 5) {
                ((Integer) this.c[i4]).intValue();
                i = zzee.e(i6);
            } else {
                throw new IllegalStateException(zzfi.f());
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
        if (obj == null || !(obj instanceof avr)) {
            return false;
        }
        avr avrVar = (avr) obj;
        int i = this.a;
        if (i == avrVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = avrVar.b;
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
                Object[] objArr2 = avrVar.c;
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
            auj.a(sb, i, String.valueOf(this.b[i2] >>> 3), this.c[i2]);
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
