package defpackage;

/* renamed from: awr  reason: default package */
/* loaded from: classes.dex */
public final class awr implements Cloneable {
    static final awq a = new awq();
    int[] b;
    awq[] c;
    int d;
    private boolean e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public awr() {
        this(10);
    }

    private awr(int i) {
        this.e = false;
        int a2 = a(i);
        this.b = new int[a2];
        this.c = new awq[a2];
        this.d = 0;
    }

    public final boolean a() {
        return this.d == 0;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof awr)) {
            return false;
        }
        awr awrVar = (awr) obj;
        int i = this.d;
        if (i != awrVar.d) {
            return false;
        }
        int[] iArr = this.b;
        int[] iArr2 = awrVar.b;
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
            awq[] awqVarArr = this.c;
            awq[] awqVarArr2 = awrVar.c;
            int i3 = this.d;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                } else if (!awqVarArr[i4].equals(awqVarArr2[i4])) {
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
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (((i * 31) + this.b[i2]) * 31) + this.c[i2].hashCode();
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i) {
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        return i2 / 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(int i) {
        int i2 = this.d - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.b[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = this.d;
        awr awrVar = new awr(i);
        System.arraycopy(this.b, 0, awrVar.b, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            awq[] awqVarArr = this.c;
            if (awqVarArr[i2] != null) {
                awrVar.c[i2] = (awq) awqVarArr[i2].clone();
            }
        }
        awrVar.d = i;
        return awrVar;
    }
}
