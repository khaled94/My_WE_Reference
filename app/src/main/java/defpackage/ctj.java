package defpackage;

/* renamed from: ctj  reason: default package */
/* loaded from: classes2.dex */
final class ctj {
    final byte[] a;
    private int b = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ctj(int i) {
        this.a = new byte[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.b;
            this.b = i3 + 1;
            this.a[i3] = z ? (byte) 1 : (byte) 0;
        }
    }
}
