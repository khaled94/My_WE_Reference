package defpackage;

import java.lang.reflect.Array;

/* renamed from: cti  reason: default package */
/* loaded from: classes2.dex */
public final class cti {
    int a;
    private final ctj[] b;
    private final int c;
    private final int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cti(int i, int i2) {
        ctj[] ctjVarArr = new ctj[i];
        this.b = ctjVarArr;
        int length = ctjVarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.b[i3] = new ctj(((i2 + 4) * 17) + 1);
        }
        this.d = i2 * 17;
        this.c = i;
        this.a = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ctj a() {
        return this.b[this.a];
    }

    public final byte[][] a(int i, int i2) {
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, this.c * i2, this.d * i);
        int i3 = this.c * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = (i3 - i4) - 1;
            ctj ctjVar = this.b[i4 / i2];
            int length = ctjVar.a.length * i;
            byte[] bArr2 = new byte[length];
            for (int i6 = 0; i6 < length; i6++) {
                bArr2[i6] = ctjVar.a[i6 / i];
            }
            bArr[i5] = bArr2;
        }
        return bArr;
    }
}
