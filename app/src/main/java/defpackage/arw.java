package defpackage;

/* renamed from: arw  reason: default package */
/* loaded from: classes.dex */
final class arw extends asd {
    private final int d;
    private final int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public arw(byte[] bArr, int i, int i2) {
        super(bArr);
        a(i, i + i2, bArr.length);
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.asd, defpackage.art
    public final byte a(int i) {
        int a = a();
        if (((a - (i + 1)) | i) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(22);
                sb.append("Index < 0: ");
                sb.append(i);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Index > length: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(a);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        return this.c[this.d + i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.asd, defpackage.art
    public final byte b(int i) {
        return this.c[this.d + i];
    }

    @Override // defpackage.asd, defpackage.art
    public final int a() {
        return this.e;
    }

    @Override // defpackage.asd
    protected final int d() {
        return this.d;
    }
}
