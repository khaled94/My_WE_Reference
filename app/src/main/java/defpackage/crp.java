package defpackage;

import java.util.Arrays;

/* renamed from: crp  reason: default package */
/* loaded from: classes2.dex */
public final class crp implements Cloneable {
    public int[] a;
    public int b;

    public crp() {
        this.b = 0;
        this.a = new int[1];
    }

    private crp(int[] iArr, int i) {
        this.a = iArr;
        this.b = i;
    }

    public final int a() {
        return (this.b + 7) / 8;
    }

    private void b(int i) {
        int[] iArr = this.a;
        if (i > (iArr.length << 5)) {
            int[] iArr2 = new int[(i + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.a = iArr2;
        }
    }

    public final boolean a(int i) {
        return ((1 << (i & 31)) & this.a[i / 32]) != 0;
    }

    public final void a(boolean z) {
        b(this.b + 1);
        if (z) {
            int[] iArr = this.a;
            int i = this.b;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.b++;
    }

    public final void a(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        b(this.b + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            a(z);
            i2--;
        }
    }

    public final void a(crp crpVar) {
        int i = crpVar.b;
        b(this.b + i);
        for (int i2 = 0; i2 < i; i2++) {
            a(crpVar.a(i2));
        }
    }

    public final void a(int i, byte[] bArr, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = 0;
            for (int i5 = 0; i5 < 8; i5++) {
                if (a(i)) {
                    i4 |= 1 << (7 - i5);
                }
                i++;
            }
            bArr[i3 + 0] = (byte) i4;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof crp)) {
            return false;
        }
        crp crpVar = (crp) obj;
        return this.b == crpVar.b && Arrays.equals(this.a, crpVar.a);
    }

    public final int hashCode() {
        return (this.b * 31) + Arrays.hashCode(this.a);
    }

    public final String toString() {
        int i = this.b;
        StringBuilder sb = new StringBuilder(i + (i / 8) + 1);
        for (int i2 = 0; i2 < this.b; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(a(i2) ? 'X' : '.');
        }
        return sb.toString();
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return new crp((int[]) this.a.clone(), this.b);
    }
}
