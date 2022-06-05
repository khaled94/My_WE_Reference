package defpackage;

/* renamed from: crs  reason: default package */
/* loaded from: classes2.dex */
public final class crs {
    public static final crs f;
    public static final crs g;
    final int[] i;
    final int[] j;
    final crt k;
    final int l;
    final int m;
    private final crt n;
    private final int o;
    public static final crs a = new crs(4201, 4096, 1);
    public static final crs b = new crs(1033, 1024, 1);
    public static final crs c = new crs(67, 64, 1);
    public static final crs d = new crs(19, 16, 1);
    public static final crs e = new crs(285, 256, 0);
    public static final crs h = c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, int i2) {
        return i ^ i2;
    }

    static {
        crs crsVar = new crs(301, 256, 1);
        f = crsVar;
        g = crsVar;
    }

    private crs(int i, int i2, int i3) {
        this.o = i;
        this.l = i2;
        this.m = i3;
        this.i = new int[i2];
        this.j = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.i[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.j[this.i[i6]] = i6;
        }
        this.k = new crt(this, new int[]{0});
        this.n = new crt(this, new int[]{1});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.i;
        int[] iArr2 = this.j;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.l - 1)];
    }

    public final String toString() {
        return "GF(0x" + Integer.toHexString(this.o) + ',' + this.l + ')';
    }
}
