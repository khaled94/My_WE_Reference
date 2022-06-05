package defpackage;

import java.util.Arrays;

/* renamed from: aez  reason: default package */
/* loaded from: classes.dex */
final class aez extends aey {
    private final byte[] a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aez(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.a = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.aey
    public final byte[] d() {
        return this.a;
    }
}
