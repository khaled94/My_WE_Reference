package defpackage;

/* renamed from: ecx  reason: default package */
/* loaded from: classes2.dex */
public final class ecx {
    int a;
    final int[] b = new int[10];

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ecx a(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i < iArr.length) {
                this.a = (1 << i) | this.a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(int i) {
        return ((1 << i) & this.a) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        if ((this.a & 2) != 0) {
            return this.b[1];
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        if ((this.a & 128) != 0) {
            return this.b[7];
        }
        return 65535;
    }
}
