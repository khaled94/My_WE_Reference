package defpackage;

import java.util.Arrays;

/* renamed from: csa  reason: default package */
/* loaded from: classes2.dex */
public final class csa {
    public final int a;
    public final byte[] b;
    private final CharSequence c;
    private final int d;

    public csa(CharSequence charSequence, int i, int i2) {
        this.c = charSequence;
        this.a = i;
        this.d = i2;
        byte[] bArr = new byte[i * i2];
        this.b = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    private void a(int i, int i2, boolean z) {
        this.b[(i2 * this.a) + i] = z ? (byte) 1 : (byte) 0;
    }

    private boolean a(int i, int i2) {
        return this.b[(i2 * this.a) + i] >= 0;
    }

    public final void a() {
        int i;
        int i2;
        int i3 = 4;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = this.d;
            if (i3 == i6 && i4 == 0) {
                a(i6 - 1, 0, i5, 1);
                a(this.d - 1, 1, i5, 2);
                a(this.d - 1, 2, i5, 3);
                a(0, this.a - 2, i5, 4);
                a(0, this.a - 1, i5, 5);
                a(1, this.a - 1, i5, 6);
                a(2, this.a - 1, i5, 7);
                a(3, this.a - 1, i5, 8);
                i5++;
            }
            int i7 = this.d;
            if (i3 == i7 - 2 && i4 == 0 && this.a % 4 != 0) {
                a(i7 - 3, 0, i5, 1);
                a(this.d - 2, 0, i5, 2);
                a(this.d - 1, 0, i5, 3);
                a(0, this.a - 4, i5, 4);
                a(0, this.a - 3, i5, 5);
                a(0, this.a - 2, i5, 6);
                a(0, this.a - 1, i5, 7);
                a(1, this.a - 1, i5, 8);
                i5++;
            }
            int i8 = this.d;
            if (i3 == i8 - 2 && i4 == 0 && this.a % 8 == 4) {
                a(i8 - 3, 0, i5, 1);
                a(this.d - 2, 0, i5, 2);
                a(this.d - 1, 0, i5, 3);
                a(0, this.a - 2, i5, 4);
                a(0, this.a - 1, i5, 5);
                a(1, this.a - 1, i5, 6);
                a(2, this.a - 1, i5, 7);
                a(3, this.a - 1, i5, 8);
                i5++;
            }
            int i9 = this.d;
            if (i3 == i9 + 4 && i4 == 2 && this.a % 8 == 0) {
                a(i9 - 1, 0, i5, 1);
                a(this.d - 1, this.a - 1, i5, 2);
                a(0, this.a - 3, i5, 3);
                a(0, this.a - 2, i5, 4);
                a(0, this.a - 1, i5, 5);
                a(1, this.a - 3, i5, 6);
                a(1, this.a - 2, i5, 7);
                a(1, this.a - 1, i5, 8);
                i5++;
            }
            do {
                if (i3 < this.d && i4 >= 0 && !a(i4, i3)) {
                    a(i3, i4, i5);
                    i5++;
                }
                i3 -= 2;
                i4 += 2;
                if (i3 < 0) {
                    break;
                }
            } while (i4 < this.a);
            int i10 = i3 + 1;
            int i11 = i4 + 3;
            do {
                if (i10 >= 0 && i11 < this.a && !a(i11, i10)) {
                    a(i10, i11, i5);
                    i5++;
                }
                i10 += 2;
                i11 -= 2;
                if (i10 >= this.d) {
                    break;
                }
            } while (i11 >= 0);
            i3 = i10 + 3;
            i4 = i11 + 1;
            i = this.d;
            if (i3 >= i && i4 >= (i2 = this.a)) {
                break;
            }
        }
        if (!a(i2 - 1, i - 1)) {
            a(this.a - 1, this.d - 1, true);
            a(this.a - 2, this.d - 2, true);
        }
    }

    private void a(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.d;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        if (i2 < 0) {
            int i6 = this.a;
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        boolean z = true;
        if ((this.c.charAt(i3) & (1 << (8 - i4))) == 0) {
            z = false;
        }
        a(i2, i, z);
    }

    private void a(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        a(i4, i5, i3, 1);
        int i6 = i2 - 1;
        a(i4, i6, i3, 2);
        int i7 = i - 1;
        a(i7, i5, i3, 3);
        a(i7, i6, i3, 4);
        a(i7, i2, i3, 5);
        a(i, i5, i3, 6);
        a(i, i6, i3, 7);
        a(i, i2, i3, 8);
    }
}
