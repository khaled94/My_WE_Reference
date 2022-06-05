package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: crt  reason: default package */
/* loaded from: classes2.dex */
public final class crt {
    final crs a;
    final int[] b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public crt(crs crsVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.a = crsVar;
        int length = iArr.length;
        if (length > 1 && iArr[0] == 0) {
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[length - i];
            this.b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        this.b = iArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return this.b[0] == 0;
    }

    private int a(int i) {
        int[] iArr = this.b;
        return iArr[(iArr.length - 1) - i];
    }

    private crt b(crt crtVar) {
        if (!this.a.equals(crtVar.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (a()) {
            return crtVar;
        }
        if (crtVar.a()) {
            return this;
        }
        int[] iArr = this.b;
        int[] iArr2 = crtVar.b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = crs.a(iArr2[i - length], iArr[i]);
        }
        return new crt(this.a, iArr3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final crt a(int i, int i2) {
        if (i >= 0) {
            if (i2 != 0) {
                int length = this.b.length;
                int[] iArr = new int[i + length];
                for (int i3 = 0; i3 < length; i3++) {
                    iArr[i3] = this.a.b(this.b[i3], i2);
                }
                return new crt(this.a, iArr);
            }
            return this.a.k;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final crt[] a(crt crtVar) {
        crt crtVar2;
        if (!this.a.equals(crtVar.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (crtVar.a()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        crt crtVar3 = this.a.k;
        int a = crtVar.a(crtVar.b.length - 1);
        crs crsVar = this.a;
        if (a == 0) {
            throw new ArithmeticException();
        }
        int i = crsVar.i[(crsVar.l - crsVar.j[a]) - 1];
        crt crtVar4 = this;
        while (crtVar4.b.length - 1 >= crtVar.b.length - 1 && !crtVar4.a()) {
            int[] iArr = crtVar4.b;
            int length = (iArr.length - 1) - (crtVar.b.length - 1);
            int b = this.a.b(crtVar4.a(iArr.length - 1), i);
            crt a2 = crtVar.a(length, b);
            crs crsVar2 = this.a;
            if (length >= 0) {
                if (b == 0) {
                    crtVar2 = crsVar2.k;
                } else {
                    int[] iArr2 = new int[length + 1];
                    iArr2[0] = b;
                    crtVar2 = new crt(crsVar2, iArr2);
                }
                crtVar3 = crtVar3.b(crtVar2);
                crtVar4 = crtVar4.b(a2);
            } else {
                throw new IllegalArgumentException();
            }
        }
        return new crt[]{crtVar3, crtVar4};
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.b.length - 1) * 8);
        for (int length = this.b.length - 1; length >= 0; length--) {
            int a = a(length);
            if (a != 0) {
                if (a < 0) {
                    sb.append(" - ");
                    a = -a;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (length == 0 || a != 1) {
                    crs crsVar = this.a;
                    if (a == 0) {
                        throw new IllegalArgumentException();
                    }
                    int i = crsVar.j[a];
                    if (i == 0) {
                        sb.append('1');
                    } else if (i == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(i);
                    }
                }
                if (length != 0) {
                    if (length == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(length);
                    }
                }
            }
        }
        return sb.toString();
    }
}
