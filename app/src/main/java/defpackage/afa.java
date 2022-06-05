package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: afa  reason: default package */
/* loaded from: classes.dex */
abstract class afa extends aey {
    private static final WeakReference<byte[]> a = new WeakReference<>(null);
    private WeakReference<byte[]> b = a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public afa(byte[] bArr) {
        super(bArr);
    }

    protected abstract byte[] c();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.aey
    public final byte[] d() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.b.get();
            if (bArr == null) {
                bArr = c();
                this.b = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }
}
