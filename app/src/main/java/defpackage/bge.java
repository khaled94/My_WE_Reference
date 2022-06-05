package defpackage;

/* renamed from: bge  reason: default package */
/* loaded from: classes2.dex */
final class bge extends bbi {
    private final int d;
    private final int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bge(byte[] bArr, int i, int i2) {
        super(bArr);
        a(i, i + i2, bArr.length);
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.bbi, defpackage.bgb
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
        return this.a[this.d + i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.bbi, defpackage.bgb
    public final byte b(int i) {
        return this.a[this.d + i];
    }

    @Override // defpackage.bbi, defpackage.bgb
    public final int a() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbi
    public final int c() {
        return this.d;
    }

    @Override // defpackage.bbi, defpackage.bgb
    protected final void a(byte[] bArr, int i) {
        System.arraycopy(this.a, c(), bArr, 0, i);
    }
}
